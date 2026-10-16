package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import q7.BinderC3877b;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzems implements zzemg {
    private final Context zza;
    private final zzcvg zzb;

    public zzems(Context context, zzcvg zzcvgVar) {
        this.zza = context;
        this.zzb = zzcvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            zzbxiVar.zzs(zzfknVar.zzU, zzfknVar.zzv.toString(), zzfkyVar.zza.zza.zzd, new BinderC3877b(this.zza), new zzemr(zzemdVar, null), (zzbvp) zzemdVar.zzc);
        } catch (RemoteException e7) {
            G6.L.l("Remote exception loading an app open RTB ad", e7);
            throw new zzfln(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.zzb, EnumC4471b.APP_OPEN_AD);
        zzcvd zzcvdVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdml(zzenyVar, null), new zzcve(zzfknVar.zzaa));
        zzenyVar.zzc(zzcvdVarZzf.zzd());
        ((zzenp) zzemdVar.zzc).zzc(zzcvdVarZzf.zzg());
        return zzcvdVarZzf.zzh();
    }
}
