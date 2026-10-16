package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nji {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.GhFacetBarCtrl");
    public defpackage.noz b;
    public android.support.v4.app.Fragment c;
    public defpackage.noz d;
    public defpackage.noz e;

    public static defpackage.nji a() {
        return (defpackage.nji) defpackage.mkp.a.b(defpackage.nji.class, new defpackage.lga(10));
    }

    public static com.google.android.gms.car.CarWindowLayoutParams b(defpackage.nta ntaVar, boolean z, boolean z2, defpackage.qsh qshVar) {
        defpackage.yqm yqmVar = defpackage.nte.a;
        defpackage.qts qtsVarN = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().n(ntaVar);
        qtsVarN.getClass();
        qtsVarN.m = 8;
        defpackage.lel lelVar = defpackage.lem.a;
        lelVar.a();
        qtsVarN.n = true != lelVar.a().b() ? 2132149932 : 2132149933;
        if (!z) {
            lelVar.a();
        }
        qtsVarN.l = true;
        if (defpackage.lee.a.a().c(qshVar) && ntaVar == defpackage.nta.k) {
            int i = (int) defpackage.gjr.P1.k;
            qtsVarN.e = new android.graphics.Rect(i, i, i, i);
        }
        if (z2) {
            qtsVarN.e();
        }
        return qtsVarN.a();
    }

    private final void m(boolean z, boolean z2, boolean z3, boolean z4, final defpackage.qsh qshVar) {
        nil njvVar;
        defpackage.lht lhtVar = (defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class);
        boolean z5 = z || defpackage.acyc.a.fF().aU() || defpackage.leo.a.a().e();
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsB = b(defpackage.nta.k, z3, z && !z2, qshVar);
        if (z5) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5283)).y("Loading Compose rail, isVertical: %s", java.lang.Boolean.valueOf(z2));
            njvVar = z2 ? new nil() : new defpackage.nhe();
        } else {
            defpackage.lem.a.a();
            njvVar = new njv((byte[]) null);
        }
        try {
            boolean zB = defpackage.lem.a.a().b();
            defpackage.noy noyVarA = defpackage.nsu.c().a(carWindowLayoutParamsB, "GhFacetBar", njvVar, lhtVar);
            noyVarA.f = true != zB ? 512 : 0;
            if (z5) {
                noyVarA.e = new defpackage.nig() { // from class: njg
                    @Override // defpackage.nig
                    public final defpackage.qsh a() {
                        defpackage.yqm yqmVar = defpackage.nji.a;
                        return qshVar;
                    }
                };
                this.b = noyVarA.b(qshVar);
            } else {
                defpackage.ysr.bk(z4, "Non-Compose rail must start in lifetime");
                this.b = noyVarA.a();
            }
            this.c = njvVar;
        } catch (defpackage.qst | defpackage.qsu e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5282)).u("Unable to start GhBoardwalkFacetBarFragment");
        }
    }

    private static final defpackage.noz n(defpackage.nta ntaVar, boolean z, java.lang.String str, ngz ngzVar, defpackage.eqg eqgVar, defpackage.qsh qshVar, boolean z2) throws defpackage.qsu, defpackage.qst {
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsB = b(ntaVar, z, true, qshVar);
        nha nhaVar = new nha();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("rail_type", ngzVar);
        nhaVar.setArguments(bundle);
        defpackage.noy noyVarB = defpackage.nsu.b(carWindowLayoutParamsB, str, nhaVar, eqgVar);
        noyVarB.e = new njh(qshVar);
        return z2 ? noyVarB.a() : noyVarB.b(qshVar);
    }

    private static final void o(java.lang.String str, defpackage.noz nozVar, boolean z) {
        if (nozVar == null) {
            ((defpackage.yqj) a.l().ai((char) 5287)).y("Requested critical ui state change for %s host but was null", str);
            return;
        }
        ((defpackage.yqj) a.l().ai(5286)).N("Requested critical ui state change for %s, isReady? %s", str, z);
        defpackage.rct rctVar = nozVar.m;
        defpackage.sau sauVar = (defpackage.sau) nozVar.k.g.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "Attempting to update window critical ui state, but inflater not found: %s", rctVar);
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s updateCriticalUiState(%s)", sauVar.a, java.lang.Boolean.valueOf(z));
        }
        sauVar.r = z;
        sauVar.i();
    }

    public final void c() {
        ((defpackage.yqj) a.l().ai((char) 5271)).u("cleanUpCarControlFacetBars");
        defpackage.noz nozVar = this.d;
        if (nozVar != null) {
            nozVar.d();
            this.d = null;
        }
        defpackage.noz nozVar2 = this.e;
        if (nozVar2 != null) {
            nozVar2.d();
            this.e = null;
        }
    }

    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 5272)).u("cleanUpMainFacetBar");
        defpackage.noz nozVar = this.b;
        if (nozVar != null) {
            nozVar.d();
            this.b = null;
        }
    }

    public final void e(boolean z, defpackage.qsh qshVar) {
        defpackage.yqm yqmVar = defpackage.nte.a;
        boolean zF = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().F();
        boolean zD = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().D();
        if (this.d != null || this.e != null) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5276)).u("Recreating car control rails");
            c();
        }
        if (zD && zF) {
            f(z, false, qshVar);
            i(z, false, qshVar);
        }
    }

    public final void f(boolean z, boolean z2, defpackage.qsh qshVar) {
        defpackage.lht lhtVarC = defpackage.ler.c();
        try {
            if (this.d == null) {
                this.d = n(defpackage.nta.B, z, "DriverRail", ngz.a, lhtVarC, qshVar, z2);
            }
        } catch (defpackage.qst | defpackage.qsu e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5277)).u("Unable to start GhBoardwalkFacetBarFragment");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void g(boolean z) throws wfo {
        ((defpackage.yqj) a.l().ai((char) 5278)).u("showFacetBar");
        boolean zF = defpackage.nte.c().b().F();
        boolean zD = defpackage.nte.c().b().D();
        defpackage.noz nozVar = this.b;
        if (nozVar == null) {
            m(zD, zF, z, true, defpackage.kit.b().e());
        } else {
            nozVar.j(true);
        }
    }

    public final void h(boolean z, defpackage.qsh qshVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5280)).u("showFacetBarOutOfLifetime");
        if (this.b != null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5281)).u("Recreating rail");
            d();
        }
        defpackage.yqm yqmVar2 = defpackage.nte.a;
        m(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().D(), ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().F(), z, false, qshVar);
    }

    public final void i(boolean z, boolean z2, defpackage.qsh qshVar) {
        defpackage.lht lhtVarC = defpackage.ler.c();
        try {
            if (this.e == null) {
                this.e = n(defpackage.nta.z, z, "PassengerRail", ngz.b, lhtVarC, qshVar, z2);
            }
        } catch (defpackage.qst | defpackage.qsu e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5284)).u("Unable to start GhBoardwalkFacetBarFragment");
        }
    }

    public final void j(boolean z) {
        o("DriverRail", this.d, z);
    }

    public final void k(boolean z) {
        o("GhFacetBar", this.b, z);
    }

    public final void l(boolean z) {
        o("PassengerRail", this.e, z);
    }
}
