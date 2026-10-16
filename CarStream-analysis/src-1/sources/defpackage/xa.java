package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class xa {
    public final long a;
    public final Interpolator b;
    public float c;
    public float d;
    public float e;
    public long f = -1;

    public xa(long j, Interpolator interpolator) {
        this.a = j;
        this.b = interpolator;
    }

    public final void a(long j) {
        long j2 = this.f;
        if (j2 < 0) {
            return;
        }
        long j3 = j - j2;
        long j4 = this.a;
        if (j3 >= j4) {
            this.e = this.d;
            this.f = -1L;
        } else {
            float f = this.c;
            this.e = (this.b.getInterpolation(j3 / j4) * (this.d - f)) + f;
        }
    }

    public final void b(float f, long j) {
        if (f == this.d) {
            return;
        }
        this.c = this.e;
        this.d = f;
        this.f = j;
    }
}
