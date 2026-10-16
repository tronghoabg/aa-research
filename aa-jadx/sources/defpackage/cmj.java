package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cmj implements defpackage.cml {
    public final defpackage.cmh a = new defpackage.cmh(defpackage.cmk.a, defpackage.dlz.a, defpackage.cmm.a);
    public final defpackage.cmi b = new defpackage.cmi(this);
    private defpackage.cjs c;
    private defpackage.cjs d;

    private final defpackage.cjs D(defpackage.dai daiVar) {
        if (defpackage.afga.f(daiVar, defpackage.cmn.a)) {
            defpackage.cjs cjsVar = this.c;
            if (cjsVar != null) {
                return cjsVar;
            }
            defpackage.cjs cjsVar2 = new defpackage.cjs();
            cjsVar2.r(0);
            this.c = cjsVar2;
            return cjsVar2;
        }
        if (!(daiVar instanceof defpackage.cmo)) {
            throw new defpackage.afas();
        }
        defpackage.cjs cjsVarQ = q();
        float fC = cjsVarQ.c();
        defpackage.cmo cmoVar = (defpackage.cmo) daiVar;
        float f = cmoVar.a;
        if (fC != f) {
            cjsVarQ.q(f);
        }
        int iE = cjsVarQ.e();
        int i = cmoVar.c;
        if (iE != i) {
            cjsVarQ.n(i);
        }
        float fB = cjsVarQ.b();
        float f2 = cmoVar.b;
        if (fB != f2) {
            cjsVarQ.p(f2);
        }
        int iF = cjsVarQ.f();
        int i2 = cmoVar.d;
        if (iF != i2) {
            cjsVarQ.o(i2);
        }
        return cjsVarQ;
    }

    private final defpackage.cjs E(long j, defpackage.dai daiVar, float f, defpackage.cke ckeVar, int i) {
        defpackage.cjs cjsVarD = D(daiVar);
        if (f != 1.0f) {
            float fA = defpackage.ckd.a(j) * f;
            float fD = defpackage.ckd.d(j);
            float fC = defpackage.ckd.c(j);
            float fB = defpackage.ckd.b(j);
            float[] fArr = defpackage.clr.a;
            j = defpackage.cjv.k(fD, fC, fB, fA, defpackage.clr.y[(int) (j & 63)]);
        }
        if (cjsVarD.g() != j) {
            cjsVarD.j(j);
        }
        if (cjsVarD.c != null) {
            cjsVarD.m(null);
        }
        if (!defpackage.afga.f(cjsVarD.d, ckeVar)) {
            cjsVarD.k(ckeVar);
        }
        if (cjsVarD.b != i) {
            cjsVarD.i(i);
        }
        if (cjsVarD.d() != 1) {
            cjsVarD.l(1);
        }
        return cjsVarD;
    }

    @Override // defpackage.cml
    public final void A(defpackage.cka ckaVar, long j, long j2, long j3, float f, defpackage.dai daiVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.m(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), u(ckaVar, daiVar, f, null, 3, 1));
    }

    @Override // defpackage.cml
    public final void B(long j, long j2, long j3, long j4, defpackage.dai daiVar, float f) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.m(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j3 >> 32)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)), E(j, daiVar, f, null, 3));
    }

    @Override // defpackage.cml
    public final void C(defpackage.cjr cjrVar, long j, long j2, long j3, float f, defpackage.dai daiVar, defpackage.cke ckeVar, int i, int i2) {
        this.a.c.t(cjrVar, j, j2, j3, u(null, daiVar, f, ckeVar, i, i2));
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a.a.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.a.b();
    }

    @Override // defpackage.dlu
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f) {
        return (f / a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f) {
        return f * a();
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f) {
        return defpackage.dln.q(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final /* synthetic */ long dQ(float f) {
        return defpackage.dln.o(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return defpackage.dln.o(this, (f / a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cml
    public final /* synthetic */ long n() {
        return defpackage.bzo.y(this.b.a());
    }

    @Override // defpackage.cml
    public final /* synthetic */ long o() {
        return this.b.a();
    }

    @Override // defpackage.cml
    public final defpackage.dlz p() {
        return this.a.b;
    }

    public final defpackage.cjs q() {
        defpackage.cjs cjsVar = this.d;
        if (cjsVar != null) {
            return cjsVar;
        }
        defpackage.cjs cjsVar2 = new defpackage.cjs();
        cjsVar2.r(1);
        this.d = cjsVar2;
        return cjsVar2;
    }

    @Override // defpackage.cml
    public final defpackage.cmi r() {
        return this.b;
    }

    @Override // defpackage.cml
    public final void s(long j, long j2, long j3, float f, int i) {
        defpackage.ckc ckcVar = this.a.c;
        defpackage.cjs cjsVarQ = q();
        if (cjsVarQ.g() != j) {
            cjsVarQ.j(j);
        }
        if (cjsVarQ.c != null) {
            cjsVarQ.m(null);
        }
        if (!defpackage.afga.f(cjsVarQ.d, null)) {
            cjsVarQ.k(null);
        }
        if (cjsVarQ.b != 3) {
            cjsVarQ.i(3);
        }
        if (cjsVarQ.c() != f) {
            cjsVarQ.q(f);
        }
        if (cjsVarQ.b() != 4.0f) {
            cjsVarQ.p(4.0f);
        }
        if (cjsVarQ.e() != i) {
            cjsVarQ.n(i);
        }
        if (cjsVarQ.f() != 0) {
            cjsVarQ.o(0);
        }
        if (cjsVarQ.d() != 1) {
            cjsVarQ.l(1);
        }
        ckcVar.k(j2, j3, cjsVarQ);
    }

    @Override // defpackage.cml
    public final void t(long j, long j2, long j3, float f, defpackage.dai daiVar, defpackage.cke ckeVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.l(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3) + java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), E(j, daiVar, f, ckeVar, i));
    }

    public final defpackage.cjs u(defpackage.cka ckaVar, defpackage.dai daiVar, float f, defpackage.cke ckeVar, int i, int i2) {
        defpackage.cjs cjsVarD = D(daiVar);
        if (ckaVar != null) {
            ckaVar.a(this.b.a(), cjsVarD, f);
        } else {
            if (cjsVarD.c != null) {
                cjsVarD.m(null);
            }
            if (cjsVarD.g() != -72057594037927936L) {
                cjsVarD.j(-72057594037927936L);
            }
            if (cjsVarD.a() != f) {
                cjsVarD.h(f);
            }
        }
        if (!defpackage.afga.f(cjsVarD.d, ckeVar)) {
            cjsVarD.k(ckeVar);
        }
        if (cjsVarD.b != i) {
            cjsVarD.i(i);
        }
        if (cjsVarD.d() != i2) {
            cjsVarD.l(i2);
        }
        return cjsVarD;
    }

    @Override // defpackage.cml
    public final void v(long j, float f, long j2, float f2, defpackage.dai daiVar, int i) {
        this.a.c.j(j2, f, E(j, daiVar, f2, null, i));
    }

    @Override // defpackage.cml
    public final void w(defpackage.cka ckaVar, long j, long j2, float f, defpackage.dai daiVar, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j >> 32);
        this.a.c.l(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3) + java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), u(ckaVar, daiVar, f, null, i, 1));
    }

    @Override // defpackage.cml
    public final void x(defpackage.cju cjuVar, defpackage.cka ckaVar, float f, defpackage.dai daiVar, int i) {
        this.a.c.p(cjuVar, u(ckaVar, daiVar, f, null, i, 1));
    }

    @Override // defpackage.cml
    public final void y(defpackage.cju cjuVar, long j, float f, defpackage.dai daiVar, int i) {
        this.a.c.p(cjuVar, E(j, daiVar, f, null, i));
    }

    @Override // defpackage.cml
    public final void z(long j, float f, float f2, long j2, long j3, defpackage.dai daiVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.o(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, E(j, daiVar, 1.0f, null, 3));
    }
}
