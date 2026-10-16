package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfgw implements zzhcc {
    final /* synthetic */ zzfqq zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzcwx zzc;
    final /* synthetic */ zzfha zzd;

    public zzfgw(zzfha zzfhaVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzcwx zzcwxVar) {
        this.zza = zzfqqVar;
        this.zzb = zzfqgVar;
        this.zzc = zzcwxVar;
        Objects.requireNonNull(zzfhaVar);
        this.zzd = zzfhaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgR)).booleanValue()) {
            G6.L.l("Banner ad failed to load", th);
        }
        zzfha zzfhaVar = this.zzd;
        synchronized (zzfhaVar) {
            try {
                zzcwx zzcwxVar = this.zzc;
                K0 k0Zzg = zzcwxVar.zzc().zzg(th);
                zzfhaVar.zzs(k0Zzg);
                zzcwxVar.zzb().zzdJ(k0Zzg);
                zzfmd.zza(k0Zzg.f2338a, th, "BannerAdLoader.onFailure");
                if (zzfhaVar.zzr()) {
                    zzfhaVar.zzn();
                    zzfhaVar.zzo().zzd(zzfhaVar.zzq().zzc());
                }
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zza) == null) {
                    zzfqt zzfqtVarZzp = zzfhaVar.zzp();
                    zzfqg zzfqgVar = this.zzb;
                    zzfqgVar.zzh(k0Zzg);
                    zzfqgVar.zzj(th);
                    zzfqgVar.zzd(false);
                    zzfqtVarZzp.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zzf(k0Zzg);
                    zzfqg zzfqgVar2 = this.zzb;
                    zzfqgVar2.zzj(th);
                    zzfqgVar2.zzd(false);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzfha zzfhaVar = this.zzd;
        zzcvs zzcvsVar = (zzcvs) obj;
        synchronized (zzfhaVar) {
            if (zzcvsVar != null) {
                try {
                    zzcvsVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfhaVar.zzr()) {
                zzfhaVar.zzc();
            }
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zza) == null) {
                zzfqt zzfqtVarZzp = zzfhaVar.zzp();
                zzfqg zzfqgVar = this.zzb;
                zzfqgVar.zzg(zzcvsVar.zzr().zzb);
                zzfqgVar.zzi(zzcvsVar.zzn().zze());
                zzfqgVar.zzd(true);
                zzfqtVarZzp.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zze(zzcvsVar.zzr().zzb);
                zzfqqVar.zzg(zzcvsVar.zzn().zze());
                zzfqg zzfqgVar2 = this.zzb;
                zzfqgVar2.zzd(true);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }
}
