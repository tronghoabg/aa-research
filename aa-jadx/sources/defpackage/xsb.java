package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xsb {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final int e;

    public /* synthetic */ xsb(byte[] bArr) {
        this(59.3f, 1, 0.34f, -957968, -13367269);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xsb)) {
            return false;
        }
        defpackage.xsb xsbVar = (defpackage.xsb) obj;
        return java.lang.Float.compare(this.a, xsbVar.a) == 0 && this.b == xsbVar.b && java.lang.Float.compare(this.c, xsbVar.c) == 0 && this.d == xsbVar.d && this.e == xsbVar.e;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "RadialGradientConfig(radius=" + this.a + ", direction=" + this.b + ", ratio=" + this.c + ", innerColor=" + this.d + ", outerColor=" + this.e + ")";
    }

    public xsb(float f, int i, float f2, int i2, int i3) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = i3;
    }

    public xsb() {
        this(null);
    }
}
