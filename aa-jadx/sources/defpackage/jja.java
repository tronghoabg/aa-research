package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jja {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public jja(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jja)) {
            return false;
        }
        defpackage.jja jjaVar = (defpackage.jja) obj;
        return this.a == jjaVar.a && this.b == jjaVar.b && this.c == jjaVar.c && this.d == jjaVar.d && java.lang.Float.compare(this.e, jjaVar.e) == 0;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final java.lang.String toString() {
        return "DisplayGeometry(leftMargin=" + this.a + ", topMargin=" + this.b + ", width=" + this.c + ", height=" + this.d + ", pixelAspectRatio=" + this.e + ")";
    }
}
