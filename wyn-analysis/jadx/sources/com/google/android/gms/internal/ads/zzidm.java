package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
abstract class zzidm extends zzidp {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzidm(byte[] bArr, int i5, int i10, boolean z2, byte[] bArr2) {
        super(null);
        this.zzl = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.zzf = bArr;
        this.zzg = i10 + i5;
        this.zzi = i5;
        this.zzj = i5;
    }

    private final void zzP() {
        int i5 = this.zzg + this.zzh;
        this.zzg = i5;
        int i10 = i5 - this.zzj;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i5 - i12;
    }

    public final long zzA() throws IOException {
        int i5 = this.zzi;
        if (this.zzg - i5 < 8) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 8;
        long j8 = bArr[i5];
        long j10 = bArr[i5 + 2];
        long j11 = bArr[i5 + 3];
        return ((bArr[i5 + 6] & 255) << 48) | (j8 & 255) | ((bArr[i5 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzB(int i5) throws zzifh {
        if (i5 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = (this.zzi - this.zzj) + i5;
        if (i10 < 0) {
            throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i10;
        zzP();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzC(int i5) {
        this.zzl = i5;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzD() throws IOException {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzE() {
        return this.zzi - this.zzj;
    }

    public final byte zzF() throws IOException {
        int i5 = this.zzi;
        if (i5 == this.zzg) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 1;
        return bArr[i5];
    }

    public final void zzG(int i5) throws IOException {
        if (i5 >= 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (i5 <= i10 - i11) {
                this.zzi = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zza() throws IOException {
        if (zzD()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzifh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzb(int i5) throws zzifh {
        if (this.zzk != i5) {
            throw new zzifh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzc(int i5) throws IOException {
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zzF() < 0) {
                        i11++;
                    }
                }
                throw new zzifh("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw new zzifh("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i10 == 1) {
            zzG(8);
            return true;
        }
        if (i10 == 2) {
            zzG(zzu());
            return true;
        }
        if (i10 == 3) {
            zzL();
            zzb(((i5 >>> 3) << 3) | 4);
            return true;
        }
        if (i10 == 4) {
            zzK();
            return false;
        }
        if (i10 != 5) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        zzG(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzg() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzh() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzi() throws IOException {
        return zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzj() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzk() throws IOException {
        return zzx() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i5 = this.zzg;
            int i10 = this.zzi;
            if (iZzu <= i5 - i10) {
                String str = new String(this.zzf, i10, iZzu, StandardCharsets.UTF_8);
                this.zzi += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i5 = this.zzg;
            int i10 = this.zzi;
            if (iZzu <= i5 - i10) {
                String strZze = zzihp.zze(this.zzf, i10, iZzu);
                this.zzi += iZzu;
                return strZze;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final zzidl zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i5 = this.zzg;
            int i10 = this.zzi;
            if (iZzu <= i5 - i10) {
                zzidl zzidlVarZzu = zzidl.zzu(this.zzf, i10, iZzu, false);
                this.zzi += iZzu;
                return zzidlVarZzu;
            }
        }
        if (iZzu == 0) {
            return zzidl.zza;
        }
        if (iZzu > 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (iZzu <= i11 - i12) {
                int i13 = iZzu + i12;
                this.zzi = i13;
                return zzidl.zzw(Arrays.copyOfRange(this.zzf, i12, i13), false);
            }
        }
        if (iZzu <= 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzp() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzq() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzr() throws IOException {
        return zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzs() throws IOException {
        return zzidp.zzM(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzt() throws IOException {
        return zzidp.zzN(zzx());
    }

    public abstract int zzu() throws IOException;

    public abstract int zzv() throws IOException;

    public final int zzw() throws IOException {
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
        return (int) zzy();
    }

    public final long zzx() throws IOException {
        long j8;
        long j10;
        long j11;
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
                    j11 = i13 ^ (-128);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j11 = i15 ^ 16256;
                    } else {
                        int i16 = i5 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j12 = (-2080896) ^ i17;
                            i12 = i16;
                            j11 = j12;
                        } else {
                            i14 = i5 + 5;
                            long j13 = (bArr[i16] << 28) ^ i17;
                            if (j13 >= 0) {
                                j11 = j13 ^ 266354560;
                            } else {
                                i12 = i5 + 6;
                                long j14 = (bArr[i14] << 35) ^ j13;
                                if (j14 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    int i18 = i5 + 7;
                                    long j15 = j14 ^ (bArr[i12] << 42);
                                    if (j15 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i12 = i5 + 8;
                                        j14 = j15 ^ (bArr[i18] << 49);
                                        if (j14 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i18 = i5 + 9;
                                            j15 = j14 ^ (bArr[i12] << 56);
                                            if (j15 >= 0) {
                                                j10 = 71499008037633920L;
                                            } else {
                                                i12 = i5 + 10;
                                                j14 = j15 ^ (bArr[i18] << 63);
                                                if (j14 >= 0) {
                                                    j8 = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                    j11 = j10 ^ j15;
                                    i12 = i18;
                                }
                                j11 = j14 ^ j8;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzi = i12;
                return j11;
            }
        }
        return zzy();
    }

    public final long zzy() throws IOException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((zzF() & 128) == 0) {
                return j8;
            }
        }
        throw new zzifh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzz() throws IOException {
        int i5 = this.zzi;
        if (this.zzg - i5 < 4) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 4;
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }
}
