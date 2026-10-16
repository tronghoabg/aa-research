package od;

import md.AbstractC3541i;

/* loaded from: classes5.dex */
public final class S extends C3673b1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41797b;

    /* renamed from: c, reason: collision with root package name */
    public final md.k0 f41798c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC3721s f41799d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3541i[] f41800e;

    public S(md.k0 k0Var, EnumC3721s enumC3721s, AbstractC3541i[] abstractC3541iArr) {
        Fe.e.p("error must not be OK", !k0Var.f());
        this.f41798c = k0Var;
        this.f41799d = enumC3721s;
        this.f41800e = abstractC3541iArr;
    }

    @Override // od.C3673b1, od.r
    public final void i(N.J0 j02) {
        j02.c(this.f41798c, "error");
        j02.c(this.f41799d, "progress");
    }

    @Override // od.C3673b1, od.r
    public final void k(InterfaceC3724t interfaceC3724t) {
        Fe.e.w("already started", !this.f41797b);
        this.f41797b = true;
        AbstractC3541i[] abstractC3541iArr = this.f41800e;
        int length = abstractC3541iArr.length;
        int i5 = 0;
        while (true) {
            md.k0 k0Var = this.f41798c;
            if (i5 >= length) {
                interfaceC3724t.m(k0Var, this.f41799d, new md.b0());
                return;
            } else {
                abstractC3541iArr[i5].m(k0Var);
                i5++;
            }
        }
    }

    public S(md.k0 k0Var, AbstractC3541i[] abstractC3541iArr) {
        this(k0Var, EnumC3721s.f42082a, abstractC3541iArr);
    }
}
