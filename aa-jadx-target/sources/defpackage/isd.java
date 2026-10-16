package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isd {
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.AUDIO.PERF");
    final java.lang.String a;
    private final java.util.concurrent.ScheduledExecutorService c;
    private final float d;
    private final defpackage.zbd e;
    private final defpackage.jfo f;
    private boolean g;
    private java.util.concurrent.Future h;
    private long i;
    private float j;
    private final java.util.List k;
    private int l;
    private final java.util.List m;
    private final int n;

    public isd(int i, int i2, defpackage.xlk xlkVar, defpackage.zbd zbdVar, defpackage.jfo jfoVar, int i3) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1);
        this.h = null;
        float f = (i2 / i) * 1000.0f;
        this.d = defpackage.itj.a(xlkVar) ? f * 0.5f : f;
        this.e = zbdVar;
        this.f = jfoVar;
        this.n = i3;
        this.c = scheduledExecutorServiceNewScheduledThreadPool;
        this.k = new java.util.ArrayList();
        this.a = defpackage.sqs.be(i3).concat(": Estimated HU buffer at BH");
        this.l = 0;
        this.m = new java.util.ArrayList();
    }

    private final synchronized void f() {
        if (this.j < 0.0f) {
            h();
            this.j = 0.0f;
            ((defpackage.yqj) b.l().ai((char) 1264)).y("Buffer underrun detected for stream type %s. Reset sentFirstAudioFrame.", defpackage.sqs.be(this.n));
            this.g = false;
        }
    }

    private final synchronized void g() {
        defpackage.zbe zbeVarBb = defpackage.tna.bb(this.n);
        if (zbeVarBb == null || this.l <= 0) {
            return;
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, zbeVarBb, this.e);
        rrvVarH.w(this.l);
        java.util.List list = this.m;
        rrvVarH.t = defpackage.xyn.h(defpackage.ygw.o(list));
        this.f.b(rrvVarH.l());
        this.l = 0;
        list.clear();
    }

    private final synchronized void h() {
        this.l++;
        java.util.List list = this.m;
        if (list.size() < 100) {
            list.add(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
        }
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).l(1, java.util.concurrent.TimeUnit.SECONDS)).ai(1266)).R("Audio stream performance at %s for stream type %s predicted that audio buffer underrun is likely on the head unit. Underrun count: %d", this.e.sn, defpackage.sqs.be(this.n), java.lang.Integer.valueOf(this.l));
    }

    private final synchronized void i(boolean z) {
        java.util.List list = this.k;
        if (list.size() >= 66 || z) {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) b.f()).ai(1265);
            int i = this.n;
            yqjVar.R("Estimated buffer list in the last %d seconds for stream type %s is %s", 10, defpackage.sqs.be(i), list.toString());
            list.clear();
        }
    }

    public final synchronized void a() {
        defpackage.ysr.bk(this.h != null, "addFrameToBuffer may have been called without calling ensureTrackerStarted.");
        this.j += 1.0f;
        if (this.g) {
            return;
        }
        ((defpackage.yqj) b.l().ai((char) 1261)).y("Sent first audio frame for stream type %s.", defpackage.sqs.be(this.n));
        this.g = true;
        this.i = android.os.SystemClock.elapsedRealtime();
    }

    public final synchronized void b() {
        if (!this.g) {
            this.k.add(java.lang.Float.valueOf(this.j));
            ((defpackage.yqj) ((defpackage.yqj) b.l().l(1, java.util.concurrent.TimeUnit.SECONDS)).ai(1262)).u("Skipping computation of estimated buffer as no frame has been sent since tracker starter or since last buffer underrun.");
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.i;
        this.i = jElapsedRealtime;
        float f = this.j - (j / this.d);
        this.j = f;
        defpackage.fdp.a(this.a, (int) f);
        this.k.add(java.lang.Float.valueOf(this.j));
        i(false);
        f();
    }

    public final synchronized void c() {
        java.util.concurrent.Future future = this.h;
        if (future != null) {
            if (future.isDone()) {
                try {
                    this.h.get();
                } catch (java.lang.InterruptedException e) {
                    this.h = null;
                    this.g = false;
                    ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 1269)).u("Current thread running stop tracker was interrupted.");
                    java.lang.Thread.currentThread().interrupt();
                    throw new java.lang.IllegalStateException("trackingAndLoggingFuture.get() was interrupted.", e);
                } catch (java.util.concurrent.CancellationException e2) {
                    e = e2;
                    defpackage.ypu ypuVarH = b.h();
                    java.util.concurrent.Future future2 = this.h;
                    future2.getClass();
                    ((defpackage.yqj) ((defpackage.yqj) ypuVarH).ai((char) 1268)).y("trackingAndLoggingFuture was cancelled: %s", java.lang.Boolean.valueOf(future2.isCancelled()));
                    throw new java.lang.IllegalStateException("trackingAndLoggingFuture did not complete successfully and ran into an exception.", e);
                } catch (java.util.concurrent.ExecutionException e3) {
                    e = e3;
                    defpackage.ypu ypuVarH2 = b.h();
                    java.util.concurrent.Future future3 = this.h;
                    future3.getClass();
                    ((defpackage.yqj) ((defpackage.yqj) ypuVarH2).ai((char) 1268)).y("trackingAndLoggingFuture was cancelled: %s", java.lang.Boolean.valueOf(future3.isCancelled()));
                    throw new java.lang.IllegalStateException("trackingAndLoggingFuture did not complete successfully and ran into an exception.", e);
                }
            }
            java.util.concurrent.Future future4 = this.h;
            future4.getClass();
            if (!future4.cancel(false)) {
                throw new java.lang.IllegalStateException("trackingAndLoggingFuture couldn't be canceled for some reason.");
            }
            this.h = null;
            ((defpackage.yqj) b.l().ai(1267)).M("Bitrate based buffer approximation stopped at location %s for stream type %s", this.e.sn, defpackage.sqs.be(this.n));
        }
        this.g = false;
        g();
        if (this.k.isEmpty()) {
            return;
        }
        i(true);
    }

    public final synchronized void d() {
        this.c.shutdownNow();
        this.h = null;
        ((defpackage.yqj) b.l().ai(1270)).M("Bitrate based buffer approximation torn down at location %s for stream type %s", this.e.sn, defpackage.sqs.be(this.n));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean e() {
        if (this.h != null) {
            return true;
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService.isShutdown()) {
            return false;
        }
        defpackage.ysr.bk(this.d != 0.0f, "durationOfAudioFrameInMs = 0, something went wrong in initialization of the AudioStreamPerformanceTracker.");
        this.h = scheduledExecutorService.scheduleWithFixedDelay(new defpackage.iqv(this, 9), 150L, 150L, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.j = 1.0f;
        this.l = 0;
        this.m.clear();
        ((defpackage.yqj) b.l().ai(1263)).M("Bitrate based buffer approximation started at location %s for stream type %s", this.e.sn, defpackage.sqs.be(this.n));
        return true;
    }
}
