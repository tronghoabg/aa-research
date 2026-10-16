package b.a.a;

import com.fasterxml.jackson.core.JsonFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class b extends c {
    private static int r(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3 && charSequence.charAt(i2) <= ' ') {
            i2++;
        }
        return i2;
    }

    abstract long a();

    abstract long b();

    abstract long c();

    public final long d(CharSequence charSequence, int i2) {
        int i3;
        boolean z;
        int i4;
        char cG;
        long j2;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        b bVar;
        int i9;
        boolean z5;
        char cG2;
        boolean z6;
        int iMin;
        int i10;
        int i11;
        int i12;
        boolean z7;
        char cG3;
        boolean z8;
        int i13;
        int i14 = i(charSequence.length(), 0, i2);
        int iR = r(charSequence, 0, i14);
        if (iR == i14) {
            return 9221120237041090561L;
        }
        char cCharAt = charSequence.charAt(iR);
        if (cCharAt == '-') {
            i3 = iR;
            z = true;
        } else {
            i3 = iR;
            z = false;
        }
        if (z || cCharAt == '+') {
            i4 = i3 + 1;
            cG = g(charSequence, i4, i14);
            if (cG == 0) {
                return 9221120237041090561L;
            }
        } else {
            int i15 = i3;
            cG = cCharAt;
            i4 = i15;
        }
        char c2 = '0';
        int i16 = -1;
        long j3 = 0;
        if (cG == '0') {
            j2 = 9221120237041090561L;
            if ((g(charSequence, i4 + 1, i14) | ' ') == 120) {
                int i17 = i4 + 2;
                int i18 = i17;
                long j4 = 0;
                char cCharAt2 = 0;
                boolean z9 = false;
                while (true) {
                    if (i18 >= i14) {
                        z6 = z;
                        break;
                    }
                    cCharAt2 = charSequence.charAt(i18);
                    char c3 = c2;
                    int iJ = j(cCharAt2);
                    if (iJ < 0) {
                        z6 = z;
                        if (iJ != -4) {
                            break;
                        }
                        boolean z10 = z9 | (i16 >= 0);
                        int i19 = i18;
                        while (true) {
                            if (i19 >= i14 - 8) {
                                z8 = z10;
                                i13 = i19;
                                break;
                            }
                            long jCharAt = charSequence.charAt(i19 + 1);
                            z8 = z10;
                            long jCharAt2 = charSequence.charAt(i19 + 2);
                            i13 = i19;
                            long j5 = (jCharAt << c3) | (jCharAt2 << 32);
                            long jK = s.k(charSequence.charAt(i19 + 4) | j5 | (charSequence.charAt(i19 + 3) << 16), charSequence.charAt(i13 + 8) | (charSequence.charAt(i19 + 5) << c3) | (charSequence.charAt(i19 + 6) << 32) | (charSequence.charAt(i13 + 7) << 16));
                            if (jK < 0) {
                                break;
                            }
                            j4 = (j4 << 32) + jK;
                            i19 = i13 + 8;
                            z10 = z8;
                        }
                        i16 = i18;
                        i18 = i13;
                        z9 = z8;
                    } else {
                        z6 = z;
                        j4 = (j4 << 4) | iJ;
                    }
                    i18++;
                    c2 = c3;
                    z = z6;
                }
                int i20 = i18 - i17;
                if (i16 < 0) {
                    i16 = i18;
                    iMin = 0;
                } else {
                    iMin = Math.min((i16 - i18) + 1, 1024) * 4;
                    i20--;
                }
                boolean z11 = (cCharAt2 | ' ') == 112;
                if (z11) {
                    int i21 = i18 + 1;
                    char cG4 = g(charSequence, i21, i14);
                    boolean z12 = cG4 == '-';
                    if (z12 || cG4 == '+') {
                        i21 = i18 + 2;
                        cG4 = g(charSequence, i21, i14);
                    }
                    char c4 = (char) (cG4 - '0');
                    boolean z13 = (c4 >= '\n') | z9;
                    int i22 = 0;
                    while (true) {
                        if (i22 < 1024) {
                            i22 = (i22 * 10) + c4;
                        }
                        i21++;
                        cG3 = g(charSequence, i21, i14);
                        char c5 = (char) (cG3 - '0');
                        if (c5 >= '\n') {
                            break;
                        }
                        c4 = c5;
                    }
                    if (z12) {
                        i22 = -i22;
                    }
                    iMin += i22;
                    i10 = i21;
                    cCharAt2 = cG3;
                    i11 = i22;
                    z9 = z13;
                } else {
                    i10 = i18;
                    i11 = 0;
                }
                if ((cCharAt2 | JsonFactory.DEFAULT_QUOTE_CHAR) == 102) {
                    i10++;
                }
                int iR2 = r(charSequence, i10, i14);
                if (z9 || iR2 < i14 || i20 == 0 || !z11) {
                    return 9221120237041090561L;
                }
                if (i20 > 16) {
                    i12 = 0;
                    while (i17 < i18) {
                        int iJ2 = j(charSequence.charAt(i17));
                        if (iJ2 < 0) {
                            i12++;
                        } else {
                            if (Long.compare(j3 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                break;
                            }
                            j3 = (j3 << 4) | iJ2;
                        }
                        i17++;
                    }
                    iR2 = i17;
                    j4 = j3;
                    z7 = i17 < i18;
                } else {
                    i12 = 0;
                    z7 = false;
                }
                return f(charSequence, i14, z6, j4, iMin, z7, (((i16 - iR2) + i12) * 4) + i11);
            }
        } else {
            j2 = 9221120237041090561L;
        }
        int i23 = i4;
        long j6 = 0;
        boolean z14 = false;
        char cCharAt3 = 0;
        while (i23 < i14) {
            cCharAt3 = charSequence.charAt(i23);
            char c6 = (char) (cCharAt3 - '0');
            if (c6 >= '\n') {
                if (cCharAt3 != '.') {
                    break;
                }
                z14 |= i16 >= 0;
                i16 = i23 - i4;
            } else {
                j6 = (j6 * 10) + c6;
            }
            i23++;
        }
        int i24 = i23 - i4;
        if (i16 < 0) {
            i16 = i24;
            i5 = 0;
        } else {
            i24--;
            i5 = i16 - i24;
        }
        if (i24 != 0) {
            z2 = false;
        } else if (i23 > i4) {
            z2 = true;
            i24 = 0;
        } else {
            i24 = 0;
            z2 = false;
        }
        boolean z15 = z14 | z2;
        if ((cCharAt3 | ' ') == 101) {
            int i25 = i23 + 1;
            char cG5 = g(charSequence, i25, i14);
            boolean z16 = cG5 == '-';
            if (z16 || cG5 == '+') {
                i25 = i23 + 2;
                cG5 = g(charSequence, i25, i14);
            }
            char c7 = (char) (cG5 - '0');
            boolean z17 = (c7 >= '\n') | z15;
            int i26 = 0;
            while (true) {
                if (i26 < 1024) {
                    i26 = (i26 * 10) + c7;
                }
                i25++;
                cG2 = g(charSequence, i25, i14);
                char c8 = (char) (cG2 - '0');
                z3 = z;
                if (c8 >= '\n') {
                    break;
                }
                c7 = c8;
                z = z3;
            }
            if (z16) {
                i26 = -i26;
            }
            i5 += i26;
            i6 = i25;
            cCharAt3 = cG2;
            i7 = i26;
            z15 = z17;
        } else {
            z3 = z;
            i6 = i23;
            i7 = 0;
        }
        if (!z15 && i24 == 0) {
            if (i6 < i14) {
                if (charSequence.charAt(i6) == 'N') {
                    int i27 = i6 + 2;
                    return (i27 < i14 && charSequence.charAt(i6 + 1) == 'a' && charSequence.charAt(i27) == 'N' && r(charSequence, i6 + 3, i14) == i14) ? a() : j2;
                }
                int i28 = i6 + 7;
                if (i28 < i14 && charSequence.charAt(i6) == 'I' && charSequence.charAt(i6 + 1) == 'n' && charSequence.charAt(i6 + 2) == 'f' && charSequence.charAt(i6 + 3) == 'i' && charSequence.charAt(i6 + 4) == 'n' && charSequence.charAt(i6 + 5) == 'i' && charSequence.charAt(i6 + 6) == 't' && charSequence.charAt(i28) == 'y' && r(charSequence, i6 + 8, i14) == i14) {
                    return z3 ? b() : c();
                }
            }
            return j2;
        }
        if ((cCharAt3 | JsonFactory.DEFAULT_QUOTE_CHAR) == 102) {
            i6++;
        }
        int iR3 = r(charSequence, i6, i14);
        if (z15 || iR3 < i14) {
            return j2;
        }
        if (i24 > 19) {
            int i29 = 0;
            long j7 = 0;
            while (i4 < i23) {
                char cCharAt4 = (char) (charSequence.charAt(i4) - '0');
                if (cCharAt4 < '\n') {
                    if (Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j7 = (j7 * 10) + cCharAt4;
                    i29++;
                }
                i4++;
            }
            i8 = (i16 - i29) + i7;
            j6 = j7;
            z4 = i4 < i23;
            i9 = i5;
            z5 = z3;
            bVar = this;
        } else {
            z4 = false;
            i8 = 0;
            bVar = this;
            i9 = i5;
            z5 = z3;
        }
        return bVar.e(charSequence, i14, z5, j6, i9, z4, i8);
    }

    abstract long e(CharSequence charSequence, int i2, boolean z, long j2, int i3, boolean z2, int i4);

    abstract long f(CharSequence charSequence, int i2, boolean z, long j2, int i3, boolean z2, int i4);
}
