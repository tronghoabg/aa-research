package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzctj implements zzhcc {
    final /* synthetic */ zzfsm zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ H6.q zzc;
    final /* synthetic */ zzctq zzd;

    public zzctj(zzctq zzctqVar, zzfsm zzfsmVar, String str, H6.q qVar) {
        this.zza = zzfsmVar;
        this.zzb = str;
        this.zzc = qVar;
        Objects.requireNonNull(zzctqVar);
        this.zzd = zzctqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(final Throwable th) {
        final zzfsm zzfsmVar = this.zza;
        final String str = this.zzb;
        final H6.q qVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlV)).booleanValue();
                Throwable th2 = th;
                zzctj zzctjVar = this.zza;
                if (zBooleanValue) {
                    zzctq zzctqVar = zzctjVar.zzd;
                    zzcah zzcahVarZzc = zzcaf.zzc(zzctqVar.zzi());
                    zzctqVar.zzb = zzcahVarZzc;
                    zzcahVarZzc.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzctq zzctqVar2 = zzctjVar.zzd;
                    zzcah zzcahVarZza = zzcaf.zza(zzctqVar2.zzi());
                    zzctqVar2.zza = zzcahVarZza;
                    zzcahVarZza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                H6.q qVar2 = qVar;
                zzfsmVar.zzb(str, qVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfsm zzfsmVar = this.zza;
        final String str = (String) obj;
        final H6.q qVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsmVar.zzb(str, qVar, null, null);
            }
        });
    }
}
