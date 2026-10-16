package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class snf implements android.os.Handler.Callback {
    public static defpackage.snf d;
    public final android.content.Context g;
    public final defpackage.skr h;
    public final android.os.Handler q;
    public volatile boolean r;
    public final defpackage.wdm s;
    private com.google.android.gms.common.internal.TelemetryData v;
    private android.util.SparseArray w;
    private sqb x;
    private spz y;
    private volatile defpackage.erh z;
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.", null, null);
    public static final java.lang.Object c = new java.lang.Object();
    private static final java.lang.Object t = new java.lang.Object();
    private static volatile boolean u = false;
    public long e = 10000;
    public boolean f = false;
    public final java.util.concurrent.atomic.AtomicInteger i = new java.util.concurrent.atomic.AtomicInteger(1);
    public final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.Map k = new j$.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    public smz l = null;
    public final java.util.Set m = new defpackage.zf(0);
    public final java.util.Set n = new defpackage.zf(0);
    public final java.util.Set o = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public final java.util.Set p = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    private snf(android.content.Context context, android.os.Looper looper, defpackage.skr skrVar) {
        this.r = true;
        this.g = context;
        defpackage.stq stqVar = new defpackage.stq(looper, this);
        this.q = stqVar;
        this.h = skrVar;
        this.s = new defpackage.wdm(skrVar);
        if (defpackage.sqj.b(context)) {
            this.r = false;
        }
        stqVar.sendMessage(stqVar.obtainMessage(6));
    }

    public static com.google.android.gms.common.api.Status a(defpackage.smo smoVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        return new com.google.android.gms.common.api.Status(connectionResult, "API: " + smoVar.a() + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(connectionResult));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.snf c(android.content.Context context) {
        defpackage.snf snfVar;
        synchronized (c) {
            snfVar = d;
            if (snfVar == null) {
                android.os.Looper looper = defpackage.sox.a().getLooper();
                boolean zA = defpackage.sov.a(context.getPackageName());
                u = zA;
                defpackage.snf snfVar2 = new defpackage.snf(context.getApplicationContext(), looper, defpackage.skr.a);
                if (zA) {
                    defpackage.sor.u = defpackage.sot.a(snfVar2.g);
                }
                d = snfVar2;
                snfVar = snfVar2;
            }
        }
        return snfVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final defpackage.snb k(defpackage.slw slwVar) {
        java.util.Map map = this.k;
        defpackage.smo smoVar = slwVar.f;
        defpackage.snb snbVar = (defpackage.snb) map.get(smoVar);
        if (snbVar == null) {
            snbVar = new defpackage.snb(this, slwVar);
            map.put(smoVar, snbVar);
            this.o.remove(smoVar);
            this.p.remove(smoVar);
        }
        if (snbVar.q()) {
            this.n.add(smoVar);
        }
        snbVar.d();
        return snbVar;
    }

    private final void l() {
        com.google.android.gms.common.internal.TelemetryData telemetryData = this.v;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || g()) {
                n().a(telemetryData);
            }
            this.v = null;
        }
    }

    private final void m() {
        android.util.SparseArray sparseArray = this.w;
        if (sparseArray == null) {
            return;
        }
        if (sparseArray.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(sparseArray.size());
            android.content.Context context = this.g;
            java.lang.String packageName = context.getPackageName();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                ubv ubvVar = (ubv) sparseArray.valueAt(i);
                arrayList.add(new com.google.android.gms.common.internal.ClientThrottlingTelemetryData.ClientThrottlingEventData(iKeyAt, packageName, ubvVar.b, ubvVar.a));
            }
            spz spzVar = this.y;
            if (spzVar == null) {
                spzVar = new spz(context);
                this.y = spzVar;
            }
            spzVar.a(new com.google.android.gms.common.internal.ClientThrottlingTelemetryData(arrayList));
        }
        this.w = null;
    }

    private final sqb n() {
        sqb sqbVar = this.x;
        if (sqbVar != null) {
            return sqbVar;
        }
        sqb sqbVar2 = new sqb(this.g, spp.a);
        this.x = sqbVar2;
        return sqbVar2;
    }

    final defpackage.snb b(defpackage.smo smoVar) {
        return (defpackage.snb) this.k.get(smoVar);
    }

    public final void d(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        if (h(connectionResult, i)) {
            return;
        }
        android.os.Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void e() {
        android.os.Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(smz smzVar) {
        synchronized (c) {
            if (this.l != smzVar) {
                this.l = smzVar;
                this.m.clear();
            }
            this.m.addAll(smzVar.e);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = defpackage.spn.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int iE = this.s.e(203400000);
        return iE == -1 || iE == 0;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final boolean h(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.app.PendingIntent pendingIntentA;
        defpackage.skr skrVar = this.h;
        int i2 = connectionResult.c;
        if (!skrVar.f(i2)) {
            android.util.Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(connectionResult))));
            return false;
        }
        android.content.Context context = this.g;
        if (defpackage.tis.t(context) || (pendingIntentA = skrVar.a(context, connectionResult)) == null) {
            return false;
        }
        skrVar.j(context, new com.google.android.gms.common.ConnectionResult(1, i2, stl.a(context, com.google.android.gms.common.api.GoogleApiActivity.a(context, pendingIntentA, i, true), stl.a | 134217728), connectionResult.e, connectionResult.f));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0353  */
    /* JADX WARN: Code duplicated, block: B:173:0x0383  */
    /* JADX WARN: Code duplicated, block: B:175:0x0389  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:177:0x03bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Map] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v16 snb, still in use, count: 2, list:
          (r1v16 snb) from 0x037b: IGET (r1v16 snb) A[WRAPPED] (LINE:892) snb.g int
          (r1v16 snb) from 0x0381: PHI (r1 I:??) = (r1v13 snb), (r1v16 snb) binds: [B:171:0x0380, B:243:0x0381] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snf.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public final void i(defpackage.lhe lheVar, int i, defpackage.slw slwVar) {
        defpackage.snf snfVar;
        if (i != 0) {
            defpackage.smo smoVar = slwVar.f;
            defpackage.snp snpVar = null;
            if (g()) {
                com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = defpackage.spn.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        defpackage.snb snbVarB = b(smoVar);
                        if (snbVarB != null) {
                            java.lang.Object obj = snbVarB.b;
                            if (obj instanceof defpackage.sok) {
                                defpackage.sok sokVar = (defpackage.sok) obj;
                                if (!sokVar.B() || sokVar.q()) {
                                    z = z2;
                                } else {
                                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = defpackage.snp.b(snbVarB, sokVar, i);
                                    if (connectionTelemetryConfigurationB != null) {
                                        snbVarB.k++;
                                        z = connectionTelemetryConfigurationB.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    snfVar = this;
                }
                long jCurrentTimeMillis = z ? java.lang.System.currentTimeMillis() : 0L;
                long jElapsedRealtime = z ? android.os.SystemClock.elapsedRealtime() : 0L;
                snfVar = this;
                snpVar = new defpackage.snp(snfVar, i, smoVar, jCurrentTimeMillis, jElapsedRealtime);
            } else {
                snfVar = this;
            }
            if (snpVar != null) {
                java.lang.Object obj2 = lheVar.a;
                android.os.Handler handler = snfVar.q;
                handler.getClass();
                ((defpackage.swx) obj2).i(new defpackage.czu(handler, 9), snpVar);
            }
        }
    }

    public final defpackage.erh j() {
        defpackage.erh erhVar;
        defpackage.erh erhVar2 = this.z;
        if (erhVar2 != null) {
            return erhVar2;
        }
        synchronized (t) {
            erhVar = this.z;
            if (erhVar == null) {
                erhVar = new defpackage.erh((short[]) null);
                this.z = erhVar;
            }
        }
        return erhVar;
    }
}
