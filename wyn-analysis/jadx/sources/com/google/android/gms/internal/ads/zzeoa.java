package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzeoa implements zzemg {
    private final Context zza;
    private final zzdno zzb;
    private final H6.a zzc;
    private final Executor zzd;

    public zzeoa(Context context, H6.a aVar, zzdno zzdnoVar, Executor executor) {
        this.zza = context;
        this.zzc = aVar;
        this.zzb = zzdnoVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws JSONException, IOException, zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        String strE0 = Fe.e.e0(zzfknVar.zzs);
        zzfmeVar.zzh(this.zza, zzflgVar.zzd, string, strE0, (zzbvp) zzemdVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdmi zzdmiVarZzd = this.zzb.zzd(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdml(new zzenz(this, zzemdVar, zzfknVar), null));
        zzdmiVarZzd.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzd);
        ((zzenp) zzemdVar.zzc).zzc(zzdmiVarZzd.zzf());
        return zzdmiVarZzd.zzh();
    }

    public final /* synthetic */ H6.a zzc() {
        return this.zzc;
    }
}
