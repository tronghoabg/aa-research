package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zziem implements zzied {
    final int zza;
    final zzihq zzb;
    final boolean zzc;
    final boolean zzd;

    public zziem(zzieu zzieuVar, int i5, zzihq zzihqVar, boolean z2, boolean z10) {
        this.zza = i5;
        this.zzb = zzihqVar;
        this.zzc = z2;
        this.zzd = z10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zziem) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final zzihq zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final zzihr zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final boolean zze() {
        return this.zzd;
    }
}
