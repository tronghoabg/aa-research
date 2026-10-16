package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzhlw {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzc = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzd = {67108863, 33554431};
    private static final int[] zze = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i5 = 0; i5 < 10; i5++) {
            jArr[i5] = jArr2[i5] + jArr3[i5];
        }
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i5 = 0; i5 < 10; i5++) {
            jArr[i5] = jArr2[i5] - jArr3[i5];
        }
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j8 = jArr[8];
        long j10 = jArr[18];
        long j11 = j8 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j10 + j10 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j14 + j14 + j15;
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j18 + j18 + j19;
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j22 + j22 + j23;
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j26 + j26 + j27;
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j30 + j30 + j31;
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j34 + j34 + j35;
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j38 + j38 + j39;
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j42 + j42 + j43;
        jArr[0] = j44;
        jArr[0] = j44 + j42;
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i5 = 0;
        while (i5 < 10) {
            long j8 = jArr[i5];
            long j10 = j8 / 67108864;
            jArr[i5] = j8 - (j10 << 26);
            int i10 = i5 + 1;
            long j11 = jArr[i10] + j10;
            jArr[i10] = j11;
            long j12 = j11 / 33554432;
            jArr[i10] = j11 - (j12 << 25);
            i5 += 2;
            jArr[i5] = jArr[i5] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j14 + j14 + j15;
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static void zze(long[] jArr, long[] jArr2, long[] jArr3) {
        long j8 = jArr2[0];
        long j10 = jArr3[0];
        long j11 = j8 * j10;
        long j12 = jArr3[1];
        long j13 = jArr2[1];
        long j14 = (j13 * j10) + (j8 * j12);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        long j17 = ((j13 + j13) * j12) + (j8 * j15) + (j16 * j10);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        long j20 = (j13 * j15) + (j16 * j12) + (j8 * j18) + (j19 * j10);
        long j21 = jArr3[4];
        long j22 = jArr2[4];
        long j23 = (j13 * j18) + (j19 * j12);
        long j24 = j23 + j23 + (j16 * j15) + (j8 * j21) + (j22 * j10);
        long j25 = jArr3[5];
        long j26 = jArr2[5];
        long j27 = (j16 * j18) + (j19 * j15) + (j13 * j21) + (j22 * j12) + (j8 * j25) + (j26 * j10);
        long j28 = jArr3[6];
        long j29 = jArr2[6];
        long j30 = (j19 * j18) + (j13 * j25) + (j26 * j12);
        long j31 = j30 + j30 + (j16 * j21) + (j22 * j15) + (j8 * j28) + (j29 * j10);
        long j32 = jArr3[7];
        long j33 = jArr2[7];
        long j34 = (j19 * j21) + (j22 * j18) + (j16 * j25) + (j26 * j15) + (j13 * j28) + (j29 * j12) + (j8 * j32) + (j33 * j10);
        long j35 = jArr3[8];
        long j36 = jArr2[8];
        long j37 = (j19 * j25) + (j26 * j18) + (j13 * j32) + (j33 * j12);
        long j38 = j37 + j37 + (j22 * j21) + (j16 * j28) + (j29 * j15) + (j8 * j35) + (j36 * j10);
        long j39 = jArr3[9];
        long j40 = jArr2[9];
        long j41 = (j22 * j25) + (j26 * j21) + (j19 * j28) + (j29 * j18) + (j16 * j32) + (j33 * j15) + (j13 * j35) + (j36 * j12) + (j8 * j39) + (j10 * j40);
        long j42 = (j26 * j25) + (j19 * j32) + (j33 * j18) + (j13 * j39) + (j12 * j40);
        long j43 = (j26 * j32) + (j33 * j25) + (j19 * j39) + (j18 * j40);
        long j44 = (j33 * j32) + (j26 * j39) + (j25 * j40);
        long j45 = (j33 * j35) + (j36 * j32) + (j29 * j39) + (j28 * j40);
        long j46 = (j32 * j40) + (j33 * j39);
        zzc(new long[]{j11, j14, j17, j20, j24, j27, j31, j34, j38, j41, j42 + j42 + (j22 * j28) + (j29 * j21) + (j16 * j35) + (j36 * j15), (j26 * j28) + (j29 * j25) + (j22 * j32) + (j33 * j21) + (j19 * j35) + (j36 * j18) + (j16 * j39) + (j15 * j40), j43 + j43 + (j29 * j28) + (j22 * j35) + (j36 * j21), (j29 * j32) + (j33 * j28) + (j26 * j35) + (j36 * j25) + (j22 * j39) + (j21 * j40), j44 + j44 + (j29 * j35) + (j36 * j28), j45, j46 + j46 + (j36 * j35), (j35 * j40) + (j36 * j39), (j40 + j40) * j39}, jArr);
    }

    public static void zzf(long[] jArr, long[] jArr2) {
        long j8 = jArr2[0];
        long j10 = j8 * j8;
        long j11 = jArr2[1];
        long j12 = (j8 + j8) * j11;
        long j13 = jArr2[2];
        long j14 = (j8 * j13) + (j11 * j11);
        long j15 = jArr2[3];
        long j16 = (j8 * j15) + (j11 * j13);
        long j17 = jArr2[4];
        long j18 = (j13 * j13) + (j11 * 4 * j15) + ((j8 + j8) * j17);
        long j19 = jArr2[5];
        long j20 = (j13 * j15) + (j11 * j17) + (j8 * j19);
        long j21 = jArr2[6];
        long j22 = (j15 * j15) + (j13 * j17) + (j8 * j21) + ((j11 + j11) * j19);
        long j23 = jArr2[7];
        long j24 = (j15 * j17) + (j13 * j19) + (j11 * j21) + (j8 * j23);
        long j25 = jArr2[8];
        long j26 = (j15 * j19) + (j11 * j23);
        long j27 = j26 + j26 + (j13 * j21) + (j8 * j25);
        long j28 = j27 + j27 + (j17 * j17);
        long j29 = jArr2[9];
        long j30 = (j17 * j19) + (j15 * j21) + (j13 * j23) + (j11 * j25) + (j8 * j29);
        long j31 = (j11 * j29) + (j15 * j23);
        long j32 = j31 + j31 + (j19 * j19) + (j17 * j21) + (j13 * j25);
        long j33 = (j19 * j21) + (j17 * j23) + (j15 * j25) + (j13 * j29);
        long j34 = (j15 * j29) + (j19 * j23);
        long j35 = j34 + j34 + (j17 * j25);
        long j36 = j35 + j35 + (j21 * j21);
        long j37 = (j21 * j23) + (j19 * j25) + (j17 * j29);
        long j38 = (j23 * j23) + (j21 * j25) + ((j19 + j19) * j29);
        long j39 = (j21 * j29) + (j23 * j25);
        zzc(new long[]{j10, j12, j14 + j14, j16 + j16, j18, j20 + j20, j22 + j22, j24 + j24, j28, j30 + j30, j32 + j32, j33 + j33, j36, j37 + j37, j38 + j38, j39 + j39, (j23 * 4 * j29) + (j25 * j25), (j25 + j25) * j29, (j29 + j29) * j29}, jArr);
    }

    public static long[] zzg(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i5 = 0; i5 < 10; i5++) {
            int i10 = zzb[i5];
            jArr[i5] = (((((bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8)) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16)) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24)) >> zzc[i5]) & zzd[i5 & 1];
        }
        return jArr;
    }

    public static byte[] zzh(long[] jArr) {
        int i5;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j8 = jArrCopyOf[i12];
                int i13 = -((int) (((j8 >> 31) & j8) >> zze[i12 & 1]));
                jArrCopyOf[i12] = j8 + (i13 << r14);
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - i13;
            }
            long j10 = jArrCopyOf[9];
            jArrCopyOf[9] = j10 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j10 >> 31) & j10) >> 25))) * 19);
            i11++;
        }
        long j11 = jArrCopyOf[0];
        jArrCopyOf[0] = j11 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        int i14 = 0;
        while (i14 < 2) {
            int i15 = i10;
            while (i15 < 9) {
                long j12 = jArrCopyOf[i15];
                int i16 = i10;
                long j13 = j12 >> zze[i15 & 1];
                jArrCopyOf[i15] = j12 & zzd[r14];
                i15++;
                jArrCopyOf[i15] = jArrCopyOf[i15] + ((int) j13);
                i10 = i16;
                i14 = i14;
            }
            i14++;
        }
        int i17 = i10;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[i17] = (((int) (r2 >> 25)) * 19) + jArrCopyOf[i17];
        int i18 = ~((((int) r6) - 67108845) >> 31);
        for (int i19 = 1; i19 < 10; i19++) {
            int i20 = ~(((int) jArrCopyOf[i19]) ^ zzd[i19 & 1]);
            int i21 = i20 & (i20 << 16);
            int i22 = i21 & (i21 << 8);
            int i23 = i22 & (i22 << 4);
            int i24 = i23 & (i23 << 2);
            i18 &= (i24 & (i24 + i24)) >> 31;
        }
        jArrCopyOf[i17] = jArrCopyOf[i17] - (67108845 & i18);
        long j14 = 33554431 & i18;
        jArrCopyOf[1] = jArrCopyOf[1] - j14;
        for (i5 = 2; i5 < 10; i5 += 2) {
            jArrCopyOf[i5] = jArrCopyOf[i5] - (67108863 & i18);
            int i25 = i5 + 1;
            jArrCopyOf[i25] = jArrCopyOf[i25] - j14;
        }
        for (int i26 = i17; i26 < 10; i26++) {
            jArrCopyOf[i26] = jArrCopyOf[i26] << zzc[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = i17; i27 < 10; i27++) {
            int i28 = zzb[i27];
            long j15 = bArr[i28];
            long j16 = jArrCopyOf[i27];
            bArr[i28] = (byte) (j15 | (j16 & 255));
            bArr[i28 + 1] = (byte) (bArr[r5] | ((j16 >> 8) & 255));
            bArr[i28 + 2] = (byte) (bArr[r5] | ((j16 >> 16) & 255));
            bArr[i28 + 3] = (byte) (bArr[r4] | ((j16 >> 24) & 255));
        }
        return bArr;
    }
}
