package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abnk {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(s(bArr, i));
    }

    static int b(byte[] bArr, int i, defpackage.abnj abnjVar) throws defpackage.abpp {
        int iE = e(bArr, i, bArr.length, abnjVar);
        int i2 = abnjVar.a;
        if (i2 == 0) {
            abnjVar.c = defpackage.abnv.d;
            return iE;
        }
        abnjVar.c = defpackage.abnv.w(bArr, iE, i2);
        return iE + i2;
    }

    static int c(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int d(defpackage.abqn abqnVar, byte[] bArr, int i, int i2, int i3, defpackage.abnj abnjVar) throws java.io.IOException {
        java.lang.Object objE = abqnVar.e();
        int iP = p(objE, abqnVar, bArr, i, i2, i3, abnjVar);
        abqnVar.g(objE);
        abnjVar.c = objE;
        return iP;
    }

    static int e(byte[] bArr, int i, int i2, defpackage.abnj abnjVar) throws defpackage.abpp {
        int iL = l(bArr, i, abnjVar);
        int i3 = abnjVar.a;
        if (i3 < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 <= i2 - iL) {
            return iL;
        }
        throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int f(defpackage.abqn abqnVar, byte[] bArr, int i, int i2, defpackage.abnj abnjVar) throws java.io.IOException {
        java.lang.Object objE = abqnVar.e();
        int iQ = q(objE, abqnVar, bArr, i, i2, abnjVar);
        abqnVar.g(objE);
        abnjVar.c = objE;
        return iQ;
    }

    static int g(defpackage.abqn abqnVar, int i, byte[] bArr, int i2, int i3, defpackage.abpj abpjVar, defpackage.abnj abnjVar) throws java.io.IOException {
        int iF = f(abqnVar, bArr, i2, i3, abnjVar);
        abpjVar.add(abnjVar.c);
        while (iF < i3) {
            int iL = l(bArr, iF, abnjVar);
            if (i != abnjVar.a) {
                break;
            }
            iF = f(abqnVar, bArr, iL, i3, abnjVar);
            abpjVar.add(abnjVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, defpackage.abpj abpjVar, defpackage.abnj abnjVar) throws java.io.IOException {
        defpackage.aboy aboyVar = (defpackage.aboy) abpjVar;
        int iE = e(bArr, i, bArr.length, abnjVar);
        int i2 = abnjVar.a + iE;
        while (iE < i2) {
            iE = l(bArr, iE, abnjVar);
            aboyVar.g(abnjVar.a);
        }
        if (iE == i2) {
            return iE;
        }
        throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, defpackage.abnj abnjVar) throws defpackage.abpp {
        int iE = e(bArr, i, bArr.length, abnjVar);
        int i2 = abnjVar.a;
        if (i2 == 0) {
            abnjVar.c = "";
            return iE;
        }
        abnjVar.c = new java.lang.String(bArr, iE, i2, java.nio.charset.StandardCharsets.UTF_8);
        return iE + i2;
    }

    static int j(byte[] bArr, int i, defpackage.abnj abnjVar) throws defpackage.abpp {
        int iE = e(bArr, i, bArr.length, abnjVar);
        int i2 = abnjVar.a;
        java.lang.String strBN = "";
        if (i2 == 0) {
            abnjVar.c = "";
            return iE;
        }
        if (i2 == 0) {
            i2 = 0;
        } else {
            strBN = defpackage.ysr.bN(bArr, iE, i2);
        }
        abnjVar.c = strBN;
        return iE + i2;
    }

    static int k(int i, byte[] bArr, int i2, int i3, defpackage.abqy abqyVar, defpackage.abnj abnjVar) throws defpackage.abpp {
        if ((i >>> 3) == 0) {
            throw new defpackage.abpp("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iO = o(bArr, i2, abnjVar);
            abqyVar.e(i, java.lang.Long.valueOf(abnjVar.b));
            return iO;
        }
        if (i4 == 1) {
            abqyVar.e(i, java.lang.Long.valueOf(s(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iE = e(bArr, i2, bArr.length, abnjVar);
            int i5 = abnjVar.a;
            if (i5 == 0) {
                abqyVar.e(i, defpackage.abnv.d);
            } else {
                defpackage.abnv abnvVar = defpackage.abnv.d;
                try {
                    abqyVar.e(i, defpackage.abnv.E(bArr, iE, i5));
                } catch (defpackage.abpp e) {
                    throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
            return iE + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new defpackage.abpp("Protocol message contained an invalid tag (zero).");
            }
            abqyVar.e(i, java.lang.Integer.valueOf(c(bArr, i2)));
            return i2 + 4;
        }
        defpackage.abqy abqyVar2 = new defpackage.abqy();
        int i6 = (i & (-8)) | 4;
        int i7 = abnjVar.e + 1;
        abnjVar.e = i7;
        if (i7 >= b) {
            throw new defpackage.abpp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iL = l(bArr, i2, abnjVar);
            int i9 = abnjVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iL;
                break;
            }
            i2 = k(i9, bArr, iL, i3, abqyVar2, abnjVar);
            i8 = i9;
        }
        abnjVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new defpackage.abpp("Failed to parse the message.");
        }
        abqyVar.e(i, abqyVar2);
        return i2;
    }

    static int l(byte[] bArr, int i, defpackage.abnj abnjVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m(b2, bArr, i2, abnjVar);
        }
        abnjVar.a = b2;
        return i2;
    }

    static int m(int i, byte[] bArr, int i2, defpackage.abnj abnjVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            abnjVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            abnjVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            abnjVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            abnjVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                abnjVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int n(int i, byte[] bArr, int i2, int i3, defpackage.abpj abpjVar, defpackage.abnj abnjVar) {
        defpackage.aboy aboyVar = (defpackage.aboy) abpjVar;
        int iL = l(bArr, i2, abnjVar);
        aboyVar.g(abnjVar.a);
        while (iL < i3) {
            int iL2 = l(bArr, iL, abnjVar);
            if (i != abnjVar.a) {
                break;
            }
            iL = l(bArr, iL2, abnjVar);
            aboyVar.g(abnjVar.a);
        }
        return iL;
    }

    static int o(byte[] bArr, int i, defpackage.abnj abnjVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            abnjVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        abnjVar.b = j2;
        return i3;
    }

    static int p(java.lang.Object obj, defpackage.abqn abqnVar, byte[] bArr, int i, int i2, int i3, defpackage.abnj abnjVar) throws java.io.IOException {
        int i4 = abnjVar.e + 1;
        abnjVar.e = i4;
        t(i4);
        int iC = ((defpackage.abqb) abqnVar).c(obj, bArr, i, i2, i3, abnjVar);
        abnjVar.e--;
        abnjVar.c = obj;
        return iC;
    }

    static int q(java.lang.Object obj, defpackage.abqn abqnVar, byte[] bArr, int i, int i2, defpackage.abnj abnjVar) throws java.io.IOException {
        int iE = e(bArr, i, i2, abnjVar);
        int i3 = abnjVar.a;
        int i4 = abnjVar.e + 1;
        abnjVar.e = i4;
        if (i4 >= b) {
            throw new defpackage.abpp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i5 = i3 + iE;
        abqnVar.j(obj, bArr, iE, i5, abnjVar);
        abnjVar.e--;
        abnjVar.c = obj;
        return i5;
    }

    static int r(int i, byte[] bArr, int i2, int i3, defpackage.abnj abnjVar) throws defpackage.abpp {
        if ((i >>> 3) == 0) {
            throw new defpackage.abpp("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return o(bArr, i2, abnjVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return e(bArr, i2, bArr.length, abnjVar) + abnjVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new defpackage.abpp("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = abnjVar.e + 1;
        abnjVar.e = i6;
        t(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = l(bArr, i2, abnjVar);
            i7 = abnjVar.a;
            if (i7 == i5) {
                break;
            }
            i2 = r(i7, bArr, i2, i3, abnjVar);
        }
        abnjVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new defpackage.abpp("Failed to parse the message.");
        }
        return i2;
    }

    static long s(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void t(int i) throws defpackage.abpp {
        if (i >= b) {
            throw new defpackage.abpp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
