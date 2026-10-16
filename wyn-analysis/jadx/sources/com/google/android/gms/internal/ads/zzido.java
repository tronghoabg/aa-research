package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzido extends zzidp {
    private final InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzido(InputStream inputStream, int i5, byte[] bArr) {
        super(null);
        this.zzm = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzF() {
        int i5 = this.zzh + this.zzi;
        this.zzh = i5;
        int i10 = this.zzl + i5;
        int i11 = this.zzm;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i5 - i12;
    }

    private final void zzG(int i5) throws IOException {
        if (zzP(i5)) {
            return;
        }
        if (i5 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.zzl) - this.zzj) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzP(int i5) throws IOException {
        int i10 = this.zzj;
        int i11 = i10 + i5;
        int i12 = this.zzh;
        if (i11 <= i12) {
            throw new IllegalStateException(AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 66), "refillBuffer() called when ", i5, " bytes were already available in buffer"));
        }
        int i13 = this.zzl;
        if (i5 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i13) - i10 || i13 + i10 + i5 > this.zzm) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzl + i10;
            this.zzl = i13;
            i12 = this.zzh - i10;
            this.zzh = i12;
            this.zzj = 0;
        }
        try {
            int i14 = this.zzf.read(this.zzg, i12, Math.min(4096 - i12, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i13) - i12));
            if (i14 != 0 && i14 >= -1 && i14 <= 4096) {
                if (i14 <= 0) {
                    return false;
                }
                this.zzh += i14;
                zzF();
                return this.zzh >= i5 || zzP(i5);
            }
            String strValueOf = String.valueOf(this.zzf.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + strValueOf.length() + 39 + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i14);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (zzifh e7) {
            e7.zza();
            throw e7;
        }
    }

    private final byte[] zzQ(int i5, boolean z2) throws IOException {
        byte[] bArrZzR = zzR(i5);
        if (bArrZzR != null) {
            return bArrZzR;
        }
        int i10 = this.zzj;
        int i11 = this.zzh;
        int i12 = i11 - i10;
        this.zzl += i11;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(i5 - i12);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzg, i10, bArr, 0, i12);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzR(int i5) throws IOException {
        if (i5 == 0) {
            return zzifc.zza;
        }
        int i10 = this.zzl;
        int i11 = this.zzj;
        int i12 = i10 + i11 + i5;
        if ((-2147483647) + i12 > 0) {
            throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.zzm;
        if (i12 > i13) {
            zzA((i13 - i10) - i11);
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.zzh - i11;
        int i15 = i5 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zzf.available()) {
                    return null;
                }
            } catch (zzifh e7) {
                e7.zza();
                throw e7;
            }
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i14);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i14 < i5) {
            try {
                int i16 = this.zzf.read(bArr, i14, i5 - i14);
                if (i16 == -1) {
                    throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i16;
                i14 += i16;
            } catch (zzifh e10) {
                e10.zza();
                throw e10;
            }
        }
        return bArr;
    }

    private final List zzS(int i5) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int iMin = Math.min(i5, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                try {
                    int i11 = this.zzf.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.zzl += i11;
                    i10 += i11;
                } catch (zzifh e7) {
                    e7.zza();
                    throw e7;
                }
            }
            i5 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void zzA(int i5) throws IOException {
        int i10 = this.zzh;
        int i11 = this.zzj;
        int i12 = i10 - i11;
        if (i5 <= i12 && i5 >= 0) {
            this.zzj = i11 + i5;
            return;
        }
        if (i5 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.zzl;
        int i14 = i13 + i11;
        int i15 = this.zzm;
        if (i14 + i5 > i15) {
            zzA((i15 - i13) - i11);
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i14;
        this.zzh = 0;
        this.zzj = 0;
        while (i12 < i5) {
            try {
                long j8 = i5 - i12;
                try {
                    long jSkip = this.zzf.skip(j8);
                    if (jSkip < 0 || jSkip > j8) {
                        String strValueOf = String.valueOf(this.zzf.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (zzifh e7) {
                    e7.zza();
                    throw e7;
                }
            } catch (Throwable th) {
                this.zzl += i12;
                zzF();
                throw th;
            }
        }
        this.zzl += i12;
        zzF();
        if (i12 >= i5) {
            return;
        }
        int i16 = this.zzh;
        int i17 = i16 - this.zzj;
        this.zzj = i16;
        zzG(1);
        while (true) {
            int i18 = i5 - i17;
            int i19 = this.zzh;
            if (i18 <= i19) {
                this.zzj = i18;
                return;
            } else {
                i17 += i19;
                this.zzj = i19;
                zzG(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzB(int i5) throws zzifh {
        if (i5 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.zzl + this.zzj + i5;
        if (i10 < 0) {
            throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzm;
        if (i10 > i11) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i10;
        zzF();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzC(int i5) {
        this.zzm = i5;
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzD() throws IOException {
        return this.zzj == this.zzh && !zzP(1);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzE() {
        return this.zzl + this.zzj;
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
            if (this.zzh - this.zzj < 10) {
                while (i11 < 10) {
                    if (zzz() < 0) {
                        i11++;
                    }
                }
                throw new zzifh("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zzg;
                int i12 = this.zzj;
                this.zzj = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw new zzifh("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i10 == 1) {
            zzA(8);
            return true;
        }
        if (i10 == 2) {
            zzA(zzu());
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
        zzA(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i5 = this.zzh;
            int i10 = this.zzj;
            if (iZzu <= i5 - i10) {
                String str = new String(this.zzg, i10, iZzu, StandardCharsets.UTF_8);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzu > this.zzh) {
            return new String(zzQ(iZzu, false), StandardCharsets.UTF_8);
        }
        zzG(iZzu);
        String str2 = new String(this.zzg, this.zzj, iZzu, StandardCharsets.UTF_8);
        this.zzj += iZzu;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzm() throws IOException {
        byte[] bArrZzQ;
        int iZzu = zzu();
        int i5 = this.zzj;
        int i10 = this.zzh;
        if (iZzu <= i10 - i5 && iZzu > 0) {
            bArrZzQ = this.zzg;
            this.zzj = i5 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i5 = 0;
            if (iZzu <= i10) {
                zzG(iZzu);
                bArrZzQ = this.zzg;
                this.zzj = iZzu;
            } else {
                bArrZzQ = zzQ(iZzu, false);
            }
        }
        return zzihp.zze(bArrZzQ, i5, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final zzidl zzn() throws IOException {
        int iZzu = zzu();
        int i5 = this.zzh;
        int i10 = this.zzj;
        if (iZzu <= i5 - i10 && iZzu > 0) {
            zzidl zzidlVarZzu = zzidl.zzu(this.zzg, i10, iZzu, false);
            this.zzj += iZzu;
            return zzidlVarZzu;
        }
        if (iZzu == 0) {
            return zzidl.zza;
        }
        if (iZzu < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzR = zzR(iZzu);
        if (bArrZzR != null) {
            return zzidl.zzu(bArrZzR, 0, bArrZzR.length, false);
        }
        int i11 = this.zzj;
        int i12 = this.zzh;
        int i13 = i12 - i11;
        this.zzl += i12;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(iZzu - i13);
        byte[] bArr = new byte[iZzu];
        System.arraycopy(this.zzg, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return zzidl.zzv(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzs() throws IOException {
        return zzidp.zzM(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzt() throws IOException {
        return zzidp.zzN(zzv());
    }

    public final int zzu() throws IOException {
        int i5;
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (i11 != i10) {
            byte[] bArr = this.zzg;
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.zzj = i12;
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
                this.zzj = i13;
                return i5;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j8;
        long j10;
        long j11;
        int i5 = this.zzj;
        int i10 = this.zzh;
        if (i10 != i5) {
            byte[] bArr = this.zzg;
            int i11 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzj = i11;
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
                this.zzj = i12;
                return j11;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((zzz() & 128) == 0) {
                return j8;
            }
        }
        throw new zzifh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        int i5 = this.zzj;
        if (this.zzh - i5 < 4) {
            zzG(4);
            i5 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i5 + 4;
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long zzy() throws IOException {
        int i5 = this.zzj;
        if (this.zzh - i5 < 8) {
            zzG(8);
            i5 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i5 + 8;
        long j8 = bArr[i5];
        long j10 = bArr[i5 + 2];
        long j11 = bArr[i5 + 3];
        return ((bArr[i5 + 6] & 255) << 48) | (j8 & 255) | ((bArr[i5 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 7] & 255) << 56);
    }

    public final byte zzz() throws IOException {
        if (this.zzj == this.zzh) {
            zzG(1);
        }
        byte[] bArr = this.zzg;
        int i5 = this.zzj;
        this.zzj = i5 + 1;
        return bArr[i5];
    }
}
