package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zzhai {
    public static long zza(long j8, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j8 / j10;
        long j12 = j8 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i5 = ((int) ((j8 ^ j10) >> 63)) | 1;
        switch (zzhah.zza[roundingMode.ordinal()]) {
            case 1:
                zzhaj.zzb(false);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i5 >= 0) {
                    return j11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return j11;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j12);
                long jAbs2 = jAbs - (Math.abs(j10) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (jAbs2 <= 0) {
                    return j11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j11 + i5;
    }

    public static long zzb(long j8, long j10) {
        zzhaj.zza("a", j8);
        zzhaj.zza("b", j10);
        if (j8 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j8;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long jNumberOfTrailingZeros = j8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            jNumberOfTrailingZeros = j14 >> Long.numberOfTrailingZeros(j14);
            j11 += j13;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzc(long j8, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j10;
        }
        long j11 = j8 ^ j10;
        long j12 = (j11 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j8 < 0)))) {
            long j13 = j8 * j10;
            if (j8 == 0 || j13 / j8 == j10) {
                return j13;
            }
        }
        return j12;
    }
}
