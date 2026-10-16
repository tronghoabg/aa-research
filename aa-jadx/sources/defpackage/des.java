package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class des {
    public defpackage.der a;
    public long b;
    public long c;
    public long d;
    public long e;
    public float[] f;
    public final defpackage.zo g;

    public des() {
        defpackage.zo zoVar = defpackage.zp.a;
        this.g = new defpackage.zo(6);
        this.b = -1L;
        this.c = 0L;
        this.d = 0L;
    }

    public static final void b(defpackage.der derVar, long j, long j2, float[] fArr, long j3) {
        long j4 = derVar.e;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            derVar.e = j3;
            derVar.a(derVar.c, derVar.d, j, j2, fArr);
        }
    }

    public final boolean a(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (j2 == this.c) {
            z = false;
        } else {
            this.c = j2;
            z = true;
        }
        if (j != this.d) {
            this.d = j;
            z = true;
        }
        if (fArr != null) {
            this.f = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.e) {
            return z;
        }
        this.e = j3;
        return true;
    }
}
