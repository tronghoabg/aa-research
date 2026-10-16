package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzigl implements zzifw {
    private final zzifz zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzigl(zzifz zzifzVar, String str, Object[] objArr) {
        this.zza = zzifzVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i5 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.zzd = i5 | (cCharAt2 << i11);
                return;
            } else {
                i5 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifw
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifw
    public final zzifz zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifw
    public final int zzc() {
        int i5 = this.zzd;
        if ((i5 & 1) != 0) {
            return 1;
        }
        return (i5 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
