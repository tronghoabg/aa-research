package com.google.protobuf;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1821o extends C1832s {

    /* renamed from: b, reason: collision with root package name */
    public final int f27727b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27728c;

    public C1821o(byte[] bArr, int i5, int i10) {
        super(bArr);
        ByteString.checkRange(i5, i5 + i10, bArr.length);
        this.f27727b = i5;
        this.f27728c = i10;
    }

    @Override // com.google.protobuf.C1832s
    public final int b() {
        return this.f27727b;
    }

    @Override // com.google.protobuf.C1832s, com.google.protobuf.ByteString
    public final byte byteAt(int i5) {
        ByteString.checkIndex(i5, this.f27728c);
        return this.f27739a[this.f27727b + i5];
    }

    @Override // com.google.protobuf.C1832s, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.f27739a, this.f27727b + i5, bArr, i10, i11);
    }

    @Override // com.google.protobuf.C1832s, com.google.protobuf.r, com.google.protobuf.ByteString
    public final byte internalByteAt(int i5) {
        return this.f27739a[this.f27727b + i5];
    }

    @Override // com.google.protobuf.C1832s, com.google.protobuf.ByteString
    public final int size() {
        return this.f27728c;
    }
}
