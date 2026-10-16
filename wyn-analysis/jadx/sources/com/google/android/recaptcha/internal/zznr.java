package com.google.android.recaptcha.internal;

import cb.AbstractC1593a;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zznr {
    private static final ThreadLocal zza;

    static {
        zzmy zzmyVarZzi = zzmz.zzi();
        zzmyVarZzi.zze(-62135596800L);
        zzmyVarZzi.zzd(0);
        zzmy zzmyVarZzi2 = zzmz.zzi();
        zzmyVarZzi2.zze(253402300799L);
        zzmyVarZzi2.zzd(999999999);
        zzmy zzmyVarZzi3 = zzmz.zzi();
        zzmyVarZzi3.zze(0L);
        zzmyVarZzi3.zzd(0);
        zza = new zznq();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzmz zza(zzmz zzmzVar) {
        long jZzg = zzmzVar.zzg();
        boolean zZze = zze(jZzg);
        int iZzf = zzmzVar.zzf();
        if (zZze && iZzf >= 0 && iZzf < 1000000000) {
            return zzmzVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iZzf + ") must be in range [0, +999,999,999].");
    }

    public static zzmz zzb(long j8) {
        long jZza = j8 / 1000;
        if (!zze(jZza)) {
            throw new IllegalArgumentException(AbstractC1593a.h(jZza, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
        }
        int i5 = (int) ((j8 % 1000) * 1000000);
        if (i5 <= -1000000000 || i5 >= 1000000000) {
            jZza = zzic.zza(jZza, i5 / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            i5 %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        if (i5 < 0) {
            i5 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            jZza = zzic.zzb(jZza, 1L);
        }
        zzmy zzmyVarZzi = zzmz.zzi();
        zzmyVarZzi.zze(jZza);
        zzmyVarZzi.zzd(i5);
        zzmz zzmzVar = (zzmz) zzmyVarZzi.zzj();
        zza(zzmzVar);
        return zzmzVar;
    }

    public static String zzc(zzmz zzmzVar) {
        zza(zzmzVar);
        long jZzg = zzmzVar.zzg();
        int iZzf = zzmzVar.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zza.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb2.append(".");
            sb2.append(iZzf % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / 1000000)) : iZzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf)));
        }
        sb2.append("Z");
        return sb2.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j8) {
        return j8 >= -62135596800L && j8 <= 253402300799L;
    }
}
