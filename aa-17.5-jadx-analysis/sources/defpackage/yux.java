package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class yux extends zeu {
    public static final Logger a = Logger.getLogger(yux.class.getCanonicalName());
    public static final Object b = new Object();
    public static final zeb i = new zeb();
    public final xyc c;
    public final yur d;
    public final xxj e;
    public final xya f;
    public final zgt g;
    private final Executor o;
    public volatile int h = 0;
    private final AtomicReference p = new AtomicReference(wub.Y(new Object()));

    public yux(xyc xycVar, yur yurVar, xxj xxjVar, Executor executor, ScheduledExecutorService scheduledExecutorService, xyi xyiVar) {
        this.c = xycVar;
        this.d = yurVar;
        this.e = xxjVar;
        this.o = new yuv(this, executor);
        this.g = yrm.aJ(scheduledExecutorService);
        this.f = xya.b(xyiVar);
        d(0L, TimeUnit.MILLISECONDS);
        c(new oyx(16), executor);
    }

    @Override // defpackage.zeu
    protected final void b() {
        zgp zgpVar = (zgp) this.p.getAndSet(wub.X());
        if (zgpVar != null) {
            boolean z = true;
            if (isCancelled() && !q()) {
                z = false;
            }
            zgpVar.cancel(z);
        }
    }

    public final void d(final long j, final TimeUnit timeUnit) {
        zhc zhcVar = new zhc();
        zgp zgpVarG = (zgp) this.p.getAndSet(zhcVar);
        if (j != 0) {
            zgpVarG = zfb.g(zgpVarG, new zfk() { // from class: yus
                @Override // defpackage.zfk
                public final zgp a(Object obj) {
                    return this.a.g.schedule(new wdd(3), j, timeUnit);
                }
            }, zfq.a);
        }
        zfk zfkVar = new zfk() { // from class: yut
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zgp] */
            @Override // defpackage.zfk
            public final zgp a(Object obj) {
                yux yuxVar = this.a;
                yuxVar.h++;
                try {
                    return yuxVar.c.gu();
                } catch (Exception e) {
                    yuxVar.p(e);
                    return wub.Y(null);
                }
            }
        };
        Executor executor = this.o;
        final zgp zgpVarG2 = zfb.g(zgpVarG, zfkVar, executor);
        zhcVar.r(zet.g(zgpVarG2, Exception.class, new zfk() { // from class: yuu
            @Override // defpackage.zfk
            public final zgp a(Object obj) throws yun {
                zgp zgpVar = zgpVarG2;
                Exception exc = (Exception) obj;
                if (zgpVar.isCancelled()) {
                    return zgpVar;
                }
                yux yuxVar = this.a;
                int i2 = yuxVar.h;
                yuxVar.f.c().getClass();
                yur yurVar = ((yuq) yuxVar.d).a;
                Duration durationOfNanos = !yurVar.a(i2) ? yur.d : i2 == 0 ? Duration.ZERO : !yurVar.a(i2) ? yur.d : Duration.ofNanos((long) (zen.a(((yup) yurVar).b) * Math.pow(2.0d, i2 - 1)));
                if (!durationOfNanos.isNegative() && !durationOfNanos.isZero()) {
                    long jA = zen.a(durationOfNanos);
                    double dRandom = Math.random() - 0.5d;
                    durationOfNanos = Duration.ofNanos(zeb.s(jA, zen.a(Duration.ofNanos((long) ((dRandom + dRandom) * 0.5d * jA)))));
                }
                long millis = durationOfNanos.toMillis();
                if (millis < 0 || !yuxVar.e.a(exc)) {
                    yux.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc);
                    int i3 = yuxVar.h;
                    throw new yun(exc);
                }
                yux.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc);
                yuxVar.d(millis, TimeUnit.MILLISECONDS);
                return wub.Y(yux.b);
            }
        }, executor));
        zhcVar.c(new yuw(this, zhcVar), zfq.a);
    }

    @Override // defpackage.zeu
    protected final String fO() {
        zgp zgpVar = (zgp) this.p.get();
        String string = zgpVar.toString();
        yur yurVar = this.d;
        xxj xxjVar = this.e;
        return "futureSupplier=[" + this.c.toString() + "], shouldContinue=[" + xxjVar.toString() + "], strategy=[" + yurVar.toString() + "], tries=[" + this.h + "]" + (zgpVar.isDone() ? "" : a.bq(string, ", activeTry=[", "]"));
    }
}
