package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ylm {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    public final transient float g;
    public transient int h;

    public ylm() {
        int iY = wub.y(3);
        this.e = l(iY);
        this.g = 1.0f;
        this.a = new Object[3];
        this.b = new int[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, iY);
    }

    public static int b(long j) {
        return (int) (j >>> 32);
    }

    public static long i(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    public static int[] l(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int a() {
        return this.c == 0 ? -1 : 0;
    }

    final int c(int i) {
        woy.ai(i, this.c);
        return this.b[i];
    }

    public final int d() {
        return this.e.length - 1;
    }

    final int e(Object obj) {
        int iX = wub.x(obj);
        int i = this.e[d() & iX];
        while (i != -1) {
            long j = this.f[i];
            if (b(j) == iX && Objects.equals(obj, this.a[i])) {
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

    public final int g(Object obj, int i) {
        long[] jArr;
        long j;
        int iD = d() & i;
        int i2 = this.e[iD];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (b(this.f[i2]) != i || !Objects.equals(obj, this.a[i2])) {
                    int i4 = (int) this.f[i2];
                    if (i4 == -1) {
                        break;
                    }
                    i3 = i2;
                    i2 = i4;
                } else {
                    int[] iArr = this.b;
                    int i5 = iArr[i2];
                    if (i3 == -1) {
                        this.e[iD] = (int) this.f[i2];
                    } else {
                        long[] jArr2 = this.f;
                        jArr2[i3] = i(jArr2[i3], (int) jArr2[i2]);
                    }
                    int i6 = this.c - 1;
                    Object[] objArr = this.a;
                    if (i2 < i6) {
                        objArr[i2] = objArr[i6];
                        iArr[i2] = iArr[i6];
                        objArr[i6] = null;
                        iArr[i6] = 0;
                        long[] jArr3 = this.f;
                        long j2 = jArr3[i6];
                        jArr3[i2] = j2;
                        jArr3[i6] = -1;
                        int iB = b(j2) & d();
                        int[] iArr2 = this.e;
                        int i7 = iArr2[iB];
                        if (i7 == i6) {
                            iArr2[iB] = i2;
                        } else {
                            while (true) {
                                jArr = this.f;
                                j = jArr[i7];
                                int i8 = (int) j;
                                if (i8 == i6) {
                                    break;
                                }
                                i7 = i8;
                            }
                            jArr[i7] = i(j, i2);
                        }
                    } else {
                        objArr[i2] = null;
                        iArr[i2] = 0;
                        this.f[i2] = -1;
                    }
                    this.c--;
                    this.d++;
                    return i5;
                }
            }
        }
        return 0;
    }

    final int h(int i) {
        return g(this.a[i], b(this.f[i]));
    }

    final Object j(int i) {
        woy.ai(i, this.c);
        return this.a[i];
    }

    final void k(int i, int i2) {
        woy.ai(i, this.c);
        this.b[i] = i2;
    }
}
