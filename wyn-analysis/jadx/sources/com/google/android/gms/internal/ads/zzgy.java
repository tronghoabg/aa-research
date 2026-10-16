package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzgy {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze = 0;

    public zzgy(byte[] bArr, int i5, int i10) {
        this.zza = bArr;
        this.zzc = i5;
        this.zzd = i5;
        this.zzb = i10;
        zzk();
    }

    private final int zzi() {
        int i5 = 0;
        while (!zze()) {
            i5++;
        }
        return ((1 << i5) - 1) + (i5 > 0 ? zzf(i5) : 0);
    }

    private final boolean zzj(int i5) {
        int i10 = i5 - 2;
        if (this.zzc > i10 || i5 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i5] == 3 && bArr[i10] == 0 && bArr[i5 + (-1)] == 0;
    }

    private final void zzk() {
        int i5;
        int i10 = this.zzd;
        boolean z2 = false;
        if (i10 >= 0 && (i10 < (i5 = this.zzb) || (i10 == i5 && this.zze == 0))) {
            z2 = true;
        }
        zzgtr.zzi(z2);
    }

    public final void zza() {
        int i5 = this.zze + 1;
        this.zze = i5;
        if (i5 == 8) {
            this.zze = 0;
            int i10 = this.zzd;
            this.zzd = i10 + (true == zzj(i10 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i5) {
        int i10 = this.zzd;
        int i11 = i5 / 8;
        int i12 = i10 + i11;
        this.zzd = i12;
        int i13 = (i5 - (i11 * 8)) + this.zze;
        this.zze = i13;
        if (i13 > 7) {
            this.zzd = i12 + 1;
            this.zze = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.zzd) {
                zzk();
                return;
            } else if (zzj(i10)) {
                this.zzd++;
                i10 += 2;
            }
        }
    }

    public final void zzc() {
        int i5 = this.zze;
        if (i5 > 0) {
            zzb(8 - i5);
        }
    }

    public final boolean zzd(int i5) {
        int i10 = this.zzd;
        int i11 = i5 / 8;
        int i12 = i10 + i11;
        int i13 = (this.zze + i5) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 > this.zzb) {
                break;
            }
            if (zzj(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.zzb;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i5 = this.zza[this.zzd] & (128 >> this.zze);
        zza();
        return i5 != 0;
    }

    public final int zzf(int i5) {
        int i10;
        this.zze += i5;
        int i11 = 0;
        while (true) {
            i10 = this.zze;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.zze = i12;
            byte[] bArr = this.zza;
            int i13 = this.zzd;
            i11 |= (bArr[i13] & ForkServer.ERROR) << i12;
            if (true != zzj(i13 + 1)) {
                i = 1;
            }
            this.zzd = i13 + i;
        }
        byte[] bArr2 = this.zza;
        int i14 = this.zzd;
        int i15 = i11 | ((bArr2[i14] & ForkServer.ERROR) >> (8 - i10));
        int i16 = 32 - i5;
        if (i10 == 8) {
            this.zze = 0;
            this.zzd = i14 + (true != zzj(i14 + 1) ? 1 : 2);
        }
        int i17 = ((-1) >>> i16) & i15;
        zzk();
        return i17;
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int iZzi = zzi();
        int i5 = iZzi % 2;
        return ((iZzi + 1) / 2) * (i5 == 0 ? -1 : 1);
    }
}
