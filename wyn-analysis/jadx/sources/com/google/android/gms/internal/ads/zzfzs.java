package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfzs extends zzfzy {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfzy zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzy zzb(boolean z2) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzz zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfzt(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb2.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzy zzd(int i5) {
        this.zzc = i5;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzy zze(int i5) {
        this.zzd = 1;
        return this;
    }
}
