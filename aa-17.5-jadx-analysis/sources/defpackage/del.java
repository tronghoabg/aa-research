package defpackage;

/* loaded from: classes.dex */
public final class del {
    public dek a;
    public long b;
    public long c;
    public long d;
    public long e;
    public float[] f;
    public final zh g;

    public del() {
        zh zhVar = zi.a;
        this.g = new zh(6);
        this.b = -1L;
        this.c = 0L;
        this.d = 0L;
    }

    public static final void b(dek dekVar, long j, long j2, float[] fArr, long j3) {
        long j4 = dekVar.e;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            dekVar.e = j3;
            dekVar.a(dekVar.c, dekVar.d, j, j2, fArr);
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
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.e) {
            return z;
        }
        this.e = j3;
        return true;
    }
}
