package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ywc extends defpackage.zga {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.ywc.class.getCanonicalName());
    public static final java.lang.Object b = new java.lang.Object();
    public static final defpackage.ytn i = new defpackage.ytn();
    public final defpackage.xzi c;
    public final defpackage.yvw d;
    public final defpackage.xyp e;
    public final defpackage.xzg f;
    public final defpackage.zhw g;
    private final java.util.concurrent.Executor o;
    public volatile int h = 0;
    private final java.util.concurrent.atomic.AtomicReference p = new java.util.concurrent.atomic.AtomicReference(defpackage.ysr.cp(new java.lang.Object()));

    public ywc(defpackage.xzi xziVar, defpackage.yvw yvwVar, defpackage.xyp xypVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.xzo xzoVar) {
        this.c = xziVar;
        this.d = yvwVar;
        this.e = xypVar;
        this.o = new defpackage.ywa(this, executor);
        this.g = defpackage.ysr.cg(scheduledExecutorService);
        this.f = defpackage.xzg.b(xzoVar);
        d(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        c(new defpackage.ozv(17), executor);
    }

    @Override // defpackage.zga
    protected final void b() {
        defpackage.zhs zhsVar = (defpackage.zhs) this.p.getAndSet(defpackage.ysr.co());
        if (zhsVar != null) {
            boolean z = true;
            if (isCancelled() && !q()) {
                z = false;
            }
            zhsVar.cancel(z);
        }
    }

    public final void d(final long j, final java.util.concurrent.TimeUnit timeUnit) {
        defpackage.zif zifVar = new defpackage.zif();
        defpackage.zhs zhsVarG = (defpackage.zhs) this.p.getAndSet(zifVar);
        if (j != 0) {
            zhsVarG = defpackage.zgh.g(zhsVarG, new defpackage.zgn() { // from class: yvx
                @Override // defpackage.zgn
                public final defpackage.zhs a(java.lang.Object obj) {
                    return this.a.g.schedule(new defpackage.wdz(3), j, timeUnit);
                }
            }, defpackage.zgt.INSTANCE);
        }
        defpackage.zgn zgnVar = new defpackage.zgn() { // from class: yvy
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zhs] */
            @Override // defpackage.zgn
            public final defpackage.zhs a(java.lang.Object obj) {
                defpackage.ywc ywcVar = this.a;
                ywcVar.h++;
                try {
                    return ywcVar.c.fF();
                } catch (java.lang.Exception e) {
                    ywcVar.p(e);
                    return defpackage.ysr.cp(null);
                }
            }
        };
        java.util.concurrent.Executor executor = this.o;
        final defpackage.zhs zhsVarG2 = defpackage.zgh.g(zhsVarG, zgnVar, executor);
        zifVar.r(defpackage.zfz.g(zhsVarG2, java.lang.Exception.class, new defpackage.zgn() { // from class: yvz
            @Override // defpackage.zgn
            public final defpackage.zhs a(java.lang.Object obj) throws defpackage.yvs {
                j$.time.Duration durationOfNanos;
                defpackage.zhs zhsVar = zhsVarG2;
                java.lang.Exception exc = (java.lang.Exception) obj;
                if (zhsVar.isCancelled()) {
                    return zhsVar;
                }
                defpackage.ywc ywcVar = this.a;
                int i2 = ywcVar.h;
                ywcVar.f.c().getClass();
                defpackage.yvw yvwVar = ((defpackage.yvv) ywcVar.d).a;
                if (!yvwVar.a(i2)) {
                    durationOfNanos = defpackage.yvw.d;
                } else if (i2 == 0) {
                    durationOfNanos = j$.time.Duration.ZERO;
                } else {
                    durationOfNanos = !yvwVar.a(i2) ? defpackage.yvw.d : j$.time.Duration.ofNanos((long) (defpackage.zft.a(((defpackage.yvu) yvwVar).b) * java.lang.Math.pow(2.0d, i2 - 1)));
                }
                if (!durationOfNanos.isNegative() && !durationOfNanos.isZero()) {
                    long jA = defpackage.zft.a(durationOfNanos);
                    double dRandom = java.lang.Math.random() - 0.5d;
                    durationOfNanos = j$.time.Duration.ofNanos(defpackage.ytn.m(jA, defpackage.zft.a(j$.time.Duration.ofNanos((long) ((dRandom + dRandom) * 0.5d * jA)))));
                }
                long millis = durationOfNanos.toMillis();
                if (millis < 0 || !ywcVar.e.a(exc)) {
                    defpackage.ywc.a.logp(java.util.logging.Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (java.lang.Throwable) exc);
                    int i3 = ywcVar.h;
                    throw new defpackage.yvs(exc);
                }
                defpackage.ywc.a.logp(java.util.logging.Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (java.lang.Throwable) exc);
                ywcVar.d(millis, java.util.concurrent.TimeUnit.MILLISECONDS);
                return defpackage.ysr.cp(defpackage.ywc.b);
            }
        }, executor));
        zifVar.c(new defpackage.ywb(this, zifVar), defpackage.zgt.INSTANCE);
    }

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zhs zhsVar = (defpackage.zhs) this.p.get();
        java.lang.String string = zhsVar.toString();
        defpackage.yvw yvwVar = this.d;
        defpackage.xyp xypVar = this.e;
        return "futureSupplier=[" + this.c.toString() + "], shouldContinue=[" + xypVar.toString() + "], strategy=[" + yvwVar.toString() + "], tries=[" + this.h + "]" + (zhsVar.isDone() ? "" : defpackage.a.bp(string, ", activeTry=[", "]"));
    }
}
