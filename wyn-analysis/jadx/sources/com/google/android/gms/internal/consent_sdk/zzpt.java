package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class zzpt extends zzpq {
    private final OutputStream zzg;

    public zzpt(OutputStream outputStream, int i5) {
        super(i5);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i5) throws IOException {
        if (this.zzb - this.zzc < i5) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b5) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i5, boolean z2) throws IOException {
        zzH(11);
        zzf(i5 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i5, int i10) throws IOException {
        zzw(i10);
        zzz(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i5, int i10) throws IOException {
        zzz(bArr, 0, i10);
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
        zzH(14);
        zzf((i5 << 3) | 5);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i5) throws IOException {
        zzH(4);
        zzd(i5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i5, long j8) throws IOException {
        zzH(18);
        zzf((i5 << 3) | 1);
        zze(j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j8) throws IOException {
        zzH(8);
        zze(j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i5, int i10) throws IOException {
        zzH(20);
        zzf(i5 << 3);
        if (i10 >= 0) {
            zzf(i10);
        } else {
            zzg(i10);
        }
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
        int iZzb;
        try {
            int length = str.length() * 3;
            int iZzC = zzpv.zzC(length);
            int i5 = iZzC + length;
            int i10 = this.zzb;
            if (i5 > i10) {
                byte[] bArr = new byte[length];
                int iZza = zzsy.zza(str, bArr, 0, length);
                zzw(iZza);
                zzz(bArr, 0, iZza);
                return;
            }
            if (i5 > i10 - this.zzc) {
                zzG();
            }
            int iZzC2 = zzpv.zzC(str.length());
            int i11 = this.zzc;
            try {
                if (iZzC2 == iZzC) {
                    int i12 = i11 + iZzC2;
                    this.zzc = i12;
                    int iZza2 = zzsy.zza(str, this.zza, i12, i10 - i12);
                    this.zzc = i11;
                    iZzb = (iZza2 - i11) - iZzC2;
                    zzf(iZzb);
                    this.zzc = iZza2;
                } else {
                    iZzb = zzsy.zzb(str);
                    zzf(iZzb);
                    this.zzc = zzsy.zza(str, this.zza, this.zzc, iZzb);
                }
                this.zzd += iZzb;
            } catch (zzsx e7) {
                this.zzd -= this.zzc - i11;
                this.zzc = i11;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new zzps(e10);
            }
        } catch (zzsx e11) {
            zzE(str, e11);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i5, int i10) throws IOException {
        zzw((i5 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i5, int i10) throws IOException {
        zzH(20);
        zzf(i5 << 3);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i5) throws IOException {
        zzH(5);
        zzf(i5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i5, long j8) throws IOException {
        zzH(20);
        zzf(i5 << 3);
        zzg(j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j8) throws IOException {
        zzH(10);
        zzg(j8);
    }

    public final void zzz(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, 0, this.zza, i12, i10);
            this.zzc += i10;
            this.zzd += i10;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, 0, bArr2, i12, i13);
        this.zzc = i11;
        this.zzd += i13;
        zzG();
        int i14 = i10 - i13;
        if (i14 <= i11) {
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.zzc = i14;
        } else {
            this.zzg.write(bArr, i13, i14);
        }
        this.zzd += i14;
    }
}
