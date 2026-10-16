package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzejl {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final synchronized void zza(long j8) {
        synchronized (this.zzf) {
            this.zza = j8;
        }
    }

    public final synchronized long zzb() {
        long j8;
        synchronized (this.zzf) {
            j8 = this.zza;
        }
        return j8;
    }

    public final void zzc(int i5) {
        synchronized (this.zzg) {
            this.zzb = i5;
        }
    }

    public final int zzd() {
        int i5;
        synchronized (this.zzg) {
            i5 = this.zzb;
        }
        return i5;
    }

    public final void zze(long j8) {
        synchronized (this.zzh) {
            this.zzc = j8;
        }
    }

    public final long zzf() {
        long j8;
        synchronized (this.zzh) {
            j8 = this.zzc;
        }
        return j8;
    }

    public final synchronized void zzg(long j8) {
        synchronized (this.zzi) {
            this.zzd = j8;
        }
    }

    public final synchronized long zzh() {
        long j8;
        synchronized (this.zzi) {
            j8 = this.zzd;
        }
        return j8;
    }

    public final synchronized void zzi(long j8) {
        synchronized (this.zzj) {
            this.zze = j8;
        }
    }

    public final synchronized long zzj() {
        long j8;
        synchronized (this.zzj) {
            j8 = this.zze;
        }
        return j8;
    }
}
