package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjj {
    public static final defpackage.cjj a = new defpackage.cjj(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cjj(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static /* synthetic */ defpackage.cjj j(defpackage.cjj cjjVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = cjjVar.b;
        }
        float f4 = (i & 2) != 0 ? cjjVar.c : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if ((i & 4) != 0) {
            f2 = cjjVar.d;
        }
        if ((i & 8) != 0) {
            f3 = cjjVar.e;
        }
        return new defpackage.cjj(f, f4, f2, f3);
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (jFloatToRawIntBits << 32) | (((long) java.lang.Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f))) & 4294967295L);
    }

    public final long b() {
        return (((long) java.lang.Float.floatToRawIntBits(this.d - this.b)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.e - this.c)) & 4294967295L);
    }

    public final long c() {
        return (((long) java.lang.Float.floatToRawIntBits(this.b)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.c)) & 4294967295L);
    }

    public final defpackage.cjj d(defpackage.cjj cjjVar) {
        return new defpackage.cjj(java.lang.Math.max(this.b, cjjVar.b), java.lang.Math.max(this.c, cjjVar.c), java.lang.Math.min(this.d, cjjVar.d), java.lang.Math.min(this.e, cjjVar.e));
    }

    public final defpackage.cjj e(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new defpackage.cjj(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cjj)) {
            return false;
        }
        defpackage.cjj cjjVar = (defpackage.cjj) obj;
        return java.lang.Float.compare(this.b, cjjVar.b) == 0 && java.lang.Float.compare(this.c, cjjVar.c) == 0 && java.lang.Float.compare(this.d, cjjVar.d) == 0 && java.lang.Float.compare(this.e, cjjVar.e) == 0;
    }

    public final defpackage.cjj f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.cjj(this.b + java.lang.Float.intBitsToFloat(i), this.c + java.lang.Float.intBitsToFloat(i2), this.d + java.lang.Float.intBitsToFloat(i), this.e + java.lang.Float.intBitsToFloat(i2));
    }

    public final boolean g(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float f = this.b;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat < this.d) & (fIntBitsToFloat >= f) & (fIntBitsToFloat2 >= this.c) & (fIntBitsToFloat2 < this.e);
    }

    public final boolean h() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final boolean i(defpackage.cjj cjjVar) {
        return (this.b < cjjVar.d) & (cjjVar.b < this.d) & (this.c < cjjVar.e) & (cjjVar.c < this.e);
    }

    public final java.lang.String toString() {
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        return "Rect.fromLTRB(" + defpackage.bzd.p(this.b) + ", " + defpackage.bzd.p(f3) + ", " + defpackage.bzd.p(f2) + ", " + defpackage.bzd.p(f) + ")";
    }
}
