package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzahn {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzagb zzagbVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzagbVar.zzi(bArr, 0, 10);
        zzagbVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzahm zzahmVar, long j8, int i5, int i10, int i11, zzahl zzahlVar) {
        zzgtr.zzj(this.zzg <= i10 + i11, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i12 = this.zzc;
            int i13 = i12 + 1;
            this.zzc = i13;
            if (i12 == 0) {
                this.zzd = j8;
                this.zze = i5;
                this.zzf = 0;
            }
            this.zzf += i10;
            this.zzg = i11;
            if (i13 >= 16) {
                zzd(zzahmVar, zzahlVar);
            }
        }
    }

    public final void zzd(zzahm zzahmVar, zzahl zzahlVar) {
        if (this.zzc > 0) {
            zzahmVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahlVar);
            this.zzc = 0;
        }
    }
}
