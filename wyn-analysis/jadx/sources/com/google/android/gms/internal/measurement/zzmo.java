package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okio.Utf8;

/* loaded from: classes4.dex */
final class zzmo {
    private static boolean zza(byte b5) {
        return b5 > -65;
    }

    public static /* synthetic */ void zza(byte b5, byte b10, byte b11, byte b12, char[] cArr, int i5) throws zzkb {
        if (!zza(b10)) {
            if ((((b10 + 112) + (b5 << 28)) >> 30) == 0 && !zza(b11) && !zza(b12)) {
                int i10 = ((b5 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
                cArr[i5] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i5 + 1] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw zzkb.zzd();
    }

    public static /* synthetic */ void zza(byte b5, char[] cArr, int i5) {
        cArr[i5] = (char) b5;
    }

    public static /* synthetic */ void zza(byte b5, byte b10, byte b11, char[] cArr, int i5) throws zzkb {
        if (!zza(b10) && ((b5 != -32 || b10 >= -96) && ((b5 != -19 || b10 < -96) && !zza(b11)))) {
            cArr[i5] = (char) (((b5 & 15) << 12) | ((b10 & Utf8.REPLACEMENT_BYTE) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzkb.zzd();
    }

    public static /* synthetic */ void zza(byte b5, byte b10, char[] cArr, int i5) throws zzkb {
        if (b5 >= -62 && !zza(b10)) {
            cArr[i5] = (char) (((b5 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzkb.zzd();
    }
}
