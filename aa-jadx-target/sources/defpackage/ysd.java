package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ysd extends defpackage.yrw {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final java.util.concurrent.atomic.AtomicReference d;
    private static final java.util.concurrent.atomic.AtomicLong e;
    private static final j$.util.concurrent.ConcurrentLinkedQueue f;
    private volatile defpackage.yqu g;

    static {
        a = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        b = "goldfish".equals(android.os.Build.HARDWARE) || "ranchu".equals(android.os.Build.HARDWARE);
        c = "eng".equals(android.os.Build.TYPE) || "userdebug".equals(android.os.Build.TYPE);
        d = new java.util.concurrent.atomic.AtomicReference();
        e = new java.util.concurrent.atomic.AtomicLong();
        f = new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    public ysd(java.lang.String str) {
        super(str);
        if (a || b) {
            this.g = new yrx().a(f());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        defpackage.ysf ysfVar = defpackage.ysh.c;
        java.lang.String str2 = ysfVar.a;
        boolean z = ysfVar.b;
        int i = ysfVar.f;
        this.g = new defpackage.ysf(str2, z, 2, java.util.logging.Level.OFF, ysfVar.d, ysfVar.e).a(f());
    }

    public static void c() {
        while (true) {
            defpackage.ysd ysdVar = (defpackage.ysd) defpackage.ysc.a.poll();
            if (ysdVar == null) {
                d();
                return;
            }
            ysdVar.g = ((defpackage.yry) d.get()).a(ysdVar.f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yqt] */
    private static void d() {
        while (true) {
            defpackage.rkq rkqVar = (defpackage.rkq) f.poll();
            if (rkqVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = rkqVar.b;
            java.lang.Object obj = rkqVar.a;
            if (!r1.h()) {
                if (((defpackage.yqu) obj).b(r1.g())) {
                }
            }
            ((defpackage.yqu) obj).a(r1);
        }
    }

    @Override // defpackage.yqu
    public final void a(defpackage.yqt yqtVar) {
        if (this.g != null) {
            this.g.a(yqtVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            android.util.Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new defpackage.rkq(this, yqtVar));
        if (this.g != null) {
            d();
        }
    }

    @Override // defpackage.yqu
    public final boolean b(java.util.logging.Level level) {
        return this.g == null || this.g.b(level);
    }

    @Override // defpackage.yrw, defpackage.yqu
    public final void g(java.lang.RuntimeException runtimeException, defpackage.yqt yqtVar) {
        if (this.g != null) {
            this.g.g(runtimeException, yqtVar);
        } else {
            android.util.Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
