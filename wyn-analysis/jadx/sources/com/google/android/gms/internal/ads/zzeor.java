package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzeor implements zzemg {
    private final Context zza;
    private final zzdok zzb;
    private zzbvy zzc;
    private final H6.a zzd;

    public zzeor(Context context, zzdok zzdokVar, H6.a aVar) {
        this.zza = context;
        this.zzb = zzdokVar;
        this.zzd = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            if (this.zzd.f4929c < ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzcx)).intValue()) {
                zzbxiVar.zzn(zzfknVar.zzU, zzfknVar.zzv.toString(), zzfkyVar.zza.zza.zzd, new BinderC3877b(this.zza), new zzeoq(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
                return;
            }
            String str = zzfknVar.zzU;
            String string = zzfknVar.zzv.toString();
            zzflg zzflgVar = zzfkyVar.zza.zza;
            zzbxiVar.zzr(str, string, zzflgVar.zzd, new BinderC3877b(this.zza), new zzeoq(this, zzemdVar, null), (zzbvp) zzemdVar.zzc, zzflgVar.zzj);
        } catch (RemoteException e7) {
            throw new zzfln(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        ArrayList arrayList = zzfkyVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzepp(2, "Unified must be used for RTB.");
        }
        zzdqb zzdqbVarZzaf = zzdqb.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdqbVarZzaf.zzx()))) {
            throw new zzepp(1, "No corresponding native ad listener");
        }
        zzdqd zzdqdVarZze = this.zzb.zze(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdqm(zzdqbVarZzaf), new zzdsf(null, null, this.zzc));
        ((zzenp) zzemdVar.zzc).zzc(zzdqdVarZze.zzg());
        return zzdqdVarZze.zzh();
    }

    public final /* synthetic */ void zzc(zzbvy zzbvyVar) {
        this.zzc = zzbvyVar;
    }
}
