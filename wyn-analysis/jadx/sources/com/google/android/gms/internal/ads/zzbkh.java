package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzbkh {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbkh(String str, Object obj, int i5) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i5;
    }

    public static zzbkh zza(String str, boolean z2) {
        return new zzbkh(str, Boolean.valueOf(z2), 1);
    }

    public static zzbkh zzb(String str, long j8) {
        return new zzbkh(str, Long.valueOf(j8), 2);
    }

    public static zzbkh zzc(String str, double d3) {
        return new zzbkh(str, Double.valueOf(d3), 3);
    }

    public static zzbkh zzd(String str, String str2) {
        return new zzbkh("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbln zzblnVarZza = zzblp.zza();
        if (zzblnVarZza != null) {
            int i5 = this.zzc - 1;
            return i5 != 0 ? i5 != 1 ? i5 != 2 ? zzblnVarZza.zzd(this.zza, (String) this.zzb) : zzblnVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zzblnVarZza.zzb(this.zza, ((Long) this.zzb).longValue()) : zzblnVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzblp.zzb() != null) {
            zzblp.zzb().zza();
        }
        return this.zzb;
    }
}
