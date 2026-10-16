package defpackage;

import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafn implements aafe {
    private final boolean a = true;

    @Override // defpackage.aafe
    public final StreetViewPanoramaCamera a(StreetViewPanoramaCamera streetViewPanoramaCamera, aezk aezkVar, int i, double d) {
        return null;
    }

    @Override // defpackage.aafe
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafn)) {
            return false;
        }
        boolean z = ((aafn) obj).a;
        return a.C(true, true);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{true});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.g("isUserGesture", true);
        return zsaVarA.toString();
    }
}
