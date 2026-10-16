package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class coa extends defpackage.coj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public coa(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.coa)) {
            return false;
        }
        defpackage.coa coaVar = (defpackage.coa) obj;
        return java.lang.Float.compare(this.a, coaVar.a) == 0 && java.lang.Float.compare(this.b, coaVar.b) == 0 && java.lang.Float.compare(this.c, coaVar.c) == 0 && java.lang.Float.compare(this.d, coaVar.d) == 0 && java.lang.Float.compare(this.e, coaVar.e) == 0 && java.lang.Float.compare(this.f, coaVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        return "RelativeCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ", dx3=" + this.e + ", dy3=" + this.f + ")";
    }
}
