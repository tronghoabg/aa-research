package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
final class zzajd extends zzajb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private final long zzaa() throws IOException {
        long j8;
        long j10;
        long j11;
        long j12;
        int i5 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i5) {
            byte[] bArr = this.zzf;
            int i11 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzi = i11;
                return b5;
            }
            if (i10 - i11 >= 9) {
                int i12 = i5 + 2;
                int i13 = (bArr[i11] << 7) ^ b5;
                if (i13 < 0) {
                    j8 = i13 ^ (-128);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j8 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i5 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i5 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i5 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i5 + 7;
                                    j14 = j15 ^ (bArr[i16] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i5 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i5 + 9;
                                            long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i5 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j8 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j8 = j11 ^ j14;
                        }
                        i12 = i16;
                        j8 = j12;
                    }
                }
                this.zzi = i12;
                return j8;
            }
        }
        return zzm();
    }

    private final void zzab() {
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

    private final byte zzw() throws IOException {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i5 = this.zzi;
        this.zzi = i5 + 1;
        return bArr[i5];
    }

    private final int zzx() throws IOException {
        int i5 = this.zzi;
        if (this.zzg - i5 < 4) {
            zzg(4);
            i5 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 4;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    private final int zzy() throws IOException {
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
        return (int) zzm();
    }

    private final long zzz() throws IOException {
        int i5 = this.zzi;
        if (this.zzg - i5 < 8) {
            zzg(8);
            i5 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 8;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzd() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zze() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzf() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzg() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzh() throws IOException {
        return zzajb.zze(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzy = zzy();
        this.zzj = iZzy;
        if ((iZzy >>> 3) != 0) {
            return iZzy;
        }
        throw zzakf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzj() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzk() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzl() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzm() throws IOException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((zzw() & 128) == 0) {
                return j8;
            }
        }
        throw zzakf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzn() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzo() throws IOException {
        return zzajb.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzp() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final zzaip zzq() throws IOException {
        int iZzy = zzy();
        int i5 = this.zzg;
        int i10 = this.zzi;
        if (iZzy <= i5 - i10 && iZzy > 0) {
            zzaip zzaipVarZza = zzaip.zza(this.zzf, i10, iZzy);
            this.zzi += iZzy;
            return zzaipVarZza;
        }
        if (iZzy == 0) {
            return zzaip.zza;
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        byte[] bArrZzj = zzj(iZzy);
        if (bArrZzj != null) {
            return zzaip.zza(bArrZzj);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int length = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(iZzy - length);
        byte[] bArr = new byte[iZzy];
        System.arraycopy(this.zzf, i11, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return zzaip.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() throws IOException {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i5 = this.zzg;
            int i10 = this.zzi;
            if (iZzy <= i5 - i10) {
                String str = new String(this.zzf, i10, iZzy, zzakb.zza);
                this.zzi += iZzy;
                return str;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        if (iZzy > this.zzg) {
            return new String(zza(iZzy, false), zzakb.zza);
        }
        zzg(iZzy);
        String str2 = new String(this.zzf, this.zzi, iZzy, zzakb.zza);
        this.zzi += iZzy;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzy = zzy();
        int i5 = this.zzi;
        int i10 = this.zzg;
        if (iZzy <= i10 - i5 && iZzy > 0) {
            bArrZza = this.zzf;
            this.zzi = i5 + iZzy;
        } else {
            if (iZzy == 0) {
                return "";
            }
            if (iZzy < 0) {
                throw zzakf.zzf();
            }
            i5 = 0;
            if (iZzy <= i10) {
                zzg(iZzy);
                bArrZza = this.zzf;
                this.zzi = iZzy;
            } else {
                bArrZza = zza(iZzy, false);
            }
        }
        return zzamt.zzb(bArrZza, i5, iZzy);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() throws IOException {
        return zzaa() != 0;
    }

    private zzajd(InputStream inputStream, int i5) {
        super();
        this.zzl = f.API_PRIORITY_OTHER;
        zzakb.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) throws IOException {
        try {
            return inputStream.available();
        } catch (zzakf e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final List<byte[]> zzf(int i5) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int iMin = Math.min(i5, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.zze.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw zzakf.zzj();
                }
                this.zzk += i11;
                i10 += i11;
            }
            i5 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i5) throws IOException {
        if (zzi(i5)) {
            return;
        }
        if (i5 <= (this.zzc - this.zzk) - this.zzi) {
            throw zzakf.zzj();
        }
        throw zzakf.zzi();
    }

    private final void zzh(int i5) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (i5 <= i10 - i11 && i5 >= 0) {
            this.zzi = i11 + i5;
            return;
        }
        if (i5 < 0) {
            throw zzakf.zzf();
        }
        int i12 = this.zzk;
        int i13 = i12 + i11 + i5;
        int i14 = this.zzl;
        if (i13 > i14) {
            zzh((i14 - i12) - i11);
            throw zzakf.zzj();
        }
        this.zzk = i12 + i11;
        int i15 = i10 - i11;
        this.zzg = 0;
        this.zzi = 0;
        while (i15 < i5) {
            try {
                long j8 = i5 - i15;
                long jZza = zza(this.zze, j8);
                if (jZza >= 0 && jZza <= j8) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i15 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzk += i15;
                zzab();
            }
        }
        if (i15 >= i5) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        zzg(1);
        while (true) {
            int i18 = i5 - i17;
            int i19 = this.zzg;
            if (i18 <= i19) {
                this.zzi = i18;
                return;
            } else {
                i17 += i19;
                this.zzi = i19;
                zzg(1);
            }
        }
    }

    private final byte[] zzj(int i5) throws IOException {
        if (i5 == 0) {
            return zzakb.zzb;
        }
        if (i5 < 0) {
            throw zzakf.zzf();
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i5;
        if (i12 - this.zzc > 0) {
            throw zzakf.zzi();
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzh((i13 - i10) - i11);
            throw zzakf.zzj();
        }
        int i14 = this.zzg - i11;
        int i15 = i5 - i14;
        if (i15 >= 4096 && i15 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i5) {
            int iZza = zza(this.zze, bArr, i14, i5 - i14);
            if (iZza == -1) {
                throw zzakf.zzj();
            }
            this.zzk += iZza;
            i14 += iZza;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzb(int i5) throws zzakf {
        if (this.zzj != i5) {
            throw zzakf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i5) {
        this.zzl = i5;
        zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzd(int i5) throws IOException {
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zzw() < 0) {
                        i11++;
                    }
                }
                throw zzakf.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i10 == 1) {
            zzh(8);
            return true;
        }
        if (i10 == 2) {
            zzh(zzy());
            return true;
        }
        if (i10 == 3) {
            zzv();
            zzb(((i5 >>> 3) << 3) | 4);
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw zzakf.zza();
        }
        zzh(4);
        return true;
    }

    private final boolean zzi(int i5) throws IOException {
        do {
            int i10 = this.zzi;
            int i11 = i10 + i5;
            int i12 = this.zzg;
            if (i11 > i12) {
                int i13 = this.zzc;
                int i14 = this.zzk;
                if (i5 > (i13 - i14) - i10 || i14 + i10 + i5 > this.zzl) {
                    return false;
                }
                if (i10 > 0) {
                    if (i12 > i10) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    this.zzk += i10;
                    this.zzg -= i10;
                    this.zzi = 0;
                }
                InputStream inputStream = this.zze;
                byte[] bArr2 = this.zzf;
                int i15 = this.zzg;
                int iZza = zza(inputStream, bArr2, i15, Math.min(bArr2.length - i15, (this.zzc - this.zzk) - i15));
                if (iZza == 0 || iZza < -1 || iZza > this.zzf.length) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
                }
                if (iZza <= 0) {
                    return false;
                }
                this.zzg += iZza;
                zzab();
            } else {
                throw new IllegalStateException(AbstractC0279p0.i(i5, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
        } while (this.zzg < i5);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zza(int i5) throws zzakf {
        if (i5 >= 0) {
            int i10 = this.zzk + this.zzi + i5;
            if (i10 >= 0) {
                int i11 = this.zzl;
                if (i10 <= i11) {
                    this.zzl = i10;
                    zzab();
                    return i11;
                }
                throw zzakf.zzj();
            }
            throw zzakf.zzg();
        }
        throw zzakf.zzf();
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i5, int i10) throws IOException {
        try {
            return inputStream.read(bArr, i5, i10);
        } catch (zzakf e7) {
            e7.zzk();
            throw e7;
        }
    }

    private static long zza(InputStream inputStream, long j8) throws IOException {
        try {
            return inputStream.skip(j8);
        } catch (zzakf e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final byte[] zza(int i5, boolean z2) throws IOException {
        byte[] bArrZzj = zzj(i5);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int length = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(i5 - length);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzf, i10, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
