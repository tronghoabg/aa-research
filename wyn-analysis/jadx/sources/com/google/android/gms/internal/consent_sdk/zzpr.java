package com.google.android.gms.internal.consent_sdk;

import R8.v;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzpr extends zzpv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzpr(byte[] bArr, int i5, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(v.e(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b5) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.zzc;
        try {
            int i10 = i5 + 1;
            try {
                this.zza[i5] = b5;
                this.zzc = i10;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i5 = i10;
                throw new zzps(i5, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i5, boolean z2) throws IOException {
        zzw(i5 << 3);
        zzJ(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i5, int i10) throws IOException {
        zzw(i10);
        zze(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i5, int i10) throws IOException {
        zze(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i5, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i10);
            this.zzc += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzps(this.zzc, this.zzb, i10, e7);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzh(int i5, zzpm zzpmVar) throws IOException {
        zzw((i5 << 3) | 2);
        zzi(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzi(zzpm zzpmVar) throws IOException {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzj(int i5, int i10) throws IOException {
        zzw((i5 << 3) | 5);
        zzk(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i5) throws IOException {
        int i10 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i10] = (byte) i5;
            bArr[i10 + 1] = (byte) (i5 >> 8);
            bArr[i10 + 2] = (byte) (i5 >> 16);
            bArr[i10 + 3] = (byte) (i5 >> 24);
            this.zzc = i10 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzps(i10, this.zzb, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i5, long j8) throws IOException {
        zzw((i5 << 3) | 1);
        zzm(j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j8) throws IOException {
        int i5 = this.zzc;
        try {
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
        } catch (IndexOutOfBoundsException e7) {
            throw new zzps(i5, this.zzb, 8, e7);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i5, int i10) throws IOException {
        zzw(i5 << 3);
        zzo(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzo(int i5) throws IOException {
        if (i5 >= 0) {
            zzw(i5);
        } else {
            zzy(i5);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzp(zzrq zzrqVar) throws IOException {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzq(int i5, zzrq zzrqVar) throws IOException {
        zzw(11);
        zzv(2, i5);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzr(int i5, zzpm zzpmVar) throws IOException {
        zzw(11);
        zzv(2, i5);
        zzh(3, zzpmVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzs(int i5, String str) throws IOException {
        zzw((i5 << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzt(String str) throws IOException {
        int i5 = this.zzc;
        try {
            int iZzC = zzpv.zzC(str.length() * 3);
            int iZzC2 = zzpv.zzC(str.length());
            if (iZzC2 != iZzC) {
                zzw(zzsy.zzb(str));
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = zzsy.zza(str, bArr, i10, this.zzb - i10);
                return;
            }
            int i11 = i5 + iZzC2;
            this.zzc = i11;
            int iZza = zzsy.zza(str, this.zza, i11, this.zzb - i11);
            this.zzc = i5;
            zzw((iZza - i5) - iZzC2);
            this.zzc = iZza;
        } catch (zzsx e7) {
            this.zzc = i5;
            zzE(str, e7);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzps(e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i5, int i10) throws IOException {
        zzw((i5 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i5, int i10) throws IOException {
        zzw(i5 << 3);
        zzw(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i5) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zzc;
        while ((i5 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zza[i11] = (byte) (i5 | 128);
                    i5 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                    i11 = i10;
                    throw new zzps(i11, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new zzps(i11, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zza[i11] = (byte) i5;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i5, long j8) throws IOException {
        zzw(i5 << 3);
        zzy(j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j8) throws IOException {
        int i5;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.zzc;
        if (!zzpv.zzb || this.zzb - i10 < 10) {
            int i11 = i10;
            while ((j8 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zza[i11] = (byte) (((int) j8) | 128);
                        j8 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e7) {
                        indexOutOfBoundsException = e7;
                        i11 = i12;
                        throw new zzps(i11, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
            }
            i5 = i11 + 1;
            try {
                this.zza[i11] = (byte) j8;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i11 = i5;
                throw new zzps(i11, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j8 & (-128)) != 0) {
                zzsw.zzn(this.zza, i10, (byte) (((int) j8) | 128));
                j8 >>>= 7;
                i10++;
            }
            i5 = i10 + 1;
            zzsw.zzn(this.zza, i10, (byte) j8);
        }
        this.zzc = i5;
    }
}
