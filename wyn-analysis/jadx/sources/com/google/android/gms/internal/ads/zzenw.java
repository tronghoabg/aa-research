package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import cb.AbstractC1593a;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzenw implements zzema {
    private final Context zza;
    private final zzdwq zzb;
    private final zzdno zzc;
    private final zzflg zzd;
    private final Executor zze;
    private final H6.a zzf;
    private final zzbqa zzg;
    private final boolean zzh = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzku)).booleanValue();
    private final zzekz zzi;
    private final zzdzo zzj;
    private final zzdzt zzk;

    public zzenw(Context context, H6.a aVar, zzflg zzflgVar, Executor executor, zzdno zzdnoVar, zzdwq zzdwqVar, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzd = zzflgVar;
        this.zzc = zzdnoVar;
        this.zze = executor;
        this.zzf = aVar;
        this.zzb = zzdwqVar;
        this.zzg = zzbqaVar;
        this.zzi = zzekzVar;
        this.zzj = zzdzoVar;
        this.zzk = zzdztVar;
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
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzfknVar, zzfkyVar, zzdwuVar, obj);
            }
        };
        Executor executor = this.zze;
        p8.p pVarZzj = zzhcf.zzj(pVarZza, zzhbnVar, executor);
        pVarZzj.addListener(new Runnable(zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return pVarZzj;
    }

    public final p8.p zzc(final zzfkn zzfknVar, zzfky zzfkyVar, zzdwu zzdwuVar, Object obj) throws zzclq {
        final zzenw zzenwVar;
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzj, zzdzc.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdwq zzdwqVar = this.zzb;
        zzflg zzflgVar = this.zzd;
        final zzclb zzclbVarZza = zzdwqVar.zza(zzflgVar.zzf, zzfknVar, zzfkyVar.zzb.zzb);
        zzclbVarZza.zzaw(zzfknVar.zzW);
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzj, zzdzc.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcgd zzcgdVar = new zzcgd();
        zzdno zzdnoVar = this.zzc;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, null);
        Context context = this.zza;
        H6.a aVar = this.zzf;
        boolean z2 = this.zzh;
        zzbqa zzbqaVar = this.zzg;
        final zzdmi zzdmiVarZzd = zzdnoVar.zzd(zzcyqVar, new zzdml(new zzenu(context, aVar, zzcgdVar, zzfknVar, zzclbVarZza, zzflgVar, z2, zzbqaVar, this.zzi, this.zzk), zzclbVarZza));
        zzcgdVar.zzc(zzdmiVarZzd);
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            zzenwVar = this;
            AbstractC1593a.y(C6.n.f1857D.k, zzenwVar.zzj, zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzenwVar = this;
        }
        zzdmiVarZzd.zzd().zzq(new zzddt() { // from class: com.google.android.gms.internal.ads.zzenr
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
        if (((Boolean) zzbivVar.zzd(zzbix.zzgt)).booleanValue() && zzdmiVarZzd.zzl().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzdwp zzdwpVarZzk = zzdmiVarZzd.zzk();
        if (true != z2) {
            zzbqaVar = null;
        }
        zzdzo zzdzoVar = zzenwVar.zzj;
        zzdwpVarZzk.zzi(zzclbVarZza, true, zzbqaVar, zzdzoVar);
        zzdmiVarZzd.zzk();
        return zzhcf.zzk(zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzdnoVar.zzc()), new zzgti(zzenwVar) { // from class: com.google.android.gms.internal.ads.zzens
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                zzclb zzclbVar = zzclbVarZza;
                if (zzfknVar.zzM) {
                    zzclbVar.zzav();
                }
                zzdmi zzdmiVar = zzdmiVarZzd;
                zzclbVar.zzJ();
                zzclbVar.onPause();
                return zzdmiVar.zzh();
            }
        }, zzenwVar.zze);
    }
}
