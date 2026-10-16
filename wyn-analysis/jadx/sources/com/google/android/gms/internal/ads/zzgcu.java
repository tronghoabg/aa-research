package com.google.android.gms.internal.ads;

import Va.M6;
import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
class zzgcu {
    static final String zza = new UUID(0, 0).toString();
    final zzgct zzb;
    final zzgcs zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzgcu(Context context, String str, String str2, String str3) {
        this.zzb = zzgct.zza(context);
        this.zzc = zzgcs.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(M6.t(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        String str5 = str2 == null ? "null" : "not null";
        int length = str5.length();
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder(str6.length() + length + 120);
        AbstractC3256n.p(sb2, str4, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str5, ", hashKey is ");
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzgcr zza(String str, String str2, long j8, boolean z2) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgcr();
        }
        boolean z10 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZzd = zzd(z10);
        if (jZzd != -1) {
            if (jCurrentTimeMillis < jZzd) {
                this.zzb.zzb(z10 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZzd + j8) {
                return zzb(str, str2);
            }
        }
        String strZze2 = zze(z10);
        return (strZze2 != null || z2) ? new zzgcr(strZze2, zzd(z10)) : zzb(str, str2);
    }

    public final zzgcr zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", string);
        return zzf(zzh(str, str2, string), true);
    }

    public final void zzc(boolean z2) throws IOException {
        String str = z2 ? this.zzg : this.zzf;
        zzgct zzgctVar = this.zzb;
        zzgctVar.zzf(str);
        zzgctVar.zzf(z2 ? this.zze : this.zzd);
    }

    public final long zzd(boolean z2) {
        return this.zzb.zzd(z2 ? this.zzg : this.zzf, -1L);
    }

    public final String zze(boolean z2) {
        return this.zzb.zzc(z2 ? this.zze : this.zzd, null);
    }

    public final zzgcr zzf(String str, boolean z2) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzgct zzgctVar = this.zzb;
        zzgctVar.zzb(z2 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        zzgctVar.zzb(z2 ? this.zze : this.zzd, str);
        return new zzgcr(str, jCurrentTimeMillis);
    }

    public final boolean zzg(boolean z2) {
        return this.zzb.zzg(this.zzd);
    }
}
