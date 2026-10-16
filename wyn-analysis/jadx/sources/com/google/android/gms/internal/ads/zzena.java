package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.L0;
import D6.r1;
import D6.x1;
import G6.C0546j;
import android.content.Context;
import android.view.View;
import cb.AbstractC1593a;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzena implements zzema {
    private final zzcwx zza;
    private final Context zzb;
    private final zzdwq zzc;
    private final zzflg zzd;
    private final Executor zze;
    private final zzgti zzf;
    private final zzdzo zzg;

    public zzena(zzcwx zzcwxVar, Context context, Executor executor, zzdwq zzdwqVar, zzflg zzflgVar, zzgti zzgtiVar, zzdzo zzdzoVar) {
        this.zzb = context;
        this.zza = zzcwxVar;
        this.zze = executor;
        this.zzc = zzdwqVar;
        this.zzd = zzflgVar;
        this.zzf = zzgtiVar;
        this.zzg = zzdzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.zzs;
        return (zzfksVar == null || zzfksVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        return zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzfkyVar, zzfknVar, obj);
            }
        }, this.zze);
    }

    public final p8.p zzc(zzfky zzfkyVar, zzfkn zzfknVar, Object obj) throws zzclq {
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzg, zzdzc.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = this.zzb;
        x1 x1VarZza = zzflm.zza(context, zzfknVar.zzu);
        final zzclb zzclbVarZza = this.zzc.zza(x1VarZza, zzfknVar, zzfkyVar.zzb.zzb);
        zzclbVarZza.zzaw(zzfknVar.zzW);
        zzbio zzbioVar2 = zzbix.zzjf;
        zzbiv zzbivVar = c0395s.f2492c;
        View viewZza = (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue() && zzfknVar.zzag) ? zzcxm.zza(context, zzclbVarZza.zzE(), zzfknVar) : new zzdwt(context, zzclbVarZza.zzE(), (C0546j) this.zzf.apply(zzfknVar));
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzg, zzdzc.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcwx zzcwxVar = this.zza;
        final zzcvt zzcvtVarZzf = zzcwxVar.zzf(new zzcyq(zzfkyVar, zzfknVar, null), new zzcvz(viewZza, zzclbVarZza, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzemv
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ L0 zza() {
                return zzclbVarZza.zzh();
            }
        }, zzflm.zzb(x1VarZza)));
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzg, zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdwp zzdwpVarZzj = zzcvtVarZzf.zzj();
        zzdzo zzdzoVar = this.zzg;
        zzdwpVarZzj.zzi(zzclbVarZza, false, null, zzdzoVar);
        zzddr zzddrVarZzd = zzcvtVarZzf.zzd();
        zzddt zzddtVar = new zzddt() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzdr() {
                zzclb zzclbVar = zzclbVarZza;
                if (zzclbVar.zzP() != null) {
                    zzclbVar.zzP().zzq();
                }
            }
        };
        zzhcp zzhcpVar = zzcfy.zzh;
        zzddrVarZzd.zzq(zzddtVar, zzhcpVar);
        zzfks zzfksVar = zzfknVar.zzs;
        String strZza = zzfksVar.zza;
        if (((Boolean) zzbivVar.zzd(zzbix.zzgt)).booleanValue() && zzcvtVarZzf.zzm().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzcvtVarZzf.zzj();
        p8.p pVarZzj = zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzcwxVar.zze());
        if (zzfknVar.zzM) {
            pVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclbVarZza.zzav();
                }
            }, this.zze);
        }
        pVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzclbVarZza);
            }
        }, this.zze);
        return zzhcf.zzk(pVarZzj, new zzgti() { // from class: com.google.android.gms.internal.ads.zzemy
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcvtVarZzf.zzi();
            }
        }, zzhcpVar);
    }

    public final void zzd(zzclb zzclbVar) {
        zzclbVar.zzJ();
        zzflg zzflgVar = this.zzd;
        zzcmh zzcmhVarZzh = zzclbVar.zzh();
        r1 r1Var = zzflgVar.zza;
        if (r1Var != null && zzcmhVarZzh != null) {
            zzcmhVarZzh.zzc(r1Var);
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbZ)).booleanValue() || zzclbVar.isAttachedToWindow()) {
            return;
        }
        zzclbVar.onPause();
        zzclbVar.zzaG(true);
    }
}
