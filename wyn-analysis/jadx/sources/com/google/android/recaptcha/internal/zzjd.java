package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzjd extends zzjg {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjd(byte[] bArr, int i5, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzb(byte b5) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr[i5] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    public final void zzc(byte[] bArr, int i5, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i10);
            this.zzd += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzd(int i5, boolean z2) throws IOException {
        zzq(i5 << 3);
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zze(int i5, zziv zzivVar) throws IOException {
        zzq((i5 << 3) | 2);
        zzq(zzivVar.zzd());
        zzivVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzf(int i5, int i10) throws IOException {
        zzq((i5 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzg(int i5) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (i5 & 255);
            int i12 = i10 + 2;
            this.zzd = i12;
            bArr[i11] = (byte) ((i5 >> 8) & 255);
            int i13 = i10 + 3;
            this.zzd = i13;
            bArr[i12] = (byte) ((i5 >> 16) & 255);
            this.zzd = i10 + 4;
            bArr[i13] = (byte) ((i5 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzh(int i5, long j8) throws IOException {
        zzq((i5 << 3) | 1);
        zzi(j8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzi(long j8) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            int i10 = i5 + 1;
            this.zzd = i10;
            bArr[i5] = (byte) (((int) j8) & 255);
            int i11 = i5 + 2;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j8 >> 8)) & 255);
            int i12 = i5 + 3;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j8 >> 16)) & 255);
            int i13 = i5 + 4;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j8 >> 24)) & 255);
            int i14 = i5 + 5;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j8 >> 32)) & 255);
            int i15 = i5 + 6;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j8 >> 40)) & 255);
            int i16 = i5 + 7;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j8 >> 48)) & 255);
            this.zzd = i5 + 8;
            bArr[i16] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzj(int i5, int i10) throws IOException {
        zzq(i5 << 3);
        zzk(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzk(int i5) throws IOException {
        if (i5 >= 0) {
            zzq(i5);
        } else {
            zzs(i5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzl(byte[] bArr, int i5, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzm(int i5, String str) throws IOException {
        zzq((i5 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i5 = this.zzd;
        try {
            int iZzx = zzjg.zzx(str.length() * 3);
            int iZzx2 = zzjg.zzx(str.length());
            if (iZzx2 != iZzx) {
                zzq(zznl.zzc(str));
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = zznl.zzb(str, bArr, i10, this.zzc - i10);
                return;
            }
            int i11 = i5 + iZzx2;
            this.zzd = i11;
            int iZzb = zznl.zzb(str, this.zzb, i11, this.zzc - i11);
            this.zzd = i5;
            zzq((iZzb - i5) - iZzx2);
            this.zzd = iZzb;
        } catch (zznk e7) {
            this.zzd = i5;
            zzB(str, e7);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzo(int i5, int i10) throws IOException {
        zzq((i5 << 3) | i10);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzp(int i5, int i10) throws IOException {
        zzq(i5 << 3);
        zzq(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzq(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((i5 | 128) & 255);
                i5 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }
        byte[] bArr2 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr2[i11] = (byte) i5;
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzr(int i5, long j8) throws IOException {
        zzq(i5 << 3);
        zzs(j8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzs(long j8) throws IOException {
        if (!zzjg.zzc || this.zzc - this.zzd < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i5 = this.zzd;
                    this.zzd = i5 + 1;
                    bArr[i5] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
                }
            }
            byte[] bArr2 = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr2[i10] = (byte) j8;
            return;
        }
        while (true) {
            int i11 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = 1 + i12;
                zzni.zzn(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            zzni.zzn(bArr4, i13, (byte) ((i11 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
