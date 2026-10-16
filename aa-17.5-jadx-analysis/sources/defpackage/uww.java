package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uww {
    public final float[] a = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
    public boolean b = true;

    public final void a() {
        this.b = false;
    }

    public final void b(uwx uwxVar, float f) {
        float[] fArr = uwxVar.a;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float[] fArr2 = uxf.a;
        float[] fArr3 = this.a;
        synchronized (fArr2) {
            Matrix.setRotateM(fArr2, 0, f, f2, f3, f4);
            uxf.c(fArr3, fArr3, fArr2);
        }
        this.b = false;
    }

    public final void c(float f, float f2, float f3) {
        Matrix.scaleM(this.a, 0, f, f2, f3);
        this.b = false;
    }

    public final void d(uww uwwVar) {
        System.arraycopy(uwwVar.a, 0, this.a, 0, 16);
        this.b = uwwVar.b;
    }

    public final void e() {
        Matrix.setIdentityM(this.a, 0);
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
        Matrix.translateM(this.a, 0, f, f2, f3);
        this.b = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(this.a[i] + "  ");
            if (i % 4 == 3) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
