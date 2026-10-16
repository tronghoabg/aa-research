package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzajd implements zzao {
    public final long zza;

    public zzajd(long j8) {
        this.zza = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzajd.class == obj.getClass() && this.zza == ((zzajd) obj).zza;
    }

    public final int hashCode() {
        long j8 = this.zza;
        return ((int) (j8 ^ (j8 >>> 32))) + 527;
    }

    public final String toString() {
        long j8 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j8);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
