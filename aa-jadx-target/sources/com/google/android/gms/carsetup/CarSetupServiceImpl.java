package com.google.android.gms.carsetup;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarSetupServiceImpl extends android.app.Service implements defpackage.scj {
    private com.google.android.gms.carsetup.setup.UsbConnectionHelper B;
    private defpackage.sgc C;
    private defpackage.run D;
    private boolean E;
    private defpackage.ryk F;
    private long G;
    private boolean H;
    private defpackage.shg K;
    public defpackage.rvp d;
    public boolean f;
    public defpackage.sbg g;
    public int h;
    public defpackage.scl i;
    public com.google.android.gms.carsetup.CarInfoInternal j;
    public com.google.android.gms.carsetup.CarSetupServiceImpl.ConnectionTransfer k;
    public sfs l;
    public boolean m;
    public defpackage.sci n;
    public java.lang.Boolean q;
    public defpackage.qtp r;
    public volatile rte s;
    public volatile defpackage.sbq t;
    public android.os.HandlerThread u;
    android.os.Handler v;
    public android.os.Handler w;
    public defpackage.slu y;
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP.SERVICE");
    private static final java.util.Random A = new java.security.SecureRandom();
    static final java.util.concurrent.atomic.AtomicBoolean b = com.google.android.gms.carsetup.setup.UsbConnectionHelper.b;
    public final defpackage.sbv c = new defpackage.sbv(this);
    public int e = -1;
    public int o = 0;
    private int I = 0;
    public final defpackage.xzi p = defpackage.ysr.aQ(new defpackage.riu(6));
    final defpackage.ldx z = new defpackage.ldx((java.lang.Object) this);
    private final defpackage.shj J = new defpackage.shl();
    public final defpackage.ser x = new defpackage.ser();

    private final void o() {
        android.app.Notification.Builder color = new android.app.Notification.Builder(this).setContentTitle(getString(2132083282)).setContentText(getString(2132083343)).setSmallIcon(2131231122).setColor(getResources().getColor(2131100013));
        getString(2132083282);
        defpackage.vsl vslVarH = defpackage.vsl.h(this);
        if (vslVarH.e("car.default_notification_channel") == null) {
            a.l().ai(8651).y("Creating notification channel %s", "car.default_notification_channel");
            vslVarH.f(new android.app.NotificationChannel("car.default_notification_channel", getString(2132083282), 3));
        }
        a$.ExternalSyntheticApiModelOutline1.m(color, "car.default_notification_channel");
        startForeground(1, color.build());
        a.f().ai(8664).u("started foreground service");
    }

    private final void p(java.io.Closeable closeable, android.os.Bundle bundle, java.lang.Runnable runnable) {
        try {
            android.content.Context applicationContext = getApplicationContext();
            defpackage.yqk yqkVar = defpackage.sig.a;
            int i = defpackage.ygw.d;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            defpackage.yha yhaVar = new defpackage.yha(4);
            defpackage.rit ritVar = defpackage.rit.INSTANCE;
            defpackage.acsj acsjVar = defpackage.acsj.a;
            java.util.Iterator<E> it = acsjVar.fF().a().b.iterator();
            while (true) {
                long jElapsedRealtimeNanos = 0;
                if (!it.hasNext()) {
                    defpackage.yot it2 = yhaVar.d(true).entrySet().iterator();
                    while (it2.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                        if (defpackage.tna.v(applicationContext, (android.content.ComponentName) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue())) {
                            ygrVar.i((android.content.ComponentName) entry.getKey());
                        } else {
                            defpackage.sig.a.l().ai(9003).M("Not considering handing off to %s because it was not installed or version was below the requested minimum (%d).", entry.getKey(), entry.getValue());
                        }
                    }
                    defpackage.ygw ygwVarG = ygrVar.g();
                    this.G = A.nextLong();
                    if (acsjVar.fF().e()) {
                        jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                        if (bundle != null) {
                            bundle.putLong("car_handoff_connection_start_time_elapsed_nanos", jElapsedRealtimeNanos);
                        }
                    }
                    this.t = new defpackage.sbq(this.v, this, this, this.g, this.J, defpackage.rit.INSTANCE);
                    defpackage.sid sidVar = new defpackage.sid(getApplicationContext(), this.G, this.t, this.v, ygwVarG, this.o);
                    defpackage.sbq sbqVar = this.t;
                    long j = this.G;
                    int i2 = this.e;
                    int i3 = this.h;
                    sbqVar.k = j;
                    sbqVar.x = jElapsedRealtimeNanos;
                    sbqVar.m = i3;
                    sbqVar.l = i2;
                    sbqVar.h = closeable;
                    sbqVar.i = bundle;
                    sbqVar.j = runnable;
                    sbqVar.n = sidVar;
                    if (sidVar.d) {
                        defpackage.sid.a.f().ai(8995).u("Starting handoff interest checks");
                        sidVar.e.post(new defpackage.rzu(sidVar, 8));
                        return;
                    } else {
                        defpackage.sid.a.f().ai(8996).u("Skipping handoff interest checks - feature is not enabled");
                        sidVar.e.post(new defpackage.sho(sidVar, 7));
                        return;
                    }
                }
                java.lang.String[] strArrSplit = ((java.lang.String) it.next()).split(":", 2);
                java.lang.String str = strArrSplit[0];
                android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString == null) {
                    throw new java.util.InvalidPropertiesFormatException("Failed to unflatten component name: ".concat(java.lang.String.valueOf(str)));
                }
                if (strArrSplit.length > 1 && !strArrSplit[1].isEmpty()) {
                    jElapsedRealtimeNanos = java.lang.Long.parseLong(strArrSplit[1]);
                }
                yhaVar.f(componentNameUnflattenFromString, java.lang.Long.valueOf(jElapsedRealtimeNanos));
            }
        } catch (java.lang.NumberFormatException | java.util.InvalidPropertiesFormatException e) {
            a.g().p(e).ai(8676).u("Aborting car connection handoff due to configuration error.");
            runnable.run();
        }
    }

    protected defpackage.ryk a() {
        return defpackage.ryk.a(this);
    }

    protected final void b() {
        stopForeground(true);
        a.f().ai(8650).w("stopped foreground service id %d", this.I);
        stopSelf(this.I);
    }

    public final void c() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8653).u("Connection transfer done");
        if (l()) {
            yqkVar.l().ai(8630).u("Connection handoff complete");
        } else {
            defpackage.rvp rvpVar = this.d;
            if (rvpVar == null) {
                yqkVar.h().ai(8652).u("Protocol manager is unexpectedly null, ignoring");
                defpackage.omv.i(this, defpackage.yyn.CAR_SETUP_SERVICE_NULL_PROTOCOL_MANAGER_DURING_FINISH_TRANSFER);
            } else {
                rvpVar.d.t.f();
                this.d = null;
            }
        }
        k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0285  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:135:0x0355 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0357  */
    /* JADX WARN: Code duplicated, block: B:137:0x036e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0372  */
    /* JADX WARN: Code duplicated, block: B:140:0x0386  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    public final void d(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, boolean z) {
        boolean z2;
        boolean z3;
        zaq[] zaqVarArr;
        boolean z4;
        zaq zaqVar;
        defpackage.omv.g(this, "com.google.android.gms.car.AUTHORIZATION", defpackage.rsr.a.ordinal(), null);
        this.j = carInfoInternal;
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        if (z) {
            xiw xiwVar = xiw.e;
            defpackage.omv.m(this, defpackage.rsr.b, 0);
            if (l()) {
                this.t.d(xiwVar);
            } else {
                defpackage.rvp rvpVar = this.d;
                if (rvpVar != null) {
                    rvpVar.g(xiwVar);
                }
            }
        } else if (defpackage.qtq.f(defpackage.qtq.c(defpackage.adcd.a.fF().c()), this.j.a)) {
            a.l().ai(8657).u("killswitch activated for this car");
            n(2);
        } else {
            if (!l()) {
                defpackage.rxi sfsVar = new sfs(this.D);
                this.l = sfsVar;
                this.x.d(sfsVar);
            }
            com.google.android.gms.carsetup.CarInfoInternal carInfoInternal2 = this.j;
            defpackage.sbm sbmVar = carInfoInternal2.o ? carInfoInternal2.p ? defpackage.sbm.b : defpackage.sbm.c : defpackage.sbm.a;
            defpackage.yqk yqkVar = a;
            yqkVar.f().ai(8654).y("CarInfo authorization: %s", sbmVar);
            defpackage.ser serVar = this.x;
            boolean z5 = this.H;
            int iOrdinal = sbmVar.ordinal();
            if (iOrdinal == 0) {
                z2 = false;
                z3 = z2;
            } else if (iOrdinal == 1) {
                z2 = true;
                z3 = z2;
            } else if (iOrdinal != 2) {
                z2 = false;
                z3 = z2;
            } else {
                z3 = false;
                z2 = true;
            }
            this.i = new defpackage.scl(getApplicationContext(), this.j, this.r, serVar, z5, z2, z3, this.z, this.g, this.e);
            if (defpackage.sbm.c.equals(sbmVar)) {
                yqkVar.h().ai(8656).u("Exiting car setup: car is rejected - car is in rejected car list.");
                this.l = null;
                java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                rxy.j(getApplicationContext(), executorServiceNewSingleThreadExecutor, yyt.f);
                executorServiceNewSingleThreadExecutor.shutdown();
                n(4);
            } else {
                int i = android.os.Build.VERSION.SDK_INT;
                if (this.E) {
                    defpackage.omv.g(this, "com.google.android.gms.car.AUTHORIZATION", defpackage.rsr.b.ordinal(), null);
                    this.l = null;
                    i(this.i.g, false);
                } else {
                    defpackage.scl sclVar = this.i;
                    java.lang.String str = "false";
                    try {
                        str = (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, "debug.car.skip_frx", "false");
                    } catch (java.lang.Exception unused) {
                    }
                    if ("true".equalsIgnoreCase(str)) {
                        defpackage.scl.a.f().ai(8745).u("Skipping FRX: adb override");
                    } else {
                        java.util.List<java.lang.String> listD = sclVar.d();
                        if (listD.isEmpty()) {
                            zaqVarArr = null;
                        } else {
                            zaqVarArr = new zaq[listD.size()];
                            int i2 = 0;
                            for (java.lang.String str2 : listD) {
                                int i3 = i2 + 1;
                                defpackage.yqk yqkVar2 = saz.a;
                                switch (str2) {
                                    case "com.google.android.googlequicksearchbox":
                                        zaqVar = zaq.c;
                                        break;
                                    case "com.waze":
                                        zaqVar = zaq.h;
                                        break;
                                    case "com.locnall.KimGiSa":
                                        zaqVar = zaq.g;
                                        break;
                                    case "com.google.android.apps.maps":
                                        zaqVar = zaq.d;
                                        break;
                                    case "com.google.android.tts":
                                        zaqVar = zaq.f;
                                        break;
                                    case "com.google.android.projection.gearhead":
                                        zaqVar = zaq.b;
                                        break;
                                    default:
                                        zaqVar = zaq.a;
                                        break;
                                }
                                zaqVarArr[i2] = zaqVar;
                                i2 = i3;
                            }
                        }
                        if (sclVar.l) {
                            defpackage.sei seiVar = sclVar.i;
                            if (seiVar == null ? !sclVar.k() : !seiVar.d()) {
                                defpackage.scl.a.f().ai(8743).u("Triggering FRX: did not finish FRX");
                                sclVar.l(4, defpackage.zbd.hv, zaqVarArr);
                            } else if (listD.isEmpty()) {
                                int i4 = sclVar.e;
                                if (seiVar == null) {
                                    android.content.pm.PackageManager packageManager = sclVar.b.getPackageManager();
                                    try {
                                        java.lang.String str3 = defpackage.sii.a[0];
                                        if (packageManager.getPackageInfo(str3, 0) != null) {
                                            defpackage.scl.a.f().ai(8751).y("%s is installed!", str3);
                                        } else {
                                            try {
                                                if (sclVar.b.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionCode >= 17629000) {
                                                }
                                            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                                                defpackage.scl.a.g().p(e).ai(8736).u("Gearhead isn't installed; this check must be in the wrong position");
                                            }
                                        }
                                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                                    }
                                    sih sihVarC = sclVar.c();
                                    if (!sihVarC.d() || !sihVarC.b() || !sihVarC.c()) {
                                        defpackage.scl.a.f().ai(8739).u("Triggering FRX: TOS not accepted");
                                        sclVar.l(8, defpackage.zbd.hz, null);
                                    }
                                } else if (!sclVar.i.b()) {
                                    defpackage.scl.a.f().ai(8739).u("Triggering FRX: TOS not accepted");
                                    sclVar.l(8, defpackage.zbd.hz, null);
                                }
                            } else {
                                defpackage.scl.a.f().ai(8742).y("Triggering FRX: applications are not up to date %s", listD);
                                sclVar.l(5, defpackage.zbd.hw, zaqVarArr);
                            }
                        } else {
                            defpackage.scl.a.f().ai(8744).u("Triggering FRX: car connection is not allowed");
                            sclVar.l(3, defpackage.zbd.hu, zaqVarArr);
                        }
                        defpackage.scl sclVar2 = this.i;
                        if (i < 30 || this.t == null || !this.t.s) {
                            z4 = false;
                        } else {
                            defpackage.sbq sbqVar = this.t;
                            a.f().ai(8631).y("gearheadSuppliedSkipLegacyFrxValue: %s", new defpackage.zkf(defpackage.zke.a, java.lang.Boolean.valueOf(sbqVar.t)));
                            if (sbqVar.t) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        if (android.os.Build.VERSION.SDK_INT < 30 || !defpackage.acwj.a.fF().y()) {
                            boolean z6 = android.os.Build.VERSION.SDK_INT >= 29;
                            boolean zIsEmpty = sclVar2.d().isEmpty();
                            int i5 = sclVar2.e;
                            boolean z7 = z6 && zIsEmpty;
                            defpackage.yqk yqkVar3 = defpackage.scl.a;
                            defpackage.ypu ypuVarAi = yqkVar3.f().ai(8738);
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z7);
                            defpackage.zke zkeVar = defpackage.zke.a;
                            defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, boolValueOf);
                            defpackage.zkf zkfVar2 = new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z6));
                            defpackage.zkf zkfVar3 = new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(zIsEmpty));
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            ypuVarAi.T("cakewalkMinimumRequirements=%b, isSupportedOsVersion=%b,  appsUpToDate%b,  hasNoMissingPermissions=%b,  deviceIsSupportedOrAllowList=%b", zkfVar, zkfVar2, zkfVar3, new defpackage.zkf(zkeVar, bool), new defpackage.zkf(zkeVar, bool));
                            if (z7) {
                                if (z4) {
                                    defpackage.scl.a.f().ai(8756).u("skipViaGearheadSuppliedSkipLegacyFrxValue");
                                    sclVar2.f(defpackage.zbd.hB, null);
                                } else if (sclVar2.h == 2) {
                                    defpackage.scl.a.f().ai(8755).u("skipViaWireless");
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                defpackage.scl.a.f().ai(8754).y("shouldSkipLegacyFrxForCakewalk %b", new defpackage.zkf(defpackage.zke.a, java.lang.Boolean.valueOf(z4)));
                                if (z4) {
                                    sclVar2.f(defpackage.zbd.hA, null);
                                }
                            } else {
                                yqkVar3.f().ai(8757).u("shouldSkipLegacyFrxForCakewalk hasMinimumRequirementsForCakewalk false, exiting early");
                            }
                        } else {
                            if (z4) {
                                defpackage.scl.a.f().ai(8756).u("skipViaGearheadSuppliedSkipLegacyFrxValue");
                                sclVar2.f(defpackage.zbd.hB, null);
                            } else if (sclVar2.h == 2) {
                                defpackage.scl.a.f().ai(8755).u("skipViaWireless");
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            defpackage.scl.a.f().ai(8754).y("shouldSkipLegacyFrxForCakewalk %b", new defpackage.zkf(defpackage.zke.a, java.lang.Boolean.valueOf(z4)));
                            if (z4) {
                                sclVar2.f(defpackage.zbd.hA, null);
                            }
                        }
                        if (l()) {
                            defpackage.sbq sbqVar2 = this.t;
                            sbqVar2.o = true;
                            defpackage.shv shvVar = sbqVar2.n;
                            ((defpackage.sid) shvVar).e.post(new sbj(shvVar, sbqVar2.d.x, 7));
                        } else {
                            if (this.d == null) {
                                defpackage.ypu ypuVarAi2 = a.g().q(defpackage.yqi.SMALL).ai(8655);
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.e);
                                defpackage.zke zkeVar2 = defpackage.zke.a;
                                ypuVarAi2.R("protocolManager is unexpectedly null. connectionType: %s. connected state: %s. handoffStateManager.hasCleanedUp: %s.", new defpackage.zkf(zkeVar2, numValueOf), new defpackage.zkf(zkeVar2, java.lang.Integer.valueOf(this.c.a())), new defpackage.zkf(zkeVar2, this.t == null ? "<null handoffStateManager>" : java.lang.Boolean.valueOf(this.t.a.get())));
                            }
                            defpackage.rvp rvpVar2 = this.d;
                            rvpVar2.getClass();
                            if (rvpVar2.a(this.l) != 1) {
                                e(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NO_SENSORS, "No sensors");
                                k();
                            } else {
                                this.d.d(new sbl(this));
                            }
                        }
                    }
                    defpackage.omv.g(this, "com.google.android.gms.car.AUTHORIZATION", defpackage.rsr.b.ordinal(), null);
                    this.l = null;
                    i(this.i.g, false);
                }
            }
        }
        if (defpackage.adct.a.fF().b()) {
            defpackage.sds sdsVar = this.e == 2 ? defpackage.sds.b : defpackage.sds.a;
            if (defpackage.adct.c()) {
                new defpackage.sdu(this).c(this.j.f, sdsVar);
            }
        }
    }

    @Override // android.app.Service
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        boolean zB;
        printWriter.println("Connection type: " + this.e);
        printWriter.println("Connected state: " + this.c.a());
        defpackage.sbg sbgVar = this.g;
        if (sbgVar != null) {
            printWriter.println("Analytics session id: " + sbgVar.a);
        }
        defpackage.slu sluVar = this.y;
        int i = 0;
        if (sluVar != null) {
            java.lang.Object obj = sluVar.a;
            if (obj != null) {
                zB = ((android.os.PowerManager.WakeLock) obj).isHeld();
            } else {
                java.lang.Object obj2 = sluVar.b;
                zB = obj2 != null ? ((defpackage.swi) obj2).b() : false;
            }
            printWriter.println(defpackage.a.bQ(zB, "Wake lock held: "));
        } else {
            printWriter.println("Wake lock is null");
        }
        printWriter.println("startActivities: " + this.f);
        printWriter.println("connectionTag: " + this.h);
        printWriter.println("suppressRestart: " + this.E);
        printWriter.println("readerThreadStuck: " + this.m);
        printWriter.println("carServiceSessionId: " + this.G);
        defpackage.scl sclVar = this.i;
        if (sclVar != null) {
            printWriter.println("FrxState");
            printWriter.println("setupOngoing: " + sclVar.k);
            printWriter.println("carConnectionAlreadyAllowed: " + sclVar.l);
            printWriter.println("shouldShowTutorial: " + sclVar.g);
            printWriter.println("transferStarted: " + sclVar.m);
            printWriter.println("carServiceStarted: " + sclVar.n);
        }
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = this.j;
        if (carInfoInternal != null) {
            printWriter.println("car info: ".concat(carInfoInternal.toString()));
        }
        if (this.s != null) {
            rte rteVar = this.s;
            printWriter.print("CarGalMonitor{messageListeners=[");
            synchronized (rteVar.b) {
                int i2 = 0;
                while (true) {
                    android.util.SparseArray sparseArray = rteVar.c;
                    if (i2 >= sparseArray.size()) {
                        break;
                    }
                    android.util.ArrayMap arrayMap = (android.util.ArrayMap) sparseArray.valueAt(i2);
                    if (arrayMap != null && !arrayMap.isEmpty()) {
                        printWriter.print(sparseArray.keyAt(i2) + ",");
                    }
                    i2++;
                }
                printWriter.print("], frameListeners=[");
                while (true) {
                    android.util.SparseArray sparseArray2 = rteVar.d;
                    if (i >= sparseArray2.size()) {
                        break;
                    }
                    android.util.ArrayMap arrayMap2 = (android.util.ArrayMap) sparseArray2.valueAt(i);
                    if (arrayMap2 != null && !arrayMap2.isEmpty()) {
                        printWriter.print(sparseArray2.keyAt(i) + ",");
                    }
                    i++;
                }
            }
            printWriter.println("]}");
        }
        printWriter.println("No module info for gms-independent lib.");
        this.F.c(printWriter);
    }

    @Override // defpackage.scj
    public final void e(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        this.C.c(zajVar, zakVar, str);
    }

    public final void f(final java.io.Closeable closeable, final android.os.ParcelFileDescriptor parcelFileDescriptor, final boolean z) {
        if (parcelFileDescriptor == null) {
            a.g().ai(8674).u("Null connection file descriptor. Not starting car connection.");
            k();
        } else {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: sbi
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl = this.a;
                    if (carSetupServiceImpl.m()) {
                        return;
                    }
                    boolean z2 = z;
                    android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                    java.io.Closeable closeable2 = closeable;
                    defpackage.ysr.bk(((java.lang.Boolean) carSetupServiceImpl.p.fF()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                    carSetupServiceImpl.h(closeable2, parcelFileDescriptor2, parcelFileDescriptor2, z2);
                }
            };
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR", parcelFileDescriptor);
            p(closeable, bundle, runnable);
        }
    }

    public final void g() {
        a.f().ai(8675).u("Start FRX setup");
        defpackage.omv.h(this, "com.google.android.gms.car.FRX", defpackage.rsr.a, null);
        defpackage.scl sclVar = this.i;
        defpackage.yqk yqkVar = defpackage.scl.a;
        yqkVar.f().ai(8758).u("Starting setup");
        android.content.Context context = sclVar.b;
        ((android.app.UiModeManager) context.getSystemService("uimode")).disableCarMode(0);
        if (((android.app.KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
            yqkVar.l().ai(8759).u("first run and screen locked");
        }
        sclVar.k = true;
        ((defpackage.ser) sclVar.d).a.add(sclVar);
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(defpackage.riv.d);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(65536);
        intent.putExtra("frx_state", new com.google.android.gms.carsetup.BinderParcel(new scu(new defpackage.srg(sclVar))));
        context.startActivity(intent);
    }

    public final void h(java.io.Closeable closeable, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2, boolean z) {
        int i;
        defpackage.ysr.bj(this.e != -1);
        a.l().ai(8678).w("Start car connection %d", this.e);
        this.f = z;
        sbo sboVar = new sbo(this);
        this.D = sboVar;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptor.getFileDescriptor());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
        defpackage.sbr sbrVar = new defpackage.sbr(closeable, b, this.e);
        defpackage.yqk yqkVar = defpackage.rvp.a;
        defpackage.rvk rvkVar = new defpackage.rvk();
        rvkVar.c = this;
        rvkVar.k = new defpackage.rvg(false);
        rvkVar.l = 2132017155;
        rvkVar.i = 2132017156;
        rvkVar.h = 2132017154;
        rvkVar.m = 2132083336;
        int i2 = this.e;
        if (i2 == 1) {
            rug rugVarA = ruh.a();
            rugVarA.d(true);
            rugVarA.e(true);
            rugVarA.c(1);
            rvkVar.n = rugVarA.a();
        } else if (i2 == 2) {
            rug rugVarA2 = ruh.a();
            rugVarA2.d(true);
            rugVarA2.e(true);
            rugVarA2.c(2);
            rugVarA2.b(16384);
            rvkVar.n = rugVarA2.a();
        }
        rvkVar.e = sboVar;
        rvkVar.b = sbrVar;
        rvkVar.g = fileInputStream;
        rvkVar.j = fileOutputStream;
        defpackage.qtp qtpVar = this.r;
        defpackage.rmn rmnVarA = defpackage.rmo.a();
        defpackage.ris risVar = qtpVar.a;
        rmnVarA.d(!defpackage.acsd.z() ? false : qtpVar.b.getBoolean("car_gal_snoop_log_video_ack", false));
        rmnVarA.c(!defpackage.acsd.z() ? false : qtpVar.b.getBoolean("car_gal_snoop_log_media_ack", false));
        rmnVarA.b(!defpackage.acsd.z() ? false : qtpVar.b.getBoolean("car_gal_snoop_log_guidance_ack", false));
        defpackage.rmo rmoVarA = rmnVarA.a();
        defpackage.rmc rmcVarA = defpackage.rmd.a();
        rmcVarA.c(defpackage.acsd.z() ? qtpVar.b.getBoolean("car_enable_gal_snoop", false) : false);
        int i3 = 100;
        if (defpackage.acsd.z()) {
            try {
                i = java.lang.Integer.parseInt(qtpVar.b.getString("car_gal_snoop_buffer_size", "100"));
            } catch (java.lang.NumberFormatException unused) {
                i = 100;
            }
            i3 = i >= 100 ? i : 100;
            if (i3 > 1000) {
                i3 = 1000;
            }
        }
        rmcVarA.b(i3);
        rmcVarA.a = rmoVarA;
        rvkVar.f = rmcVarA.a();
        this.d = new defpackage.rvp(rvkVar);
        if (this.s != null) {
            this.d.h(this.s);
        }
        java.lang.Boolean bool = this.q;
        defpackage.sbv sbvVar = this.c;
        if (bool == null) {
            sbvVar.b(2);
            defpackage.omv.h(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.f, null);
        } else {
            sbvVar.b(3);
            defpackage.omv.h(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.g, null);
            this.d.i();
        }
    }

    public final void i(boolean z, boolean z2) {
        if (!l()) {
            this.k = new com.google.android.gms.carsetup.CarSetupServiceImpl.ConnectionTransfer(this);
            android.content.Intent intent = new android.content.Intent("com.google.android.gms.car.TRANSFER");
            intent.setComponent((android.content.ComponentName) defpackage.riv.a.fF());
            intent.putExtra("connection", new com.google.android.gms.carsetup.BinderParcel(this.k));
            this.J.a(intent);
            defpackage.omv.g(this, "com.google.android.gms.car.CONNECTION_TRANSFER", defpackage.rsr.a.ordinal(), null);
            startService(intent);
            return;
        }
        this.t.q = z;
        this.t.r = z2;
        defpackage.sbq sbqVar = this.t;
        a.f().ai(8643).u("Starting transfer for handoff.");
        sbqVar.p = true;
        sbqVar.n.a(sbqVar.k, sbqVar.a(!sbqVar.o));
        android.content.Context context = sbqVar.e;
        defpackage.sbr sbrVar = new defpackage.sbr(new defpackage.stk(1), b, sbqVar.l);
        if (!sbqVar.s) {
            throw new java.lang.IllegalStateException("No component accepted the handoff.");
        }
        android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.gms.car.HANDOFF").setComponent((android.content.ComponentName) defpackage.riv.a.fF()).putExtra("car_handoff_session_id", sbqVar.k);
        defpackage.ris risVar = sbqVar.v;
        if (defpackage.acsj.a.fF().e()) {
            intentPutExtra.putExtra("car_handoff_connection_start_time_elapsed_nanos", sbqVar.x);
        }
        intentPutExtra.putExtra("car_handoff_component", sbqVar.w.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", !sbqVar.o).putExtra("car_handoff_connection_type", sbqVar.l).putExtra("connection_tag", sbqVar.m);
        sbqVar.g.a(intentPutExtra);
        if (sbqVar.i != null && android.os.Build.VERSION.SDK_INT >= 30) {
            intentPutExtra.putExtra("car_handoff_starting_bluetooth_device", sbqVar.i.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE"));
        }
        intentPutExtra.putExtra("car_handoff_analytics_session_id", (int) sbqVar.k);
        if (sbqVar.f()) {
            intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
        }
        intentPutExtra.putExtra("connection_tear_down_helper", new com.google.android.gms.carsetup.BinderParcel(new defpackage.sbw(sbrVar)));
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = sbqVar.d.j;
        if (carInfoInternal != null) {
            intentPutExtra.putExtra("car_handoff_car_info", defpackage.sqs.o(carInfoInternal));
        }
        intentPutExtra.putExtra("car_handoff_is_first_connection", sbqVar.q);
        context.startService(intentPutExtra);
        if (sbqVar.o) {
            return;
        }
        sbqVar.c.postDelayed(sbqVar.b, 5000L);
    }

    @Override // defpackage.scj
    public final void j(java.net.Socket socket) {
        defpackage.rbz.h(new sbj(this, socket, 1, (byte[]) null));
    }

    public final void k() {
        a.f().ai(8680).u("tearDown");
        com.google.android.gms.carsetup.FirstActivityImpl.n = false;
        this.H = false;
        defpackage.ser serVar = this.x;
        synchronized (serVar.b) {
            if (serVar.e) {
                defpackage.rxi rxiVar = serVar.f;
                if (rxiVar != null) {
                    try {
                        rxiVar.g(serVar);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                serVar.e = false;
            }
        }
        this.F.e(this);
        if (this.c.a() == 0) {
            defpackage.omv.g(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.h.ordinal(), null);
            return;
        }
        if (this.t != null) {
            defpackage.sbq sbqVar = this.t;
            a.f().ai(8645).u("Tearing down car connection");
            if (!sbqVar.p) {
                defpackage.shv shvVar = sbqVar.n;
                defpackage.sid.a.f().ai(8997).u("Tearing down car connection");
                ((defpackage.sid) shvVar).d().execute(new defpackage.sho(shvVar, 9));
            }
        }
        defpackage.rvp rvpVar = this.d;
        if (rvpVar != null) {
            rvpVar.f();
            this.d.e();
        }
        defpackage.slu sluVar = this.y;
        if (sluVar != null) {
            sluVar.b();
        }
        com.google.android.gms.carsetup.setup.UsbConnectionHelper usbConnectionHelper = this.B;
        synchronized (usbConnectionHelper.d) {
            defpackage.sts stsVar = usbConnectionHelper.e;
            if (stsVar != null) {
                try {
                    unregisterReceiver(stsVar);
                } catch (java.lang.IllegalArgumentException e) {
                    com.google.android.gms.carsetup.setup.UsbConnectionHelper.a.h().p(e).ai(8939).u("Unable to unregister USB disconnect receiver.");
                }
                usbConnectionHelper.e = null;
            }
        }
        defpackage.scl sclVar = this.i;
        if (sclVar != null) {
            defpackage.xei xeiVar = sclVar.p;
            if (xeiVar != null) {
                xeiVar.v();
            }
            sclVar.m(null);
            this.i = null;
        }
        this.v.removeCallbacksAndMessages(null);
        defpackage.sci sciVar = this.n;
        defpackage.yqk yqkVar = defpackage.sci.a;
        yqkVar.l().ai(8718).u("tearDown");
        if (sciVar.h) {
            sciVar.h = false;
            sciVar.b.unregisterReceiver(sciVar.l);
            sciVar.d();
            sciVar.f.execute(new defpackage.ryw(sciVar, 13));
        } else {
            yqkVar.l().ai(8719).u("Not initialized");
        }
        defpackage.sbg sbgVar = this.g;
        if (sbgVar != null) {
            sbgVar.a();
        }
        b();
        this.c.b(0);
        defpackage.omv.g(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.d.ordinal(), null);
        if (this.e == 1 && this.m) {
            a.f().ai(8681).u("Reader thread stuck after cable removal. Will kill process.");
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

    public final boolean l() {
        return this.t != null && this.t.s;
    }

    public final boolean m() {
        if (android.os.Build.VERSION.SDK_INT < 30 || ((java.lang.Boolean) this.p.fF()).booleanValue()) {
            return false;
        }
        a.g().ai(8673).u("Unable to handoff car connection (no components interested), tearing down");
        k();
        return true;
    }

    public final void n(int i) {
        scs scsVar;
        defpackage.omv.m(this, defpackage.rsr.c, i);
        if (l()) {
            com.google.android.gms.car.CarInfo carInfo = this.j.a;
            this.t.d(xiw.a);
        } else {
            com.google.android.gms.carsetup.CarSetupServiceImpl.ConnectionTransfer connectionTransfer = this.k;
            if (connectionTransfer != null && (scsVar = connectionTransfer.a) != null) {
                try {
                    scsVar.e();
                } catch (android.os.RemoteException unused) {
                }
            }
            defpackage.rvp rvpVar = this.d;
            if (rvpVar != null) {
                rvpVar.k();
                this.d.g(xiw.a);
            }
        }
        this.k = null;
        this.i = null;
        k();
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if ("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE".equals(intent.getAction())) {
            return new sco(this);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a.f().ai(8665).u("onCreate");
        super.onCreate();
        defpackage.omv.g(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.a.ordinal(), null);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            o();
            com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.c(this);
            this.K = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.d(this);
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CarSetupServiceImpl", 9);
        this.u = handlerThread;
        handlerThread.start();
        this.w = new defpackage.stq(android.os.Looper.getMainLooper());
        this.v = new defpackage.stq(this.u.getLooper());
        this.r = defpackage.qtp.a(this);
        java.lang.Boolean boolB = defpackage.rvr.a().b();
        if (boolB == null) {
            java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new defpackage.sbu(this));
            executorServiceNewSingleThreadExecutor.shutdown();
        } else {
            this.q = boolB;
        }
        this.g = new defpackage.sbg(this, null);
        this.n = new defpackage.sci(getApplicationContext(), new defpackage.ldx(this.g));
        this.F = a();
        this.C = new defpackage.sbt(this);
        this.B = new com.google.android.gms.carsetup.setup.UsbConnectionHelper(this.C);
        this.F.d(this, defpackage.rit.INSTANCE.a());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a.f().ai(8666).u("onDestroy");
        super.onDestroy();
        k();
        defpackage.omv.g(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.c.ordinal(), null);
        this.v.postDelayed(new defpackage.rzu(this, 2), 10000L);
        defpackage.shg shgVar = this.K;
        if (shgVar != null) {
            shgVar.a();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Service
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl;
        defpackage.ral rajVar;
        defpackage.slu sluVarC;
        this.I = i2;
        boolean z = intent != null && intent.getBooleanExtra("start_foreground_immediately", false);
        if (z) {
            o();
        }
        defpackage.yqk yqkVar = a;
        yqkVar.f().ai(8667).D("onStartCommand (id=%d): %s", i2, intent);
        if (intent == null) {
            yqkVar.f().ai(8672).u("Restarting with null intent");
            b();
            return 2;
        }
        com.google.android.gms.carsetup.setup.SetupBinder setupBinder = (com.google.android.gms.carsetup.setup.SetupBinder) intent.getParcelableExtra("EXTRA_LOCAL_BINDER");
        this.H = intent.getBooleanExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        if (java.lang.Boolean.FALSE.equals(this.q)) {
            yqkVar.f().ai(8671).u("Failed security update, aborting");
            b();
        } else {
            defpackage.sbv sbvVar = this.c;
            android.os.ParcelFileDescriptor parcelFileDescriptorE = null;
            if (sbvVar.c()) {
                yqkVar.f().ai(8670).u("Already connected; ignoring connection request");
                defpackage.omv.g(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.b.ordinal(), null);
                if (setupBinder == null) {
                    setupBinder = null;
                } else if (setupBinder.b() && (sluVarC = setupBinder.c()) != null) {
                    sluVarC.b();
                }
            } else {
                if (setupBinder == null) {
                    setupBinder = null;
                } else {
                    if (!setupBinder.b()) {
                        yqkVar.f().ai(8669).u("Restarted with invalid binder");
                        b();
                        return 2;
                    }
                    this.y = setupBinder.c();
                    intent = setupBinder.a;
                    intent.getClass();
                }
                sbvVar.b(1);
                defpackage.omv.g(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.e.ordinal(), null);
                this.h = 0;
                intent.setExtrasClassLoader(getClassLoader());
                this.E = intent.getBooleanExtra("suppress_restart", false);
                defpackage.yyg yygVar = defpackage.yyg.a;
                defpackage.abor aborVarN = yygVar.n();
                aborVarN.t();
                defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN.b;
                yygVar2.c |= 33554432;
                yygVar2.W = 2;
                this.g.d((defpackage.yyg) aborVarN.q(), defpackage.yyh.CAR_STARTUP_SERVICE_PROCESS);
                if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction()) || "com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(intent.getAction())) {
                    android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory != null) {
                        this.e = 1;
                        carSetupServiceImpl = this;
                        this.B.a(carSetupServiceImpl, usbAccessory, true, intent.getBooleanExtra("show_permission_errors", true), new sbh(this));
                    }
                    if (!z && carSetupServiceImpl.c.a() != 0) {
                        carSetupServiceImpl.o();
                    }
                } else if ("com.google.android.gms.car.WIFI_ACTION_BRIDGE".equals(intent.getAction())) {
                    if (intent.getStringExtra("PARAM_HOST_ADDRESS") == null || intent.getIntExtra("PARAM_SERVICE_PORT", -1) == -1) {
                        yqkVar.g().ai(8661).u("Failure to start wifi with invalid IP / Port");
                        k();
                    } else {
                        defpackage.sbg sbgVar = this.g;
                        defpackage.abor aborVarN2 = yygVar.n();
                        defpackage.abor aborVarN3 = defpackage.zbj.a.n();
                        aborVarN3.t();
                        defpackage.zbj zbjVar = (defpackage.zbj) aborVarN3.b;
                        zbjVar.b |= 1;
                        zbjVar.c = 2;
                        aborVarN2.t();
                        defpackage.yyg yygVar3 = (defpackage.yyg) aborVarN2.b;
                        defpackage.zbj zbjVar2 = (defpackage.zbj) aborVarN3.q();
                        zbjVar2.getClass();
                        yygVar3.G = zbjVar2;
                        yygVar3.c |= 16;
                        defpackage.yyh yyhVar = defpackage.yyh.WIRELESS_START;
                        int i3 = defpackage.ygw.d;
                        sbgVar.f(aborVarN2, yyhVar, defpackage.ymx.a);
                        android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) intent.getParcelableExtra("wifi_info");
                        this.e = 2;
                        this.o = wifiInfo != null ? java.lang.Math.max(wifiInfo.getFrequency(), 0) : 0;
                        yqkVar.l().ai(8662).w("Detected wifi frequency (MHz) is %d", this.o);
                        android.os.Bundle extras = intent.getExtras();
                        yqkVar.f().ai(8677).y("Start handoff wifi setup %s", extras);
                        p(new sbk(0), extras, new sbj(this, extras, 0));
                    }
                } else if ("com.google.android.gms.carsetup.START_DUPLEX".equals(intent.getAction())) {
                    this.e = intent.getIntExtra("connection_type", 0);
                    com.google.android.gms.carsetup.BinderParcel binderParcel = (com.google.android.gms.carsetup.BinderParcel) intent.getParcelableExtra("connection_fd");
                    if (binderParcel != null) {
                        android.os.IBinder iBinder = binderParcel.a;
                        if (iBinder == null) {
                            rajVar = null;
                        } else {
                            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                            rajVar = iInterfaceQueryLocalInterface instanceof defpackage.ral ? (defpackage.ral) iInterfaceQueryLocalInterface : new defpackage.raj(iBinder);
                        }
                        try {
                            parcelFileDescriptorE = rajVar.e();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    if (parcelFileDescriptorE == null) {
                        a.g().ai(8660).u("Failure starting");
                    } else {
                        this.h = intent.getIntExtra("connection_tag", -1);
                        f(parcelFileDescriptorE, parcelFileDescriptorE, intent.getBooleanExtra("start_activities", true));
                    }
                } else {
                    yqkVar.g().ai(8659).y("Unknown intent %s", intent);
                    k();
                }
                carSetupServiceImpl = this;
                if (!z) {
                    carSetupServiceImpl.o();
                }
            }
        }
        if (setupBinder != null && setupBinder.b()) {
            setupBinder.a();
        }
        return 1;
    }
}
