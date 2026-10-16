package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgrc extends zzgse {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgse
    public final zzgse zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final zzgse zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final zzgsf zzc() {
        return new zzgrd(this.zza, this.zzb, null);
    }
}
