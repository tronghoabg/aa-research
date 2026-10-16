package defpackage;

import android.view.Choreographer;
import android.view.animation.AnimationUtils;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class tsl implements Choreographer.FrameCallback, uyl {
    private static final yob e = yob.c("com/google/android/libraries/geo/mapcore/internal/ActiveFrameRateRegulator");
    public volatile long a;
    private volatile long f;
    private volatile long g;
    private long h;
    private volatile long j;
    private final Choreographer l;
    private final xyc m;
    private boolean n;
    private boolean o;
    private final usy u;
    private volatile usy v;
    private final ykd w;
    public volatile boolean b = false;
    private long i = 0;
    public boolean c = false;
    private boolean k = true;
    private volatile boolean p = true;
    private int t = 1;
    private boolean q = false;
    private int r = 0;
    private final AtomicInteger s = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);

    public tsl(ykd ykdVar, usy usyVar, xyc xycVar, int i, int i2, Choreographer choreographer) {
        this.w = ykdVar;
        this.l = choreographer;
        this.u = usyVar;
        this.m = xycVar;
        this.v = new usy(usyVar);
        g(30L);
        if (i2 != 0) {
            int i3 = 1000 / i2;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.g = 1000 / i;
    }

    private final long i() {
        return (this.h + this.f) - 3;
    }

    private static String j(long j, long j2) {
        return String.format(Locale.US, "%d (%d ms ago)", Long.valueOf(j), Long.valueOf(j2 - j));
    }

    private final void k() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.l.postFrameCallback(this);
        this.j = AnimationUtils.currentAnimationTimeMillis();
    }

    public final synchronized void a() {
        this.o = true;
        k();
    }

    public final synchronized void c(boolean z) {
        Object obj = this.w.a;
        ((umn) obj).m.c(z);
        ((umn) obj).v.c(new tuh(z));
        if (this.k != z) {
            if (!z) {
                this.k = false;
                this.i = 0L;
                f();
            } else {
                this.k = true;
                if (!this.o) {
                    this.l.removeFrameCallback(this);
                    this.n = false;
                }
            }
        }
    }

    public final synchronized void d() {
        this.t = 1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        vaq.d();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long j2 = j / 1000000;
        boolean z2 = i() - j2 > 0;
        this.i = j2;
        this.c = ((tth) this.m.gu()).d();
        if (z2) {
            z = z2;
        } else {
            uts utsVar = ((umn) this.w.a).g;
            utsVar.getClass();
            z = !utsVar.m();
        }
        if (this.p && z) {
            if (z2) {
                this.d.incrementAndGet();
            }
            this.s.incrementAndGet();
            this.l.postFrameCallback(this);
            return;
        }
        this.r++;
        synchronized (this) {
            this.n = false;
            this.o = false;
            int i = this.t;
            if (i == 3 || (i == 1 && this.j < i())) {
                this.q = true;
            } else if (this.t == 1) {
                this.q = false;
            }
            this.t = 2;
        }
        this.h = j2;
        this.v = new usy(this.u);
        uts utsVar2 = ((umn) this.w.a).g;
        utsVar2.getClass();
        utsVar2.j();
    }

    public final synchronized void e() {
        this.t = 3;
    }

    public final synchronized void f() {
        if (this.k) {
            return;
        }
        k();
    }

    public final void g(long j) {
        ((ynz) ((ynz) e.d()).ai(9134)).x("Frame rate set to %d", j);
        this.a = j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f = 1000 / j;
    }

    @Override // defpackage.uyl
    public final synchronized void gt(String str, PrintWriter printWriter) {
        String strConcat = str.concat("FrameRateRegulator:");
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        printWriter.println(strConcat);
        printWriter.println(str + "  targetFrameRate: " + this.a);
        printWriter.println(str + "  targetFrameTimeMs: " + this.f);
        printWriter.println(str.concat("  adaptiveFrameRateEnabled: false"));
        printWriter.println(str + "  enableUseGestureAnimationForInteractionDuration: false");
        printWriter.println(str + "  isAnimating: " + this.c + " (source: hasOngoingAnimation)");
        printWriter.println(str + "  isPaused: " + this.k);
        printWriter.println(str + "  waitingForFrame: " + this.n);
        printWriter.println(str + "  forceNextFrame: " + this.o);
        int i = this.t;
        printWriter.println(a.bJ(i != 1 ? i != 2 ? i != 3 ? "null" : "WAITING_FOR_FINISH" : "WAITING_FOR_START" : "IDLE", str, "  rendererState: "));
        printWriter.println(str + "  renderedFramesCount: " + this.r);
        printWriter.println(str + "  skippedFramesCount: " + this.s.get());
        printWriter.println(str + "  last frame request: " + j(this.j, jCurrentAnimationTimeMillis));
        printWriter.println(str + "  last doFrame: " + j(this.i, jCurrentAnimationTimeMillis));
        printWriter.println(str + "  last rendered frame: " + j(this.h, jCurrentAnimationTimeMillis));
    }

    public final synchronized boolean h() {
        return this.q;
    }
}
