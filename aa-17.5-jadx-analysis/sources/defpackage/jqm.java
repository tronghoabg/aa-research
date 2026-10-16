package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class jqm extends jbi {
    public static final yph a = yph.c("CAR.GAL.LATENCY");
    public final AtomicBoolean b;
    public final Object c;
    public final Handler d;
    public final int e;
    public final int f;
    public final joc g;
    public final Duration h;
    public final ArrayDeque i;
    public final jql j;
    public izt k;
    private final int l;
    private final Runnable m;

    public jqm(Context context, int i, int i2, int i3, jfg jfgVar) {
        super(context, acnv.f());
        this.b = new AtomicBoolean(false);
        this.c = new Object();
        this.d = new Handler(Looper.getMainLooper());
        this.i = new ArrayDeque();
        this.j = new jql();
        this.e = i;
        this.f = i2;
        this.l = i3;
        this.g = new job(job.d, jfgVar);
        if (!acrb.x()) {
            this.h = Duration.ZERO;
            this.m = new ily(6);
        } else {
            this.h = (acrb.D() ? Duration.ofMillis(acrb.u().b) : Duration.ofSeconds(3L)).minus(Duration.ofMillis(acrb.j()));
            this.m = new jlh(this, context, 10);
        }
    }

    @Override // defpackage.jbi, defpackage.izs
    public final void a(izt iztVar) {
        synchronized (this.c) {
            this.k = iztVar;
        }
    }

    @Override // defpackage.jbi, defpackage.izs
    public final void b() {
        synchronized (this.c) {
            this.k = null;
        }
        if (this.b.compareAndSet(true, false)) {
            ((ype) a.l().ai((char) 2650)).u("Stopping...");
            this.d.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.jbi, defpackage.izs
    public final void c(xmh xmhVar) {
        izt iztVar;
        TimeUnit.SECONDS.getClass();
        long j = xmhVar.c;
        if (acrb.x()) {
            this.d.removeCallbacks(this.m);
        }
        synchronized (this.c) {
            iztVar = this.k;
        }
        if (iztVar != null) {
            iztVar.e(xmhVar.c);
            if (acrb.x()) {
                this.d.postDelayed(this.m, this.h.toMillis());
            }
        } else {
            ((ype) ((ype) a.f()).ai((char) 2640)).u("onPingRequest: ControlEndPoint has not been registered yet.");
        }
        e(xmhVar);
    }

    @Override // defpackage.jbi, defpackage.izs
    public final void d(xmi xmiVar) {
        long jB = xvx.a.b();
        synchronized (this.c) {
            while (true) {
                ArrayDeque arrayDeque = this.i;
                if (arrayDeque.isEmpty()) {
                    TimeUnit.SECONDS.getClass();
                    long j = xmiVar.c;
                    return;
                }
                long jLongValue = ((Long) arrayDeque.poll()).longValue();
                if (jLongValue == xmiVar.c) {
                    jql jqlVar = this.j;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long j2 = xmiVar.c / 1000000;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    long j3 = jB / 1000000;
                    long j4 = j3 - j2;
                    List list = jqlVar.a;
                    if (list.isEmpty()) {
                        jqlVar.c = j2;
                    }
                    int i = (int) j4;
                    if (i > jqlVar.b || list.isEmpty()) {
                        jqlVar.b = i;
                    }
                    jqlVar.d = j3;
                    if (list.size() < 120) {
                        list.add(Integer.valueOf(i));
                    } else {
                        ((ype) ((ype) ((ype) a.h()).l(10, TimeUnit.SECONDS)).ai(2637)).w("Latency buffer overflow, count: %d", list.size());
                    }
                    joc jocVar = this.g;
                    TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(xmiVar.c / 1000000);
                    TimeUnit timeUnit4 = TimeUnit.NANOSECONDS;
                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jB / 1000000);
                    synchronized (((job) jocVar).g) {
                        Instant instantPlus = instantOfEpochMilli.plus(Duration.between(instantOfEpochMilli, instantOfEpochMilli2).dividedBy(2L));
                        if (!((job) jocVar).k) {
                            ((job) jocVar).k = true;
                            ((ype) job.a.l().ai(2446)).u("Audio approximation with Ping latency started.");
                            ((job) jocVar).i = instantPlus;
                            ((job) jocVar).j = instantOfEpochMilli;
                            ((job) jocVar).h = ((job) jocVar).e;
                        } else if (((job) jocVar).h.compareTo(job.c) > 0) {
                            ((ype) job.a.l().ai(2445)).u("Approximate buffer hit upper limit, resetting approximate buffer.");
                            ((job) jocVar).h = job.b;
                        } else {
                            Instant instant = ((job) jocVar).i;
                            instant.getClass();
                            Duration durationBetween = Duration.between(instant, instantPlus);
                            Instant instant2 = ((job) jocVar).j;
                            instant2.getClass();
                            ((job) jocVar).h = ((job) jocVar).h.plus(Duration.between(instant2, instantOfEpochMilli)).minus(durationBetween);
                            ((job) jocVar).j = instantOfEpochMilli;
                            ((job) jocVar).i = instantPlus;
                        }
                        if (((job) jocVar).h.isNegative()) {
                            ((ype) ((ype) ((ype) job.a.h()).l(1, TimeUnit.SECONDS)).ai(2444)).x("Approximate buffer on head unit is: %dms. There's probably an audio glitch right now", ((job) jocVar).h.toMillis());
                            ((job) jocVar).f.e(yzz.AUDIO_GLITCH, yzy.Ct);
                            ((job) jocVar).h = job.b;
                        }
                    }
                    int i2 = this.l;
                    if (i > i2) {
                        ((ype) ((ype) ((ype) a.h()).l(1, TimeUnit.SECONDS)).ai(2642)).B("Ping latency %dms is higher a threshold of %dms", i, i2);
                        return;
                    }
                    return;
                }
                ((ype) ((ype) ((ype) a.h()).l(10, TimeUnit.SECONDS)).ai(2641)).G("Received out of order ping response, received: %d, in queue: %d", xmiVar.c, jLongValue);
            }
        }
    }
}
