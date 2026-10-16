package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class coe extends defpackage.coj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public coe(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof defpackage.coe)) {
            return false;
        }
        defpackage.coe coeVar = (defpackage.coe) obj;
        return java.lang.Float.compare(this.a, coeVar.a) == 0 && java.lang.Float.compare(this.b, coeVar.b) == 0 && java.lang.Float.compare(this.c, coeVar.c) == 0 && java.lang.Float.compare(this.d, coeVar.d) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RelativeQuadTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ")";
    }
}
