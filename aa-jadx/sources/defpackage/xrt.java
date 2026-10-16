package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    private final float g;

    public xrt(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xrt)) {
            return false;
        }
        defpackage.xrt xrtVar = (defpackage.xrt) obj;
        if (java.lang.Float.compare(this.a, xrtVar.a) != 0 || java.lang.Float.compare(this.b, xrtVar.b) != 0 || java.lang.Float.compare(this.c, xrtVar.c) != 0 || java.lang.Float.compare(this.d, xrtVar.d) != 0) {
            return false;
        }
        float f = xrtVar.g;
        return java.lang.Float.compare(this.e, xrtVar.e) == 0 && java.lang.Float.compare(this.f, xrtVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 961) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        return "GoogleColorsConfig(alpha=" + this.a + ", hdrBoost=" + this.b + ", gradientEdgeFadeDistance=" + this.c + ", scale=" + this.d + ", offsetX=0.0, innerDistance=" + this.e + ", outerDistance=" + this.f + ")";
    }

    public xrt() {
        this(0.75f, 1.0f, 30.0f, 1.0f, 20.0f, 20.0f);
    }
}
