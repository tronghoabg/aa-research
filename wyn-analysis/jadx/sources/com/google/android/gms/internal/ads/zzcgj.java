package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgj implements zzhcc {
    final /* synthetic */ zzcgh zza;
    final /* synthetic */ zzcgf zzb;

    public zzcgj(zzcgk zzcgkVar, zzcgh zzcghVar, zzcgf zzcgfVar) {
        this.zza = zzcghVar;
        this.zzb = zzcgfVar;
        Objects.requireNonNull(zzcgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
