package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aejc {
    public static final int[] a = new int[0];
    public static final int[] b = new int[0];

    public static void a(int[] iArr, int i, int i2) {
        adqs.s(iArr.length, i, i2);
    }

    public static void b(int[] iArr, int i, int i2, aejj aejjVar, int[] iArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (iArr2 == null) {
                iArr2 = Arrays.copyOf(iArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            b(iArr2, i, i4, aejjVar, iArr);
            b(iArr2, i4, i2, aejjVar, iArr);
            if (aejjVar.a(iArr2[i4 - 1], iArr2[i4]) <= 0) {
                System.arraycopy(iArr2, i, iArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && aejjVar.a(iArr2[i5], iArr2[i6]) <= 0)) {
                    iArr[i] = iArr2[i5];
                    i5++;
                } else {
                    iArr[i] = iArr2[i6];
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
            int i9 = iArr[i8];
            int i10 = iArr[i7];
            int i11 = i8;
            while (true) {
                if (aejjVar.a(i9, i10) < 0) {
                    iArr[i11] = i10;
                    int i12 = i11 - 1;
                    if (i == i12) {
                        i11 = i12;
                        break;
                    } else {
                        int i13 = iArr[i11 - 2];
                        i11 = i12;
                        i10 = i13;
                    }
                }
            }
            iArr[i11] = i9;
            i7 = i8;
        }
    }

    public static void c(int[] iArr, int i, int i2) {
        int iG;
        int iG2;
        int i3 = i2 - i;
        int i4 = i2 - 1;
        if (i3 < 16) {
            while (i < i4) {
                int i5 = i + 1;
                int i6 = i;
                for (int i7 = i5; i7 < i2; i7++) {
                    if (iArr[i7] < iArr[i6]) {
                        i6 = i7;
                    }
                }
                if (i6 != i) {
                    int i8 = iArr[i];
                    iArr[i] = iArr[i6];
                    iArr[i6] = i8;
                }
                i = i5;
            }
            return;
        }
        int iG3 = (i3 >> 1) + i;
        if (i3 > 128) {
            int i9 = i3 >> 3;
            int i10 = i9 + i9;
            iG = g(iArr, i, i + i9, i + i10);
            iG3 = g(iArr, iG3 - i9, iG3, iG3 + i9);
            iG2 = g(iArr, i4 - i10, i4 - i9, i4);
        } else {
            iG = i;
            iG2 = i4;
        }
        int i11 = iArr[g(iArr, iG, iG3, iG2)];
        int i12 = i;
        int i13 = i12;
        int i14 = i4;
        while (true) {
            if (i12 <= i4) {
                int iCompare = Integer.compare(iArr[i12], i11);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        d(iArr, i13, i12);
                        i13++;
                    }
                    i12++;
                }
            }
            while (i4 >= i12) {
                int iCompare2 = Integer.compare(iArr[i4], i11);
                if (iCompare2 < 0) {
                    break;
                }
                if (iCompare2 == 0) {
                    d(iArr, i4, i14);
                    i14--;
                }
                i4--;
            }
            if (i12 > i4) {
                break;
            }
            d(iArr, i12, i4);
            i12++;
            i4--;
        }
        int i15 = i13 - i;
        int i16 = i12 - i13;
        int iMin = Math.min(i15, i16);
        e(iArr, i, i12 - iMin, iMin);
        int i17 = i14 - i4;
        int iMin2 = Math.min(i17, (i2 - i14) - 1);
        e(iArr, i12, i2 - iMin2, iMin2);
        if (i16 > 1) {
            c(iArr, i, i16 + i);
        }
        if (i17 > 1) {
            c(iArr, i2 - i17, i2);
        }
    }

    public static void d(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static void e(int[] iArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            d(iArr, i, i2);
            i++;
            i2++;
        }
    }

    public static void f(int[] iArr, int i) {
        int i2;
        int i3;
        if (i < 2000) {
            c(iArr, 0, i);
            return;
        }
        int[] iArr2 = new int[766];
        int[] iArr3 = new int[766];
        int[] iArr4 = new int[766];
        iArr2[0] = 0;
        iArr3[0] = i;
        iArr4[0] = 0;
        int i4 = 256;
        int[] iArr5 = new int[256];
        int[] iArr6 = new int[256];
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            int i6 = iArr2[i5];
            int i7 = iArr3[i5];
            int i8 = iArr4[i5];
            int i9 = i8 % 4;
            int i10 = i9 == 0 ? 128 : 0;
            int i11 = 3 - i9;
            int i12 = i7 + i6;
            int i13 = i12;
            while (true) {
                i2 = i11 * 8;
                int i14 = i13 - 1;
                if (i13 == i6) {
                    break;
                }
                int i15 = ((iArr[i14] >>> i2) & 255) ^ i10;
                iArr5[i15] = iArr5[i15] + 1;
                i13 = i14;
            }
            int i16 = i6;
            int i17 = -1;
            for (int i18 = 0; i18 < i4; i18++) {
                int i19 = iArr5[i18];
                if (i19 != 0) {
                    i17 = i18;
                }
                i16 += i19;
                iArr6[i18] = i16;
            }
            int i20 = i12 - iArr5[i17];
            while (i6 <= i20) {
                int i21 = iArr[i6];
                int i22 = ((i21 >>> i2) & 255) ^ i10;
                if (i6 < i20) {
                    while (true) {
                        int i23 = iArr6[i22] - 1;
                        iArr6[i22] = i23;
                        if (i23 <= i6) {
                            break;
                        }
                        int i24 = iArr[i23];
                        iArr[i23] = i21;
                        i21 = i24;
                        i22 = ((i24 >>> i2) & 255) ^ i10;
                    }
                    iArr[i6] = i21;
                }
                if (i8 < 3 && (i3 = iArr5[i22]) > 1) {
                    if (i3 < 1024) {
                        c(iArr, i6, i3 + i6);
                    } else {
                        iArr2[i5] = i6;
                        iArr3[i5] = i3;
                        iArr4[i5] = i8 + 1;
                        i5++;
                    }
                }
                i6 += iArr5[i22];
                iArr5[i22] = 0;
                i4 = 256;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(int[] r3, int r4, int r5, int r6) {
        /*
            r0 = r3[r4]
            r1 = r3[r5]
            int r0 = java.lang.Integer.compare(r0, r1)
            r1 = r3[r4]
            r2 = r3[r6]
            int r1 = java.lang.Integer.compare(r1, r2)
            r2 = r3[r5]
            r3 = r3[r6]
            int r3 = java.lang.Integer.compare(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejc.g(int[], int, int, int):int");
    }
}
