package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zbsr {
    public static final /* synthetic */ int zba = 0;
    private static volatile int zbb = 100;

    public static int zba(byte[] bArr, int i5, zbsq zbsqVar) throws zbuq {
        int iZbk = zbk(bArr, i5, zbsqVar);
        int i10 = zbsqVar.zba;
        if (i10 < 0) {
            throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iZbk) {
            throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zbsqVar.zbc = zbtc.zbb;
            return iZbk;
        }
        zbsqVar.zbc = zbtc.zbj(bArr, iZbk, i10);
        return iZbk + i10;
    }

    public static int zbb(int i5, byte[] bArr, int i10, int i11, zbub zbubVar, zbud zbudVar, zbwl zbwlVar, zbsq zbsqVar) throws IOException {
        zbtu zbtuVar = zbubVar.zbb;
        zbww zbwwVar = zbudVar.zbb.zbb;
        Object objValueOf = null;
        if (zbwwVar == zbww.zbn) {
            zbk(bArr, i10, zbsqVar);
            throw null;
        }
        switch (zbwwVar.ordinal()) {
            case 0:
                i10 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zbr(bArr, i10)));
                break;
            case 1:
                i10 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zbc(bArr, i10)));
                break;
            case 2:
            case 3:
                i10 = zbn(bArr, i10, zbsqVar);
                objValueOf = Long.valueOf(zbsqVar.zbb);
                break;
            case 4:
            case 12:
                i10 = zbk(bArr, i10, zbsqVar);
                objValueOf = Integer.valueOf(zbsqVar.zba);
                break;
            case 5:
            case 15:
                i10 += 8;
                objValueOf = Long.valueOf(zbr(bArr, i10));
                break;
            case 6:
            case 14:
                i10 += 4;
                objValueOf = Integer.valueOf(zbc(bArr, i10));
                break;
            case 7:
                i10 = zbn(bArr, i10, zbsqVar);
                objValueOf = Boolean.valueOf(zbsqVar.zbb != 0);
                break;
            case 8:
                i10 = zbh(bArr, i10, zbsqVar);
                objValueOf = zbsqVar.zbc;
                break;
            case 9:
                int i12 = ((i5 >>> 3) << 3) | 4;
                zbvx zbvxVarZbb = zbvu.zba().zbb(zbudVar.zba.getClass());
                Object objZbf = zbtuVar.zbf(zbudVar.zbb);
                if (objZbf == null) {
                    objZbf = zbvxVarZbb.zbe();
                    zbtuVar.zbj(zbudVar.zbb, objZbf);
                }
                return zbo(objZbf, zbvxVarZbb, bArr, i10, i11, i12, zbsqVar);
            case 10:
                zbvx zbvxVarZbb2 = zbvu.zba().zbb(zbudVar.zba.getClass());
                Object objZbf2 = zbtuVar.zbf(zbudVar.zbb);
                if (objZbf2 == null) {
                    objZbf2 = zbvxVarZbb2.zbe();
                    zbtuVar.zbj(zbudVar.zbb, objZbf2);
                }
                return zbp(objZbf2, zbvxVarZbb2, bArr, i10, i11, zbsqVar);
            case 11:
                i10 = zba(bArr, i10, zbsqVar);
                objValueOf = zbsqVar.zbc;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i10 = zbk(bArr, i10, zbsqVar);
                objValueOf = Integer.valueOf(zbtg.zbb(zbsqVar.zba));
                break;
            case 17:
                i10 = zbn(bArr, i10, zbsqVar);
                objValueOf = Long.valueOf(zbtg.zbc(zbsqVar.zbb));
                break;
        }
        zbtuVar.zbj(zbudVar.zbb, objValueOf);
        return i10;
    }

    public static int zbc(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zbd(zbvx zbvxVar, byte[] bArr, int i5, int i10, int i11, zbsq zbsqVar) throws IOException {
        Object objZbe = zbvxVar.zbe();
        int iZbo = zbo(objZbe, zbvxVar, bArr, i5, i10, i11, zbsqVar);
        zbvxVar.zbf(objZbe);
        zbsqVar.zbc = objZbe;
        return iZbo;
    }

    public static int zbe(zbvx zbvxVar, byte[] bArr, int i5, int i10, zbsq zbsqVar) throws IOException {
        Object objZbe = zbvxVar.zbe();
        int iZbp = zbp(objZbe, zbvxVar, bArr, i5, i10, zbsqVar);
        zbvxVar.zbf(objZbe);
        zbsqVar.zbc = objZbe;
        return iZbp;
    }

    public static int zbf(zbvx zbvxVar, int i5, byte[] bArr, int i10, int i11, zbun zbunVar, zbsq zbsqVar) throws IOException {
        int iZbe = zbe(zbvxVar, bArr, i10, i11, zbsqVar);
        zbunVar.add(zbsqVar.zbc);
        while (iZbe < i11) {
            int iZbk = zbk(bArr, iZbe, zbsqVar);
            if (i5 != zbsqVar.zba) {
                break;
            }
            iZbe = zbe(zbvxVar, bArr, iZbk, i11, zbsqVar);
            zbunVar.add(zbsqVar.zbc);
        }
        return iZbe;
    }

    public static int zbg(byte[] bArr, int i5, zbun zbunVar, zbsq zbsqVar) throws IOException {
        zbug zbugVar = (zbug) zbunVar;
        int iZbk = zbk(bArr, i5, zbsqVar);
        int i10 = zbsqVar.zba + iZbk;
        while (iZbk < i10) {
            iZbk = zbk(bArr, iZbk, zbsqVar);
            zbugVar.zbg(zbsqVar.zba);
        }
        if (iZbk == i10) {
            return iZbk;
        }
        throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zbh(byte[] bArr, int i5, zbsq zbsqVar) throws zbuq {
        int iZbk = zbk(bArr, i5, zbsqVar);
        int i10 = zbsqVar.zba;
        if (i10 < 0) {
            throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            zbsqVar.zbc = "";
            return iZbk;
        }
        zbsqVar.zbc = new String(bArr, iZbk, i10, zbuo.zba);
        return iZbk + i10;
    }

    public static int zbi(byte[] bArr, int i5, zbsq zbsqVar) throws zbuq {
        int i10;
        int iZbk = zbk(bArr, i5, zbsqVar);
        int i11 = zbsqVar.zba;
        if (i11 < 0) {
            throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zbsqVar.zbc = "";
            return iZbk;
        }
        int i12 = zbwv.zba;
        int length = bArr.length;
        if ((((length - iZbk) - i11) | iZbk | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZbk), Integer.valueOf(i11)));
        }
        int i13 = iZbk + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iZbk < i13) {
            byte b5 = bArr[iZbk];
            if (!zbwt.zbd(b5)) {
                break;
            }
            iZbk++;
            cArr[i14] = (char) b5;
            i14++;
        }
        int i15 = i14;
        while (iZbk < i13) {
            int i16 = iZbk + 1;
            byte b10 = bArr[iZbk];
            if (zbwt.zbd(b10)) {
                cArr[i15] = (char) b10;
                i15++;
                iZbk = i16;
                while (iZbk < i13) {
                    byte b11 = bArr[iZbk];
                    if (zbwt.zbd(b11)) {
                        iZbk++;
                        cArr[i15] = (char) b11;
                        i15++;
                    }
                }
            } else {
                if (b10 < -32) {
                    if (i16 >= i13) {
                        throw new zbuq("Protocol message had invalid UTF-8.");
                    }
                    i10 = i15 + 1;
                    iZbk += 2;
                    zbwt.zbc(b10, bArr[i16], cArr, i15);
                } else if (b10 < -16) {
                    if (i16 >= i13 - 1) {
                        throw new zbuq("Protocol message had invalid UTF-8.");
                    }
                    i10 = i15 + 1;
                    int i17 = iZbk + 2;
                    iZbk += 3;
                    zbwt.zbb(b10, bArr[i16], bArr[i17], cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw new zbuq("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i16];
                    int i18 = iZbk + 3;
                    byte b13 = bArr[iZbk + 2];
                    iZbk += 4;
                    zbwt.zba(b10, b12, b13, bArr[i18], cArr, i15);
                    i15 += 2;
                }
                i15 = i10;
            }
        }
        zbsqVar.zbc = new String(cArr, 0, i15);
        return i13;
    }

    public static int zbj(int i5, byte[] bArr, int i10, int i11, zbwm zbwmVar, zbsq zbsqVar) throws zbuq {
        if ((i5 >>> 3) == 0) {
            throw new zbuq("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZbn = zbn(bArr, i10, zbsqVar);
            zbwmVar.zbj(i5, Long.valueOf(zbsqVar.zbb));
            return iZbn;
        }
        if (i12 == 1) {
            zbwmVar.zbj(i5, Long.valueOf(zbr(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZbk = zbk(bArr, i10, zbsqVar);
            int i13 = zbsqVar.zba;
            if (i13 < 0) {
                throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iZbk) {
                throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zbwmVar.zbj(i5, zbtc.zbb);
            } else {
                zbwmVar.zbj(i5, zbtc.zbj(bArr, iZbk, i13));
            }
            return iZbk + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zbuq("Protocol message contained an invalid tag (zero).");
            }
            zbwmVar.zbj(i5, Integer.valueOf(zbc(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        zbwm zbwmVarZbf = zbwm.zbf();
        int i15 = zbsqVar.zbe + 1;
        zbsqVar.zbe = i15;
        zbs(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZbk2 = zbk(bArr, i10, zbsqVar);
            int i17 = zbsqVar.zba;
            if (i17 == i14) {
                i16 = i17;
                i10 = iZbk2;
                break;
            }
            i10 = zbj(i17, bArr, iZbk2, i11, zbwmVarZbf, zbsqVar);
            i16 = i17;
        }
        zbsqVar.zbe--;
        if (i10 > i11 || i16 != i14) {
            throw new zbuq("Failed to parse the message.");
        }
        zbwmVar.zbj(i5, zbwmVarZbf);
        return i10;
    }

    public static int zbk(byte[] bArr, int i5, zbsq zbsqVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zbl(b5, bArr, i10, zbsqVar);
        }
        zbsqVar.zba = b5;
        return i10;
    }

    public static int zbl(int i5, byte[] bArr, int i10, zbsq zbsqVar) {
        byte b5 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b5 >= 0) {
            zbsqVar.zba = i12 | (b5 << 7);
            return i11;
        }
        int i13 = i12 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zbsqVar.zba = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zbsqVar.zba = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zbsqVar.zba = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zbsqVar.zba = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zbm(int i5, byte[] bArr, int i10, int i11, zbun zbunVar, zbsq zbsqVar) {
        zbug zbugVar = (zbug) zbunVar;
        int iZbk = zbk(bArr, i10, zbsqVar);
        zbugVar.zbg(zbsqVar.zba);
        while (iZbk < i11) {
            int iZbk2 = zbk(bArr, iZbk, zbsqVar);
            if (i5 != zbsqVar.zba) {
                break;
            }
            iZbk = zbk(bArr, iZbk2, zbsqVar);
            zbugVar.zbg(zbsqVar.zba);
        }
        return iZbk;
    }

    public static int zbn(byte[] bArr, int i5, zbsq zbsqVar) {
        long j8 = bArr[i5];
        int i10 = i5 + 1;
        if (j8 >= 0) {
            zbsqVar.zbb = j8;
            return i10;
        }
        int i11 = i5 + 2;
        byte b5 = bArr[i10];
        long j10 = (j8 & 127) | ((b5 & 127) << 7);
        int i12 = 7;
        while (b5 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & 127) << i12;
            b5 = bArr[i11];
            i11 = i13;
        }
        zbsqVar.zbb = j10;
        return i11;
    }

    public static int zbo(Object obj, zbvx zbvxVar, byte[] bArr, int i5, int i10, int i11, zbsq zbsqVar) throws IOException {
        int i12 = zbsqVar.zbe + 1;
        zbsqVar.zbe = i12;
        zbs(i12);
        int iZbc = ((zbvp) zbvxVar).zbc(obj, bArr, i5, i10, i11, zbsqVar);
        zbsqVar.zbe--;
        zbsqVar.zbc = obj;
        return iZbc;
    }

    public static int zbp(Object obj, zbvx zbvxVar, byte[] bArr, int i5, int i10, zbsq zbsqVar) throws IOException {
        int iZbl = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZbl = zbl(i11, bArr, iZbl, zbsqVar);
            i11 = zbsqVar.zba;
        }
        int i12 = iZbl;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = zbsqVar.zbe + 1;
        zbsqVar.zbe = i13;
        zbs(i13);
        int i14 = i12 + i11;
        zbvxVar.zbh(obj, bArr, i12, i14, zbsqVar);
        zbsqVar.zbe--;
        zbsqVar.zbc = obj;
        return i14;
    }

    public static int zbq(int i5, byte[] bArr, int i10, int i11, zbsq zbsqVar) throws zbuq {
        if ((i5 >>> 3) == 0) {
            throw new zbuq("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            return zbn(bArr, i10, zbsqVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zbk(bArr, i10, zbsqVar) + zbsqVar.zba;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new zbuq("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i5 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zbk(bArr, i10, zbsqVar);
            i14 = zbsqVar.zba;
            if (i14 == i13) {
                break;
            }
            i10 = zbq(i14, bArr, i10, i11, zbsqVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw new zbuq("Failed to parse the message.");
        }
        return i10;
    }

    public static long zbr(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    private static void zbs(int i5) throws zbuq {
        if (i5 >= zbb) {
            throw new zbuq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
