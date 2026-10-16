package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cns extends defpackage.coj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public cns(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof defpackage.cns)) {
            return false;
        }
        defpackage.cns cnsVar = (defpackage.cns) obj;
        return java.lang.Float.compare(this.a, cnsVar.a) == 0 && java.lang.Float.compare(this.b, cnsVar.b) == 0 && java.lang.Float.compare(this.c, cnsVar.c) == 0 && java.lang.Float.compare(this.d, cnsVar.d) == 0 && java.lang.Float.compare(this.e, cnsVar.e) == 0 && java.lang.Float.compare(this.f, cnsVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        return "CurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ", x3=" + this.e + ", y3=" + this.f + ")";
    }
}
