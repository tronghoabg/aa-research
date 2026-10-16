package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xsd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    public /* synthetic */ xsd(byte[] bArr) {
        this(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, 0.01f, 59.0f, 0.81f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, -8690713, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xsd)) {
            return false;
        }
        defpackage.xsd xsdVar = (defpackage.xsd) obj;
        return java.lang.Float.compare(this.a, xsdVar.a) == 0 && java.lang.Float.compare(this.b, xsdVar.b) == 0 && java.lang.Float.compare(this.c, xsdVar.c) == 0 && java.lang.Float.compare(this.d, xsdVar.d) == 0 && java.lang.Float.compare(this.e, xsdVar.e) == 0 && java.lang.Float.compare(this.f, xsdVar.f) == 0 && this.g == xsdVar.g && java.lang.Float.compare(this.h, xsdVar.h) == 0;
    }

    public final int hashCode() {
        return (((((((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + this.g) * 31) + java.lang.Float.floatToIntBits(this.h);
    }

    public final java.lang.String toString() {
        return "RippleLightConfig(alpha=" + this.a + ", expansionSpeed=" + this.b + ", frequency=" + this.c + ", oscillationDistance=" + this.d + ", oscillationSpeed=" + this.e + ", blurRadius=" + this.f + ", color=" + this.g + ", hdrBoost=" + this.h + ")";
    }

    public xsd(float f, float f2, float f3, float f4, float f5, float f6, int i, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = f7;
    }

    public xsd() {
        this(null);
    }
}
