package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzmc {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzmc(zzmb zzmbVar, byte[] bArr) {
        this.zza = zzmbVar.zze();
        this.zzb = zzmbVar.zzf();
        this.zzc = zzmbVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmc)) {
            return false;
        }
        zzmc zzmcVar = (zzmc) obj;
        return this.zza == zzmcVar.zza && this.zzb == zzmcVar.zzb && this.zzc == zzmcVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzmb zza() {
        return new zzmb(this, null);
    }
}
