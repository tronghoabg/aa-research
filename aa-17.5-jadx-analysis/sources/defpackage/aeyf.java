package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aeyf {
    public static final short[] a = new short[0];
    public static final short[] b = new short[0];

    public static void a(short[] sArr, int i, int i2) {
        adqs.s(sArr.length, i, i2);
    }

    public static void b(short[] sArr, int i, int i2, aeyk aeykVar, short[] sArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (sArr2 == null) {
                sArr2 = Arrays.copyOf(sArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            b(sArr2, i, i4, aeykVar, sArr);
            b(sArr2, i4, i2, aeykVar, sArr);
            if (aeykVar.b(sArr2[i4 - 1], sArr2[i4]) <= 0) {
                System.arraycopy(sArr2, i, sArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && aeykVar.b(sArr2[i5], sArr2[i6]) <= 0)) {
                    sArr[i] = sArr2[i5];
                    i5++;
                } else {
                    sArr[i] = sArr2[i6];
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
            short s = sArr[i8];
            short s2 = sArr[i7];
            int i9 = i8;
            while (true) {
                if (aeykVar.b(s, s2) < 0) {
                    sArr[i9] = s2;
                    int i10 = i9 - 1;
                    if (i == i10) {
                        i9 = i10;
                        break;
                    } else {
                        short s3 = sArr[i9 - 2];
                        i9 = i10;
                        s2 = s3;
                    }
                }
            }
            sArr[i9] = s;
            i7 = i8;
        }
    }

    public static void c(short[] sArr, int i, int i2) {
        int iG;
        int iG2;
        int i3 = i2 - i;
        int i4 = i2 - 1;
        if (i3 < 16) {
            while (i < i4) {
                int i5 = i + 1;
                int i6 = i;
                for (int i7 = i5; i7 < i2; i7++) {
                    if (sArr[i7] < sArr[i6]) {
                        i6 = i7;
                    }
                }
                if (i6 != i) {
                    short s = sArr[i];
                    sArr[i] = sArr[i6];
                    sArr[i6] = s;
                }
                i = i5;
            }
            return;
        }
        int iG3 = (i3 >> 1) + i;
        if (i3 > 128) {
            int i8 = i3 >> 3;
            int i9 = i8 + i8;
            iG = g(sArr, i, i + i8, i + i9);
            iG3 = g(sArr, iG3 - i8, iG3, iG3 + i8);
            iG2 = g(sArr, i4 - i9, i4 - i8, i4);
        } else {
            iG = i;
            iG2 = i4;
        }
        short s2 = sArr[g(sArr, iG, iG3, iG2)];
        int i10 = i;
        int i11 = i10;
        int i12 = i4;
        while (true) {
            if (i10 <= i4) {
                int iCompare = Short.compare(sArr[i10], s2);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        d(sArr, i11, i10);
                        i11++;
                    }
                    i10++;
                }
            }
            while (i4 >= i10) {
                int iCompare2 = Short.compare(sArr[i4], s2);
                if (iCompare2 < 0) {
                    break;
                }
                if (iCompare2 == 0) {
                    d(sArr, i4, i12);
                    i12--;
                }
                i4--;
            }
            if (i10 > i4) {
                break;
            }
            d(sArr, i10, i4);
            i10++;
            i4--;
        }
        int i13 = i11 - i;
        int i14 = i10 - i11;
        int iMin = Math.min(i13, i14);
        e(sArr, i, i10 - iMin, iMin);
        int i15 = i12 - i4;
        int iMin2 = Math.min(i15, (i2 - i12) - 1);
        e(sArr, i10, i2 - iMin2, iMin2);
        if (i14 > 1) {
            c(sArr, i, i14 + i);
        }
        if (i15 > 1) {
            c(sArr, i2 - i15, i2);
        }
    }

    public static void d(short[] sArr, int i, int i2) {
        short s = sArr[i];
        sArr[i] = sArr[i2];
        sArr[i2] = s;
    }

    public static void e(short[] sArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            d(sArr, i, i2);
            i++;
            i2++;
        }
    }

    public static void f(short[] sArr, int i) {
        int i2;
        int i3;
        int i4 = 0;
        if (i < 1000) {
            c(sArr, 0, i);
            return;
        }
        if (i < 1024) {
            c(sArr, 0, i);
            return;
        }
        int i5 = 256;
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[256];
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = 0;
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int i6 = 1;
        while (i6 > 0) {
            i6--;
            int i7 = iArr[i6];
            int i8 = iArr2[i6];
            int i9 = iArr3[i6];
            int i10 = i9 % 2;
            int i11 = i10 == 0 ? 128 : i4;
            int i12 = 1 - i10;
            int i13 = i8 + i7;
            int i14 = i4;
            int i15 = i13;
            while (true) {
                i2 = i12 * 8;
                int i16 = i15 - 1;
                if (i15 == i7) {
                    break;
                }
                int i17 = ((sArr[i16] >>> i2) & 255) ^ i11;
                iArr4[i17] = iArr4[i17] + 1;
                i15 = i16;
            }
            int i18 = i7;
            int i19 = -1;
            for (int i20 = i14; i20 < i5; i20++) {
                int i21 = iArr4[i20];
                if (i21 != 0) {
                    i19 = i20;
                }
                i18 += i21;
                iArr5[i20] = i18;
            }
            int i22 = i13 - iArr4[i19];
            while (i7 <= i22) {
                short s = sArr[i7];
                int i23 = ((s >>> i2) & 255) ^ i11;
                if (i7 < i22) {
                    while (true) {
                        int i24 = iArr5[i23] - 1;
                        iArr5[i23] = i24;
                        if (i24 <= i7) {
                            break;
                        }
                        short s2 = sArr[i24];
                        sArr[i24] = s;
                        s = s2;
                        i23 = ((s2 >>> i2) & 255) ^ i11;
                    }
                    sArr[i7] = s;
                }
                if (i9 <= 0 && (i3 = iArr4[i23]) > 1) {
                    if (i3 < 1024) {
                        c(sArr, i7, i3 + i7);
                    } else {
                        iArr[i6] = i7;
                        iArr2[i6] = i3;
                        iArr3[i6] = i9 + 1;
                        i6++;
                    }
                }
                i7 += iArr4[i23];
                iArr4[i23] = i14;
                i5 = 256;
            }
            i4 = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(short[] r3, int r4, int r5, int r6) {
        /*
            short r0 = r3[r4]
            short r1 = r3[r5]
            int r0 = java.lang.Short.compare(r0, r1)
            short r1 = r3[r4]
            short r2 = r3[r6]
            int r1 = java.lang.Short.compare(r1, r2)
            short r2 = r3[r5]
            short r3 = r3[r6]
            int r3 = java.lang.Short.compare(r2, r3)
            if (r0 >= 0) goto L20
            if (r3 >= 0) goto L1d
            goto L26
        L1d:
            if (r1 < 0) goto L25
            goto L24
        L20:
            if (r3 > 0) goto L26
            if (r1 > 0) goto L25
        L24:
            return r4
        L25:
            return r6
        L26:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyf.g(short[], int, int, int):int");
    }
}
