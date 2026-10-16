package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
final class zzihp {
    private static final zzihm zza;

    static {
        int i5 = zzicy.zza;
        zza = new zzihn();
    }

    public static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    public static boolean zzb(byte[] bArr, int i5, int i10) {
        return zza.zza(bArr, i5, i10);
    }

    public static int zzc(String str) throws zziho {
        int length = str.length();
        int i5 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < 2048) {
                            i5 += (127 - cCharAt2) >>> 31;
                        } else {
                            i5 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    throw new zziho(i10, length2);
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i5;
                } catch (zziho unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j8 = i11 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j8);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int zzd(String str, byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i5 + i10;
            if (i14 >= length || (i13 = i14 + i5) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i5 + length;
        }
        int i15 = i5 + i14;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return zzihm.zzb(str, bArr, i5, i10);
                    }
                    i14++;
                    if (i14 != str.length()) {
                        char cCharAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i16 = i15 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzihm.zzb(str, bArr, i5, i10);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static String zze(byte[] bArr, int i5, int i10) throws zzifh {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i5) - i10) | i5 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i5), Integer.valueOf(i10)));
        }
        int i12 = i5 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i5 < i12) {
            byte b5 = bArr[i5];
            if (!zzihl.zza(b5)) {
                break;
            }
            i5++;
            cArr[i13] = (char) b5;
            i13++;
        }
        int i14 = i13;
        while (i5 < i12) {
            int i15 = i5 + 1;
            byte b10 = bArr[i5];
            if (zzihl.zza(b10)) {
                cArr[i14] = (char) b10;
                i14++;
                i5 = i15;
                while (i5 < i12) {
                    byte b11 = bArr[i5];
                    if (zzihl.zza(b11)) {
                        i5++;
                        cArr[i14] = (char) b11;
                        i14++;
                    }
                }
            } else {
                if (b10 < -32) {
                    if (i15 >= i12) {
                        throw new zzifh("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    i5 += 2;
                    zzihl.zzb(b10, bArr[i15], cArr, i14);
                } else if (b10 < -16) {
                    if (i15 >= i12 - 1) {
                        throw new zzifh("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    int i16 = i5 + 2;
                    i5 += 3;
                    zzihl.zzc(b10, bArr[i15], bArr[i16], cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new zzifh("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i15];
                    int i17 = i5 + 3;
                    byte b13 = bArr[i5 + 2];
                    i5 += 4;
                    zzihl.zzd(b10, b12, b13, bArr[i17], cArr, i14);
                    i14 += 2;
                }
                i14 = i11;
            }
        }
        return new String(cArr, 0, i14);
    }
}
