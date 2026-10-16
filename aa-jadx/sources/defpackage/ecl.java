package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ecl {
    private final int a;
    private float b;
    private final android.view.animation.Interpolator c;
    private final long d;

    public ecl(int i, android.view.animation.Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float g() {
        return 1.0f;
    }

    public float h() {
        android.view.animation.Interpolator interpolator = this.c;
        float f = this.b;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int i() {
        return this.a;
    }

    public long j() {
        return this.d;
    }

    public void k(float f) {
        this.b = f;
    }
}
