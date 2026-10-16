package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzeu {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgxd zzc = zzgxd.zzm(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzeu(byte[] bArr, int i5) {
        this.zze = bArr;
        this.zzg = i5;
    }

    private final char zzS(ByteOrder byteOrder, int i5) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i10 = this.zzf + i5;
            return zzhak.zza(bArr[i10], bArr[i10 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i11 = this.zzf + i5;
        return zzhak.zza(bArr2[i11 + 1], bArr2[i11]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j8 = i;
                char c10 = (char) j8;
                zzgtr.zze(((long) c10) == j8, "Out of range: %s", j8);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.zzf = zzhaq.zza(iZzU & 255) + this.zzf;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(Charset charset) {
        int codePoint;
        int i5;
        int iZzY;
        zzgtr.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i10 = this.zzf;
            int i11 = this.zzg;
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i10, i11, "position=", ", limit=", new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length())));
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b5 = this.zze[this.zzf];
            if ((b5 & 128) == 0) {
                codePoint = b5 & ForkServer.ERROR;
                return (codePoint << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.zze[this.zzf];
            if ((b10 & 128) == 0) {
                i5 = 1;
            } else if ((b10 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i5 = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i13 = this.zzf;
                    if (zzX(bArr[i13 + 1]) && zzX(bArr[i13 + 2])) {
                        i5 = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i14 = this.zzf;
                    if (zzX(bArr2[i14 + 1]) && zzX(bArr2[i14 + 2]) && zzX(bArr2[i14 + 3])) {
                        i5 = 4;
                    }
                }
                i5 = 0;
            }
            if (i5 == 1) {
                iZzY = this.zze[this.zzf] & ForkServer.ERROR;
            } else if (i5 == 2) {
                byte[] bArr3 = this.zze;
                int i15 = this.zzf;
                iZzY = zzY(0, 0, bArr3[i15], bArr3[i15 + 1]);
            } else {
                if (i5 != 3) {
                    if (i5 == 4) {
                        byte[] bArr4 = this.zze;
                        int i16 = this.zzf;
                        iZzY = zzY(bArr4[i16], bArr4[i16 + 1], bArr4[i16 + 2], bArr4[i16 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i17 = this.zzf;
                iZzY = zzY(0, bArr5[i17] & 15, bArr5[i17 + 1], bArr5[i17 + 2]);
            }
            i12 = i5;
            codePoint = iZzY;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i12 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i12 = 4;
            }
        }
        return (codePoint << 8) | i12;
    }

    private static int zzV(Charset charset) {
        zzgtr.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i5) {
        if (!zzd.get() || zzd() >= i5) {
            return;
        }
        int iZzd = zzd();
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i5, iZzd, "bytesNeeded= ", ", bytesLeft=", new StringBuilder(String.valueOf(i5).length() + 25 + String.valueOf(iZzd).length())));
    }

    private static boolean zzX(byte b5) {
        return (b5 & 192) == 128;
    }

    private static int zzY(int i5, int i10, int i11, int i12) {
        return zzhaq.zze((byte) 0, zzhau.zza(((i5 & 7) << 2) | ((i10 & 48) >> 4)), zzhau.zza(((i11 & 60) >> 2) | ((i10 & 15) << 4)), zzhau.zza((i12 & 63) | ((i11 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        long j8 = bArr[i5];
        int i11 = i5 + 2;
        this.zzf = i11;
        long j10 = bArr[i10];
        this.zzf = i5 + 3;
        long j11 = bArr[i11];
        this.zzf = i5 + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j8) | ((j10 & 255) << 8) | ((j11 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        int i12 = i5 + 2;
        this.zzf = i12;
        int i13 = bArr[i10] & ForkServer.ERROR;
        int i14 = i5 + 3;
        this.zzf = i14;
        int i15 = bArr[i12] & ForkServer.ERROR;
        this.zzf = i5 + 4;
        return (bArr[i14] & ForkServer.ERROR) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        int i12 = i5 + 2;
        this.zzf = i12;
        int i13 = bArr[i10] & ForkServer.ERROR;
        int i14 = i5 + 3;
        this.zzf = i14;
        int i15 = bArr[i12] & ForkServer.ERROR;
        this.zzf = i5 + 4;
        return ((bArr[i14] & ForkServer.ERROR) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        long j8 = bArr[i5];
        int i11 = i5 + 2;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i5 + 3;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i5 + 4;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i5 + 5;
        this.zzf = i14;
        long j13 = bArr[i13];
        int i15 = i5 + 6;
        this.zzf = i15;
        long j14 = bArr[i14];
        this.zzf = i5 + 7;
        long j15 = bArr[i15];
        this.zzf = i5 + 8;
        return ((j15 & 255) << 8) | ((j8 & 255) << 56) | ((j10 & 255) << 48) | ((j11 & 255) << 40) | ((j12 & 255) << 32) | ((j13 & 255) << 24) | ((j14 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        long j8 = bArr[i5];
        int i11 = i5 + 2;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i5 + 3;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i5 + 4;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i5 + 5;
        this.zzf = i14;
        long j13 = bArr[i13];
        int i15 = i5 + 6;
        this.zzf = i15;
        long j14 = bArr[i14];
        this.zzf = i5 + 7;
        long j15 = bArr[i15];
        this.zzf = i5 + 8;
        return ((j15 & 255) << 48) | (j8 & 255) | ((j10 & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((j13 & 255) << 32) | ((j14 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.zzf = i5 + 2;
        int i12 = bArr[i10] & ForkServer.ERROR;
        this.zzf = i5 + 4;
        return (i11 << 8) | i12;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        throw new IllegalStateException(N0.a.d(iZzB, "Top bit not zero: ", new StringBuilder(String.valueOf(iZzB).length() + 18)));
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        throw new IllegalStateException(N0.a.d(iZzC, "Top bit not zero: ", new StringBuilder(String.valueOf(iZzC).length() + 18)));
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(jZzD).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(jZzD);
        throw new IllegalStateException(sb2.toString());
    }

    public final String zzK(int i5, Charset charset) {
        zzW(i5);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        String str = new String(bArr, i10, i5, charset);
        this.zzf = i10 + i5;
        return str;
    }

    public final String zzL(int i5) {
        zzW(i5);
        if (i5 == 0) {
            return "";
        }
        int i10 = this.zzf;
        int i11 = (i10 + i5) - 1;
        String strZzk = zzfm.zzk(this.zze, i10, (i11 >= this.zzg || this.zze[i11] != 0) ? i5 : i5 - 1);
        this.zzf += i5;
        return strZzk;
    }

    public final String zzM(char c10) {
        if (zzd() == 0) {
            return null;
        }
        int i5 = this.zzf;
        while (i5 < this.zzg && this.zze[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        String strZzk = zzfm.zzk(bArr, i10, i5 - i10);
        this.zzf = i5;
        if (i5 < this.zzg) {
            this.zzf = i5 + 1;
        }
        return strZzk;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzN(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzgxd r0 = com.google.android.gms.internal.ads.zzeu.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "Unsupported charset: %s"
            com.google.android.gms.internal.ads.zzgtr.zzf(r0, r1, r5)
            int r0 = r4.zzd()
            if (r0 != 0) goto L13
            r5 = 0
            return r5
        L13:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L1e
            r4.zzR()
        L1e:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r2 = 1
            if (r1 != 0) goto L58
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2e
            goto L58
        L2e:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L48
            goto L58
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unsupported charset: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L58:
            int r0 = r4.zzf
        L5a:
            int r1 = r4.zzg
            int r3 = r2 + (-1)
            int r3 = r1 - r3
            if (r0 >= r3) goto Lb7
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L72
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L7c
        L72:
            byte[] r1 = r4.zze
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzfm.zzl(r1)
            if (r1 != 0) goto Lb8
        L7c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L8c
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
        L8c:
            byte[] r1 = r4.zze
            r3 = r1[r0]
            if (r3 != 0) goto L9c
            int r3 = r0 + 1
            r1 = r1[r3]
            boolean r1 = com.google.android.gms.internal.ads.zzfm.zzl(r1)
            if (r1 != 0) goto Lb8
        L9c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lb5
            int r1 = r0 + 1
            byte[] r3 = r4.zze
            r1 = r3[r1]
            if (r1 != 0) goto Lb5
            r1 = r3[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzfm.zzl(r1)
            if (r1 == 0) goto Lb5
            goto Lb8
        Lb5:
            int r0 = r0 + r2
            goto L5a
        Lb7:
            r0 = r1
        Lb8:
            int r1 = r4.zzf
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzK(r0, r5)
            int r1 = r4.zzf
            int r2 = r4.zzg
            if (r1 == r2) goto Ld4
            char[] r1 = com.google.android.gms.internal.ads.zzeu.zza
            char r1 = r4.zzT(r5, r1)
            r2 = 13
            if (r1 != r2) goto Ld4
            char[] r1 = com.google.android.gms.internal.ads.zzeu.zzb
            r4.zzT(r5, r1)
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeu.zzN(java.nio.charset.Charset):java.lang.String");
    }

    public final long zzO() {
        int i5;
        zzW(1);
        long j8 = this.zze[this.zzf];
        int i10 = 7;
        while (true) {
            i5 = 0;
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j8) != 0) {
                i10--;
            } else if (i10 < 6) {
                j8 &= r7 - 1;
                i5 = 7 - i10;
            } else if (i10 == 7) {
                i5 = 1;
            }
        }
        if (i5 == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 35);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j8);
            throw new NumberFormatException(sb2.toString());
        }
        zzW(i5);
        for (int i11 = 1; i11 < i5; i11++) {
            if ((this.zze[this.zzf + i11] & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j8).length() + 42);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j8);
                throw new NumberFormatException(sb3.toString());
            }
            j8 = (j8 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.zzf += i5;
        return j8;
    }

    public final long zzP() {
        long j8 = 0;
        for (int i5 = 0; i5 < 9; i5++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j8 |= (127 & jZzs) << (i5 * 7);
            if ((jZzs & 128) == 0) {
                return j8;
            }
        }
        return j8;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i5 = this.zzf;
            if (bArr[i5] == -17 && bArr[i5 + 1] == -69 && bArr[i5 + 2] == -65) {
                this.zzf = i5 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i10 = this.zzf;
        byte b5 = bArr2[i10];
        if (b5 == -2) {
            if (bArr2[i10 + 1] != -1) {
                return null;
            }
            this.zzf = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b5 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.zzf = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i5) {
        byte[] bArr = this.zze;
        if (bArr.length < i5) {
            bArr = new byte[i5];
        }
        zzb(bArr, i5);
    }

    public final void zzb(byte[] bArr, int i5) {
        this.zze = bArr;
        this.zzg = i5;
        this.zzf = 0;
    }

    public final void zzc(int i5) {
        byte[] bArr = this.zze;
        if (i5 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i5);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i5) {
        boolean z2 = false;
        if (i5 >= 0 && i5 <= this.zze.length) {
            z2 = true;
        }
        zzgtr.zza(z2);
        this.zzg = i5;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i5) {
        boolean z2 = false;
        if (i5 >= 0 && i5 <= this.zzg) {
            z2 = true;
        }
        zzgtr.zza(z2);
        this.zzf = i5;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i5) {
        zzh(this.zzf + i5);
    }

    public final void zzl(zzet zzetVar, int i5) {
        zzm(zzetVar.zza, 0, i5);
        zzetVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i5, int i10) {
        zzW(i10);
        System.arraycopy(this.zze, this.zzf, bArr, i5, i10);
        this.zzf += i10;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & ForkServer.ERROR;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzhaq.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i5 = this.zzf;
        int i10 = this.zzg;
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "position=", ", limit=", new StringBuilder(String.valueOf(i5).length() + 17 + String.valueOf(i10).length())));
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i5 = this.zzf;
        int i10 = this.zzg;
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "position=", ", limit=", new StringBuilder(String.valueOf(i5).length() + 17 + String.valueOf(i10).length())));
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        return bArr[i5] & ForkServer.ERROR;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.zzf = i5 + 2;
        return (bArr[i10] & ForkServer.ERROR) | (i11 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.zzf = i5 + 2;
        return ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.zzf = i5 + 2;
        return (short) ((bArr[i10] & ForkServer.ERROR) | (i11 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.zzf = i5 + 2;
        return (short) (((bArr[i10] & ForkServer.ERROR) << 8) | i11);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        int i12 = i5 + 2;
        this.zzf = i12;
        int i13 = bArr[i10] & ForkServer.ERROR;
        this.zzf = i5 + 3;
        return (bArr[i12] & ForkServer.ERROR) | (i11 << 16) | (i13 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        int i12 = i5 + 2;
        this.zzf = i12;
        int i13 = bArr[i10] & ForkServer.ERROR;
        this.zzf = i5 + 3;
        return (bArr[i12] & ForkServer.ERROR) | ((i11 << 24) >> 8) | (i13 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i10 = i5 + 1;
        this.zzf = i10;
        long j8 = bArr[i5];
        int i11 = i5 + 2;
        this.zzf = i11;
        long j10 = bArr[i10];
        this.zzf = i5 + 3;
        long j11 = bArr[i11];
        this.zzf = i5 + 4;
        return (bArr[r3] & 255) | ((j8 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public zzeu() {
        this.zze = zzfm.zzb;
    }

    public zzeu(int i5) {
        this.zze = new byte[i5];
        this.zzg = i5;
    }

    public zzeu(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
