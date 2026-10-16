package defpackage;

import android.os.SystemClock;
import android.view.FrameMetrics;

/* loaded from: classes2.dex */
public final class ajzn {
    public long a;

    public ajzn() {
        this.a = 0L;
    }

    public final void a(long j) {
        this.a += j;
    }

    public final long b(FrameMetrics frameMetrics, long j) {
        long metric = frameMetrics.getMetric(10);
        long metric2 = frameMetrics.getMetric(8);
        long j2 = metric + metric2;
        long jMax = Math.max(this.a + j, metric + j);
        this.a = jMax;
        long j3 = jMax - metric;
        if (j2 >= jMax && metric2 >= j) {
            this.a = (j2 - ((j2 - frameMetrics.getMetric(11)) % j)) + j;
        }
        return j3;
    }

    public final void c() {
        this.a = 0L;
    }

    public final void d() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean e(long j) {
        return this.a == 0 || SystemClock.elapsedRealtime() - this.a > j;
    }

    public final synchronized void f(long j) {
        if (this.a != j) {
            this.a = j;
        }
    }

    public ajzn(long j) {
        this.a = j;
    }

    public ajzn(byte[] bArr) {
    }
}
