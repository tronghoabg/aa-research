package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes3.dex */
public final class zzcva {
    private final zzdzt zza;
    private final zzfky zzb;

    public zzcva(zzdzt zzdztVar, zzfky zzfkyVar) {
        this.zza = zzdztVar;
        this.zzb = zzfkyVar;
    }

    public final void zza(long j8, int i5) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zza(this.zzb.zzb.zzb);
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "ad_closed");
        zzdzsVarZza.zzc("show_time", String.valueOf(j8));
        zzdzsVarZza.zzc("ad_format", "app_open_ad");
        int i10 = i5 - 1;
        zzdzsVarZza.zzc("acr", i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zzdzsVarZza.zzd();
    }
}
