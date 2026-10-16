package od;

import A7.C0237b0;
import java.util.concurrent.TimeUnit;
import md.AbstractC3538f;
import md.C3535c;
import md.EnumC3545m;

/* loaded from: classes5.dex */
public abstract class V extends md.S {

    /* renamed from: a, reason: collision with root package name */
    public final M0 f41815a;

    public V(M0 m02) {
        this.f41815a = m02;
    }

    @Override // md.AbstractC3536d
    public final String g() {
        return this.f41815a.f41699t.g();
    }

    @Override // md.AbstractC3536d
    public final AbstractC3538f h(F6.r rVar, C3535c c3535c) {
        return this.f41815a.f41699t.h(rVar, c3535c);
    }

    @Override // md.S
    public final boolean i(long j8) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return this.f41815a.i(j8);
    }

    @Override // md.S
    public final void j() {
        this.f41815a.j();
    }

    @Override // md.S
    public final EnumC3545m k() {
        return this.f41815a.k();
    }

    @Override // md.S
    public final void l(EnumC3545m enumC3545m, v9.n nVar) {
        this.f41815a.l(enumC3545m, nVar);
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41815a, "delegate");
        return c0237b0S.toString();
    }
}
