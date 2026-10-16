package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import q7.BinderC3877b;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzeqb implements zzemg {
    private final Context zza;
    private final zzdvz zzb;

    public zzeqb(Context context, zzdvz zzdvzVar) {
        this.zza = context;
        this.zzb = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            zzflg zzflgVar = zzfkyVar.zza.zza;
            if (zzflgVar.zzp.zza == 3) {
                zzbxiVar.zzp(zzfknVar.zzU, zzfknVar.zzv.toString(), zzflgVar.zzd, new BinderC3877b(this.zza), new zzeqa(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
            } else {
                zzbxiVar.zzl(zzfknVar.zzU, zzfknVar.zzv.toString(), zzflgVar.zzd, new BinderC3877b(this.zza), new zzeqa(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
            }
        } catch (RemoteException e7) {
            G6.L.l("Remote exception loading a rewarded RTB ad", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.zzb, EnumC4471b.REWARDED);
        zzdvv zzdvvVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdvw(zzenyVar));
        zzenyVar.zzc(zzdvvVarZzf.zzd());
        ((zzenp) zzemdVar.zzc).zzc(zzdvvVarZzf.zzn());
        return zzdvvVarZzf.zzh();
    }
}
