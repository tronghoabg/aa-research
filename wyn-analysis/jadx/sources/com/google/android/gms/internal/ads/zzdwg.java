package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzdwg implements zzbyo {
    final /* synthetic */ zzdwp zza;

    public zzdwg(zzdwp zzdwpVar) {
        Objects.requireNonNull(zzdwpVar);
        this.zza = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zza(int i5, int i10, int i11, int i12) {
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzb() {
        this.zza.zzg().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzc() {
        this.zza.zzh().zza();
    }
}
