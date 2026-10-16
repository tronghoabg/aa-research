package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgi implements zzhcc {
    final /* synthetic */ zzcgk zza;

    public zzcgi(zzcgk zzcgkVar) {
        Objects.requireNonNull(zzcgkVar);
        this.zza = zzcgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
