package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmf {
    public final float a;
    public final float b;

    public cmf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cmf)) {
            return false;
        }
        defpackage.cmf cmfVar = (defpackage.cmf) obj;
        return java.lang.Float.compare(this.a, cmfVar.a) == 0 && java.lang.Float.compare(this.b, cmfVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ")";
    }
}
