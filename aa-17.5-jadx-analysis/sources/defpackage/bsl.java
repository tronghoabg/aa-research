package defpackage;

import defpackage.bsm;

/* loaded from: classes2.dex */
abstract class bsl<N extends bsm> extends cxt<N> {
    @Override // defpackage.cxt
    public /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsl)) {
            return false;
        }
        bsl bslVar = (bsl) obj;
        return a.j(i(), bslVar.i()) && a.j(j(), bslVar.j()) && affa.f(k(), bslVar.k()) && affa.f(l(), bslVar.l()) && dlj.c(f(), bslVar.f()) && dlj.c(h(), bslVar.h()) && dlj.c(g(), bslVar.g());
    }

    public float f() {
        throw null;
    }

    public float g() {
        throw null;
    }

    public float h() {
        throw null;
    }

    public int hashCode() {
        int iG = a.g(i());
        return (((((((((((iG * 31) + a.g(j())) * 31) + k().hashCode()) * 31) + l().hashCode()) * 31) + Float.floatToIntBits(f())) * 31) + Float.floatToIntBits(h())) * 31) + Float.floatToIntBits(g());
    }

    public long i() {
        throw null;
    }

    public long j() {
        throw null;
    }

    public cmg k() {
        throw null;
    }

    public cmg l() {
        throw null;
    }

    public final void m(bsm bsmVar) {
        long jI = i();
        if (!a.j(bsmVar.a, jI)) {
            bsmVar.a = jI;
            bsmVar.b();
        }
        long j = j();
        if (!a.j(bsmVar.b, j)) {
            bsmVar.b = j;
            bsmVar.b();
        }
        cmg cmgVarK = k();
        if (!affa.f(bsmVar.c, cmgVarK)) {
            bsmVar.c = cmgVarK;
            bsmVar.d();
        }
        cmg cmgVarL = l();
        if (!affa.f(bsmVar.d, cmgVarL)) {
            bsmVar.d = cmgVarL;
            bsmVar.d();
        }
        float f = f();
        if (!dlj.c(bsmVar.e, f)) {
            bsmVar.e = f;
            bsmVar.d();
        }
        float fH = h();
        if (!dlj.c(bsmVar.f, fH)) {
            bsmVar.f = fH;
            bsmVar.g();
            bsmVar.d();
        }
        float fG = g();
        if (dlj.c(bsmVar.g, fG)) {
            return;
        }
        bsmVar.g = fG;
        bsmVar.g();
        bsmVar.d();
    }
}
