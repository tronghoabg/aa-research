package defpackage;

/* loaded from: classes.dex */
public final class cnr extends cob {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public cnr(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof cnr)) {
            return false;
        }
        cnr cnrVar = (cnr) obj;
        return Float.compare(this.a, cnrVar.a) == 0 && Float.compare(this.b, cnrVar.b) == 0 && Float.compare(this.c, cnrVar.c) == 0 && this.d == cnrVar.d && this.e == cnrVar.e && Float.compare(this.f, cnrVar.f) == 0 && Float.compare(this.g, cnrVar.g) == 0;
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + (true == this.d ? 1231 : 1237)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartDx=" + this.f + ", arcStartDy=" + this.g + ")";
    }
}
