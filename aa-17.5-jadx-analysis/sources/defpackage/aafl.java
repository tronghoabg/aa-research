package defpackage;

import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafl implements aafe {
    private final StreetViewPanoramaCamera a;
    private final boolean b;

    public aafl(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        zkt.n(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
        this.a = streetViewPanoramaCamera;
        this.b = false;
    }

    @Override // defpackage.aafe
    public final StreetViewPanoramaCamera a(StreetViewPanoramaCamera streetViewPanoramaCamera, aezk aezkVar, int i, double d) {
        return this.a;
    }

    @Override // defpackage.aafe
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafl)) {
            return false;
        }
        aafl aaflVar = (aafl) obj;
        if (a.C(this.a, aaflVar.a)) {
            boolean z = aaflVar.b;
            if (a.C(false, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, false});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("destCamera", this.a);
        zsaVarA.g("isUserGesture", false);
        return zsaVarA.toString();
    }
}
