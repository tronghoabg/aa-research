package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;

/* loaded from: classes3.dex */
final class zzeav extends zzeaz {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzeav(long j8, int i5, byte[] bArr) {
        this.zza = j8;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeaz) {
            zzeaz zzeazVar = (zzeaz) obj;
            if (this.zza == zzeazVar.zza() && this.zzb == zzeazVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.zza;
        return ((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j8 = this.zza;
        int length = String.valueOf(j8).length();
        int i5 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i5).length() + 1);
        M6.A(sb2, "OnDeviceStorageKey{id=", j8, ", eventType=");
        return AbstractC0279p0.j(i5, "}", sb2);
    }

    @Override // com.google.android.gms.internal.ads.zzeaz
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeaz
    public final int zzb() {
        return this.zzb;
    }
}
