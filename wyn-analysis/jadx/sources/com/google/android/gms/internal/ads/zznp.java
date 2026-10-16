package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zznp {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzxl zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;
    public final zzxl zzh;
    public final long zzi;
    public final long zzj;

    public zznp(long j8, zzbf zzbfVar, int i5, zzxl zzxlVar, long j10, zzbf zzbfVar2, int i10, zzxl zzxlVar2, long j11, long j12) {
        this.zza = j8;
        this.zzb = zzbfVar;
        this.zzc = i5;
        this.zzd = zzxlVar;
        this.zze = j10;
        this.zzf = zzbfVar2;
        this.zzg = i10;
        this.zzh = zzxlVar2;
        this.zzi = j11;
        this.zzj = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznp.class == obj.getClass()) {
            zznp zznpVar = (zznp) obj;
            if (this.zza == zznpVar.zza && this.zzc == zznpVar.zzc && this.zze == zznpVar.zze && this.zzg == zznpVar.zzg && this.zzi == zznpVar.zzi && this.zzj == zznpVar.zzj && Objects.equals(this.zzb, zznpVar.zzb) && Objects.equals(this.zzd, zznpVar.zzd) && Objects.equals(this.zzf, zznpVar.zzf) && Objects.equals(this.zzh, zznpVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
