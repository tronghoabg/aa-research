package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class nim {
    public static final yph a = yph.c("GH.GhFacetBarCtrl");
    public noh b;
    public Fragment c;
    public noh d;
    public noh e;

    public static nim a() {
        return (nim) mki.a.b(nim.class, new lfu(10));
    }

    public static CarWindowLayoutParams b(nsn nsnVar, boolean z, boolean z2, qrn qrnVar) {
        yph yphVar = nsr.a;
        qsw qswVarN = ((nsr) mki.a.i(nsr.class)).b().n(nsnVar);
        qswVarN.getClass();
        qswVarN.m = 8;
        leg legVar = leh.a;
        legVar.a();
        qswVarN.n = true != legVar.a().b() ? R.style.Theme_Gearhead_Coolwalk_Rail_Dark : R.style.Theme_Gearhead_Coolwalk_Rail_DayNight;
        if (!z) {
            legVar.a();
        }
        qswVarN.l = true;
        if (ldz.a.a().c(qrnVar) && nsnVar == nsn.k) {
            int i = (int) gjk.b.k;
            qswVarN.e = new Rect(i, i, i, i);
        }
        if (z2) {
            qswVarN.e();
        }
        return qswVarN.a();
    }

    private final void m(boolean z, boolean z2, boolean z3, boolean z4, final qrn qrnVar) {
        Fragment niyVar;
        lhm lhmVar = (lhm) mki.a.i(lhm.class);
        boolean z5 = z || acxa.a.gu().aR() || lej.a.a().e();
        CarWindowLayoutParams carWindowLayoutParamsB = b(nsn.k, z3, z && !z2, qrnVar);
        if (z5) {
            ((ype) ((ype) a.f()).ai((char) 5281)).y("Loading Compose rail, isVertical: %s", Boolean.valueOf(z2));
            niyVar = z2 ? new nhs() : new ngl();
        } else {
            leh.a.a();
            niyVar = new niy(null);
        }
        try {
            boolean zB = leh.a.a().b();
            nog nogVarA = nsh.c().a(carWindowLayoutParamsB, "GhFacetBar", niyVar, lhmVar);
            nogVarA.f = true != zB ? sk.AUDIO_CONTENT_BUFFER_SIZE : 0;
            if (z5) {
                nogVarA.e = new nhn() { // from class: nik
                    @Override // defpackage.nhn
                    public final qrn a() {
                        yph yphVar = nim.a;
                        return qrnVar;
                    }
                };
                this.b = nogVarA.b(qrnVar);
            } else {
                woy.aa(z4, "Non-Compose rail must start in lifetime");
                this.b = nogVarA.a();
            }
            this.c = niyVar;
        } catch (qrz | qsa e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5280)).u("Unable to start GhBoardwalkFacetBarFragment");
        }
    }

    private static final noh n(nsn nsnVar, boolean z, String str, ngg nggVar, eqa eqaVar, final qrn qrnVar, boolean z2) throws qrz, qsa {
        CarWindowLayoutParams carWindowLayoutParamsB = b(nsnVar, z, true, qrnVar);
        ngh nghVar = new ngh();
        Bundle bundle = new Bundle();
        bundle.putSerializable("rail_type", nggVar);
        nghVar.setArguments(bundle);
        nog nogVarB = nsh.b(carWindowLayoutParamsB, str, nghVar, eqaVar);
        nogVarB.e = new nhn() { // from class: nil
            @Override // defpackage.nhn
            public final qrn a() {
                yph yphVar = nim.a;
                return qrnVar;
            }
        };
        return z2 ? nogVarB.a() : nogVarB.b(qrnVar);
    }

    private static final void o(String str, noh nohVar, boolean z) {
        if (nohVar == null) {
            ((ype) a.l().ai((char) 5285)).y("Requested critical ui state change for %s host but was null", str);
            return;
        }
        ((ype) a.l().ai(5284)).N("Requested critical ui state change for %s, isReady? %s", str, z);
        rby rbyVar = nohVar.m;
        rzx rzxVar = (rzx) nohVar.k.g.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "Attempting to update window critical ui state, but inflater not found: %s", rbyVar);
            return;
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s updateCriticalUiState(%s)", rzxVar.a, Boolean.valueOf(z));
        }
        rzxVar.r = z;
        rzxVar.i();
    }

    public final void c() {
        ((ype) a.l().ai((char) 5269)).u("cleanUpCarControlFacetBars");
        noh nohVar = this.d;
        if (nohVar != null) {
            nohVar.d();
            this.d = null;
        }
        noh nohVar2 = this.e;
        if (nohVar2 != null) {
            nohVar2.d();
            this.e = null;
        }
    }

    public final void d() {
        ((ype) a.l().ai((char) 5270)).u("cleanUpMainFacetBar");
        noh nohVar = this.b;
        if (nohVar != null) {
            nohVar.d();
            this.b = null;
        }
    }

    public final void e(boolean z, qrn qrnVar) {
        yph yphVar = nsr.a;
        boolean zF = ((nsr) mki.a.i(nsr.class)).b().F();
        boolean zD = ((nsr) mki.a.i(nsr.class)).b().D();
        if (this.d != null || this.e != null) {
            ((ype) ((ype) a.f()).ai((char) 5274)).u("Recreating car control rails");
            c();
        }
        if (zD && zF) {
            f(z, false, qrnVar);
            i(z, false, qrnVar);
        }
    }

    public final void f(boolean z, boolean z2, qrn qrnVar) {
        lhm lhmVarD = lbh.d();
        try {
            if (this.d == null) {
                this.d = n(nsn.B, z, "DriverRail", ngg.a, lhmVarD, qrnVar, z2);
            }
        } catch (qrz | qsa e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5275)).u("Unable to start GhBoardwalkFacetBarFragment");
        }
    }

    public final void g(boolean z) {
        ((ype) a.l().ai((char) 5276)).u("showFacetBar");
        boolean zF = nsr.c().b().F();
        boolean zD = nsr.c().b().D();
        noh nohVar = this.b;
        if (nohVar == null) {
            m(zD, zF, z, true, kio.b().e());
        } else {
            nohVar.j(true);
        }
    }

    public final void h(boolean z, qrn qrnVar) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5278)).u("showFacetBarOutOfLifetime");
        if (this.b != null) {
            ((ype) ((ype) yphVar.f()).ai((char) 5279)).u("Recreating rail");
            d();
        }
        yph yphVar2 = nsr.a;
        m(((nsr) mki.a.i(nsr.class)).b().D(), ((nsr) mki.a.i(nsr.class)).b().F(), z, false, qrnVar);
    }

    public final void i(boolean z, boolean z2, qrn qrnVar) {
        lhm lhmVarD = lbh.d();
        try {
            if (this.e == null) {
                this.e = n(nsn.z, z, "PassengerRail", ngg.b, lhmVarD, qrnVar, z2);
            }
        } catch (qrz | qsa e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5282)).u("Unable to start GhBoardwalkFacetBarFragment");
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
