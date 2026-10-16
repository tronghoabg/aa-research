package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmo extends defpackage.dai {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final defpackage.rj e;

    public /* synthetic */ cmo(float f, float f2, int i, int i2, int i3) {
        super(null);
        this.a = 1 == (i3 & 1) ? 0.0f : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cmo)) {
            return false;
        }
        defpackage.cmo cmoVar = (defpackage.cmo) obj;
        if (this.a != cmoVar.a || this.b != cmoVar.b || this.c != cmoVar.c || this.d != cmoVar.d) {
            return false;
        }
        defpackage.rj rjVar = cmoVar.e;
        return true;
    }

    public final int hashCode() {
        return ((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final java.lang.String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + defpackage.clg.a(this.c) + ", join=" + defpackage.clh.a(this.d) + ", pathEffect=null)";
    }
}
