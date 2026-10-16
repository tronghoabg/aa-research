package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.z1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1855z1 extends AbstractC1818n {

    /* renamed from: a, reason: collision with root package name */
    public final A1 f27823a;

    /* renamed from: b, reason: collision with root package name */
    public ByteString.ByteIterator f27824b = a();

    public C1855z1(C1 c12) {
        this.f27823a = new A1(c12);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        A1 a12 = this.f27823a;
        if (a12.hasNext()) {
            return a12.a().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27824b != null;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.f27824b;
        if (byteIterator == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = byteIterator.nextByte();
        if (!this.f27824b.hasNext()) {
            this.f27824b = a();
        }
        return bNextByte;
    }
}
