package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgra extends zzgsb {
    private int zza;
    private String zzb;
    private int zzc;
    private Boolean zzd;
    private byte zze;

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zza(int i5) {
        this.zza = i5;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zzc(int i5) {
        this.zzc = i5;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zzd(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsc zze() {
        if (this.zze == 3) {
            return new zzgrb(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.zze & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
