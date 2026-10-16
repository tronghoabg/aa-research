package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zziff {
    protected volatile zzifz zza;
    private final zzifz zzb;
    private final zzidz zzc;
    private volatile zzidl zzd;
    private volatile boolean zze;

    public zziff(zzifz zzifzVar) {
        if (zzifzVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.zza = zzifzVar;
        this.zzb = zzifzVar.zzbw();
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        this.zzc = zzidz.zza;
        this.zzd = null;
        this.zze = false;
    }

    public final boolean equals(Object obj) {
        return zza().equals(obj);
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza().toString();
    }

    public final zzifz zza() {
        try {
            if (this.zza == null) {
                synchronized (this) {
                    if (this.zze) {
                        throw new zzifh("Repeat access to corrupted lazy field");
                    }
                    try {
                        this.zza = (zzifz) this.zzb.zzbd().zzb(this.zzd, this.zzc);
                    } catch (zzifh e7) {
                        this.zze = true;
                        throw e7;
                    }
                }
            }
            return this.zza;
        } catch (zzifh unused) {
            zzidz.zza();
            return this.zzb;
        }
    }

    public final int zzb() {
        return this.zzd != null ? this.zzd.zzb() : this.zza.zzbr();
    }

    public final zzidl zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            try {
                if (this.zzd != null) {
                    return this.zzd;
                }
                this.zzd = this.zza.zzaM();
                return this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
