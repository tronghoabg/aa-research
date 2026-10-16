package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class deq {
    public final long a;
    public final long b;
    public final long c;
    private final long d;
    private final long e;
    private final float[] f;
    private final defpackage.cwn g;

    public deq(long j, long j2, long j3, long j4, long j5, float[] fArr, defpackage.cwn cwnVar) {
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.c = j5;
        this.f = fArr;
        this.g = cwnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.deq deqVar = (defpackage.deq) obj;
            if (this.a == deqVar.a && this.b == deqVar.b && this.c == deqVar.c && this.d == deqVar.d && this.e == deqVar.e) {
                float[] fArr = this.f;
                float[] fArr2 = deqVar.f;
                if (fArr != null ? !(fArr2 == null || !defpackage.afga.f(fArr, fArr2)) : fArr2 == null) {
                    return defpackage.afga.f(this.g, deqVar.g);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f;
        int iHashCode = fArr != null ? java.util.Arrays.hashCode(fArr) : 0;
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        long j5 = this.a;
        return (((((((((((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + this.g.hashCode();
    }
}
