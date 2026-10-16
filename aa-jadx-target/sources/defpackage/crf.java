package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final java.util.List i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public crf(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.List list, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.crf)) {
            return false;
        }
        defpackage.crf crfVar = (defpackage.crf) obj;
        return this.a == crfVar.a && this.b == crfVar.b && this.c == crfVar.c && this.d == crfVar.d && this.e == crfVar.e && java.lang.Float.compare(this.f, crfVar.f) == 0 && this.g == crfVar.g && this.h == crfVar.h && defpackage.afga.f(this.i, crfVar.i) && this.j == crfVar.j && java.lang.Float.compare(this.k, crfVar.k) == 0 && this.l == crfVar.l && this.m == crfVar.m;
    }

    public final int hashCode() {
        boolean z = this.e;
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.f);
        int i = true != z ? 1237 : 1231;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        int i2 = (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + i) * 31) + iFloatToIntBits;
        java.util.List list = this.i;
        int iHashCode = (((((i2 * 31) + this.g) * 31) + (true == this.h ? 1231 : 1237)) * 31) + list.hashCode();
        float f = this.k;
        long j5 = this.j;
        int iFloatToIntBits2 = (((iHashCode * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(f);
        long j6 = this.m;
        long j7 = this.l;
        return (((iFloatToIntBits2 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final java.lang.String toString() {
        long j = this.m;
        long j2 = this.l;
        long j3 = this.j;
        long j4 = this.d;
        long j5 = this.c;
        return "PointerInputEventData(id=" + defpackage.crc.a(this.a) + ", uptime=" + this.b + ", positionOnScreen=" + defpackage.cji.d(j5) + ", position=" + defpackage.cji.d(j4) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + defpackage.crl.a(this.g) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + defpackage.cji.d(j3) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + defpackage.cji.d(j2) + ", originalEventPosition=" + defpackage.cji.d(j) + ")";
    }
}
