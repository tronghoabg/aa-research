package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnh {
    public final float a;
    public final float b;
    public final long c;
    public final long e;
    public final float f;
    public final int d = 3;
    private final defpackage.cka g = null;

    public cnh(float f, float f2, long j, long j2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.e = j2;
        this.f = defpackage.afqt.d(f3, 0.0f, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cnh)) {
            return false;
        }
        defpackage.cnh cnhVar = (defpackage.cnh) obj;
        if (java.lang.Float.compare(this.a, cnhVar.a) == 0 && java.lang.Float.compare(this.b, cnhVar.b) == 0 && this.c == cnhVar.c && this.f == cnhVar.f) {
            int i = cnhVar.d;
            if (this.e == cnhVar.e) {
                defpackage.cka ckaVar = cnhVar.g;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
        long j = this.c;
        int iFloatToIntBits2 = (((iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.f);
        long j2 = this.e;
        return ((((iFloatToIntBits2 * 31) + 3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
    }

    public final java.lang.String toString() {
        long j = this.e;
        long j2 = this.c;
        float f = this.b;
        return "Shadow(radius=" + defpackage.dlr.b(this.a) + ", spread=" + defpackage.dlr.b(f) + ", offset=" + defpackage.dls.a(j2) + ", alpha=" + this.f + ", blendMode=" + defpackage.cjw.a(3) + ", color=" + defpackage.ckd.g(j) + ", brush=null)";
    }
}
