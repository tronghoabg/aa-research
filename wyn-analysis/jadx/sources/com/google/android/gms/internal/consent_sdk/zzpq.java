package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
abstract class zzpq extends zzpv {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzpq(int i5) {
        super(null);
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i5, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        throw null;
    }

    public final void zzc(byte b5) {
        byte[] bArr = this.zza;
        int i5 = this.zzc;
        bArr[i5] = b5;
        this.zzc = i5 + 1;
        this.zzd++;
    }

    public final void zzd(int i5) {
        int i10 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) i5;
        bArr[i10 + 1] = (byte) (i5 >> 8);
        bArr[i10 + 2] = (byte) (i5 >> 16);
        bArr[i10 + 3] = (byte) (i5 >> 24);
        this.zzc = i10 + 4;
        this.zzd += 4;
    }

    public final void zze(long j8) {
        int i5 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i5] = (byte) j8;
        bArr[i5 + 1] = (byte) (j8 >> 8);
        bArr[i5 + 2] = (byte) (j8 >> 16);
        bArr[i5 + 3] = (byte) (j8 >> 24);
        bArr[i5 + 4] = (byte) (j8 >> 32);
        bArr[i5 + 5] = (byte) (j8 >> 40);
        bArr[i5 + 6] = (byte) (j8 >> 48);
        bArr[i5 + 7] = (byte) (j8 >> 56);
        this.zzc = i5 + 8;
        this.zzd += 8;
    }

    public final void zzf(int i5) {
        if (!zzpv.zzb) {
            while ((i5 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) (i5 | 128);
                this.zzd++;
                i5 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) i5;
            this.zzd++;
            return;
        }
        long j8 = this.zzc;
        while ((i5 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzsw.zzn(bArr3, i12, (byte) (i5 | 128));
            i5 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        zzsw.zzn(bArr4, i13, (byte) i5);
        this.zzd += (int) (this.zzc - j8);
    }

    public final void zzg(long j8) {
        if (zzpv.zzb) {
            long j10 = this.zzc;
            while (true) {
                int i5 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzsw.zzn(bArr, i10, (byte) i5);
                    this.zzd += (int) (this.zzc - j10);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzsw.zzn(bArr2, i11, (byte) (i5 | 128));
                j8 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i13 = this.zzc;
                    this.zzc = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i14 = this.zzc;
                this.zzc = i14 + 1;
                bArr4[i14] = (byte) (i12 | 128);
                this.zzd++;
                j8 >>>= 7;
            }
        }
    }
}
