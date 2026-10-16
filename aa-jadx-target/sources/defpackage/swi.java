package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class swi {
    public static volatile defpackage.sqs f;
    private static final long g;
    private static volatile java.util.concurrent.ScheduledExecutorService h;
    private static final java.lang.Object i;
    defpackage.stk c;
    public final java.lang.String d;
    private final android.os.PowerManager.WakeLock j;
    private java.util.concurrent.Future k;
    private long l;
    private int o;
    private android.os.WorkSource p;
    private final java.util.concurrent.ScheduledExecutorService r;
    public final java.lang.Object a = new java.lang.Object();
    public int b = 0;
    private final java.util.Set m = new java.util.HashSet();
    private boolean n = true;
    private final java.util.Map q = new java.util.HashMap();
    public java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger(0);

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        g = 31622400000L;
        h = null;
        i = new java.lang.Object();
        f = new defpackage.sqs();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public swi(android.content.Context context, int i2, java.lang.String str) throws xzp {
        if (context == null) {
            throw new java.lang.NullPointerException("WakeLock: context must not be null");
        }
        defpackage.sqs.ay(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        android.os.WorkSource workSource = null;
        this.c = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.d = str;
        } else {
            this.d = "*gcore*:".concat(str);
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        defpackage.ysr.aP(powerManager, new java.lang.Object[0]);
        this.j = powerManager.newWakeLock(i2, str);
        if (defpackage.squ.b(context)) {
            int i3 = sqt.a;
            if (context.getPackageManager() != null) {
                try {
                    android.content.pm.ApplicationInfo applicationInfoH = defpackage.sqx.a.a(context).h("com.google.android.gms", 0);
                    if (applicationInfoH == null) {
                        android.util.Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat("com.google.android.gms"));
                    } else {
                        int i4 = applicationInfoH.uid;
                        workSource = new android.os.WorkSource();
                        defpackage.squ.a(workSource, i4, "com.google.android.gms");
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    android.util.Log.e("WorkSourceUtil", "Could not find package: ".concat("com.google.android.gms"));
                }
            }
            this.p = workSource;
            if (workSource != null) {
                h(this.j, workSource);
            }
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = h;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (i) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = h;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    defpackage.sqs sqsVar = defpackage.stp.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new defpackage.sto(0)));
                    h = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void h(android.os.PowerManager.WakeLock wakeLock, android.os.WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException e) {
            android.util.Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a() {
        java.util.Set set = this.m;
        if (set.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void c() {
        this.e.incrementAndGet();
        d(30000L);
    }

    public final void d(long j) {
        long jMax = java.lang.Math.max(java.lang.Math.min(Long.MAX_VALUE, g), 1L);
        if (j > 0) {
            jMax = java.lang.Math.min(j, jMax);
        }
        synchronized (this.a) {
            if (!b()) {
                this.c = defpackage.stk.a;
                this.j.acquire();
                android.os.SystemClock.elapsedRealtime();
            }
            this.b++;
            this.o++;
            i();
            java.util.Map map = this.q;
            defpackage.mgr mgrVar = (defpackage.mgr) map.get(null);
            if (mgrVar == null) {
                mgrVar = new defpackage.mgr(null);
                map.put(null, mgrVar);
            }
            mgrVar.a++;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j2 > this.l) {
                this.l = j2;
                java.util.concurrent.Future future = this.k;
                if (future != null) {
                    future.cancel(false);
                }
                this.k = this.r.schedule(new defpackage.rzu(this, 11), jMax, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void e() {
        if (this.e.decrementAndGet() < 0) {
            android.util.Log.w("WakeLock", java.lang.String.format("%s release without a matched acquire!", this.d));
        }
        synchronized (this.a) {
            i();
            java.util.Map map = this.q;
            if (map.containsKey(null)) {
                defpackage.mgr mgrVar = (defpackage.mgr) map.get(null);
                if (mgrVar != null) {
                    int i2 = mgrVar.a - 1;
                    mgrVar.a = i2;
                    if (i2 == 0) {
                        map.remove(null);
                    }
                }
            } else {
                android.util.Log.w("WakeLock", this.d + " counter does not exist");
            }
            f();
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (b()) {
                if (this.n) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                a();
                java.util.Map map = this.q;
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((defpackage.mgr) it.next()).a = 0;
                }
                map.clear();
                java.util.concurrent.Future future = this.k;
                if (future != null) {
                    future.cancel(false);
                    this.k = null;
                    this.l = 0L;
                }
                this.o = 0;
                android.os.PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                            if (this.c != null) {
                                this.c = null;
                            }
                        } catch (java.lang.RuntimeException e) {
                            if (!e.getClass().equals(java.lang.RuntimeException.class)) {
                                throw e;
                            }
                            android.util.Log.e("WakeLock", java.lang.String.format("%s failed to release!", this.d), e);
                            if (this.c != null) {
                                this.c = null;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        if (this.c != null) {
                            this.c = null;
                        }
                        throw th;
                    }
                } else {
                    defpackage.sqs.aW("%s should be held!", this.d);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            this.n = false;
        }
    }

    private final void i() {
    }
}
