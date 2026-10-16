package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaqe {
    private final zzahm zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaqe(zzahm zzahmVar) {
        this.zza = zzahmVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    public final void zzb(int i5, long j8) {
        boolean z2;
        this.zze = i5;
        this.zzd = false;
        if (i5 == 182) {
            z2 = true;
        } else if (i5 == 179) {
            i5 = 179;
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = i5 == 182;
        this.zzf = 0;
        this.zzh = j8;
    }

    public final void zzc(byte[] bArr, int i5, int i10) {
        if (this.zzc) {
            int i11 = this.zzf;
            int i12 = (i5 + 1) - i11;
            if (i12 >= i10) {
                this.zzf = (i10 - i5) + i11;
            } else {
                this.zzd = ((bArr[i12] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzd(long j8, int i5, boolean z2) {
        zzgtr.zzi(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z2 && this.zzb) {
            this.zza.zze(this.zzh, this.zzd ? 1 : 0, (int) (j8 - this.zzg), i5, null);
        }
        if (this.zze != 179) {
            this.zzg = j8;
        }
    }
}
