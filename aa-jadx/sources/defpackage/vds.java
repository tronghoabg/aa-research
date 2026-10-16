package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vds {
    public final android.graphics.RectF a = new android.graphics.RectF();
    protected final android.graphics.Matrix b = new android.graphics.Matrix();
    public final android.graphics.Path c = new android.graphics.Path();
    public final android.graphics.Path d = new android.graphics.Path();
    public float e;
    public float f;
    public android.graphics.Paint.Cap g;

    public final void d() {
        this.c.reset();
        this.d.reset();
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.g = android.graphics.Paint.Cap.ROUND;
    }

    public final void e(float f, float f2, float f3) {
        android.graphics.Matrix matrix = this.b;
        matrix.reset();
        matrix.preScale(f3, f3);
        matrix.preTranslate(f, f2);
        this.c.transform(matrix);
        this.d.transform(matrix);
        this.e *= f3;
        this.f *= f3;
    }
}
