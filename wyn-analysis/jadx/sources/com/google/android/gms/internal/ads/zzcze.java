package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import D6.v1;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcze {
    private final zzega zza;
    private final zzflg zzb;
    private final zzfps zzc;
    private final zzcry zzd;
    private final zzeps zze;
    private final zzdio zzf;
    private zzfky zzg;
    private final zzehl zzh;
    private final zzdce zzi;
    private final Executor zzj;
    private final zzegw zzk;
    private final zzemf zzl;

    public zzcze(zzega zzegaVar, zzflg zzflgVar, zzfps zzfpsVar, zzcry zzcryVar, zzeps zzepsVar, zzdio zzdioVar, zzfky zzfkyVar, zzehl zzehlVar, zzdce zzdceVar, Executor executor, zzegw zzegwVar, zzemf zzemfVar) {
        this.zza = zzegaVar;
        this.zzb = zzflgVar;
        this.zzc = zzfpsVar;
        this.zzd = zzcryVar;
        this.zze = zzepsVar;
        this.zzf = zzdioVar;
        this.zzg = zzfkyVar;
        this.zzh = zzehlVar;
        this.zzi = zzdceVar;
        this.zzj = executor;
        this.zzk = zzegwVar;
        this.zzl = zzemfVar;
    }

    public final p8.p zza(p8.p pVar) {
        if (this.zzg != null) {
            zzfps zzfpsVar = this.zzc;
            zzfpm zzfpmVar = zzfpm.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfpsVar);
            return zzfpd.zza(zzhcf.zza(this.zzg), zzfpmVar, zzfpsVar).zzi();
        }
        C6.n.f1857D.f1870j.zzb();
        zzfpj zzfpjVarZza = this.zzc.zza(zzfpm.SERVER_TRANSACTION, pVar);
        final zzegw zzegwVar = this.zzk;
        Objects.requireNonNull(zzegwVar);
        return zzfpjVarZza.zzc(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return zzegwVar.zza((zzcbk) obj);
            }
        }).zzi();
    }

    public final p8.p zzb() {
        zzflg zzflgVar = this.zzb;
        if (!zzflgVar.zzv) {
            v1 v1Var = zzflgVar.zzd;
            if (v1Var.f2526x != null || v1Var.f2521s != null) {
                zzfps zzfpsVar = this.zzc;
                zzfpm zzfpmVar = zzfpm.PRELOADED_LOADER;
                Objects.requireNonNull(zzfpsVar);
                return zzfpd.zza(this.zza.zza(), zzfpmVar, zzfpsVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final p8.p zzc(p8.p pVar) {
        zzfpj zzfpjVarZzc = this.zzc.zza(zzfpm.RENDERER, pVar).zzb(new zzfos() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) throws Exception {
                zzfky zzfkyVar = (zzfky) obj;
                this.zza.zzi(zzfkyVar);
                return zzfkyVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgI)).booleanValue()) {
            zzfpjVarZzc = zzfpjVarZzc.zzh(((Integer) r1.f2492c.zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS);
        }
        return zzfpjVarZzc.zzi();
    }

    public final zzdio zzd() {
        return this.zzf;
    }

    public final p8.p zze(final zzfnc zzfncVar) {
        zzfoz zzfozVarZzi = this.zzc.zza(zzfpm.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzj(zzfncVar, (zzcbk) obj);
            }
        }).zzi();
        zzhcf.zzr(zzfozVarZzi, new zzcyz(this), this.zzj);
        return zzfozVarZzi;
    }

    public final p8.p zzf(zzcbk zzcbkVar) {
        zzfoz zzfozVarZzi = this.zzc.zza(zzfpm.NOTIFY_CACHE_HIT, this.zzh.zzb(zzcbkVar)).zzi();
        zzhcf.zzr(zzfozVarZzi, new zzcza(this), this.zzj);
        return zzfozVarZzi;
    }

    public final K0 zzg(Throwable th) {
        return zzfmi.zzb(th, this.zzl);
    }

    public final void zzh(zzfky zzfkyVar) {
        this.zzg = zzfkyVar;
    }

    public final /* synthetic */ zzfky zzi(zzfky zzfkyVar) throws Exception {
        this.zzd.zza(zzfkyVar);
        return zzfkyVar;
    }

    public final /* synthetic */ p8.p zzj(zzfnc zzfncVar, zzcbk zzcbkVar) {
        zzcbkVar.zzi = zzfncVar;
        return this.zzh.zza(zzcbkVar);
    }

    public final /* synthetic */ zzdio zzk() {
        return this.zzf;
    }
}
