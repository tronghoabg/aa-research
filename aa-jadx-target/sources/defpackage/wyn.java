package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wyn implements defpackage.lhs {
    final /* synthetic */ defpackage.lht a;

    public wyn(defpackage.lht lhtVar) {
        this.a = lhtVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhs
    public final /* synthetic */ void a() throws wfo {
        defpackage.wfp.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [lht, mph] */
    @Override // defpackage.lhs
    public final void d(boolean z, boolean z2) throws wfo {
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.wyv.m.l().ai(9919);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("onCarConnectedUpdate, isPhysicalCarConnected: %s, isPhysicalCarConnectedStateChanged: %s", new defpackage.zkf(zkeVar, boolValueOf), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z2)));
        if (!z) {
            if (z2 && defpackage.jrj.a()) {
                ((defpackage.lin) this.a).w(true);
                return;
            } else {
                ((defpackage.lin) this.a).w(false);
                return;
            }
        }
        defpackage.tgg tggVar = defpackage.tgg.a;
        defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START;
        tggVar.b(tgfVar);
        ?? r0 = this.a;
        defpackage.yqm yqmVar = defpackage.lin.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3946)).u("start()");
        defpackage.wfp.c();
        defpackage.lin linVar = (defpackage.lin) r0;
        defpackage.ysr.bj(linVar.l == 3);
        if (!linVar.e) {
            linVar.f = true;
            java.util.List list = linVar.i;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((defpackage.lhs) it.next()).f();
            }
            defpackage.mdp.d().m();
            ((defpackage.yqj) yqmVar.l().ai((char) 3949)).u("Starting lifetime services");
            defpackage.ygw ygwVar = defpackage.lim.e;
            int i = ((defpackage.ymx) ygwVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.lii liiVar = (defpackage.lii) ygwVar.get(i2);
                if (!defpackage.acvt.m() || !((defpackage.lhn) liiVar.a.a()).getClass().equals(defpackage.luq.a().getClass())) {
                    liiVar.a(null);
                }
            }
            defpackage.ygw ygwVar2 = defpackage.lim.b;
            int i3 = ((defpackage.ymx) ygwVar2).c;
            for (int i4 = 0; i4 < i3; i4++) {
                ((defpackage.lii) ygwVar2.get(i4)).a(null);
            }
            defpackage.yqm yqmVar2 = defpackage.tgi.a;
            defpackage.vlw.a().h();
            java.util.List listK = linVar.k();
            ((defpackage.yqj) yqmVar.l().ai((char) 3938)).y("Binding to lifetime service: %s", listK);
            defpackage.you youVarListIterator = ((defpackage.ygw) listK).listIterator(0);
            while (youVarListIterator.hasNext()) {
                java.lang.Class cls = (java.lang.Class) youVarListIterator.next();
                android.content.Context context = linVar.c;
                if (!context.bindService(new android.content.Intent(context, (java.lang.Class<?>) cls), linVar.k, 1)) {
                    defpackage.rox.o("GH.LifetimeManager", "Could not bind to lifetime service", new java.lang.Object[0]);
                }
            }
            defpackage.tgf tgfVar2 = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_SYSTEM_LIFECYCLE_MANAGER;
            tggVar.b(tgfVar2);
            ((defpackage.oyl) defpackage.mkp.a.i(defpackage.oyl.class)).a();
            tggVar.d(tgfVar2, 1);
            final defpackage.wyv wyvVar = (defpackage.wyv) r0;
            defpackage.kgu.d(new defpackage.kje() { // from class: wym
                /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
                /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
                /* JADX WARN: Code duplicated, block: B:29:0x0119  */
                /* JADX WARN: Code duplicated, block: B:67:0x02fc  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.kje
                public final void a() throws defpackage.qst, rlo, lhz {
                    boolean z3;
                    int[] iArrO;
                    boolean z4;
                    kxt kxpVar;
                    java.lang.String str;
                    defpackage.mkp.a.f();
                    com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(defpackage.kit.b().e());
                    carInfoD.getClass();
                    try {
                        defpackage.mkp.a.g();
                        if (defpackage.oml.t(defpackage.kit.b().e()) != null) {
                            z3 = true;
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.wyv.m.f()).ai(9926)).u("No radioManager");
                            z3 = false;
                        }
                    } catch (defpackage.qst | defpackage.qsu unused) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.wyv.m.f()).ai((char) 9927)).u("Radio not supported");
                    }
                    defpackage.wyv wyvVar2 = wyvVar;
                    wyvVar2.z(z3);
                    if (defpackage.leo.a().d()) {
                        wyvVar2.y(true);
                    }
                    if (defpackage.acsv.g()) {
                        wyvVar2.p = (com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager) wyvVar2.o.a(wyvVar2.c);
                        com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager headUnitUpdateManager = wyvVar2.p;
                        defpackage.ygw ygwVarA = defpackage.tht.a(new defpackage.khy(20), defpackage.acsv.e());
                        android.content.SharedPreferences sharedPreferences = headUnitUpdateManager.b.getSharedPreferences("HeadUnitManager", 0);
                        java.lang.String str2 = "HEAD_UNIT_MANAGER_" + carInfoD.a + "_" + carInfoD.b + "_" + carInfoD.c + "_" + carInfoD.d;
                        defpackage.you youVarListIterator2 = ygwVarA.listIterator(0);
                        youVarListIterator2.getClass();
                        while (true) {
                            if (youVarListIterator2.hasNext()) {
                                E next = youVarListIterator2.next();
                                next.getClass();
                                defpackage.lgq lgqVar = (defpackage.lgq) next;
                                if (defpackage.kjl.c(lgqVar.a, carInfoD)) {
                                    sharedPreferences.getClass();
                                    headUnitUpdateManager.a(carInfoD, sharedPreferences, str2, lgqVar.b);
                                    break;
                                }
                            } else {
                                defpackage.you youVarListIterator3 = headUnitUpdateManager.d.listIterator(0);
                                youVarListIterator3.getClass();
                                while (true) {
                                    if (!youVarListIterator3.hasNext()) {
                                        defpackage.yqm yqmVar3 = com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager.a;
                                        yqmVar3.l().u("Head unit does not have known software update");
                                        if (!sharedPreferences.contains(str2)) {
                                            break;
                                        }
                                        ((defpackage.yqj) yqmVar3.f()).u("Head unit successfully updated");
                                        defpackage.rqt rqtVar = headUnitUpdateManager.c;
                                        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 41, defpackage.zaa.HEAD_UNIT_UPDATED);
                                        rroVarH.f(carInfoD.a());
                                        rqtVar.c(rroVarH.l());
                                        sharedPreferences.edit().remove(str2).apply();
                                        break;
                                    }
                                    E next2 = youVarListIterator3.next();
                                    next2.getClass();
                                    defpackage.you youVarListIterator4 = ((defpackage.ygw) ((defpackage.htw) next2).a).listIterator(0);
                                    youVarListIterator4.getClass();
                                    do {
                                        if (!youVarListIterator4.hasNext()) {
                                            str = null;
                                            break;
                                        }
                                        E next3 = youVarListIterator4.next();
                                        next3.getClass();
                                        lgr lgrVar = (lgr) next3;
                                        if (defpackage.kjl.c(lgrVar.a, carInfoD)) {
                                            java.util.List listL = afzh.L(lgrVar.b, new java.lang.String[]{":"}, 0);
                                            if (listL.size() != 2) {
                                                throw new java.lang.IllegalStateException("Check failed.");
                                            }
                                            int i5 = java.lang.Integer.parseInt((java.lang.String) listL.get(0));
                                            int i6 = java.lang.Integer.parseInt((java.lang.String) listL.get(1));
                                            java.lang.String str3 = carInfoD.l;
                                            str3.getClass();
                                            java.util.List listL2 = afzh.L(str3, new java.lang.String[]{"."}, 0);
                                            if (listL2.size() == i5 && java.lang.Integer.parseInt((java.lang.String) listL2.get(i5 - 1)) < i6) {
                                                str = lgrVar.c;
                                            } else {
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                    } while (str == null);
                                    if (str != null) {
                                        sharedPreferences.getClass();
                                        headUnitUpdateManager.a(carInfoD, sharedPreferences, str2, str);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ((defpackage.yqj) defpackage.wyv.m.l().ai(9938)).M("Connected to: %s/%s", carInfoD.a, carInfoD.b);
                    defpackage.juv.l().d(carInfoD);
                    defpackage.mpk mpkVarA = defpackage.mpk.a();
                    mpkVarA.f(new defpackage.mou());
                    mpkVarA.f(new defpackage.lnm());
                    mpkVarA.f(new defpackage.mdd());
                    mpkVarA.g(new defpackage.mov());
                    mpkVarA.g(defpackage.nrx.a);
                    mpkVarA.g(defpackage.nry.a);
                    if (defpackage.lee.a().c(defpackage.kit.b().e())) {
                        mpkVarA.g(defpackage.nrv.a);
                    }
                    mpkVarA.h(new defpackage.lnn());
                    mpkVarA.g(defpackage.nru.a);
                    if (defpackage.lzm.c() && defpackage.acqh.o()) {
                        int i7 = nrw.a;
                        mpkVarA.g((nrw) defpackage.mkp.a.b(nrw.class, new defpackage.mbf(14)));
                        mpkVarA.g(new mdj());
                    }
                    mpkVarA.h(new jzc());
                    if (defpackage.acrf.u()) {
                        mpkVarA.h(new mfb());
                    }
                    mpkVarA.h(new defpackage.jze());
                    mpkVarA.h(new defpackage.jzd());
                    mpkVarA.h(new defpackage.lyp());
                    defpackage.ygw ygwVar3 = defpackage.wyu.c;
                    int i8 = ((defpackage.ymx) ygwVar3).c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((defpackage.lii) ygwVar3.get(i9)).a("car connection required");
                    }
                    defpackage.tgg tggVar2 = defpackage.tgg.a;
                    defpackage.tgf tgfVar3 = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_HANDWRITING_MODEL_DOWNLOAD;
                    tggVar2.b(tgfVar3);
                    defpackage.nrr nrrVarA = defpackage.nrr.a();
                    nrrVarA.b();
                    java.lang.Object obj = nrrVarA.c;
                    obj.getClass();
                    if (((com.google.android.gms.car.CarUiInfo) ((defpackage.row) obj).a).e != null) {
                        new wyo().execute(new java.lang.Void[0]);
                    }
                    tggVar2.d(tgfVar3, 1);
                    defpackage.tgf tgfVar4 = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_GEARHEAD_CALL_NOTIFICATION_MANAGER;
                    tggVar2.b(tgfVar4);
                    defpackage.xgy xgyVarP = defpackage.xgy.p();
                    defpackage.omf.w().D(xgyVarP);
                    defpackage.kit.b().v(xgyVarP.g);
                    tggVar2.d(tgfVar4, 1);
                    tggVar2.b(defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_MICROPHONE_CONTENT_PROVIDER);
                    android.content.Context context2 = wyvVar2.c;
                    com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider ghMicrophoneContentProviderA = com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a();
                    defpackage.qsh qshVarE = defpackage.kit.b().e();
                    if (carInfoD.r != 3) {
                        z4 = false;
                    } else {
                        try {
                            defpackage.mkp.a.g();
                            defpackage.ros rosVarI = defpackage.oml.i(defpackage.kit.b().e());
                            if (rosVarI != null) {
                                try {
                                    iArrO = rosVarI.a.o();
                                } catch (android.os.RemoteException e) {
                                    rosVarI.b(e);
                                    iArrO = null;
                                } catch (java.lang.IllegalStateException e2) {
                                    defpackage.oml.G(e2);
                                    iArrO = null;
                                }
                                if (iArrO.length == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z4 = false;
                            }
                        } catch (defpackage.qst | defpackage.qsu unused2) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.wyv.m.f()).ai((char) 9939)).u("Not using phone mic");
                        }
                    }
                    int i10 = defpackage.kxk.a;
                    if (defpackage.mdp.d().u()) {
                        defpackage.kxk.b(context2);
                        if (z4) {
                            try {
                                android.media.AudioRecord audioRecord = new android.media.AudioRecord(1, 16000, 16, 2, defpackage.kxl.b);
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.kxl.a.f()).ai((char) 3469)).u("Using phone microphone");
                                kxpVar = new kxt(context2, audioRecord, new kxx(context2), defpackage.kxk.a().getLooper());
                            } catch (java.lang.SecurityException unused3) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.kxl.a.h()).ai((char) 3470)).u("Microphone access denied due to lack of permission");
                                defpackage.lam.a().h(408, null);
                                kxpVar = new kxp();
                            }
                        } else {
                            try {
                                kxpVar = new defpackage.kxo(context2, defpackage.laz.a().f(qshVarE), defpackage.kxk.a().getLooper());
                            } catch (java.lang.SecurityException unused4) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.kxl.a.h()).ai((char) 3471)).u("Microphone access denied due to lack of permission");
                                defpackage.lam.a().h(408, null);
                                kxpVar = new kxp();
                            }
                        }
                    } else {
                        kxpVar = new kxp();
                    }
                    ((defpackage.yqj) com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a.l().ai((char) 3466)).u("start");
                    defpackage.ysr.bk(ghMicrophoneContentProviderA.d == null, "Already initialized.");
                    ghMicrophoneContentProviderA.d = kxpVar;
                    defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_MICROPHONE_CONTENT_PROVIDER, 1);
                    wyvVar2.x(new defpackage.jza(wyvVar2.c, wyvVar2.d));
                    wyvVar2.x(new defpackage.mke());
                    if (defpackage.aczg.c()) {
                        wyvVar2.x(mai.c());
                    }
                    wyvVar2.x(new defpackage.lwf());
                    if (defpackage.lmp.a().d()) {
                        wyvVar2.x(defpackage.lov.a.a());
                    }
                }
            }, "GH.GHLifetimeManager", defpackage.zbe.LIFETIME, defpackage.zbd.pd, "Non-recoverable error during initialization. Bailing.", new java.lang.Object[0]);
            defpackage.sqs.bf();
            wyvVar.r = new defpackage.xfe();
            defpackage.xfe xfeVar = wyvVar.r;
            xfeVar.b = (defpackage.sax) defpackage.kgu.c(new defpackage.kyr(11), "GH.HardwareKeyRcvr", defpackage.zbe.HARDWARE_KEY_RECEIVER, defpackage.zbd.pt, true, "failed to start", new java.lang.Object[0]);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.projected.KEY_EVENT");
            android.content.Context context2 = linVar.c;
            defpackage.duw.e(context2, xfeVar, intentFilter, null, 2);
            xfeVar.a = true;
            if (defpackage.adax.aF()) {
                defpackage.sqs.bf();
                wyvVar.s = new defpackage.xgz();
                defpackage.xgz xgzVar = wyvVar.s;
                if (xgzVar.b) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.xgz.a.h()).ai((char) 10307)).u("Receiver already registered");
                } else {
                    defpackage.duw.e(context2, xgzVar, new android.content.IntentFilter("android.net.wifi.SCAN_RESULTS"), null, 4);
                    xgzVar.b = true;
                }
            }
            defpackage.ygw ygwVar3 = defpackage.wyu.b;
            int i5 = ((defpackage.ymx) ygwVar3).c;
            for (int i6 = 0; i6 < i5; i6++) {
                ((defpackage.lii) ygwVar3.get(i6)).a(null);
            }
            wyvVar.t = false;
            defpackage.ygw ygwVar4 = defpackage.wyu.e;
            int i7 = ((defpackage.ymx) ygwVar4).c;
            for (int i8 = 0; i8 < i7; i8++) {
                ((defpackage.lii) ygwVar4.get(i8)).a("Coolwalk");
            }
            wyvVar.t = true;
            defpackage.leo.a();
            defpackage.qsh qshVarE = defpackage.kit.b().e();
            qshVarE.getClass();
            if (defpackage.actb.j()) {
                defpackage.mkp.a.g();
                if (defpackage.oml.z(qshVarE, defpackage.rbf.S)) {
                    defpackage.wyu.g.a("IntegratedOverlay");
                    wyvVar.u = true;
                }
            }
            if (defpackage.leo.a().f() && !defpackage.actb.s()) {
                defpackage.wyu.h.a("Theming");
                wyvVar.v = true;
            }
            if (defpackage.leo.a().c()) {
                defpackage.wyu.i.a("CarControls");
                wyvVar.w = true;
            }
            defpackage.mpk.a().eQ();
            defpackage.mpj.b().g(r0);
            ((defpackage.yqj) yqmVar.l().ai((char) 3950)).u("Lifetime services started");
            defpackage.yqm yqmVar3 = com.google.android.apps.auto.components.apphost.view.TemplateView.h;
            defpackage.hmn hmnVar = defpackage.hmn.a;
            defpackage.hmn.a(androidx.car.app.model.PaneTemplate.class, defpackage.ghl.b);
            defpackage.hmn.a(androidx.car.app.model.ListTemplate.class, defpackage.ghl.a);
            defpackage.hmn.a(androidx.car.app.navigation.model.MapWithContentTemplate.class, defpackage.ghl.c);
            defpackage.hmn.a(com.android.car.libraries.apphost.internal.model.GoogleListTemplate.class, defpackage.ghl.d);
            defpackage.hmn.a(com.android.car.libraries.apphost.external.model.LocalWrapperTemplate.class, defpackage.ghl.e);
            defpackage.hmn.a(androidx.car.app.navigation.model.MapTemplate.class, defpackage.gom.a);
            defpackage.hmn.a(androidx.car.app.navigation.model.RoutePreviewNavigationTemplate.class, defpackage.gom.b);
            defpackage.hmn.a(androidx.car.app.navigation.model.PlaceListNavigationTemplate.class, defpackage.gom.c);
            defpackage.hmn.a(androidx.car.app.model.TabTemplate.class, defpackage.gmq.a);
            defpackage.hmn.a(com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate.class, defpackage.gmq.b);
            defpackage.hmn.a(com.android.car.libraries.apphost.internal.model.TabTemplateInternal.class, defpackage.gmq.c);
            defpackage.hmn.a(com.android.car.libraries.apphost.external.model.GoogleTabTemplate.class, defpackage.gmq.d);
            defpackage.hmn.a(com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate.class, new fvi());
            defpackage.juz juzVar = new defpackage.juz(0);
            defpackage.hmn.a(com.android.car.libraries.apphost.external.model.DialpadTemplate.class, juzVar);
            defpackage.hmn.a(com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate.class, juzVar);
            jzj jzjVar = new jzj();
            defpackage.hmn.a(androidx.car.app.model.ListTemplate.class, jzjVar);
            defpackage.hmn.a(com.android.car.libraries.apphost.internal.model.GoogleListTemplate.class, jzjVar);
            defpackage.hmn.a(androidx.car.app.model.GridTemplate.class, jzjVar);
            defpackage.hmn.a(androidx.car.app.model.SectionedItemTemplate.class, jzjVar);
            defpackage.hmn.a(com.android.car.libraries.apphost.external.model.MenuTemplate.class, jzjVar);
            defpackage.hmn.a(com.android.car.libraries.apphost.external.model.GridWrapperTemplate.class, jzjVar);
            defpackage.hlw hlwVar = defpackage.hlw.a;
            hlwVar.d(defpackage.kcf.a);
            hlwVar.d(defpackage.jxe.a);
            hlwVar.d(defpackage.kcm.a);
            hlwVar.d(defpackage.kbs.a);
            hlwVar.d(defpackage.kcb.a);
            hlwVar.d(new defpackage.gwl(new defpackage.jxf(10)));
            defpackage.hka hkaVar = defpackage.hka.a;
            defpackage.hka.b(defpackage.afgw.b(fwv.class), defpackage.gxa.a);
            defpackage.hka.b(defpackage.afgw.b(fva.class), defpackage.gxl.a);
            defpackage.hka.b(defpackage.afgw.b(fwx.class), defpackage.gxw.a);
            defpackage.hka.b(defpackage.afgw.b(guk.class), defpackage.gyh.a);
            defpackage.hka.b(defpackage.afgw.b(fyr.class), defpackage.gys.a);
            defpackage.hka.b(defpackage.afgw.b(fxd.class), defpackage.gyx.a);
            defpackage.hka.b(defpackage.afgw.b(fxh.class), defpackage.gyy.a);
            defpackage.hka.b(defpackage.afgw.b(fxk.class), defpackage.gyz.a);
            defpackage.hka.b(defpackage.afgw.b(fzw.class), defpackage.gza.a);
            defpackage.hka.b(defpackage.afgw.b(gch.class), defpackage.gwq.a);
            defpackage.hka.b(defpackage.afgw.b(gcc.class), defpackage.gwr.a);
            defpackage.hka.b(defpackage.afgw.b(fxs.class), defpackage.gws.a);
            defpackage.hka.b(defpackage.afgw.b(gun.class), defpackage.gwt.a);
            defpackage.hka.b(defpackage.afgw.b(guu.class), defpackage.gwu.a);
            defpackage.hka.b(defpackage.afgw.b(gux.class), defpackage.gwv.a);
            defpackage.hka.b(defpackage.afgw.b(fwc.class), defpackage.gww.a);
            defpackage.hka.b(defpackage.afgw.b(gvr.class), defpackage.gwx.a);
            defpackage.hka.b(defpackage.afgw.b(fzo.class), defpackage.gwy.a);
            defpackage.hka.b(defpackage.afgw.b(gdf.class), defpackage.gwz.a);
            defpackage.hka.b(defpackage.afgw.b(fvw.class), defpackage.gxb.a);
            defpackage.hka.b(defpackage.afgw.b(guz.class), defpackage.gxc.a);
            defpackage.hka.b(defpackage.afgw.b(gpg.class), defpackage.gxd.a);
            defpackage.hka.b(defpackage.afgw.b(gpk.class), defpackage.gxe.a);
            defpackage.hka.b(defpackage.afgw.b(grs.class), defpackage.gwp.a);
            defpackage.hka.b(defpackage.afgw.b(gpv.class), defpackage.gwp.b);
            defpackage.hka.b(defpackage.afgw.b(gqm.class), defpackage.gwp.c);
            defpackage.hka.b(defpackage.afgw.b(gsf.class), defpackage.gxf.a);
            defpackage.hka.b(defpackage.afgw.b(gsh.class), defpackage.gxg.a);
            defpackage.hka.b(defpackage.afgw.b(gvc.class), defpackage.gxh.a);
            defpackage.hka.b(defpackage.afgw.b(gst.class), defpackage.gxi.a);
            defpackage.hka.b(defpackage.afgw.b(gve.class), defpackage.gxj.a);
            defpackage.hka.b(defpackage.afgw.b(guh.class), defpackage.gwp.d);
            defpackage.hka.b(defpackage.afgw.b(hcf.class), defpackage.gxk.a);
            defpackage.hka.b(defpackage.afgw.b(hch.class), defpackage.gxm.a);
            defpackage.hka.b(defpackage.afgw.b(gwb.class), defpackage.gxn.a);
            defpackage.hka.b(defpackage.afgw.b(gwg.class), defpackage.gxo.a);
            defpackage.hka.b(defpackage.afgw.b(hfh.class), defpackage.gxp.a);
            defpackage.hka.b(defpackage.afgw.b(gpl.class), defpackage.gxq.a);
            defpackage.hka.b(defpackage.afgw.b(hli.class), defpackage.gxr.a);
            defpackage.hka.b(defpackage.afgw.b(gqv.class), defpackage.gxs.a);
            defpackage.hka.b(defpackage.afgw.b(hfi.class), defpackage.gxt.a);
            defpackage.hka.b(defpackage.afgw.b(hfj.class), defpackage.gxu.a);
            defpackage.hka.b(defpackage.afgw.b(hfk.class), defpackage.gxv.a);
            defpackage.hka.b(defpackage.afgw.b(fyi.class), defpackage.gxx.a);
            defpackage.hka.b(defpackage.afgw.b(hdn.class), defpackage.gxy.a);
            defpackage.hka.b(defpackage.afgw.b(hdq.class), defpackage.gxz.a);
            defpackage.hka.b(defpackage.afgw.b(hdt.class), defpackage.gya.a);
            defpackage.hka.b(defpackage.afgw.b(hdv.class), defpackage.gyb.a);
            defpackage.hka.b(defpackage.afgw.b(hdx.class), defpackage.gyc.a);
            defpackage.hka.b(defpackage.afgw.b(hdz.class), defpackage.gyd.a);
            defpackage.hka.b(defpackage.afgw.b(hec.class), defpackage.gye.a);
            defpackage.hka.b(defpackage.afgw.b(hee.class), defpackage.gyf.a);
            defpackage.hka.b(defpackage.afgw.b(heg.class), defpackage.gyg.a);
            defpackage.hka.b(defpackage.afgw.b(hei.class), defpackage.gyi.a);
            defpackage.hka.b(defpackage.afgw.b(fzp.class), defpackage.gyj.a);
            defpackage.hka.b(defpackage.afgw.b(hek.class), defpackage.gyk.a);
            defpackage.hka.b(defpackage.afgw.b(hcj.class), defpackage.gyl.a);
            defpackage.hka.b(defpackage.afgw.b(hcv.class), defpackage.gwp.e);
            defpackage.hka.b(defpackage.afgw.b(hcw.class), defpackage.gym.a);
            defpackage.hka.b(defpackage.afgw.b(hfl.class), defpackage.gyn.a);
            defpackage.hka.b(defpackage.afgw.b(hlb.class), defpackage.gyo.a);
            defpackage.hka.b(defpackage.afgw.b(hle.class), defpackage.gyp.a);
            defpackage.hka.b(defpackage.afgw.b(fyj.class), defpackage.gyq.a);
            defpackage.hka.b(defpackage.afgw.b(hhn.class), defpackage.gyr.a);
            defpackage.hka.b(defpackage.afgw.b(hhx.class), defpackage.gyt.a);
            defpackage.hka.b(defpackage.afgw.b(fzh.class), defpackage.gwp.f);
            defpackage.hka.b(defpackage.afgw.b(gvk.class), defpackage.gyu.a);
            defpackage.hka.b(defpackage.afgw.b(hmx.class), defpackage.gyv.a);
            defpackage.hka.b(defpackage.afgw.b(hne.class), defpackage.gyw.a);
            defpackage.hka.b(defpackage.afgw.b(fvm.class), defpackage.kau.a);
            defpackage.hka.b(defpackage.afgw.b(gdb.class), defpackage.kay.a);
            defpackage.hka.b(defpackage.afgw.b(gcc.class), defpackage.kaz.a);
            defpackage.hka.b(defpackage.afgw.b(gdo.class), defpackage.kba.a);
            defpackage.hka.b(defpackage.afgw.b(fxu.class), defpackage.kbb.a);
            defpackage.hka.b(defpackage.afgw.b(fxw.class), defpackage.kbc.a);
            defpackage.hka.b(defpackage.afgw.b(fxz.class), defpackage.kbd.a);
            defpackage.hka.b(defpackage.afgw.b(hfg.class), defpackage.kbe.a);
            defpackage.hka.b(defpackage.afgw.b(gng.class), defpackage.kbf.a);
            defpackage.hka.b(defpackage.afgw.b(gdi.class), defpackage.kak.a);
            defpackage.hka.b(defpackage.afgw.b(gdj.class), defpackage.kal.a);
            defpackage.hka.b(defpackage.afgw.b(fyb.class), defpackage.kam.a);
            defpackage.hka.b(defpackage.afgw.b(fyd.class), defpackage.kan.a);
            defpackage.hka.b(defpackage.afgw.b(gwi.class), defpackage.kao.a);
            defpackage.hka.b(defpackage.afgw.b(fyk.class), defpackage.kap.a);
            defpackage.hka.b(defpackage.afgw.b(gdk.class), defpackage.kaq.a);
            defpackage.hka.b(defpackage.afgw.b(gdn.class), defpackage.kar.a);
            defpackage.hka.b(defpackage.afgw.b(fym.class), defpackage.kas.a);
            defpackage.hka.b(defpackage.afgw.b(fyo.class), defpackage.kat.a);
            defpackage.hka.b(defpackage.afgw.b(hdb.class), defpackage.kbg.a);
            defpackage.hka.b(defpackage.afgw.b(fvy.class), defpackage.kav.a);
            defpackage.hka.b(defpackage.afgw.b(hmw.class), defpackage.kaw.a);
            defpackage.hka.b(defpackage.afgw.b(jxw.class), defpackage.kax.a);
            linVar.e = true;
            linVar.f = false;
            defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.LIFETIME_START);
            java.lang.String[] strArrX = defpackage.mdp.d().x();
            if (strArrX != null) {
                for (java.lang.String str : strArrX) {
                    if (rroVarH.g == null) {
                        if (rroVarH.h == null) {
                            rroVarH.g = new defpackage.yhv();
                        } else {
                            rroVarH.g = new defpackage.yhv();
                            rroVarH.g.k(rroVarH.h);
                            rroVarH.h = null;
                        }
                    }
                    rroVarH.g.c(str);
                }
            }
            defpackage.mkw mkwVarF = defpackage.mpr.f();
            rroVarH.d(defpackage.lin.u(12, mkwVarF.a().c()));
            defpackage.mku mkuVarA = mkwVarF.a();
            rroVarH.d(defpackage.lin.u(2, mkuVarA.g("key_settings_carmode_turn_off_wifi", ((android.content.Context) mkuVarA.a).getResources().getBoolean(2131034214))));
            defpackage.nsn nsnVarE = defpackage.nsn.e();
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            synchronized (nsnVarE.d) {
                defpackage.yhe yheVar = nsnVarE.e;
                yheVar.getClass();
                defpackage.yot it2 = yheVar.entrySet().iterator();
                while (it2.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                    entry.getValue().getClass();
                    if (entry.getValue().equals(java.lang.Boolean.FALSE)) {
                        ygrVar.i((java.lang.String) entry.getKey());
                    }
                }
            }
            defpackage.ygw ygwVarG = ygrVar.g();
            defpackage.abor aborVarN = defpackage.zad.a.n();
            aborVarN.t();
            defpackage.zad zadVar = (defpackage.zad) aborVarN.b;
            zadVar.b |= 1;
            zadVar.e = 14;
            defpackage.abor aborVarN2 = defpackage.zac.a.n();
            aborVarN2.t();
            defpackage.zac zacVar = (defpackage.zac) aborVarN2.b;
            defpackage.abpj abpjVar = zacVar.b;
            if (!abpjVar.c()) {
                zacVar.b = defpackage.abox.I(abpjVar);
            }
            defpackage.abnf.i(ygwVarG, zacVar.b);
            aborVarN.t();
            defpackage.zad zadVar2 = (defpackage.zad) aborVarN.b;
            defpackage.zac zacVar2 = (defpackage.zac) aborVarN2.q();
            zacVar2.getClass();
            zadVar2.d = zacVar2;
            zadVar2.c = 3;
            rroVarH.d((defpackage.zad) aborVarN.q());
            rroVarH.d(defpackage.lin.u(16, defpackage.ool.a().k()));
            rroVarH.d(defpackage.lin.u(17, mkwVarF.a().k()));
            rroVarH.d(defpackage.lin.u(18, defpackage.nsn.e().j()));
            rroVarH.d(defpackage.lin.u(34, mkwVarF.a().j()));
            rroVarH.d(defpackage.lin.u(7, mkwVarF.a().n()));
            rroVarH.d(defpackage.lin.u(19, mkwVarF.a().l()));
            rroVarH.d(defpackage.lin.u(36, mkwVarF.a().m()));
            rroVarH.d(defpackage.lin.u(22, defpackage.lwz.d().i()));
            rroVarH.d(defpackage.lin.u(35, mkwVarF.a().d()));
            defpackage.mkv.b();
            rroVarH.d(defpackage.lin.u(38, defpackage.mkv.a()));
            rroVarH.d(defpackage.lin.u(39, mkwVarF.a().e()));
            rroVarH.d(defpackage.lin.u(40, mkwVarF.a().f()));
            if (defpackage.kwu.b().e() || defpackage.kwu.b().g()) {
                rroVarH.d(defpackage.lin.u(23, mkwVarF.a().o()));
            }
            if (defpackage.jrj.a()) {
                rroVarH.d(defpackage.lin.u(37, mkwVarF.a().g("key_settings_use_phone_wallpaper", true)));
                defpackage.ngg.b();
                rroVarH.d(defpackage.lin.t(21, defpackage.ngg.d(defpackage.kit.b().e()).j.a()));
                rroVarH.d(defpackage.lin.t(25, defpackage.jfg.a(defpackage.lin.j("driver_position_setting_key", defpackage.jfg.d.name())).f.a()));
                if (defpackage.lin.r(defpackage.rbf.E)) {
                    rroVarH.d(defpackage.lin.t(26, defpackage.jfh.a(defpackage.lin.j("initial_focus_mode", defpackage.jfh.LET_HU_DECIDE.e)).f.a()));
                }
                rroVarH.d(defpackage.lin.u(31, mkwVarF.a().g("key_settings_show_rail_widget", false)));
                defpackage.mmi.c();
                rroVarH.d(defpackage.lin.u(33, defpackage.mmi.h()));
                if (defpackage.lin.r(defpackage.rbf.D)) {
                    defpackage.mmk.b();
                    rroVarH.d(defpackage.lin.t(28, defpackage.mmk.g(defpackage.kit.b().e()).f.a()));
                    defpackage.mmk.b();
                    rroVarH.d(defpackage.lin.t(27, defpackage.mmk.h(defpackage.kit.b().e()).f.a()));
                    defpackage.mmk.b();
                    rroVarH.d(defpackage.lin.t(29, defpackage.mmk.i(defpackage.kit.b().e()).d.a()));
                }
            }
            rroVarH.m = defpackage.xyn.h(java.lang.Long.valueOf(defpackage.juv.l().a()));
            rroVarH.f(((com.google.android.gms.car.CarInfo) new defpackage.nub(defpackage.juv.l().b()).i(new com.google.android.gms.car.CarInfo())).a());
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                defpackage.mkp.a.g();
                defpackage.rei reiVarD = ((defpackage.qtv) defpackage.kit.b().e()).d();
                linVar.h = (com.google.android.gms.car.AnalyticsSessionInfo) reiVarD.f.d(new defpackage.rdg(reiVarD, 13), new com.google.android.gms.car.AnalyticsSessionInfo(-1, defpackage.ymx.a));
                defpackage.lin.l(linVar.h, rroVarH);
            }
            defpackage.omf.u().f(rroVarH);
            defpackage.ojm.a();
            linVar.b = j$.util.OptionalLong.of(android.os.SystemClock.elapsedRealtime());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (defpackage.mrv.a().b()) {
                arrayList.add(defpackage.acbk.q);
            }
            if (defpackage.laq.a().b()) {
                arrayList.add(defpackage.acbk.K);
            }
            defpackage.kwu kwuVarB = defpackage.kwu.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                if (kwuVarB.d()) {
                    arrayList2.add(defpackage.acbk.t);
                }
                if (kwuVarB.a().a(defpackage.kwt.UNAVAILABLE_PERMISSION_MISSING)) {
                    android.content.pm.CrossProfileApps crossProfileApps = kwuVarB.c;
                    crossProfileApps.getClass();
                    if (bgp$.ExternalSyntheticApiModelOutline0.m(crossProfileApps)) {
                        arrayList2.add(defpackage.acbk.u);
                    }
                }
                if (kwuVarB.a() == defpackage.kwt.AVAILABLE) {
                    arrayList2.add(defpackage.acbk.v);
                }
            }
            arrayList.addAll(arrayList2);
            android.content.Context context3 = linVar.c;
            arrayList.addAll(defpackage.oeh.a().A(context3));
            arrayList.addAll(defpackage.mkc.Q().a());
            defpackage.ogv ogvVarD = defpackage.ogv.d();
            context3.getClass();
            defpackage.afct afctVar = new defpackage.afct(10);
            if (!defpackage.acrf.q()) {
                ((defpackage.ype) defpackage.ogv.c.f().ai(5901)).u("External dialer feature not enabled so Google Dialer is not eligible");
            } else if (ogvVarD.j(context3)) {
                afctVar.add(defpackage.acbk.R);
            } else {
                ((defpackage.ype) defpackage.ogv.c.f().ai(5900)).u("Google dialer not valid so is not eligible");
            }
            defpackage.qsh qshVarE2 = defpackage.kit.b().e();
            qshVarE2.getClass();
            java.util.List listE = ogvVarD.e(qshVarE2);
            if (listE.isEmpty()) {
                ((defpackage.ype) defpackage.ogv.c.f().ai(5899)).u("Google dialer car app not enabled so is not available");
                break;
            }
            java.util.Iterator it3 = listE.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (defpackage.afga.f(((defpackage.mqj) it3.next()).a().getPackageName(), "com.google.android.dialer")) {
                        if (ogvVarD.j(context3)) {
                            afctVar.add(defpackage.acbk.S);
                            break;
                        } else {
                            ((defpackage.ype) defpackage.ogv.c.f().ai(5898)).u("Google dialer not valid so is not available");
                            break;
                        }
                    }
                } else {
                    ((defpackage.ype) defpackage.ogv.c.f().ai(5899)).u("Google dialer car app not enabled so is not available");
                    break;
                }
            }
            arrayList.addAll(afctVar.f());
            if (!arrayList.isEmpty()) {
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rro rroVarP = defpackage.omv.p(new defpackage.acbk[0]);
                rroVarP.k(arrayList);
                oimVarU.F(rroVarP.l());
            }
            defpackage.juv.l().c();
            defpackage.mdp.d().c();
            linVar.j.eQ();
            linVar.d.e(defpackage.epw.ON_START);
            java.util.Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((defpackage.lhs) it4.next()).c();
            }
            if (defpackage.wyv.A().k()) {
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.pj).l());
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.wyv.m.f()).ai((char) 9932)).u("onStartComplete no video focus, starting timer");
                wyvVar.q.postDelayed(wyvVar.n, defpackage.acvt.d());
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.pi).l());
            }
        }
        defpackage.tgg.a.d(tgfVar, 1);
    }

    @Override // defpackage.lhs
    public final void e() {
        ((defpackage.yqj) defpackage.wyv.m.l().ai((char) 9920)).u("onCarServiceConnected");
    }

    @Override // defpackage.lhs
    public final boolean g(rcp rcpVar) {
        ((defpackage.yqj) defpackage.wyv.m.l().ai((char) 9921)).y("onConnectionError:%s", rcpVar);
        int i = rcpVar.a;
        if (i == 2) {
            defpackage.skr skrVar = defpackage.skr.a;
            throw null;
        }
        if (i == 0) {
            throw null;
        }
        defpackage.rox.o("GH.GHLifetimeManager", "Failed to connect to car service: %s", sqg.o(i));
        return true;
    }

    @Override // defpackage.lhs
    public final void b() {
    }

    @Override // defpackage.lhs
    public final void c() {
    }

    @Override // defpackage.lhs
    public final void f() {
    }
}
