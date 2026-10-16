package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhaj {
    public static long zza(String str, long j8) {
        if (j8 >= 0) {
            return j8;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j8);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void zzb(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
