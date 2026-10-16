package com.google.protobuf;

/* renamed from: com.google.protobuf.y1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1852y1 implements InterfaceC1799g1 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f27806a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27807b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f27808c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27809d;

    public C1852y1(MessageLite messageLite, String str, Object[] objArr) {
        this.f27806a = messageLite;
        this.f27807b = str;
        this.f27808c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f27809d = cCharAt;
            return;
        }
        int i5 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f27809d = i5 | (cCharAt2 << i10);
                return;
            } else {
                i5 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC1799g1
    public final boolean a() {
        return (this.f27809d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC1799g1
    public final MessageLite b() {
        return this.f27806a;
    }

    @Override // com.google.protobuf.InterfaceC1799g1
    public final ProtoSyntax getSyntax() {
        int i5 = this.f27809d;
        return (i5 & 1) != 0 ? ProtoSyntax.PROTO2 : (i5 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
