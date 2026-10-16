package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class jkh {
    public static final yph a = yph.c("CAR.WM");
    public final jkk b;
    public final jem c;
    private final jfg r;
    public volatile jkf d = new jkf(this);
    public volatile jkf e = null;
    public final ntn o = new ntn(this.d);
    public final ntn p = new ntn(this.d);
    public final ntn q = new ntn(this.d);
    private final ntn t = new ntn(this.d);
    private final AtomicInteger s = new AtomicInteger(0);
    public boolean f = true;
    public long g = 0;
    public long h = 868609787896528896L;
    public double i = 3.3333333333333332E7d;
    public final AtomicInteger k = new AtomicInteger(0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final AtomicInteger m = new AtomicInteger(0);
    public volatile boolean n = false;
    public final double j = acyn.a.gu().c();

    public jkh(jkk jkkVar, jem jemVar, jfg jfgVar) {
        this.b = jkkVar;
        this.c = jemVar;
        this.r = jfgVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized long a(long j, long j2) {
        ntn ntnVar = this.o;
        jkf jkfVarB = ntnVar.b();
        if (j2 != 0) {
            jkf jkfVar = jkfVarB;
            while (true) {
                if (jkfVar == null || jkfVar.a == null) {
                    break;
                }
                if (jkfVar.h / 1000 != j2) {
                    jkfVar = jkfVar.a;
                } else {
                    while (jkfVarB != null && jkfVar != jkfVarB) {
                        ((ype) ((ype) a.h()).ai(2251)).x("Lost frame in encoder! Codec time: %d", jkfVarB.h);
                        this.c.j.i();
                        if (this.f) {
                            this.f = false;
                            this.r.e(yzz.PROJECTION_WINDOW_MANAGER, yzy.GQ);
                        }
                        this.k.incrementAndGet();
                        jkfVarB.d = j;
                        jkfVarB = ntnVar.b();
                        jkk jkkVar = this.b;
                        jkkVar.D();
                        jkkVar.C();
                    }
                }
            }
            if (jkfVar == null) {
                this.m.incrementAndGet();
                ((ype) ((ype) ((ype) a.h()).l(5, TimeUnit.SECONDS)).ai(2250)).u("Unable to find frame timestamp.");
            }
        }
        if (jkfVarB == null) {
            ((ype) ((ype) a.h()).ai((char) 2249)).u("More frames are encoded than were sent to the encoder");
            return 0L;
        }
        long j3 = jkfVarB.g;
        jkfVarB.d = j;
        d();
        return jkfVarB.b;
    }

    public final synchronized void b(long j) {
        while (true) {
            jkf jkfVarC = this.o.c();
            if (jkfVarC == null || j - jkfVarC.b < 2000000000) {
                break;
            }
            ((ype) ((ype) a.h()).ai((char) 2248)).u("Frame stuck or lost in encoder!");
            this.c.j.i();
            if (this.f) {
                this.f = false;
                this.r.e(yzz.PROJECTION_WINDOW_MANAGER, yzy.GP);
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
            jkf jkfVarB = this.t.b();
            if (jkfVarB == null) {
                return;
            } else {
                jkfVarB.a();
            }
        }
    }

    public final void d() {
        AtomicInteger atomicInteger = this.s;
        if (atomicInteger.incrementAndGet() > 1000) {
            ((ype) ((ype) a.h()).ai((char) 2254)).u("Frame timings are not being retired!");
            c();
            this.n = true;
            return;
        }
        while (true) {
            ntn ntnVar = this.t;
            jkf jkfVarC = ntnVar.c();
            if (jkfVarC == null || jkfVarC.d == 0 || jkfVarC.e == 0 || jkfVarC.f == 0) {
                return;
            }
            ntnVar.b();
            atomicInteger.set(0);
            jkfVarC.a();
        }
    }

    public final void e(xop xopVar) {
        jkf jkfVar = this.e;
        if (jkfVar == null || !jkfVar.c(xopVar)) {
            this.c.I(xopVar);
        }
    }
}
