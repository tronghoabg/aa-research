package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajl {
    public final float a;
    public final defpackage.cka b;

    public ajl(float f, defpackage.cka ckaVar) {
        this.a = f;
        this.b = ckaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ajl)) {
            return false;
        }
        defpackage.ajl ajlVar = (defpackage.ajl) obj;
        return java.lang.Float.compare(this.a, ajlVar.a) == 0 && defpackage.afga.f(this.b, ajlVar.b);
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BorderStroke(width=" + defpackage.dlr.b(this.a) + ", brush=" + this.b + ")";
    }
}
