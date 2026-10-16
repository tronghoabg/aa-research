package defpackage;

/* loaded from: classes.dex */
public final class cni extends cob {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public cni(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cni)) {
            return false;
        }
        cni cniVar = (cni) obj;
        return Float.compare(this.a, cniVar.a) == 0 && Float.compare(this.b, cniVar.b) == 0 && Float.compare(this.c, cniVar.c) == 0 && this.d == cniVar.d && this.e == cniVar.e && Float.compare(this.f, cniVar.f) == 0 && Float.compare(this.g, cniVar.g) == 0;
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + (true == this.d ? 1231 : 1237)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "ArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartX=" + this.f + ", arcStartY=" + this.g + ")";
    }
}
