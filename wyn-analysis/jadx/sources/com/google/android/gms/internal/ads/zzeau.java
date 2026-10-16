package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzeau extends zzeay {
    private long zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzeay
    public final zzeay zza(long j8) {
        this.zza = j8;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeay
    public final zzeay zzb(int i5) {
        this.zzb = i5;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeay
    public final zzeaz zzc() {
        if (this.zzc == 3) {
            return new zzeav(this.zza, this.zzb, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
