package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
final class zzcyz implements zzhcc {
    final /* synthetic */ zzcze zza;

    public zzcyz(zzcze zzczeVar) {
        Objects.requireNonNull(zzczeVar);
        this.zza = zzczeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zzk().zzm(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzm(true);
    }
}
