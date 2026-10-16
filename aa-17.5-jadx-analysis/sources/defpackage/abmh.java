package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
final class abmh {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(s(bArr, i));
    }

    static int b(byte[] bArr, int i, abmg abmgVar) throws abon {
        int iE = e(bArr, i, bArr.length, abmgVar);
        int i2 = abmgVar.a;
        if (i2 == 0) {
            abmgVar.c = abms.d;
            return iE;
        }
        abmgVar.c = abms.w(bArr, iE, i2);
        return iE + i2;
    }

    static int c(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int d(abpl abplVar, byte[] bArr, int i, int i2, int i3, abmg abmgVar) throws IOException {
        Object objE = abplVar.e();
        int iP = p(objE, abplVar, bArr, i, i2, i3, abmgVar);
        abplVar.g(objE);
        abmgVar.c = objE;
        return iP;
    }

    static int e(byte[] bArr, int i, int i2, abmg abmgVar) throws abon {
        int iL = l(bArr, i, abmgVar);
        int i3 = abmgVar.a;
        if (i3 < 0) {
            throw new abon("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 <= i2 - iL) {
            return iL;
        }
        throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int f(abpl abplVar, byte[] bArr, int i, int i2, abmg abmgVar) throws IOException {
        Object objE = abplVar.e();
        int iQ = q(objE, abplVar, bArr, i, i2, abmgVar);
        abplVar.g(objE);
        abmgVar.c = objE;
        return iQ;
    }

    static int g(abpl abplVar, int i, byte[] bArr, int i2, int i3, aboh abohVar, abmg abmgVar) throws IOException {
        int iF = f(abplVar, bArr, i2, i3, abmgVar);
        abohVar.add(abmgVar.c);
        while (iF < i3) {
            int iL = l(bArr, iF, abmgVar);
            if (i != abmgVar.a) {
                break;
            }
            iF = f(abplVar, bArr, iL, i3, abmgVar);
            abohVar.add(abmgVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, aboh abohVar, abmg abmgVar) throws IOException {
        abnw abnwVar = (abnw) abohVar;
        int iE = e(bArr, i, bArr.length, abmgVar);
        int i2 = abmgVar.a + iE;
        while (iE < i2) {
            iE = l(bArr, iE, abmgVar);
            abnwVar.g(abmgVar.a);
        }
        if (iE == i2) {
            return iE;
        }
        throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, abmg abmgVar) throws abon {
        int iE = e(bArr, i, bArr.length, abmgVar);
        int i2 = abmgVar.a;
        if (i2 == 0) {
            abmgVar.c = "";
            return iE;
        }
        abmgVar.c = new String(bArr, iE, i2, StandardCharsets.UTF_8);
        return iE + i2;
    }

    static int j(byte[] bArr, int i, abmg abmgVar) throws abon {
        int iE = e(bArr, i, bArr.length, abmgVar);
        int i2 = abmgVar.a;
        String strDS = "";
        if (i2 == 0) {
            abmgVar.c = "";
            return iE;
        }
        if (i2 == 0) {
            i2 = 0;
        } else {
            strDS = woy.dS(bArr, iE, i2);
        }
        abmgVar.c = strDS;
        return iE + i2;
    }

    static int k(int i, byte[] bArr, int i2, int i3, abpw abpwVar, abmg abmgVar) throws abon {
        if ((i >>> 3) == 0) {
            throw new abon("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iO = o(bArr, i2, abmgVar);
            abpwVar.e(i, Long.valueOf(abmgVar.b));
            return iO;
        }
        if (i4 == 1) {
            abpwVar.e(i, Long.valueOf(s(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iE = e(bArr, i2, bArr.length, abmgVar);
            int i5 = abmgVar.a;
            if (i5 == 0) {
                abpwVar.e(i, abms.d);
            } else {
                abms abmsVar = abms.d;
                try {
                    abpwVar.e(i, abms.E(bArr, iE, i5));
                } catch (abon e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
            return iE + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new abon("Protocol message contained an invalid tag (zero).");
            }
            abpwVar.e(i, Integer.valueOf(c(bArr, i2)));
            return i2 + 4;
        }
        abpw abpwVar2 = new abpw();
        int i6 = (i & (-8)) | 4;
        int i7 = abmgVar.e + 1;
        abmgVar.e = i7;
        if (i7 >= b) {
            throw new abon("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iL = l(bArr, i2, abmgVar);
            int i9 = abmgVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iL;
                break;
            }
            i2 = k(i9, bArr, iL, i3, abpwVar2, abmgVar);
            i8 = i9;
        }
        abmgVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new abon("Failed to parse the message.");
        }
        abpwVar.e(i, abpwVar2);
        return i2;
    }

    static int l(byte[] bArr, int i, abmg abmgVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m(b2, bArr, i2, abmgVar);
        }
        abmgVar.a = b2;
        return i2;
    }

    static int m(int i, byte[] bArr, int i2, abmg abmgVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            abmgVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            abmgVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            abmgVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            abmgVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                abmgVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int n(int i, byte[] bArr, int i2, int i3, aboh abohVar, abmg abmgVar) {
        abnw abnwVar = (abnw) abohVar;
        int iL = l(bArr, i2, abmgVar);
        abnwVar.g(abmgVar.a);
        while (iL < i3) {
            int iL2 = l(bArr, iL, abmgVar);
            if (i != abmgVar.a) {
                break;
            }
            iL = l(bArr, iL2, abmgVar);
            abnwVar.g(abmgVar.a);
        }
        return iL;
    }

    static int o(byte[] bArr, int i, abmg abmgVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            abmgVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & 127) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        abmgVar.b = j2;
        return i3;
    }

    static int p(Object obj, abpl abplVar, byte[] bArr, int i, int i2, int i3, abmg abmgVar) throws IOException {
        int i4 = abmgVar.e + 1;
        abmgVar.e = i4;
        t(i4);
        int iC = ((aboz) abplVar).c(obj, bArr, i, i2, i3, abmgVar);
        abmgVar.e--;
        abmgVar.c = obj;
        return iC;
    }

    static int q(Object obj, abpl abplVar, byte[] bArr, int i, int i2, abmg abmgVar) throws IOException {
        int iE = e(bArr, i, i2, abmgVar);
        int i3 = abmgVar.a;
        int i4 = abmgVar.e + 1;
        abmgVar.e = i4;
        if (i4 >= b) {
            throw new abon("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i5 = i3 + iE;
        abplVar.j(obj, bArr, iE, i5, abmgVar);
        abmgVar.e--;
        abmgVar.c = obj;
        return i5;
    }

    static int r(int i, byte[] bArr, int i2, int i3, abmg abmgVar) throws abon {
        if ((i >>> 3) == 0) {
            throw new abon("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return o(bArr, i2, abmgVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return e(bArr, i2, bArr.length, abmgVar) + abmgVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new abon("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = abmgVar.e + 1;
        abmgVar.e = i6;
        t(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = l(bArr, i2, abmgVar);
            i7 = abmgVar.a;
            if (i7 == i5) {
                break;
            }
            i2 = r(i7, bArr, i2, i3, abmgVar);
        }
        abmgVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new abon("Failed to parse the message.");
        }
        return i2;
    }

    static long s(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void t(int i) throws abon {
        if (i >= b) {
            throw new abon("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
