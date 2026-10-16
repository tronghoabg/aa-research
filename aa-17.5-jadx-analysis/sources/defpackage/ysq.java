package defpackage;

/* loaded from: classes.dex */
public final class ysq extends yso {
    public static final ysv a = new ysq();

    private static void f(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jB = j + ytd.b(bArr, i);
        long jB2 = ytd.b(bArr, i + 8);
        long jB3 = ytd.b(bArr, i + 16);
        long jB4 = ytd.b(bArr, i + 24);
        long j3 = jB2 + jB + jB3;
        long jRotateRight = Long.rotateRight(j2 + jB + jB4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jB4;
        jArr[1] = jRotateRight + jB;
    }

    @Override // defpackage.ysl
    public final ysu d(byte[] bArr, int i) {
        int i2;
        boolean z;
        int i3;
        long j;
        long j2;
        long jRotateRight;
        long[] jArr;
        long j3;
        long j4;
        long j5;
        byte[] bArr2 = bArr;
        boolean z2 = false;
        woy.Y(0, i, bArr2.length);
        long j6 = -4348849565147123417L;
        long j7 = -7286425919675154353L;
        if (i <= 32) {
            if (i <= 16) {
                if (i >= 8) {
                    long j8 = i;
                    j4 = (j8 + j8) - 7286425919675154353L;
                    long jB = ytd.b(bArr2, 0) - 7286425919675154353L;
                    long jB2 = ytd.b(bArr2, i - 8);
                    long jRotateRight2 = Long.rotateRight(jB2, 37) * j4;
                    long jRotateRight3 = (Long.rotateRight(jB, 25) + jB2) * j4;
                    long j9 = ((jRotateRight2 + jB) ^ jRotateRight3) * j4;
                    j5 = (j9 ^ (j9 >>> 47)) ^ jRotateRight3;
                } else if (i >= 4) {
                    j4 = (i + i) - 7286425919675154353L;
                    long jA = 4294967295L & ytd.a(bArr2, i - 4);
                    long jA2 = ((i + ((ytd.a(bArr2, 0) & 4294967295L) << 3)) ^ jA) * j4;
                    j5 = jA ^ (jA2 ^ (jA2 >>> 47));
                } else if (i > 0) {
                    long j10 = (((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((((bArr2[i - 1] & 255) << 2) + i) * (-4348849565147123417L));
                    j7 = (-7286425919675154353L) * (j10 ^ (j10 >>> 47));
                }
                long j11 = j5 * j4;
                j7 = (j11 ^ (j11 >>> 47)) * j4;
            } else {
                long jB3 = ytd.b(bArr2, 0) * (-5435081209227447693L);
                long jB4 = ytd.b(bArr2, 8);
                long j12 = i;
                long j13 = (j12 + j12) - 7286425919675154353L;
                long jB5 = ytd.b(bArr2, i - 8) * j13;
                long jB6 = ytd.b(bArr2, i - 16) * (-7286425919675154353L);
                long jRotateRight4 = Long.rotateRight(jB3 + jB4, 43) + Long.rotateRight(jB5, 30);
                long jRotateRight5 = jB3 + Long.rotateRight(jB4 - 7286425919675154353L, 18) + jB5;
                long j14 = ((jRotateRight4 + jB6) ^ jRotateRight5) * j13;
                long j15 = ((j14 ^ (j14 >>> 47)) ^ jRotateRight5) * j13;
                j7 = (j15 ^ (j15 >>> 47)) * j13;
            }
        } else if (i <= 64) {
            long jB7 = ytd.b(bArr2, 0) * (-7286425919675154353L);
            long jB8 = ytd.b(bArr2, 8);
            long j16 = i;
            long j17 = (j16 + j16) - 7286425919675154353L;
            long jB9 = ytd.b(bArr2, i - 8) * j17;
            long jB10 = ytd.b(bArr2, i - 16) * (-7286425919675154353L);
            long jRotateRight6 = Long.rotateRight(jB7 + jB8, 43) + Long.rotateRight(jB9, 30);
            long jRotateRight7 = Long.rotateRight(jB8 - 7286425919675154353L, 18) + jB7;
            long jB11 = ytd.b(bArr2, 16) * j17;
            long jB12 = ytd.b(bArr2, 24);
            long j18 = jRotateRight6 + jB10;
            long jB13 = j18 + ytd.b(bArr2, i - 32);
            long j19 = jRotateRight7 + jB9;
            long j20 = (j18 ^ j19) * j17;
            long j21 = ((j20 ^ (j20 >>> 47)) ^ j19) * j17;
            long jB14 = ((j21 ^ (j21 >>> 47)) * j17) + ytd.b(bArr2, i - 24);
            long j22 = jB13 * j17;
            long jRotateRight8 = Long.rotateRight(jB11 + jB12, 43) + Long.rotateRight(j22, 30);
            long jRotateRight9 = jB11 + Long.rotateRight(jB12 + jB7, 18) + j22;
            long j23 = ((jRotateRight8 + (jB14 * j17)) ^ jRotateRight9) * j17;
            long j24 = ((j23 ^ (j23 >>> 47)) ^ jRotateRight9) * j17;
            j7 = (j24 ^ (j24 >>> 47)) * j17;
        } else {
            long[] jArr2 = new long[2];
            long[] jArr3 = new long[2];
            long jB15 = ytd.b(bArr2, 0) + 95310865018149119L;
            long j25 = 1390051526045402406L;
            long j26 = 2480279821605975764L;
            int i4 = 0;
            while (true) {
                i2 = i - 1;
                z = z2;
                i3 = (i2 >> 6) * 64;
                j = j6;
                long jRotateRight10 = Long.rotateRight(jB15 + j26 + jArr2[z ? 1 : 0] + ytd.b(bArr2, i4 + 8), 37) * (-5435081209227447693L);
                long jRotateRight11 = Long.rotateRight(j26 + jArr2[1] + ytd.b(bArr2, i4 + 48), 42) * (-5435081209227447693L);
                j2 = jRotateRight10 ^ jArr3[1];
                long jB16 = jArr2[z ? 1 : 0] + ytd.b(bArr2, i4 + 40);
                jRotateRight = Long.rotateRight(j25 + jArr3[z ? 1 : 0], 33) * (-5435081209227447693L);
                f(bArr2, i4, jArr2[1] * (-5435081209227447693L), j2 + jArr3[z ? 1 : 0], jArr2);
                int i5 = i4;
                jArr = jArr2;
                j3 = jRotateRight11 + jB16;
                f(bArr2, i5 + 32, jRotateRight + jArr3[1], ytd.b(bArr2, i5 + 16) + j3, jArr3);
                i4 = i5 + 64;
                if (i4 == i3) {
                    break;
                }
                z2 = z ? 1 : 0;
                bArr2 = bArr;
                j25 = j2;
                jB15 = jRotateRight;
                jArr2 = jArr;
                j26 = j3;
                j6 = j;
            }
            int i6 = i2 & 63;
            int i7 = i3 + i6;
            long j27 = j2 & 255;
            long j28 = (-5435081209227447693L) + j27 + j27;
            long j29 = jArr3[z ? 1 : 0] + i6;
            long j30 = jArr[z ? 1 : 0] + j29;
            jArr[z ? 1 : 0] = j30;
            jArr3[z ? 1 : 0] = j29 + j30;
            long jRotateRight12 = Long.rotateRight(jRotateRight + j3 + j30 + ytd.b(bArr2, i7 - 55), 37) * j28;
            long jRotateRight13 = Long.rotateRight(j3 + jArr[1] + ytd.b(bArr2, i7 - 15), 42) * j28;
            long j31 = jArr3[1] * 9;
            long jB17 = (jArr[z ? 1 : 0] * 9) + ytd.b(bArr2, i7 - 23);
            long jRotateRight14 = Long.rotateRight(j2 + jArr3[z ? 1 : 0], 33) * j28;
            long j32 = jRotateRight12 ^ j31;
            f(bArr, i7 - 63, jArr[1] * j28, j32 + jArr3[z ? 1 : 0], jArr);
            long j33 = jRotateRight13 + jB17;
            f(bArr, i7 - 31, jArr3[1] + jRotateRight14, ytd.b(bArr, i7 - 47) + j33, jArr3);
            long j34 = jArr[z ? 1 : 0];
            long j35 = jArr3[z ? 1 : 0];
            long j36 = (j34 ^ j35) * j28;
            long j37 = jArr[1];
            long j38 = jArr3[1];
            long j39 = (j37 ^ j38) * j28;
            long j40 = ((j39 ^ (j39 >>> 47)) ^ j38) * j28;
            long j41 = ((j36 ^ (j36 >>> 47)) ^ j35) * j28;
            long j42 = ((j40 ^ (j40 >>> 47)) * j28) + jRotateRight14;
            long j43 = (((((j41 ^ (j41 >>> 47)) * j28) + (((j33 >>> 47) ^ j33) * j)) + j32) ^ j42) * j28;
            long j44 = ((j43 ^ (j43 >>> 47)) ^ j42) * j28;
            j7 = (j44 ^ (j44 >>> 47)) * j28;
        }
        long j45 = j7;
        int i8 = ysu.b;
        return new yst(j45);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
