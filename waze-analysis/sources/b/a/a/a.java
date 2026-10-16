package b.a.a;

import com.fasterxml.jackson.core.JsonFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class a extends c {
    private static int r(char[] cArr, int i2, int i3) {
        while (i2 < i3 && cArr[i2] <= ' ') {
            i2++;
        }
        return i2;
    }

    abstract long a();

    abstract long b();

    public final long c(char[] cArr, int i2, int i3) {
        long j2;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        long j3;
        int i6;
        int i7;
        long j4;
        boolean z3;
        int i8;
        char cH;
        char c2;
        int iMin;
        int i9;
        int i10;
        int i11;
        long j5;
        boolean z4;
        int i12;
        char cH2;
        char c3;
        boolean z5;
        int i13;
        char c4;
        int i14 = i(cArr.length, i2, i3);
        int iR = r(cArr, i2, i14);
        if (iR == i14) {
            return 9221120237041090561L;
        }
        char cH3 = cArr[iR];
        if (cH3 == '-') {
            j2 = 9221120237041090561L;
            z = true;
        } else {
            j2 = 9221120237041090561L;
            z = false;
        }
        if ((z || cH3 == '+') && (cH3 = h(cArr, (iR = iR + 1), i14)) == 0) {
            return j2;
        }
        char c5 = '0';
        int i15 = -1;
        long j6 = 0;
        if (cH3 == '0' && (h(cArr, iR + 1, i14) | ' ') == 120) {
            int i16 = iR + 2;
            int i17 = i16;
            long j7 = j2;
            long j8 = 0;
            char c6 = 0;
            boolean z6 = false;
            while (true) {
                if (i17 >= i14) {
                    c2 = 4;
                    break;
                }
                c6 = cArr[i17];
                c2 = 4;
                int iJ = j(c6);
                if (iJ < 0) {
                    c3 = c5;
                    if (iJ != -4) {
                        break;
                    }
                    z6 |= i15 >= 0;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i14 - 8) {
                            z5 = z;
                            i13 = i17;
                            c4 = c6;
                            break;
                        }
                        c4 = c6;
                        i13 = i17;
                        z5 = z;
                        long jK = s.k(cArr[i18 + 4] | (cArr[i18 + 1] << c3) | (cArr[i18 + 2] << 32) | (cArr[i18 + 3] << 16), cArr[i18 + 8] | (cArr[i18 + 5] << c3) | (cArr[i18 + 6] << 32) | (cArr[i18 + 7] << 16));
                        if (jK < 0) {
                            break;
                        }
                        i18 += 8;
                        j8 = (j8 << 32) + jK;
                        c6 = c4;
                        i17 = i13;
                        z = z5;
                    }
                    i17 = i18;
                    i15 = i13;
                } else {
                    z5 = z;
                    c4 = c6;
                    j8 = (j8 << 4) | iJ;
                    c3 = c5;
                }
                i17++;
                c5 = c3;
                c6 = c4;
                z = z5;
            }
            boolean z7 = z;
            int i19 = i17;
            int i20 = i19 - i16;
            if (i15 < 0) {
                i15 = i19;
                iMin = 0;
            } else {
                iMin = Math.min((i15 - i19) + 1, 1024) * 4;
                i20--;
            }
            boolean z8 = (c6 | ' ') == 112;
            if (z8) {
                int i21 = i19 + 1;
                char cH4 = h(cArr, i21, i14);
                boolean z9 = cH4 == '-';
                if (z9 || cH4 == '+') {
                    i21 = i19 + 2;
                    cH4 = h(cArr, i21, i14);
                }
                char c7 = (char) (cH4 - '0');
                boolean z10 = z6 | (c7 >= '\n');
                int i22 = 0;
                while (true) {
                    if (i22 < 1024) {
                        i22 = (i22 * 10) + c7;
                    }
                    i21++;
                    cH2 = h(cArr, i21, i14);
                    char c8 = (char) (cH2 - '0');
                    if (c8 >= '\n') {
                        break;
                    }
                    c7 = c8;
                }
                if (z9) {
                    i22 = -i22;
                }
                i9 = iMin + i22;
                i10 = i21;
                int i23 = i22;
                c6 = cH2;
                i11 = i23;
                z6 = z10;
            } else {
                i9 = iMin;
                i10 = i19;
                i11 = 0;
            }
            if ((c6 | JsonFactory.DEFAULT_QUOTE_CHAR) == 102) {
                i10++;
            }
            int iR2 = r(cArr, i10, i14);
            if (z6 || iR2 < i14 || i20 == 0 || !z8) {
                return j7;
            }
            if (i20 > 16) {
                int i24 = 0;
                while (i16 < i19) {
                    int iJ2 = j(cArr[i16]);
                    if (iJ2 < 0) {
                        i24++;
                    } else {
                        if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                            break;
                        }
                        j6 = (j6 << c2) | iJ2;
                    }
                    i16++;
                }
                j5 = j6;
                z4 = i16 < i19;
                i12 = i24;
                iR2 = i16;
            } else {
                j5 = j8;
                z4 = false;
                i12 = 0;
            }
            return f(cArr, i2, i14, z7, j5, i9, z4, (((i15 - iR2) + i12) * 4) + i11);
        }
        long j9 = j2;
        int iMin2 = Math.min(i14 - 4, 1073741824);
        int i25 = iR;
        long j10 = 0;
        char c9 = 0;
        boolean z11 = false;
        while (i25 < i14) {
            c9 = cArr[i25];
            char c10 = (char) (c9 - '0');
            if (c10 >= '\n') {
                if (c9 != '.') {
                    break;
                }
                z11 |= i15 >= 0;
                int i26 = i25 - iR;
                while (i25 < iMin2) {
                    int iH = s.h(cArr, i25 + 1);
                    if (iH < 0) {
                        break;
                    }
                    i25 += 4;
                    j10 = (j10 * 10000) + iH;
                }
                i15 = i26;
            } else {
                j10 = (j10 * 10) + c10;
            }
            i25++;
        }
        int i27 = i25 - iR;
        if (i15 < 0) {
            i15 = i27;
            i4 = 0;
        } else {
            i27--;
            i4 = i15 - i27;
        }
        if (i27 != 0) {
            z2 = false;
        } else if (i25 > iR) {
            z2 = true;
            i27 = 0;
        } else {
            i27 = 0;
            z2 = false;
        }
        boolean z12 = z11 | z2;
        if ((c9 | ' ') == 101) {
            int i28 = i25 + 1;
            char cH5 = h(cArr, i28, i14);
            boolean z13 = cH5 == '-';
            j3 = 10;
            if (z13 || cH5 == '+') {
                i28 = i25 + 2;
                cH5 = h(cArr, i28, i14);
            }
            char c11 = (char) (cH5 - '0');
            boolean z14 = (c11 >= '\n') | z12;
            int i29 = 0;
            while (true) {
                if (i29 < 1024) {
                    i29 = (i29 * 10) + c11;
                }
                i28++;
                cH = h(cArr, i28, i14);
                char c12 = (char) (cH - '0');
                i5 = iR;
                if (c12 >= '\n') {
                    break;
                }
                c11 = c12;
                iR = i5;
            }
            if (z13) {
                i29 = -i29;
            }
            i4 += i29;
            i6 = i28;
            c9 = cH;
            i7 = i29;
            z12 = z14;
        } else {
            i5 = iR;
            j3 = 10;
            i6 = i25;
            i7 = 0;
        }
        if (!z12 && i27 == 0) {
            if (i6 < i14) {
                char c13 = cArr[i6];
                if (c13 == 'N') {
                    int i30 = i6 + 2;
                    return (i30 < i14 && cArr[i6 + 1] == 'a' && cArr[i30] == 'N' && r(cArr, i6 + 3, i14) == i14) ? a() : j9;
                }
                int i31 = i6 + 7;
                if (i31 < i14 && c13 == 'I' && cArr[i6 + 1] == 'n' && cArr[i6 + 2] == 'f' && cArr[i6 + 3] == 'i' && cArr[i6 + 4] == 'n' && cArr[i6 + 5] == 'i' && cArr[i6 + 6] == 't' && cArr[i31] == 'y' && r(cArr, i6 + 8, i14) == i14) {
                    return z ? b() : d();
                }
            }
            return j9;
        }
        if ((c9 | JsonFactory.DEFAULT_QUOTE_CHAR) == 102) {
            i6++;
        }
        int iR3 = r(cArr, i6, i14);
        if (z12 || iR3 < i14) {
            return j9;
        }
        if (i27 > 19) {
            int i32 = i5;
            int i33 = 0;
            while (i32 < i25) {
                char c14 = (char) (cArr[i32] - '0');
                if (c14 < '\n') {
                    if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j6 = (j6 * j3) + c14;
                    i33++;
                }
                i32++;
            }
            z3 = i32 < i25;
            i8 = (i15 - i33) + i7;
            j4 = j6;
        } else {
            j4 = j10;
            z3 = false;
            i8 = 0;
        }
        return e(cArr, i2, i14, z, j4, i4, z3, i8);
    }

    abstract long d();

    abstract long e(char[] cArr, int i2, int i3, boolean z, long j2, int i4, boolean z2, int i5);

    abstract long f(char[] cArr, int i2, int i3, boolean z, long j2, int i4, boolean z2, int i5);
}
