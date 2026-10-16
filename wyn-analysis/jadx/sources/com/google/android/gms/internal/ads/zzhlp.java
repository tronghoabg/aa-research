package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzhlp {
    private static final zzhlk zzb = new zzhlk(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhlm zzc = new zzhlm(new zzhln(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i5;
        byte[] bArr2 = new byte[64];
        int i10 = 0;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = i10 + i10;
            bArr2[i11] = (byte) (bArr[i10] & 15);
            bArr2[i11 + 1] = (byte) ((bArr[i10] & ForkServer.ERROR) >> 4);
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < 63) {
            byte b5 = (byte) (bArr2[i12] + i13);
            bArr2[i12] = b5;
            int i14 = (b5 + 8) >> 4;
            bArr2[i12] = (byte) (b5 - (i14 << 4));
            i12++;
            i13 = i14;
        }
        bArr2[63] = (byte) (bArr2[63] + i13);
        zzhlm zzhlmVar = new zzhlm(zzc);
        zzhlo zzhloVar = new zzhlo();
        for (i5 = 1; i5 < 64; i5 += 2) {
            zzhlk zzhlkVar = new zzhlk(zzb);
            zzk(zzhlkVar, i5 / 2, bArr2[i5]);
            zzhlo.zza(zzhloVar, zzhlmVar);
            zzg(zzhlmVar, zzhloVar, zzhlkVar);
        }
        zzhln zzhlnVar = new zzhln();
        zzhln.zza(zzhlnVar, zzhlmVar);
        zzi(zzhlmVar, zzhlnVar);
        zzhln.zza(zzhlnVar, zzhlmVar);
        zzi(zzhlmVar, zzhlnVar);
        zzhln.zza(zzhlnVar, zzhlmVar);
        zzi(zzhlmVar, zzhlnVar);
        zzhln.zza(zzhlnVar, zzhlmVar);
        zzi(zzhlmVar, zzhlnVar);
        for (int i15 = 0; i15 < 64; i15 += 2) {
            zzhlk zzhlkVar2 = new zzhlk(zzb);
            zzk(zzhlkVar2, i15 / 2, bArr2[i15]);
            zzhlo.zza(zzhloVar, zzhlmVar);
            zzg(zzhlmVar, zzhloVar, zzhlkVar2);
        }
        zzhln zzhlnVar2 = new zzhln(zzhlmVar);
        long[] jArr = new long[10];
        zzhlw.zzf(jArr, zzhlnVar2.zza);
        long[] jArr2 = new long[10];
        zzhlw.zzf(jArr2, zzhlnVar2.zzb);
        long[] jArr3 = new long[10];
        zzhlw.zzf(jArr3, zzhlnVar2.zzc);
        long[] jArr4 = new long[10];
        zzhlw.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhlw.zzb(jArr5, jArr2, jArr);
        zzhlw.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhlw.zze(jArr6, jArr, jArr2);
        zzhlw.zze(jArr6, jArr6, zzhlr.zza);
        zzhlw.zza(jArr6, jArr6, jArr4);
        zzhlw.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhlw.zzh(jArr5), zzhlw.zzh(jArr6))) {
            return zzhlnVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zziak.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i5 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i5;
        bArrDigest[31] = (byte) (i5 | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b5;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i5 = 31;
        while (true) {
            if (i5 < 0) {
                break;
            }
            int i10 = bArrCopyOfRange[i5] & ForkServer.ERROR;
            int i11 = zza[i5] & ForkServer.ERROR;
            if (i10 == i11) {
                i5--;
                bArr4 = bArr2;
                bArr5 = bArr3;
            } else if (i10 < i11) {
                MessageDigest messageDigest = (MessageDigest) zziak.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j8 = (jZzo11 * 666643) + jZzn5;
                long j10 = (jZzo10 * 666643) + jZzn4;
                long j11 = (jZzn10 * 666643) + (jZzo4 & 2097151);
                long j12 = (j11 + 1048576) >> 21;
                long j13 = j12 << 21;
                long j14 = (jZzn10 * 654183) + (jZzo10 * 470296) + j8;
                long j15 = (j14 + 1048576) >> 21;
                long j16 = j15 << 21;
                long j17 = (jZzn10 * 136657) + (((jZzo11 * 654183) + ((jZzn11 * 470296) + ((jZzo12 * 666643) + (jZzn6 & 2097151)))) - (jZzo10 * 997805));
                long j18 = (j17 + 1048576) >> 21;
                long j19 = j18 << 21;
                long j20 = ((jZzo11 * 136657) + (((jZzo12 * 654183) + ((jZzo13 * 470296) + (jZzo7 & 2097151))) - (jZzn11 * 997805))) - (jZzo10 * 683901);
                long j21 = (j20 + 1048576) >> 21;
                long j22 = ((jZzo12 * 136657) + ((jZzo8 & 2097151) - (jZzo13 * 997805))) - (jZzn11 * 683901);
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = jZzn9 - (jZzo13 * 683901);
                long j26 = (j25 + 1048576) >> 21;
                long j27 = (jZzn10 * 470296) + j10 + j12;
                long j28 = (j27 + 1048576) >> 21;
                long j29 = j28 << 21;
                long j30 = (((jZzo10 * 654183) + ((jZzo11 * 470296) + ((jZzn11 * 666643) + (jZzo5 & 2097151)))) - (jZzn10 * 997805)) + j15;
                long j31 = (j30 + 1048576) >> 21;
                long j32 = j31 << 21;
                long j33 = (((jZzo10 * 136657) + (((jZzn11 * 654183) + ((jZzo12 * 470296) + ((jZzo13 * 666643) + (jZzo6 & 2097151)))) - (jZzo11 * 997805))) - (jZzn10 * 683901)) + j18;
                long j34 = (j33 + 1048576) >> 21;
                long j35 = j34 << 21;
                long j36 = (((jZzn11 * 136657) + (((jZzo13 * 654183) + (jZzn7 & 2097151)) - (jZzo12 * 997805))) - (jZzo11 * 683901)) + j21;
                long j37 = (j36 + 1048576) >> 21;
                long j38 = (((jZzo13 * 136657) + jZzn8) - (jZzo12 * 683901)) + j23;
                long j39 = (j38 + 1048576) >> 21;
                long j40 = (j20 - (j21 << 21)) + j34;
                long j41 = (j40 * 666643) + jZzn;
                long j42 = (j41 + 1048576) >> 21;
                long j43 = j42 << 21;
                long j44 = (j22 - j24) + j37;
                long j45 = j36 - (j37 << 21);
                long j46 = (j40 * 654183) + (j45 * 470296) + (j44 * 666643) + (jZzn2 & 2097151);
                long j47 = (j46 + 1048576) >> 21;
                long j48 = j47 << 21;
                long j49 = (j25 - (j26 << 21)) + j39;
                long j50 = j38 - (j39 << 21);
                long j51 = (j40 * 136657) + (((j44 * 654183) + ((j50 * 470296) + ((j49 * 666643) + (jZzo3 & 2097151)))) - (j45 * 997805));
                long j52 = (j51 + 1048576) >> 21;
                long j53 = j52 << 21;
                long j54 = (jZzo9 & 2097151) + j26;
                long j55 = ((j44 * 136657) + (((j49 * 654183) + ((j54 * 470296) + (j11 - j13))) - (j50 * 997805))) - (j45 * 683901);
                long j56 = (j55 + 1048576) >> 21;
                long j57 = j56 << 21;
                long j58 = ((j49 * 136657) + (((j14 - j16) + j28) - (j54 * 997805))) - (j50 * 683901);
                long j59 = (j58 + 1048576) >> 21;
                long j60 = j59 << 21;
                long j61 = ((j17 - j19) + j31) - (j54 * 683901);
                long j62 = (j61 + 1048576) >> 21;
                long j63 = j62 << 21;
                long j64 = (j40 * 470296) + (j45 * 666643) + (jZzo & 2097151) + j42;
                long j65 = (j64 + 1048576) >> 21;
                long j66 = (((j45 * 654183) + ((j44 * 470296) + ((j50 * 666643) + (jZzo2 & 2097151)))) - (j40 * 997805)) + j47;
                long j67 = (j66 + 1048576) >> 21;
                long j68 = (((j45 * 136657) + (((j50 * 654183) + ((j49 * 470296) + ((j54 * 666643) + (jZzn3 & 2097151)))) - (j44 * 997805))) - (j40 * 683901)) + j52;
                long j69 = (j68 + 1048576) >> 21;
                long j70 = (((j50 * 136657) + (((j54 * 654183) + (j27 - j29)) - (j49 * 997805))) - (j44 * 683901)) + j56;
                long j71 = (j70 + 1048576) >> 21;
                long j72 = (((j54 * 136657) + (j30 - j32)) - (j49 * 683901)) + j59;
                long j73 = (j72 + 1048576) >> 21;
                long j74 = (j33 - j35) + j62;
                long j75 = (j74 + 1048576) >> 21;
                long j76 = j75 << 21;
                long j77 = (j75 * 666643) + (j41 - j43);
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = (j75 * 470296) + (j64 - (j65 << 21)) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = (j75 * 654183) + (j46 - j48) + j65 + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = ((j66 - (j67 << 21)) - (j75 * 997805)) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = (j75 * 136657) + (j51 - j53) + j67 + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = ((j68 - (j69 << 21)) - (j75 * 683901)) + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j55 - j57) + j69 + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j70 - (j71 << 21)) + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j58 - j60) + j71 + j99;
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j72 - (j73 << 21)) + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j61 - j63) + j73 + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = (j74 - j76) + j108;
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (666643 * j111) + (j77 - j79);
                long j114 = j113 >> 21;
                long j115 = j114 << 21;
                long j116 = (470296 * j111) + (j80 - j82) + j114;
                long j117 = j116 >> 21;
                long j118 = j117 << 21;
                long j119 = (654183 * j111) + (j83 - j85) + j117;
                long j120 = j119 >> 21;
                long j121 = j120 << 21;
                long j122 = ((j86 - j88) - (997805 * j111)) + j120;
                long j123 = j122 >> 21;
                long j124 = j123 << 21;
                long j125 = (136657 * j111) + (j89 - j91) + j123;
                long j126 = j125 >> 21;
                long j127 = j126 << 21;
                long j128 = ((j92 - j94) - (j111 * 683901)) + j126;
                long j129 = j128 >> 21;
                long j130 = j129 << 21;
                long j131 = (j95 - j97) + j129;
                long j132 = j131 >> 21;
                long j133 = j132 << 21;
                long j134 = (j98 - j100) + j132;
                long j135 = j134 >> 21;
                long j136 = j135 << 21;
                long j137 = (j101 - j103) + j135;
                long j138 = j137 >> 21;
                long j139 = j138 << 21;
                long j140 = (j104 - j106) + j138;
                long j141 = j140 >> 21;
                long j142 = j141 << 21;
                long j143 = (j107 - j109) + j141;
                long j144 = j143 >> 21;
                bArrDigest[0] = (byte) (j113 - j115);
                long j145 = j134 - j136;
                long j146 = j131 - j133;
                long j147 = j128 - j130;
                long j148 = j125 - j127;
                long j149 = j122 - j124;
                long j150 = j119 - j121;
                long j151 = j116 - j118;
                bArrDigest[1] = (byte) (r7 >> 8);
                bArrDigest[2] = (byte) ((r7 >> 16) | (j151 << 5));
                bArrDigest[3] = (byte) (j151 >> 3);
                bArrDigest[4] = (byte) (j151 >> 11);
                bArrDigest[5] = (byte) ((j151 >> 19) | (j150 << 2));
                bArrDigest[6] = (byte) (j150 >> 6);
                bArrDigest[7] = (byte) ((j150 >> 14) | (j149 << 7));
                bArrDigest[8] = (byte) (j149 >> 1);
                bArrDigest[9] = (byte) (j149 >> 9);
                bArrDigest[10] = (byte) ((j149 >> 17) | (j148 << 4));
                bArrDigest[11] = (byte) (j148 >> 4);
                bArrDigest[12] = (byte) (j148 >> 12);
                bArrDigest[13] = (byte) ((j148 >> 20) | (j147 + j147));
                bArrDigest[14] = (byte) (j147 >> 7);
                bArrDigest[15] = (byte) ((j147 >> 15) | (j146 << 6));
                bArrDigest[16] = (byte) (j146 >> 2);
                bArrDigest[17] = (byte) (j146 >> 10);
                bArrDigest[18] = (byte) ((j146 >> 18) | (j145 << 3));
                long j152 = j143 - (j144 << 21);
                long j153 = (j110 - j112) + j144;
                long j154 = j140 - j142;
                bArrDigest[19] = (byte) (j145 >> 5);
                bArrDigest[20] = (byte) (j145 >> 13);
                bArrDigest[21] = (byte) (j137 - j139);
                bArrDigest[22] = (byte) (r7 >> 8);
                bArrDigest[23] = (byte) ((r7 >> 16) | (j154 << 5));
                bArrDigest[24] = (byte) (j154 >> 3);
                bArrDigest[25] = (byte) (j154 >> 11);
                bArrDigest[26] = (byte) ((j154 >> 19) | (j152 << 2));
                bArrDigest[27] = (byte) (j152 >> 6);
                bArrDigest[28] = (byte) ((j152 >> 14) | (j153 << 7));
                bArrDigest[29] = (byte) (j153 >> 1);
                bArrDigest[30] = (byte) (j153 >> 9);
                bArrDigest[31] = (byte) (j153 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhlw.zzg(bArr5);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhlw.zzf(jArr4, jArrZzg);
                zzhlw.zze(jArr5, jArr4, zzhlr.zza);
                zzhlw.zzb(jArr4, jArr4, jArr2);
                zzhlw.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhlw.zzf(jArr8, jArr5);
                zzhlw.zze(jArr8, jArr8, jArr5);
                zzhlw.zzf(jArr, jArr8);
                zzhlw.zze(jArr, jArr, jArr5);
                zzhlw.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhlw.zzf(jArr9, jArr);
                zzhlw.zzf(jArr10, jArr9);
                zzhlw.zzf(jArr10, jArr10);
                zzhlw.zze(jArr10, jArr, jArr10);
                zzhlw.zze(jArr9, jArr9, jArr10);
                zzhlw.zzf(jArr9, jArr9);
                zzhlw.zze(jArr9, jArr10, jArr9);
                zzhlw.zzf(jArr10, jArr9);
                for (int i12 = 1; i12 < 5; i12++) {
                    zzhlw.zzf(jArr10, jArr10);
                }
                zzhlw.zze(jArr9, jArr10, jArr9);
                zzhlw.zzf(jArr10, jArr9);
                for (int i13 = 1; i13 < 10; i13++) {
                    zzhlw.zzf(jArr10, jArr10);
                }
                zzhlw.zze(jArr10, jArr10, jArr9);
                zzhlw.zzf(jArr11, jArr10);
                for (int i14 = 1; i14 < 20; i14++) {
                    zzhlw.zzf(jArr11, jArr11);
                }
                zzhlw.zze(jArr10, jArr11, jArr10);
                zzhlw.zzf(jArr10, jArr10);
                for (int i15 = 1; i15 < 10; i15++) {
                    zzhlw.zzf(jArr10, jArr10);
                }
                zzhlw.zze(jArr9, jArr10, jArr9);
                zzhlw.zzf(jArr10, jArr9);
                for (int i16 = 1; i16 < 50; i16++) {
                    zzhlw.zzf(jArr10, jArr10);
                }
                zzhlw.zze(jArr10, jArr10, jArr9);
                zzhlw.zzf(jArr11, jArr10);
                for (int i17 = 1; i17 < 100; i17++) {
                    zzhlw.zzf(jArr11, jArr11);
                }
                zzhlw.zze(jArr10, jArr11, jArr10);
                zzhlw.zzf(jArr10, jArr10);
                for (int i18 = 1; i18 < 50; i18++) {
                    zzhlw.zzf(jArr10, jArr10);
                }
                zzhlw.zze(jArr9, jArr10, jArr9);
                zzhlw.zzf(jArr9, jArr9);
                zzhlw.zzf(jArr9, jArr9);
                zzhlw.zze(jArr, jArr9, jArr);
                zzhlw.zze(jArr, jArr, jArr8);
                zzhlw.zze(jArr, jArr, jArr4);
                zzhlw.zzf(jArr6, jArr);
                zzhlw.zze(jArr6, jArr6, jArr5);
                zzhlw.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhlw.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhlw.zze(jArr, jArr, zzhlr.zzc);
                }
                if (zze(jArr)) {
                    b5 = ForkServer.ERROR;
                } else {
                    byte b10 = bArr3[31];
                    b5 = ForkServer.ERROR;
                    if (((b10 & ForkServer.ERROR) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[31] & b5) >> 7)) {
                    zzm(jArr, jArr);
                }
                zzhlw.zze(jArr3, jArr, jArrZzg);
                zzhlo zzhloVar = new zzhlo(new zzhln(jArr, jArrZzg, jArr2), jArr3);
                zzhll[] zzhllVarArr = new zzhll[8];
                zzhllVarArr[0] = new zzhll(zzhloVar);
                zzhlm zzhlmVar = new zzhlm(new zzhln(), new long[10]);
                zzi(zzhlmVar, zzhloVar.zza);
                zzhlo zzhloVar2 = new zzhlo(zzhlmVar);
                for (int i19 = 1; i19 < 8; i19++) {
                    zzg(zzhlmVar, zzhloVar2, zzhllVarArr[i19 - 1]);
                    zzhllVarArr[i19] = new zzhll(new zzhlo(zzhlmVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArrCopyOfRange);
                zzhlm zzhlmVar2 = new zzhlm(zzc);
                zzhlo zzhloVar3 = new zzhlo();
                int i20 = b5;
                while (i20 >= 0 && bArrZzl[i20] == 0 && bArrZzl2[i20] == 0) {
                    i20--;
                }
                while (i20 >= 0) {
                    zzi(zzhlmVar2, new zzhln(zzhlmVar2));
                    byte b11 = bArrZzl[i20];
                    if (b11 > 0) {
                        zzhlo.zza(zzhloVar3, zzhlmVar2);
                        zzg(zzhlmVar2, zzhloVar3, zzhllVarArr[bArrZzl[i20] / 2]);
                    } else if (b11 < 0) {
                        zzhlo.zza(zzhloVar3, zzhlmVar2);
                        zzh(zzhlmVar2, zzhloVar3, zzhllVarArr[(-bArrZzl[i20]) / 2]);
                    }
                    byte b12 = bArrZzl2[i20];
                    if (b12 > 0) {
                        zzhlo.zza(zzhloVar3, zzhlmVar2);
                        zzg(zzhlmVar2, zzhloVar3, zzhlr.zze[bArrZzl2[i20] / 2]);
                    } else if (b12 < 0) {
                        zzhlo.zza(zzhloVar3, zzhlmVar2);
                        zzh(zzhlmVar2, zzhloVar3, zzhlr.zze[(-bArrZzl2[i20]) / 2]);
                    }
                    i20--;
                }
                byte[] bArrZzb = new zzhln(zzhlmVar2).zzb();
                for (int i21 = 0; i21 < 32; i21++) {
                    if (bArrZzb[i21] != bArr2[i21]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhlr.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhlw.zzd(jArr2);
        byte[] bArrZzh = zzhlw.zzh(jArr2);
        for (int i5 = 0; i5 < 32; i5++) {
            if (bArrZzh[i5] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int zzf(long[] jArr) {
        return zzhlw.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhlm zzhlmVar, zzhlo zzhloVar, zzhlk zzhlkVar) {
        zzhln zzhlnVar = zzhloVar.zza;
        zzhln zzhlnVar2 = zzhlmVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlnVar2.zza;
        long[] jArr3 = zzhlnVar.zzb;
        long[] jArr4 = zzhlnVar.zza;
        zzhlw.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlnVar2.zzb;
        zzhlw.zzb(jArr5, jArr3, jArr4);
        zzhlw.zze(jArr5, jArr5, zzhlkVar.zzb);
        long[] jArr6 = zzhlkVar.zza;
        long[] jArr7 = zzhlnVar2.zzc;
        zzhlw.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhlmVar.zzb;
        zzhlw.zze(jArr8, zzhloVar.zzb, zzhlkVar.zzc);
        zzhlkVar.zza(jArr2, zzhlnVar.zzc);
        zzhlw.zza(jArr, jArr2, jArr2);
        zzhlw.zzb(jArr2, jArr7, jArr5);
        zzhlw.zza(jArr5, jArr7, jArr5);
        zzhlw.zza(jArr7, jArr, jArr8);
        zzhlw.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhlm zzhlmVar, zzhlo zzhloVar, zzhlk zzhlkVar) {
        zzhln zzhlnVar = zzhloVar.zza;
        zzhln zzhlnVar2 = zzhlmVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlnVar2.zza;
        long[] jArr3 = zzhlnVar.zzb;
        long[] jArr4 = zzhlnVar.zza;
        zzhlw.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlnVar2.zzb;
        zzhlw.zzb(jArr5, jArr3, jArr4);
        zzhlw.zze(jArr5, jArr5, zzhlkVar.zza);
        long[] jArr6 = zzhlkVar.zzb;
        long[] jArr7 = zzhlnVar2.zzc;
        zzhlw.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhlmVar.zzb;
        zzhlw.zze(jArr8, zzhloVar.zzb, zzhlkVar.zzc);
        zzhlkVar.zza(jArr2, zzhlnVar.zzc);
        zzhlw.zza(jArr, jArr2, jArr2);
        zzhlw.zzb(jArr2, jArr7, jArr5);
        zzhlw.zza(jArr5, jArr7, jArr5);
        zzhlw.zzb(jArr7, jArr, jArr8);
        zzhlw.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhlm zzhlmVar, zzhln zzhlnVar) {
        zzhln zzhlnVar2 = zzhlmVar.zza;
        long[] jArr = zzhlnVar2.zza;
        long[] jArr2 = zzhlnVar.zza;
        long[] jArr3 = new long[10];
        zzhlw.zzf(jArr, jArr2);
        long[] jArr4 = zzhlnVar2.zzc;
        long[] jArr5 = zzhlnVar.zzb;
        zzhlw.zzf(jArr4, jArr5);
        long[] jArr6 = zzhlmVar.zzb;
        zzhlw.zzf(jArr6, zzhlnVar.zzc);
        zzhlw.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhlnVar2.zzb;
        zzhlw.zza(jArr7, jArr2, jArr5);
        zzhlw.zzf(jArr3, jArr7);
        zzhlw.zza(jArr7, jArr4, jArr);
        zzhlw.zzb(jArr4, jArr4, jArr);
        zzhlw.zzb(jArr, jArr3, jArr7);
        zzhlw.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i5, int i10) {
        int i11 = (~(i5 ^ i10)) & 255;
        int i12 = i11 & (i11 << 4);
        int i13 = i12 & (i12 << 2);
        return (i13 & (i13 + i13)) >> 7;
    }

    private static void zzk(zzhlk zzhlkVar, int i5, byte b5) {
        zzhlk[][] zzhlkVarArr = zzhlr.zzd;
        zzhlk zzhlkVar2 = zzhlkVarArr[i5][0];
        int i10 = (b5 & ForkServer.ERROR) >> 7;
        int i11 = (-i10) & b5;
        int i12 = b5 - (i11 + i11);
        zzhlkVar.zzb(zzhlkVar2, zzj(i12, 1));
        zzhlkVar.zzb(zzhlkVarArr[i5][1], zzj(i12, 2));
        zzhlkVar.zzb(zzhlkVarArr[i5][2], zzj(i12, 3));
        zzhlkVar.zzb(zzhlkVarArr[i5][3], zzj(i12, 4));
        zzhlkVar.zzb(zzhlkVarArr[i5][4], zzj(i12, 5));
        zzhlkVar.zzb(zzhlkVarArr[i5][5], zzj(i12, 6));
        zzhlkVar.zzb(zzhlkVarArr[i5][6], zzj(i12, 7));
        zzhlkVar.zzb(zzhlkVarArr[i5][7], zzj(i12, 8));
        long[] jArr = zzhlkVar.zzc;
        long[] jArr2 = zzhlkVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhlkVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhlkVar.zzb(new zzhlk(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i10);
    }

    private static byte[] zzl(byte[] bArr) {
        int i5;
        byte[] bArr2 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = (byte) (1 & ((bArr[i10 >> 3] & ForkServer.ERROR) >> (i10 & 7)));
        }
        for (int i11 = 0; i11 < 256; i11++) {
            if (bArr2[i11] != 0) {
                for (int i12 = 1; i12 <= 6 && (i5 = i11 + i12) < 256; i12++) {
                    byte b5 = bArr2[i5];
                    if (b5 != 0) {
                        byte b10 = bArr2[i11];
                        int i13 = b5 << i12;
                        int i14 = b10 + i13;
                        if (i14 <= 15) {
                            bArr2[i11] = (byte) i14;
                            bArr2[i5] = 0;
                        } else {
                            int i15 = b10 - i13;
                            if (i15 >= -15) {
                                bArr2[i11] = (byte) i15;
                                while (true) {
                                    if (i5 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i5] == 0) {
                                        bArr2[i5] = 1;
                                        break;
                                    }
                                    bArr2[i5] = 0;
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i5 = 0; i5 < jArr2.length; i5++) {
            jArr[i5] = -jArr2[i5];
        }
    }

    private static long zzn(byte[] bArr, int i5) {
        return ((bArr[i5 + 2] & ForkServer.ERROR) << 16) | (bArr[i5] & 255) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8);
    }

    private static long zzo(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | zzn(bArr, i5);
    }
}
