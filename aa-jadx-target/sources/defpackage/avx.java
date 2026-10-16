package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avx implements defpackage.avv {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public avx(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            defpackage.axd.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.avv
    public final float a() {
        return this.b;
    }

    @Override // defpackage.avv
    public final float b(defpackage.dlz dlzVar) {
        return dlzVar == defpackage.dlz.a ? this.c : this.d;
    }

    @Override // defpackage.avv
    public final float c(defpackage.dlz dlzVar) {
        return dlzVar == defpackage.dlz.a ? this.d : this.c;
    }

    @Override // defpackage.avv
    public final float d() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.avx)) {
            return false;
        }
        defpackage.avx avxVar = (defpackage.avx) obj;
        return java.lang.Float.compare(this.c, avxVar.c) == 0 && java.lang.Float.compare(this.a, avxVar.a) == 0 && java.lang.Float.compare(this.d, avxVar.d) == 0 && java.lang.Float.compare(this.b, avxVar.b) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.a)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        float f = this.b;
        float f2 = this.d;
        float f3 = this.a;
        return "PaddingValues(start=" + defpackage.dlr.b(this.c) + ", top=" + defpackage.dlr.b(f3) + ", end=" + defpackage.dlr.b(f2) + ", bottom=" + defpackage.dlr.b(f) + ")";
    }
}
