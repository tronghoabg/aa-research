package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class trq {
    public static final trq a = new trq(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;

    public trq(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static trq a(float f, float f2) {
        return new trq(b(f), b(f2));
    }

    private static float b(float f) {
        return Float.isNaN(f) ? BitmapDescriptorFactory.HUE_RED : dlz.i(f, -1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trq) {
            trq trqVar = (trq) obj;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(trqVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(trqVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.b) ^ 1000003;
        return Float.floatToIntBits(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c + "}";
    }

    public trq() {
        throw null;
    }
}
