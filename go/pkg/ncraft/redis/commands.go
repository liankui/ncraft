package redis

import (
	"context"
	"errors"
	"time"

	"github.com/ncraft-io/ncraft/go/pkg/ncraft/logs"
)

func Get(redis Redis, key string) (string, error) {
	if redis != nil {
		return String(redis.Do(context.Background(), "GET", key))
	}
	return "", errors.New("the redis handler is nil")
}

// type SetOptions struct {
// }

func Set(redis Redis, key string, value string) (string, error) {
	if redis != nil {
		redis.Do(context.Background(), "SET", key, value)
		return "", nil
	}
	return "", errors.New("the redis handler is nil")
}

func MGet(redis Redis, keys ...string) (interface{}, error) {
	if redis != nil {
		var args []interface{}
		for _, key := range keys {
			args = append(args, key)
		}
		return redis.Do(context.Background(), "MGET", args...)
	}
	return nil, errors.New("the redis handler is nil")
}

func Eval(redis Redis, script string, keys []string, args ...any) (any, error) {
	if redis != nil {
		return redis.Eval(context.Background(), script, keys, args...)
	}
	return nil, errors.New("the redis handler is nil")
}

// AcquireLock 使用 SET 命令的 NX 选项和 PX 选项实现原子加锁
func AcquireLock(redis Redis, lockKey, requestId string, ttl time.Duration) bool {
	luaScript := `
		if redis.call("SET", KEYS[1], ARGV[1], "NX", "PX", ARGV[2]) then
			return 1
		else
			return 0
		end`

	res, err := Int(Eval(redis, luaScript, []string{lockKey}, requestId, ttl.Milliseconds()))
	if err != nil {
		logs.Warnw("failed to acquire lock", "lockKey", lockKey, "requestId", requestId, "error", err)
		return false
	}

	return res == 1
}

// ReleaseLock 释放锁（确保只释放自己加的锁）
func ReleaseLock(redis Redis, lockKey, requestId string) bool {
	luaScript := `
		if redis.call("GET", KEYS[1]) == ARGV[1] then
			return redis.call("DEL", KEYS[1])
		else
			return 0
		end`

	res, err := Int(Eval(redis, luaScript, []string{lockKey}, requestId))
	if err != nil {
		logs.Warnw("failed to release lock", "lockKey", lockKey, "requestId", requestId, "error", err)
		return false
	}

	return res == 1
}
