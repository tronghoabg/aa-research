package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zziz extends zziw {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final void zzaa() {
        int i5 = this.zze + this.zzf;
        this.zze = i5;
        int i10 = i5 - this.zzh;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzf = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzf = i12;
        this.zze = i5 - i12;
    }

    private final byte zzv() throws IOException {
        int i5 = this.zzg;
        if (i5 == this.zze) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i5 + 1;
        return bArr[i5];
    }

    private final int zzw() throws IOException {
        int i5 = this.zzg;
        if (this.zze - i5 < 4) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i5 + 4;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    private final int zzx() throws IOException {
        int i5;
        int i10 = this.zzg;
        int i11 = this.zze;
        if (i11 != i10) {
            byte[] bArr = this.zzd;
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.zzg = i12;
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
                this.zzg = i13;
                return i5;
            }
        }
        return (int) zzm();
    }

    private final long zzy() throws IOException {
        int i5 = this.zzg;
        if (this.zze - i5 < 8) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i5 + 8;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    private final long zzz() throws IOException {
        long j8;
        long j10;
        long j11;
        long j12;
        int i5 = this.zzg;
        int i10 = this.zze;
        if (i10 != i5) {
            byte[] bArr = this.zzd;
            int i11 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzg = i11;
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
                this.zzg = i12;
                return j8;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzh() throws IOException {
        return zziw.zza(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzi = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw zzkb.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzm() throws IOException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((zzv() & 128) == 0) {
                return j8;
            }
        }
        throw zzkb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzo() throws IOException {
        return zziw.zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzp() throws IOException {
        return zzz();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzik zzq() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.zzx()
            if (r0 <= 0) goto L19
            int r1 = r3.zze
            int r2 = r3.zzg
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zzd
            com.google.android.gms.internal.measurement.zzik r1 = com.google.android.gms.internal.measurement.zzik.zza(r1, r2, r0)
            int r2 = r3.zzg
            int r2 = r2 + r0
            r3.zzg = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.measurement.zzik r0 = com.google.android.gms.internal.measurement.zzik.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zze
            int r2 = r3.zzg
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzg = r0
            byte[] r1 = r3.zzd
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.measurement.zzjv.zzb
        L37:
            com.google.android.gms.internal.measurement.zzik r0 = com.google.android.gms.internal.measurement.zzik.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.measurement.zzkb r0 = com.google.android.gms.internal.measurement.zzkb.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.measurement.zzkb r0 = com.google.android.gms.internal.measurement.zzkb.zzi()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziz.zzq():com.google.android.gms.internal.measurement.zzik");
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzr() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i5 = this.zze;
            int i10 = this.zzg;
            if (iZzx <= i5 - i10) {
                String str = new String(this.zzd, i10, iZzx, zzjv.zza);
                this.zzg += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzs() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i5 = this.zze;
            int i10 = this.zzg;
            if (iZzx <= i5 - i10) {
                String strZzb = zzmp.zzb(this.zzd, i10, iZzx);
                this.zzg += iZzx;
                return strZzb;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx <= 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzt() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }

    private zziz(byte[] bArr, int i5, int i10, boolean z2) {
        super();
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i10 + i5;
        this.zzg = i5;
        this.zzh = i5;
    }

    private final void zzf(int i5) throws IOException {
        if (i5 >= 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (i5 <= i10 - i11) {
                this.zzg = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw zzkb.zzi();
        }
        throw zzkb.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb(int i5) throws zzkb {
        if (i5 < 0) {
            throw zzkb.zzf();
        }
        int iZzc = i5 + zzc();
        if (iZzc < 0) {
            throw zzkb.zzg();
        }
        int i10 = this.zzj;
        if (iZzc > i10) {
            throw zzkb.zzi();
        }
        this.zzj = iZzc;
        zzaa();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzc(int i5) throws zzkb {
        if (this.zzi != i5) {
            throw zzkb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzd(int i5) {
        this.zzj = i5;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zze(int i5) throws IOException {
        boolean zZze;
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i11 < 10) {
                    if (zzv() < 0) {
                        i11++;
                    }
                }
                throw zzkb.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zzd;
                int i12 = this.zzg;
                this.zzg = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzkb.zze();
            return true;
        }
        if (i10 == 1) {
            zzf(8);
            return true;
        }
        if (i10 == 2) {
            zzf(zzx());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzkb.zza();
            }
            zzf(4);
            return true;
        }
        do {
            int iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
            int i13 = this.zza;
            if (i13 >= this.zzb) {
                throw zzkb.zzh();
            }
            this.zza = i13 + 1;
            zZze = zze(iZzi);
            this.zza--;
        } while (zZze);
        zzc(((i5 >>> 3) << 3) | 4);
        return true;
    }
}
