package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Q1 implements InterfaceC1799g1 {

    /* renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f27615a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27616b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f27617c;

    /* renamed from: d, reason: collision with root package name */
    public final C1836t0[] f27618d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f27619e;

    public Q1(ProtoSyntax protoSyntax, boolean z2, int[] iArr, C1836t0[] c1836t0Arr, Object obj) {
        this.f27615a = protoSyntax;
        this.f27616b = z2;
        this.f27617c = iArr;
        this.f27618d = c1836t0Arr;
        this.f27619e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.InterfaceC1799g1
    public final boolean a() {
        return this.f27616b;
    }

    @Override // com.google.protobuf.InterfaceC1799g1
    public final MessageLite b() {
        return this.f27619e;
    }

    @Override // com.google.protobuf.InterfaceC1799g1
    public final ProtoSyntax getSyntax() {
        return this.f27615a;
    }
}
