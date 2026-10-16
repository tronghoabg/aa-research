package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
public final class zzns {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    public zzns() {
    }

    public static int zza(int i5, int i10) {
        if (i5 % 2 != 0) {
            return (i5 | i10) - (i5 & i10);
        }
        return ((~i5) & i10) | ((~i10) & i5);
    }

    public static String zze(String str, byte[] bArr, zznt zzntVar) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        return new String(new zzns(bArr, bArr2).zzd(bArr3), zza);
    }

    public static String zzf(String str, byte[] bArr, zznt zzntVar) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] bArrZzd = new zzns(bArr, bArr2).zzd(str.getBytes(zza));
        int length = bArrZzd.length;
        byte[] bArr3 = new byte[length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(bArrZzd, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final void zzb(int i5, int i10, int i11, int i12) {
        zzc(i5, i10, i12, 16);
        zzc(i11, i12, i10, 12);
        zzc(i5, i10, i12, 8);
        zzc(i11, i12, i10, 7);
    }

    public final void zzc(int i5, int i10, int i11, int i12) {
        int[] iArr = this.zzb;
        int i13 = iArr[i5] + iArr[i10];
        iArr[i5] = i13;
        int iZza = zza(iArr[i11], i13);
        iArr[i11] = iZza;
        iArr[i11] = (iZza << i12) | (iZza >>> (32 - i12));
    }

    public final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i5 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i10 = 0; i10 < 10; i10++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = this.zzb[i11];
                int i13 = i11 * 4;
                bArr3[i13] = (byte) (i12 & 255);
                bArr3[i13 + 1] = (byte) ((i12 >> 8) & 255);
                bArr3[i13 + 2] = (byte) ((i12 >> 16) & 255);
                bArr3[i13 + 3] = (byte) ((i12 >> 24) & 255);
            }
            for (int i14 = 0; i14 < Math.min(64, length); i14++) {
                int i15 = i5 + i14;
                bArr2[i15] = (byte) zza(bArr3[i14], bArr[i15]);
            }
            this.zzg++;
            length -= 64;
            i5 += 64;
        }
        return bArr2;
    }

    public zzns(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i5 = 0; i5 < 4; i5++) {
            this.zzb[i5] = zza(this.zzd[i5], 2131181306);
        }
        for (int i10 = 4; i10 < 12; i10++) {
            this.zzb[i10] = zzg(this.zze, (i10 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i11 = 13; i11 < 16; i11++) {
            this.zzb[i11] = zzg(this.zzf, (i11 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }
}
