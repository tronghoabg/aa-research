package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zvt {
    public static final /* synthetic */ int d = 0;
    public final android.content.Context a;
    public final defpackage.xzi b;
    public final defpackage.xzi c;
    private defpackage.hrf e;

    public zvt(final android.content.Context context, final defpackage.aaac aaacVar, final defpackage.ztp ztpVar, final defpackage.wfz wfzVar, final defpackage.zps zpsVar) {
        this.a = context;
        this.c = defpackage.ysr.aQ(new defpackage.xew(context, 6));
        new defpackage.zvs(this);
        this.b = defpackage.ysr.aQ(new defpackage.xzi() { // from class: zvp
            @Override // defpackage.xzi
            public final java.lang.Object fF() {
                android.content.Context context2 = context;
                java.lang.String packageName = context2.getPackageName();
                defpackage.zue zueVar = defpackage.zue.a;
                java.lang.String strValueOf = java.lang.String.valueOf(zueVar.a(context2, packageName).versionCode);
                java.lang.String strC = zueVar.c(defpackage.zlv.c);
                defpackage.hrf hrfVarA = this.a.a();
                int i = aaacVar.c;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                defpackage.skr skrVar = defpackage.skr.a;
                int iA = defpackage.sli.a(context2);
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iA);
                java.lang.String str = defpackage.ztw.a;
                defpackage.zlv.n(context2, "Context");
                java.lang.String str2 = defpackage.ztw.a;
                if (defpackage.zsr.e(str2, 4)) {
                    android.util.Log.i(str2, "Using GMM server: ".concat(defpackage.adfj.c()));
                }
                java.lang.String strC2 = defpackage.adfj.c();
                defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.xew(context2, 5));
                android.os.StrictMode.ThreadPolicy threadPolicyB = defpackage.zsv.a.b();
                try {
                    android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
                    defpackage.zsv.a.d(threadPolicyB);
                    int i2 = defpackage.zlv.j;
                    defpackage.zlv.n(context2, "context");
                    defpackage.zlv.n(packageName, "applicationName");
                    defpackage.abor aborVarN = defpackage.accx.a.n();
                    aborVarN.t();
                    defpackage.accx accxVar = (defpackage.accx) aborVarN.b;
                    packageName.getClass();
                    accxVar.b |= 1024;
                    accxVar.i = packageName;
                    aborVarN.t();
                    defpackage.accx accxVar2 = (defpackage.accx) aborVarN.b;
                    accxVar2.H = 3;
                    accxVar2.c |= 134217728;
                    numValueOf.getClass();
                    aborVarN.t();
                    defpackage.accx accxVar3 = (defpackage.accx) aborVarN.b;
                    accxVar3.c |= 8192;
                    accxVar3.E = i;
                    numValueOf2.getClass();
                    aborVarN.t();
                    defpackage.accx accxVar4 = (defpackage.accx) aborVarN.b;
                    accxVar4.c |= 16384;
                    accxVar4.F = iA;
                    if (strValueOf != null) {
                        aborVarN.t();
                        defpackage.accx accxVar5 = (defpackage.accx) aborVarN.b;
                        accxVar5.c |= 64;
                        accxVar5.y = strValueOf;
                    }
                    aborVarN.t();
                    defpackage.accx accxVar6 = (defpackage.accx) aborVarN.b;
                    java.lang.String str3 = android.os.Build.VERSION.SDK;
                    str3.getClass();
                    accxVar6.b |= 33554432;
                    accxVar6.s = str3;
                    aborVarN.t();
                    defpackage.accx accxVar7 = (defpackage.accx) aborVarN.b;
                    accxVar7.b |= 134217728;
                    accxVar7.t = false;
                    aborVarN.t();
                    defpackage.accx accxVar8 = (defpackage.accx) aborVarN.b;
                    accxVar8.b |= 256;
                    accxVar8.h = true;
                    aborVarN.t();
                    defpackage.accx accxVar9 = (defpackage.accx) aborVarN.b;
                    accxVar9.b |= 65536;
                    accxVar9.m = "SYSTEM";
                    aborVarN.t();
                    defpackage.accx accxVar10 = (defpackage.accx) aborVarN.b;
                    accxVar10.c |= 128;
                    accxVar10.z = "9.0.0";
                    aborVarN.t();
                    defpackage.accx accxVar11 = (defpackage.accx) aborVarN.b;
                    accxVar11.b |= 2048;
                    accxVar11.j = true;
                    if (i2 > 200) {
                        aborVarN.t();
                        defpackage.accx accxVar12 = (defpackage.accx) aborVarN.b;
                        accxVar12.p = 3;
                        accxVar12.b |= 2097152;
                    } else {
                        aborVarN.t();
                        defpackage.accx accxVar13 = (defpackage.accx) aborVarN.b;
                        accxVar13.p = 1;
                        accxVar13.b |= 2097152;
                    }
                    android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context2.getSystemService("phone");
                    if (telephonyManager != null) {
                        java.lang.String simCountryIso = telephonyManager.getSimCountryIso();
                        if (!defpackage.zlv.G(simCountryIso)) {
                            aborVarN.t();
                            defpackage.accx accxVar14 = (defpackage.accx) aborVarN.b;
                            simCountryIso.getClass();
                            accxVar14.b |= 16;
                            accxVar14.g = simCountryIso;
                        }
                    }
                    defpackage.zps zpsVar2 = zpsVar;
                    defpackage.ztw ztwVar = new defpackage.ztw(context2, strC2, strC, xziVarAQ, (defpackage.accx) aborVarN.q(), sharedPreferences, hrfVarA, ztpVar, defpackage.zsg.a, new java.util.Random(), defpackage.ztd.f("DataRequestDispatcher"), wfzVar, zpsVar2);
                    ztwVar.m();
                    ztwVar.d.addIfAbsent(new defpackage.zzx((byte[]) null));
                    return ztwVar;
                } catch (java.lang.Throwable th) {
                    defpackage.zsv.a.d(threadPolicyB);
                    throw th;
                }
            }
        });
        synchronized (this) {
            new java.util.HashSet();
            this.e = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xzi] */
    public final synchronized defpackage.hrf a() {
        if (this.e == null) {
            android.content.Context context = this.a;
            defpackage.kqe kqeVar = new defpackage.kqe(new defpackage.hdw());
            android.os.StrictMode.ThreadPolicy threadPolicyA = defpackage.zsv.a.a();
            try {
                defpackage.ztt zttVar = new defpackage.ztt(new defpackage.ttq(new java.io.File(context.getCacheDir(), "com.google.android.libraries.maps.volley")), kqeVar, new defpackage.ztr(((java.lang.Integer) j$.util.Optional.ofNullable((java.lang.Integer) defpackage.zsi.a(context).c.fF()).orElse(20971520)).intValue()), new defpackage.hqv(new android.os.Handler(android.os.Looper.getMainLooper())));
                defpackage.zsv.a.d(threadPolicyA);
                this.e = zttVar;
                defpackage.hqr hqrVar = zttVar.g;
                if (hqrVar != null) {
                    hqrVar.a();
                }
                defpackage.hqx[] hqxVarArr = zttVar.f;
                for (int i = 0; i < 4; i++) {
                    defpackage.hqx hqxVar = hqxVarArr[i];
                    if (hqxVar != null) {
                        hqxVar.a = true;
                        hqxVar.interrupt();
                    }
                }
                java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = zttVar.c;
                java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue2 = zttVar.d;
                defpackage.ttq ttqVar = zttVar.i;
                defpackage.hri hriVar = zttVar.e;
                zttVar.g = new defpackage.hqr(priorityBlockingQueue, priorityBlockingQueue2, ttqVar, hriVar);
                zttVar.g.start();
                for (int i2 = 0; i2 < 4; i2++) {
                    defpackage.hqx hqxVar2 = new defpackage.hqx(priorityBlockingQueue2, zttVar.j, ttqVar, hriVar);
                    hqxVarArr[i2] = hqxVar2;
                    hqxVar2.start();
                }
            } catch (java.lang.Throwable th) {
                defpackage.zsv.a.d(threadPolicyA);
                throw th;
            }
        }
        return this.e;
    }
}
