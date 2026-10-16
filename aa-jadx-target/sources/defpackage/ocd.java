package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ocd {
    public final defpackage.cju a;
    private final float b;
    private final float c;

    public ocd(defpackage.cju cjuVar, float f, float f2) {
        this.a = cjuVar;
        this.b = f;
        this.c = f2;
    }

    public final float a(float f, float f2) {
        return java.lang.Math.min(f / this.b, f2 / this.c);
    }

    public final long b(float f) {
        return (((long) java.lang.Float.floatToRawIntBits(this.c * f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(this.b * f) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ocd)) {
            return false;
        }
        defpackage.ocd ocdVar = (defpackage.ocd) obj;
        return defpackage.afga.f(this.a, ocdVar.a) && defpackage.dlr.c(this.b, ocdVar.b) && defpackage.dlr.c(this.c, ocdVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        float f = this.c;
        return "PathSpec(path=" + this.a + ", viewportWidth=" + defpackage.dlr.b(this.b) + ", viewportHeight=" + defpackage.dlr.b(f) + ")";
    }
}
