package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzfjw implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzfjz zzd;
    final /* synthetic */ zzfka zze;

    public zzfjw(zzfka zzfkaVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzfjz zzfjzVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfjzVar;
        Objects.requireNonNull(zzfkaVar);
        this.zze = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgR)).booleanValue()) {
            G6.L.l("Rewarded ad failed to load", th);
        }
        zzfka zzfkaVar = this.zze;
        zzdvz zzdvzVar = (zzdvz) zzfkaVar.zzh().zzd();
        final K0 k0Zzb = zzdvzVar == null ? zzfmi.zzb(th, null) : zzdvzVar.zza().zzg(th);
        synchronized (zzfkaVar) {
            try {
                if (zzdvzVar != null) {
                    zzdvzVar.zze().zzdJ(k0Zzb);
                    zzfkaVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdJ(k0Zzb);
                        }
                    });
                } else {
                    zzfkaVar.zzg().zzdJ(k0Zzb);
                    zzfkaVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfmd.zza(k0Zzb.f2338a, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzi = zzfkaVar.zzi();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzh(k0Zzb);
                    zzfqgVar.zzj(th);
                    zzfqgVar.zzd(false);
                    zzfqtVarZzi.zzb(zzfqgVar.zzm());
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzfka zzfkaVar = this.zze;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkaVar) {
            if (zzdvuVar != null) {
                try {
                    zzdvuVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdvuVar.zzq().zzd(zzfkaVar.zzg());
            this.zza.zzb(zzdvuVar);
            Executor executorZzf = zzfkaVar.zzf();
            final zzfjr zzfjrVarZzg = zzfkaVar.zzg();
            Objects.requireNonNull(zzfjrVarZzg);
            executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfju
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfjrVarZzg.zzg();
                }
            });
            zzfkaVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                zzfqt zzfqtVarZzi = zzfkaVar.zzi();
                zzfqg zzfqgVar = this.zzc;
                zzfqgVar.zzg(zzdvuVar.zzr().zzb);
                zzfqgVar.zzi(zzdvuVar.zzn().zze());
                zzfqgVar.zzd(true);
                zzfqtVarZzi.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zze(zzdvuVar.zzr().zzb);
                zzfqqVar.zzg(zzdvuVar.zzn().zze());
                zzfqg zzfqgVar2 = this.zzc;
                zzfqgVar2.zzd(true);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }
}
