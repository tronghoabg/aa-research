package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzffr implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzffs zzd;
    final /* synthetic */ zzffv zze;

    public zzffr(zzffv zzffvVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzffs zzffsVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzffsVar;
        Objects.requireNonNull(zzffvVar);
        this.zze = zzffvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        zzbio zzbioVar = zzbix.zzgR;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            G6.L.l("App open ad failed to load", th);
        }
        zzffv zzffvVar = this.zze;
        zzcvc zzcvcVar = (zzcvc) zzffvVar.zzj().zzd();
        final K0 k0Zzb = zzcvcVar == null ? zzfmi.zzb(th, null) : zzcvcVar.zza().zzg(th);
        synchronized (zzffvVar) {
            try {
                zzffvVar.zzl(null);
                if (zzcvcVar != null) {
                    zzcvcVar.zze().zzdJ(k0Zzb);
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzjB)).booleanValue()) {
                        zzffvVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze.zzi().zzdJ(k0Zzb);
                            }
                        });
                    }
                } else {
                    zzffvVar.zzi().zzdJ(k0Zzb);
                    ((zzcvc) zzffvVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfmd.zza(k0Zzb.f2338a, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzk = zzffvVar.zzk();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzh(k0Zzb);
                    zzfqgVar.zzj(th);
                    zzfqgVar.zzd(false);
                    zzfqtVarZzk.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zzf(k0Zzb);
                    zzfqg zzfqgVar2 = this.zzc;
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
    public final void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzffv zzffvVar = this.zze;
        zzcya zzcyaVar = (zzcya) obj;
        synchronized (zzffvVar) {
            if (zzcyaVar != null) {
                try {
                    zzcyaVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzffvVar.zzl(null);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjB)).booleanValue()) {
                zzcyaVar.zzq().zzc(zzffvVar.zzi());
            }
            this.zza.zzb(zzcyaVar);
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                zzfqt zzfqtVarZzk = zzffvVar.zzk();
                zzfqg zzfqgVar = this.zzc;
                zzfqgVar.zzg(zzcyaVar.zzr().zzb);
                zzfqgVar.zzi(zzcyaVar.zzn().zze());
                zzfqgVar.zzd(true);
                zzfqtVarZzk.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zze(zzcyaVar.zzr().zzb);
                zzfqqVar.zzg(zzcyaVar.zzn().zze());
                zzfqg zzfqgVar2 = this.zzc;
                zzfqgVar2.zzd(true);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }
}
