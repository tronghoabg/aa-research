package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxt {
    public final float[] a = {1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f};
    public boolean b = true;

    public final void a() {
        this.b = false;
    }

    public final void b(defpackage.uxu uxuVar, float f) {
        float[] fArr = uxuVar.a;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float[] fArr2 = defpackage.uyb.a;
        float[] fArr3 = this.a;
        synchronized (fArr2) {
            android.opengl.Matrix.setRotateM(fArr2, 0, f, f2, f3, f4);
            defpackage.uyb.c(fArr3, fArr3, fArr2);
        }
        this.b = false;
    }

    public final void c(float f, float f2, float f3) {
        android.opengl.Matrix.scaleM(this.a, 0, f, f2, f3);
        this.b = false;
    }

    public final void d(defpackage.uxt uxtVar) {
        java.lang.System.arraycopy(uxtVar.a, 0, this.a, 0, 16);
        this.b = uxtVar.b;
    }

    public final void e() {
        android.opengl.Matrix.setIdentityM(this.a, 0);
        this.b = true;
    }

    public final void f(float f, float f2, float f3) {
        float[] fArr = this.a;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        this.b = false;
    }

    public final void g(float f, float f2, float f3) {
        android.opengl.Matrix.translateM(this.a, 0, f, f2, f3);
        this.b = false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(this.a[i] + "  ");
            if (i % 4 == 3) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
