package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafj implements aafe {
    private final float a;
    private final float b;
    private float c;
    private float d;
    private Double e;

    public aafj(float f, float f2) {
        this.a = f;
        this.b = f2;
        synchronized (this) {
            this.c = Math.abs(f);
            this.d = Math.abs(f2);
            this.e = null;
        }
    }

    @Override // defpackage.aafe
    @ResultIgnorabilityUnspecified
    public final synchronized StreetViewPanoramaCamera a(StreetViewPanoramaCamera streetViewPanoramaCamera, aezk aezkVar, int i, double d) {
        zkt.n(streetViewPanoramaCamera, "currentCamera");
        if (!b()) {
            Double d2 = this.e;
            if (d2 == null) {
                this.e = Double.valueOf(d);
                return null;
            }
            if (d - d2.doubleValue() >= 0.03d) {
                this.e = Double.valueOf(d);
                float f = this.b;
                float f2 = this.d;
                float f3 = f >= BitmapDescriptorFactory.HUE_RED ? f2 : -f2;
                float f4 = this.a;
                float f5 = this.c;
                float f6 = f4 >= BitmapDescriptorFactory.HUE_RED ? f5 : -f5;
                float f7 = f3 * 10.0f;
                this.c = (f5 * 0.87f) - 0.005f;
                this.d = (f2 * 0.87f) - 0.005f;
                float fPow = (float) Math.pow(2.0d, -streetViewPanoramaCamera.zoom);
                return new StreetViewPanoramaCamera(streetViewPanoramaCamera.zoom, aahr.e(streetViewPanoramaCamera.tilt + (f7 * fPow)), streetViewPanoramaCamera.bearing + (fPow * f6 * 10.0f));
            }
        }
        return null;
    }

    @Override // defpackage.aafe
    public final synchronized boolean b() {
        if (this.c <= BitmapDescriptorFactory.HUE_RED) {
            if (this.d <= BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafj)) {
            return false;
        }
        aafj aafjVar = (aafj) obj;
        synchronized (aafjVar) {
            if (!a.C(Float.valueOf(this.a), Float.valueOf(aafjVar.a)) || !a.C(Float.valueOf(this.b), Float.valueOf(aafjVar.b)) || !a.C(Float.valueOf(this.c), Float.valueOf(aafjVar.c)) || !a.C(Float.valueOf(this.d), Float.valueOf(aafjVar.d))) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.d("dx", this.a);
        zsaVarA.d("dy", this.b);
        zsaVarA.d("angularVelocityX", this.c);
        zsaVarA.d("angularVelocityY", this.d);
        zsaVarA.b("currTimeSec", this.e);
        return zsaVarA.toString();
    }
}
