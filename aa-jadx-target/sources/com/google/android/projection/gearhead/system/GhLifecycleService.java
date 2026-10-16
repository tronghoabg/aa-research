package com.google.android.projection.gearhead.system;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GhLifecycleService extends defpackage.rbw {
    private static final defpackage.yqm g = defpackage.yqm.c("GH.GhLifecycleService");
    private boolean h;
    private boolean i = false;

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:6:0x0033  */
    @Override // defpackage.rbw
    public final void c(defpackage.qsh qshVar) throws afbj, wfo, defpackage.qst {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 10227)).u("onPostProjectionStart()");
        if (defpackage.acyc.a.fF().aU()) {
            this.h = true;
            ((defpackage.mpp) defpackage.mkp.a.i(defpackage.mpp.class)).e(qshVar);
        } else {
            defpackage.yqm yqmVar = defpackage.nte.a;
            if (((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().D()) {
                this.h = true;
                ((defpackage.mpp) defpackage.mkp.a.i(defpackage.mpp.class)).e(qshVar);
            }
        }
        if (defpackage.actb.a.fF().q()) {
            defpackage.ksn.a.a().f();
            if (defpackage.leo.a.a().g(qshVar)) {
                this.i = true;
                defpackage.oja ojaVarA = defpackage.oja.a.a();
                ((defpackage.yqj) defpackage.oja.c.f()).u("onProjectionStart");
                ojaVarA.b(qshVar);
            }
        }
        ((defpackage.msh) defpackage.mkp.a.i(defpackage.msh.class)).e(qshVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void d() throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 10230)).u("onProjectionEnd()");
        defpackage.luq.b().b();
        if (this.h) {
            defpackage.mpr.e().b();
            defpackage.kjx kjxVarF = defpackage.kjx.f();
            ((defpackage.yqj) defpackage.kjx.c.f()).u("onLifecycleEnd");
            if (!kjxVarF.f) {
                kjxVarF.m();
            }
            defpackage.npu.a.a().d.clear();
            this.h = false;
        }
        if (defpackage.actb.s()) {
            if (this.i) {
                defpackage.oja ojaVarA = defpackage.oja.a();
                ((defpackage.yqj) defpackage.oja.c.f()).u("onProjectionEnd");
                ojaVarA.e();
                this.i = false;
            }
            defpackage.ksn.b().e();
        }
        defpackage.leo leoVarA = defpackage.leo.a();
        leoVarA.d = null;
        leoVarA.e = null;
        defpackage.msh.a().b();
        defpackage.nte nteVarC = defpackage.nte.c();
        defpackage.wfp.c();
        if (nteVarC.i != 2) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.nte.a.h()).ai((char) 5416)).u("DisplayLayoutManager stopped when not initialized, ignoring");
            return;
        }
        for (defpackage.ntf ntfVar : nteVarC.d) {
            defpackage.wfp.c();
            defpackage.sax saxVar = ntfVar.c;
            defpackage.shg shgVar = ntfVar.e;
            shgVar.getClass();
            defpackage.ret retVar = saxVar.h;
            ((defpackage.lam) retVar.b).F(new defpackage.rdn(shgVar, 4));
            ntfVar.e = null;
            defpackage.shg shgVar2 = ntfVar.d;
            shgVar2.getClass();
            ((defpackage.lam) retVar.c).F(new defpackage.rdn(shgVar2, 7));
            ntfVar.d = null;
        }
        if (nteVarC.e) {
            ((defpackage.mqf) defpackage.mkp.a.i(defpackage.mqf.class)).d();
        }
        defpackage.mni.a().d(defpackage.mnh.k);
        nteVarC.i = 3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void f() throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 10231)).u("onProjectionReady(). Notifying CarClientManager that projection is ready");
        defpackage.kit.b().g();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void g(android.os.Bundle bundle, final defpackage.qsh qshVar) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = g;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10232)).y("onProjectionStart(config:%s)", bundle);
        defpackage.yqm yqmVar2 = defpackage.nte.a;
        final defpackage.nte nteVar = (defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class);
        defpackage.kje kjeVar = new defpackage.kje() { // from class: xgd
            /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v15, types: [afak, java.lang.Object] */
            @Override // defpackage.kje
            public final void a() throws wfo, defpackage.qst {
                int i;
                boolean zF;
                boolean z;
                boolean z2;
                com.google.android.projection.gearhead.system.GhLifecycleService ghLifecycleService = this.a;
                final defpackage.nte nteVar2 = nteVar;
                defpackage.qsh qshVar2 = qshVar;
                int i2 = 0;
                try {
                    android.content.Context context = defpackage.mkp.a.c;
                    int iIntValue = ((java.lang.Integer) defpackage.kgu.c(new defpackage.kjg(ghLifecycleService, 8), "GH.GhLifecycleService", defpackage.zbe.LIFECYCLE_SERVICE, defpackage.zbd.oW, false, "Car no longer connected.", new java.lang.Object[0])).intValue();
                    synchronized (defpackage.lfy.b) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lfy.a.f()).ai(3891)).w("forDpi: Creating new app icon cache with DPI=%d", iIntValue);
                        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
                        configuration.densityDpi = iIntValue;
                        defpackage.lfy.c = new defpackage.lfy(new defpackage.lfz(context.createConfigurationContext(configuration)));
                    }
                    defpackage.rkp rkpVar = (defpackage.rkp) ghLifecycleService.f.c("car_display_service");
                    defpackage.xgc xgcVar = new defpackage.xgc(ghLifecycleService, 1);
                    defpackage.xgc xgcVar2 = new defpackage.xgc(ghLifecycleService, i2);
                    defpackage.leo leoVarA = defpackage.leo.a.a();
                    defpackage.kwv kwvVar = ghLifecycleService.f;
                    kwvVar.getClass();
                    defpackage.actb actbVar = defpackage.actb.a;
                    if (actbVar.fF().h()) {
                        try {
                            if (actbVar.fF().c()) {
                                java.lang.Boolean bool = leoVarA.e;
                                if (bool != null) {
                                    zF = bool.booleanValue();
                                } else {
                                    defpackage.leo.c.l().u("Setting car control info from getHasPersistentCarControls");
                                    try {
                                        java.lang.Object objC = kwvVar.c("car_control_service");
                                        leoVarA.b(objC instanceof defpackage.rjf ? (defpackage.rjf) objC : null);
                                    } catch (defpackage.qsu unused) {
                                        leoVarA.b(null);
                                    } catch (java.lang.Throwable unused2) {
                                    }
                                    zF = defpackage.afga.f(leoVarA.e, java.lang.Boolean.TRUE);
                                }
                                z = zF;
                            }
                            z = false;
                        } catch (defpackage.qsu e) {
                            e = e;
                            i = 0;
                            defpackage.rox.p("GH.GhLifecycleService", e, "not able to initialize DisplayLayout", new java.lang.Object[i]);
                            return;
                        }
                    } else {
                        z = false;
                    }
                    defpackage.wfp.c();
                    nteVar2.g = z;
                    int i3 = 2;
                    if (nteVar2.i == 2) {
                        return;
                    }
                    nteVar2.f = false;
                    java.util.Map map = nteVar2.b;
                    map.clear();
                    nteVar2.c = null;
                    java.util.List list = nteVar2.d;
                    list.clear();
                    defpackage.mkp.a.f();
                    com.google.android.gms.car.CarInfo carInfoC = ((defpackage.rbu) qshVar2).a.c();
                    carInfoC.getClass();
                    defpackage.ygw ygwVarA = rkpVar.a();
                    int size = ygwVarA.size();
                    int i4 = 0;
                    while (i4 < size) {
                        com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) ygwVarA.get(i4);
                        java.util.Map map2 = map;
                        com.google.android.gms.car.CarInfo carInfo = carInfoC;
                        com.google.android.gms.car.display.CarDisplayId carDisplayId = carDisplay.a;
                        com.google.android.gms.car.display.CarDisplayId carDisplayId2 = com.google.android.gms.car.display.CarDisplayId.a;
                        if (carDisplayId2.equals(carDisplayId)) {
                            defpackage.ntd ntdVar = nteVar2.h;
                            if (ntdVar != null) {
                                if (((defpackage.msg) ntdVar).e) {
                                    z2 = true;
                                } else {
                                    ((defpackage.msg) ntdVar).a(carDisplay);
                                    z2 = ((defpackage.msg) ntdVar).e;
                                }
                                nteVar2.f = z2;
                            }
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.nte.a.f()).ai((char) 5412)).y("Initial compat mode: %b", java.lang.Boolean.valueOf(nteVar2.f));
                        }
                        defpackage.rke rkeVarA = defpackage.rke.a(carDisplay.b);
                        java.lang.Object objA = xgcVar.a(carDisplayId);
                        defpackage.row rowVarD = xgcVar2.a.f.d(carDisplayId.b).d();
                        int i5 = i4;
                        int i6 = size;
                        defpackage.sax saxVar = (defpackage.sax) objA;
                        java.util.List list2 = list;
                        ghLifecycleService = ghLifecycleService;
                        defpackage.xgc xgcVar3 = xgcVar2;
                        int i7 = 2;
                        defpackage.ntb ntbVar = new defpackage.ntb(ghLifecycleService, carInfo, rowVarD, saxVar, carDisplayId, rkeVarA, z, nteVar2.f, qshVar2);
                        defpackage.sax saxVar2 = ntbVar.s;
                        ntbVar.y(saxVar2.d(), saxVar2.c());
                        map2.put(carDisplayId, ntbVar);
                        if (carDisplayId2.equals(carDisplayId)) {
                            nteVar2.c = ntbVar.m();
                        }
                        defpackage.ntf ntfVar = new defpackage.ntf(ntbVar, (defpackage.sax) xgcVar.a(carDisplayId));
                        defpackage.wfp.c();
                        ntfVar.e = new defpackage.shg(ntfVar, qshVar2, null);
                        defpackage.sax saxVar3 = ntfVar.c;
                        defpackage.shg shgVar = ntfVar.e;
                        defpackage.ret retVar = saxVar3.h;
                        ?? r5 = retVar.f;
                        ((defpackage.rps) r5.a()).g(new defpackage.req(retVar, shgVar, i7));
                        ntfVar.d = new defpackage.shg(ntfVar, qshVar2, null);
                        ((defpackage.rps) r5.a()).g(new defpackage.req(retVar, ntfVar.d, 0));
                        list2.add(ntfVar);
                        i4 = i5 + 1;
                        carInfoC = carInfo;
                        map = map2;
                        i3 = 2;
                        list = list2;
                        ygwVarA = ygwVarA;
                        xgcVar2 = xgcVar3;
                        size = i6;
                    }
                    com.google.android.gms.car.CarInfo carInfo2 = carInfoC;
                    nteVar2.i = i3;
                    ((defpackage.mqf) defpackage.mkp.a.i(defpackage.mqf.class)).a();
                    nteVar2.e = true;
                    int i8 = defpackage.mni.a;
                    ((defpackage.mni) defpackage.mkp.a.i(defpackage.mni.class)).b(defpackage.mnh.k, new defpackage.mnj() { // from class: ntc
                        @Override // defpackage.mnj
                        public final void h(java.io.PrintWriter printWriter) {
                            for (defpackage.ntb ntbVar2 : nteVar2.b.values()) {
                                printWriter.println("------- " + java.lang.String.valueOf(ntbVar2.o) + " -------");
                                printWriter.println("Type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ntbVar2.q))));
                                printWriter.println("LayoutInfo: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ntbVar2.m))));
                                printWriter.println("carDisplay: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ntbVar2.t))));
                                printWriter.println("regionInfoMap: ".concat(ntbVar2.g.toString()));
                                printWriter.println("carActivitySystemLayoutTypesByRegion: ".concat(ntbVar2.h.toString()));
                                printWriter.println("regionToGroupMap: ".concat(ntbVar2.i.toString()));
                                printWriter.println("regionGroups: ".concat(ntbVar2.j.toString()));
                                printWriter.println("regionsCastingInsetsOnType: ".concat(ntbVar2.k.toString()));
                                printWriter.println("chromeWindows: ".concat(ntbVar2.l.toString()));
                            }
                        }
                    });
                    defpackage.acyc acycVar = defpackage.acyc.a;
                    if (acycVar.fF().aq()) {
                        defpackage.yqm yqmVar3 = defpackage.kiv.a;
                        ((defpackage.kiv) defpackage.mkp.a.i(defpackage.kiv.class)).d(carInfo2, defpackage.nte.class.getName());
                    }
                    if (nteVar2.c != null) {
                        defpackage.leo.a.a();
                        nteVar2.b().D();
                    }
                    if (acycVar.fF().ar()) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.nte.a.f()).ai((char) 5411)).u("Jimothy mode is enabled!");
                    }
                } catch (defpackage.qsu e2) {
                    e = e2;
                    i = 0;
                }
            }
        };
        defpackage.zbe zbeVar = defpackage.zbe.LIFECYCLE_SERVICE;
        defpackage.zbd zbdVar = defpackage.zbd.oR;
        int i = 0;
        int i2 = 1;
        defpackage.kgu.c(new defpackage.kjg(kjeVar, i2), "GH.GhLifecycleService", zbeVar, zbdVar, false, "not able to initialize DisplayLayout", new java.lang.Object[0]);
        defpackage.kgu.c(new defpackage.kjg(new defpackage.kje() { // from class: xga
            /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.kje
            public final void a() throws wfo, defpackage.qst {
                try {
                    defpackage.kwv kwvVar = this.a.f;
                    kwvVar.getClass();
                    defpackage.rkp rkpVar = (defpackage.rkp) kwvVar.c("car_display_service");
                    defpackage.yqm yqmVar3 = defpackage.mpy.a;
                    defpackage.mpy mpyVar = (defpackage.mpy) defpackage.mkp.a.i(defpackage.mpy.class);
                    defpackage.wfp.c();
                    defpackage.ygw ygwVarA = rkpVar.a();
                    defpackage.yha yhaVar = new defpackage.yha(4);
                    int size = ygwVarA.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) ygwVarA.get(i3);
                        if (defpackage.rke.c.equals(defpackage.rke.a(carDisplay.b))) {
                            com.google.android.gms.car.display.CarDisplayId carDisplayId = carDisplay.a;
                            int i4 = carDisplay.f;
                            yhaVar.f(carDisplayId, i4 >= defpackage.rkf.values().length ? defpackage.rkf.a : defpackage.rkf.values()[i4]);
                        }
                    }
                    mpyVar.f = yhaVar.d(true);
                    mpyVar.g = true;
                } catch (defpackage.qsu e) {
                    defpackage.rox.p("GH.GhLifecycleService", e, "not able to initialize AuxiliaryDisplayConfiguration", new java.lang.Object[0]);
                }
            }
        }, i2), "GH.GhLifecycleService", zbeVar, zbdVar, false, "not able to initialize AuxiliaryDisplayConfiguration", new java.lang.Object[0]);
        defpackage.lee leeVarA = defpackage.lee.a.a();
        leeVarA.d = leeVarA.d(qshVar);
        if (defpackage.acyc.a.fF().Y()) {
            ((defpackage.lhd) defpackage.mkp.a.i(defpackage.lhd.class)).f();
        }
        defpackage.ntb ntbVarB = nteVar.b();
        bundle.putBoolean("use_car_activity_animations", true);
        defpackage.row rowVar = (defpackage.row) defpackage.kgu.c(new defpackage.xgb(this, ntbVarB.o, i), "GH.GhLifecycleService", zbeVar, zbdVar, false, "not able to initialize DisplayLayout", new java.lang.Object[0]);
        rowVar.getClass();
        bundle.putBoolean("use_sticky_window_focus", rowVar.b());
        defpackage.nta ntaVar = defpackage.nta.b;
        if (ntbVarB.G(ntaVar)) {
            defpackage.qts qtsVarN = ntbVarB.n(ntaVar);
            qtsVarN.getClass();
            bundle.putInt("assistant_activity_z", qtsVarN.a().i);
        }
        defpackage.nta ntaVar2 = defpackage.nta.a;
        bundle.putParcelable("content_bounds", ntbVarB.h(ntaVar2));
        bundle.putParcelable("content_insets", ntbVarB.i(ntaVar2));
        defpackage.wfp.c();
        bundle.putByteArray("activity_layout_config", defpackage.sqs.o(defpackage.mps.b(qshVar, nteVar.e())));
        bundle.putInt("pillar_width", 0);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10233)).y("onProjectionStart updated config:%s: ", bundle);
        byte[] byteArray = bundle.getByteArray("activity_layout_config");
        ((defpackage.yqj) yqmVar.l().ai(10234)).M("onProjectionStart %s:%s", "activity_layout_config", byteArray != null ? (com.google.android.gms.car.lifecycle.CarActivityLayoutConfig) defpackage.sqs.l(byteArray, com.google.android.gms.car.lifecycle.CarActivityLayoutConfig.CREATOR) : null);
        bundle.putBundle("dynamic_configuration", defpackage.mps.d(qshVar));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void h() throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 10235)).u("onProjectionTearDown()");
        defpackage.kit.b().k();
    }

    @Override // defpackage.rbw
    public final boolean i() {
        if (defpackage.acyc.aS()) {
            return this.d == null && !this.e;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void j(defpackage.qsh qshVar, android.os.Bundle bundle, defpackage.ntl ntlVar) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = g;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10228)).y("onPreflightStart(params:%s). Running preflight checks", bundle);
        bundle.setClassLoader(getClassLoader());
        defpackage.ysr.bk(bundle.containsKey("connection_type"), "Missing connection-type");
        defpackage.ysr.bk(bundle.containsKey("legacy_frx_ran"), "Missing legacyFrxRan");
        defpackage.ysr.bk(bundle.containsKey("car_info"), "Missing CarInfoInternal");
        boolean z = bundle.getBoolean("legacy_frx_ran");
        int i = bundle.getInt("connection_type");
        ((defpackage.yqj) yqmVar.l().ai(10229)).O("Preflight start, legacyFrxRan: %b, connectionType: %d", z, i);
        ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).c(qshVar, ntlVar, z, i, (com.google.android.gms.carsetup.CarInfoInternal) bundle.getParcelable("car_info"));
    }

    public final defpackage.sax k(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qsu, defpackage.qst {
        ((defpackage.yqj) g.l().ai((char) 10226)).y("Get CarWindowManager for %s", carDisplayId);
        defpackage.kwv kwvVar = this.f;
        kwvVar.getClass();
        return ((defpackage.qsh) kwvVar.a).a().h(new com.google.android.gms.car.display.CarDisplayId(carDisplayId.b));
    }
}
