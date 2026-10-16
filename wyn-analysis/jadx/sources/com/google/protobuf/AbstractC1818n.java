package com.google.protobuf;

import com.google.protobuf.ByteString;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1818n implements ByteString.ByteIterator {
    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
