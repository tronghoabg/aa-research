package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfqm implements zzhcc {
    final /* synthetic */ zzfqq zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ boolean zzc;

    public zzfqm(zzfqq zzfqqVar, zzfqg zzfqgVar, boolean z2) {
        this.zza = zzfqqVar;
        this.zzb = zzfqgVar;
        this.zzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqg zzfqgVar = this.zzb;
        if (zzfqgVar.zzb()) {
            zzfqq zzfqqVar = this.zza;
            zzfqgVar.zzj(th);
            zzfqgVar.zzd(false);
            zzfqqVar.zza(zzfqgVar);
            if (this.zzc) {
                zzfqqVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        zzfqg zzfqgVar = this.zzb;
        zzfqgVar.zzd(true);
        zzfqq zzfqqVar = this.zza;
        zzfqqVar.zza(zzfqgVar);
        if (this.zzc) {
            zzfqqVar.zzh();
        }
    }
}
