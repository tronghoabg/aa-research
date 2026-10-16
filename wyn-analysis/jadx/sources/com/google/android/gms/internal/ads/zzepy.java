package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzepy implements zzemg {
    private final Context zza;
    private final Executor zzb;
    private final zzdvz zzc;

    public zzepy(Context context, Executor executor, zzdvz zzdvzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzflg zzflgVar = zzfkyVar.zza.zza;
            if (zzflgVar.zzp.zza == 3) {
                ((zzfme) zzemdVar.zzb).zzx(this.zza, zzflgVar.zzd, zzfknVar.zzv.toString(), (zzbvp) zzemdVar.zzc);
            } else {
                ((zzfme) zzemdVar.zzb).zzv(this.zza, zzflgVar.zzd, zzfknVar.zzv.toString(), (zzbvp) zzemdVar.zzc);
            }
        } catch (Exception e7) {
            String str = zzemdVar.zza;
            int i5 = G6.L.f4523b;
            H6.l.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdvv zzdvvVarZzf = this.zzc.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdvw(new zzepx(this, zzemdVar, zzfknVar)));
        zzdvvVarZzf.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzb);
        ((zzenp) zzemdVar.zzc).zzc(zzdvvVarZzf.zzm());
        return zzdvvVarZzf.zzh();
    }
}
