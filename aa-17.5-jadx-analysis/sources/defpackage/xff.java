package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarDisplayId;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xff implements mpj, mnd {
    public static final yph a = yph.c("GH.GhShellUiController");
    private nim h;
    private oah i;
    private xft j;
    private mrq k;
    private msh l;
    private boolean m;
    private boolean n;
    private final nsg f = new xfe(this, 0);
    private final nsg g = new xfe(this, 2);
    public boolean b = true;
    private int p = 3;
    private int q = 1;
    protected boolean c = false;
    public boolean d = false;
    public boolean e = false;
    private boolean o = false;

    @Override // defpackage.mpj
    public final void a() {
        if (!acxa.aC() && this.c) {
            this.i.a();
            this.n = false;
            f(this.m);
        }
    }

    @Override // defpackage.mpj
    public final void b() {
        msh mshVar;
        if (!this.d || !this.e) {
            ((ype) ((ype) a.f()).ai((char) 10214)).u("LifecycleEnd when not started by lifecycle");
            return;
        }
        this.e = false;
        ((ype) ((ype) a.f()).ai((char) 10215)).u("Hiding facet bar in onProjectionEnd");
        nim nimVarA = nim.a();
        ((ype) nim.a.l().ai((char) 5268)).u("cleanUpAllFacetBars");
        nimVarA.d();
        nimVarA.c();
        nsr.c().b().A(this.g);
        nyf.a().b();
        xft xftVar = this.j;
        if (xftVar != null && xftVar.d) {
            xftVar.a();
        }
        if (leh.a().b() && (mshVar = this.l) != null) {
            mshVar.b();
        }
        this.d = false;
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        nsr.c().b().w(this.f);
        p(false);
        mnc.a().b(mnb.u, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        q(!this.d);
        this.b = true;
        this.m = false;
        nsr.c().b().A(this.f);
        mnc.a().d(mnb.u);
        this.q = 1;
    }

    @Override // defpackage.mpj
    public final void e(qrn qrnVar) {
        this.e = true;
        this.d = true;
        this.h = nim.a();
        this.l = msh.a.a();
        this.h.e(mrq.c(qrnVar), qrnVar);
        if (this.b) {
            ((ype) ((ype) a.f()).ai((char) 10216)).u("Starting facet bar in postProjectionStart");
            this.h.h(mrq.c(qrnVar), qrnVar);
        }
        nyf.a.a().c(qrnVar);
        yph yphVar = nsr.a;
        ((nsr) mki.a.i(nsr.class)).b().w(this.g);
        if (leh.a.a().b()) {
            this.l.c(qrnVar);
            xft xftVar = this.j;
            if (xftVar == null) {
                wub wubVar = wyg.a.e;
                xftVar = new xft();
                this.j = xftVar;
            }
            xftVar.b(qrnVar);
        }
    }

    @Override // defpackage.mpj
    public final void f(boolean z) {
        boolean z2 = true;
        if (!acxa.aC() && this.n) {
            z2 = false;
        }
        if (this.c && z2) {
            oah oahVar = this.i;
            if (z) {
                oahVar.h();
            } else {
                oahVar.b();
            }
        }
        this.m = z;
    }

    @Override // defpackage.mpj
    public final void g(boolean z) {
        nim nimVar;
        yph yphVar = a;
        yop yopVarF = yphVar.f();
        Boolean boolValueOf = Boolean.valueOf(z);
        ((ype) ((ype) yopVarF).ai((char) 10222)).y("setSystemBarsOverlayVisible(%b)", boolValueOf);
        if (!acpf.m()) {
            ((ype) ((ype) yphVar.f()).ai((char) 10223)).u("setSystemBarsOverlayVisible ignored because appControlledImmersiveModeEnabled is false");
            return;
        }
        nso nsoVarB = nsr.c().b();
        if (nsoVarB.D() && !nsoVarB.F()) {
            oah oahVar = this.i;
            if (oahVar != null) {
                oahVar.c(z);
                return;
            }
            return;
        }
        if ((this.c || (this.d && this.e)) && (nimVar = this.h) != null) {
            ((ype) nim.a.l().ai((char) 5273)).y("setOverlayVisible(%s)", boolValueOf);
            noh nohVar = nimVar.b;
            if (nohVar != null) {
                nohVar.q(z);
            }
        }
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.println("--- Rail ---");
        printWriter.println("Visible: " + this.b);
        nim nimVar = this.h;
        if (nimVar != null) {
            noh nohVar = nimVar.b;
            if (nohVar != null) {
                printWriter.println("FragmentHost: " + nohVar.toString() + " | ready: " + nohVar.d + ", hosting: " + String.valueOf(nohVar.a()));
                printWriter.println("CarFragmentHost: ".concat(nohVar.toString()));
                rzx rzxVar = (rzx) nohVar.k.g.get(nohVar.m);
                if (rzxVar == null) {
                    printWriter.println("No CarWindow found");
                } else {
                    rzxVar.b(printWriter);
                }
            } else {
                printWriter.println("FragmentHost is null");
            }
            Fragment fragment = nimVar.c;
            if (fragment != null) {
                printWriter.println("Rail type: ".concat(String.valueOf(String.valueOf(fragment.getClass()))));
                Fragment fragment2 = nimVar.c;
                if (fragment2 instanceof niy) {
                    niy niyVar = (niy) fragment2;
                    printWriter.getClass();
                    printWriter.println("RailFragment");
                    printWriter.println("Layouts");
                    Iterator<E> it = niyVar.L.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        njv njvVar = (njv) next;
                        printWriter.println("--- Layout --- ");
                        printWriter.println(njvVar);
                        printWriter.println(njvVar.a.getConfiguration());
                        Object objE = niyVar.c().b().e();
                        Objects.toString(objE);
                        printWriter.println("Status bar rows ".concat(String.valueOf(objE)));
                        njw njwVarA = niyVar.a();
                        printWriter.println("resizeType " + njwVarA.m.e() + " etcStatus " + njwVarA.l.e());
                    }
                }
            } else {
                printWriter.println("No rail fragment");
            }
            noh nohVar2 = nimVar.d;
            if (nohVar2 != null) {
                String string = nohVar2.toString();
                noh nohVar3 = nimVar.d;
                printWriter.println("DriverRailFragmentHost: " + string + " | ready: " + nohVar3.d + ", hosting: " + String.valueOf(nohVar3.a()));
            } else {
                printWriter.println("DriverRailFragmentHost is null");
            }
            noh nohVar4 = nimVar.e;
            if (nohVar4 != null) {
                String string2 = nohVar4.toString();
                noh nohVar5 = nimVar.e;
                printWriter.println("PassengerRailFragmentHost: " + string2 + " | ready: " + nohVar5.d + ", hosting: " + String.valueOf(nohVar5.a()));
            } else {
                printWriter.println("PassengerRailFragmentHost is null");
            }
        } else {
            printWriter.println("Facet bar controller is null");
        }
        printWriter.println("\n--- Notification Center ---");
        nxo nxoVarB = nxo.b();
        printWriter.print("Notification Center state: ");
        nxs nxsVar = (nxs) nxoVarB.d.e();
        printWriter.println(nxsVar);
        if (nxsVar != null && nxsVar.a) {
            printWriter.print("Notifications: ");
            printWriter.println(nxoVarB.c.e());
        }
        printWriter.println("\n--- Dashboard ---");
        int i = this.q;
        if (i != 3) {
            String str = i != 1 ? i != 2 ? "null" : "DASHBOARD_NOT_SUPPORTED" : "UNKNOWN";
            if (i == 0) {
                throw null;
            }
            printWriter.println("Unable to dump dashboard, status is ".concat(str));
        } else {
            mua.a().y(printWriter);
        }
        printWriter.println("\n--- CarWindows ---");
        if (!kio.b().q()) {
            printWriter.println("No CarClient connection, unable to dump car windows");
            return;
        }
        try {
            mki.a.g();
            sab sabVarV = ols.v(kio.b().e(), CarDisplayId.a);
            printWriter.println("Car window manager for display ".concat(String.valueOf(String.valueOf(sabVarV.c))));
            printWriter.println("-- Windows --");
            Iterator it2 = sabVarV.g.values().iterator();
            while (it2.hasNext()) {
                ((rzx) it2.next()).b(printWriter);
                printWriter.println();
            }
        } catch (qrz | qsa e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 10208)).u("Unable to dump car windows");
        }
    }

    @Override // defpackage.mpj
    public final void i(boolean z) {
        ((ype) ((ype) a.f()).ai((char) 10224)).y("setSystemBarsVisible(%s)", Boolean.valueOf(z));
        nso nsoVarB = nsr.c().b();
        if (nsoVarB.D() && !nsoVarB.F()) {
            f(z);
            return;
        }
        if (this.c || (this.d && this.e)) {
            nim nimVar = this.h;
            if (z) {
                nimVar.g(mrq.a());
            } else {
                ((ype) nim.a.l().ai((char) 5271)).u("hideMainFacetBar");
                if (nimVar.b != null) {
                    if (acpf.m()) {
                        nimVar.b.e(true);
                    } else {
                        nimVar.b.d();
                        nimVar.b = null;
                    }
                }
            }
        }
        this.b = z;
        int i = nqe.a;
        int i2 = nqg.a;
        nqg nqgVar = nqf.a;
        if (nqgVar != null) {
            nqgVar.f(z);
        }
    }

    @Override // defpackage.mpj
    public final void j() {
        nim nimVar;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 10225)).u("showSystemBarsTransient()");
        if (!acpf.m()) {
            ((ype) ((ype) yphVar.f()).ai((char) 10226)).u("showSystemBarsTransient ignored because appControlledImmersiveModeEnabled is false");
            return;
        }
        nso nsoVarB = nsr.c().b();
        if (nsoVarB.D() && !nsoVarB.F()) {
            oah oahVar = this.i;
            if (oahVar != null) {
                oahVar.d();
                return;
            }
            return;
        }
        if ((this.c || (this.d && this.e)) && (nimVar = this.h) != null) {
            ((ype) nim.a.l().ai((char) 5283)).u("showTransient");
            noh nohVar = nimVar.b;
            if (nohVar != null) {
                nohVar.r();
            }
        }
    }

    @Override // defpackage.mpj
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.mpj
    public final void l(int i) {
        if (this.c) {
            this.i.e(i);
        }
        this.p = i;
    }

    @Override // defpackage.mpj
    public final void m() {
        if (!acxa.aC() && this.c) {
            this.n = true;
            this.i.f();
            this.i.h();
        }
    }

    @Override // defpackage.mpj
    public final void n() {
        if (this.c) {
            this.i.g();
        }
    }

    @Override // defpackage.mpj
    public final void o() {
        if (this.c) {
            this.i.i();
        }
    }

    public final void p(boolean z) {
        Rect rectA;
        CarWindowLayoutParams carWindowLayoutParamsA;
        this.h = nim.a();
        wub.s();
        nso nsoVarB = nsr.c().b();
        this.i = (nsoVarB.D() && nsoVarB.G(nsn.m)) ? new nzb() : new nzd();
        this.l = msh.a();
        xft xftVar = this.j;
        if (xftVar == null || !xftVar.d) {
            wub.s();
            xft xftVar2 = new xft();
            this.j = xftVar2;
            xftVar2.b(null);
        }
        wub.s();
        this.k = new mrq();
        this.c = true;
        boolean zA = mrq.a();
        int i = 2;
        if (mrq.a()) {
            mrq mrqVar = this.k;
            if (mrqVar.g == null) {
                ((ype) ((ype) mrq.a.f()).ai((char) 5238)).u("showing");
                mrqVar.c.fE(lbh.d(), mrqVar.e);
                mrqVar.d.fE(lbh.d(), mrqVar.f);
                mrqVar.g = (sab) kgq.c(new kym(i), "GH.BackdropWinCtrl", yzz.SYSTEM_UI_BACKDROP, yzy.Ju, true, "failed to get CarWindowManager", new Object[0]);
                try {
                    rectA = mrqVar.g.d().a();
                } catch (qrz e) {
                    tss.r("GH.BackdropWinCtrl", e, "unable to get CarDisplay: lost connecting to car", new Object[0]);
                    rectA = null;
                }
                mrp mrpVar = mrqVar.b;
                ((ype) mrq.a.l().ai((char) 5230)).y("updateContentInsets si=%s", rectA);
                mrpVar.b = rectA;
                mrn mrnVar = mrpVar.a;
                if (mrnVar != null) {
                    mrnVar.c(rectA);
                }
                sab sabVar = mrqVar.g;
                sabVar.getClass();
                Context context = mki.a.c;
                qsw qswVarN = nsr.c().b().n(nsn.o);
                if (qswVarN == null) {
                    tss.q("GH.BackdropWinCtrl", "unable to get layout params for SystemLayoutRegionType.FULLSCREEN)", new Object[0]);
                    carWindowLayoutParamsA = new qsw(0, 0, UUID.randomUUID()).a();
                } else {
                    qswVarN.g = Integer.MIN_VALUE;
                    qswVarN.q = null;
                    qswVarN.m = 192;
                    carWindowLayoutParamsA = qswVarN.a();
                }
                sabVar.f(mrpVar, "backdrop", context, carWindowLayoutParamsA, true != leh.a().b() ? 0 : 512);
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI_BACKDROP, yzy.Ju).l());
            }
        }
        if (!this.d) {
            nim nimVar = this.h;
            boolean zF = nsr.c().b().F();
            if (nsr.c().b().D() && zF) {
                nimVar.f(zA, true, kio.b().e());
                nimVar.i(zA, true, kio.b().e());
            }
            if (this.b) {
                this.h.g(zA);
            }
        }
        f(true);
        this.i.i();
        this.i.e(this.p);
        this.i.g();
        if (leh.a().b()) {
            this.l.c(kio.b().e());
        }
        boolean zC = ldz.a().c(kio.b().e());
        this.o = zC;
        if (zC && nsr.c().b().H() && (acxa.Y() || acxa.Z())) {
            nrx nrxVarC = nrx.c();
            wer.c();
            yph yphVar = nrx.a;
            ((ype) yphVar.l().ai((char) 5358)).u("scrim show");
            kgq.d(new kyi(nrxVarC, 10), "GH.IrregularScrim", yzz.SCRIM_WITH_A_HOLE_CONTEXT, yzy.Lk, "Car not connected when trying to show irregular display scrim", new Object[0]);
            ((ype) yphVar.l().ai((char) 5359)).u("startListeningForTransitions");
            if (nrxVarC.e) {
                ((ype) yphVar.l().ai((char) 5361)).u("startListeningForTransitions called but already listening");
            } else {
                nrxVarC.e = true;
                mpd.b().g(nrxVarC);
                mpd.b().h.i(nrxVarC);
                nxo nxoVarB = nxo.b();
                mmt mmtVar = new mmt(nrxVarC, 19);
                nrxVarC.g = mmtVar;
                nxoVarB.b.i(mmtVar);
            }
        }
        if (!nsr.c().b().K()) {
            this.q = 2;
            return;
        }
        this.q = 3;
        mua.a().s();
        CarInfo carInfoB = juw.b().b();
        if (carInfoB != null && carInfoB.r == 3) {
            ((ype) a.l().ai((char) 10213)).u("Not showing dashboard during projection start on motorcycles");
            return;
        }
        ComponentName componentNameA = map.a(kio.b().e(), true);
        nsv nsvVarM = nsr.c().b().m();
        if (componentNameA == null || !lem.a().i(new mqb(componentNameA))) {
            if (!z) {
                if (nsvVarM != nsv.f && nsvVarM != nsv.e && nsvVarM != nsv.g && nsvVarM != nsv.h) {
                    ((ype) a.l().ai((char) 10212)).y("Incompatible nav app, not showing dashboard for %s", nsvVarM);
                    return;
                } else {
                    ((ype) a.l().ai((char) 10211)).y("Showing dashboard due to incompatible nav app on %s", nsvVarM);
                    mua.a().o(false);
                    return;
                }
            }
        } else if (!z) {
            ((ype) a.l().ai((char) 10210)).u("Restoring dashboard");
            mua.a().l(false);
            return;
        }
        ((ype) a.l().ai((char) 10209)).u("Not showing dashboard");
    }

    public final void q(boolean z) {
        msh mshVar;
        mrq mrqVar;
        sab sabVar;
        this.c = false;
        xft xftVar = this.j;
        if (xftVar != null) {
            xftVar.a();
        }
        if (z) {
            this.h.c();
            if (this.b) {
                this.h.d();
            }
        }
        if (this.m) {
            this.i.b();
        }
        if (acxa.bb() && (sabVar = (mrqVar = this.k).g) != null) {
            sabVar.i(mrqVar.b);
            mrqVar.g = null;
            mrqVar.c.k(mrqVar.e);
            if (mrqVar.h != null) {
                hrt.c(mki.a.c).i(mrqVar.h);
            }
        }
        if (leh.a().b() && (mshVar = this.l) != null) {
            mshVar.b();
        }
        if (this.o && nsr.c().b().H()) {
            if (acxa.Y() || acxa.Z()) {
                nrx nrxVarC = nrx.c();
                if (nrxVarC.e) {
                    nrxVarC.e = false;
                    nrxVarC.f.removeCallbacksAndMessages(null);
                    mpd.b().j(nrxVarC);
                    mpd.b().h.k(nrxVarC);
                    nxo nxoVarB = nxo.b();
                    eqn eqnVar = nrxVarC.g;
                    if (eqnVar != null) {
                        nxoVarB.b.k(eqnVar);
                    }
                    nrxVarC.g = null;
                    nrxVarC.d();
                }
                mpi mpiVar = nrxVarC.c;
                if (mpiVar != null) {
                    mpiVar.b();
                    nrxVarC.c = null;
                }
            }
        }
    }
}
