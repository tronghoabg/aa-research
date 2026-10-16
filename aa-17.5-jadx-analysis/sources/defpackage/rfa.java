package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class rfa {
    private static final ypf a = ols.R("CAR.AUDIO.PERF");
    private final ScheduledExecutorService b;
    private final float c;
    private final yzy d;
    private final rwz e;
    private boolean f;
    private Future g;
    private long h;
    private float i;
    private final List j;
    private final int k;

    public rfa(int i, int i2, xkj xkjVar, yzy yzyVar, rwz rwzVar, int i3) {
        spu spuVar = ssr.a;
        ScheduledExecutorService scheduledExecutorServiceAE = spu.aE();
        rhx rhxVar = rhx.c;
        this.g = null;
        float f = (i2 / i) * 1000.0f;
        this.c = (xkjVar == xkj.MEDIA_CODEC_AUDIO_AAC_LC || xkjVar == xkj.MEDIA_CODEC_AUDIO_AAC_LC_ADTS) ? f * 0.5f : f;
        this.d = yzyVar;
        this.e = rwzVar;
        this.k = i3;
        this.b = scheduledExecutorServiceAE;
        this.j = new ArrayList();
    }

    private final synchronized void f() {
        float f = this.i;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            g();
            this.i = 8.0f;
            this.f = false;
        } else if (f >= 16.0f) {
            a.f().ai(7923).u("Estimated audio frame buffer hit upper limit. Resetting audio frame buffer.");
            this.i = 8.0f;
        }
    }

    private final synchronized void g() {
        yop yopVarAi = a.h().l(1, TimeUnit.SECONDS).ai(7925);
        yzy yzyVar = this.d;
        String str = yzyVar.sn;
        int i = this.k;
        yopVarAi.M("Audio stream performance at %s for stream type %s predicted that audio buffer underrun is likely on the head unit", str, wub.r(i));
        yzz yzzVarAR = roc.aR(i);
        if (yzzVarAR != null) {
            this.e.d(yzzVarAR, yzyVar);
        }
    }

    private final synchronized void h(boolean z) {
        List list = this.j;
        if (list.size() >= 33 || z) {
            yop yopVarAi = a.f().ai(7924);
            int i = this.k;
            yopVarAi.R("Estimated buffer list in the last %d seconds for stream type %s is %s", 10, wub.r(i), list.toString());
            list.clear();
        }
    }

    public final synchronized void a() {
        woy.aa(this.g != null, "addFrameToBuffer may have been called without calling ensureTrackerStarted.");
        this.i += 1.0f;
        if (this.f) {
            return;
        }
        a.l().ai(7920).y("Sent first audio frame for stream type %s.", wub.r(this.k));
        this.f = true;
        this.h = SystemClock.elapsedRealtime();
    }

    public final synchronized void b() {
        if (!this.f) {
            this.j.add(Float.valueOf(this.i));
            a.l().ai(7921).u("Skipping computation of estimated buffer as no frame has been sent since tracker starter or since last buffer underrun.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.h;
        this.h = jElapsedRealtime;
        float f = this.i - (j / this.c);
        this.i = f;
        this.j.add(Float.valueOf(f));
        h(false);
        f();
    }

    public final synchronized void c() {
        Future future = this.g;
        if (future != null) {
            if (future.isDone()) {
                try {
                    this.g.get();
                } catch (InterruptedException e) {
                    this.g = null;
                    this.f = false;
                    a.h().ai(7928).u("Current thread running stop tracker was interrupted.");
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("trackingAndLoggingFuture.get() was interrupted.", e);
                } catch (CancellationException e2) {
                    e = e2;
                    yop yopVarAi = a.h().ai(7927);
                    Future future2 = this.g;
                    future2.getClass();
                    yopVarAi.y("trackingAndLoggingFuture was cancelled: %s", Boolean.valueOf(future2.isCancelled()));
                    throw new IllegalStateException("trackingAndLoggingFuture did not complete successfully and ran into an exception.", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    yop yopVarAi2 = a.h().ai(7927);
                    Future future22 = this.g;
                    future22.getClass();
                    yopVarAi2.y("trackingAndLoggingFuture was cancelled: %s", Boolean.valueOf(future22.isCancelled()));
                    throw new IllegalStateException("trackingAndLoggingFuture did not complete successfully and ran into an exception.", e);
                }
            }
            Future future3 = this.g;
            future3.getClass();
            if (!future3.cancel(false)) {
                throw new IllegalStateException("trackingAndLoggingFuture couldn't be canceled for some reason.");
            }
            this.g = null;
            a.l().ai(7926).M("Bitrate based buffer approximation stopped at location %s for stream type %s", this.d.sn, wub.r(this.k));
        }
        this.f = false;
        if (this.j.isEmpty()) {
            return;
        }
        h(true);
    }

    public final synchronized void d() {
        this.b.shutdownNow();
        this.g = null;
        a.l().ai(7929).M("Bitrate based buffer approximation torn down at location %s for stream type %s", this.d.sn, wub.r(this.k));
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void e() {
        woy.aa(this.c != BitmapDescriptorFactory.HUE_RED, "durationOfAudioFrameInMs = 0, something went wrong in initialization of the AudioStreamPerformanceTracker.");
        if (this.g == null) {
            ScheduledExecutorService scheduledExecutorService = this.b;
            if (!scheduledExecutorService.isShutdown()) {
                this.g = scheduledExecutorService.scheduleAtFixedRate(new ral(this, 7), 300L, 300L, TimeUnit.MILLISECONDS);
                this.i = 8.0f;
                a.l().ai(7922).M("Bitrate based buffer approximation started at location %s for stream type %s", this.d.sn, wub.r(this.k));
            }
        }
    }
}
