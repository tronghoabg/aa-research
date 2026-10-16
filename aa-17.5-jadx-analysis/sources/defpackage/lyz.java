package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lyz {
    public static final yph a = yph.c("GH.ContentRateLimiter");
    public final float b;
    public final long c;
    public boolean d;
    public float e;
    public long f;
    public boolean g = true;
    private final long h;

    public lyz(float f, float f2, long j) {
        woy.N(f > BitmapDescriptorFactory.HUE_RED);
        woy.N(f2 >= BitmapDescriptorFactory.HUE_RED);
        woy.N(j >= 0);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.h = (long) (1000.0f / f);
        this.b = f2;
        this.e = f2;
        this.c = j;
        this.f = SystemClock.elapsedRealtime();
    }

    public final float a() {
        wer.c();
        return b();
    }

    public final float b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > this.f) {
            d(this.e + ((jElapsedRealtime - r2) / this.h), jElapsedRealtime);
        }
        return this.e;
    }

    public final void c(float f) {
        wer.c();
        d(f, SystemClock.elapsedRealtime());
    }

    public final void d(float f, long j) {
        this.e = Math.min(this.b, f);
        this.f = j;
    }
}
