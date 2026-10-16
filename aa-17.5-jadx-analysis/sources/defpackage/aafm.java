package defpackage;

import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafm implements aafe {
    private final float a;
    private final float b;

    public aafm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.aafe
    public final StreetViewPanoramaCamera a(StreetViewPanoramaCamera streetViewPanoramaCamera, aezk aezkVar, int i, double d) {
        zkt.n(streetViewPanoramaCamera, "currentCamera");
        float fPow = (float) Math.pow(2.0d, -streetViewPanoramaCamera.zoom);
        return new StreetViewPanoramaCamera(streetViewPanoramaCamera.zoom, aahr.e(streetViewPanoramaCamera.tilt + (this.b * fPow)), streetViewPanoramaCamera.bearing + (fPow * this.a));
    }

    @Override // defpackage.aafe
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafm)) {
            return false;
        }
        aafm aafmVar = (aafm) obj;
        return a.C(Float.valueOf(this.b), Float.valueOf(aafmVar.b)) && a.C(Float.valueOf(this.a), Float.valueOf(aafmVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Float.valueOf(this.a)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.d("tiltDeltaDeg", this.b);
        zsaVarA.d("bearingDeltaDeg", this.a);
        return zsaVarA.toString();
    }
}
