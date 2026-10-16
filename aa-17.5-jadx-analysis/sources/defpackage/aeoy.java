package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aeoy {
    public static final long[] a = new long[0];
    public static final long[] b = new long[0];

    public static void a(long[] jArr, int i, int i2) {
        adqs.s(jArr.length, i, i2);
    }

    public static void b(long[] jArr, int i, int i2, aepf aepfVar, long[] jArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (jArr2 == null) {
                jArr2 = Arrays.copyOf(jArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            b(jArr2, i, i4, aepfVar, jArr);
            b(jArr2, i4, i2, aepfVar, jArr);
            if (aepfVar.a(jArr2[i4 - 1], jArr2[i4]) <= 0) {
                System.arraycopy(jArr2, i, jArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && aepfVar.a(jArr2[i5], jArr2[i6]) <= 0)) {
                    jArr[i] = jArr2[i5];
                    i5++;
                } else {
                    jArr[i] = jArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            long j = jArr[i8];
            long j2 = jArr[i7];
            int i9 = i8;
            while (true) {
                if (aepfVar.a(j, j2) < 0) {
                    jArr[i9] = j2;
                    int i10 = i9 - 1;
                    if (i == i10) {
                        i9 = i10;
                        break;
                    } else {
                        long j3 = jArr[i9 - 2];
                        i9 = i10;
                        j2 = j3;
                    }
                }
            }
            jArr[i9] = j;
            i7 = i8;
        }
    }

    public static void c(long[] jArr, int i, int i2) {
        int iG;
        int iG2;
        int i3 = i2 - i;
        int i4 = i2 - 1;
        if (i3 < 16) {
            while (i < i4) {
                int i5 = i + 1;
                int i6 = i;
                for (int i7 = i5; i7 < i2; i7++) {
                    if (jArr[i7] < jArr[i6]) {
                        i6 = i7;
                    }
                }
                if (i6 != i) {
                    long j = jArr[i];
                    jArr[i] = jArr[i6];
                    jArr[i6] = j;
                }
                i = i5;
            }
            return;
        }
        int iG3 = (i3 >> 1) + i;
        if (i3 > 128) {
            int i8 = i3 >> 3;
            int i9 = i8 + i8;
            iG = g(jArr, i, i + i8, i + i9);
            iG3 = g(jArr, iG3 - i8, iG3, iG3 + i8);
            iG2 = g(jArr, i4 - i9, i4 - i8, i4);
        } else {
            iG = i;
            iG2 = i4;
        }
        long j2 = jArr[g(jArr, iG, iG3, iG2)];
        int i10 = i;
        int i11 = i10;
        int i12 = i4;
        while (true) {
            if (i10 <= i4) {
                int iCompare = Long.compare(jArr[i10], j2);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        d(jArr, i11, i10);
                        i11++;
                    }
                    i10++;
                }
            }
            while (i4 >= i10) {
                int iCompare2 = Long.compare(jArr[i4], j2);
                if (iCompare2 < 0) {
                    break;
                }
                if (iCompare2 == 0) {
                    d(jArr, i4, i12);
                    i12--;
                }
                i4--;
            }
            if (i10 > i4) {
                break;
            }
            d(jArr, i10, i4);
            i10++;
            i4--;
        }
        int i13 = i10 - i11;
        int iMin = Math.min(i11 - i, i13);
        e(jArr, i, i10 - iMin, iMin);
        int i14 = i12 - i4;
        int iMin2 = Math.min(i14, (i2 - i12) - 1);
        e(jArr, i10, i2 - iMin2, iMin2);
        if (i13 > 1) {
            c(jArr, i, i13 + i);
        }
        if (i14 > 1) {
            c(jArr, i2 - i14, i2);
        }
    }

    public static void d(long[] jArr, int i, int i2) {
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
    }

    public static void e(long[] jArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            d(jArr, i, i2);
            i++;
            i2++;
        }
    }

    public static void f(long[] jArr, int i) {
        int i2;
        int i3 = 0;
        if (i < 4000) {
            c(jArr, 0, i);
            return;
        }
        int[] iArr = new int[1786];
        int[] iArr2 = new int[1786];
        int[] iArr3 = new int[1786];
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = 0;
        int i4 = 256;
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            int i6 = iArr[i5];
            int i7 = iArr2[i5];
            int i8 = iArr3[i5];
            int i9 = i8 % 8;
            int i10 = i9 == 0 ? 128 : i3;
            int i11 = (7 - i9) * 8;
            int i12 = i7 + i6;
            int i13 = i12;
            while (true) {
                int i14 = i13 - 1;
                if (i13 == i6) {
                    break;
                }
                int i15 = i3;
                int i16 = (int) (((jArr[i14] >>> i11) & 255) ^ i10);
                iArr4[i16] = iArr4[i16] + 1;
                i3 = i15;
                i13 = i14;
                iArr = iArr;
            }
            int i17 = i3;
            int[] iArr6 = iArr;
            int i18 = i6;
            int i19 = -1;
            for (int i20 = i17; i20 < i4; i20++) {
                int i21 = iArr4[i20];
                if (i21 != 0) {
                    i19 = i20;
                }
                i18 += i21;
                iArr5[i20] = i18;
            }
            int i22 = i12 - iArr4[i19];
            while (i6 <= i22) {
                int[] iArr7 = iArr3;
                long j = i10;
                long j2 = jArr[i6];
                int i23 = (int) (((j2 >>> i11) & 255) ^ j);
                if (i6 < i22) {
                    while (true) {
                        int i24 = iArr5[i23] - 1;
                        iArr5[i23] = i24;
                        if (i24 <= i6) {
                            break;
                        }
                        long j3 = jArr[i24];
                        jArr[i24] = j2;
                        i23 = (int) (((j3 >>> i11) & 255) ^ j);
                        j2 = j3;
                    }
                    jArr[i6] = j2;
                }
                if (i8 < 7 && (i2 = iArr4[i23]) > 1) {
                    if (i2 < 1024) {
                        c(jArr, i6, i2 + i6);
                    } else {
                        iArr6[i5] = i6;
                        iArr2[i5] = i2;
                        iArr7[i5] = i8 + 1;
                        i5++;
                    }
                }
                i6 += iArr4[i23];
                iArr4[i23] = i17;
                iArr3 = iArr7;
                i4 = 256;
            }
            i3 = i17;
            iArr = iArr6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(long[] r6, int r7, int r8, int r9) {
        /*
            r0 = r6[r7]
            r2 = r6[r8]
            int r0 = java.lang.Long.compare(r0, r2)
            r1 = r6[r7]
            r3 = r6[r9]
            int r1 = java.lang.Long.compare(r1, r3)
            r2 = r6[r8]
            r4 = r6[r9]
            int r6 = java.lang.Long.compare(r2, r4)
            if (r0 >= 0) goto L20
            if (r6 >= 0) goto L1d
            goto L26
        L1d:
            if (r1 < 0) goto L25
            goto L24
        L20:
            if (r6 > 0) goto L26
            if (r1 > 0) goto L25
        L24:
            return r7
        L25:
            return r9
        L26:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeoy.g(long[], int, int, int):int");
    }
}
