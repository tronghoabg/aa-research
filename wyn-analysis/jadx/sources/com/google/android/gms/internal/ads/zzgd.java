package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzgd implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgd(long j8, long j10, long j11) {
        this.zza = j8;
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) obj;
        return this.zza == zzgdVar.zza && this.zzb == zzgdVar.zzb && this.zzc == zzgdVar.zzc;
    }

    public final int hashCode() {
        long j8 = this.zza;
        long j10 = this.zzb;
        int i5 = ((((int) (j8 ^ (j8 >>> 32))) + 527) * 31) + ((int) (j10 ^ (j10 >>> 32)));
        long j11 = this.zzc;
        return (i5 * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        long j8 = this.zza;
        int length = String.valueOf(j8).length();
        long j10 = this.zzb;
        int length2 = String.valueOf(j10).length();
        long j11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j11).length());
        M6.A(sb2, "Mp4Timestamp: creation time=", j8, ", modification time=");
        sb2.append(j10);
        sb2.append(", timescale=");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
