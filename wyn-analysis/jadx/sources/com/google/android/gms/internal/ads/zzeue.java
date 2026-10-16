package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeue implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzdok zzd;
    final /* synthetic */ zzeuh zze;

    public zzeue(zzeuh zzeuhVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzdok zzdokVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzdokVar;
        Objects.requireNonNull(zzeuhVar);
        this.zze = zzeuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgR)).booleanValue()) {
            G6.L.l("Native ad failed to load", th);
        }
        zzdok zzdokVar = this.zzd;
        final K0 k0Zzg = zzdokVar.zza().zzg(th);
        zzdokVar.zzb().zzdJ(k0Zzg);
        zzeuh zzeuhVar = this.zze;
        zzeuhVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdJ(k0Zzg);
            }
        });
        zzfmd.zza(k0Zzg.f2338a, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
            zzfqt zzfqtVarZzg = zzeuhVar.zzg();
            zzfqg zzfqgVar = this.zzc;
            zzfqgVar.zzh(k0Zzg);
            zzfqgVar.zzj(th);
            zzfqgVar.zzd(false);
            zzfqtVarZzg.zzb(zzfqgVar.zzm());
            return;
        }
        zzfqqVar.zzf(k0Zzg);
        zzfqg zzfqgVar2 = this.zzc;
        zzfqgVar2.zzj(th);
        zzfqgVar2.zzd(false);
        zzfqqVar.zza(zzfqgVar2);
        zzfqqVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzeuh zzeuhVar = this.zze;
        zzcya zzcyaVar = (zzcya) obj;
        synchronized (zzeuhVar) {
            if (zzcyaVar != null) {
                try {
                    zzcyaVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcyaVar.zzq().zza(zzeuhVar.zzf().zzc());
            this.zza.zzb(zzcyaVar);
            zzeuhVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeud
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                zzfqt zzfqtVarZzg = zzeuhVar.zzg();
                zzfqg zzfqgVar = this.zzc;
                zzfqgVar.zzg(zzcyaVar.zzr().zzb);
                zzfqgVar.zzi(zzcyaVar.zzn().zze());
                zzfqgVar.zzd(true);
                zzfqtVarZzg.zzb(zzfqgVar.zzm());
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
