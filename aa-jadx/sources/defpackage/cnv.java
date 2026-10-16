package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnv extends defpackage.coj {
    public final float a;
    public final float b;

    public cnv(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cnv)) {
            return false;
        }
        defpackage.cnv cnvVar = (defpackage.cnv) obj;
        return java.lang.Float.compare(this.a, cnvVar.a) == 0 && java.lang.Float.compare(this.b, cnvVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "MoveTo(x=" + this.a + ", y=" + this.b + ")";
    }
}
