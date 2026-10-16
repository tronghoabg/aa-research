package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfio implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzdno zzd;
    final /* synthetic */ zzfiq zze;

    public zzfio(zzfiq zzfiqVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzdno zzdnoVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzdnoVar;
        Objects.requireNonNull(zzfiqVar);
        this.zze = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        zzbio zzbioVar = zzbix.zzgR;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            G6.L.l("Interstitial ad failed to load", th);
        }
        zzdno zzdnoVar = this.zzd;
        final K0 k0Zzg = zzdnoVar.zzb().zzg(th);
        zzfiq zzfiqVar = this.zze;
        synchronized (zzfiqVar) {
            try {
                zzfiqVar.zzi(null);
                zzdnoVar.zza().zzdJ(k0Zzg);
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzjC)).booleanValue()) {
                    zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfil
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzdJ(k0Zzg);
                        }
                    });
                    zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfim
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdJ(k0Zzg);
                        }
                    });
                }
                zzfmd.zza(k0Zzg.f2338a, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzh = zzfiqVar.zzh();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzh(k0Zzg);
                    zzfqgVar.zzj(th);
                    zzfqgVar.zzd(false);
                    zzfqtVarZzh.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zzf(k0Zzg);
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
        zzfiq zzfiqVar = this.zze;
        zzdmh zzdmhVar = (zzdmh) obj;
        synchronized (zzfiqVar) {
            if (zzdmhVar != null) {
                try {
                    zzdmhVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfiqVar.zzi(null);
            zzbio zzbioVar = zzbix.zzjC;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                zzdgp zzdgpVarZzq = zzdmhVar.zzq();
                zzdgpVarZzq.zza(zzfiqVar.zzf());
                zzdgpVarZzq.zzd(zzfiqVar.zzg());
            }
            this.zza.zzb(zzdmhVar);
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfin
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzg();
                    }
                });
                zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfik
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                zzfqt zzfqtVarZzh = zzfiqVar.zzh();
                zzfqg zzfqgVar = this.zzc;
                zzfqgVar.zzg(zzdmhVar.zzr().zzb);
                zzfqgVar.zzi(zzdmhVar.zzn().zze());
                zzfqgVar.zzd(true);
                zzfqtVarZzh.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zze(zzdmhVar.zzr().zzb);
                zzfqqVar.zzg(zzdmhVar.zzn().zze());
                zzfqg zzfqgVar2 = this.zzc;
                zzfqgVar2.zzd(true);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }
}
