package defpackage;

import android.opengl.Matrix;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aagn {
    public static final String a = "aagn";
    public static final ThreadLocal c;
    public static final float[] d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final double j;
    public final float k;
    public final double l;
    public final double m;
    public final double n;
    public final double o;
    public final double p;
    public final double q;
    float[] r;
    float[] s;
    float[] t;
    float[] u;
    float[] v;
    private static final ThreadLocal w = new aagm();
    public static final ThreadLocal b = new aagm();

    static {
        double d2 = aahr.a;
        ExecutorService executorService = zrz.a;
        c = new zru(4);
        d = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};
    }

    public aagn(float f, float f2, float f3, int i, int i2) {
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("new(%s, %s, %s, %s, %s, %s)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(90.0d)));
        }
        zkt.l(f, "eyeCameraTiltDeg cannot be NaN");
        zkt.l(f2, "eyeCameraBearingDeg cannot be NaN");
        zkt.l(f3, "eyeCameraZoom cannot be NaN");
        zkt.i(f, a.bG(f, "illegal tilt: "));
        zkt.e(f3 >= BitmapDescriptorFactory.HUE_RED, a.bG(f3, "illegal eyeCameraZoom: "));
        zkt.e(i > 0, a.bp(i, "illegal screenWidthPpx: "));
        zkt.e(i2 > 0, a.bp(i2, "illegal screenHeightPpx: "));
        this.e = f;
        this.f = aahr.g(f2);
        this.g = f3;
        this.h = i;
        this.i = i2;
        this.j = 90.0d;
        this.k = i / i2;
        double dL = aahr.l(true, i, i2);
        this.l = dL;
        double dL2 = aahr.l(false, i, i2);
        this.m = dL2;
        double dPow = Math.pow(2.0d, -f3);
        this.n = dPow;
        this.o = dL * dPow;
        double d2 = dPow * dL2;
        this.p = d2;
        this.q = (i2 / 2.0d) / Math.tan((d2 / 2.0d) * 0.01745329238474369d);
        synchronized (this) {
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
        }
    }

    public static void c(float f, float f2, float[] fArr) {
        zkt.l(f, "tiltDeg cannot be NaN");
        zkt.i(f, String.format("illegal tiltDeg: %s", Float.valueOf(f)));
        zkt.l(f2, "bearingDeg cannot be NaN");
        zkt.n(fArr, "worldSpaceVector");
        int length = fArr.length;
        aclh.o(length == 4, "worldSpaceVector#%s != %s", new Object[]{Integer.valueOf(length), 4});
        double d2 = aahr.a;
        double d3 = f * 0.017453292f;
        double d4 = f2 * 0.017453292f;
        double dSin = Math.sin(d4);
        double dCos = Math.cos(d4);
        double dSin2 = Math.sin(d3);
        double dCos2 = Math.cos(d3);
        fArr[0] = (float) (dSin * dCos2);
        fArr[1] = (float) dSin2;
        fArr[2] = (float) ((-dCos) * dCos2);
        fArr[3] = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.maps.model.StreetViewPanoramaOrientation a(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aagn.a(int, int):com.google.android.libraries.maps.model.StreetViewPanoramaOrientation");
    }

    public final aagn b(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        zkt.n(streetViewPanoramaCamera, "camera");
        return new aagn(streetViewPanoramaCamera.tilt, streetViewPanoramaCamera.bearing, streetViewPanoramaCamera.zoom, this.h, this.i);
    }

    final synchronized float[] d() {
        float[] fArr = this.s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[16];
        this.s = fArr2;
        Matrix.invertM(fArr2, 0, e(), 0);
        return this.s;
    }

    public final synchronized float[] e() {
        float[] fArr = this.r;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[16];
        this.r = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(this.r, 0, this.e, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Matrix.rotateM(this.r, 0, -this.f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aagn)) {
            return false;
        }
        aagn aagnVar = (aagn) obj;
        if (a.C(Float.valueOf(this.e), Float.valueOf(aagnVar.e)) && a.C(Float.valueOf(this.f), Float.valueOf(aagnVar.f)) && a.C(Float.valueOf(this.g), Float.valueOf(aagnVar.g)) && a.C(Integer.valueOf(this.h), Integer.valueOf(aagnVar.h)) && a.C(Integer.valueOf(this.i), Integer.valueOf(aagnVar.i))) {
            Double dValueOf = Double.valueOf(90.0d);
            double d2 = aagnVar.j;
            if (a.C(dValueOf, dValueOf)) {
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized float[] f() {
        float[] fArr = this.t;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[16];
        this.t = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(this.t, 0, -this.e, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Matrix.rotateM(this.t, 0, this.f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        return this.t;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized float[] g() {
        float[] fArr = this.v;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[16];
        this.v = fArr2;
        Matrix.multiplyMM(fArr2, 0, h(), 0, f(), 0);
        return this.v;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized float[] h() {
        float[] fArr = this.u;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[16];
        this.u = fArr2;
        Matrix.perspectiveM(fArr2, 0, (float) this.p, this.k, 0.1f, 400.0f);
        return this.u;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g)});
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.d("eyeCameraTiltDeg", this.e);
        zsaVarA.d("eyeCameraBearingDeg", this.f);
        zsaVarA.d("eyeCameraZoom", this.g);
        zsaVarA.e("screenWidthPpx", this.h);
        zsaVarA.e("screenHeightPpx", this.i);
        zsaVarA.c("maxFovDeg", 90.0d);
        zsaVarA.c("unzoomedFovXDeg", this.l);
        zsaVarA.c("unzoomedFovYDeg", this.m);
        zsaVarA.c("fovZoomScale", this.n);
        zsaVarA.c("fovXDeg", this.o);
        zsaVarA.c("fovYDeg", this.p);
        zsaVarA.c("distanceFromEyeToScreen", this.q);
        boolean z = true;
        zsaVarA.g("?world2viewMatrix", this.r != null);
        if (this.s == null) {
            z = false;
        }
        zsaVarA.g("?view2worldMatrix", z);
        return zsaVarA.toString();
    }

    public aagn(StreetViewPanoramaCamera streetViewPanoramaCamera, int i, int i2) {
        this(streetViewPanoramaCamera.tilt, streetViewPanoramaCamera.bearing, streetViewPanoramaCamera.zoom, i, i2);
    }
}
