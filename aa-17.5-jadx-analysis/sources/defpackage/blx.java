package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class blx {
    public final float a;
    public final float b = BitmapDescriptorFactory.HUE_RED;
    public final float c = BitmapDescriptorFactory.HUE_RED;
    public final float d;

    public blx(float f, float f2) {
        this.a = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blx)) {
            return false;
        }
        blx blxVar = (blx) obj;
        if (this.a == blxVar.a) {
            float f = blxVar.b;
            float f2 = blxVar.c;
            if (this.d == blxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=" + this.a + ", focusedAlpha=0.0, hoveredAlpha=0.0, pressedAlpha=" + this.d + ")";
    }
}
