package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.L0;
import D6.x1;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzene implements zzemg {
    private final Context zza;
    private final zzcwx zzb;
    private final Executor zzc;

    public zzene(Context context, zzcwx zzcwxVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcwxVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        x1 x1VarZza;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        x1 x1Var = zzflgVar.zzf;
        boolean z2 = x1Var.f2542n;
        int i5 = x1Var.f2531b;
        int i10 = x1Var.f2534e;
        if (z2) {
            Context context = this.zza;
            AdSize adSize = new AdSize(i10, i5);
            adSize.f26297e = true;
            adSize.f26298f = i5;
            x1VarZza = new x1(context, adSize);
        } else {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
                Context context2 = this.zza;
                AdSize adSize2 = new AdSize(i10, i5);
                adSize2.f26299g = true;
                adSize2.f26300h = i5;
                x1VarZza = new x1(context2, adSize2);
            } else {
                x1VarZza = zzflm.zza(this.zza, zzfknVar.zzu);
            }
        }
        x1 x1Var2 = x1VarZza;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
            ((zzfme) zzemdVar.zzb).zzb(this.zza, x1Var2, zzflgVar.zzd, zzfknVar.zzv.toString(), Fe.e.e0(zzfknVar.zzs), (zzbvp) zzemdVar.zzc);
        } else {
            ((zzfme) zzemdVar.zzb).zzg(this.zza, x1Var2, zzflgVar.zzd, zzfknVar.zzv.toString(), Fe.e.e0(zzfknVar.zzs), (zzbvp) zzemdVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final Object zzb(zzfky zzfkyVar, final zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        final View viewZza;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
            zzbvs zzbvsVarZzc = ((zzfme) zzemdVar.zzb).zzc();
            if (zzbvsVarZzc == null) {
                int i5 = G6.L.f4523b;
                H6.l.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfln(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) BinderC3877b.S(zzbvsVarZzc.zze());
                boolean zZzf = zzbvsVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfln(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzenc
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            public final /* synthetic */ p8.p zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfknVar, obj);
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
            viewZza = ((zzfme) zzemdVar.zzb).zza();
        }
        zzcwx zzcwxVar = this.zzb;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza);
        final zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        Objects.requireNonNull(zzfmeVar);
        zzcvt zzcvtVarZzf = zzcwxVar.zzf(zzcyqVar, new zzcvz(viewZza, null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ L0 zza() {
                return zzfmeVar.zzt();
            }
        }, (zzfko) zzfknVar.zzu.get(0)));
        zzcvtVarZzf.zzk().zza(viewZza);
        zzcvtVarZzf.zza().zzq(new zzctg(zzfmeVar), this.zzc);
        ((zzenp) zzemdVar.zzc).zzc(zzcvtVarZzf.zzf());
        return zzcvtVarZzf.zzi();
    }

    public final /* synthetic */ p8.p zzc(View view, zzfkn zzfknVar, Object obj) {
        return zzhcf.zza(zzcxm.zza(this.zza, view, zzfknVar));
    }
}
