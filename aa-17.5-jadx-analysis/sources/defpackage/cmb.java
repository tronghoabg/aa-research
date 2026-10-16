package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmb implements cmd {
    public final clz a = new clz(cmc.a, dlr.a, cme.a);
    public final cma b = new cma(this);
    private cjk c;
    private cjk d;

    private final cjk D(czz czzVar) {
        if (affa.f(czzVar, cmf.a)) {
            cjk cjkVar = this.c;
            if (cjkVar != null) {
                return cjkVar;
            }
            cjk cjkVar2 = new cjk();
            cjkVar2.r(0);
            this.c = cjkVar2;
            return cjkVar2;
        }
        if (!(czzVar instanceof cmg)) {
            throw new aezs();
        }
        cjk cjkVarQ = q();
        float fC = cjkVarQ.c();
        cmg cmgVar = (cmg) czzVar;
        float f = cmgVar.a;
        if (fC != f) {
            cjkVarQ.q(f);
        }
        int iE = cjkVarQ.e();
        int i = cmgVar.c;
        if (iE != i) {
            cjkVarQ.n(i);
        }
        float fB = cjkVarQ.b();
        float f2 = cmgVar.b;
        if (fB != f2) {
            cjkVarQ.p(f2);
        }
        int iF = cjkVarQ.f();
        int i2 = cmgVar.d;
        if (iF != i2) {
            cjkVarQ.o(i2);
        }
        return cjkVarQ;
    }

    private final cjk E(long j, czz czzVar, float f, cjw cjwVar, int i) {
        cjk cjkVarD = D(czzVar);
        if (f != 1.0f) {
            float fA = cjv.a(j) * f;
            float fD = cjv.d(j);
            float fC = cjv.c(j);
            float fB = cjv.b(j);
            float[] fArr = clj.a;
            j = cjn.j(fD, fC, fB, fA, clj.y[(int) (j & 63)]);
        }
        if (cjkVarD.g() != j) {
            cjkVarD.j(j);
        }
        if (cjkVarD.c != null) {
            cjkVarD.m(null);
        }
        if (!affa.f(cjkVarD.d, cjwVar)) {
            cjkVarD.k(cjwVar);
        }
        if (cjkVarD.b != i) {
            cjkVarD.i(i);
        }
        if (cjkVarD.d() != 1) {
            cjkVarD.l(1);
        }
        return cjkVarD;
    }

    @Override // defpackage.cmd
    public final void A(cjs cjsVar, long j, long j2, long j3, float f, czz czzVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.m(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), u(cjsVar, czzVar, f, null, 3, 1));
    }

    @Override // defpackage.cmd
    public final void B(long j, long j2, long j3, long j4, czz czzVar, float f) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.m(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), E(j, czzVar, f, null, 3));
    }

    @Override // defpackage.cmd
    public final void C(cjj cjjVar, long j, long j2, long j3, float f, czz czzVar, cjw cjwVar, int i, int i2) {
        this.a.c.t(cjjVar, j, j2, j3, u(null, czzVar, f, cjwVar, i, i2));
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.a.a.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.a.a.b();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * a();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long n() {
        return byx.A(this.b.a());
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long o() {
        return this.b.a();
    }

    @Override // defpackage.cmd
    public final dlr p() {
        return this.a.b;
    }

    public final cjk q() {
        cjk cjkVar = this.d;
        if (cjkVar != null) {
            return cjkVar;
        }
        cjk cjkVar2 = new cjk();
        cjkVar2.r(1);
        this.d = cjkVar2;
        return cjkVar2;
    }

    @Override // defpackage.cmd
    public final cma r() {
        return this.b;
    }

    @Override // defpackage.cmd
    public final void s(long j, long j2, long j3, float f, int i) {
        cju cjuVar = this.a.c;
        cjk cjkVarQ = q();
        if (cjkVarQ.g() != j) {
            cjkVarQ.j(j);
        }
        if (cjkVarQ.c != null) {
            cjkVarQ.m(null);
        }
        if (!affa.f(cjkVarQ.d, null)) {
            cjkVarQ.k(null);
        }
        if (cjkVarQ.b != 3) {
            cjkVarQ.i(3);
        }
        if (cjkVarQ.c() != f) {
            cjkVarQ.q(f);
        }
        if (cjkVarQ.b() != 4.0f) {
            cjkVarQ.p(4.0f);
        }
        if (cjkVarQ.e() != i) {
            cjkVarQ.n(i);
        }
        if (cjkVarQ.f() != 0) {
            cjkVarQ.o(0);
        }
        if (cjkVarQ.d() != 1) {
            cjkVarQ.l(1);
        }
        cjuVar.k(j2, j3, cjkVarQ);
    }

    @Override // defpackage.cmd
    public final void t(long j, long j2, long j3, float f, czz czzVar, cjw cjwVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.l(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), E(j, czzVar, f, cjwVar, i));
    }

    public final cjk u(cjs cjsVar, czz czzVar, float f, cjw cjwVar, int i, int i2) {
        cjk cjkVarD = D(czzVar);
        if (cjsVar != null) {
            cjsVar.a(this.b.a(), cjkVarD, f);
        } else {
            if (cjkVarD.c != null) {
                cjkVarD.m(null);
            }
            if (cjkVarD.g() != -72057594037927936L) {
                cjkVarD.j(-72057594037927936L);
            }
            if (cjkVarD.a() != f) {
                cjkVarD.h(f);
            }
        }
        if (!affa.f(cjkVarD.d, cjwVar)) {
            cjkVarD.k(cjwVar);
        }
        if (cjkVarD.b != i) {
            cjkVarD.i(i);
        }
        if (cjkVarD.d() != i2) {
            cjkVarD.l(i2);
        }
        return cjkVarD;
    }

    @Override // defpackage.cmd
    public final void v(long j, float f, long j2, float f2, czz czzVar, int i) {
        this.a.c.j(j2, f, E(j, czzVar, f2, null, i));
    }

    @Override // defpackage.cmd
    public final void w(cjs cjsVar, long j, long j2, float f, czz czzVar, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j >> 32);
        this.a.c.l(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)), u(cjsVar, czzVar, f, null, i, 1));
    }

    @Override // defpackage.cmd
    public final void x(cjm cjmVar, cjs cjsVar, float f, czz czzVar, int i) {
        this.a.c.p(cjmVar, u(cjsVar, czzVar, f, null, i, 1));
    }

    @Override // defpackage.cmd
    public final void y(cjm cjmVar, long j, float f, czz czzVar, int i) {
        this.a.c.p(cjmVar, E(j, czzVar, f, null, i));
    }

    @Override // defpackage.cmd
    public final void z(long j, float f, float f2, long j2, long j3, czz czzVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, E(j, czzVar, 1.0f, null, 3));
    }
}
