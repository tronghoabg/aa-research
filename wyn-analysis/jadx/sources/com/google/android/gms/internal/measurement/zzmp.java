package com.google.android.gms.internal.measurement;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
final class zzmp {
    private static final zzmr zza;

    static {
        if (zzml.zzc()) {
            zzml.zzd();
        }
        zza = new zzmq();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i5, int i10) {
        byte b5 = bArr[i5 - 1];
        int i11 = i10 - i5;
        if (i11 == 0) {
            if (b5 > -12) {
                return -1;
            }
            return b5;
        }
        if (i11 == 1) {
            byte b10 = bArr[i5];
            if (b5 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b5;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i5];
        byte b12 = bArr[i5 + 1];
        if (b5 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b5);
    }

    public static String zzb(byte[] bArr, int i5, int i10) throws zzkb {
        return zza.zza(bArr, i5, i10);
    }

    public static boolean zzc(byte[] bArr, int i5, int i10) {
        return zza.zza(0, bArr, i5, i10) == 0;
    }

    public static int zza(String str, byte[] bArr, int i5, int i10) {
        return zza.zza(str, bArr, i5, i10);
    }

    public static int zza(String str) {
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
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i5 += (127 - cCharAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new zzmt(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i5;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException(AbstractC0279p0.k(i11 + 4294967296L, "UTF-8 length does not fit in int: "));
    }
}
