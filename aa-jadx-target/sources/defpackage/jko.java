package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jko {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM");
    public final defpackage.jkr b;
    public final defpackage.jeu c;
    private final defpackage.jfo r;
    public volatile defpackage.jkm d = new defpackage.jkm(this);
    public volatile defpackage.jkm e = null;
    public final defpackage.nub o = new defpackage.nub(this.d);
    public final defpackage.nub p = new defpackage.nub(this.d);
    public final defpackage.nub q = new defpackage.nub(this.d);
    private final defpackage.nub t = new defpackage.nub(this.d);
    private final java.util.concurrent.atomic.AtomicInteger s = new java.util.concurrent.atomic.AtomicInteger(0);
    public boolean f = true;
    public long g = 0;
    public long h = 868609787896528896L;
    public double i = 3.3333333333333332E7d;
    public final java.util.concurrent.atomic.AtomicInteger k = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger l = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger m = new java.util.concurrent.atomic.AtomicInteger(0);
    public volatile boolean n = false;
    public final double j = defpackage.aczp.a.fF().c();

    public jko(defpackage.jkr jkrVar, defpackage.jeu jeuVar, defpackage.jfo jfoVar) {
        this.b = jkrVar;
        this.c = jeuVar;
        this.r = jfoVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized long a(long j, long j2) {
        defpackage.nub nubVar = this.o;
        defpackage.jkm jkmVarB = nubVar.b();
        if (j2 != 0) {
            defpackage.jkm jkmVar = jkmVarB;
            while (jkmVar != null && jkmVar.a != null) {
                if (jkmVar.h / 1000 == j2) {
                    while (jkmVarB != null && jkmVar != jkmVarB) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2252)).x("Lost frame in encoder! Codec time: %d", jkmVarB.h);
                        this.c.j.i();
                        if (this.f) {
                            this.f = false;
                            this.r.e(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.GU);
                        }
                        this.k.incrementAndGet();
                        jkmVarB.d = j;
                        jkmVarB = nubVar.b();
                        defpackage.jkr jkrVar = this.b;
                        jkrVar.D();
                        jkrVar.C();
                    }
                    break;
                }
                jkmVar = jkmVar.a;
            }
            if (jkmVar == null) {
                this.m.incrementAndGet();
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(5, java.util.concurrent.TimeUnit.SECONDS)).ai(2251)).u("Unable to find frame timestamp.");
            }
        }
        if (jkmVarB == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2250)).u("More frames are encoded than were sent to the encoder");
            return 0L;
        }
        long j3 = jkmVarB.g;
        jkmVarB.d = j;
        d();
        return jkmVarB.b;
    }

    public final synchronized void b(long j) {
        while (true) {
            defpackage.jkm jkmVarC = this.o.c();
            if (jkmVarC == null || j - jkmVarC.b < 2000000000) {
                break;
                break;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2249)).u("Frame stuck or lost in encoder!");
            this.c.j.i();
            if (this.f) {
                this.f = false;
                this.r.e(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.GT);
            }
            this.l.incrementAndGet();
            a(j, 0L);
        }
    }

    public final void c() {
        this.s.set(0);
        this.e = null;
        this.o.d();
        this.p.d();
        this.q.d();
        while (true) {
            defpackage.jkm jkmVarB = this.t.b();
            if (jkmVarB == null) {
                return;
            } else {
                jkmVarB.a();
            }
        }
    }

    public final void d() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.s;
        if (atomicInteger.incrementAndGet() > 1000) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2255)).u("Frame timings are not being retired!");
            c();
            this.n = true;
            return;
        }
        while (true) {
            defpackage.nub nubVar = this.t;
            defpackage.jkm jkmVarC = nubVar.c();
            if (jkmVarC == null || jkmVarC.d == 0 || jkmVarC.e == 0 || jkmVarC.f == 0) {
                return;
            }
            nubVar.b();
            atomicInteger.set(0);
            jkmVarC.a();
        }
    }

    public final void e(defpackage.xpq xpqVar) {
        defpackage.jkm jkmVar = this.e;
        if (jkmVar == null || !jkmVar.c(xpqVar)) {
            this.c.I(xpqVar);
        }
    }
}
