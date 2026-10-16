package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dky {
    public static final dky a = new dky(1.0f, BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;

    public dky(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dky)) {
            return false;
        }
        dky dkyVar = (dky) obj;
        return this.b == dkyVar.b && this.c == dkyVar.c;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ")";
    }

    public dky() {
        this(1.0f, BitmapDescriptorFactory.HUE_RED);
    }
}
