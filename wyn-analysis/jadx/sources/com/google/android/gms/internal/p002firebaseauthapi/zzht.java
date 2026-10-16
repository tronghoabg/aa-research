package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class zzht {
    private static long zza(byte[] bArr, int i5, int i10) {
        return (zza(bArr, i5) >> i10) & 67108863;
    }

    private static long zza(byte[] bArr, int i5) {
        return (((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j8, int i5) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i5 + i10] = (byte) (255 & j8);
            i10++;
            j8 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j8 = jZza2 * 5;
            long j10 = jZza3 * 5;
            long j11 = jZza4 * 5;
            long j12 = jZza5 * 5;
            int i5 = 17;
            byte[] bArr3 = new byte[17];
            long j13 = 0;
            int i10 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            while (i10 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i10);
                System.arraycopy(bArr2, i10, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i5, (byte) 0);
                }
                long jZza6 = j17 + zza(bArr3, 0, 0);
                long jZza7 = j13 + zza(bArr3, 3, 2);
                long jZza8 = j14 + zza(bArr3, 6, 4);
                long jZza9 = j15 + zza(bArr3, 9, 6);
                long jZza10 = j16 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j18 = (jZza10 * j8) + (jZza9 * j10) + (jZza8 * j11) + (jZza7 * j12) + (jZza6 * jZza);
                long j19 = (jZza10 * j10) + (jZza9 * j11) + (jZza8 * j12) + (jZza7 * jZza) + (jZza6 * jZza2);
                long j20 = (jZza10 * j11) + (jZza9 * j12) + (jZza8 * jZza) + (jZza7 * jZza2) + (jZza6 * jZza3);
                long j21 = (jZza10 * j12) + (jZza9 * jZza) + (jZza8 * jZza2) + (jZza7 * jZza3) + (jZza6 * jZza4);
                long j22 = jZza9 * jZza2;
                long j23 = jZza10 * jZza;
                long j24 = j19 + (j18 >> 26);
                long j25 = j20 + (j24 >> 26);
                long j26 = j21 + (j25 >> 26);
                long j27 = j23 + j22 + (jZza8 * jZza3) + (jZza7 * jZza4) + (jZza6 * jZza5) + (j26 >> 26);
                long j28 = j27 >> 26;
                j16 = j27 & 67108863;
                long j29 = (j28 * 5) + (j18 & 67108863);
                i10 += 16;
                j14 = j25 & 67108863;
                j15 = j26 & 67108863;
                i5 = 17;
                j17 = j29 & 67108863;
                j13 = (j24 & 67108863) + (j29 >> 26);
            }
            long j30 = j14 + (j13 >> 26);
            long j31 = j30 & 67108863;
            long j32 = j15 + (j30 >> 26);
            long j33 = j32 & 67108863;
            long j34 = j16 + (j32 >> 26);
            long j35 = j34 & 67108863;
            long j36 = ((j34 >> 26) * 5) + j17;
            long j37 = j36 >> 26;
            long j38 = j36 & 67108863;
            long j39 = (j13 & 67108863) + j37;
            long j40 = j38 + 5;
            long j41 = j40 & 67108863;
            long j42 = (j40 >> 26) + j39;
            long j43 = j31 + (j42 >> 26);
            long j44 = j33 + (j43 >> 26);
            long j45 = (j35 + (j44 >> 26)) - 67108864;
            long j46 = j45 >> 63;
            long j47 = ~j46;
            long j48 = (j39 & j46) | (j42 & 67108863 & j47);
            long j49 = (j31 & j46) | (j43 & 67108863 & j47);
            long j50 = (j33 & j46) | (j44 & 67108863 & j47);
            long j51 = ((j38 & j46) | (j41 & j47) | (j48 << 26)) & 4294967295L;
            long j52 = ((j48 >> 6) | (j49 << 20)) & 4294967295L;
            long j53 = ((j49 >> 12) | (j50 << 14)) & 4294967295L;
            long j54 = ((((j45 & j47) | (j35 & j46)) << 8) | (j50 >> 18)) & 4294967295L;
            long jZza11 = j51 + zza(bArr, 16);
            long j55 = jZza11 & 4294967295L;
            long jZza12 = j52 + zza(bArr, 20) + (jZza11 >> 32);
            long jZza13 = j53 + zza(bArr, 24) + (jZza12 >> 32);
            long jZza14 = (j54 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j55, 0);
            zza(bArr4, jZza12 & 4294967295L, 4);
            zza(bArr4, jZza13 & 4294967295L, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
