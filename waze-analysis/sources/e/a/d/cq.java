package e.a.d;

import androidx.media3.common.C;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    private final Random f46759a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final long f46760b;

    /* renamed from: c, reason: collision with root package name */
    private final long f46761c;

    /* renamed from: d, reason: collision with root package name */
    private long f46762d;

    public cq() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f46760b = C.NANOS_PER_SECOND;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        this.f46761c = 120000000000L;
        this.f46762d = C.NANOS_PER_SECOND;
    }

    public final long a() {
        long j2 = this.f46762d;
        double d2 = j2;
        this.f46762d = Math.min((long) (1.6d * d2), this.f46761c);
        double d3 = 0.2d * d2;
        double d4 = d2 * (-0.2d);
        com.google.d.b.an.l(d3 >= d4);
        return j2 + ((long) ((this.f46759a.nextDouble() * (d3 - d4)) + d4));
    }
}
