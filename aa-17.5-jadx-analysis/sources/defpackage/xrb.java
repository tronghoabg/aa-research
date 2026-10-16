package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xrb {
    public final float a;
    public final float b;
    public final float c;

    public xrb(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrb)) {
            return false;
        }
        xrb xrbVar = (xrb) obj;
        return Float.compare(this.a, xrbVar.a) == 0 && Float.compare(this.b, xrbVar.b) == 0 && Float.compare(this.c, xrbVar.c) == 0;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "SpotLightConfig(topRadius=" + this.a + ", bottomRadius=" + this.b + ", alpha=" + this.c + ")";
    }

    public xrb() {
        this(BitmapDescriptorFactory.HUE_RED, 64.0f, 1.0f);
    }
}
