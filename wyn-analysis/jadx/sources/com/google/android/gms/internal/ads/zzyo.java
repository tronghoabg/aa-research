package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzyo implements zzzd {
    final /* synthetic */ zzyr zza;
    private final int zzb;

    public zzyo(zzyr zzyrVar, int i5) {
        Objects.requireNonNull(zzyrVar);
        this.zza = zzyrVar;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zza() {
        return this.zza.zzh(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() throws IOException {
        this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzc(zzly zzlyVar, zzix zzixVar, int i5) {
        return this.zza.zzk(this.zzb, zzlyVar, zzixVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzd(long j8) {
        return this.zza.zzp(this.zzb, j8);
    }

    public final /* synthetic */ int zze() {
        return this.zzb;
    }
}
