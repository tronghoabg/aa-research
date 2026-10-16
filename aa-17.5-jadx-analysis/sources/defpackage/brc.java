package defpackage;

/* loaded from: classes2.dex */
public final class brc {
    public final float a;
    public final float b;
    private final float c;

    public brc(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brc)) {
            return false;
        }
        brc brcVar = (brc) obj;
        return dlj.c(this.a, brcVar.a) && dlj.c(this.b, brcVar.b) && dlj.c(this.c, brcVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.c;
        float f2 = this.a;
        float f3 = this.b;
        float f4 = f2 + f3;
        return "TabPosition(left=" + dlj.b(f2) + ", right=" + dlj.b(f4) + ", width=" + dlj.b(f3) + ", contentWidth=" + dlj.b(f) + ")";
    }
}
