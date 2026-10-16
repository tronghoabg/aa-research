package defpackage;

/* loaded from: classes2.dex */
public final class ggi {
    public final float a;
    public final float b;
    private final float c;

    public ggi(float f, float f2, float f3) {
        this.a = f;
        this.c = f2;
        this.b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggi)) {
            return false;
        }
        ggi ggiVar = (ggi) obj;
        return dlj.c(this.a, ggiVar.a) && dlj.c(this.c, ggiVar.c) && dlj.c(this.b, ggiVar.b);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        float f = this.b;
        float f2 = this.c;
        return "FocusRingThickness(default=" + dlj.b(this.a) + ", hovered=" + dlj.b(f2) + ", pressed=" + dlj.b(f) + ")";
    }
}
