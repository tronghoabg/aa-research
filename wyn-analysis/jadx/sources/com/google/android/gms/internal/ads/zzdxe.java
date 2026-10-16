package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes3.dex */
public final class zzdxe {
    private final zzdzt zza;

    public zzdxe(zzdzt zzdztVar) {
        this.zza = zzdztVar;
    }

    public final boolean zza(zzgbe zzgbeVar) {
        boolean zZzj = zzgbeVar.zzj();
        H6.o oVar = H6.o.f4961a;
        if (zZzj) {
            zzdzs zzdzsVarZza = this.zza.zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "aq_ad_closed");
            zzdzsVarZza.zzc("gqi", zzgbeVar.zza());
            zzdzsVarZza.zzc("aq_ad_duration", String.valueOf(zzgbeVar.zzb()));
            zzdzsVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbeVar.zzc()));
            zzdzsVarZza.zzc("aq_time_away", String.valueOf(zzgbeVar.zzg()));
            return zzdzsVarZza.zze().equals(oVar);
        }
        zzdzs zzdzsVarZza2 = this.zza.zza();
        zzdzsVarZza2.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "aq_ad_kill");
        zzdzsVarZza2.zzc("gqi", zzgbeVar.zza());
        zzdzsVarZza2.zzc("aq_ad_duration", String.valueOf(zzgbeVar.zzb()));
        zzdzsVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbeVar.zzc()));
        zzdzsVarZza2.zzc("aq_time_away", String.valueOf(zzgbeVar.zzg()));
        zzdzsVarZza2.zzc("aq_is_os_kill", String.valueOf(zzgbeVar.zze()));
        return zzdzsVarZza2.zze().equals(oVar);
    }
}
