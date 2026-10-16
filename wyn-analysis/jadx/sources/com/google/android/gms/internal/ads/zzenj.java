package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.L0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzenj implements zzemg {
    private final Context zza;
    private final zzcwx zzb;
    private View zzc;
    private zzbvs zzd;

    public zzenj(Context context, zzcwx zzcwxVar) {
        this.zza = context;
        this.zzb = zzcwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
                String str = zzfknVar.zzU;
                String string = zzfknVar.zzv.toString();
                zzflg zzflgVar = zzfkyVar.zza.zza;
                zzbxiVar.zzq(str, string, zzflgVar.zzd, new BinderC3877b(this.zza), new zzeni(this, zzemdVar, null), (zzbvp) zzemdVar.zzc, zzflgVar.zzf);
                return;
            }
            String str2 = zzfknVar.zzU;
            String string2 = zzfknVar.zzv.toString();
            zzflg zzflgVar2 = zzfkyVar.zza.zza;
            zzbxiVar.zzi(str2, string2, zzflgVar2.zzd, new BinderC3877b(this.zza), new zzeni(this, zzemdVar, null), (zzbvp) zzemdVar.zzc, zzflgVar2.zzf);
        } catch (RemoteException e7) {
            throw new zzfln(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final Object zzb(zzfky zzfkyVar, final zzfkn zzfknVar, final zzemd zzemdVar) throws zzepp, zzfln {
        final View view;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
            try {
                view = (View) BinderC3877b.S(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfln(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeng
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            public final /* synthetic */ p8.p zza(Object obj) {
                                return this.zza.zzc(view, zzfknVar, obj);
                            }
                        }, zzcfy.zzf).get();
                    } catch (InterruptedException | ExecutionException e7) {
                        throw new zzfln(e7);
                    }
                }
            } catch (RemoteException e10) {
                throw new zzfln(e10);
            }
        } else {
            view = this.zzc;
        }
        zzcvt zzcvtVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzcvz(view, null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ L0 zza() throws zzfln {
                try {
                    return ((zzbxi) zzemdVar.zzb).zzh();
                } catch (RemoteException e11) {
                    throw new zzfln(e11);
                }
            }
        }, (zzfko) zzfknVar.zzu.get(0)));
        zzcvtVarZzf.zzk().zza(view);
        ((zzenp) zzemdVar.zzc).zzc(zzcvtVarZzf.zzg());
        return zzcvtVarZzf.zzi();
    }

    public final /* synthetic */ p8.p zzc(View view, zzfkn zzfknVar, Object obj) {
        return zzhcf.zza(zzcxm.zza(this.zza, view, zzfknVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbvs zzbvsVar) {
        this.zzd = zzbvsVar;
    }
}
