#!/bin/sh
LD_PRELOAD="$(dirname "$0")/libfridagadget.so" "$@"
