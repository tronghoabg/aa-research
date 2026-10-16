package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsn {
    public final defpackage.tpg a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final defpackage.tso f;
    public final float g;
    public final float h;

    public tsn(defpackage.tpg tpgVar, float f, float f2, float f3, float f4, defpackage.tso tsoVar, float f5, float f6) {
        this.a = tpgVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = tsoVar;
        this.g = f5;
        this.h = f6;
    }

    public static defpackage.tsm a() {
        defpackage.tsm tsmVar = new defpackage.tsm();
        tsmVar.a = new defpackage.tpg(0.0d, 0.0d);
        tsmVar.d(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        tsmVar.e(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        tsmVar.b = defpackage.tso.a;
        tsmVar.c(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        tsmVar.f(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        tsmVar.h(2.0f);
        tsmVar.g(30.0f);
        return tsmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tsn) {
            defpackage.tsn tsnVar = (defpackage.tsn) obj;
            if (this.a.equals(tsnVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(tsnVar.b)) {
                    if (java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(tsnVar.c)) {
                        if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(tsnVar.d)) {
                            if (java.lang.Float.floatToIntBits(this.e) == java.lang.Float.floatToIntBits(tsnVar.e) && this.f.equals(tsnVar.f)) {
                                if (java.lang.Float.floatToIntBits(this.g) == java.lang.Float.floatToIntBits(tsnVar.g)) {
                                    if (java.lang.Float.floatToIntBits(this.h) == java.lang.Float.floatToIntBits(tsnVar.h)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ java.lang.Float.floatToIntBits(this.c)) * 1000003) ^ java.lang.Float.floatToIntBits(this.d)) * 1000003) ^ java.lang.Float.floatToIntBits(this.e)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ java.lang.Float.floatToIntBits(this.g);
        return java.lang.Float.floatToIntBits(this.h) ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.tso tsoVar = this.f;
        return "{" + java.lang.String.valueOf(this.a) + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + java.lang.String.valueOf(tsoVar) + ", " + this.g + ", " + this.h + "}";
    }

    public tsn() {
        throw null;
    }
}
