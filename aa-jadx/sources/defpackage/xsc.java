package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xsc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    public xsc(float f, float f2, float f3, float f4) {
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.a = f;
        this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.h = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xsc)) {
            return false;
        }
        defpackage.xsc xscVar = (defpackage.xsc) obj;
        float f = xscVar.e;
        if (java.lang.Float.compare(this.a, xscVar.a) != 0) {
            return false;
        }
        float f2 = xscVar.f;
        float f3 = xscVar.g;
        float f4 = xscVar.h;
        return java.lang.Float.compare(this.b, xscVar.b) == 0 && java.lang.Float.compare(this.c, xscVar.c) == 0 && java.lang.Float.compare(this.d, xscVar.d) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 923521) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RimLightConfig(startBlurRadius=0.0, endBlurRadius=" + this.a + ", distortionSpeed=0.0, distortionFrequency=0.0, distortionAmplitude=0.0, rimWidth=" + this.b + ", alpha=" + this.c + ", hdrBoost=" + this.d + ")";
    }

    public xsc() {
        this(23.6f, 32.0f, 1.0f, 1.0f);
    }
}
