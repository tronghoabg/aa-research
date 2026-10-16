package com.google.protobuf;

/* renamed from: com.google.protobuf.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1781a1 implements InterfaceC1802h1 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1802h1[] f27647a;

    @Override // com.google.protobuf.InterfaceC1802h1
    public final InterfaceC1799g1 a(Class cls) {
        for (InterfaceC1802h1 interfaceC1802h1 : this.f27647a) {
            if (interfaceC1802h1.b(cls)) {
                return interfaceC1802h1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC1802h1
    public final boolean b(Class cls) {
        for (InterfaceC1802h1 interfaceC1802h1 : this.f27647a) {
            if (interfaceC1802h1.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
