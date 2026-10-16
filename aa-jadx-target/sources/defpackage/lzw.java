package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lzw implements defpackage.lzq, lzz, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NavClientManager");
    public android.content.Context c;
    public maa d;
    public com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig e;
    public final defpackage.eqp g;
    public defpackage.rpb h;
    public final defpackage.lwz i;
    private final defpackage.lhn j;
    private final defpackage.eqs l;
    private final defpackage.eqp m;
    private final defpackage.yfd n;
    private final ajnd o;
    private final ajnd p;
    public boolean b = false;
    private final defpackage.lzy k = new defpackage.lzy();
    public final defpackage.eqs f = new defpackage.eqs();

    public lzw(defpackage.lwz lwzVar, defpackage.lhn lhnVar) {
        defpackage.eqs eqsVar = new defpackage.eqs(null);
        this.l = eqsVar;
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.g = new defpackage.eqs(ygwVar);
        this.m = defpackage.ebo.g(eqsVar, new defpackage.lra(this, 17));
        this.n = new defpackage.yfd(15);
        this.p = new ajnd(this, (byte[]) null);
        this.o = new ajnd(this, (byte[]) null);
        this.i = lwzVar;
        this.j = lhnVar;
    }

    private static void p(defpackage.zbd zbdVar) {
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NAVIGATION_CLIENT_MANAGER, zbdVar).l());
    }

    @Override // defpackage.lzq
    public final defpackage.eqp a() {
        return this.f;
    }

    @Override // defpackage.lzq
    public final defpackage.eqp b() {
        return this.m;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        if (this.b || !defpackage.acvt.m()) {
            defpackage.ysr.aX(this.b);
            m();
            defpackage.mni.a().d(defpackage.mnh.o);
            this.b = false;
            this.c = null;
            this.j.d();
        }
    }

    @Override // defpackage.lzq
    public final lzo e() {
        return this.k.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo, rlo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4530)).u("start()");
        defpackage.ysr.aX(!this.b);
        this.b = true;
        this.c = defpackage.mkp.a.c;
        this.j.eQ();
        if (defpackage.kit.b().r()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4514)).u("asyncLoadInstrumentClusterConfig");
            try {
                defpackage.mkp.a.f();
                defpackage.rpb rpbVarE = defpackage.ooa.e(defpackage.kit.b().e());
                this.h = rpbVarE;
                if (rpbVarE != null) {
                    rpbVarE.a();
                    ((defpackage.yqj) yqmVar.l().ai(4518)).u("Registering for nav status listener");
                    defpackage.rpb rpbVar = this.h;
                    ajnd ajndVar = this.o;
                    if (rpbVar.h == null) {
                        rpbVar.h = new defpackage.qyh(rpbVar);
                        try {
                            rpbVar.a.t(rpbVar.h);
                        } catch (android.os.RemoteException e) {
                            defpackage.oml.I(e);
                        } catch (java.lang.IllegalStateException e2) {
                            defpackage.oml.G(e2);
                        }
                    }
                    rpbVar.i = ajndVar;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(4515)).u("Unable to get CarNavigationStatusManager to retrieve HU config");
                    l();
                }
            } catch (defpackage.qst e3) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e3)).ai((char) 4516)).u("Error while getting HU navigation status configuration");
                l();
            } catch (defpackage.qsu unused) {
                l();
            }
        } else {
            l();
        }
        defpackage.mni.a().b(defpackage.mnh.o, this);
    }

    @Override // defpackage.lzq
    public final com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig f() {
        return this.e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lzq
    public final void g(android.content.ComponentName componentName) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4527)).y("maybeConnectToNavComponent(%s)", componentName);
        k(componentName);
        if (this.d == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4528)).y("No corresponding nav client source for nav package: %s", componentName.getPackageName());
            return;
        }
        if (defpackage.acyc.aP() || !this.d.a()) {
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 4532)).y("storeDefaultIfChanging(%s)", componentName);
        defpackage.lhh lhhVarA = defpackage.lhc.a();
        defpackage.mqg mqgVar = defpackage.mqg.NAVIGATION;
        android.content.ComponentName componentNameA = lhhVarA.a(mqgVar);
        if (componentNameA == null || !componentNameA.getPackageName().equals(componentName.getPackageName())) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.a())).filter(new defpackage.lyk(4));
            int i = defpackage.ygw.d;
            j$.util.stream.Collector collector = defpackage.yds.a;
            defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(collector);
            if (ygwVar.size() > 1) {
                defpackage.ygw ygwVar2 = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVar).map(new defpackage.lvg(7)).filter(new defpackage.lpa(componentName, 11)).collect(collector);
                if (ygwVar2.isEmpty()) {
                    return;
                }
                defpackage.lhc.a().f(mqgVar, (android.content.ComponentName) ygwVar2.get(0));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        defpackage.ygw ygwVarO;
        if (this.e == null) {
            printWriter.println("No Cluster config.");
        } else {
            printWriter.printf("Cluster Config: ", new java.lang.Object[0]);
            printWriter.printf("Image Size: %dx%d ", java.lang.Integer.valueOf(this.e.b), java.lang.Integer.valueOf(this.e.c));
            printWriter.printf("Depth: %d\n", java.lang.Integer.valueOf(this.e.d));
        }
        if (i()) {
            lzo lzoVarE = e();
            printWriter.printf("Client: %s\n", lzoVarE.a());
            printWriter.printf("Navigation Status: %d\n", java.lang.Integer.valueOf(lzoVarE.c().a));
            com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEventD = lzoVarE.d();
            printWriter.printf("Turn Event: Type=%d, Side=%d, Angle=%d, Number=%d, Unit=%d", java.lang.Integer.valueOf(turnEventD.a), java.lang.Integer.valueOf(turnEventD.c), java.lang.Integer.valueOf(turnEventD.d), java.lang.Integer.valueOf(turnEventD.e), java.lang.Integer.valueOf(turnEventD.j));
            printWriter.printf(", Road: %s, Seconds=%d, Distance=%d m, Display=%d", turnEventD.q, java.lang.Integer.valueOf(turnEventD.h), java.lang.Integer.valueOf(turnEventD.g), java.lang.Integer.valueOf(turnEventD.i));
            printWriter.printf("\nManeuver: Type=%d\n", java.lang.Integer.valueOf(turnEventD.k));
        } else {
            printWriter.println("Not connected to any client.");
            printWriter.printf("Last connection: %s\n", this.d);
        }
        synchronized (this) {
            ygwVarO = defpackage.ygw.o(this.n);
        }
        if (ygwVarO.isEmpty()) {
            return;
        }
        mnl mnlVarL = mnq.l();
        mnm mnmVarA = mnn.a();
        mnmVarA.a = "Component";
        mnmVarA.b();
        mnmVarA.c('|');
        mnmVarA.d(true);
        mnlVarL.b(mnmVarA.a());
        mnm mnmVarA2 = mnn.a();
        mnmVarA2.a = "Action";
        mnmVarA2.b();
        mnmVarA2.c('|');
        mnmVarA2.d(true);
        mnlVarL.b(mnmVarA2.a());
        mnm mnmVarA3 = mnn.a();
        mnmVarA3.a = "Time";
        mnmVarA3.b();
        mnmVarA3.c('|');
        mnmVarA3.d(true);
        mnlVarL.b(mnmVarA3.a());
        int size = ygwVarO.size();
        for (int i = 0; i < size; i++) {
            defpackage.lzv lzvVar = (defpackage.lzv) ygwVarO.get(i);
            mnlVarL.c(new java.lang.Object[]{lzvVar.a, lzvVar.b, lzvVar.c});
        }
        mnlVarL.a().m(printWriter);
    }

    @Override // defpackage.lzq
    public final boolean i() {
        return this.k.c();
    }

    public final synchronized void j(defpackage.lzv lzvVar) {
        this.n.add(lzvVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, lzz] */
    final void k(android.content.ComponentName componentName) throws wfo {
        android.content.ComponentName componentName2;
        defpackage.mad madVar;
        android.content.ComponentName componentName3;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4519)).y("connectToComponent(%s)", componentName);
        j(defpackage.lzv.a(componentName, "Starting connection attempt"));
        java.lang.String packageName = componentName.getPackageName();
        defpackage.ygw ygwVar = defpackage.maw.a;
        java.util.Iterator<android.content.pm.ResolveInfo> it = defpackage.mkp.a.c.getPackageManager().queryIntentServices(new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.car.category.NAVIGATION_PROVIDER"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                componentName2 = null;
                break;
            }
            android.content.pm.ResolveInfo next = it.next();
            if (next.serviceInfo.packageName.equals(packageName)) {
                componentName2 = new android.content.ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                break;
            }
        }
        if (componentName2 == null) {
            componentName3 = componentName;
            madVar = null;
        } else {
            ?? r10 = this.p.a;
            defpackage.lzw lzwVar = (defpackage.lzw) r10;
            componentName3 = componentName;
            madVar = new defpackage.mad(lzwVar.c, lzwVar.i, componentName3, componentName2, r10);
        }
        maa maaVar = this.d;
        if (maaVar != null && madVar != null) {
            if (j$.util.Objects.equals(((defpackage.mad) maaVar).b, madVar.b)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4522)).y("Trying to connect to same nav component. Ignoring: %s", componentName3.getShortClassName());
                j(defpackage.lzv.a(componentName3, "Already connected, nothing to do"));
                return;
            }
        }
        m();
        if (madVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4521)).y("No Navigation Client Source for %s", componentName3);
            p(defpackage.zbd.pB);
            j(defpackage.lzv.a(componentName3, "No NavigationClientSource"));
        } else if (!madVar.a()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 4520)).y("Failed binding to component: %s", componentName3);
            p(defpackage.zbd.pC);
            j(defpackage.lzv.a(componentName3, "Unable to bind"));
        } else {
            defpackage.eqs eqsVar = this.f;
            ajot ajotVar = new ajot((char[]) null);
            ajotVar.k(madVar.b);
            ajotVar.a = 2;
            eqsVar.m(ajotVar.j());
            this.d = madVar;
        }
    }

    public final void l() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4523)).u("NavigationClientManagerImpl connectToDefaultNavClientSource");
        android.content.ComponentName componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true);
        if (componentNameA != null) {
            k(componentNameA);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4524)).u("No navigation component to connect to.");
            p(defpackage.zbd.pA);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    final void m() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4525)).u("disconnectFromCurrentNavProvider()");
        maa maaVar = this.d;
        if (maaVar == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4526)).u("Trying to unbind a null connection. Ignoring");
            return;
        }
        o(null);
        maa maaVar2 = this.d;
        synchronized (((defpackage.mad) maaVar2).d) {
            ((defpackage.mad) maaVar2).c(((defpackage.mad) maaVar2).e);
        }
        android.content.ComponentName componentName = ((defpackage.mad) maaVar).b;
        this.d = null;
        defpackage.eqs eqsVar = this.f;
        ajot ajotVar = new ajot((char[]) null);
        ajotVar.k(componentName);
        ajotVar.a = 1;
        eqsVar.m(ajotVar.j());
        if (defpackage.aczg.c()) {
            mai.c().d();
        } else {
            defpackage.lxy.o().h(defpackage.zaw.NAV_NOTIFICATION_HERO);
            defpackage.lxy.o().h(defpackage.zaw.NAV_NOTIFICATION_NORMAL);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void n(android.content.ComponentName componentName, java.lang.String str) throws wfo {
        defpackage.wfp.c();
        j(defpackage.lzv.a(componentName, str));
    }

    public final void o(lzo lzoVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4529)).y("setNavigationClient(%s)", lzoVar);
        this.k.b(lzoVar);
        this.l.m(lzoVar);
    }
}
