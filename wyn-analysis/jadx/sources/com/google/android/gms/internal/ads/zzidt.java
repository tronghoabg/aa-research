package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class zzidt extends zzidu {
    private final byte[] zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private final OutputStream zzg;

    public zzidt(OutputStream outputStream, int i5) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i5, 20)];
        this.zzc = bArr;
        this.zzd = bArr.length;
    }

    private final void zzK(int i5) throws IOException {
        if (this.zzd - this.zze < i5) {
            zzL();
        }
    }

    private final void zzL() throws IOException {
        this.zzg.write(this.zzc, 0, this.zze);
        this.zze = 0;
    }

    public final void zzA(long j8) {
        if (zzidu.zzc) {
            long j10 = this.zze;
            while (true) {
                int i5 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr = this.zzc;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zzihk.zzo(bArr, i10, (byte) i5);
                    this.zzf += (int) (this.zze - j10);
                    return;
                }
                byte[] bArr2 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzihk.zzo(bArr2, i11, (byte) (i5 | 128));
                j8 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr3 = this.zzc;
                    int i13 = this.zze;
                    this.zze = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.zzf++;
                    return;
                }
                byte[] bArr4 = this.zzc;
                int i14 = this.zze;
                this.zze = i14 + 1;
                bArr4[i14] = (byte) (i12 | 128);
                this.zzf++;
                j8 >>>= 7;
            }
        }
    }

    public final void zzB(int i5) {
        int i10 = this.zze;
        byte[] bArr = this.zzc;
        bArr[i10] = (byte) i5;
        bArr[i10 + 1] = (byte) (i5 >> 8);
        bArr[i10 + 2] = (byte) (i5 >> 16);
        bArr[i10 + 3] = (byte) (i5 >> 24);
        this.zze = i10 + 4;
        this.zzf += 4;
    }

    public final void zzC(long j8) {
        int i5 = this.zze;
        byte[] bArr = this.zzc;
        bArr[i5] = (byte) j8;
        bArr[i5 + 1] = (byte) (j8 >> 8);
        bArr[i5 + 2] = (byte) (j8 >> 16);
        bArr[i5 + 3] = (byte) (j8 >> 24);
        bArr[i5 + 4] = (byte) (j8 >> 32);
        bArr[i5 + 5] = (byte) (j8 >> 40);
        bArr[i5 + 6] = (byte) (j8 >> 48);
        bArr[i5 + 7] = (byte) (j8 >> 56);
        this.zze = i5 + 8;
        this.zzf += 8;
    }

    public final void zzD(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = this.zzd;
        int i12 = this.zze;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, i5, this.zzc, i12, i10);
            this.zze += i10;
            this.zzf += i10;
            return;
        }
        byte[] bArr2 = this.zzc;
        System.arraycopy(bArr, i5, bArr2, i12, i13);
        int i14 = i5 + i13;
        this.zze = i11;
        this.zzf += i13;
        zzL();
        int i15 = i10 - i13;
        if (i15 <= i11) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.zze = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzf += i15;
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final void zza(byte[] bArr, int i5, int i10) throws IOException {
        zzD(bArr, i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzb(int i5, int i10) throws IOException {
        zzr((i5 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzc(int i5, int i10) throws IOException {
        zzK(20);
        zzz(i5 << 3);
        if (i10 >= 0) {
            zzz(i10);
        } else {
            zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(int i5, int i10) throws IOException {
        zzK(20);
        zzz(i5 << 3);
        zzz(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zze(int i5, int i10) throws IOException {
        zzK(14);
        zzz((i5 << 3) | 5);
        zzB(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzf(int i5, long j8) throws IOException {
        zzK(20);
        zzz(i5 << 3);
        zzA(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzg(int i5, long j8) throws IOException {
        zzK(18);
        zzz((i5 << 3) | 1);
        zzC(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzh(int i5, boolean z2) throws IOException {
        zzK(11);
        zzz(i5 << 3);
        zzv(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzi(int i5, String str) throws zziho, IOException {
        zzr((i5 << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(int i5, zzidl zzidlVar) throws IOException {
        zzr((i5 << 3) | 2);
        zzk(zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzk(zzidl zzidlVar) throws IOException {
        zzr(zzidlVar.zzb());
        zzidlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzl(byte[] bArr, int i5, int i10) throws IOException {
        zzr(i10);
        zzD(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzm(int i5, zzifz zzifzVar) throws IOException {
        zzr(11);
        zzd(2, i5);
        zzr(26);
        zzo(zzifzVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzn(int i5, zzidl zzidlVar) throws IOException {
        zzr(11);
        zzd(2, i5);
        zzj(3, zzidlVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzo(zzifz zzifzVar) throws IOException {
        zzr(zzifzVar.zzbr());
        zzifzVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzp(byte b5) throws IOException {
        if (this.zze == this.zzd) {
            zzL();
        }
        zzv(b5);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzq(int i5) throws IOException {
        if (i5 >= 0) {
            zzr(i5);
        } else {
            zzt(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzr(int i5) throws IOException {
        zzK(5);
        zzz(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzs(int i5) throws IOException {
        zzK(4);
        zzB(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzt(long j8) throws IOException {
        zzK(10);
        zzA(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzu(long j8) throws IOException {
        zzK(8);
        zzC(j8);
    }

    public final void zzv(byte b5) {
        byte[] bArr = this.zzc;
        int i5 = this.zze;
        bArr[i5] = b5;
        this.zze = i5 + 1;
        this.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzw(String str) throws zziho, IOException {
        int iZzc;
        int length = str.length() * 3;
        int iZzF = zzidu.zzF(length);
        int i5 = iZzF + length;
        int i10 = this.zzd;
        if (i5 > i10) {
            byte[] bArr = new byte[length];
            int iZzd = zzihp.zzd(str, bArr, 0, length);
            zzr(iZzd);
            zzD(bArr, 0, iZzd);
            return;
        }
        if (i5 > i10 - this.zze) {
            zzL();
        }
        int iZzF2 = zzidu.zzF(str.length());
        int i11 = this.zze;
        try {
            if (iZzF2 == iZzF) {
                int i12 = i11 + iZzF2;
                this.zze = i12;
                int iZzd2 = zzihp.zzd(str, this.zzc, i12, i10 - i12);
                this.zze = i11;
                iZzc = (iZzd2 - i11) - iZzF2;
                zzz(iZzc);
                this.zze = iZzd2;
            } else {
                iZzc = zzihp.zzc(str);
                zzz(iZzc);
                this.zze = zzihp.zzd(str, this.zzc, this.zze, iZzc);
            }
            this.zzf += iZzc;
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw new zzids(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzx() throws IOException {
        if (this.zze > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzy() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzz(int i5) {
        if (!zzidu.zzc) {
            while ((i5 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = (byte) (i5 | 128);
                this.zzf++;
                i5 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i11 = this.zze;
            this.zze = i11 + 1;
            bArr2[i11] = (byte) i5;
            this.zzf++;
            return;
        }
        long j8 = this.zze;
        while ((i5 & (-128)) != 0) {
            byte[] bArr3 = this.zzc;
            int i12 = this.zze;
            this.zze = i12 + 1;
            zzihk.zzo(bArr3, i12, (byte) (i5 | 128));
            i5 >>>= 7;
        }
        byte[] bArr4 = this.zzc;
        int i13 = this.zze;
        this.zze = i13 + 1;
        zzihk.zzo(bArr4, i13, (byte) i5);
        this.zzf += (int) (this.zze - j8);
    }
}
