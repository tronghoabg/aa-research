package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzajb implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzajb(long j8, long j10, long j11, long j12, long j13) {
        this.zza = j8;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajb.class == obj.getClass()) {
            zzajb zzajbVar = (zzajb) obj;
            if (this.zza == zzajbVar.zza && this.zzb == zzajbVar.zzb && this.zzc == zzajbVar.zzc && this.zzd == zzajbVar.zzd && this.zze == zzajbVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.zza;
        long j10 = this.zzb;
        int i5 = ((((int) (j8 ^ (j8 >>> 32))) + 527) * 31) + ((int) (j10 ^ (j10 >>> 32)));
        long j11 = this.zzc;
        int i10 = (i5 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        long j12 = this.zzd;
        int i11 = (i10 * 31) + ((int) (j12 ^ (j12 >>> 32)));
        long j13 = this.zze;
        return (i11 * 31) + ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        long j8 = this.zza;
        int length = String.valueOf(j8).length();
        long j10 = this.zzb;
        int length2 = String.valueOf(j10).length();
        long j11 = this.zzc;
        int length3 = String.valueOf(j11).length();
        long j12 = this.zzd;
        int length4 = String.valueOf(j12).length();
        long j13 = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j13).length());
        M6.A(sb2, "Motion photo metadata: photoStartPosition=", j8, ", photoSize=");
        sb2.append(j10);
        M6.A(sb2, ", photoPresentationTimestampUs=", j11, ", videoStartPosition=");
        sb2.append(j12);
        sb2.append(", videoSize=");
        sb2.append(j13);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
