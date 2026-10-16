package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import cb.AbstractC1593a;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeml implements zzema {
    private final zzcvg zza;
    private final zzdwq zzb;
    private final zzflg zzc;
    private final Executor zzd;
    private final H6.a zze;
    private final zzbqa zzf;
    private final boolean zzg = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzku)).booleanValue();
    private final zzekz zzh;
    private final zzdzo zzi;
    private final zzdzt zzj;

    public zzeml(zzcvg zzcvgVar, Context context, Executor executor, zzdwq zzdwqVar, zzflg zzflgVar, H6.a aVar, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.zza = zzcvgVar;
        this.zzd = executor;
        this.zzb = zzdwqVar;
        this.zzc = zzflgVar;
        this.zze = aVar;
        this.zzf = zzbqaVar;
        this.zzh = zzekzVar;
        this.zzi = zzdzoVar;
        this.zzj = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.zzs;
        return (zzfksVar == null || zzfksVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzdwu zzdwuVar = new zzdwu();
        p8.p pVarZza = zzhcf.zza(null);
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzfknVar, zzfkyVar, zzdwuVar, obj);
            }
        };
        Executor executor = this.zzd;
        p8.p pVarZzj = zzhcf.zzj(pVarZza, zzhbnVar, executor);
        pVarZzj.addListener(new Runnable(zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzemk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return pVarZzj;
    }

    public final p8.p zzc(final zzfkn zzfknVar, zzfky zzfkyVar, zzdwu zzdwuVar, Object obj) throws zzclq {
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzi, zzdzc.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdwq zzdwqVar = this.zzb;
        zzflg zzflgVar = this.zzc;
        final zzclb zzclbVarZza = zzdwqVar.zza(zzflgVar.zzf, zzfknVar, zzfkyVar.zzb.zzb);
        zzclbVarZza.zzaw(zzfknVar.zzW);
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzi, zzdzc.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcgd zzcgdVar = new zzcgd();
        zzcvg zzcvgVar = this.zza;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, null);
        H6.a aVar = this.zze;
        boolean z2 = this.zzg;
        zzbqa zzbqaVar = this.zzf;
        final zzcvd zzcvdVarZzf = zzcvgVar.zzf(zzcyqVar, new zzdml(new zzemn(aVar, zzcgdVar, zzfknVar, zzclbVarZza, zzflgVar, z2, zzbqaVar, this.zzh, this.zzj), zzclbVarZza), new zzcve(zzfknVar.zzaa));
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzi, zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdwp zzdwpVarZzi = zzcvdVarZzf.zzi();
        zzbqa zzbqaVar2 = true != z2 ? null : zzbqaVar;
        zzdzo zzdzoVar = this.zzi;
        zzdwpVarZzi.zzi(zzclbVarZza, false, zzbqaVar2, zzdzoVar);
        zzcgdVar.zzc(zzcvdVarZzf);
        zzcvdVarZzf.zzd().zzq(new zzddt() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzdr() {
                zzclb zzclbVar = zzclbVarZza;
                if (zzclbVar.zzP() != null) {
                    zzclbVar.zzP().zzq();
                }
            }
        }, zzcfy.zzh);
        zzfks zzfksVar = zzfknVar.zzs;
        String strZza = zzfksVar.zza;
        if (((Boolean) zzbivVar.zzd(zzbix.zzgt)).booleanValue() && zzcvdVarZzf.zzk().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzcvdVarZzf.zzi();
        return zzhcf.zzk(zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzcvgVar.zzd()), new zzgti(this) { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                zzclb zzclbVar = zzclbVarZza;
                if (zzfknVar.zzM) {
                    zzclbVar.zzav();
                }
                zzcvd zzcvdVar = zzcvdVarZzf;
                zzclbVar.zzJ();
                zzclbVar.onPause();
                return zzcvdVar.zzh();
            }
        }, this.zzd);
    }
}
