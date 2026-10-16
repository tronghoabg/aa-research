package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tuk implements java.io.Serializable {
    public static final defpackage.tuk a = new defpackage.tuk(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;

    public tuk(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static defpackage.tuk d(defpackage.tuk tukVar) {
        float f = tukVar.b;
        boolean zIsNaN = java.lang.Float.isNaN(f);
        float fB = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        float fB2 = zIsNaN ? 0.0f : defpackage.duc.b(f, -1.0f, 1.0f);
        float f2 = tukVar.c;
        if (!java.lang.Float.isNaN(f2)) {
            fB = defpackage.duc.b(f2, -1.0f, 1.0f);
        }
        return (java.lang.Float.floatToIntBits(fB2) == java.lang.Float.floatToIntBits(f) && java.lang.Float.floatToIntBits(fB) == java.lang.Float.floatToIntBits(f2)) ? tukVar : new defpackage.tuk(fB2, fB);
    }

    public final float a() {
        return (this.b + 1.0f) / 2.0f;
    }

    public final float b() {
        return (this.c + 1.0f) / 2.0f;
    }

    public final defpackage.tuk c(defpackage.tuk tukVar, float f) {
        float f2 = tukVar.b;
        int i = defpackage.vab.a;
        float f3 = this.b;
        float f4 = tukVar.c;
        float f5 = this.c;
        return new defpackage.tuk(f3 + ((f2 - f3) * f), f5 + ((f4 - f5) * f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tuk) {
            defpackage.tuk tukVar = (defpackage.tuk) obj;
            if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(tukVar.b) && java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(tukVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c));
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.e("x", this.b);
        xymVarBy.e("y", this.c);
        return xymVarBy.toString();
    }
}
