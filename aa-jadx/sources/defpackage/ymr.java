package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ymr {
    transient java.lang.Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    public final transient float g;
    public transient int h;

    public ymr() {
        int iAB = defpackage.ysr.aB(3);
        this.e = l(iAB);
        this.g = 1.0f;
        this.a = new java.lang.Object[3];
        this.b = new int[3];
        long[] jArr = new long[3];
        java.util.Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = java.lang.Math.max(1, iAB);
    }

    public static int b(long j) {
        return (int) (j >>> 32);
    }

    public static long i(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    public static int[] l(int i) {
        int[] iArr = new int[i];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int a() {
        return this.c == 0 ? -1 : 0;
    }

    final int c(int i) {
        defpackage.ysr.bs(i, this.c);
        return this.b[i];
    }

    public final int d() {
        return this.e.length - 1;
    }

    final int e(java.lang.Object obj) {
        int iAA = defpackage.ysr.aA(obj);
        int i = this.e[d() & iAA];
        while (i != -1) {
            long j = this.f[i];
            if (b(j) == iAA && j$.util.Objects.equals(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public final int g(java.lang.Object obj, int i) {
        long[] jArr;
        long j;
        int iD = d() & i;
        int i2 = this.e[iD];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (b(this.f[i2]) == i && j$.util.Objects.equals(obj, this.a[i2])) {
                    int[] iArr = this.b;
                    int i4 = iArr[i2];
                    if (i3 == -1) {
                        this.e[iD] = (int) this.f[i2];
                    } else {
                        long[] jArr2 = this.f;
                        jArr2[i3] = i(jArr2[i3], (int) jArr2[i2]);
                    }
                    int i5 = this.c - 1;
                    java.lang.Object[] objArr = this.a;
                    if (i2 < i5) {
                        objArr[i2] = objArr[i5];
                        iArr[i2] = iArr[i5];
                        objArr[i5] = null;
                        iArr[i5] = 0;
                        long[] jArr3 = this.f;
                        long j2 = jArr3[i5];
                        jArr3[i2] = j2;
                        jArr3[i5] = -1;
                        int iB = b(j2) & d();
                        int[] iArr2 = this.e;
                        int i6 = iArr2[iB];
                        if (i6 == i5) {
                            iArr2[iB] = i2;
                        } else {
                            while (true) {
                                jArr = this.f;
                                j = jArr[i6];
                                int i7 = (int) j;
                                if (i7 == i5) {
                                    break;
                                }
                                i6 = i7;
                            }
                            jArr[i6] = i(j, i2);
                        }
                    } else {
                        objArr[i2] = null;
                        iArr[i2] = 0;
                        this.f[i2] = -1;
                    }
                    this.c--;
                    this.d++;
                    return i4;
                }
                int i8 = (int) this.f[i2];
                if (i8 != -1) {
                    i3 = i2;
                    i2 = i8;
                }
            }
        }
        return 0;
    }

    final int h(int i) {
        return g(this.a[i], b(this.f[i]));
    }

    final java.lang.Object j(int i) {
        defpackage.ysr.bs(i, this.c);
        return this.a[i];
    }

    final void k(int i, int i2) {
        defpackage.ysr.bs(i, this.c);
        this.b[i] = i2;
    }
}
