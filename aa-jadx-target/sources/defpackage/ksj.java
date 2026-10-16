package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ksj {
    public final float a;
    public final long b;
    public final float c;
    public final float d;

    public ksj(float f, long j, float f2, float f3) {
        this.a = f;
        this.b = j;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ksj)) {
            return false;
        }
        defpackage.ksj ksjVar = (defpackage.ksj) obj;
        return java.lang.Float.compare(this.a, ksjVar.a) == 0 && defpackage.a.i(this.b, ksjVar.b) && defpackage.dlr.c(this.c, ksjVar.c) && defpackage.dlr.c(this.d, ksjVar.d);
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + defpackage.a.f(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        float f = this.d;
        float f2 = this.c;
        return "ShadowProperty(alpha=" + this.a + ", offset=" + defpackage.dls.a(this.b) + ", radius=" + defpackage.dlr.b(f2) + ", spread=" + defpackage.dlr.b(f) + ")";
    }
}
