package com.google.protobuf;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1827q {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f27735a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27736b;

    public C1827q(int i5) {
        byte[] bArr = new byte[i5];
        this.f27736b = bArr;
        this.f27735a = CodedOutputStream.newInstance(bArr);
    }
}
