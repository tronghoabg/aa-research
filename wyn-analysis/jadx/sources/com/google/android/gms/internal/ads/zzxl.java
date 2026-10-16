package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzxl {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzxl(Object obj, int i5, int i10, long j8, int i11) {
        this.zza = obj;
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = j8;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxl)) {
            return false;
        }
        zzxl zzxlVar = (zzxl) obj;
        return this.zza.equals(zzxlVar.zza) && this.zzb == zzxlVar.zzb && this.zzc == zzxlVar.zzc && this.zzd == zzxlVar.zzd && this.zze == zzxlVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzxl zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzxl(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzxl(Object obj, int i5, int i10, long j8) {
        this(obj, i5, i10, j8, -1);
    }

    public zzxl(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public zzxl(Object obj, long j8, int i5) {
        this(obj, -1, -1, j8, i5);
    }
}
