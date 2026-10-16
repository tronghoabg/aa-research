package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ytv extends defpackage.ytt {
    public static final defpackage.yua a = new defpackage.ytv();

    private static void f(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jB = j + defpackage.yui.b(bArr, i);
        long jB2 = defpackage.yui.b(bArr, i + 8);
        long jB3 = defpackage.yui.b(bArr, i + 16);
        long jB4 = defpackage.yui.b(bArr, i + 24);
        long j3 = jB2 + jB + jB3;
        long jRotateRight = java.lang.Long.rotateRight(j2 + jB + jB4, 21) + java.lang.Long.rotateRight(j3, 44);
        jArr[0] = j3 + jB4;
        jArr[1] = jRotateRight + jB;
    }

    @Override // defpackage.ytq
    public final defpackage.ytz d(byte[] bArr, int i) {
        int i2;
        char c;
        int i3;
        long j;
        long j2;
        long jRotateRight;
        long[] jArr;
        long j3;
        long j4;
        long j5;
        byte[] bArr2 = bArr;
        char c2 = 0;
        defpackage.ysr.bi(0, i, bArr2.length);
        long j6 = -4348849565147123417L;
        long j7 = -7286425919675154353L;
        if (i <= 32) {
            if (i <= 16) {
                if (i >= 8) {
                    long j8 = i;
                    j4 = (j8 + j8) - 7286425919675154353L;
                    long jB = defpackage.yui.b(bArr2, 0) - 7286425919675154353L;
                    long jB2 = defpackage.yui.b(bArr2, i - 8);
                    long jRotateRight2 = java.lang.Long.rotateRight(jB2, 37) * j4;
                    long jRotateRight3 = (java.lang.Long.rotateRight(jB, 25) + jB2) * j4;
                    long j9 = ((jRotateRight2 + jB) ^ jRotateRight3) * j4;
                    j5 = (j9 ^ (j9 >>> 47)) ^ jRotateRight3;
                } else if (i >= 4) {
                    j4 = ((long) (i + i)) - 7286425919675154353L;
                    long jA = ((long) i) + ((((long) defpackage.yui.a(bArr2, 0)) & 4294967295L) << 3);
                    long jA2 = 4294967295L & ((long) defpackage.yui.a(bArr2, i - 4));
                    long j10 = (jA ^ jA2) * j4;
                    j5 = jA2 ^ (j10 ^ (j10 >>> 47));
                } else if (i > 0) {
                    long j11 = (((long) ((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (((bArr2[i - 1] & 255) << 2) + i)) * (-4348849565147123417L));
                    j7 = (-7286425919675154353L) * (j11 ^ (j11 >>> 47));
                }
                long j12 = j5 * j4;
                j7 = (j12 ^ (j12 >>> 47)) * j4;
            } else {
                long jB3 = defpackage.yui.b(bArr2, 0) * (-5435081209227447693L);
                long jB4 = defpackage.yui.b(bArr2, 8);
                long j13 = i;
                long j14 = (j13 + j13) - 7286425919675154353L;
                long jB5 = defpackage.yui.b(bArr2, i - 8) * j14;
                long jB6 = defpackage.yui.b(bArr2, i - 16) * (-7286425919675154353L);
                long jRotateRight4 = java.lang.Long.rotateRight(jB3 + jB4, 43) + java.lang.Long.rotateRight(jB5, 30);
                long jRotateRight5 = jB3 + java.lang.Long.rotateRight(jB4 - 7286425919675154353L, 18) + jB5;
                long j15 = ((jRotateRight4 + jB6) ^ jRotateRight5) * j14;
                long j16 = ((j15 ^ (j15 >>> 47)) ^ jRotateRight5) * j14;
                j7 = (j16 ^ (j16 >>> 47)) * j14;
            }
        } else if (i <= 64) {
            long jB7 = defpackage.yui.b(bArr2, 0) * (-7286425919675154353L);
            long jB8 = defpackage.yui.b(bArr2, 8);
            long j17 = i;
            long j18 = (j17 + j17) - 7286425919675154353L;
            long jB9 = defpackage.yui.b(bArr2, i - 8) * j18;
            long jB10 = defpackage.yui.b(bArr2, i - 16) * (-7286425919675154353L);
            long jRotateRight6 = java.lang.Long.rotateRight(jB7 + jB8, 43) + java.lang.Long.rotateRight(jB9, 30);
            long jRotateRight7 = java.lang.Long.rotateRight(jB8 - 7286425919675154353L, 18) + jB7;
            long jB11 = defpackage.yui.b(bArr2, 16) * j18;
            long jB12 = defpackage.yui.b(bArr2, 24);
            long j19 = jRotateRight6 + jB10;
            long jB13 = j19 + defpackage.yui.b(bArr2, i - 32);
            long j20 = jRotateRight7 + jB9;
            long j21 = (j19 ^ j20) * j18;
            long j22 = ((j21 ^ (j21 >>> 47)) ^ j20) * j18;
            long jB14 = ((j22 ^ (j22 >>> 47)) * j18) + defpackage.yui.b(bArr2, i - 24);
            long j23 = jB13 * j18;
            long jRotateRight8 = java.lang.Long.rotateRight(jB11 + jB12, 43) + java.lang.Long.rotateRight(j23, 30);
            long jRotateRight9 = jB11 + java.lang.Long.rotateRight(jB12 + jB7, 18) + j23;
            long j24 = ((jRotateRight8 + (jB14 * j18)) ^ jRotateRight9) * j18;
            long j25 = ((j24 ^ (j24 >>> 47)) ^ jRotateRight9) * j18;
            j7 = (j25 ^ (j25 >>> 47)) * j18;
        } else {
            long[] jArr2 = new long[2];
            long[] jArr3 = new long[2];
            long jB15 = defpackage.yui.b(bArr2, 0) + 95310865018149119L;
            long j26 = 1390051526045402406L;
            long j27 = 2480279821605975764L;
            int i4 = 0;
            while (true) {
                i2 = i - 1;
                c = c2;
                i3 = (i2 >> 6) * 64;
                j = j6;
                long jRotateRight10 = java.lang.Long.rotateRight(jB15 + j27 + jArr2[c] + defpackage.yui.b(bArr2, i4 + 8), 37) * (-5435081209227447693L);
                long jRotateRight11 = java.lang.Long.rotateRight(j27 + jArr2[1] + defpackage.yui.b(bArr2, i4 + 48), 42) * (-5435081209227447693L);
                j2 = jRotateRight10 ^ jArr3[1];
                long jB16 = jArr2[c] + defpackage.yui.b(bArr2, i4 + 40);
                jRotateRight = java.lang.Long.rotateRight(j26 + jArr3[c], 33) * (-5435081209227447693L);
                f(bArr2, i4, jArr2[1] * (-5435081209227447693L), j2 + jArr3[c], jArr2);
                int i5 = i4;
                jArr = jArr2;
                j3 = jRotateRight11 + jB16;
                f(bArr2, i5 + 32, jRotateRight + jArr3[1], defpackage.yui.b(bArr2, i5 + 16) + j3, jArr3);
                i4 = i5 + 64;
                if (i4 == i3) {
                    break;
                }
                c2 = c;
                bArr2 = bArr;
                j26 = j2;
                jB15 = jRotateRight;
                jArr2 = jArr;
                j27 = j3;
                j6 = j;
            }
            int i6 = i2 & 63;
            int i7 = i3 + i6;
            long j28 = j2 & 255;
            long j29 = (-5435081209227447693L) + j28 + j28;
            long j30 = jArr3[c] + ((long) i6);
            long j31 = jArr[c] + j30;
            jArr[c] = j31;
            jArr3[c] = j30 + j31;
            long jRotateRight12 = java.lang.Long.rotateRight(jRotateRight + j3 + j31 + defpackage.yui.b(bArr2, i7 - 55), 37) * j29;
            long jRotateRight13 = java.lang.Long.rotateRight(j3 + jArr[1] + defpackage.yui.b(bArr2, i7 - 15), 42) * j29;
            long j32 = jArr3[1] * 9;
            long jB17 = (jArr[c] * 9) + defpackage.yui.b(bArr2, i7 - 23);
            long jRotateRight14 = java.lang.Long.rotateRight(j2 + jArr3[c], 33) * j29;
            long j33 = jRotateRight12 ^ j32;
            f(bArr, i7 - 63, jArr[1] * j29, j33 + jArr3[c], jArr);
            long j34 = jRotateRight13 + jB17;
            f(bArr, i7 - 31, jArr3[1] + jRotateRight14, defpackage.yui.b(bArr, i7 - 47) + j34, jArr3);
            long j35 = jArr[c];
            long j36 = jArr3[c];
            long j37 = (j35 ^ j36) * j29;
            long j38 = jArr[1];
            long j39 = jArr3[1];
            long j40 = (j38 ^ j39) * j29;
            long j41 = ((j40 ^ (j40 >>> 47)) ^ j39) * j29;
            long j42 = ((j37 ^ (j37 >>> 47)) ^ j36) * j29;
            long j43 = ((j41 ^ (j41 >>> 47)) * j29) + jRotateRight14;
            long j44 = (((((j42 ^ (j42 >>> 47)) * j29) + (((j34 >>> 47) ^ j34) * j)) + j33) ^ j43) * j29;
            long j45 = ((j44 ^ (j44 >>> 47)) ^ j43) * j29;
            j7 = (j45 ^ (j45 >>> 47)) * j29;
        }
        long j46 = j7;
        int i8 = defpackage.ytz.b;
        return new defpackage.yty(j46);
    }

    public final java.lang.String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
