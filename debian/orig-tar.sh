#!/bin/sh -x
# Called from uscan with parameters:
# --upstream-version <release> <path-to-upstream.orig.tar.gz>

set -e

PACKAGE=jython
UPSTREAM_VERSION="$2"
UPSTREAM_VERSION_MANGLED="$UPSTREAM_VERSION+repack1"
UPSTREAM_TARBALL=../${PACKAGE}_$UPSTREAM_VERSION.orig.tar.gz

SOURCE_DIR=$(echo "$PACKAGE-$UPSTREAM_VERSION" | sed 's/~//')
DEBIAN_SOURCE_DIR="$PACKAGE-$UPSTREAM_VERSION.orig"
ORIG_TARBALL="../${PACKAGE}_$UPSTREAM_VERSION_MANGLED.orig.tar.gz"

# Unpack upstream tarball, excluding paths specified in debian/orig-tar.exclude
tar xf $UPSTREAM_TARBALL -X debian/orig-tar.exclude

# Repack
tar czf $ORIG_TARBALL $SOURCE_DIR

# Cleanup
rm -fr "$SOURCE_DIR"

echo "$PACKAGE: downloaded upstream release $2 and renamed archive to $(basename "$ORIG_TARBALL")" >&2
