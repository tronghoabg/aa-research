package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzalt implements zzala {
    private final zzalc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzalt(zzalc zzalcVar, String str, Object[] objArr) {
        this.zza = zzalcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i5 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.zzd = i5 | (cCharAt2 << i10);
                return;
            } else {
                i5 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final zzalc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final zzalo zzb() {
        int i5 = this.zzd;
        return (i5 & 1) != 0 ? zzalo.PROTO2 : (i5 & 4) == 4 ? zzalo.EDITIONS : zzalo.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
