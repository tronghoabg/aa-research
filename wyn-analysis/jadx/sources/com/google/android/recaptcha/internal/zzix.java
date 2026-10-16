package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzix extends zzjb {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzix(byte[] bArr, int i5, int i10, boolean z2, zziw zziwVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i5 = this.zzf + this.zzg;
        this.zzf = i5;
        int i10 = this.zzj;
        if (i5 <= i10) {
            this.zzg = 0;
            return;
        }
        int i11 = i5 - i10;
        this.zzg = i11;
        this.zzf = i5 - i11;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzA(int i5) {
        this.zzj = i5;
        zzI();
    }

    public final void zzB(int i5) throws IOException {
        if (i5 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i5 <= i10 - i11) {
                this.zzh = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw zzlc.zzi();
        }
        throw zzlc.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw zzlc.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
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
        int i5 = this.zzh;
        if (i5 == this.zzf) {
            throw zzlc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i5 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zze(int i5) throws zzlc {
        if (i5 < 0) {
            throw zzlc.zzf();
        }
        int i10 = i5 + this.zzh;
        if (i10 < 0) {
            throw zzlc.zzg();
        }
        int i11 = this.zzj;
        if (i10 > i11) {
            throw zzlc.zzi();
        }
        this.zzj = i10;
        zzI();
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
        int i5 = this.zzh;
        if (this.zzf - i5 < 4) {
            throw zzlc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i5 + 4;
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() throws IOException {
        int i5;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
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
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
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
        int i5 = this.zzh;
        if (this.zzf - i5 < 8) {
            throw zzlc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i5 + 8;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzix.zzr():long");
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
        if (iZzj > 0) {
            int i5 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i5 - i10) {
                zziv zzivVarZzk = zziv.zzk(this.zze, i10, iZzj);
                this.zzh += iZzj;
                return zzivVarZzk;
            }
        }
        if (iZzj == 0) {
            return zziv.zzb;
        }
        if (iZzj > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (iZzj <= i11 - i12) {
                int i13 = iZzj + i12;
                this.zzh = i13;
                return new zziu(Arrays.copyOfRange(this.zze, i12, i13));
            }
        }
        if (iZzj <= 0) {
            throw zzlc.zzf();
        }
        throw zzlc.zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i5 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i5 - i10) {
                String str = new String(this.zze, i10, iZzj, zzla.zza);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzlc.zzf();
        }
        throw zzlc.zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i5 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i5 - i10) {
                String strZzd = zznl.zzd(this.zze, i10, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzlc.zzf();
        }
        throw zzlc.zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzz(int i5) throws zzlc {
        if (this.zzi != i5) {
            throw zzlc.zzb();
        }
    }
}
