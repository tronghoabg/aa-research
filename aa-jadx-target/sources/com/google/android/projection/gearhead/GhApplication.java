package com.google.android.projection.gearhead;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GhApplication extends android.app.Application implements wba.a, defpackage.fje {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c;
    private static final defpackage.yhx d;
    public defpackage.jrm a = defpackage.jrm.EMPTY;

    static {
        defpackage.vxc vxcVar = defpackage.vxc.a;
        if (vxcVar.b == null) {
            vxcVar.b = new defpackage.vtb(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
        }
        c = defpackage.yqm.c("CAR.GH");
        d = defpackage.yhx.p("debug", "dogfood");
    }

    @Override // defpackage.fje
    public final fjf a() {
        we weVar = new we();
        weVar.a = new jrv(this);
        return new fjf(weVar);
    }

    @Override // wba.a
    public final defpackage.xyn b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
        defpackage.wfs wfsVar = new defpackage.wfs();
        wfsVar.f = this;
        wfsVar.a = new defpackage.riu(14);
        wfsVar.d = new defpackage.ryo(defpackage.xxe.a, 15);
        return new defpackage.xys(wfsVar.a());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        if (j$.util.Objects.equals(intent.getAction(), "com.google.android.gms.car.service.START")) {
            i |= this.a == defpackage.jrm.SHARED_SERVICE ? 64 : 32;
        }
        return super.bindService(intent, serviceConnection, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: thm */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:41:0x019f  */
    /* JADX WARN: Code duplicated, block: B:68:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x031b  */
    /* JADX WARN: Code duplicated, block: B:79:0x033d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0341 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0343 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0345  */
    /* JADX WARN: Code duplicated, block: B:84:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x035b  */
    /* JADX WARN: Code duplicated, block: B:89:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:91:0x03de  */
    /* JADX WARN: Code duplicated, block: B:93:0x0515  */
    /* JADX WARN: Code duplicated, block: B:95:0x059f  */
    /* JADX WARN: Code duplicated, block: B:97:0x068f  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, syq] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, zhs] */
    @Override // android.app.Application
    public final void onCreate() throws wfo, thm {
        android.app.ActivityManager.RunningAppProcessInfo next;
        defpackage.jrm jrmVarB;
        defpackage.jrm jrmVar;
        defpackage.ldv ldwVar;
        defpackage.tgb tgdVar;
        defpackage.yzn yznVarB;
        java.util.concurrent.ExecutorService executorService;
        int iOrdinal;
        final com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler;
        int iOrdinal2;
        defpackage.qfs qfsVar;
        if (getPackageManager().isSafeMode()) {
            android.util.Log.e("CAR.GH", "Not supported in safe mode - shutting down");
            android.os.Process.killProcess(android.os.Process.myPid());
            java.lang.System.exit(1);
        }
        defpackage.xzg xzgVar = new defpackage.xzg(defpackage.xxd.a);
        xzgVar.e();
        defpackage.wyx.a();
        android.content.Context applicationContext = getApplicationContext();
        ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 9940)).u("onCreate");
        super.onCreate();
        defpackage.sym.a = getContentResolver();
        if (defpackage.qih.b != null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qih.a.f()).ai((char) 7282)).y("Retrieved processInfo from the cache: %s", defpackage.qih.b);
            jrmVar = defpackage.qih.b;
        } else {
            try {
                jrmVarB = defpackage.jrm.b(this, hh$.ExternalSyntheticApiModelOutline0.m());
            } catch (java.lang.IllegalArgumentException e) {
                defpackage.yqm yqmVar = defpackage.qih.a;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).p(e)).ai((char) 7283)).y("Failed to get processInfo for process: %s", hh$.ExternalSyntheticApiModelOutline0.m());
                android.content.Context applicationContext2 = getApplicationContext();
                int iMyPid = android.os.Process.myPid();
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) applicationContext2.getSystemService("activity")).getRunningAppProcesses().iterator();
                do {
                    if (!it.hasNext()) {
                        throw new java.lang.IllegalStateException("OS claims pid is not running...");
                    }
                    next = it.next();
                } while (next.pid != iMyPid);
                jrmVarB = defpackage.jrm.b(applicationContext2, next.processName);
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(7284)).M("Fallback to activity service found the process. ProcessName from ActivityService:{%s}. ProcessName from Application:{%s}.", jrmVarB.c(this), hh$.ExternalSyntheticApiModelOutline0.m());
            }
            defpackage.qih.b = jrmVarB;
            jrmVar = defpackage.qih.b;
        }
        this.a = jrmVar;
        if (jrmVar != defpackage.jrm.PRIMES_LIFEBOAT) {
            applicationContext.getClass();
            defpackage.ebo.s(applicationContext);
            defpackage.xzg xzgVar2 = new defpackage.xzg(defpackage.xxd.a);
            xzgVar2.e();
            defpackage.acvx.a.fF().a();
            j$.time.Duration durationC = xzgVar2.c();
            durationC.getClass();
            defpackage.ebo.u(this);
            defpackage.rkq rkqVar = new defpackage.rkq(new defpackage.rkq((byte[]) null));
            defpackage.qof qofVar = defpackage.qof.STARTUP;
            boolean zO = rkqVar.o(this, qofVar);
            defpackage.yhx yhxVar = (defpackage.yhx) rkqVar.b;
            if (!yhxVar.isEmpty()) {
                syv syvVar = new syv();
                syvVar.b = this;
                syvVar.a = qofVar;
                syvVar.c = rkqVar.a;
                syw sywVarA = syvVar.a();
                defpackage.yhe yheVarK = defpackage.rkq.k();
                rko rkoVar = new rko((wij) null);
                defpackage.yot it2 = yhxVar.iterator();
                while (it2.hasNext()) {
                    qoh qohVar = (qoh) it2.next();
                    if (yheVarK.containsKey(qohVar)) {
                        defpackage.xyn xynVarJ = defpackage.rkq.j((java.lang.Class) yheVarK.get(qohVar));
                        if (xynVarJ.f()) {
                            rkoVar.e(new syu("startup_" + qohVar.a(), qohVar, (qov) null, (syr) xynVarJ.b(), syu.a));
                        } else {
                            rkqVar.l(sywVarA.b, qohVar, sywVarA.a);
                        }
                    } else {
                        rkqVar.n(sywVarA.b, qohVar, sywVarA.a);
                    }
                }
                defpackage.adnr adnrVarF = rkoVar.f(sywVarA);
                try {
                    adnrVarF.b.get();
                } catch (java.lang.InterruptedException | java.lang.RuntimeException | java.util.concurrent.ExecutionException unused) {
                    rkqVar.m(this, qow.a, defpackage.qof.STARTUP);
                }
                if (zO || adnrVarF.a) {
                    android.util.Log.i("CAR.GH", "Ran some fixes.");
                }
            } else if (zO) {
                android.util.Log.i("CAR.GH", "Ran some fixes.");
            }
            java.util.concurrent.ExecutorService executorServiceNewCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
            defpackage.mik mikVar = new defpackage.mik(applicationContext, executorServiceNewCachedThreadPool);
            boolean zContains = d.contains("release");
            defpackage.rly.a = zContains;
            defpackage.jrm jrmVar2 = this.a;
            java.lang.String strC = jrmVar2.c(applicationContext);
            int iOrdinal3 = jrmVar2.ordinal();
            if (iOrdinal3 == 0) {
                ldwVar = new defpackage.ldw(applicationContext, defpackage.jrj.b, strC);
            } else if (iOrdinal3 != 1) {
                ldwVar = iOrdinal3 != 2 ? new defpackage.ldv(applicationContext, defpackage.jrj.a, strC) : new defpackage.ldu(applicationContext, defpackage.jrj.a, strC);
            } else {
                ldwVar = new defpackage.ldy(applicationContext, defpackage.jrj.a, strC);
            }
            defpackage.ldv ldvVar = ldwVar;
            java.lang.String strE = defpackage.acvt.a.fF().e();
            defpackage.yqm yqmVar2 = defpackage.tgi.a;
            int iHashCode = strE.hashCode();
            if (iHashCode == 3449687) {
                if (strE.equals("prod")) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.tgi.a.f()).ai((char) 9027)).u("transmitting to prod");
                    defpackage.aclw aclwVar = tge.a;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    tgdVar = new tgd(this, bool, bool, ldvVar, java.lang.Float.valueOf(0.2f));
                    defpackage.vlx vlxVar = tgdVar.a().a;
                    vlxVar.d();
                    vlxVar.h();
                    yznVarB = defpackage.yzn.b((int) defpackage.acxb.a.fF().a());
                    executorService = executorServiceNewCachedThreadPool;
                    defpackage.wyx.b(applicationContext, this.a, null, null, yznVarB, executorService);
                    defpackage.yqm yqmVar3 = c;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(9941)).y("Process: %s", this.a);
                    android.os.Process.myPid();
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 9943)).y("Channel: %s", ((defpackage.yzn) j$.util.Objects.requireNonNullElse(yznVarB, defpackage.yzn.UNKNOWN)).name());
                    iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        applicationContext.getPackageManager().setComponentEnabledSetting(defpackage.tib.a, 2, 1);
                    } else if (iOrdinal == 2) {
                        defpackage.leb.b = new defpackage.jbr(executorService, applicationContext, 14);
                    } else if (iOrdinal == 7) {
                        android.util.Log.e("CAR.GH", "Unexpected default process - shutting down");
                        android.os.Process.killProcess(android.os.Process.myPid());
                        java.lang.System.exit(10);
                    }
                    ghCrashHandler = new com.google.android.projection.gearhead.GhCrashHandler(applicationContext, this.a, new defpackage.ldr(applicationContext, ldvVar));
                    com.google.android.apps.auto.components.bugreport.BugreportRequester.d = new com.google.android.apps.auto.components.bugreport.BugreportRequester(applicationContext, this.a);
                    if (zContains) {
                        executorService.execute(new wla(this, applicationContext, 3, (byte[]) null));
                        defpackage.bvg.a = 2;
                    }
                    defpackage.bzo.a = true;
                    executorService.execute(new defpackage.wyl(durationC, 2));
                    iOrdinal2 = this.a.ordinal();
                    if (iOrdinal2 == 0) {
                        defpackage.wyv wyvVar = new defpackage.wyv(applicationContext);
                        int i = defpackage.ygw.d;
                        java.lang.Object[] objArr = {com.google.android.gearhead.notifications.SharedNotificationListenerManager$ListenerService.class};
                        defpackage.ysr.B(objArr, 1);
                        defpackage.qfn.h(applicationContext, new defpackage.ymx(objArr, 1), com.google.android.apps.auto.components.messaging.intentservice.ProjectedProxyMessagingService.class, executorService, new defpackage.vxe(this, 2), new defpackage.qfr(10), new defpackage.vxe(wyvVar, 3), new defpackage.qfr(11), new defpackage.qfr(12), new defpackage.qfr(13), new defpackage.vxe(mikVar, 4), new defpackage.qfh(executorService, applicationContext, 9));
                        defpackage.maz.b(applicationContext, executorService);
                        defpackage.wzc wzcVar = new defpackage.wzc();
                        defpackage.vxe vxeVar = new defpackage.vxe(applicationContext, 8);
                        defpackage.vxe vxeVar2 = new defpackage.vxe(applicationContext, 9);
                        defpackage.vxe vxeVar3 = new defpackage.vxe(applicationContext, 10);
                        defpackage.wfp.c();
                        defpackage.wzc.a = wzcVar;
                        wzcVar.m();
                        wzcVar.b = (defpackage.wzi) vxeVar.a();
                        wzcVar.c = (defpackage.xgy) vxeVar2.a();
                        wzcVar.e = new defpackage.sqs();
                        wzcVar.d = (defpackage.xgl) vxeVar3.a();
                        defpackage.yqm yqmVar4 = defpackage.nte.a;
                        ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).h = defpackage.msg.a.a();
                        ((defpackage.yqj) defpackage.wyv.m.l().ai((char) 9925)).u("addCarServiceConnectionListener");
                        wyvVar.fW(new defpackage.wyn(wyvVar), false);
                        defpackage.jrm jrmVar3 = this.a;
                        defpackage.yqm yqmVar5 = defpackage.kit.a;
                        ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).v(new defpackage.wza(applicationContext, jrmVar3, yznVarB));
                        if (!defpackage.kgl.i()) {
                            executorService = executorService;
                            com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity.a(applicationContext, false);
                        }
                        executorService = executorService;
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        executorService.execute(new java.lang.Runnable() { // from class: wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                                if (!ghCrashHandler2.b()) {
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                    return;
                                }
                                java.lang.String strA = ghCrashHandler2.a();
                                if (strA != null) {
                                    defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                    rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                                }
                            }
                        });
                    } else if (iOrdinal2 == 1) {
                        int i2 = defpackage.ygw.d;
                        java.lang.Object[] objArr2 = {com.google.android.gearhead.notifications.SharedNotificationListenerManager$ListenerService.class};
                        defpackage.ysr.B(objArr2, 1);
                        defpackage.ymx ymxVar = new defpackage.ymx(objArr2, 1);
                        defpackage.vxe vxeVar4 = new defpackage.vxe(this, 5);
                        defpackage.vxe vxeVar5 = new defpackage.vxe(mikVar, 6);
                        defpackage.qfh qfhVar = new defpackage.qfh(executorService, applicationContext, 10);
                        int i3 = defpackage.qfs.g;
                        defpackage.qfp qfpVar = new defpackage.qfp();
                        defpackage.qfq qfqVar = new defpackage.qfq(0);
                        qfsVar = new defpackage.qfs();
                        qfsVar.e(defpackage.jrj.class, new defpackage.qfk(13));
                        qfsVar.e(defpackage.jrm.class, vxeVar4);
                        qfsVar.e(defpackage.lbn.class, new defpackage.qfl(qfpVar, 9));
                        qfsVar.e(defpackage.mik.class, vxeVar5);
                        qfsVar.e(defpackage.kmy.class, qfhVar);
                        qfsVar.e(defpackage.oim.class, new defpackage.vwh(applicationContext, executorService, qfqVar, 1));
                        qfsVar.e(defpackage.oiq.class, new defpackage.qfk(20));
                        qfsVar.e(defpackage.oio.class, new defpackage.qfr(1));
                        qfsVar.e(defpackage.ldq.class, new defpackage.qfl(applicationContext, 11));
                        qfsVar.e(defpackage.lbx.class, new defpackage.qfl(applicationContext, 12));
                        qfsVar.e(defpackage.lfr.class, new defpackage.qfl(applicationContext, 13));
                        qfsVar.e(defpackage.mos.class, new defpackage.qfl(applicationContext, 14));
                        qfsVar.e(defpackage.jqw.class, new defpackage.qfk(16));
                        qfsVar.e(defpackage.mni.class, new defpackage.qfr(0));
                        qfsVar.e(defpackage.oqy.class, new defpackage.qfr(2));
                        qfsVar.e(defpackage.mkw.class, new defpackage.qfl(applicationContext, 15));
                        qfsVar.e(defpackage.mim.class, new defpackage.qfl(applicationContext, 16));
                        qfsVar.e(defpackage.kwv.class, new defpackage.qfl(applicationContext, 17));
                        qfsVar.e(defpackage.mds.class, new defpackage.qfl(applicationContext, 18));
                        qfsVar.e(defpackage.mdq.class, new defpackage.qfl(applicationContext, 19));
                        qfsVar.e(defpackage.mdp.class, new defpackage.qfr(3));
                        qfsVar.e(defpackage.knh.class, new defpackage.qfl(applicationContext, 3));
                        qfsVar.e(defpackage.kng.class, new defpackage.qfl(applicationContext, 4));
                        qfsVar.e(defpackage.knb.class, new defpackage.qfl(applicationContext, 5));
                        if (android.os.Build.VERSION.SDK_INT < 30) {
                            qfsVar.e(defpackage.kit.class, new defpackage.oyy(10));
                        }
                        qfsVar.e(defpackage.kiv.class, new defpackage.qfk(14));
                        qfsVar.e(defpackage.mkm.class, new defpackage.qfl(qfqVar, 6));
                        qfsVar.e(defpackage.lbr.class, new defpackage.qfl(applicationContext, 7));
                        qfsVar.e(defpackage.mbt.class, new defpackage.qfh(applicationContext, ymxVar, 8));
                        qfsVar.e(defpackage.kpu.class, new defpackage.qfk(15));
                        qfsVar.e(defpackage.ldx.class, new defpackage.qfk(17));
                        qfsVar.d(new defpackage.qfl(applicationContext, 8), new defpackage.qfl(executorService, 10), new defpackage.qfk(18), new defpackage.qfk(19));
                        defpackage.yqm yqmVar6 = defpackage.kiv.a;
                        defpackage.maz.b(applicationContext, executorService);
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        executorService.execute(new java.lang.Runnable() { // from class: wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                                if (!ghCrashHandler2.b()) {
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                    return;
                                }
                                java.lang.String strA = ghCrashHandler2.a();
                                if (strA != null) {
                                    defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                    rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                                }
                            }
                        });
                    } else if (iOrdinal2 == 2) {
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        defpackage.kou.a(applicationContext, executorService).c(new defpackage.wyl(applicationContext, 3), executorService);
                    } else {
                        if (iOrdinal2 == 3) {
                            if (iOrdinal2 != 4) {
                            }
                            defpackage.vsl.c(new defpackage.wyz(mikVar));
                            return;
                        }
                        qfo qfoVar = new qfo();
                        qfoVar.e(defpackage.oim.class, new defpackage.oyy(4));
                        qfoVar.e(defpackage.khs.class, new defpackage.oyx(applicationContext, 9));
                        qfoVar.e(defpackage.kfn.class, new defpackage.oyy(5));
                        qfoVar.e(defpackage.khq.class, new defpackage.oyy(6));
                        qfoVar.e(defpackage.khn.class, new defpackage.oyy(7));
                        qfoVar.e(defpackage.kwu.class, new defpackage.oyx(applicationContext, 10));
                        qfoVar.d(new defpackage.oyx(applicationContext, 11), new defpackage.oyx(executorService, 12), new defpackage.oyy(8), new defpackage.oyy(9));
                        executorService.execute(new java.lang.Runnable() { // from class: wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                                if (!ghCrashHandler2.b()) {
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                    return;
                                }
                                java.lang.String strA = ghCrashHandler2.a();
                                if (strA != null) {
                                    defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                    rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                                }
                            }
                        });
                    }
                    executorService.execute(new defpackage.wyl(xzgVar.c(), 4));
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 9944)).u("onCreate completed");
                    return;
                }
                throw new java.lang.IllegalArgumentException("Unknown Primes transmitter type ".concat(strE));
            }
            if (iHashCode == 95458899) {
                if (strE.equals("debug")) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.tgi.a.f()).ai((char) 9026)).u("transmitting to local db");
                    defpackage.aclw aclwVar2 = tfz.a;
                    tgdVar = new tfy(this, java.lang.Boolean.FALSE, ldvVar, java.lang.Float.valueOf(0.2f));
                    defpackage.vlx vlxVar2 = tgdVar.a().a;
                    vlxVar2.d();
                    vlxVar2.h();
                    yznVarB = defpackage.yzn.b((int) defpackage.acxb.a.fF().a());
                    executorService = executorServiceNewCachedThreadPool;
                    defpackage.wyx.b(applicationContext, this.a, null, null, yznVarB, executorService);
                    defpackage.yqm yqmVar7 = c;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar7.f()).ai(9941)).y("Process: %s", this.a);
                    android.os.Process.myPid();
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar7.f()).ai((char) 9943)).y("Channel: %s", ((defpackage.yzn) j$.util.Objects.requireNonNullElse(yznVarB, defpackage.yzn.UNKNOWN)).name());
                    iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        applicationContext.getPackageManager().setComponentEnabledSetting(defpackage.tib.a, 2, 1);
                    } else if (iOrdinal == 2) {
                        defpackage.leb.b = new defpackage.jbr(executorService, applicationContext, 14);
                    } else if (iOrdinal == 7) {
                        android.util.Log.e("CAR.GH", "Unexpected default process - shutting down");
                        android.os.Process.killProcess(android.os.Process.myPid());
                        java.lang.System.exit(10);
                    }
                    ghCrashHandler = new com.google.android.projection.gearhead.GhCrashHandler(applicationContext, this.a, new defpackage.ldr(applicationContext, ldvVar));
                    com.google.android.apps.auto.components.bugreport.BugreportRequester.d = new com.google.android.apps.auto.components.bugreport.BugreportRequester(applicationContext, this.a);
                    if (zContains) {
                        executorService.execute(new wla(this, applicationContext, 3, (byte[]) null));
                        defpackage.bvg.a = 2;
                    }
                    defpackage.bzo.a = true;
                    executorService.execute(new defpackage.wyl(durationC, 2));
                    iOrdinal2 = this.a.ordinal();
                    if (iOrdinal2 == 0) {
                        defpackage.wyv wyvVar2 = new defpackage.wyv(applicationContext);
                        int i4 = defpackage.ygw.d;
                        java.lang.Object[] objArr3 = {com.google.android.gearhead.notifications.SharedNotificationListenerManager$ListenerService.class};
                        defpackage.ysr.B(objArr3, 1);
                        defpackage.qfn.h(applicationContext, new defpackage.ymx(objArr3, 1), com.google.android.apps.auto.components.messaging.intentservice.ProjectedProxyMessagingService.class, executorService, new defpackage.vxe(this, 2), new defpackage.qfr(10), new defpackage.vxe(wyvVar2, 3), new defpackage.qfr(11), new defpackage.qfr(12), new defpackage.qfr(13), new defpackage.vxe(mikVar, 4), new defpackage.qfh(executorService, applicationContext, 9));
                        defpackage.maz.b(applicationContext, executorService);
                        defpackage.wzc wzcVar2 = new defpackage.wzc();
                        defpackage.vxe vxeVar6 = new defpackage.vxe(applicationContext, 8);
                        defpackage.vxe vxeVar7 = new defpackage.vxe(applicationContext, 9);
                        defpackage.vxe vxeVar8 = new defpackage.vxe(applicationContext, 10);
                        defpackage.wfp.c();
                        defpackage.wzc.a = wzcVar2;
                        wzcVar2.m();
                        wzcVar2.b = (defpackage.wzi) vxeVar6.a();
                        wzcVar2.c = (defpackage.xgy) vxeVar7.a();
                        wzcVar2.e = new defpackage.sqs();
                        wzcVar2.d = (defpackage.xgl) vxeVar8.a();
                        defpackage.yqm yqmVar8 = defpackage.nte.a;
                        ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).h = defpackage.msg.a.a();
                        ((defpackage.yqj) defpackage.wyv.m.l().ai((char) 9925)).u("addCarServiceConnectionListener");
                        wyvVar2.fW(new defpackage.wyn(wyvVar2), false);
                        defpackage.jrm jrmVar4 = this.a;
                        defpackage.yqm yqmVar9 = defpackage.kit.a;
                        ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).v(new defpackage.wza(applicationContext, jrmVar4, yznVarB));
                        if (!defpackage.kgl.i()) {
                            executorService = executorService;
                            com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity.a(applicationContext, false);
                        }
                        executorService = executorService;
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        executorService.execute(new java.lang.Runnable() { // from class: wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                                if (!ghCrashHandler2.b()) {
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                    return;
                                }
                                java.lang.String strA = ghCrashHandler2.a();
                                if (strA != null) {
                                    defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                    rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                                }
                            }
                        });
                    } else if (iOrdinal2 == 1) {
                        int i5 = defpackage.ygw.d;
                        java.lang.Object[] objArr4 = {com.google.android.gearhead.notifications.SharedNotificationListenerManager$ListenerService.class};
                        defpackage.ysr.B(objArr4, 1);
                        defpackage.ymx ymxVar2 = new defpackage.ymx(objArr4, 1);
                        defpackage.vxe vxeVar9 = new defpackage.vxe(this, 5);
                        defpackage.vxe vxeVar10 = new defpackage.vxe(mikVar, 6);
                        defpackage.qfh qfhVar2 = new defpackage.qfh(executorService, applicationContext, 10);
                        int i6 = defpackage.qfs.g;
                        defpackage.qfp qfpVar2 = new defpackage.qfp();
                        defpackage.qfq qfqVar2 = new defpackage.qfq(0);
                        qfsVar = new defpackage.qfs();
                        qfsVar.e(defpackage.jrj.class, new defpackage.qfk(13));
                        qfsVar.e(defpackage.jrm.class, vxeVar9);
                        qfsVar.e(defpackage.lbn.class, new defpackage.qfl(qfpVar2, 9));
                        qfsVar.e(defpackage.mik.class, vxeVar10);
                        qfsVar.e(defpackage.kmy.class, qfhVar2);
                        qfsVar.e(defpackage.oim.class, new defpackage.vwh(applicationContext, executorService, qfqVar2, 1));
                        qfsVar.e(defpackage.oiq.class, new defpackage.qfk(20));
                        qfsVar.e(defpackage.oio.class, new defpackage.qfr(1));
                        qfsVar.e(defpackage.ldq.class, new defpackage.qfl(applicationContext, 11));
                        qfsVar.e(defpackage.lbx.class, new defpackage.qfl(applicationContext, 12));
                        qfsVar.e(defpackage.lfr.class, new defpackage.qfl(applicationContext, 13));
                        qfsVar.e(defpackage.mos.class, new defpackage.qfl(applicationContext, 14));
                        qfsVar.e(defpackage.jqw.class, new defpackage.qfk(16));
                        qfsVar.e(defpackage.mni.class, new defpackage.qfr(0));
                        qfsVar.e(defpackage.oqy.class, new defpackage.qfr(2));
                        qfsVar.e(defpackage.mkw.class, new defpackage.qfl(applicationContext, 15));
                        qfsVar.e(defpackage.mim.class, new defpackage.qfl(applicationContext, 16));
                        qfsVar.e(defpackage.kwv.class, new defpackage.qfl(applicationContext, 17));
                        qfsVar.e(defpackage.mds.class, new defpackage.qfl(applicationContext, 18));
                        qfsVar.e(defpackage.mdq.class, new defpackage.qfl(applicationContext, 19));
                        qfsVar.e(defpackage.mdp.class, new defpackage.qfr(3));
                        qfsVar.e(defpackage.knh.class, new defpackage.qfl(applicationContext, 3));
                        qfsVar.e(defpackage.kng.class, new defpackage.qfl(applicationContext, 4));
                        qfsVar.e(defpackage.knb.class, new defpackage.qfl(applicationContext, 5));
                        if (android.os.Build.VERSION.SDK_INT < 30) {
                            qfsVar.e(defpackage.kit.class, new defpackage.oyy(10));
                        }
                        qfsVar.e(defpackage.kiv.class, new defpackage.qfk(14));
                        qfsVar.e(defpackage.mkm.class, new defpackage.qfl(qfqVar2, 6));
                        qfsVar.e(defpackage.lbr.class, new defpackage.qfl(applicationContext, 7));
                        qfsVar.e(defpackage.mbt.class, new defpackage.qfh(applicationContext, ymxVar2, 8));
                        qfsVar.e(defpackage.kpu.class, new defpackage.qfk(15));
                        qfsVar.e(defpackage.ldx.class, new defpackage.qfk(17));
                        qfsVar.d(new defpackage.qfl(applicationContext, 8), new defpackage.qfl(executorService, 10), new defpackage.qfk(18), new defpackage.qfk(19));
                        defpackage.yqm yqmVar10 = defpackage.kiv.a;
                        defpackage.maz.b(applicationContext, executorService);
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        executorService.execute(new java.lang.Runnable() { // from class: wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                                if (!ghCrashHandler2.b()) {
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                    return;
                                }
                                java.lang.String strA = ghCrashHandler2.a();
                                if (strA != null) {
                                    defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                    rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                                }
                            }
                        });
                    } else if (iOrdinal2 == 2) {
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        defpackage.kou.a(applicationContext, executorService).c(new defpackage.wyl(applicationContext, 3), executorService);
                    } else {
                        if (iOrdinal2 == 3) {
                            if (iOrdinal2 != 4) {
                            }
                            defpackage.vsl.c(new defpackage.wyz(mikVar));
                            return;
                        }
                        qfo qfoVar2 = new qfo();
                        qfoVar2.e(defpackage.oim.class, new defpackage.oyy(4));
                        qfoVar2.e(defpackage.khs.class, new defpackage.oyx(applicationContext, 9));
                        qfoVar2.e(defpackage.kfn.class, new defpackage.oyy(5));
                        qfoVar2.e(defpackage.khq.class, new defpackage.oyy(6));
                        qfoVar2.e(defpackage.khn.class, new defpackage.oyy(7));
                        qfoVar2.e(defpackage.kwu.class, new defpackage.oyx(applicationContext, 10));
                        qfoVar2.d(new defpackage.oyx(applicationContext, 11), new defpackage.oyx(executorService, 12), new defpackage.oyy(8), new defpackage.oyy(9));
                        executorService.execute(new java.lang.Runnable() { // from class: wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                                if (!ghCrashHandler2.b()) {
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                    return;
                                }
                                java.lang.String strA = ghCrashHandler2.a();
                                if (strA != null) {
                                    defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                    rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                                }
                            }
                        });
                    }
                    executorService.execute(new defpackage.wyl(xzgVar.c(), 4));
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar7.f()).ai((char) 9944)).u("onCreate completed");
                    return;
                }
                throw new java.lang.IllegalArgumentException("Unknown Primes transmitter type ".concat(strE));
            }
            if (iHashCode == 430908212 && strE.equals("perfgate")) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.tgi.a.f()).ai((char) 9025)).u("transmitting to perfgate");
                defpackage.aclw aclwVar3 = defpackage.tgc.a;
                tgdVar = new defpackage.tgb(this, java.lang.Boolean.FALSE, ldvVar, java.lang.Float.valueOf(1.0f));
                defpackage.vlx vlxVar3 = tgdVar.a().a;
                vlxVar3.d();
                vlxVar3.h();
                yznVarB = defpackage.yzn.b((int) defpackage.acxb.a.fF().a());
                executorService = executorServiceNewCachedThreadPool;
                defpackage.wyx.b(applicationContext, this.a, null, null, yznVarB, executorService);
                defpackage.yqm yqmVar11 = c;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar11.f()).ai(9941)).y("Process: %s", this.a);
                android.os.Process.myPid();
                ((defpackage.yqj) ((defpackage.yqj) yqmVar11.f()).ai((char) 9943)).y("Channel: %s", ((defpackage.yzn) j$.util.Objects.requireNonNullElse(yznVarB, defpackage.yzn.UNKNOWN)).name());
                iOrdinal = this.a.ordinal();
                if (iOrdinal == 0) {
                    applicationContext.getPackageManager().setComponentEnabledSetting(defpackage.tib.a, 2, 1);
                } else if (iOrdinal == 2) {
                    defpackage.leb.b = new defpackage.jbr(executorService, applicationContext, 14);
                } else if (iOrdinal == 7) {
                    android.util.Log.e("CAR.GH", "Unexpected default process - shutting down");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    java.lang.System.exit(10);
                }
                ghCrashHandler = new com.google.android.projection.gearhead.GhCrashHandler(applicationContext, this.a, new defpackage.ldr(applicationContext, ldvVar));
                com.google.android.apps.auto.components.bugreport.BugreportRequester.d = new com.google.android.apps.auto.components.bugreport.BugreportRequester(applicationContext, this.a);
                if (zContains) {
                    executorService.execute(new wla(this, applicationContext, 3, (byte[]) null));
                    defpackage.bvg.a = 2;
                }
                defpackage.bzo.a = true;
                executorService.execute(new defpackage.wyl(durationC, 2));
                iOrdinal2 = this.a.ordinal();
                if (iOrdinal2 == 0) {
                    defpackage.wyv wyvVar3 = new defpackage.wyv(applicationContext);
                    int i7 = defpackage.ygw.d;
                    java.lang.Object[] objArr5 = {com.google.android.gearhead.notifications.SharedNotificationListenerManager$ListenerService.class};
                    defpackage.ysr.B(objArr5, 1);
                    defpackage.qfn.h(applicationContext, new defpackage.ymx(objArr5, 1), com.google.android.apps.auto.components.messaging.intentservice.ProjectedProxyMessagingService.class, executorService, new defpackage.vxe(this, 2), new defpackage.qfr(10), new defpackage.vxe(wyvVar3, 3), new defpackage.qfr(11), new defpackage.qfr(12), new defpackage.qfr(13), new defpackage.vxe(mikVar, 4), new defpackage.qfh(executorService, applicationContext, 9));
                    defpackage.maz.b(applicationContext, executorService);
                    defpackage.wzc wzcVar3 = new defpackage.wzc();
                    defpackage.vxe vxeVar11 = new defpackage.vxe(applicationContext, 8);
                    defpackage.vxe vxeVar12 = new defpackage.vxe(applicationContext, 9);
                    defpackage.vxe vxeVar13 = new defpackage.vxe(applicationContext, 10);
                    defpackage.wfp.c();
                    defpackage.wzc.a = wzcVar3;
                    wzcVar3.m();
                    wzcVar3.b = (defpackage.wzi) vxeVar11.a();
                    wzcVar3.c = (defpackage.xgy) vxeVar12.a();
                    wzcVar3.e = new defpackage.sqs();
                    wzcVar3.d = (defpackage.xgl) vxeVar13.a();
                    defpackage.yqm yqmVar12 = defpackage.nte.a;
                    ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).h = defpackage.msg.a.a();
                    ((defpackage.yqj) defpackage.wyv.m.l().ai((char) 9925)).u("addCarServiceConnectionListener");
                    wyvVar3.fW(new defpackage.wyn(wyvVar3), false);
                    defpackage.jrm jrmVar5 = this.a;
                    defpackage.yqm yqmVar13 = defpackage.kit.a;
                    ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).v(new defpackage.wza(applicationContext, jrmVar5, yznVarB));
                    if (!defpackage.kgl.i()) {
                        executorService = executorService;
                        com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity.a(applicationContext, false);
                    }
                    executorService = executorService;
                    defpackage.vsl.c(new defpackage.wyz(mikVar));
                    executorService.execute(new java.lang.Runnable() { // from class: wyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                            if (!ghCrashHandler2.b()) {
                                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                return;
                            }
                            java.lang.String strA = ghCrashHandler2.a();
                            if (strA != null) {
                                defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                            }
                        }
                    });
                } else if (iOrdinal2 == 1) {
                    int i8 = defpackage.ygw.d;
                    java.lang.Object[] objArr6 = {com.google.android.gearhead.notifications.SharedNotificationListenerManager$ListenerService.class};
                    defpackage.ysr.B(objArr6, 1);
                    defpackage.ymx ymxVar3 = new defpackage.ymx(objArr6, 1);
                    defpackage.vxe vxeVar14 = new defpackage.vxe(this, 5);
                    defpackage.vxe vxeVar15 = new defpackage.vxe(mikVar, 6);
                    defpackage.qfh qfhVar3 = new defpackage.qfh(executorService, applicationContext, 10);
                    int i9 = defpackage.qfs.g;
                    defpackage.qfp qfpVar3 = new defpackage.qfp();
                    defpackage.qfq qfqVar3 = new defpackage.qfq(0);
                    qfsVar = new defpackage.qfs();
                    qfsVar.e(defpackage.jrj.class, new defpackage.qfk(13));
                    qfsVar.e(defpackage.jrm.class, vxeVar14);
                    qfsVar.e(defpackage.lbn.class, new defpackage.qfl(qfpVar3, 9));
                    qfsVar.e(defpackage.mik.class, vxeVar15);
                    qfsVar.e(defpackage.kmy.class, qfhVar3);
                    qfsVar.e(defpackage.oim.class, new defpackage.vwh(applicationContext, executorService, qfqVar3, 1));
                    qfsVar.e(defpackage.oiq.class, new defpackage.qfk(20));
                    qfsVar.e(defpackage.oio.class, new defpackage.qfr(1));
                    qfsVar.e(defpackage.ldq.class, new defpackage.qfl(applicationContext, 11));
                    qfsVar.e(defpackage.lbx.class, new defpackage.qfl(applicationContext, 12));
                    qfsVar.e(defpackage.lfr.class, new defpackage.qfl(applicationContext, 13));
                    qfsVar.e(defpackage.mos.class, new defpackage.qfl(applicationContext, 14));
                    qfsVar.e(defpackage.jqw.class, new defpackage.qfk(16));
                    qfsVar.e(defpackage.mni.class, new defpackage.qfr(0));
                    qfsVar.e(defpackage.oqy.class, new defpackage.qfr(2));
                    qfsVar.e(defpackage.mkw.class, new defpackage.qfl(applicationContext, 15));
                    qfsVar.e(defpackage.mim.class, new defpackage.qfl(applicationContext, 16));
                    qfsVar.e(defpackage.kwv.class, new defpackage.qfl(applicationContext, 17));
                    qfsVar.e(defpackage.mds.class, new defpackage.qfl(applicationContext, 18));
                    qfsVar.e(defpackage.mdq.class, new defpackage.qfl(applicationContext, 19));
                    qfsVar.e(defpackage.mdp.class, new defpackage.qfr(3));
                    qfsVar.e(defpackage.knh.class, new defpackage.qfl(applicationContext, 3));
                    qfsVar.e(defpackage.kng.class, new defpackage.qfl(applicationContext, 4));
                    qfsVar.e(defpackage.knb.class, new defpackage.qfl(applicationContext, 5));
                    if (android.os.Build.VERSION.SDK_INT < 30) {
                        qfsVar.e(defpackage.kit.class, new defpackage.oyy(10));
                    }
                    qfsVar.e(defpackage.kiv.class, new defpackage.qfk(14));
                    qfsVar.e(defpackage.mkm.class, new defpackage.qfl(qfqVar3, 6));
                    qfsVar.e(defpackage.lbr.class, new defpackage.qfl(applicationContext, 7));
                    qfsVar.e(defpackage.mbt.class, new defpackage.qfh(applicationContext, ymxVar3, 8));
                    qfsVar.e(defpackage.kpu.class, new defpackage.qfk(15));
                    qfsVar.e(defpackage.ldx.class, new defpackage.qfk(17));
                    qfsVar.d(new defpackage.qfl(applicationContext, 8), new defpackage.qfl(executorService, 10), new defpackage.qfk(18), new defpackage.qfk(19));
                    defpackage.yqm yqmVar14 = defpackage.kiv.a;
                    defpackage.maz.b(applicationContext, executorService);
                    defpackage.vsl.c(new defpackage.wyz(mikVar));
                    executorService.execute(new java.lang.Runnable() { // from class: wyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                            if (!ghCrashHandler2.b()) {
                                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                return;
                            }
                            java.lang.String strA = ghCrashHandler2.a();
                            if (strA != null) {
                                defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                            }
                        }
                    });
                } else if (iOrdinal2 == 2) {
                    defpackage.vsl.c(new defpackage.wyz(mikVar));
                    defpackage.kou.a(applicationContext, executorService).c(new defpackage.wyl(applicationContext, 3), executorService);
                } else if (iOrdinal2 == 3) {
                    qfo qfoVar3 = new qfo();
                    qfoVar3.e(defpackage.oim.class, new defpackage.oyy(4));
                    qfoVar3.e(defpackage.khs.class, new defpackage.oyx(applicationContext, 9));
                    qfoVar3.e(defpackage.kfn.class, new defpackage.oyy(5));
                    qfoVar3.e(defpackage.khq.class, new defpackage.oyy(6));
                    qfoVar3.e(defpackage.khn.class, new defpackage.oyy(7));
                    qfoVar3.e(defpackage.kwu.class, new defpackage.oyx(applicationContext, 10));
                    qfoVar3.d(new defpackage.oyx(applicationContext, 11), new defpackage.oyx(executorService, 12), new defpackage.oyy(8), new defpackage.oyy(9));
                    executorService.execute(new java.lang.Runnable() { // from class: wyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.projection.gearhead.GhCrashHandler ghCrashHandler2 = ghCrashHandler;
                            if (!ghCrashHandler2.b()) {
                                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.h()).ai((char) 9950)).u("Cannot process pending crashes due to phone being locked");
                                return;
                            }
                            java.lang.String strA = ghCrashHandler2.a();
                            if (strA != null) {
                                defpackage.rqt rqtVarA = defpackage.rqt.a(ghCrashHandler2.b);
                                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.GhCrashHandler.a.g()).ai((char) 9949)).y("Incomplete crash processing: %s", strA);
                                rqtVarA.c(defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.INCOMPLETE_CRASH_PROCESSING).l());
                            }
                        }
                    });
                } else {
                    if (iOrdinal2 != 4 || iOrdinal2 == 6) {
                        defpackage.vsl.c(new defpackage.wyz(mikVar));
                        return;
                    }
                    defpackage.rox.o("CAR.GH", "Can't initialize unknown process. Forgot to add?", new java.lang.Object[0]);
                }
                executorService.execute(new defpackage.wyl(xzgVar.c(), 4));
                ((defpackage.yqj) ((defpackage.yqj) yqmVar11.f()).ai((char) 9944)).u("onCreate completed");
                return;
            }
            throw new java.lang.IllegalArgumentException("Unknown Primes transmitter type ".concat(strE));
        }
    }
}
