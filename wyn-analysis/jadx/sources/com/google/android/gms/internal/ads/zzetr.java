package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzetr implements zzetz {
    final /* synthetic */ zzets zza;

    public zzetr(zzets zzetsVar) {
        Objects.requireNonNull(zzetsVar);
        this.zza = zzetsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzets zzetsVar = this.zza;
        synchronized (zzetsVar) {
            zzetsVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzets zzetsVar = this.zza;
        zzdmh zzdmhVar = (zzdmh) obj;
        synchronized (zzetsVar) {
            zzetsVar.zzN(zzdmhVar);
            zzetsVar.zzM().zzj();
        }
    }
}
