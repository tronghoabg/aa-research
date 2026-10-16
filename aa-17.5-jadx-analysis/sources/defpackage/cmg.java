package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmg extends czz {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final re e;

    public /* synthetic */ cmg(float f, float f2, int i, int i2, int i3) {
        super(null);
        this.a = 1 == (i3 & 1) ? BitmapDescriptorFactory.HUE_RED : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmg)) {
            return false;
        }
        cmg cmgVar = (cmg) obj;
        if (this.a != cmgVar.a || this.b != cmgVar.b || this.c != cmgVar.c || this.d != cmgVar.d) {
            return false;
        }
        re reVar = cmgVar.e;
        return true;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + cky.a(this.c) + ", join=" + ckz.a(this.d) + ", pathEffect=null)";
    }
}
