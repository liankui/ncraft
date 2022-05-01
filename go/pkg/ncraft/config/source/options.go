package source

import (
    "context"
    "github.com/ncraft-io/ncraft/go/pkg/ncraft/config/encoder"
    "github.com/ncraft-io/ncraft/go/pkg/ncraft/config/encoder/json"
)

type Options struct {
    // Encoder
    Encoder encoder.Encoder

    // for alternative data
    Context context.Context
}

type Option func(o *Options)

func NewOptions(opts ...Option) Options {
    options := Options{
        Encoder: json.NewEncoder(),
        Context: context.Background(),
    }

    for _, o := range opts {
        o(&options)
    }

    return options
}

// WithEncoder sets the source encoder
func WithEncoder(e encoder.Encoder) Option {
    return func(o *Options) {
        o.Encoder = e
    }
}