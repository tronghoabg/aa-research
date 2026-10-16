package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzadc implements zzaeu {
    final /* synthetic */ zzvm zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzadg zzd;

    public zzadc(zzadg zzadgVar, zzvm zzvmVar, int i5, long j8) {
        this.zza = zzvmVar;
        this.zzb = i5;
        this.zzc = j8;
        Objects.requireNonNull(zzadgVar);
        this.zzd = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zza(long j8) {
        this.zzd.zzaD(this.zza, this.zzb, this.zzc, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        this.zzd.zzaA(this.zza, this.zzb, this.zzc);
    }
}
