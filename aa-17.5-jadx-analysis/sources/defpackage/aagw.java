package defpackage;

import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aagw {
    public final aagu a;
    public final aagv b;
    public final StreetViewPanoramaOrientation c;

    public aagw(aagu aaguVar, aagv aagvVar, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.a = aaguVar;
        this.b = aagvVar;
        this.c = streetViewPanoramaOrientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagw)) {
            return false;
        }
        aagw aagwVar = (aagw) obj;
        return a.C(this.a, aagwVar.a) && a.C(this.b, aagwVar.b) && a.C(this.c, aagwVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("pano", this.a);
        zsaVarA.b("plane", this.b);
        zsaVarA.b("newOrientation", this.c);
        return zsaVarA.toString();
    }
}
