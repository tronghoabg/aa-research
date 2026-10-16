package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cof extends defpackage.coj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public cof(float f, float f2, float f3, float f4) {
        super(true, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cof)) {
            return false;
        }
        defpackage.cof cofVar = (defpackage.cof) obj;
        return java.lang.Float.compare(this.a, cofVar.a) == 0 && java.lang.Float.compare(this.b, cofVar.b) == 0 && java.lang.Float.compare(this.c, cofVar.c) == 0 && java.lang.Float.compare(this.d, cofVar.d) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RelativeReflectiveCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ")";
    }
}
