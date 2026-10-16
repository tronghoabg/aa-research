package od;

import Va.X7;
import md.AbstractC3541i;
import md.C3535c;

/* renamed from: od.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3699k0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3739y f42000a;

    /* renamed from: b, reason: collision with root package name */
    public final X7 f42001b;

    public C3699k0(InterfaceC3739y interfaceC3739y, X7 x72) {
        this.f42000a = interfaceC3739y;
        this.f42001b = x72;
    }

    @Override // od.InterfaceC3727u
    public final r c(F6.r rVar, md.b0 b0Var, C3535c c3535c, AbstractC3541i[] abstractC3541iArr) {
        return new C3696j0(this, this.f42000a.c(rVar, b0Var, c3535c, abstractC3541iArr));
    }

    @Override // od.U
    public final InterfaceC3739y g() {
        return this.f42000a;
    }
}
