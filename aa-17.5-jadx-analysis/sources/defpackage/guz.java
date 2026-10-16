package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class guz {
    public static final guz a;
    public static final guz b;
    public static final guz c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j = 36.0f;

    static {
        float f = gjk.c.k;
        a = new guz(48.0f, 56.0f, f, 48.0f, f, gjk.d.k);
        b = new guz(40.0f, 44.0f, f, 36.0f, f, f);
        c = new guz(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 36.0f, gjk.b.k, BitmapDescriptorFactory.HUE_RED);
    }

    private guz(float f, float f2, float f3, float f4, float f5, float f6) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guz)) {
            return false;
        }
        guz guzVar = (guz) obj;
        if (!dlj.c(this.d, guzVar.d) || !dlj.c(this.e, guzVar.e) || !dlj.c(this.f, guzVar.f) || !dlj.c(this.g, guzVar.g) || !dlj.c(this.h, guzVar.h) || !dlj.c(this.i, guzVar.i)) {
            return false;
        }
        float f = guzVar.j;
        return dlj.c(36.0f, 36.0f);
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(36.0f);
    }

    public final String toString() {
        float f = this.i;
        float f2 = this.h;
        float f3 = this.g;
        float f4 = this.f;
        float f5 = this.e;
        return "TurnCardStyle(laneImageSize=" + dlj.b(this.d) + ", laneImageContainerSize=" + dlj.b(f5) + ", laneImageContainerTopSpacing=" + dlj.b(f4) + ", turnImageSize=" + dlj.b(f3) + ", turnImageAndTextSpacing=" + dlj.b(f2) + ", primaryTurnCardTextTopSpacing=" + dlj.b(f) + ", inlineIconHeight=" + dlj.b(36.0f) + ")";
    }
}
