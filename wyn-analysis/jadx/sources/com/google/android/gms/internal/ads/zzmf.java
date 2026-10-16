package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzmf {
    public final zzxl zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzmf(zzxl zzxlVar, long j8, long j10, long j11, long j12, boolean z2, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        zzgtr.zza(!z12 || z10);
        if (z11 && !z10) {
            z13 = false;
        }
        zzgtr.zza(z13);
        this.zza = zzxlVar;
        this.zzb = j8;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = false;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmf.class == obj.getClass()) {
            zzmf zzmfVar = (zzmf) obj;
            if (this.zzb == zzmfVar.zzb && this.zzd == zzmfVar.zzd && this.zze == zzmfVar.zze && this.zzg == zzmfVar.zzg && this.zzh == zzmfVar.zzh && this.zzi == zzmfVar.zzi && Objects.equals(this.zza, zzmfVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j8 = this.zze;
        return (((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j8)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzmf zza(long j8, long j10) {
        return (j8 == this.zzb && j10 == this.zzc) ? this : new zzmf(this.zza, j8, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzmf zzb(long j8) {
        return j8 == this.zzd ? this : new zzmf(this.zza, this.zzb, this.zzc, j8, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
