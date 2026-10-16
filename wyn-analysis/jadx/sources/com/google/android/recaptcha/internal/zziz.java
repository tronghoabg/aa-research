package com.google.android.recaptcha.internal;

import A7.AbstractC0279p0;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zziz extends zzjb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zziz(InputStream inputStream, int i5, zziy zziyVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zzla.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i5) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int iMin = Math.min(i5, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.zze.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw zzlc.zzi();
                }
                this.zzk += i11;
                i10 += i11;
            }
            i5 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i5 = this.zzg + this.zzh;
        this.zzg = i5;
        int i10 = this.zzk + i5;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i5 - i12;
    }

    private final void zzK(int i5) throws IOException {
        if (zzL(i5)) {
            return;
        }
        if (i5 <= (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw zzlc.zzi();
        }
        throw zzlc.zzh();
    }

    private final boolean zzL(int i5) throws IOException {
        int i10 = this.zzi;
        int i11 = i10 + i5;
        int i12 = this.zzg;
        if (i11 <= i12) {
            throw new IllegalStateException(AbstractC0279p0.i(i5, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.zzk;
        if (i5 > (f.API_PRIORITY_OTHER - i13) - i10 || i13 + i10 + i5 > this.zzl) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzk + i10;
            this.zzk = i13;
            i12 = this.zzg - i10;
            this.zzg = i12;
            this.zzi = 0;
        }
        try {
            int i14 = this.zze.read(this.zzf, i12, Math.min(4096 - i12, (f.API_PRIORITY_OTHER - i13) - i12));
            if (i14 == 0 || i14 < -1 || i14 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
            }
            if (i14 <= 0) {
                return false;
            }
            this.zzg += i14;
            zzJ();
            if (this.zzg >= i5) {
                return true;
            }
            return zzL(i5);
        } catch (zzlc e7) {
            e7.zzj();
            throw e7;
        }
    }

    private final byte[] zzM(int i5, boolean z2) throws IOException {
        byte[] bArrZzN = zzN(i5);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i5 - i12);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i5) throws IOException {
        if (i5 == 0) {
            return zzla.zzb;
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i5;
        if ((-2147483647) + i12 > 0) {
            throw zzlc.zzh();
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzB((i13 - i10) - i11);
            throw zzlc.zzi();
        }
        int i14 = this.zzg - i11;
        int i15 = i5 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zze.available()) {
                    return null;
                }
            } catch (zzlc e7) {
                e7.zzj();
                throw e7;
            }
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i5) {
            try {
                int i16 = this.zze.read(bArr, i14, i5 - i14);
                if (i16 == -1) {
                    throw zzlc.zzi();
                }
                this.zzk += i16;
                i14 += i16;
            } catch (zzlc e10) {
                e10.zzj();
                throw e10;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzA(int i5) {
        this.zzl = i5;
        zzJ();
    }

    public final void zzB(int i5) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i5 <= i12 && i5 >= 0) {
            this.zzi = i11 + i5;
            return;
        }
        if (i5 < 0) {
            throw zzlc.zzf();
        }
        int i13 = this.zzk;
        int i14 = i13 + i11;
        int i15 = this.zzl;
        if (i14 + i5 > i15) {
            zzB((i15 - i13) - i11);
            throw zzlc.zzi();
        }
        this.zzk = i14;
        this.zzg = 0;
        this.zzi = 0;
        while (i12 < i5) {
            try {
                long j8 = i5 - i12;
                try {
                    long jSkip = this.zze.skip(j8);
                    if (jSkip < 0 || jSkip > j8) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (zzlc e7) {
                    e7.zzj();
                    throw e7;
                }
            } catch (Throwable th) {
                this.zzk += i12;
                zzJ();
                throw th;
            }
        }
        this.zzk += i12;
        zzJ();
        if (i12 >= i5) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        zzK(1);
        while (true) {
            int i18 = i5 - i17;
            int i19 = this.zzg;
            if (i18 <= i19) {
                this.zzi = i18;
                return;
            } else {
                i17 += i19;
                this.zzi = i19;
                zzK(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzE(int i5) throws IOException {
        int iZzm;
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw zzlc.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzlc.zze();
            return true;
        }
        if (i10 == 1) {
            zzB(8);
            return true;
        }
        if (i10 == 2) {
            zzB(zzj());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzlc.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i5 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i5 = this.zzi;
        this.zzi = i5 + 1;
        return bArr[i5];
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zze(int i5) throws zzlc {
        if (i5 < 0) {
            throw zzlc.zzf();
        }
        int i10 = this.zzk + this.zzi + i5;
        if (i10 < 0) {
            throw zzlc.zzg();
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            throw zzlc.zzi();
        }
        this.zzl = i10;
        zzJ();
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i5 = this.zzi;
        if (this.zzg - i5 < 4) {
            zzK(4);
            i5 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 4;
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() throws IOException {
        int i5;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.zzi = i12;
                return b5;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b5;
                if (i14 < 0) {
                    i5 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i5 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i5 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i5 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i19;
                            }
                            i5 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return i5;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzl() throws IOException {
        return zzjb.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzlc.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i5 = this.zzi;
        if (this.zzg - i5 < 8) {
            zzK(8);
            i5 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 8;
        long j8 = bArr[i5];
        long j10 = bArr[i5 + 2];
        long j11 = bArr[i5 + 3];
        return ((bArr[i5 + 6] & 255) << 48) | (j8 & 255) | ((bArr[i5 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzr() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziz.zzr():long");
    }

    public final long zzs() throws IOException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((zza() & 128) == 0) {
                return j8;
            }
        }
        throw zzlc.zze();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzu() throws IOException {
        return zzjb.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final zziv zzw() throws IOException {
        int iZzj = zzj();
        int i5 = this.zzg;
        int i10 = this.zzi;
        if (iZzj <= i5 - i10 && iZzj > 0) {
            zziv zzivVarZzk = zziv.zzk(this.zzf, i10, iZzj);
            this.zzi += iZzj;
            return zzivVarZzk;
        }
        if (iZzj == 0) {
            return zziv.zzb;
        }
        if (iZzj < 0) {
            throw zzlc.zzf();
        }
        byte[] bArrZzN = zzN(iZzj);
        if (bArrZzN != null) {
            return zziv.zzk(bArrZzN, 0, bArrZzN.length);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzj - i13);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return new zziu(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i5 = this.zzg;
            int i10 = this.zzi;
            if (iZzj <= i5 - i10) {
                String str = new String(this.zzf, i10, iZzj, zzla.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzlc.zzf();
        }
        if (iZzj > this.zzg) {
            return new String(zzM(iZzj, false), zzla.zza);
        }
        zzK(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzla.zza);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzy() throws IOException {
        byte[] bArrZzM;
        int iZzj = zzj();
        int i5 = this.zzi;
        int i10 = this.zzg;
        if (iZzj <= i10 - i5 && iZzj > 0) {
            bArrZzM = this.zzf;
            this.zzi = i5 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw zzlc.zzf();
            }
            i5 = 0;
            if (iZzj <= i10) {
                zzK(iZzj);
                bArrZzM = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzM = zzM(iZzj, false);
            }
        }
        return zznl.zzd(bArrZzM, i5, iZzj);
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzz(int i5) throws zzlc {
        if (this.zzj != i5) {
            throw zzlc.zzb();
        }
    }
}
