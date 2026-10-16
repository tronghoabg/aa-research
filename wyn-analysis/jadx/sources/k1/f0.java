package k1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38818a;

    /* renamed from: b, reason: collision with root package name */
    public float f38819b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f38820c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38821d;

    public f0(int i5, Interpolator interpolator, long j8) {
        this.f38818a = i5;
        this.f38820c = interpolator;
        this.f38821d = j8;
    }

    public long a() {
        return this.f38821d;
    }

    public float b() {
        Interpolator interpolator = this.f38820c;
        return interpolator != null ? interpolator.getInterpolation(this.f38819b) : this.f38819b;
    }

    public int c() {
        return this.f38818a;
    }

    public void d(float f10) {
        this.f38819b = f10;
    }
}
