package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzbpb implements zzhcc {
    final /* synthetic */ zzclb zza;

    public zzbpb(zzclb zzclbVar) {
        this.zza = zzclbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        C6.n.f1857D.f1868h.zzh(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzclb zzclbVar = this.zza;
        new G6.B(zzclbVar.getContext(), zzclbVar.zzs().f4927a, str, zzclbVar.zzC() != null ? zzclbVar.zzC().zzax : null).zzb();
    }
}
