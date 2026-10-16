package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
final class zzidr extends zzidu {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzidr(byte[] bArr, int i5, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(R8.v.e(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final void zza(byte[] bArr, int i5, int i10) throws IOException {
        zzv(bArr, i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzb(int i5, int i10) throws IOException {
        zzr((i5 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzc(int i5, int i10) throws IOException {
        zzr(i5 << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(int i5, int i10) throws IOException {
        zzr(i5 << 3);
        zzr(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zze(int i5, int i10) throws IOException {
        zzr((i5 << 3) | 5);
        zzs(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzf(int i5, long j8) throws IOException {
        zzr(i5 << 3);
        zzt(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzg(int i5, long j8) throws IOException {
        zzr((i5 << 3) | 1);
        zzu(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzh(int i5, boolean z2) throws IOException {
        zzr(i5 << 3);
        zzp(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzi(int i5, String str) throws IOException {
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
        zzv(bArr, 0, i10);
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
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.zze;
        try {
            int i10 = i5 + 1;
            try {
                this.zzc[i5] = b5;
                this.zze = i10;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i5 = i10;
                throw new zzids(i5, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
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
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        while ((i5 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zzc[i11] = (byte) (i5 | 128);
                    i5 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                    i11 = i10;
                    throw new zzids(i11, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new zzids(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zzc[i11] = (byte) i5;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzs(int i5) throws IOException {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) i5;
            bArr[i10 + 1] = (byte) (i5 >> 8);
            bArr[i10 + 2] = (byte) (i5 >> 16);
            bArr[i10 + 3] = (byte) (i5 >> 24);
            this.zze = i10 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzids(i10, this.zzd, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzt(long j8) throws IOException {
        int i5;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z2 = zzidu.zzc;
        int i10 = this.zze;
        if (!z2 || this.zzd - i10 < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    int i11 = i10 + 1;
                    try {
                        this.zzc[i10] = (byte) (((int) j8) | 128);
                        j8 >>>= 7;
                        i10 = i11;
                    } catch (IndexOutOfBoundsException e7) {
                        indexOutOfBoundsException = e7;
                        i10 = i11;
                        throw new zzids(i10, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
            }
            i5 = i10 + 1;
            try {
                this.zzc[i10] = (byte) j8;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i10 = i5;
                throw new zzids(i10, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j8 & (-128)) != 0) {
                zzihk.zzo(this.zzc, i10, (byte) (((int) j8) | 128));
                j8 >>>= 7;
                i10++;
            }
            i5 = i10 + 1;
            zzihk.zzo(this.zzc, i10, (byte) j8);
        }
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzu(long j8) throws IOException {
        int i5 = this.zze;
        try {
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
        } catch (IndexOutOfBoundsException e7) {
            throw new zzids(i5, this.zzd, 8, e7);
        }
    }

    public final void zzv(byte[] bArr, int i5, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i5, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzids(this.zze, this.zzd, i10, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzw(String str) throws IOException {
        int i5 = this.zze;
        try {
            int iZzF = zzidu.zzF(str.length() * 3);
            int iZzF2 = zzidu.zzF(str.length());
            if (iZzF2 != iZzF) {
                zzr(zzihp.zzc(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zzihp.zzd(str, bArr, i10, bArr.length - i10);
                return;
            }
            int i11 = i5 + iZzF2;
            this.zze = i11;
            byte[] bArr2 = this.zzc;
            int iZzd = zzihp.zzd(str, bArr2, i11, bArr2.length - i11);
            this.zze = i5;
            zzr((iZzd - i5) - iZzF2);
            this.zze = iZzd;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzids(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzx() {
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
