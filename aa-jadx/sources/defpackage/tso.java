package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tso {
    public static final defpackage.tso a = new defpackage.tso(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;

    public tso(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static defpackage.tso a(float f, float f2) {
        return new defpackage.tso(b(f), b(f2));
    }

    private static float b(float f) {
        return java.lang.Float.isNaN(f) ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : defpackage.duc.b(f, -1.0f, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tso) {
            defpackage.tso tsoVar = (defpackage.tso) obj;
            if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(tsoVar.b)) {
                if (java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(tsoVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.b) ^ 1000003;
        return java.lang.Float.floatToIntBits(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.b + ", " + this.c + "}";
    }

    public tso() {
        throw null;
    }
}
