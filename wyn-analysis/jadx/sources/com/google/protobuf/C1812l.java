package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812l extends AbstractC1818n {

    /* renamed from: a, reason: collision with root package name */
    public int f27715a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f27716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteString f27717c;

    public C1812l(ByteString byteString) {
        this.f27717c = byteString;
        this.f27716b = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27715a < this.f27716b;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i5 = this.f27715a;
        if (i5 >= this.f27716b) {
            throw new NoSuchElementException();
        }
        this.f27715a = i5 + 1;
        return this.f27717c.internalByteAt(i5);
    }
}
