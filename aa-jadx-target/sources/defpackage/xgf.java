package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgf implements defpackage.mpp, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.GhShellUiController");
    private defpackage.nji h;
    private obc i;
    private defpackage.xgu j;
    private defpackage.mru k;
    private defpackage.msl l;
    private boolean m;
    private boolean n;
    private final defpackage.nst f = new defpackage.xge(this, 0);
    private final defpackage.nst g = new defpackage.xge(this, 2);
    public boolean b = true;
    private int p = 3;
    private int q = 1;
    protected boolean c = false;
    public boolean d = false;
    public boolean e = false;
    private boolean o = false;

    @Override // defpackage.mpp
    public final void a() {
        if (!defpackage.acyc.aF() && this.c) {
            this.i.a();
            this.n = false;
            f(this.m);
        }
    }

    @Override // defpackage.mpp
    public final void b() {
        defpackage.msl mslVar;
        if (!this.d || !this.e) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 10242)).u("LifecycleEnd when not started by lifecycle");
            return;
        }
        this.e = false;
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 10243)).u("Hiding facet bar in onProjectionEnd");
        defpackage.nji njiVarA = defpackage.nji.a();
        ((defpackage.yqj) defpackage.nji.a.l().ai((char) 5270)).u("cleanUpAllFacetBars");
        njiVarA.d();
        njiVarA.c();
        defpackage.nte.c().b().A(this.g);
        defpackage.nza.a().b();
        defpackage.xgu xguVar = this.j;
        if (xguVar != null && xguVar.d) {
            xguVar.a();
        }
        if (defpackage.lem.a().b() && (mslVar = this.l) != null) {
            mslVar.b();
        }
        this.d = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        q(!this.d);
        this.b = true;
        this.m = false;
        defpackage.nte.c().b().A(this.f);
        defpackage.mni.a().d(defpackage.mnh.u);
        this.q = 1;
    }

    @Override // defpackage.mpp
    public final void e(defpackage.qsh qshVar) {
        this.e = true;
        this.d = true;
        this.h = defpackage.nji.a();
        this.l = defpackage.msl.a.a();
        this.h.e(defpackage.mru.c(qshVar), qshVar);
        if (this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 10244)).u("Starting facet bar in postProjectionStart");
            this.h.h(defpackage.mru.c(qshVar), qshVar);
        }
        defpackage.nza.a.a().c(qshVar);
        defpackage.yqm yqmVar = defpackage.nte.a;
        ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().w(this.g);
        if (defpackage.lem.a.a().b()) {
            this.l.c(qshVar);
            defpackage.xgu xguVar = this.j;
            if (xguVar == null) {
                defpackage.sqs sqsVar = defpackage.wzc.a.e;
                xguVar = new defpackage.xgu();
                this.j = xguVar;
            }
            xguVar.b(qshVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        defpackage.nte.c().b().w(this.f);
        p(false);
        defpackage.mni.a().b(defpackage.mnh.u, this);
    }

    @Override // defpackage.mpp
    public final void f(boolean z) {
        boolean z2 = true;
        if (!defpackage.acyc.aF() && this.n) {
            z2 = false;
        }
        if (this.c && z2) {
            obc obcVar = this.i;
            if (z) {
                obcVar.h();
            } else {
                obcVar.b();
            }
        }
        this.m = z;
    }

    @Override // defpackage.mpp
    public final void g(boolean z) {
        defpackage.nji njiVar;
        defpackage.yqm yqmVar = a;
        defpackage.ypu ypuVarF = yqmVar.f();
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 10250)).y("setSystemBarsOverlayVisible(%b)", boolValueOf);
        if (!defpackage.acqh.m()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10251)).u("setSystemBarsOverlayVisible ignored because appControlledImmersiveModeEnabled is false");
            return;
        }
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        if (ntbVarB.D() && !ntbVarB.F()) {
            obc obcVar = this.i;
            if (obcVar != null) {
                obcVar.c(z);
                return;
            }
            return;
        }
        if ((this.c || (this.d && this.e)) && (njiVar = this.h) != null) {
            ((defpackage.yqj) defpackage.nji.a.l().ai((char) 5275)).y("setOverlayVisible(%s)", boolValueOf);
            defpackage.noz nozVar = njiVar.b;
            if (nozVar != null) {
                nozVar.q(z);
            }
        }
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        java.lang.String str;
        printWriter.println("--- Rail ---");
        printWriter.println("Visible: " + this.b);
        defpackage.nji njiVar = this.h;
        if (njiVar != null) {
            defpackage.noz nozVar = njiVar.b;
            if (nozVar != null) {
                printWriter.println("FragmentHost: " + nozVar.toString() + " | ready: " + nozVar.d + ", hosting: " + java.lang.String.valueOf(nozVar.a()));
                printWriter.println("CarFragmentHost: ".concat(nozVar.toString()));
                defpackage.sau sauVar = (defpackage.sau) nozVar.k.g.get(nozVar.m);
                if (sauVar == null) {
                    printWriter.println("No CarWindow found");
                } else {
                    sauVar.b(printWriter);
                }
            } else {
                printWriter.println("FragmentHost is null");
            }
            android.support.v4.app.Fragment fragment = njiVar.c;
            if (fragment != null) {
                printWriter.println("Rail type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(fragment.getClass()))));
                njv njvVar = njiVar.c;
                if (njvVar instanceof njv) {
                    njv njvVar2 = njvVar;
                    printWriter.getClass();
                    printWriter.println("RailFragment");
                    printWriter.println("Layouts");
                    java.util.Iterator<E> it = njvVar2.L.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        next.getClass();
                        nko nkoVar = (nko) next;
                        printWriter.println("--- Layout --- ");
                        printWriter.println(nkoVar);
                        printWriter.println(nkoVar.a.getConfiguration());
                        java.lang.Object objE = njvVar2.c().b().e();
                        java.util.Objects.toString(objE);
                        printWriter.println("Status bar rows ".concat(java.lang.String.valueOf(objE)));
                        defpackage.nkp nkpVarA = njvVar2.a();
                        printWriter.println("resizeType " + nkpVarA.n.e() + " etcStatus " + nkpVarA.m.e());
                    }
                }
            } else {
                printWriter.println("No rail fragment");
            }
            defpackage.noz nozVar2 = njiVar.d;
            if (nozVar2 != null) {
                java.lang.String string = nozVar2.toString();
                defpackage.noz nozVar3 = njiVar.d;
                printWriter.println("DriverRailFragmentHost: " + string + " | ready: " + nozVar3.d + ", hosting: " + java.lang.String.valueOf(nozVar3.a()));
            } else {
                printWriter.println("DriverRailFragmentHost is null");
            }
            defpackage.noz nozVar4 = njiVar.e;
            if (nozVar4 != null) {
                java.lang.String string2 = nozVar4.toString();
                defpackage.noz nozVar5 = njiVar.e;
                printWriter.println("PassengerRailFragmentHost: " + string2 + " | ready: " + nozVar5.d + ", hosting: " + java.lang.String.valueOf(nozVar5.a()));
            } else {
                printWriter.println("PassengerRailFragmentHost is null");
            }
        } else {
            printWriter.println("Facet bar controller is null");
        }
        printWriter.println("\n--- Notification Center ---");
        defpackage.nye nyeVarB = defpackage.nye.b();
        printWriter.print("Notification Center state: ");
        defpackage.nyi nyiVar = (defpackage.nyi) nyeVarB.d.e();
        printWriter.println(nyiVar);
        if (nyiVar != null && nyiVar.a) {
            printWriter.print("Notifications: ");
            printWriter.println(nyeVarB.c.e());
        }
        printWriter.println("\n--- Dashboard ---");
        int i = this.q;
        if (i != 3) {
            if (i != 1) {
                str = i != 2 ? "null" : "DASHBOARD_NOT_SUPPORTED";
            } else {
                str = "UNKNOWN";
            }
            if (i == 0) {
                throw null;
            }
            printWriter.println("Unable to dump dashboard, status is ".concat(str));
        } else {
            defpackage.mug.a().z(printWriter);
        }
        printWriter.println("\n--- CarWindows ---");
        if (!defpackage.kit.b().q()) {
            printWriter.println("No CarClient connection, unable to dump car windows");
            return;
        }
        try {
            defpackage.mkp.a.g();
            defpackage.sax saxVarV = defpackage.oml.v(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a);
            printWriter.println("Car window manager for display ".concat(java.lang.String.valueOf(java.lang.String.valueOf(saxVarV.c))));
            printWriter.println("-- Windows --");
            java.util.Iterator it2 = saxVarV.g.values().iterator();
            while (it2.hasNext()) {
                ((defpackage.sau) it2.next()).b(printWriter);
                printWriter.println();
            }
        } catch (defpackage.qst | defpackage.qsu e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 10236)).u("Unable to dump car windows");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mpp
    public final void i(boolean z) throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 10252)).y("setSystemBarsVisible(%s)", java.lang.Boolean.valueOf(z));
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        if (ntbVarB.D() && !ntbVarB.F()) {
            f(z);
            return;
        }
        if (this.c || (this.d && this.e)) {
            defpackage.nji njiVar = this.h;
            if (z) {
                njiVar.g(defpackage.mru.a());
            } else {
                ((defpackage.yqj) defpackage.nji.a.l().ai((char) 5273)).u("hideMainFacetBar");
                if (njiVar.b != null) {
                    if (defpackage.acqh.m()) {
                        njiVar.b.e(true);
                    } else {
                        njiVar.b.d();
                        njiVar.b = null;
                    }
                }
            }
        }
        this.b = z;
        int i = defpackage.nqx.a;
        int i2 = defpackage.nqz.a;
        defpackage.nqz nqzVar = defpackage.nqy.a;
        if (nqzVar != null) {
            nqzVar.f(z);
        }
    }

    @Override // defpackage.mpp
    public final void j() {
        defpackage.nji njiVar;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10253)).u("showSystemBarsTransient()");
        if (!defpackage.acqh.m()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10254)).u("showSystemBarsTransient ignored because appControlledImmersiveModeEnabled is false");
            return;
        }
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        if (ntbVarB.D() && !ntbVarB.F()) {
            obc obcVar = this.i;
            if (obcVar != null) {
                obcVar.d();
                return;
            }
            return;
        }
        if ((this.c || (this.d && this.e)) && (njiVar = this.h) != null) {
            ((defpackage.yqj) defpackage.nji.a.l().ai((char) 5285)).u("showTransient");
            defpackage.noz nozVar = njiVar.b;
            if (nozVar != null) {
                nozVar.r();
            }
        }
    }

    @Override // defpackage.mpp
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.mpp
    public final void l(int i) {
        if (this.c) {
            this.i.e(i);
        }
        this.p = i;
    }

    @Override // defpackage.mpp
    public final void m() {
        if (!defpackage.acyc.aF() && this.c) {
            this.n = true;
            this.i.f();
            this.i.h();
        }
    }

    @Override // defpackage.mpp
    public final void n() {
        if (this.c) {
            this.i.g();
        }
    }

    @Override // defpackage.mpp
    public final void o() {
        if (this.c) {
            this.i.i();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void p(boolean z) throws wfo {
        android.graphics.Rect rectA;
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA;
        this.h = defpackage.nji.a();
        defpackage.sqs.bf();
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        this.i = (ntbVarB.D() && ntbVarB.G(defpackage.nta.m)) ? new nzw() : new defpackage.nzy();
        this.l = defpackage.msl.a();
        defpackage.xgu xguVar = this.j;
        if (xguVar == null || !xguVar.d) {
            defpackage.sqs.bf();
            defpackage.xgu xguVar2 = new defpackage.xgu();
            this.j = xguVar2;
            xguVar2.b(null);
        }
        defpackage.sqs.bf();
        this.k = new defpackage.mru();
        this.c = true;
        boolean zA = defpackage.mru.a();
        int i = 2;
        if (defpackage.mru.a()) {
            defpackage.mru mruVar = this.k;
            if (mruVar.g == null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mru.a.f()).ai((char) 5240)).u("showing");
                mruVar.c.eM(defpackage.ler.c(), mruVar.e);
                mruVar.d.eM(defpackage.ler.c(), mruVar.f);
                mruVar.g = (defpackage.sax) defpackage.kgu.c(new defpackage.kyr(i), "GH.BackdropWinCtrl", defpackage.zbe.SYSTEM_UI_BACKDROP, defpackage.zbd.Jy, true, "failed to get CarWindowManager", new java.lang.Object[0]);
                try {
                    rectA = mruVar.g.d().a();
                } catch (defpackage.qst e) {
                    defpackage.rox.p("GH.BackdropWinCtrl", e, "unable to get CarDisplay: lost connecting to car", new java.lang.Object[0]);
                    rectA = null;
                }
                defpackage.rct rctVar = mruVar.b;
                ((defpackage.yqj) defpackage.mru.a.l().ai((char) 5232)).y("updateContentInsets si=%s", rectA);
                ((mrt) rctVar).b = rectA;
                mrr mrrVar = ((mrt) rctVar).a;
                if (mrrVar != null) {
                    mrrVar.c(rectA);
                }
                defpackage.sax saxVar = mruVar.g;
                saxVar.getClass();
                android.content.Context context = defpackage.mkp.a.c;
                defpackage.qts qtsVarN = defpackage.nte.c().b().n(defpackage.nta.o);
                if (qtsVarN == null) {
                    defpackage.rox.o("GH.BackdropWinCtrl", "unable to get layout params for SystemLayoutRegionType.FULLSCREEN)", new java.lang.Object[0]);
                    carWindowLayoutParamsA = new defpackage.qts(0, 0, java.util.UUID.randomUUID()).a();
                } else {
                    qtsVarN.g = Integer.MIN_VALUE;
                    qtsVarN.q = null;
                    qtsVarN.m = 192;
                    carWindowLayoutParamsA = qtsVarN.a();
                }
                saxVar.f(rctVar, "backdrop", context, carWindowLayoutParamsA, true != defpackage.lem.a().b() ? 0 : 512);
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_BACKDROP, defpackage.zbd.Jy).l());
            }
        }
        if (!this.d) {
            defpackage.nji njiVar = this.h;
            boolean zF = defpackage.nte.c().b().F();
            if (defpackage.nte.c().b().D() && zF) {
                njiVar.f(zA, true, defpackage.kit.b().e());
                njiVar.i(zA, true, defpackage.kit.b().e());
            }
            if (this.b) {
                this.h.g(zA);
            }
        }
        f(true);
        this.i.i();
        this.i.e(this.p);
        this.i.g();
        if (defpackage.lem.a().b()) {
            this.l.c(defpackage.kit.b().e());
        }
        boolean zC = defpackage.lee.a().c(defpackage.kit.b().e());
        this.o = zC;
        if (zC && defpackage.nte.c().b().H() && (defpackage.acyc.Y() || defpackage.acyc.Z())) {
            nsl nslVarC = nsl.c();
            defpackage.wfp.c();
            defpackage.yqm yqmVar = nsl.a;
            ((defpackage.yqj) yqmVar.l().ai((char) 5360)).u("scrim show");
            defpackage.kgu.d(new defpackage.kyo(nslVarC, 10), "GH.IrregularScrim", defpackage.zbe.SCRIM_WITH_A_HOLE_CONTEXT, defpackage.zbd.Lo, "Car not connected when trying to show irregular display scrim", new java.lang.Object[0]);
            ((defpackage.yqj) yqmVar.l().ai((char) 5361)).u("startListeningForTransitions");
            if (nslVarC.e) {
                ((defpackage.yqj) yqmVar.l().ai((char) 5363)).u("startListeningForTransitions called but already listening");
            } else {
                nslVarC.e = true;
                defpackage.mpj.b().g(nslVarC);
                defpackage.mpj.b().h.i(nslVarC);
                defpackage.nye nyeVarB = defpackage.nye.b();
                defpackage.mmz mmzVar = new defpackage.mmz(nslVarC, 19);
                nslVarC.g = mmzVar;
                nyeVarB.b.i(mmzVar);
            }
        }
        if (!defpackage.nte.c().b().K()) {
            this.q = 2;
            return;
        }
        this.q = 3;
        defpackage.mug.a().s();
        com.google.android.gms.car.CarInfo carInfoB = defpackage.juv.l().b();
        if (carInfoB != null && carInfoB.r == 3) {
            ((defpackage.yqj) a.l().ai((char) 10241)).u("Not showing dashboard during projection start on motorcycles");
            return;
        }
        android.content.ComponentName componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true);
        defpackage.nti ntiVarM = defpackage.nte.c().b().m();
        if (componentNameA == null || !defpackage.ler.a().i(new defpackage.mqi(componentNameA))) {
            if (!z) {
                if (ntiVarM != defpackage.nti.f && ntiVarM != defpackage.nti.e && ntiVarM != defpackage.nti.g && ntiVarM != defpackage.nti.h) {
                    ((defpackage.yqj) a.l().ai((char) 10240)).y("Incompatible nav app, not showing dashboard for %s", ntiVarM);
                    return;
                } else {
                    ((defpackage.yqj) a.l().ai((char) 10239)).y("Showing dashboard due to incompatible nav app on %s", ntiVarM);
                    defpackage.mug.a().o(false);
                    return;
                }
            }
        } else if (!z) {
            ((defpackage.yqj) a.l().ai((char) 10238)).u("Restoring dashboard");
            defpackage.mug.a().l(false);
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 10237)).u("Not showing dashboard");
    }

    public final void q(boolean z) {
        defpackage.msl mslVar;
        defpackage.mru mruVar;
        defpackage.sax saxVar;
        this.c = false;
        defpackage.xgu xguVar = this.j;
        if (xguVar != null) {
            xguVar.a();
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
        if (defpackage.acyc.be() && (saxVar = (mruVar = this.k).g) != null) {
            saxVar.i(mruVar.b);
            mruVar.g = null;
            mruVar.c.k(mruVar.e);
            if (mruVar.h != null) {
                hsc.c(defpackage.mkp.a.c).i(mruVar.h);
            }
        }
        if (defpackage.lem.a().b() && (mslVar = this.l) != null) {
            mslVar.b();
        }
        if (this.o && defpackage.nte.c().b().H()) {
            if (defpackage.acyc.Y() || defpackage.acyc.Z()) {
                nsl nslVarC = nsl.c();
                if (nslVarC.e) {
                    nslVarC.e = false;
                    nslVarC.f.removeCallbacksAndMessages(null);
                    defpackage.mpj.b().j(nslVarC);
                    defpackage.mpj.b().h.k(nslVarC);
                    defpackage.nye nyeVarB = defpackage.nye.b();
                    defpackage.eqt eqtVar = nslVarC.g;
                    if (eqtVar != null) {
                        nyeVarB.b.k(eqtVar);
                    }
                    nslVarC.g = null;
                    nslVarC.d();
                }
                mpo mpoVar = nslVarC.c;
                if (mpoVar != null) {
                    mpoVar.b();
                    nslVarC.c = null;
                }
            }
        }
    }
}
