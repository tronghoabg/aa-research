package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzetu implements zzetz {
    final /* synthetic */ zzetv zza;

    public zzetu(zzetv zzetvVar) {
        Objects.requireNonNull(zzetvVar);
        this.zza = zzetvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcya zzcyaVar = (zzcya) obj;
        zzetv zzetvVar = this.zza;
        synchronized (zzetvVar) {
            zzetvVar.zze(zzcyaVar.zzn());
            zzcyaVar.zzj();
        }
    }
}
