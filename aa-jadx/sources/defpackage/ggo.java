package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ggo {
    public final float a;
    public final float b;
    private final float c;

    public ggo(float f, float f2, float f3) {
        this.a = f;
        this.c = f2;
        this.b = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ggo)) {
            return false;
        }
        defpackage.ggo ggoVar = (defpackage.ggo) obj;
        return defpackage.dlr.c(this.a, ggoVar.a) && defpackage.dlr.c(this.c, ggoVar.c) && defpackage.dlr.c(this.b, ggoVar.b);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        float f = this.b;
        float f2 = this.c;
        return "FocusRingThickness(default=" + defpackage.dlr.b(this.a) + ", hovered=" + defpackage.dlr.b(f2) + ", pressed=" + defpackage.dlr.b(f) + ")";
    }
}
