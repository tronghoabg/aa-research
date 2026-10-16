package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gvj {
    public static final defpackage.gvj a;
    public static final defpackage.gvj b;
    public static final defpackage.gvj c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j = 36.0f;

    static {
        float f = defpackage.gjr.P2.k;
        a = new defpackage.gvj(48.0f, 56.0f, f, 48.0f, f, defpackage.gjr.P3.k);
        b = new defpackage.gvj(40.0f, 44.0f, f, 36.0f, f, f);
        c = new defpackage.gvj(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 36.0f, defpackage.gjr.P1.k, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    private gvj(float f, float f2, float f3, float f4, float f5, float f6) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gvj)) {
            return false;
        }
        defpackage.gvj gvjVar = (defpackage.gvj) obj;
        if (!defpackage.dlr.c(this.d, gvjVar.d) || !defpackage.dlr.c(this.e, gvjVar.e) || !defpackage.dlr.c(this.f, gvjVar.f) || !defpackage.dlr.c(this.g, gvjVar.g) || !defpackage.dlr.c(this.h, gvjVar.h) || !defpackage.dlr.c(this.i, gvjVar.i)) {
            return false;
        }
        float f = gvjVar.j;
        return defpackage.dlr.c(36.0f, 36.0f);
    }

    public final int hashCode() {
        return (((((((((((java.lang.Float.floatToIntBits(this.d) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + 1108344832;
    }

    public final java.lang.String toString() {
        float f = this.i;
        float f2 = this.h;
        float f3 = this.g;
        float f4 = this.f;
        float f5 = this.e;
        return "TurnCardStyle(laneImageSize=" + defpackage.dlr.b(this.d) + ", laneImageContainerSize=" + defpackage.dlr.b(f5) + ", laneImageContainerTopSpacing=" + defpackage.dlr.b(f4) + ", turnImageSize=" + defpackage.dlr.b(f3) + ", turnImageAndTextSpacing=" + defpackage.dlr.b(f2) + ", primaryTurnCardTextTopSpacing=" + defpackage.dlr.b(f) + ", inlineIconHeight=" + defpackage.dlr.b(36.0f) + ")";
    }
}
