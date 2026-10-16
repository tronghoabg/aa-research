package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzhki {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        int i5 = 17;
        byte[] bArr3 = new byte[17];
        long j8 = 0;
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j14 = j8 + (j10 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j11 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j12 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = ((j18 >> 26) * 5) + j13;
                long j21 = j20 >> 26;
                long j22 = j20 & 67108863;
                long j23 = j22 + 5;
                long j24 = (j10 & 67108863) + j21;
                long j25 = j24 + (j23 >> 26);
                long j26 = (j25 >> 26) + j15;
                long j27 = j17 + (j26 >> 26);
                long j28 = (j19 + (j27 >> 26)) - 67108864;
                long j29 = j28 >> 63;
                long j30 = ~j29;
                long j31 = (j24 & j29) | (j25 & 67108863 & j30);
                long j32 = (j15 & j29) | (j26 & 67108863 & j30);
                long j33 = (j17 & j29) | (j27 & 67108863 & j30);
                long j34 = (j19 & j29) | (j28 & j30);
                long jZzb = (((j22 & j29) | (j23 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + zzb(bArr, 16);
                long jZzb2 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + zzb(bArr, 20);
                long jZzb3 = (((j33 << 14) | (j32 >> 12)) & 4294967295L) + zzb(bArr, 24);
                long jZzb4 = (((j33 >> 18) | (j34 << 8)) & 4294967295L) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & 4294967295L, 0);
                long j35 = jZzb2 + (jZzb >> 32);
                zzd(bArr4, j35 & 4294967295L, 4);
                long j36 = jZzb3 + (j35 >> 32);
                zzd(bArr4, j36 & 4294967295L, 8);
                zzd(bArr4, (jZzb4 + (j36 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i5, (byte) 0);
            }
            long j37 = jZzc5 * 5;
            long j38 = jZzc4 * 5;
            long j39 = jZzc3 * 5;
            long jZzc6 = j13 + zzc(bArr3, 0, 0);
            long jZzc7 = j10 + zzc(bArr3, 3, 2);
            long jZzc8 = j8 + zzc(bArr3, 6, 4);
            long jZzc9 = j11 + zzc(bArr3, 9, 6);
            long jZzc10 = j12 + (zzc(bArr3, 12, 8) | (bArr3[16] << 24));
            long j40 = jZzc7 * jZzc;
            long j41 = jZzc7 * jZzc2;
            long j42 = jZzc8 * jZzc;
            long j43 = jZzc7 * jZzc3;
            long j44 = jZzc8 * jZzc2;
            long j45 = jZzc9 * jZzc;
            long j46 = jZzc7 * jZzc4;
            long j47 = jZzc8 * jZzc3;
            long j48 = jZzc9 * jZzc2;
            long j49 = jZzc10 * jZzc;
            long j50 = (jZzc2 * 5 * jZzc10) + (jZzc9 * j39) + (jZzc8 * j38) + (jZzc7 * j37) + (jZzc6 * jZzc);
            long j51 = j50 & 67108863;
            long j52 = jZzc9 * j38;
            long j53 = j39 * jZzc10;
            long j54 = j53 + j52 + (jZzc8 * j37) + (jZzc6 * jZzc2) + j40 + (j50 >> 26);
            long j55 = j38 * jZzc10;
            long j56 = j55 + (jZzc9 * j37) + (jZzc6 * jZzc3) + j41 + j42 + (j54 >> 26);
            long j57 = (jZzc10 * j37) + (jZzc6 * jZzc4) + j43 + j44 + j45 + (j56 >> 26);
            long j58 = (jZzc6 * jZzc5) + j46 + j47 + j48 + j49 + (j57 >> 26);
            long j59 = ((j58 >> 26) * 5) + j51;
            j10 = (j54 & 67108863) + (j59 >> 26);
            i10 += 16;
            j8 = j56 & 67108863;
            j11 = j57 & 67108863;
            j12 = j58 & 67108863;
            i5 = 17;
            j13 = j59 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return (((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16)) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i5, int i10) {
        return (zzb(bArr, i5) >> i10) & 67108863;
    }

    private static void zzd(byte[] bArr, long j8, int i5) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i5 + i10] = (byte) (255 & j8);
            j8 >>= 8;
        }
    }
}
