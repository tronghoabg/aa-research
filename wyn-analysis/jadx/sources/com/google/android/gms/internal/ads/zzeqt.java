package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeqt implements zzemg {
    private final Context zza;
    private final Executor zzb;
    private final zzdvz zzc;

    public zzeqt(Context context, Executor executor, zzdvz zzdvzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        try {
            ((zzfme) zzemdVar.zzb).zzl(zzfkyVar.zza.zza.zzd, zzfknVar.zzv.toString());
        } catch (Exception e7) {
            String str = zzemdVar.zza;
            int i5 = G6.L.f4523b;
            H6.l.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        if (zzfmeVar.zzn()) {
            zze(zzfkyVar, zzfknVar, zzemdVar);
            return;
        }
        zzeqq zzeqqVar = new zzeqq(this, zzfkyVar, zzfknVar, zzemdVar);
        zzdej zzdejVar = zzemdVar.zzc;
        ((zzenq) zzdejVar).zzd(zzeqqVar);
        Context context = this.zza;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        zzfmeVar.zzk(context, zzflgVar.zzd, null, (zzcch) zzdejVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdvv zzdvvVarZzf = this.zzc.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdvw(new zzeqr(this, zzemdVar, zzfknVar)));
        zzdvvVarZzf.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzb);
        zzdeg zzdegVarZzb = zzdvvVarZzf.zzb();
        zzdcx zzdcxVarZzc = zzdvvVarZzf.zzc();
        ((zzenq) zzemdVar.zzc).zzc(new zzeqs(this, zzdvvVarZzf.zzi(), zzdcxVarZzc, zzdegVarZzb, zzdvvVarZzf.zzk()));
        return zzdvvVarZzf.zzh();
    }

    public final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}
