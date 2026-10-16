package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class utl {
    public long a;
    public long b;

    public utl(boolean z) {
        this.a = true != z ? -1L : -2L;
        this.b = true != z ? -2L : -1L;
    }

    public final float a(long j) {
        long j2 = this.a;
        return Math.max(Math.min(1.0f, (j - j2) / (this.b - j2)), BitmapDescriptorFactory.HUE_RED);
    }

    public final void b(long j, long j2) {
        long j3 = this.a;
        if (j3 >= 0) {
            long j4 = this.b;
            if (j4 >= 0 && j4 >= j3) {
                return;
            }
        }
        long jMax = j - Math.max(j3 - j, 0L);
        this.a = jMax;
        this.b = jMax + j2;
    }

    public final boolean c(long j) {
        return j >= this.a && j >= this.b;
    }

    public final long d() {
        spu.am(this.b != -1);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return (e() - this.b) / 1000000;
    }

    public final long e() {
        if (this.a == -1) {
            return System.nanoTime();
        }
        this.a = -1L;
        return 0L;
    }

    public final void f() {
        this.b = e();
    }

    public utl() {
        this.a = -1L;
        this.b = -1L;
    }
}
