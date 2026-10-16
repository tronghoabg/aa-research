package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzic {
    public static long zza(long j8, long j10) {
        long j11 = j8 + j10;
        zzid.zza(((j8 ^ j10) < 0) | ((j8 ^ j11) >= 0), "checkedAdd", j8, j10);
        return j11;
    }

    public static long zzb(long j8, long j10) {
        long j11 = (-1) + j8;
        zzid.zza(((1 ^ j8) >= 0) | ((j8 ^ j11) >= 0), "checkedSubtract", j8, 1L);
        return j11;
    }
}
