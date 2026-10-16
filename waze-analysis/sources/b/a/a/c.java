package b.a.a;

import androidx.collection.SieveCacheKt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f1686a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1687b = 0;

    static {
        byte[] bArr = new byte[256];
        f1686a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            f1686a[c2] = (byte) (c2 - '0');
        }
        for (char c3 = 'A'; c3 <= 'F'; c3 = (char) (c3 + 1)) {
            f1686a[c3] = (byte) (c3 - '7');
        }
        for (char c4 = 'a'; c4 <= 'f'; c4 = (char) (c4 + 1)) {
            f1686a[c4] = (byte) (c4 - 'W');
        }
        f1686a[46] = -4;
    }

    c(byte[] bArr) {
    }

    protected static char g(CharSequence charSequence, int i2, int i3) {
        if (i2 < i3) {
            return charSequence.charAt(i2);
        }
        return (char) 0;
    }

    protected static char h(char[] cArr, int i2, int i3) {
        if (i2 < i3) {
            return cArr[i2];
        }
        return (char) 0;
    }

    protected static int i(int i2, int i3, int i4) {
        if ((((i2 - i4) - i3) | i3 | i4) >= 0) {
            return i4 + i3;
        }
        throw new IllegalArgumentException("offset < 0 or length > str.length");
    }

    protected static int j(char c2) {
        if (c2 < 128) {
            return f1686a[c2];
        }
        return -1;
    }

    protected static void k(boolean z, int i2, int i3, int i4, long j2) {
        if (z || i2 < i3) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j2 <= SieveCacheKt.NodeMetaAndPreviousMask || j2 > SieveCacheKt.NodeLinkMask || i4 > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static boolean l(int i2) {
        return i2 >= 32;
    }

    static BigDecimal n(char[] cArr, int i2, int i3, int i4, int i5, boolean z, int i6) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerC;
        int i7 = i3 - i2;
        NavigableMap navigableMapE = null;
        if (i7 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i7 > 400) {
            navigableMapE = g.e();
            g.f(navigableMapE, i2, i3);
            bigIntegerNegate = s.d(cArr, i2, i3, navigableMapE);
        } else {
            bigIntegerNegate = s.c(cArr, i2, i3);
        }
        int i8 = (i5 - i3) - 1;
        if (i8 > 0) {
            if (i5 - i4 > 400) {
                if (navigableMapE == null) {
                    navigableMapE = g.e();
                }
                g.f(navigableMapE, i4, i5);
                bigIntegerC = s.d(cArr, i4, i5, navigableMapE);
            } else {
                bigIntegerC = s.c(cArr, i4, i5);
            }
            bigIntegerNegate = bigIntegerNegate.signum() != 0 ? j.d(bigIntegerNegate, g.c(navigableMapE, i8)).add(bigIntegerC) : bigIntegerC;
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i6);
    }

    static BigDecimal p(CharSequence charSequence, int i2, int i3, int i4, int i5, boolean z, int i6) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerA;
        int i7 = i3 - i2;
        NavigableMap navigableMapE = null;
        if (i7 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i7 > 400) {
            navigableMapE = g.e();
            g.f(navigableMapE, i2, i3);
            bigIntegerNegate = s.b(charSequence, i2, i3, navigableMapE);
        } else {
            bigIntegerNegate = s.a(charSequence, i2, i3);
        }
        int i8 = (i5 - i3) - 1;
        if (i8 > 0) {
            if (i5 - i4 > 400) {
                if (navigableMapE == null) {
                    navigableMapE = g.e();
                }
                g.f(navigableMapE, i4, i5);
                bigIntegerA = s.b(charSequence, i4, i5, navigableMapE);
            } else {
                bigIntegerA = s.a(charSequence, i4, i5);
            }
            bigIntegerNegate = bigIntegerNegate.signum() != 0 ? j.d(bigIntegerNegate, g.c(navigableMapE, i8)).add(bigIntegerA) : bigIntegerA;
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i6);
    }

    public final BigDecimal m(char[] cArr, int i2, int i3) {
        long j2;
        boolean z;
        int i4;
        int i5;
        long j3;
        int iH;
        long j4;
        boolean z2;
        long j5;
        int i6;
        int i7;
        long j6;
        long j7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        long j8;
        char[] cArr2 = cArr;
        int i11 = i2;
        try {
            int i12 = i(cArr2.length, i11, i3);
            char c2 = '.';
            int i13 = -1;
            if (!l(i3)) {
                char cH = h(cArr2, i11, i12);
                boolean z4 = cH == '-';
                if ((z4 || cH == '+') && (cH = h(cArr2, (i11 = i11 + 1), i12)) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
                int i14 = i11;
                boolean z5 = false;
                long j9 = 0;
                while (i14 < i12) {
                    cH = cArr2[i14];
                    char c3 = (char) (cH - '0');
                    if (c3 >= '\n') {
                        if (cH != '.') {
                            break;
                        }
                        z5 |= i13 >= 0;
                        int i15 = i14;
                        while (i15 < i12 - 4 && (iH = s.h(cArr2, i15 + 1)) >= 0) {
                            j9 = (j9 * 10000) + iH;
                            i15 += 4;
                        }
                        i13 = i14;
                        i14 = i15;
                    } else {
                        j9 = (j9 * 10) + c3;
                    }
                    i14++;
                }
                int i16 = i14 - i11;
                if (i13 < 0) {
                    i13 = i14;
                    j2 = 0;
                } else {
                    i16--;
                    j2 = (i13 - i14) + 1;
                }
                if ((cH | ' ') == 101) {
                    int i17 = i14 + 1;
                    char cH2 = h(cArr2, i17, i12);
                    boolean z6 = cH2 == '-';
                    if (z6 || cH2 == '+') {
                        i17 = i14 + 2;
                        cH2 = h(cArr2, i17, i12);
                    }
                    char cH3 = (char) (cH2 - '0');
                    boolean z7 = z5 | (cH3 >= '\n');
                    long j10 = 0;
                    while (true) {
                        if (j10 < SieveCacheKt.NodeLinkMask) {
                            j10 = (j10 * 10) + cH3;
                        }
                        j3 = j10;
                        i17++;
                        cH3 = (char) (h(cArr2, i17, i12) - '0');
                        if (cH3 >= '\n') {
                            break;
                        }
                        cArr2 = cArr;
                        j10 = j3;
                    }
                    if (z6) {
                        j3 = -j3;
                    }
                    j2 += j3;
                    i5 = i17;
                    z = z7;
                    i4 = i14;
                } else {
                    z = z5;
                    i4 = i12;
                    i5 = i14;
                }
                z = i16 == 0;
                int i18 = i16;
                long j11 = j2;
                k(z | z, i5, i12, i18, j11);
                if (i18 >= 19) {
                    return n(cArr, i11, i13, i13 + 1, i4, z4, (int) j11);
                }
                if (z4) {
                    j9 = -j9;
                }
                return new BigDecimal(j9).scaleByPowerOfTen((int) j11);
            }
            int i19 = i3 + i11;
            char cH4 = h(cArr2, i11, i19);
            if (cH4 == '-') {
                j4 = 2147483647L;
                z2 = true;
            } else {
                j4 = 2147483647L;
                z2 = false;
            }
            if ((z2 || cH4 == '+') && (cH4 = h(cArr2, (i11 = i11 + 1), i19)) == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            int iMin = Math.min(i19 - 8, 1073741824);
            int i20 = i11;
            while (i20 < iMin && s.p(cArr2, i20)) {
                i20 += 8;
            }
            while (true) {
                if (i20 >= i19) {
                    j5 = 10;
                    break;
                }
                j5 = 10;
                if (cArr2[i20] != '0') {
                    break;
                }
                i20++;
            }
            int i21 = i20;
            while (i21 < iMin && s.n(cArr2, i21)) {
                i21 += 8;
            }
            while (i21 < i19) {
                cH4 = cArr2[i21];
                if (!s.l(cH4)) {
                    break;
                }
                i21++;
            }
            if (cH4 == '.') {
                i7 = i21 + 1;
                while (i7 < iMin && s.p(cArr2, i7)) {
                    i7 += 8;
                }
                while (i7 < i19 && cArr2[i7] == '0') {
                    i7++;
                }
                i6 = i7;
                while (i6 < iMin && s.n(cArr2, i6)) {
                    i6 += 8;
                }
                while (i6 < i19) {
                    c2 = cArr2[i6];
                    if (!s.l(c2)) {
                        break;
                    }
                    i6++;
                }
            } else {
                c2 = cH4;
                i6 = i21;
                i7 = -1;
                i21 = -1;
            }
            if (i21 < 0) {
                i21 = i6;
                j7 = j5;
                j6 = 0;
                i8 = i6 - i20;
                i7 = i21;
            } else {
                j6 = (i21 - i6) + 1;
                j7 = j5;
                i8 = i20 == i21 ? i6 - i7 : (i6 - i20) - 1;
            }
            if ((c2 | ' ') == 101) {
                int i22 = i6 + 1;
                char cH5 = h(cArr2, i22, i19);
                boolean z8 = cH5 == '-';
                if (z8 || cH5 == '+') {
                    i22 = i6 + 2;
                    cH5 = h(cArr2, i22, i19);
                }
                char cH6 = (char) (cH5 - '0');
                z3 = cH6 >= '\n';
                long j12 = 0;
                while (true) {
                    if (j12 < j4) {
                        j12 = (j12 * j7) + cH6;
                    }
                    j8 = j12;
                    i22++;
                    cH6 = (char) (h(cArr2, i22, i19) - '0');
                    if (cH6 >= '\n') {
                        break;
                    }
                    cArr2 = cArr;
                    j12 = j8;
                }
                if (z8) {
                    j8 = -j8;
                }
                j6 += j8;
                i10 = i22;
                i9 = i6;
            } else {
                i9 = i19;
                i10 = i6;
                z3 = false;
            }
            long j13 = j6;
            if (i11 == i21 && i21 == i9) {
                z = true;
            }
            k(z3 | z, i10, i19, i8, j13);
            return n(cArr, i20, i21, i7, i9, z2, (int) j13);
        } catch (ArithmeticException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BigDecimal o(CharSequence charSequence, int i2) {
        char cCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        long j3;
        int i11;
        int i12;
        long j4;
        int i13;
        int i14;
        int i15;
        int i16;
        long j5;
        int i17;
        int i18;
        try {
            int i19 = i(charSequence.length(), 0, i2);
            char c2 = '.';
            long j6 = 0;
            int i20 = 1;
            if (!l(i2)) {
                char cG = g(charSequence, 0, i19);
                boolean z2 = cG == '-';
                if (z2 || cG == '+') {
                    cG = g(charSequence, 1, i19);
                    if (cG == 0) {
                        throw new NumberFormatException("illegal syntax");
                    }
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                int i21 = -1;
                int i22 = 0;
                long j7 = 0;
                int i23 = i11;
                while (true) {
                    if (i23 >= i19) {
                        i12 = i23;
                        break;
                    }
                    cG = charSequence.charAt(i23);
                    char c3 = (char) (cG - '0');
                    if (c3 >= '\n') {
                        i12 = i23;
                        if (cG != c2) {
                            break;
                        }
                        i22 |= i21 >= 0 ? 1 : 0;
                        int i24 = i12;
                        while (i24 < i19 - 4 && (i18 = s.i(charSequence.charAt(i24 + 1) | (charSequence.charAt(i24 + 2) << 16) | (charSequence.charAt(i24 + 3) << 32) | (charSequence.charAt(i24 + 4) << 48))) >= 0) {
                            j7 = (j7 * 10000) + i18;
                            i24 += 4;
                        }
                        i17 = i24;
                        i21 = i12;
                    } else {
                        j7 = (j7 * 10) + c3;
                        i17 = i23;
                    }
                    i23 = i17 + 1;
                    c2 = '.';
                }
                int i25 = i12 - i11;
                if (i21 < 0) {
                    i14 = i25;
                    j4 = 0;
                    i13 = i12;
                } else {
                    int i26 = i25 - 1;
                    j4 = (i21 - i12) + 1;
                    i13 = i21;
                    i14 = i26;
                }
                if ((cG | ' ') == 101) {
                    i15 = i12 + 1;
                    char cG2 = g(charSequence, i15, i19);
                    boolean z3 = cG2 == '-';
                    if (z3 || cG2 == '+') {
                        i15 = i12 + 2;
                        cG2 = g(charSequence, i15, i19);
                    }
                    char cG3 = (char) (cG2 - '0');
                    i22 |= cG3 >= '\n' ? 1 : 0;
                    while (true) {
                        if (j6 < SieveCacheKt.NodeLinkMask) {
                            j6 = (j6 * 10) + cG3;
                        }
                        j5 = j6;
                        i15++;
                        cG3 = (char) (g(charSequence, i15, i19) - '0');
                        if (cG3 >= '\n') {
                            break;
                        }
                        j6 = j5;
                    }
                    if (z3) {
                        j5 = -j5;
                    }
                    j4 += j5;
                    i16 = i12;
                } else {
                    i15 = i12;
                    i16 = i19;
                }
                if (i14 != 0) {
                    i20 = 0;
                }
                int i27 = i14;
                long j8 = j4;
                k(i22 | i20, i15, i19, i27, j8);
                if (i27 >= 19) {
                    return p(charSequence, i11, i13, i13 + 1, i16, z2, (int) j8);
                }
                if (z2) {
                    j7 = -j7;
                }
                return new BigDecimal(j7).scaleByPowerOfTen((int) j8);
            }
            char cG4 = g(charSequence, 0, i2);
            boolean z4 = cG4 == '-';
            if (z4 || cG4 == '+') {
                char cG5 = g(charSequence, 1, i2);
                if (cG5 == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
                cCharAt = cG5;
                i3 = 1;
            } else {
                cCharAt = cG4;
                i3 = 0;
            }
            int iMin = Math.min(i2 - 8, 1073741824);
            int i28 = i3;
            while (i28 < iMin && s.o(charSequence, i28)) {
                i28 += 8;
            }
            int i29 = i28;
            for (char c4 = '0'; i29 < i2 && charSequence.charAt(i29) == c4; c4 = '0') {
                i29++;
            }
            int i30 = i29;
            while (i30 < iMin && s.m(charSequence, i30)) {
                i30 += 8;
            }
            while (i30 < i2) {
                cCharAt = charSequence.charAt(i30);
                if (!s.l(cCharAt)) {
                    break;
                }
                i30++;
            }
            char cCharAt2 = '.';
            if (cCharAt == '.') {
                i5 = i30 + 1;
                while (i5 < iMin && s.o(charSequence, i5)) {
                    i5 += 8;
                }
                while (i5 < i2 && charSequence.charAt(i5) == '0') {
                    i5++;
                }
                i4 = i5;
                while (i4 < iMin && s.m(charSequence, i4)) {
                    i4 += 8;
                }
                while (i4 < i2) {
                    cCharAt2 = charSequence.charAt(i4);
                    if (!s.l(cCharAt2)) {
                        break;
                    }
                    i4++;
                }
            } else {
                cCharAt2 = cCharAt;
                i4 = i30;
                i5 = -1;
                i30 = -1;
            }
            if (i30 < 0) {
                i6 = i4 - i29;
                i7 = i4;
                i8 = i7;
                j2 = 0;
            } else {
                i6 = i29 == i30 ? i4 - i5 : (i4 - i29) - 1;
                j2 = (i30 - i4) + 1;
                i7 = i5;
                i8 = i30;
            }
            if ((cCharAt2 | ' ') == 101) {
                i10 = i4 + 1;
                char cG6 = g(charSequence, i10, i2);
                boolean z5 = cG6 == '-';
                if (z5 || cG6 == '+') {
                    i10 = i4 + 2;
                    cG6 = g(charSequence, i10, i2);
                }
                char cG7 = (char) (cG6 - '0');
                z = cG7 >= '\n';
                while (true) {
                    if (j6 < SieveCacheKt.NodeLinkMask) {
                        i9 = i7;
                        j6 = (j6 * 10) + cG7;
                    } else {
                        i9 = i7;
                    }
                    j3 = j6;
                    i10 += i20;
                    cG7 = (char) (g(charSequence, i10, i2) - '0');
                    if (cG7 >= '\n') {
                        break;
                    }
                    j6 = j3;
                    i20 = 1;
                    i7 = i9;
                }
                if (z5) {
                    j3 = -j3;
                }
                j2 += j3;
            } else {
                i9 = i7;
                i10 = i4;
                z = false;
                i4 = i2;
            }
            long j9 = j2;
            k(z | (i3 == i8 && i8 == i4), i10, i2, i6, j9);
            return p(charSequence, i29, i8, i9, i4, z4, (int) j9);
        } catch (ArithmeticException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    public final BigInteger q(CharSequence charSequence, int i2) {
        int i3;
        try {
            int i4 = i(charSequence.length(), 0, i2);
            char cCharAt = charSequence.charAt(0);
            boolean z = cCharAt == '-';
            if (z || cCharAt == '+') {
                if (g(charSequence, 1, i4) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i5 = i4 - i3;
            if (i5 <= 18) {
                int i6 = (i5 & 7) + i3;
                long j2 = s.j(charSequence, i3, i6);
                boolean z2 = j2 >= 0;
                while (i6 < i4) {
                    int iF = s.f(charSequence, i6);
                    z2 &= iF >= 0;
                    i6 += 8;
                    j2 = (j2 * 100000000) + iF;
                }
                if (!z2) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (z) {
                    j2 = -j2;
                }
                return BigInteger.valueOf(j2);
            }
            while (i3 < i4 && charSequence.charAt(i3) == '0') {
                i3++;
            }
            if (i4 - i3 > 646456993) {
                throw new NumberFormatException("value exceeds limits");
            }
            BigInteger bigInteger = g.f1694a;
            TreeMap treeMap = new TreeMap();
            treeMap.put(0, BigInteger.valueOf(5L));
            treeMap.put(16, g.f1696c);
            g.f(treeMap, i3, i4);
            for (Map.Entry entry : treeMap.entrySet()) {
                entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
            }
            BigInteger bigIntegerB = s.b(charSequence, i3, i4, treeMap);
            return z ? bigIntegerB.negate() : bigIntegerB;
        } catch (ArithmeticException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }
}
