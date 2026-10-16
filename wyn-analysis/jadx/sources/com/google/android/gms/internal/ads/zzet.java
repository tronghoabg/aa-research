package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzet {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzet(byte[] bArr, int i5) {
        this.zza = bArr;
        this.zzd = i5;
    }

    private final void zzq() {
        int i5;
        int i10 = this.zzb;
        boolean z2 = false;
        if (i10 >= 0 && (i10 < (i5 = this.zzd) || (i10 == i5 && this.zzc == 0))) {
            z2 = true;
        }
        zzgtr.zzi(z2);
    }

    public final void zza(zzeu zzeuVar) {
        zzb(zzeuVar.zzi(), zzeuVar.zze());
        zzf(zzeuVar.zzg() * 8);
    }

    public final void zzb(byte[] bArr, int i5) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i5;
    }

    public final int zzc() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzd() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zze() {
        zzgtr.zzi(this.zzc == 0);
        return this.zzb;
    }

    public final void zzf(int i5) {
        int i10 = i5 / 8;
        this.zzb = i10;
        this.zzc = i5 - (i10 * 8);
        zzq();
    }

    public final void zzg() {
        int i5 = this.zzc + 1;
        this.zzc = i5;
        if (i5 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzh(int i5) {
        int i10 = i5 / 8;
        int i11 = this.zzb + i10;
        this.zzb = i11;
        int i12 = (i5 - (i10 * 8)) + this.zzc;
        this.zzc = i12;
        if (i12 > 7) {
            this.zzb = i11 + 1;
            this.zzc = i12 - 8;
        }
        zzq();
    }

    public final boolean zzi() {
        int i5 = this.zza[this.zzb] & (128 >> this.zzc);
        zzg();
        return i5 != 0;
    }

    public final int zzj(int i5) {
        int i10;
        if (i5 == 0) {
            return 0;
        }
        this.zzc += i5;
        int i11 = 0;
        while (true) {
            i10 = this.zzc;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.zzc = i12;
            byte[] bArr = this.zza;
            int i13 = this.zzb;
            this.zzb = i13 + 1;
            i11 |= (bArr[i13] & ForkServer.ERROR) << i12;
        }
        byte[] bArr2 = this.zza;
        int i14 = this.zzb;
        int i15 = i11 | ((bArr2[i14] & ForkServer.ERROR) >> (8 - i10));
        int i16 = 32 - i5;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        zzq();
        return i17;
    }

    public final long zzk(int i5) {
        if (i5 <= 32) {
            int iZzj = zzj(i5);
            String str = zzfm.zza;
            return 4294967295L & iZzj;
        }
        int iZzj2 = zzj(i5 - 32);
        int iZzj3 = zzj(32);
        String str2 = zzfm.zza;
        return (4294967295L & iZzj3) | ((iZzj2 & 4294967295L) << 32);
    }

    public final void zzl(byte[] bArr, int i5, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i13 = this.zzb;
            int i14 = i13 + 1;
            this.zzb = i14;
            byte b5 = bArr2[i13];
            int i15 = this.zzc;
            byte b10 = (byte) (b5 << i15);
            bArr[i12] = b10;
            bArr[i12] = (byte) (((bArr2[i14] & ForkServer.ERROR) >> (8 - i15)) | b10);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b11;
        int i17 = this.zzc;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.zza;
            int i18 = this.zzb;
            this.zzb = i18 + 1;
            b11 = (byte) (b11 | ((bArr3[i18] & ForkServer.ERROR) << i17));
            bArr[i11] = b11;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.zzc = i19;
        byte[] bArr4 = this.zza;
        int i20 = this.zzb;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b11);
        if (i19 == 8) {
            this.zzc = 0;
            this.zzb = i20 + 1;
        }
        zzq();
    }

    public final void zzm() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzn(byte[] bArr, int i5, int i10) {
        zzgtr.zzi(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i10);
        this.zzb += i10;
        zzq();
    }

    public final void zzo(int i5) {
        zzgtr.zzi(this.zzc == 0);
        this.zzb += i5;
        zzq();
    }

    public final void zzp(int i5, int i10) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i11 = this.zzc;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.zza;
        int i13 = this.zzb;
        byte b5 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b5;
        int i14 = 14 - iMin;
        int i15 = i5 & 16383;
        bArr[i13] = (byte) (b5 | ((i15 >>> i14) << i12));
        int i16 = i13 + 1;
        while (i14 > 8) {
            i14 -= 8;
            this.zza[i16] = (byte) (i15 >>> i14);
            i16++;
        }
        byte[] bArr2 = this.zza;
        byte b10 = (byte) (bArr2[i16] & ((1 << r0) - 1));
        bArr2[i16] = b10;
        bArr2[i16] = (byte) (((i15 & ((1 << i14) - 1)) << (8 - i14)) | b10);
        zzh(14);
        zzq();
    }

    public zzet() {
        this.zza = zzfm.zzb;
    }
}
