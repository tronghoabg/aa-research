package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbtx implements zzcgf {
    final /* synthetic */ zzbtv zza;

    public zzbtx(zzbua zzbuaVar, zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        G6.L.k("Rejecting reference for JS Engine.");
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziL)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
