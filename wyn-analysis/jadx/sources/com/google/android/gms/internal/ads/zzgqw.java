package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgqw extends zzgre {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgre zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgre zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgrf zzc() {
        return new zzgqx(this.zza, this.zzb, null);
    }
}
