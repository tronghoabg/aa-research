package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfxv extends zzfxs {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfxv(String str, boolean z2, boolean z10, boolean z11, long j8, boolean z12, long j10, byte[] bArr) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = j8;
        this.zze = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxs) {
            zzfxs zzfxsVar = (zzfxs) obj;
            if (this.zza.equals(zzfxsVar.zza()) && this.zzb == zzfxsVar.zzb() && this.zzc == zzfxsVar.zzc()) {
                zzfxsVar.zzd();
                if (this.zzd == zzfxsVar.zze()) {
                    zzfxsVar.zzf();
                    if (this.zze == zzfxsVar.zzg()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        boolean z2 = this.zzb;
        int length = String.valueOf(z2).length();
        boolean z10 = this.zzc;
        int length2 = String.valueOf(z10).length();
        long j8 = this.zzd;
        int length3 = String.valueOf(j8).length();
        long j10 = this.zze;
        int length4 = String.valueOf(j10).length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z2);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z10);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j8);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final boolean zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final long zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final long zzg() {
        return this.zze;
    }
}
