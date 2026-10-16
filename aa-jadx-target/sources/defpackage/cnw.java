package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnw extends defpackage.coj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public cnw(float f, float f2, float f3, float f4) {
        super(false, true);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cnw)) {
            return false;
        }
        defpackage.cnw cnwVar = (defpackage.cnw) obj;
        return java.lang.Float.compare(this.a, cnwVar.a) == 0 && java.lang.Float.compare(this.b, cnwVar.b) == 0 && java.lang.Float.compare(this.c, cnwVar.c) == 0 && java.lang.Float.compare(this.d, cnwVar.d) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "QuadTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ")";
    }
}
