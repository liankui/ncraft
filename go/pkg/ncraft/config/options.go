package config

import (
    "github.com/ncraft-io/ncraft/go/pkg/ncraft/config/loader"
    "github.com/ncraft-io/ncraft/go/pkg/ncraft/config/reader"
    "github.com/ncraft-io/ncraft/go/pkg/ncraft/config/source"
)

// WithLoader sets the loader for manager config.
func WithLoader(l loader.Loader) Option {
    return func(o *Options) {
        o.Loader = l
    }
}

// WithSource appends a source to list of sources.
func WithSource(s source.Source) Option {
    return func(o *Options) {
        o.Source = append(o.Source, s)
    }
}

// WithReader sets the config reader.
func WithReader(r reader.Reader) Option {
    return func(o *Options) {
        o.Reader = r
    }
}

func WithWatcherDisabled() Option {
    return func(o *Options) {
        o.WithWatcherDisabled = true
    }
}
