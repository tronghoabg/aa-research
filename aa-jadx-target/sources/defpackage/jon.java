package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jon implements java.lang.Runnable {
    final /* synthetic */ defpackage.rxf a;
    final /* synthetic */ defpackage.joq b;

    public jon(defpackage.joq joqVar, defpackage.rxf rxfVar) {
        this.a = rxfVar;
        this.b = joqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v18, types: [ilm, java.lang.Object, jfa, jfd, jfe] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        defpackage.ilg ilgVar;
        android.content.pm.PackageManager packageManager;
        java.lang.String[] strArr;
        int i;
        defpackage.jfo jfoVar;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i2;
        try {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.f()).ai(2448);
            defpackage.joq joqVar = this.b;
            yqjVar.x("Service start completed for %d", joqVar.c);
            defpackage.omv.g(joqVar.b, "com.google.android.gms.car.GEARHEAD_ENDPOINTS", defpackage.rsr.b.ordinal(), null);
            this.a.f(true);
            defpackage.jpb jpbVar = joqVar.y;
            char c = 2;
            jpbVar.c.d.post(new defpackage.jpa(jpbVar, 2));
            defpackage.imi imiVar = joqVar.f;
            defpackage.ill.d();
            defpackage.yqm yqmVar = defpackage.imi.b;
            ((defpackage.yqj) yqmVar.l().ai((char) 305)).u("completeStartup, car service ready");
            defpackage.iuk iukVar = imiVar.u;
            defpackage.ilo iloVar = iukVar.E;
            if (iloVar != null) {
                com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = iukVar.r;
                android.content.Context context = imiVar.F;
                iloVar.g.c();
                if (!iloVar.c) {
                    throw new java.lang.IllegalStateException("CarNotConnected");
                }
                if (iloVar.b == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ilo.a.h()).ai((char) 273)).u("Tried to send a wifi credentials request before the end point was ready.");
                } else {
                    iloVar.e = context;
                    iloVar.f = carInfoInternal;
                    ((defpackage.yqj) defpackage.ilo.a.l().ai((char) 272)).u("Sending wifi credentials request");
                    jcm jcmVar = iloVar.b;
                    defpackage.yqk yqkVar = jcm.a;
                    yqkVar.l().ai(1865).u("sendWifiCredentialsRequest");
                    if (jcmVar.b) {
                        jcmVar.k(32769, xqk.a);
                    } else {
                        yqkVar.f().ai(1866).u("sendWifiCredentialsRequest on closed channel");
                    }
                }
            }
            defpackage.ilj iljVar = imiVar.l;
            imiVar.az(iljVar);
            android.content.SharedPreferences.Editor editorEdit = iljVar.c.edit();
            editorEdit.putInt("car_connection_count", 0);
            editorEdit.apply();
            synchronized (imiVar.q) {
                if (!imiVar.br()) {
                    ((defpackage.yqj) yqmVar.l().ai(392)).u("car disconnected while service discovery");
                } else if (!imiVar.s) {
                    imiVar.ad = new defpackage.rle(imiVar.W(), iukVar.n);
                    imiVar.ae = new defpackage.rkv(imiVar.W());
                    imiVar.y = new defpackage.iuy(imiVar.W());
                    if (imiVar.z != null) {
                        imiVar.y.b(imiVar.z.booleanValue());
                    }
                    iukVar.v.e();
                    defpackage.imk imkVar = new defpackage.imk();
                    imiVar.C.set(imkVar);
                    defpackage.nub nubVar = new defpackage.nub();
                    imiVar.B.set(nubVar);
                    android.content.Context context2 = imiVar.k;
                    defpackage.acvt acvtVar = defpackage.acvt.a;
                    defpackage.rqm rqmVar = new defpackage.rqm(context2, acvtVar.fF().f(), true);
                    if (acvtVar.fF().f()) {
                        imiVar.D.set(rqmVar);
                    }
                    defpackage.you youVarListIterator = ((defpackage.ygw) imiVar.W().values()).listIterator(0);
                    while (youVarListIterator.hasNext()) {
                        defpackage.ivc ivcVar = (defpackage.ivc) youVarListIterator.next();
                        char c2 = c;
                        ?? r7 = ivcVar.g;
                        defpackage.ivi iviVar = ivcVar.o;
                        defpackage.ikk ikkVar = ivcVar.q;
                        com.google.android.gms.car.display.CarDisplayId carDisplayId = ivcVar.j;
                        defpackage.imk imkVar2 = imkVar;
                        defpackage.nub nubVar2 = nubVar;
                        android.content.Context context3 = context2;
                        ivcVar.p = new defpackage.inh(ivcVar, context3, r7, r7, ((defpackage.imi) r7).l, r7, iviVar, ikkVar, ((defpackage.imi) r7).E, iviVar.e(), new defpackage.jbr(r7, carDisplayId, 1, null), carDisplayId, ((defpackage.imi) r7).O, imkVar2, ((defpackage.imi) r7).X, ivcVar.n, nubVar2);
                        defpackage.xpq xpqVar = ivcVar.t;
                        if (xpqVar != null) {
                            ivcVar.c(xpqVar);
                        }
                        context2 = context3;
                        imkVar = imkVar2;
                        nubVar = nubVar2;
                        c = c2;
                    }
                    defpackage.imk imkVar3 = imkVar;
                    android.content.Context context4 = context2;
                    defpackage.inm inmVar = android.os.Build.VERSION.SDK_INT >= 35 ? iow.F : null;
                    defpackage.inm inmVar2 = defpackage.iph.G;
                    defpackage.inm inmVar3 = defpackage.iop.E;
                    boolean z = iukVar.p != 0 && android.app.ActivityManager.isUserAMonkey();
                    defpackage.irf irfVar = imiVar.w;
                    defpackage.irk irkVar = iukVar.y;
                    defpackage.jfo jfoVar2 = imiVar.O;
                    defpackage.iyc iycVar = (defpackage.iyc) imiVar.S.fF();
                    defpackage.iya iyaVar = imiVar.E;
                    int i3 = 0;
                    defpackage.ioh iohVar = new defpackage.ioh(imiVar, context4, jfoVar2, imiVar, imiVar, iycVar, iljVar, imiVar, imiVar, iyaVar, new defpackage.kpl(imiVar, 1), inmVar, inmVar2, inmVar3, z, imiVar, imkVar3, rqmVar, irfVar, irkVar);
                    imiVar.A.set(iohVar);
                    iyaVar.c(iohVar);
                    defpackage.ivc ivcVarP = imiVar.p();
                    ivcVarP.getClass();
                    defpackage.ygw ygwVarH = ivcVarP.o.h();
                    int i4 = iukVar.p;
                    ((defpackage.jfp) jfoVar2).g = null;
                    java.util.List listK = defpackage.jfp.k(ygwVarH);
                    android.content.pm.PackageManager packageManager2 = ((defpackage.jfp) jfoVar2).e.getApplicationContext().getPackageManager();
                    defpackage.abor aborVarN = defpackage.yyx.a.n();
                    try {
                        str = packageManager2.getPackageInfo("com.google.android.googlequicksearchbox", 0).versionName;
                        while (true) {
                            if (i >= 6) {
                                jfoVar = jfoVar2;
                                str2 = "";
                                break;
                            }
                            str2 = strArr[i];
                            try {
                                packageManager.getPackageInfo(str2, i3);
                                jfoVar = jfoVar2;
                                try {
                                    if (((defpackage.iyc) ilgVar.c.fF()).p(str2, defpackage.qqe.f)) {
                                        break;
                                    }
                                    i++;
                                    jfoVar2 = jfoVar;
                                    i3 = 0;
                                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                    continue;
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                                jfoVar = jfoVar2;
                            }
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    aborVarN.t();
                    defpackage.yyx yyxVar = (defpackage.yyx) aborVarN.b;
                    yyxVar.b |= 1;
                    yyxVar.c = str;
                    ilgVar = ((defpackage.jfp) jfoVar2).c;
                    packageManager = ilgVar.b.getPackageManager();
                    strArr = defpackage.ilg.a;
                    i = 0;
                    try {
                        str3 = packageManager2.getPackageInfo(str2, 0).versionName;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused4) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    aborVarN.t();
                    defpackage.yyx yyxVar2 = (defpackage.yyx) aborVarN.b;
                    yyxVar2.b |= 2;
                    yyxVar2.d = str3;
                    try {
                        str4 = packageManager2.getPackageInfo(defpackage.ill.c(((defpackage.jfp) jfoVar).e.getApplicationContext()), 0).versionName;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused5) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    aborVarN.t();
                    defpackage.yyx yyxVar3 = (defpackage.yyx) aborVarN.b;
                    yyxVar3.b |= 8;
                    yyxVar3.e = str4;
                    defpackage.yyx yyxVar4 = (defpackage.yyx) aborVarN.q();
                    defpackage.yyy yyyVar = defpackage.yyy.a;
                    defpackage.abor aborVarN2 = yyyVar.n();
                    aborVarN2.t();
                    defpackage.yyy yyyVar2 = (defpackage.yyy) aborVarN2.b;
                    yyxVar4.getClass();
                    yyyVar2.c = yyxVar4;
                    yyyVar2.b |= 1;
                    aborVarN2.t();
                    defpackage.yyy yyyVar3 = (defpackage.yyy) aborVarN2.b;
                    yyyVar3.b |= 4;
                    yyyVar3.e = i4;
                    aborVarN2.O(listK);
                    defpackage.yyy yyyVar4 = (defpackage.yyy) aborVarN2.q();
                    defpackage.yyg yygVar = defpackage.yyg.a;
                    defpackage.abor aborVarN3 = yygVar.n();
                    aborVarN3.t();
                    defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN3.b;
                    yyyVar4.getClass();
                    yygVar2.e = yyyVar4;
                    yygVar2.b |= 1;
                    defpackage.yyh yyhVar = defpackage.yyh.DEVICE_CONNECTED;
                    defpackage.ygw ygwVar = defpackage.ymx.a;
                    ((defpackage.jfp) jfoVar).m(aborVarN3, yyhVar, ygwVar);
                    defpackage.you youVarListIterator2 = ((defpackage.ygw) iukVar.K.values()).listIterator(0);
                    while (youVarListIterator2.hasNext()) {
                        defpackage.ivc ivcVar2 = (defpackage.ivc) youVarListIterator2.next();
                        if (!ivcVar2.e()) {
                            defpackage.ygw ygwVarH2 = ivcVar2.o.h();
                            defpackage.jfo jfoVar3 = imiVar.O;
                            com.google.android.gms.car.CarUiInfo carUiInfo = ivcVar2.q.m;
                            int i5 = ivcVar2.j.b;
                            defpackage.xkd xkdVar = ivcVar2.k;
                            java.util.List listK2 = defpackage.jfp.k(ygwVarH2);
                            defpackage.abor aborVarN4 = yyyVar.n();
                            aborVarN4.t();
                            defpackage.yyy yyyVar5 = (defpackage.yyy) aborVarN4.b;
                            defpackage.you youVar = youVarListIterator2;
                            yyyVar5.b |= 16;
                            yyyVar5.h = i5;
                            int i6 = xkdVar.d;
                            aborVarN4.t();
                            defpackage.yyy yyyVar6 = (defpackage.yyy) aborVarN4.b;
                            yyyVar6.b |= 32;
                            yyyVar6.i = i6;
                            aborVarN4.O(listK2);
                            if (carUiInfo != null) {
                                defpackage.yyw yywVarJ = defpackage.jfp.j(carUiInfo);
                                aborVarN4.t();
                                defpackage.yyy yyyVar7 = (defpackage.yyy) aborVarN4.b;
                                yywVarJ.getClass();
                                yyyVar7.g = yywVarJ;
                                yyyVar7.b |= 8;
                            }
                            defpackage.abor aborVarN5 = yygVar.n();
                            aborVarN5.t();
                            defpackage.yyg yygVar3 = (defpackage.yyg) aborVarN5.b;
                            defpackage.yyy yyyVar8 = (defpackage.yyy) aborVarN4.q();
                            yyyVar8.getClass();
                            yygVar3.e = yyyVar8;
                            yygVar3.b |= 1;
                            ((defpackage.jfp) jfoVar3).m(aborVarN5, defpackage.yyh.CONNECT_SECONDARY_DISPLAY, ygwVar);
                            youVarListIterator2 = youVar;
                        }
                    }
                    imiVar.N = android.os.SystemClock.elapsedRealtime();
                    defpackage.you youVarListIterator3 = ((defpackage.ygw) iukVar.K.values()).listIterator(0);
                    while (youVarListIterator3.hasNext()) {
                        defpackage.ivc ivcVar3 = (defpackage.ivc) youVarListIterator3.next();
                        defpackage.ivi iviVar2 = ivcVar3.o;
                        if (imiVar.V == null) {
                            imiVar.V = java.util.concurrent.Executors.newScheduledThreadPool(1);
                        }
                        iviVar2.s(imiVar.V);
                        defpackage.ive iveVarA = ivcVar3.o.a();
                        if (iveVarA != null) {
                            ivcVar3.p.t(iveVarA, java.util.UUID.fromString(ivcVar3.r.g().g));
                        }
                        if (defpackage.acpj.a.fF().e() && ivcVar3.e()) {
                            ((defpackage.iyc) imiVar.S.fF()).l(ivcVar3.o.f());
                        }
                    }
                    if (imiVar.bm()) {
                        ((defpackage.yqj) defpackage.imi.b.l().ai(390)).u("Projection started and all WindowManagers are configured. Starting projection lifecycle service.");
                        imiVar.ba();
                    } else {
                        ((defpackage.yqj) defpackage.imi.b.l().ai(388)).u("Projection started but not all WindowManagers are configured. Projection lifecycle service will be started when all WindowManagers are configured.");
                    }
                    imiVar.s = true;
                    if (defpackage.edd.g() && imiVar.t.getAndSet(false)) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai(389)).u("Applying pending day/night mode update.");
                        imiVar.aG();
                    }
                }
            }
            jqn jqnVar = joqVar.j;
            if (jqnVar != null) {
                if (!jqnVar.b.compareAndSet(false, true)) {
                    ((defpackage.yqj) ((defpackage.yqj) jqn.a.h()).ai((char) 2651)).u("Latency monitor already started.");
                    return;
                }
                int i7 = jqnVar.f;
                if (i7 > 0 && (i2 = jqnVar.e) > 0 && i7 >= i2) {
                    ((defpackage.yqj) jqn.a.l().ai(2650)).u("Starting...");
                    joj jojVar = jqnVar.g;
                    synchronized (jojVar.g) {
                        jojVar.k = false;
                    }
                    android.os.Handler handler = jqnVar.d;
                    handler.post(new defpackage.jmy(jqnVar, 13));
                    handler.postDelayed(new defpackage.jmy(jqnVar, 14), jqnVar.f);
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) jqn.a.g()).ai(2649)).B("Invalid latency monitor parameters, probe: %d, report: %d", jqnVar.e, i7);
            }
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).p(e)).ai((char) 2449)).u("RemoteException in ::onServicesStarted");
            this.b.b();
        }
    }
}
