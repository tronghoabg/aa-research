package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Display;
import android.view.Surface;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wsj {
    public Object a;
    public Object b;
    public final Object c;

    public wsj(jmi jmiVar) {
        jmiVar.getClass();
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(1, 1);
        this.a = surfaceTexture;
        Object obj = this.a;
        obj.getClass();
        this.b = new Surface((SurfaceTexture) obj);
        iph iphVar = new iph(1, 1, 160, 8, jmiVar, false, "CarVirtualDeviceActivityVD", false, (Surface) this.b);
        iphVar.j((Surface) this.b);
        this.c = iphVar;
    }

    final void a(float f) {
        float[] fArr = (float[]) this.b;
        double dAtan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) dAtan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r0[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r11[1] + (d2 * Math.sin(d)));
    }

    final void b(float f) {
        float[] fArr = (float[]) this.b;
        float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = fAtan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r2[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r13[1] + (d2 * Math.sin(d)));
    }

    public final void c() {
        Arrays.fill((float[]) this.a, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill((float[]) this.b, BitmapDescriptorFactory.HUE_RED);
        ((float[]) this.b)[0] = 1.0f;
        ((Matrix) this.c).reset();
    }

    public final void d(float f) {
        Matrix matrix = (Matrix) this.c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.a);
        matrix.mapPoints((float[]) this.b);
    }

    final void e(float f) {
        float[] fArr = (float[]) this.a;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    final void f(float f) {
        float[] fArr = (float[]) this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + BitmapDescriptorFactory.HUE_RED;
    }

    public final void g(Rect rect, Rect rect2) {
        if (!Objects.equals(this.b, rect)) {
            this.b = rect;
            ((gjv) this.c).a(2);
        }
        if (Objects.equals(this.a, rect2)) {
            return;
        }
        this.a = rect2;
        ((gjv) this.c).a(3);
    }

    public final Display h() {
        return ((iph) this.c).c();
    }

    public wsj() {
        this.a = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.c = new Matrix();
    }

    public wsj(gjv gjvVar) {
        this.c = gjvVar;
    }

    public wsj(wsj wsjVar) {
        this((float[]) wsjVar.a, (float[]) wsjVar.b);
    }

    public wsj(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.a = fArr3;
        this.b = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.b, 0, 2);
        this.c = new Matrix();
    }
}
