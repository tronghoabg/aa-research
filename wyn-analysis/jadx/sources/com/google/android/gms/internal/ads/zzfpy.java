package com.google.android.gms.internal.ads;

import D6.K0;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfpy implements zzdkl, zzddp, zzdkp {
    private final zzfqq zza;
    private final zzfqg zzb;

    public zzfpy(Context context, zzfqq zzfqqVar) {
        this.zza = zzfqqVar;
        this.zzb = u.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final void zza() {
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            zzfqq zzfqqVar = this.zza;
            zzfqg zzfqgVar = this.zzb;
            zzfqgVar.zzd(true);
            zzfqqVar.zza(zzfqgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(K0 k02) {
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            zzfqq zzfqqVar = this.zza;
            zzfqg zzfqgVar = this.zzb;
            zzfqgVar.zzk(k02.V().toString());
            zzfqgVar.zzd(false);
            zzfqqVar.zza(zzfqgVar);
        }
    }
}
