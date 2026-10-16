package defpackage;

/* loaded from: classes2.dex */
public final class jit {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public jit(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jit)) {
            return false;
        }
        jit jitVar = (jit) obj;
        return this.a == jitVar.a && this.b == jitVar.b && this.c == jitVar.c && this.d == jitVar.d && Float.compare(this.e, jitVar.e) == 0;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "DisplayGeometry(leftMargin=" + this.a + ", topMargin=" + this.b + ", width=" + this.c + ", height=" + this.d + ", pixelAspectRatio=" + this.e + ")";
    }
}
