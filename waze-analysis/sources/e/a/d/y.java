package e.a.d;

import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f47310a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f47311b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f47312c;

    /* renamed from: d, reason: collision with root package name */
    private final long f47313d;

    /* renamed from: e, reason: collision with root package name */
    private volatile ScheduledFuture f47314e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f47315f;

    y(ae aeVar, e.a.ad adVar, boolean z) {
        Objects.requireNonNull(aeVar);
        this.f47310a = aeVar;
        this.f47311b = z;
        if (adVar == null) {
            this.f47312c = false;
            this.f47313d = 0L;
        } else {
            this.f47312c = true;
            this.f47313d = adVar.b(TimeUnit.NANOSECONDS);
        }
    }

    final e.a.ee b() {
        long j2 = this.f47313d;
        long jAbs = Math.abs(j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j3 = jAbs / C.NANOS_PER_SECOND;
        long jAbs2 = Math.abs(j2);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long j4 = jAbs2 % C.NANOS_PER_SECOND;
        StringBuilder sb = new StringBuilder(true != this.f47311b ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append(j3);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j4)));
        sb.append("s. ");
        ae aeVar = this.f47310a;
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) aeVar.f46602j.p(e.a.p.f47843a)) == null ? AudioStats.AUDIO_AMPLITUDE_NONE : r0.longValue() / ae.f46594b)));
        if (aeVar.f46603k != null) {
            dn dnVar = new dn();
            aeVar.f46603k.b(dnVar);
            sb.append(" ");
            sb.append(dnVar);
        }
        return e.a.ee.f47404d.g(sb.toString());
    }

    final void c() {
        if (this.f47315f) {
            return;
        }
        if (this.f47312c && !this.f47311b) {
            ae aeVar = this.f47310a;
            if (aeVar.n != null) {
                this.f47314e = aeVar.n.schedule(new em(this), this.f47313d, TimeUnit.NANOSECONDS);
            }
        }
        this.f47310a.f46599g.c(com.google.d.m.a.cf.y());
        if (this.f47315f) {
            d();
        }
    }

    final void d() {
        this.f47315f = true;
        ScheduledFuture scheduledFuture = this.f47314e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f47310a.f46599g.f();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47310a.f46603k.c(b());
    }
}
