package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzeoo implements zzemg {
    private final Context zza;
    private final zzdok zzb;
    private final Executor zzc;

    public zzeoo(Context context, zzdok zzdokVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdokVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfky zzfkyVar, int i5) {
        return zzfkyVar.zza.zza.zzh.contains(Integer.toString(i5));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws JSONException, IOException, zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        String strE0 = Fe.e.e0(zzfknVar.zzs);
        zzfmeVar.zzo(this.zza, zzflgVar.zzd, string, strE0, (zzbvp) zzemdVar.zzc, zzflgVar.zzj, zzflgVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdqb zzdqbVarZzag;
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzbvu zzbvuVarZzD = zzfmeVar.zzD();
        zzbvv zzbvvVarZzE = zzfmeVar.zzE();
        zzbvy zzbvyVarZzu = zzfmeVar.zzu();
        if (zzbvyVarZzu != null && zzc(zzfkyVar, 6)) {
            zzdqbVarZzag = zzdqb.zzaf(zzbvyVarZzu);
        } else if (zzbvuVarZzD != null && zzc(zzfkyVar, 6)) {
            zzdqbVarZzag = zzdqb.zzai(zzbvuVarZzD);
        } else if (zzbvuVarZzD != null && zzc(zzfkyVar, 2)) {
            zzdqbVarZzag = zzdqb.zzah(zzbvuVarZzD);
        } else if (zzbvvVarZzE != null && zzc(zzfkyVar, 6)) {
            zzdqbVarZzag = zzdqb.zzaj(zzbvvVarZzE);
        } else {
            if (zzbvvVarZzE == null || !zzc(zzfkyVar, 1)) {
                throw new zzepp(1, "No native ad mappers");
            }
            zzdqbVarZzag = zzdqb.zzag(zzbvvVarZzE);
        }
        if (zzdqbVarZzag != null) {
            zzflg zzflgVar = zzfkyVar.zza.zza;
            if (zzflgVar.zzh.contains(Integer.toString(zzdqbVarZzag.zzx()))) {
                zzdqd zzdqdVarZze = this.zzb.zze(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdqm(zzdqbVarZzag), new zzdsf(zzbvvVarZzE, zzbvuVarZzD, zzbvyVarZzu));
                ((zzenp) zzemdVar.zzc).zzc(zzdqdVarZze.zzf());
                zzdqdVarZze.zza().zzq(new zzctg(zzfmeVar), this.zzc);
                return zzdqdVarZze.zzh();
            }
        }
        throw new zzepp(1, "No corresponding native ad listener");
    }
}
