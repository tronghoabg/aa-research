package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
final class zzid {
    public static void zza(boolean z2, String str, long j8, long j10) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j8 + ", " + j10 + ")");
    }

    public static void zzb(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
