package defpackage;

/* loaded from: classes.dex */
public final class kve {
    public final float a;
    public final float b;
    public final float c;

    public kve(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kve)) {
            return false;
        }
        kve kveVar = (kve) obj;
        return dlj.c(this.a, kveVar.a) && dlj.c(this.b, kveVar.b) && dlj.c(this.c, kveVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.c;
        float f2 = this.b;
        return "FocusRingThickness(default=" + dlj.b(this.a) + ", hovered=" + dlj.b(f2) + ", pressed=" + dlj.b(f) + ")";
    }
}
