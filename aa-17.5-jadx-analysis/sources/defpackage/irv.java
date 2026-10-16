package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class irv {
    private static final yph b = yph.c("CAR.AUDIO.PERF");
    final String a;
    private final ScheduledExecutorService c;
    private final float d;
    private final yzy e;
    private final jfg f;
    private boolean g;
    private Future h;
    private long i;
    private float j;
    private final List k;
    private int l;
    private final List m;
    private final int n;

    public irv(int i, int i2, xkj xkjVar, yzy yzyVar, jfg jfgVar, int i3) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.h = null;
        float f = (i2 / i) * 1000.0f;
        this.d = itb.a(xkjVar) ? f * 0.5f : f;
        this.e = yzyVar;
        this.f = jfgVar;
        this.n = i3;
        this.c = scheduledExecutorServiceNewScheduledThreadPool;
        this.k = new ArrayList();
        this.a = wub.r(i3).concat(": Estimated HU buffer at BH");
        this.l = 0;
        this.m = new ArrayList();
    }

    private final synchronized void f() {
        if (this.j < BitmapDescriptorFactory.HUE_RED) {
            h();
            this.j = BitmapDescriptorFactory.HUE_RED;
            ((ype) b.l().ai((char) 1264)).y("Buffer underrun detected for stream type %s. Reset sentFirstAudioFrame.", wub.r(this.n));
            this.g = false;
        }
    }

    private final synchronized void g() {
        yzz yzzVarAR = roc.aR(this.n);
        if (yzzVarAR == null || this.l <= 0) {
            return;
        }
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzzVarAR, this.e);
        rrbVarH.w(this.l);
        List list = this.m;
        rrbVarH.t = xxh.h(yfq.o(list));
        this.f.b(rrbVarH.l());
        this.l = 0;
        list.clear();
    }

    private final synchronized void h() {
        this.l++;
        List list = this.m;
        if (list.size() < 100) {
            list.add(Long.valueOf(Instant.now().toEpochMilli()));
        }
        ((ype) ((ype) ((ype) b.h()).l(1, TimeUnit.SECONDS)).ai(1266)).R("Audio stream performance at %s for stream type %s predicted that audio buffer underrun is likely on the head unit. Underrun count: %d", this.e.sn, wub.r(this.n), Integer.valueOf(this.l));
    }

    private final synchronized void i(boolean z) {
        List list = this.k;
        if (list.size() >= 66 || z) {
            ype ypeVar = (ype) ((ype) b.f()).ai(1265);
            int i = this.n;
            ypeVar.R("Estimated buffer list in the last %d seconds for stream type %s is %s", 10, wub.r(i), list.toString());
            list.clear();
        }
    }

    public final synchronized void a() {
        woy.aa(this.h != null, "addFrameToBuffer may have been called without calling ensureTrackerStarted.");
        this.j += 1.0f;
        if (this.g) {
            return;
        }
        ((ype) b.l().ai((char) 1261)).y("Sent first audio frame for stream type %s.", wub.r(this.n));
        this.g = true;
        this.i = SystemClock.elapsedRealtime();
    }

    public final synchronized void b() {
        if (!this.g) {
            this.k.add(Float.valueOf(this.j));
            ((ype) ((ype) b.l().l(1, TimeUnit.SECONDS)).ai(1262)).u("Skipping computation of estimated buffer as no frame has been sent since tracker starter or since last buffer underrun.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.i;
        this.i = jElapsedRealtime;
        float f = this.j - (j / this.d);
        this.j = f;
        fdi.a(this.a, (int) f);
        this.k.add(Float.valueOf(this.j));
        i(false);
        f();
    }

    public final synchronized void c() {
        Future future = this.h;
        if (future != null) {
            if (future.isDone()) {
                try {
                    this.h.get();
                } catch (InterruptedException e) {
                    this.h = null;
                    this.g = false;
                    ((ype) ((ype) b.h()).ai((char) 1269)).u("Current thread running stop tracker was interrupted.");
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("trackingAndLoggingFuture.get() was interrupted.", e);
                } catch (CancellationException e2) {
                    e = e2;
                    yop yopVarH = b.h();
                    Future future2 = this.h;
                    future2.getClass();
                    ((ype) ((ype) yopVarH).ai((char) 1268)).y("trackingAndLoggingFuture was cancelled: %s", Boolean.valueOf(future2.isCancelled()));
                    throw new IllegalStateException("trackingAndLoggingFuture did not complete successfully and ran into an exception.", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    yop yopVarH2 = b.h();
                    Future future22 = this.h;
                    future22.getClass();
                    ((ype) ((ype) yopVarH2).ai((char) 1268)).y("trackingAndLoggingFuture was cancelled: %s", Boolean.valueOf(future22.isCancelled()));
                    throw new IllegalStateException("trackingAndLoggingFuture did not complete successfully and ran into an exception.", e);
                }
            }
            Future future3 = this.h;
            future3.getClass();
            if (!future3.cancel(false)) {
                throw new IllegalStateException("trackingAndLoggingFuture couldn't be canceled for some reason.");
            }
            this.h = null;
            ((ype) b.l().ai(1267)).M("Bitrate based buffer approximation stopped at location %s for stream type %s", this.e.sn, wub.r(this.n));
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
        ((ype) b.l().ai(1270)).M("Bitrate based buffer approximation torn down at location %s for stream type %s", this.e.sn, wub.r(this.n));
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean e() {
        if (this.h != null) {
            return true;
        }
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService.isShutdown()) {
            return false;
        }
        woy.aa(this.d != BitmapDescriptorFactory.HUE_RED, "durationOfAudioFrameInMs = 0, something went wrong in initialization of the AudioStreamPerformanceTracker.");
        this.h = scheduledExecutorService.scheduleWithFixedDelay(new ire(this, 2), 150L, 150L, TimeUnit.MILLISECONDS);
        this.j = 1.0f;
        this.l = 0;
        this.m.clear();
        ((ype) b.l().ai(1263)).M("Bitrate based buffer approximation started at location %s for stream type %s", this.e.sn, wub.r(this.n));
        return true;
    }
}
