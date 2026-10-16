package defpackage;

/* loaded from: classes.dex */
public final class ceh {
    public int a;
    public long[] b = new long[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public ceh() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    private final void d(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final long a(long j) {
        return this.a > 0 ? this.b[0] : j;
    }

    public final void b(int i) {
        int i2 = this.d[i];
        d(i2, this.a - 1);
        this.a--;
        c(i2);
        long[] jArr = this.b;
        int i3 = this.a >> 1;
        while (i2 < i3) {
            int i4 = i2 + 1;
            int i5 = i4 + i4;
            int i6 = i5 - 1;
            if (i5 < this.a) {
                long j = jArr[i5];
                if (affa.c(j, jArr[i6]) < 0) {
                    if (affa.c(j, jArr[i2]) >= 0) {
                        break;
                    }
                    d(i5, i2);
                    i2 = i5;
                }
            }
            if (affa.c(jArr[i6], jArr[i2]) >= 0) {
                break;
            }
            d(i6, i2);
            i2 = i6;
        }
        this.d[i] = this.e;
        this.e = i;
    }

    public final void c(int i) {
        long[] jArr = this.b;
        long j = jArr[i];
        while (i > 0) {
            int i2 = ((i + 1) >> 1) - 1;
            if (affa.c(jArr[i2], j) <= 0) {
                return;
            }
            d(i2, i);
            i = i2;
        }
    }
}
