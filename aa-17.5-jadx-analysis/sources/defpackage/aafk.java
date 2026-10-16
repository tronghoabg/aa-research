package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafk implements aafe {
    private static final Interpolator a = new LinearInterpolator();
    private final StreetViewPanoramaCamera b;
    private final double c;
    private final boolean d;
    private final Interpolator e;
    private Double f;
    private Double g;
    private StreetViewPanoramaCamera h;
    private final float[] i;

    public aafk(StreetViewPanoramaCamera streetViewPanoramaCamera, double d, boolean z) {
        zkt.n(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
        this.b = streetViewPanoramaCamera;
        zkt.e(d >= 0.0d, "durationSec must be >= 0");
        this.c = d;
        this.d = z;
        this.e = a;
        synchronized (this) {
            this.f = null;
            this.g = null;
            this.h = null;
            float[] fArr = new float[3];
            this.i = fArr;
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // defpackage.aafe
    @ResultIgnorabilityUnspecified
    public final synchronized StreetViewPanoramaCamera a(StreetViewPanoramaCamera streetViewPanoramaCamera, aezk aezkVar, int i, double d) {
        zkt.n(streetViewPanoramaCamera, "currentCamera");
        if (b()) {
            return this.b;
        }
        Double dValueOf = Double.valueOf(d);
        this.g = dValueOf;
        if (this.f != null) {
            float fD = aahr.d(this.e.getInterpolation((float) aahr.k((dValueOf.doubleValue() - this.f.doubleValue()) / this.c)), BitmapDescriptorFactory.HUE_RED, 1.0f);
            StreetViewPanoramaCamera streetViewPanoramaCamera2 = this.h;
            float f = streetViewPanoramaCamera2.bearing;
            float[] fArr = this.i;
            return new StreetViewPanoramaCamera(streetViewPanoramaCamera2.zoom + (fD * fArr[2]), aahr.e(streetViewPanoramaCamera2.tilt + (fArr[1] * fD)), f + (fArr[0] * fD));
        }
        this.f = dValueOf;
        this.h = streetViewPanoramaCamera;
        float[] fArr2 = this.i;
        StreetViewPanoramaCamera streetViewPanoramaCamera3 = this.b;
        float f2 = streetViewPanoramaCamera3.bearing - streetViewPanoramaCamera.bearing;
        fArr2[0] = f2;
        if (f2 < -180.0f) {
            fArr2[0] = f2 + 360.0f;
        } else if (f2 > 180.0f) {
            fArr2[0] = f2 - 360.0f;
        }
        fArr2[1] = streetViewPanoramaCamera3.tilt - streetViewPanoramaCamera.tilt;
        fArr2[2] = streetViewPanoramaCamera3.zoom - streetViewPanoramaCamera.zoom;
        return null;
    }

    @Override // defpackage.aafe
    public final synchronized boolean b() {
        double d = this.c;
        boolean z = true;
        if (d != 0.0d) {
            if (this.f == null) {
                z = false;
            } else if (this.g.doubleValue() < this.f.doubleValue() + d) {
                return false;
            }
        }
        return z;
    }

    public final synchronized boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafk)) {
            return false;
        }
        aafk aafkVar = (aafk) obj;
        synchronized (aafkVar) {
            if (!a.C(this.b, aafkVar.b) || !a.C(Double.valueOf(this.c), Double.valueOf(aafkVar.c)) || !a.C(Boolean.valueOf(this.d), Boolean.valueOf(aafkVar.d)) || !a.C(this.e, aafkVar.e) || !a.C(this.f, aafkVar.f) || !a.C(this.h, aafkVar.h)) {
                z = false;
            }
        }
        return z;
    }

    public final synchronized int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Double.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.b("destCamera", this.b);
        zsaVarA.c("durationSec", this.c);
        zsaVarA.g("isUserGesture", this.d);
        zsaVarA.b("interpolator", this.e);
        zsaVarA.b("startTimeSec", this.f);
        zsaVarA.b("currTimeSec", this.g);
        zsaVarA.b("startCamera", this.h);
        zsaVarA.b("deltaBearingTiltZoomCache", Arrays.toString(this.i));
        return zsaVarA.toString();
    }
}
