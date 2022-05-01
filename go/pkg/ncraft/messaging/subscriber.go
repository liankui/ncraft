package messaging

import (
    "context"
)

type Handler func(ctx context.Context, m *SubMessage) error

type Subscriber interface {
    Subscribe(subscription *Subscription, handler Handler)
}
