package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ufr {
    public float a;
    public float b;
    public float c;
    public float d;
    public final defpackage.tqd e = new defpackage.tqd();

    public ufr(float f, float f2, float f3, float f4) {
        c(f, f2, f3, f4);
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final void c(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e.n((f + f3) * 0.5f, (f2 + f4) * 0.5f);
    }

    public final boolean d(defpackage.tqd tqdVar) {
        float f = tqdVar.b;
        float f2 = tqdVar.c;
        return this.a <= f && f <= this.c && this.b <= f2 && f2 <= this.d;
    }

    public final boolean e(defpackage.ufr ufrVar) {
        return this.a <= ufrVar.c && this.b <= ufrVar.d && this.c >= ufrVar.a && this.d >= ufrVar.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ufr) {
            defpackage.ufr ufrVar = (defpackage.ufr) obj;
            if (this.a == ufrVar.a && this.c == ufrVar.c && this.b == ufrVar.b && this.d == ufrVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((java.lang.Float.floatToIntBits(this.a) + 31) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "AABB[[" + this.a + ", " + this.b + "], [" + this.c + ", " + this.d + "]]";
    }

    public ufr() {
    }
}
