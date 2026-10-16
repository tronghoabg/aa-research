package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iiz {
    public final float a;
    public final float b;
    public float c;
    public float d;

    public iiz(float f, float f2, float f3, float f4) {
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.a = f;
        this.b = f2;
        double dSqrt = java.lang.Math.sqrt((f3 * f3) + (f4 * f4));
        if (dSqrt != 0.0d) {
            this.c = (float) (((double) f3) / dSqrt);
            this.d = (float) (((double) f4) / dSqrt);
        }
    }

    public final void a(defpackage.iiz iizVar) {
        this.c += iizVar.c;
        this.d += iizVar.d;
    }

    public final void b(float f, float f2) {
        float f3 = f2 - this.b;
        float f4 = f - this.a;
        double dSqrt = java.lang.Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.c += (float) (((double) f4) / dSqrt);
            this.d += (float) (((double) f3) / dSqrt);
        }
    }

    public final java.lang.String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
