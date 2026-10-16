package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import q7.BinderC3877b;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzeod implements zzemg {
    private final Context zza;
    private final zzdno zzb;

    public zzeod(Context context, zzdno zzdnoVar) {
        this.zza = context;
        this.zzb = zzdnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            zzbxiVar.zzj(zzfknVar.zzU, zzfknVar.zzv.toString(), zzfkyVar.zza.zza.zzd, new BinderC3877b(this.zza), new zzeoc(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
        } catch (RemoteException e7) {
            G6.L.l("Remote exception loading a interstitial RTB ad", e7);
            throw new zzfln(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.zzb, EnumC4471b.INTERSTITIAL);
        zzdmi zzdmiVarZzd = this.zzb.zzd(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdml(zzenyVar, null));
        zzenyVar.zzc(zzdmiVarZzd.zzd());
        ((zzenp) zzemdVar.zzc).zzc(zzdmiVarZzd.zzg());
        return zzdmiVarZzd.zzh();
    }
}
