package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzerw implements C6.e {
    final /* synthetic */ zzdmi zza;

    public zzerw(zzerx zzerxVar, zzdmi zzdmiVar) {
        this.zza = zzdmiVar;
        Objects.requireNonNull(zzerxVar);
    }

    @Override // C6.e
    public final void zza(View view) {
    }

    @Override // C6.e
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // C6.e
    public final void zzc() {
        zzdmi zzdmiVar = this.zza;
        zzdmiVar.zzd().zza();
        zzdmiVar.zze().zza();
    }
}
