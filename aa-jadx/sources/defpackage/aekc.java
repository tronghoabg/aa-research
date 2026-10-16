package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aekc {
    public static final int[] a = new int[0];
    public static final int[] b = new int[0];

    public static void a(int[] iArr, int i, int i2) {
        defpackage.aefc.b(iArr.length, i, i2);
    }

    public static void b(int[] iArr, int i, int i2, defpackage.aekj aekjVar, int[] iArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (iArr2 == null) {
                iArr2 = java.util.Arrays.copyOf(iArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            b(iArr2, i, i4, aekjVar, iArr);
            b(iArr2, i4, i2, aekjVar, iArr);
            if (aekjVar.a(iArr2[i4 - 1], iArr2[i4]) <= 0) {
                java.lang.System.arraycopy(iArr2, i, iArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && aekjVar.a(iArr2[i5], iArr2[i6]) <= 0)) {
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
            while (aekjVar.a(i9, i10) < 0) {
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
                int iCompare = java.lang.Integer.compare(iArr[i12], i11);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        d(iArr, i13, i12);
                        i13++;
                    }
                    i12++;
                }
            }
            while (i4 >= i12) {
                int iCompare2 = java.lang.Integer.compare(iArr[i4], i11);
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
        int iMin = java.lang.Math.min(i15, i16);
        e(iArr, i, i12 - iMin, iMin);
        int i17 = i14 - i4;
        int iMin2 = java.lang.Math.min(i17, (i2 - i14) - 1);
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

    /* JADX WARN: Code duplicated, block: B:10:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    private static int g(int[] iArr, int i, int i2, int i3) {
        int iCompare = java.lang.Integer.compare(iArr[i], iArr[i2]);
        int iCompare2 = java.lang.Integer.compare(iArr[i], iArr[i3]);
        int iCompare3 = java.lang.Integer.compare(iArr[i2], iArr[i3]);
        if (iCompare < 0) {
            if (iCompare3 >= 0) {
                if (iCompare2 >= 0) {
                    return i;
                }
                return i3;
            }
            return i2;
        }
        if (iCompare3 <= 0) {
            if (iCompare2 <= 0) {
                return i;
            }
            return i3;
        }
        return i2;
    }
}
