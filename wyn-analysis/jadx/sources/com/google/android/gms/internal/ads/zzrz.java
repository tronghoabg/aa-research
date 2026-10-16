package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzrz {
    public final zzv zza;

    @Deprecated
    public final int zzb = 0;
    public final zzham zzc;
    public final zzbf zzd;
    public final zzxl zze;

    public /* synthetic */ zzrz(zzry zzryVar, byte[] bArr) {
        this.zza = zzryVar.zze();
        this.zzc = zzryVar.zzf();
        this.zzd = zzryVar.zzg();
        this.zze = zzryVar.zzh();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrz)) {
            return false;
        }
        zzrz zzrzVar = (zzrz) obj;
        int i5 = zzrzVar.zzb;
        return this.zza.equals(zzrzVar.zza) && Objects.equals(this.zzc, zzrzVar.zzc) && this.zzd.equals(zzrzVar.zzd) && Objects.equals(this.zze, zzrzVar.zze);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 961;
        zzham zzhamVar = this.zzc;
        int iHashCode2 = this.zzd.hashCode() + ((iHashCode + (zzhamVar == null ? 0 : zzhamVar.hashCode())) * 31);
        zzxl zzxlVar = this.zze;
        return (iHashCode2 * 31) + (zzxlVar != null ? zzxlVar.hashCode() : 0);
    }
}
