package com.google.android.recaptcha.internal;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;

/* loaded from: classes4.dex */
public final class zznp {
    static {
        zzjz zzjzVarZzi = zzka.zzi();
        zzjzVarZzi.zze(-315576000000L);
        zzjzVarZzi.zzd(-999999999);
        zzjz zzjzVarZzi2 = zzka.zzi();
        zzjzVarZzi2.zze(315576000000L);
        zzjzVarZzi2.zzd(999999999);
        zzjz zzjzVarZzi3 = zzka.zzi();
        zzjzVarZzi3.zze(0L);
        zzjzVarZzi3.zzd(0);
    }

    public static zzka zza(long j8) {
        int i5 = (int) (j8 % 1000000000);
        long jZza = j8 / 1000000000;
        if (i5 <= -1000000000 || i5 >= 1000000000) {
            jZza = zzic.zza(jZza, i5 / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            i5 %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        if (jZza > 0 && i5 < 0) {
            i5 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            jZza--;
        }
        if (jZza < 0 && i5 > 0) {
            i5 -= 1000000000;
            jZza++;
        }
        zzjz zzjzVarZzi = zzka.zzi();
        zzjzVarZzi.zze(jZza);
        zzjzVarZzi.zzd(i5);
        zzka zzkaVar = (zzka) zzjzVarZzi.zzj();
        long jZzg = zzkaVar.zzg();
        int iZzf = zzkaVar.zzf();
        if (jZzg >= -315576000000L && jZzg <= 315576000000L && iZzf >= -999999999 && iZzf < 1000000000 && ((jZzg >= 0 && iZzf >= 0) || (jZzg <= 0 && iZzf <= 0))) {
            return zzkaVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iZzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
