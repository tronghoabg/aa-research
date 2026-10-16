package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kvk {
    public final float a;
    public final float b;
    public final float c;

    public kvk(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kvk)) {
            return false;
        }
        defpackage.kvk kvkVar = (defpackage.kvk) obj;
        return defpackage.dlr.c(this.a, kvkVar.a) && defpackage.dlr.c(this.b, kvkVar.b) && defpackage.dlr.c(this.c, kvkVar.c);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        float f = this.c;
        float f2 = this.b;
        return "FocusRingThickness(default=" + defpackage.dlr.b(this.a) + ", hovered=" + defpackage.dlr.b(f2) + ", pressed=" + defpackage.dlr.b(f) + ")";
    }
}
