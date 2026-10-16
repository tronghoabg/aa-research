package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uli {
    public static final defpackage.uli a = a(-16777216, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 12, 2.8f, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0, false);
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final boolean i;

    public uli(int i, int i2, int i3, float f, float f2, float f3, int i4, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = i4;
        this.i = z;
    }

    public static defpackage.uli a(int i, int i2, int i3, float f, float f2, float f3, int i4, boolean z) {
        defpackage.ulh ulhVar = new defpackage.ulh();
        ulhVar.a = i;
        int i5 = ulhVar.g | 1;
        ulhVar.b = i2;
        ulhVar.g = (byte) (((byte) i5) | 2);
        ulhVar.c(i3);
        ulhVar.c = f;
        int i6 = ulhVar.g | 8;
        ulhVar.d = f2;
        ulhVar.e = f3;
        ulhVar.g = (byte) (((byte) (((byte) i6) | 16)) | 32);
        ulhVar.b(i4);
        ulhVar.f = z;
        ulhVar.g = (byte) (ulhVar.g | (-128));
        return ulhVar.a();
    }

    public static defpackage.uli b(defpackage.abdy abdyVar) {
        float f;
        int i = abdyVar.c;
        int i2 = abdyVar.d;
        defpackage.abcw abcwVar = abdyVar.g;
        if (abcwVar == null) {
            abcwVar = defpackage.abcw.a;
        }
        int i3 = abcwVar.c;
        defpackage.abcw abcwVar2 = abdyVar.g;
        float fQ = defpackage.qsp.Q((abcwVar2 == null ? defpackage.abcw.a : abcwVar2).g);
        if (((abcwVar2 == null ? defpackage.abcw.a : abcwVar2).b & 8) != 0) {
            f = (abcwVar2 == null ? defpackage.abcw.a : abcwVar2).e / 100.0f;
        } else {
            f = 1.0f;
        }
        float f2 = (abcwVar2 == null ? defpackage.abcw.a : abcwVar2).f;
        if (abcwVar2 == null) {
            abcwVar2 = defpackage.abcw.a;
        }
        return a(i, i2, i3, fQ, f, f2 / 1000.0f, abcwVar2.d, abdyVar.l);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uli) {
            defpackage.uli uliVar = (defpackage.uli) obj;
            if (this.b == uliVar.b && this.c == uliVar.c && this.d == uliVar.d) {
                if (java.lang.Float.floatToIntBits(this.e) == java.lang.Float.floatToIntBits(uliVar.e)) {
                    if (java.lang.Float.floatToIntBits(this.f) == java.lang.Float.floatToIntBits(uliVar.f)) {
                        if (java.lang.Float.floatToIntBits(this.g) == java.lang.Float.floatToIntBits(uliVar.g) && this.h == uliVar.h && this.i == uliVar.i) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.h ^ ((((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ java.lang.Float.floatToIntBits(this.e)) * 1000003) ^ java.lang.Float.floatToIntBits(this.f)) * 1000003) ^ java.lang.Float.floatToIntBits(this.g)) * 1000003)) * 1000003) ^ (true != this.i ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "TextStyle{color=" + java.lang.Integer.toHexString(this.b) + ", outlineColor=" + java.lang.Integer.toHexString(this.c) + ", size=" + this.d + ", outlineWidth=" + this.e + ", leadingRatio=" + this.f + ", trackingRatio=" + this.g + ", attributes=" + this.h + ", off=" + this.i + '}';
    }

    public uli() {
        throw null;
    }
}
