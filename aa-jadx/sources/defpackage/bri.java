package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bri {
    public final float a;
    public final float b;
    private final float c;

    public bri(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bri)) {
            return false;
        }
        defpackage.bri briVar = (defpackage.bri) obj;
        return defpackage.dlr.c(this.a, briVar.a) && defpackage.dlr.c(this.b, briVar.b) && defpackage.dlr.c(this.c, briVar.c);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        float f = this.c;
        float f2 = this.a;
        float f3 = this.b;
        float f4 = f2 + f3;
        return "TabPosition(left=" + defpackage.dlr.b(f2) + ", right=" + defpackage.dlr.b(f4) + ", width=" + defpackage.dlr.b(f3) + ", contentWidth=" + defpackage.dlr.b(f) + ")";
    }
}
