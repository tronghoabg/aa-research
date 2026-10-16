package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xsf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xsf(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xsf)) {
            return false;
        }
        defpackage.xsf xsfVar = (defpackage.xsf) obj;
        return java.lang.Float.compare(this.a, xsfVar.a) == 0 && java.lang.Float.compare(this.b, xsfVar.b) == 0 && java.lang.Float.compare(this.c, xsfVar.c) == 0 && java.lang.Float.compare(this.d, xsfVar.d) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "SpotLightConfig(topRadius=" + this.a + ", bottomRadius=" + this.b + ", alpha=" + this.c + ", hdrBoost=" + this.d + ")";
    }

    public xsf() {
        this(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 64.0f, 1.0f, 1.0f);
    }
}
