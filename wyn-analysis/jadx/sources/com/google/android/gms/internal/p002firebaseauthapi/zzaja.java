package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
final class zzaja extends zzajb {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private final long zzaa() throws IOException {
        long j8;
        long j10;
        long j11;
        long j12;
        int i5 = this.zzh;
        int i10 = this.zzf;
        if (i10 != i5) {
            byte[] bArr = this.zze;
            int i11 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzh = i11;
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
                this.zzh = i12;
                return j8;
            }
        }
        return zzm();
    }

    private final void zzab() {
        int i5 = this.zzf + this.zzg;
        this.zzf = i5;
        int i10 = i5 - this.zzi;
        int i11 = this.zzk;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i5 - i12;
    }

    private final byte zzw() throws IOException {
        int i5 = this.zzh;
        if (i5 == this.zzf) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i5 + 1;
        return bArr[i5];
    }

    private final int zzx() throws IOException {
        int i5 = this.zzh;
        if (this.zzf - i5 < 4) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i5 + 4;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    private final int zzy() throws IOException {
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
        return (int) zzm();
    }

    private final long zzz() throws IOException {
        int i5 = this.zzh;
        if (this.zzf - i5 < 8) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i5 + 8;
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
        return this.zzh - this.zzi;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzaip zzq() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.zzy()
            if (r0 <= 0) goto L19
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zze
            com.google.android.gms.internal.firebase-auth-api.zzaip r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.firebase-auth-api.zzaip r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzh = r0
            byte[] r1 = r3.zze
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakb.zzb
        L37:
            com.google.android.gms.internal.firebase-auth-api.zzaip r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaip.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.firebase-auth-api.zzakf r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.firebase-auth-api.zzakf r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzj()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaja.zzq():com.google.android.gms.internal.firebase-auth-api.zzaip");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() throws IOException {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i5 = this.zzf;
            int i10 = this.zzh;
            if (iZzy <= i5 - i10) {
                String str = new String(this.zze, i10, iZzy, zzakb.zza);
                this.zzh += iZzy;
                return str;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        throw zzakf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() throws IOException {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i5 = this.zzf;
            int i10 = this.zzh;
            if (iZzy <= i5 - i10) {
                String strZzb = zzamt.zzb(this.zze, i10, iZzy);
                this.zzh += iZzy;
                return strZzb;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy <= 0) {
            throw zzakf.zzf();
        }
        throw zzakf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() throws IOException {
        return zzaa() != 0;
    }

    private zzaja(byte[] bArr, int i5, int i10, boolean z2) {
        super();
        this.zzk = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i10 + i5;
        this.zzh = i5;
        this.zzi = i5;
    }

    private final void zzf(int i5) throws IOException {
        if (i5 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i5 <= i10 - i11) {
                this.zzh = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw zzakf.zzj();
        }
        throw zzakf.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zza(int i5) throws zzakf {
        if (i5 < 0) {
            throw zzakf.zzf();
        }
        int iZzc = i5 + zzc();
        if (iZzc < 0) {
            throw zzakf.zzg();
        }
        int i10 = this.zzk;
        if (iZzc > i10) {
            throw zzakf.zzj();
        }
        this.zzk = iZzc;
        zzab();
        return i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzb(int i5) throws zzakf {
        if (this.zzj != i5) {
            throw zzakf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i5) {
        this.zzk = i5;
        zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzd(int i5) throws IOException {
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zzw() < 0) {
                        i11++;
                    }
                }
                throw zzakf.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i10 == 1) {
            zzf(8);
            return true;
        }
        if (i10 == 2) {
            zzf(zzy());
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
        zzf(4);
        return true;
    }
}
