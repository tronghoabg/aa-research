package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cxd implements cmd {
    public final cmb a;
    public cwk b;

    public cxd(cmb cmbVar) {
        this.a = cmbVar;
    }

    @Override // defpackage.cmd
    public final void A(cjs cjsVar, long j, long j2, long j3, float f, czz czzVar) {
        this.a.A(cjsVar, j, j2, j3, f, czzVar);
    }

    @Override // defpackage.cmd
    public final void B(long j, long j2, long j3, long j4, czz czzVar, float f) {
        this.a.B(j, j2, j3, j4, czzVar, f);
    }

    @Override // defpackage.cmd
    public final void C(cjj cjjVar, long j, long j2, long j3, float f, czz czzVar, cjw cjwVar, int i, int i2) {
        this.a.C(cjjVar, j, j2, j3, f, czzVar, cjwVar, i, i2);
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlg
    public final float eA(float f) {
        return f * this.a.a();
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return dlf.l(this.a, f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return dlf.m(this.a, j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return dlf.n(this.a, j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return dln.d(this.a, f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        cmb cmbVar = this.a;
        return dln.d(cmbVar, (f / cmbVar.a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return dln.c(this.a, j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return (f / this.a.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return (i / this.a.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return dlf.k(this.a, j);
    }

    @Override // defpackage.cmd
    public final long n() {
        return byx.A(this.a.b.a());
    }

    @Override // defpackage.cmd
    public final long o() {
        return this.a.b.a();
    }

    @Override // defpackage.cmd
    public final dlr p() {
        return this.a.p();
    }

    public final void q() {
        cju cjuVarB = r().b();
        cwk cwkVar = this.b;
        if (cwkVar == null) {
            crt.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new aezp();
        }
        cfx cfxVarN = cwkVar.M().u;
        if (cfxVarN == null || (cfxVarN.s & 4) == 0) {
            cfxVarN = null;
        } else {
            while (cfxVarN != null) {
                int i = cfxVarN.r;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    cfxVarN = cfxVarN.u;
                }
            }
            cfxVarN = null;
        }
        if (cfxVarN == null) {
            cyc cycVarR = bzi.r(cwkVar, 4);
            if (cycVarR.B() == cwkVar.M()) {
                cycVarR = cycVarR.w;
                cycVarR.getClass();
            }
            cycVarR.F(cjuVarB, r().a);
            return;
        }
        byw bywVar = null;
        while (cfxVarN != null) {
            if (cfxVarN instanceof cwk) {
                cwk cwkVar2 = (cwk) cfxVarN;
                cmi cmiVar = r().a;
                cyc cycVarR2 = bzi.r(cwkVar2, 4);
                cycVarR2.t.m().u(cjuVarB, dln.k(cycVarR2.c), cycVarR2, cwkVar2, cmiVar);
            } else if ((cfxVarN.r & 4) != 0 && (cfxVarN instanceof cwe)) {
                int i2 = 0;
                for (cfx cfxVar = ((cwe) cfxVarN).C; cfxVar != null; cfxVar = cfxVar.u) {
                    if ((cfxVar.r & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cfxVarN = cfxVar;
                        } else {
                            if (bywVar == null) {
                                bywVar = new byw(new cfx[16]);
                            }
                            if (cfxVarN != null) {
                                bywVar.n(cfxVarN);
                            }
                            bywVar.n(cfxVar);
                            cfxVarN = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            cfxVarN = bzi.n(bywVar);
        }
    }

    @Override // defpackage.cmd
    public final cma r() {
        return this.a.b;
    }

    @Override // defpackage.cmd
    public final void s(long j, long j2, long j3, float f, int i) {
        this.a.s(j, j2, j3, f, i);
    }

    @Override // defpackage.cmd
    public final void t(long j, long j2, long j3, float f, czz czzVar, cjw cjwVar, int i) {
        this.a.t(j, j2, j3, f, czzVar, cjwVar, i);
    }

    public final void u(cju cjuVar, long j, cyc cycVar, cwk cwkVar, cmi cmiVar) {
        cwk cwkVar2 = this.b;
        this.b = cwkVar;
        cmb cmbVar = this.a;
        cma cmaVar = cmbVar.b;
        dlr dlrVarP = cycVar.p();
        dlg dlgVarC = cmaVar.c();
        dlr dlrVarD = cmaVar.d();
        cju cjuVarB = cmaVar.b();
        long jA = cmaVar.a();
        cmi cmiVar2 = cmaVar.a;
        cmaVar.f(cycVar);
        cmaVar.g(dlrVarP);
        cmaVar.e(cjuVar);
        cmaVar.h(j);
        cmaVar.a = cmiVar;
        cjuVar.g();
        try {
            cwkVar.b(this);
            cjuVar.e();
            cma cmaVar2 = cmbVar.b;
            cmaVar2.f(dlgVarC);
            cmaVar2.g(dlrVarD);
            cmaVar2.e(cjuVarB);
            cmaVar2.h(jA);
            cmaVar2.a = cmiVar2;
            this.b = cwkVar2;
        } catch (Throwable th) {
            cjuVar.e();
            cma cmaVar3 = cmbVar.b;
            cmaVar3.f(dlgVarC);
            cmaVar3.g(dlrVarD);
            cmaVar3.e(cjuVarB);
            cmaVar3.h(jA);
            cmaVar3.a = cmiVar2;
            throw th;
        }
    }

    @Override // defpackage.cmd
    public final void v(long j, float f, long j2, float f2, czz czzVar, int i) {
        this.a.v(j, f, j2, f2, czzVar, i);
    }

    @Override // defpackage.cmd
    public final void w(cjs cjsVar, long j, long j2, float f, czz czzVar, int i) {
        this.a.w(cjsVar, j, j2, f, czzVar, i);
    }

    @Override // defpackage.cmd
    public final void x(cjm cjmVar, cjs cjsVar, float f, czz czzVar, int i) {
        this.a.x(cjmVar, cjsVar, f, czzVar, i);
    }

    @Override // defpackage.cmd
    public final void y(cjm cjmVar, long j, float f, czz czzVar, int i) {
        this.a.y(cjmVar, j, f, czzVar, i);
    }

    @Override // defpackage.cmd
    public final void z(long j, float f, float f2, long j2, long j3, czz czzVar) {
        this.a.z(j, f, f2, j2, j3, czzVar);
    }
}
