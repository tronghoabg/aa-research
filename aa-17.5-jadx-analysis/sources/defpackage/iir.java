package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class iir {
    public final float a;
    public final float b;
    public float c;
    public float d;

    public iir(float f, float f2, float f3, float f4) {
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.a = f;
        this.b = f2;
        double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (dSqrt != 0.0d) {
            this.c = (float) (f3 / dSqrt);
            this.d = (float) (f4 / dSqrt);
        }
    }

    public final void a(iir iirVar) {
        this.c += iirVar.c;
        this.d += iirVar.d;
    }

    public final void b(float f, float f2) {
        float f3 = f2 - this.b;
        float f4 = f - this.a;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.c += (float) (f4 / dSqrt);
            this.d += (float) (f3 / dSqrt);
        }
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
