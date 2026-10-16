package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gch implements gci {
    public static final gch a = new gch();

    private gch() {
    }

    @Override // defpackage.gci
    public final float a(aqf aqfVar, bux buxVar) {
        buxVar.v(1827993234);
        float f = true != fyz.e(aqfVar) ? BitmapDescriptorFactory.HUE_RED : 1.0f;
        buxVar.o();
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gch)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 555386056;
    }

    public final String toString() {
        return "WhenScrollable";
    }
}
