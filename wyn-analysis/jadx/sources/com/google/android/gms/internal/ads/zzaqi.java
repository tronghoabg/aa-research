package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaqi {
    private final zzahm zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaqi(zzahm zzahmVar) {
        this.zza = zzahmVar;
    }

    private final void zze(int i5) {
        long j8 = this.zzl;
        if (j8 != -9223372036854775807L) {
            long j10 = this.zzb;
            long j11 = this.zzk;
            if (j10 == j11) {
                return;
            }
            int i10 = (int) (j10 - j11);
            this.zza.zze(j8, this.zzm ? 1 : 0, i10, i5, null);
        }
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j8, int i5, int i10, long j10, boolean z2) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j10;
        this.zzd = 0;
        this.zzb = j8;
        if (i10 >= 32 && i10 != 40) {
            if (this.zzi && !this.zzj) {
                if (z2) {
                    zze(i5);
                }
                this.zzi = false;
            }
            if (i10 <= 35 || i10 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        this.zzc = z10;
        this.zzf = z10 || i10 <= 9;
    }

    public final void zzc(byte[] bArr, int i5, int i10) {
        if (this.zzf) {
            int i11 = this.zzd;
            int i12 = (i5 + 2) - i11;
            if (i12 >= i10) {
                this.zzd = (i10 - i5) + i11;
            } else {
                this.zzg = (bArr[i12] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j8, int i5, boolean z2) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z2 && this.zzi) {
                zze(i5 + ((int) (j8 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
