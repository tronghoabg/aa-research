package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnu extends defpackage.coj {
    public final float a;
    public final float b;

    public cnu(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cnu)) {
            return false;
        }
        defpackage.cnu cnuVar = (defpackage.cnu) obj;
        return java.lang.Float.compare(this.a, cnuVar.a) == 0 && java.lang.Float.compare(this.b, cnuVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "LineTo(x=" + this.a + ", y=" + this.b + ")";
    }
}
