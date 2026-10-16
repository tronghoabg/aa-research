package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrn {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;

    public /* synthetic */ xrn(java.lang.String str, int i) {
        this(1 == (i & 1) ? "" : str, 30.2f, 4.4f, 0.06967213f, 0.47950816f, 3.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, -2462251, 1.0f, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xrn)) {
            return false;
        }
        defpackage.xrn xrnVar = (defpackage.xrn) obj;
        return defpackage.afga.f(this.a, xrnVar.a) && java.lang.Float.compare(this.b, xrnVar.b) == 0 && java.lang.Float.compare(this.c, xrnVar.c) == 0 && java.lang.Float.compare(this.d, xrnVar.d) == 0 && java.lang.Float.compare(this.e, xrnVar.e) == 0 && java.lang.Float.compare(this.f, xrnVar.f) == 0 && java.lang.Float.compare(this.g, xrnVar.g) == 0 && java.lang.Float.compare(this.h, xrnVar.h) == 0 && java.lang.Float.compare(this.i, xrnVar.i) == 0 && this.j == xrnVar.j && java.lang.Float.compare(this.k, xrnVar.k) == 0 && java.lang.Float.compare(this.l, xrnVar.l) == 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + this.j) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l);
    }

    public final java.lang.String toString() {
        return "BorderLightConfig(id=" + this.a + ", topBlurRadius=" + this.b + ", bottomBlurRadius=" + this.c + ", topIntensity=" + this.d + ", bottomIntensity=" + this.e + ", strokeWidth=" + this.f + ", distortionSpeed=" + this.g + ", distortionFrequency=" + this.h + ", distortionAmplitude=" + this.i + ", color=" + this.j + ", alpha=" + this.k + ", hdrBoost=" + this.l + ")";
    }

    public xrn(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, float f9, float f10) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = i;
        this.k = f9;
        this.l = f10;
    }

    public xrn() {
        this(null, 4095);
    }
}
