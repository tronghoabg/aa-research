package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafo implements aafe {
    private static final String a = "aafo";
    private final float b;
    private final float c;
    private final float d;

    public aafo(float f, float f2, float f3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // defpackage.aafe
    public final StreetViewPanoramaCamera a(StreetViewPanoramaCamera streetViewPanoramaCamera, aezk aezkVar, int i, double d) {
        zkt.n(streetViewPanoramaCamera, "currentCamera");
        zkt.n(aezkVar, "currentRaycasterProvider");
        aagn aagnVar = (aagn) aezkVar.a();
        if (aagnVar.a((int) this.c, (int) this.d) == null) {
            String str = a;
            if (!zrn.e(str, 6)) {
                return null;
            }
            Log.e(str, "Failed to find focus point between fingers!");
            return null;
        }
        double dTan = Math.tan(aahr.c(streetViewPanoramaCamera.bearing, r3.bearing) * 0.017453292f);
        double dTan2 = Math.tan(aahr.c(streetViewPanoramaCamera.tilt, r3.tilt) * 0.017453292f);
        double dPow = Math.pow(2.0d, -streetViewPanoramaCamera.zoom) * 0.5d;
        double d2 = aagnVar.l;
        double d3 = aagnVar.m;
        double dTan3 = dTan / Math.tan((dPow * d2) * 0.01745329238474369d);
        double dTan4 = dTan2 / Math.tan((dPow * d3) * 0.01745329238474369d);
        double d4 = aahr.d(streetViewPanoramaCamera.zoom + this.b, BitmapDescriptorFactory.HUE_RED, i);
        double dPow2 = Math.pow(2.0d, -d4) * 0.5d;
        double dTan5 = dTan3 * Math.tan(d2 * dPow2 * 0.01745329238474369d);
        return new StreetViewPanoramaCamera((float) d4, aahr.e((float) (r3.tilt + (Math.atan(dTan4 * Math.tan(dPow2 * d3 * 0.01745329238474369d)) * 57.295780181884766d))), (float) (r3.bearing + (Math.atan(dTan5) * 57.295780181884766d)));
    }

    @Override // defpackage.aafe
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafo)) {
            return false;
        }
        aafo aafoVar = (aafo) obj;
        return a.C(Float.valueOf(this.b), Float.valueOf(aafoVar.b)) && a.C(Float.valueOf(this.c), Float.valueOf(aafoVar.c)) && a.C(Float.valueOf(this.d), Float.valueOf(aafoVar.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.d("deltaZoom", this.b);
        zsaVarA.d("focusXPpx", this.c);
        zsaVarA.d("focusYPpx", this.d);
        return zsaVarA.toString();
    }
}
