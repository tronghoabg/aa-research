package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxn implements defpackage.cml {
    public final defpackage.cmj a;
    public defpackage.cwu b;

    public cxn(defpackage.cmj cmjVar) {
        this.a = cmjVar;
    }

    @Override // defpackage.cml
    public final void A(defpackage.cka ckaVar, long j, long j2, long j3, float f, defpackage.dai daiVar) {
        this.a.A(ckaVar, j, j2, j3, f, daiVar);
    }

    @Override // defpackage.cml
    public final void B(long j, long j2, long j3, long j4, defpackage.dai daiVar, float f) {
        this.a.B(j, j2, j3, j4, daiVar, f);
    }

    @Override // defpackage.cml
    public final void C(defpackage.cjr cjrVar, long j, long j2, long j3, float f, defpackage.dai daiVar, defpackage.cke ckeVar, int i, int i2) {
        this.a.C(cjrVar, j, j2, j3, f, daiVar, ckeVar, i, i2);
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return defpackage.dln.n(this.a, j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return (f / this.a.a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return (i / this.a.a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return defpackage.dln.p(this.a, j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return f * this.a.a();
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return defpackage.dln.q(this.a, f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return defpackage.dln.r(this.a, j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return defpackage.dln.s(this.a, j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return defpackage.dln.o(this.a, f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        defpackage.cmj cmjVar = this.a;
        return defpackage.dln.o(cmjVar, (f / cmjVar.a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cml
    public final long n() {
        return defpackage.bzo.y(this.a.b.a());
    }

    @Override // defpackage.cml
    public final long o() {
        return this.a.b.a();
    }

    @Override // defpackage.cml
    public final defpackage.dlz p() {
        return this.a.p();
    }

    public final void q() {
        defpackage.ckc ckcVarB = r().b();
        defpackage.cwu cwuVar = this.b;
        if (cwuVar == null) {
            defpackage.csc.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new defpackage.afap();
        }
        defpackage.cge cgeVarO = cwuVar.M().u;
        if (cgeVarO != null && (cgeVarO.s & 4) != 0) {
            while (true) {
                if (cgeVarO != null) {
                    int i = cgeVarO.r;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            cgeVarO = cgeVarO.u;
                        }
                    }
                }
                cgeVarO = null;
                break;
            }
        } else {
            cgeVarO = null;
            break;
        }
        if (cgeVarO == null) {
            defpackage.cyl cylVarS = defpackage.cjv.s(cwuVar, 4);
            if (cylVarS.B() == cwuVar.M()) {
                cylVarS = cylVarS.w;
                cylVarS.getClass();
            }
            cylVarS.F(ckcVarB, r().a);
            return;
        }
        defpackage.bzc bzcVar = null;
        while (cgeVarO != null) {
            if (cgeVarO instanceof defpackage.cwu) {
                defpackage.cwu cwuVar2 = (defpackage.cwu) cgeVarO;
                defpackage.cmq cmqVar = r().a;
                defpackage.cyl cylVarS2 = defpackage.cjv.s(cwuVar2, 4);
                cylVarS2.t.m().u(ckcVarB, defpackage.dlv.f(cylVarS2.c), cylVarS2, cwuVar2, cmqVar);
            } else if ((cgeVarO.r & 4) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                int i2 = 0;
                for (defpackage.cge cgeVar = ((defpackage.cwo) cgeVarO).C; cgeVar != null; cgeVar = cgeVar.u) {
                    if ((cgeVar.r & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cgeVarO = cgeVar;
                        } else {
                            if (bzcVar == null) {
                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                            }
                            if (cgeVarO != null) {
                                bzcVar.n(cgeVarO);
                            }
                            bzcVar.n(cgeVar);
                            cgeVarO = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            cgeVarO = defpackage.cjv.o(bzcVar);
        }
    }

    @Override // defpackage.cml
    public final defpackage.cmi r() {
        return this.a.b;
    }

    @Override // defpackage.cml
    public final void s(long j, long j2, long j3, float f, int i) {
        this.a.s(j, j2, j3, f, i);
    }

    @Override // defpackage.cml
    public final void t(long j, long j2, long j3, float f, defpackage.dai daiVar, defpackage.cke ckeVar, int i) {
        this.a.t(j, j2, j3, f, daiVar, ckeVar, i);
    }

    public final void u(defpackage.ckc ckcVar, long j, defpackage.cyl cylVar, defpackage.cwu cwuVar, defpackage.cmq cmqVar) {
        defpackage.cwu cwuVar2 = this.b;
        this.b = cwuVar;
        defpackage.cmj cmjVar = this.a;
        defpackage.cmi cmiVar = cmjVar.b;
        defpackage.dlz dlzVarP = cylVar.p();
        defpackage.dlo dloVarC = cmiVar.c();
        defpackage.dlz dlzVarD = cmiVar.d();
        defpackage.ckc ckcVarB = cmiVar.b();
        long jA = cmiVar.a();
        defpackage.cmq cmqVar2 = cmiVar.a;
        cmiVar.f(cylVar);
        cmiVar.g(dlzVarP);
        cmiVar.e(ckcVar);
        cmiVar.h(j);
        cmiVar.a = cmqVar;
        ckcVar.g();
        try {
            cwuVar.b(this);
            ckcVar.e();
            defpackage.cmi cmiVar2 = cmjVar.b;
            cmiVar2.f(dloVarC);
            cmiVar2.g(dlzVarD);
            cmiVar2.e(ckcVarB);
            cmiVar2.h(jA);
            cmiVar2.a = cmqVar2;
            this.b = cwuVar2;
        } catch (java.lang.Throwable th) {
            ckcVar.e();
            defpackage.cmi cmiVar3 = cmjVar.b;
            cmiVar3.f(dloVarC);
            cmiVar3.g(dlzVarD);
            cmiVar3.e(ckcVarB);
            cmiVar3.h(jA);
            cmiVar3.a = cmqVar2;
            throw th;
        }
    }

    @Override // defpackage.cml
    public final void v(long j, float f, long j2, float f2, defpackage.dai daiVar, int i) {
        this.a.v(j, f, j2, f2, daiVar, i);
    }

    @Override // defpackage.cml
    public final void w(defpackage.cka ckaVar, long j, long j2, float f, defpackage.dai daiVar, int i) {
        this.a.w(ckaVar, j, j2, f, daiVar, i);
    }

    @Override // defpackage.cml
    public final void x(defpackage.cju cjuVar, defpackage.cka ckaVar, float f, defpackage.dai daiVar, int i) {
        this.a.x(cjuVar, ckaVar, f, daiVar, i);
    }

    @Override // defpackage.cml
    public final void y(defpackage.cju cjuVar, long j, float f, defpackage.dai daiVar, int i) {
        this.a.y(cjuVar, j, f, daiVar, i);
    }

    @Override // defpackage.cml
    public final void z(long j, float f, float f2, long j2, long j3, defpackage.dai daiVar) {
        this.a.z(j, f, f2, j2, j3, daiVar);
    }
}
