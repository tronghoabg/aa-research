package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsc implements java.lang.Runnable, defpackage.ztp, defpackage.zsd {
    static final long a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    public static final /* synthetic */ int k = 0;
    private static final java.lang.String l = "zsc";
    public final android.content.Context f;
    public final java.lang.String g;
    public long h;
    public final defpackage.zsf i;
    public final defpackage.zse j;
    private final java.util.concurrent.ScheduledExecutorService m;
    private java.util.concurrent.Future n;
    private final java.util.Random o;
    private int p;
    private final java.util.Set q = new java.util.HashSet();
    private final java.util.concurrent.Executor r;
    private defpackage.zxm s;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        a = 300000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        b = 60000L;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
        c = 10000L;
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.HOURS;
        d = 3600000L;
        java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.SECONDS;
        e = 5000L;
    }

    public zsc(android.content.Context context, java.lang.String str, java.util.Random random, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.zsf zsfVar, defpackage.zse zseVar, java.util.concurrent.Executor executor) {
        this.f = context;
        this.g = str;
        this.o = random;
        this.m = scheduledExecutorService;
        this.i = zsfVar;
        this.j = zseVar;
        this.r = executor;
    }

    private final void h(long j) throws java.lang.Throwable {
        java.util.concurrent.Future future = this.n;
        if (future != null) {
            future.cancel(false);
        }
        if (j != 0) {
            this.n = this.m.schedule(this, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            this.n = null;
            run();
        }
    }

    @Override // defpackage.ztp
    public final synchronized java.lang.String a() {
        defpackage.zxm zxmVar = this.s;
        if (zxmVar == null) {
            return null;
        }
        return (java.lang.String) zxmVar.b;
    }

    @Override // defpackage.ztp
    public final void b(defpackage.zto ztoVar) {
        boolean zIsEmpty;
        if (g()) {
            ztoVar.a(this);
            return;
        }
        java.util.Set set = this.q;
        synchronized (set) {
            zIsEmpty = set.isEmpty();
            set.add(ztoVar);
        }
        if (zIsEmpty) {
            h(0L);
        }
    }

    @Override // defpackage.ztp
    public final void c() {
        java.lang.String str = l;
        if (defpackage.zsr.e(str, 4)) {
            android.util.Log.i(str, "Token rejected");
        }
        synchronized (this) {
            this.s = null;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis < this.h + b) {
                return;
            }
            this.h = jCurrentTimeMillis;
            this.i.a();
        }
    }

    @Override // defpackage.zsd
    public final void d(java.lang.String str) {
        java.lang.String str2 = l;
        if (defpackage.zsr.e(str2, 6)) {
            android.util.Log.e(str2, str);
        }
        java.util.concurrent.Future future = this.n;
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void e() throws java.lang.Throwable {
        h(java.lang.Math.min(d, (long) ((c * java.lang.Math.pow(1.6d, this.p)) + (this.o.nextDouble() * e))));
        this.p++;
    }

    public final void f(java.lang.String str, long j, long j2) throws java.lang.Throwable {
        this.p = 0;
        long j3 = j2 - a;
        if (j3 > 0) {
            java.lang.String str2 = l;
            if (defpackage.zsr.e(str2, 4)) {
                android.util.Log.i(str2, "Scheduling next attempt in " + (j3 / 1000) + " seconds.");
            }
            h(j3);
        }
        synchronized (this) {
            this.s = new defpackage.zxm(str, j);
        }
        java.util.Set<defpackage.zto> set = this.q;
        synchronized (set) {
            for (defpackage.zto ztoVar : set) {
                if (ztoVar != null) {
                    ztoVar.a(this);
                }
            }
            set.clear();
        }
    }

    public final synchronized boolean g() {
        return this.s != null;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() throws java.lang.Throwable {
        defpackage.zsc zscVar;
        try {
            try {
                defpackage.zxm zxmVarC = this.i.c(this.g);
                if (zxmVarC != null) {
                    long j = zxmVarC.a;
                    long jCurrentTimeMillis = j - java.lang.System.currentTimeMillis();
                    java.lang.Object obj = zxmVarC.b;
                    if (jCurrentTimeMillis > a) {
                        java.lang.String str = l;
                        if (defpackage.zsr.e(str, 4)) {
                            android.util.Log.i(str, defpackage.a.bH(jCurrentTimeMillis, "Token loaded from file. Expires in: ", " ms."));
                        }
                        f((java.lang.String) obj, j, jCurrentTimeMillis);
                        return;
                    }
                    java.lang.String str2 = l;
                    if (defpackage.zsr.e(str2, 4)) {
                        android.util.Log.i(str2, "Saved token has expired. Fetching a new one.");
                    }
                    if (defpackage.adel.a.fF().j() && !defpackage.zsj.b(this.f)) {
                        if (defpackage.zsr.e(str2, 4)) {
                            android.util.Log.i(str2, "Device is offline. Keeping saved token until network connection is available.");
                        }
                        f((java.lang.String) obj, j, jCurrentTimeMillis);
                        this.r.execute(new defpackage.xgr(this, 6));
                        return;
                    }
                    zscVar = this;
                    zscVar.c();
                } else {
                    zscVar = this;
                }
                if (defpackage.zsj.b(zscVar.f)) {
                    zscVar.j.b(zscVar);
                    return;
                }
                java.lang.String str3 = l;
                if (defpackage.zsr.e(str3, 4)) {
                    android.util.Log.i(str3, "Waiting for active network connection to fetch a new auth token.");
                }
                zscVar.r.execute(new defpackage.xgr(zscVar, 7));
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
