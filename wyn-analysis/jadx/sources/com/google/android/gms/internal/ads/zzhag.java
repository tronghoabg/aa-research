package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zzhag {
    public static int zza(int i5, RoundingMode roundingMode) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzhaf.zza[roundingMode.ordinal()]) {
            case 1:
                zzhaj.zzb(((i5 + (-1)) & i5) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i5 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i5);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i5) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i5);
    }

    public static int zzb(int i5, int i10, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i5 / i10;
        int i12 = i5 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i5 ^ i10) >> 31) | 1;
        switch (zzhaf.zza[roundingMode.ordinal()]) {
            case 1:
                zzhaj.zzb(false);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i11 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i11;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }
}
