package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcps implements zzebe {
    private final Long zza;
    private final String zzb;
    private final zzcpe zzc;
    private final zzcpu zzd;

    public zzcps(zzcpe zzcpeVar, zzcpu zzcpuVar, Long l10, String str) {
        this.zzc = zzcpeVar;
        this.zzd = zzcpuVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzebe
    public final zzebn zza() {
        long jLongValue = this.zza.longValue();
        zzcpu zzcpuVar = this.zzd;
        return zzebo.zza(jLongValue, zzcpuVar.zzd(), zzcpuVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebe
    public final zzebr zzb() {
        long jLongValue = this.zza.longValue();
        zzcpu zzcpuVar = this.zzd;
        return zzebs.zza(jLongValue, zzcpuVar.zzd(), zzcpuVar.zza(), this.zzc, this.zzb);
    }
}
