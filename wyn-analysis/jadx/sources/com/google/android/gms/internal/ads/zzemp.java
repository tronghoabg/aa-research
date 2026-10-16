package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzemp implements zzemg {
    private final Context zza;
    private final zzcvg zzb;
    private final Executor zzc;

    public zzemp(Context context, zzcvg zzcvgVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcvgVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        zzfmeVar.zzy(this.zza, zzflgVar.zzd, string, (zzbvp) zzemdVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzcvd zzcvdVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdml(new zzemo(this, zzemdVar, zzfknVar), null), new zzcve(zzfknVar.zzaa));
        zzcvdVarZzf.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzc);
        ((zzenp) zzemdVar.zzc).zzc(zzcvdVarZzf.zzf());
        return zzcvdVarZzf.zzh();
    }
}
