package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfsk implements zzhcc {
    final /* synthetic */ zzfqg zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzdfo zzc;
    final /* synthetic */ zzfsm zzd;

    public zzfsk(zzfsm zzfsmVar, zzfqg zzfqgVar, zzfqq zzfqqVar, zzdfo zzdfoVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfqqVar;
        this.zzc = zzdfoVar;
        Objects.requireNonNull(zzfsmVar);
        this.zzd = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqg zzfqgVar = this.zza;
        if (zzfqgVar == null) {
            return;
        }
        zzfqgVar.zzd(false);
        zzfqq zzfqqVar = this.zzb;
        if (zzfqqVar != null) {
            zzfqqVar.zza(zzfqgVar);
            zzfqqVar.zzh();
        } else {
            zzfsm zzfsmVar = this.zzd;
            zzfsmVar.zze().zzb(zzfqgVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsk.zzb(java.lang.Object):void");
    }
}
