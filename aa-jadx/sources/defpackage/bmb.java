package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bmb {
    public final float a;
    public final float b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public final float c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public final float d;

    public bmb(float f, float f2) {
        this.a = f;
        this.d = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bmb)) {
            return false;
        }
        defpackage.bmb bmbVar = (defpackage.bmb) obj;
        if (this.a == bmbVar.a) {
            float f = bmbVar.b;
            float f2 = bmbVar.c;
            if (this.d == bmbVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 29791) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RippleAlpha(draggedAlpha=" + this.a + ", focusedAlpha=0.0, hoveredAlpha=0.0, pressedAlpha=" + this.d + ")";
    }
}
