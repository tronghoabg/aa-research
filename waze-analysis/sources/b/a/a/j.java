package b.a.a;

import androidx.camera.video.AudioStats;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final double f1703a = Math.cos(0.7853981633974483d);

    /* renamed from: b, reason: collision with root package name */
    public static final double f1704b = Math.sin(0.7853981633974483d);

    /* renamed from: c, reason: collision with root package name */
    private static volatile h[] f1705c = new h[20];

    /* renamed from: d, reason: collision with root package name */
    private static volatile h[] f1706d = new h[20];

    static int a(int i2) {
        if (i2 <= 9728) {
            return 19;
        }
        if (i2 <= 18432) {
            return 18;
        }
        if (i2 <= 69632) {
            return 17;
        }
        if (i2 <= 262144) {
            return 16;
        }
        if (i2 <= 983040) {
            return 15;
        }
        if (i2 <= 3670016) {
            return 14;
        }
        if (i2 <= 13631488) {
            return 13;
        }
        if (i2 <= 25165824) {
            return 12;
        }
        if (i2 <= 92274688) {
            return 11;
        }
        if (i2 <= 335544320) {
            return 10;
        }
        return i2 <= 1207959552 ? 9 : 8;
    }

    static h b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        h hVar = new h(i2);
        int length = bArr2.length;
        int i4 = 0;
        if (length < 4) {
            byte[] bArr3 = new byte[4];
            System.arraycopy(bArr2, 0, bArr3, 4 - length, length);
            bArr2 = bArr3;
        }
        int i5 = 1 << i3;
        int i6 = 32 - i3;
        int length2 = (bArr2.length * 8) - i3;
        int i7 = 0;
        int i8 = 0;
        while (length2 > (-i3)) {
            int iMin = Math.min(Math.max(i4, length2 >> 3), bArr2.length - 4);
            i7 = ((i5 >> 1) - (((((((bArr2[iMin + 2] & 255) << 8) | (((bArr2[iMin] & 255) << 24) | ((bArr2[iMin + 1] & 255) << 16))) | (bArr2[iMin + 3] & 255)) >>> ((i6 - length2) + (iMin << 3))) & (i5 - 1)) + i7)) >>> 31;
            hVar.s(i8, r4 - ((-i7) & i5));
            i8++;
            length2 -= i3;
            i4 = 0;
        }
        if (i7 > 0) {
            hVar.s(i8, 1.0d);
        }
        return hVar;
    }

    static BigInteger c(h hVar, int i2, int i3) {
        long j2 = i3;
        int iMin = (int) Math.min(hVar.f1699b, (2147483648L / j2) + 1);
        int i4 = (int) ((((iMin * j2) + 31) * 8) / 32);
        byte[] bArr = new byte[i4];
        int i5 = (i4 * 8) - i3;
        int i6 = 0;
        int i7 = i4 - 4;
        int iMin2 = Math.min(Math.max(0, i5 >> 3), i7);
        long j3 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (i8 > 1) {
                return new BigInteger(i2, bArr);
            }
            int i11 = i6;
            while (i11 < iMin) {
                int i12 = i10 << i3;
                long jRound = Math.round(hVar.b(i11, i8)) + j3;
                int iMin3 = Math.min(Math.max(i6, i5 >> 3), i7);
                i9 = (i9 >>> ((iMin2 - iMin3) << 3)) | ((int) ((jRound & (i12 - 1)) << (((32 - i3) - i5) + (iMin3 << 3))));
                bArr[iMin3] = (byte) (i9 >> 24);
                bArr[iMin3 + 1] = (byte) (i9 >>> 16);
                bArr[iMin3 + 2] = (byte) (i9 >>> 8);
                bArr[iMin3 + 3] = (byte) i9;
                i5 -= i3;
                i11++;
                iMin2 = iMin3;
                j3 = jRound >> i3;
                i6 = 0;
                i10 = 1;
            }
            i8++;
            i6 = 0;
        }
    }

    static BigInteger d(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            if (bigInteger2.signum() == 0) {
                return BigInteger.ZERO;
            }
            if (bigInteger2.bitLength() < 33220) {
                return bigInteger2.multiply(bigInteger2);
            }
            byte[] byteArray = bigInteger2.toByteArray();
            int iA = a(byteArray.length * 8);
            int i2 = ((r9 + iA) - 1) / iA;
            int i3 = i2 + 1;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
            int i4 = 32 - iNumberOfLeadingZeros;
            int i5 = 1 << i4;
            int i6 = (i5 * 3) / 4;
            if (i3 >= i6) {
                h hVarB = b(byteArray, i5, iA);
                h[] hVarArrL = l(i4);
                hVarB.i(hVarArrL[i4]);
                g(hVarB, hVarArrL);
                hVarB.u();
                j(hVarB, hVarArrL);
                hVarB.h(hVarArrL[i4]);
                return c(hVarB, 1, iA);
            }
            h hVarB2 = b(byteArray, i6, iA);
            int i7 = 30 - iNumberOfLeadingZeros;
            h[] hVarArrL2 = l(i7);
            h hVarF = f(i7);
            h hVarF2 = f(28 - iNumberOfLeadingZeros);
            hVarB2.i(hVarF);
            i(hVarB2, hVarArrL2, hVarF2);
            hVarB2.u();
            k(hVarB2, hVarArrL2, hVarF2);
            hVarB2.h(hVarF);
            return c(hVarB2, 1, iA);
        }
        int iBitLength = bigInteger.bitLength();
        int iBitLength2 = bigInteger2.bitLength();
        if (iBitLength + iBitLength2 > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
        }
        if (iBitLength <= 1920 || iBitLength2 <= 1920 || (iBitLength <= 33220 && iBitLength2 <= 33220)) {
            return bigInteger.multiply(bigInteger2);
        }
        int iSignum = bigInteger.signum() * bigInteger2.signum();
        if (bigInteger.signum() < 0) {
            bigInteger = bigInteger.negate();
        }
        byte[] byteArray2 = bigInteger.toByteArray();
        if (bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.negate();
        }
        byte[] byteArray3 = bigInteger2.toByteArray();
        int iA2 = a(Math.max(byteArray2.length, byteArray3.length) * 8);
        int i8 = ((r2 + iA2) - 1) / iA2;
        int i9 = i8 + 1;
        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i8);
        int i10 = 32 - iNumberOfLeadingZeros2;
        int i11 = 1 << i10;
        int i12 = (i11 * 3) / 4;
        if (i9 >= i12 || i10 <= 3) {
            h[] hVarArrL3 = l(i10);
            h hVarB3 = b(byteArray2, i11, iA2);
            hVarB3.i(hVarArrL3[i10]);
            g(hVarB3, hVarArrL3);
            h hVarB4 = b(byteArray3, i11, iA2);
            hVarB4.i(hVarArrL3[i10]);
            g(hVarB4, hVarArrL3);
            hVarB3.r(hVarB4);
            j(hVarB3, hVarArrL3);
            hVarB3.h(hVarArrL3[i10]);
            return c(hVarB3, iSignum, iA2);
        }
        int i13 = 30 - iNumberOfLeadingZeros2;
        h[] hVarArrL4 = l(i13);
        h hVarF3 = f(i13);
        h hVarF4 = f(28 - iNumberOfLeadingZeros2);
        h hVarB5 = b(byteArray2, i12, iA2);
        hVarB5.i(hVarF3);
        i(hVarB5, hVarArrL4, hVarF4);
        h hVarB6 = b(byteArray3, i12, iA2);
        hVarB6.i(hVarF3);
        i(hVarB6, hVarArrL4, hVarF4);
        hVarB5.r(hVarB6);
        k(hVarB5, hVarArrL4, hVarF4);
        hVarB5.h(hVarF3);
        return c(hVarB5, iSignum, iA2);
    }

    private static h e(int i2) {
        if (i2 == 1) {
            h hVar = new h(1);
            hVar.s(0, 1.0d);
            hVar.k(0, AudioStats.AUDIO_AMPLITUDE_NONE);
            return hVar;
        }
        h hVar2 = new h(i2);
        hVar2.t(0, 1.0d, AudioStats.AUDIO_AMPLITUDE_NONE);
        int i3 = i2 / 2;
        hVar2.t(i3, f1703a, f1704b);
        double d2 = i2;
        int i4 = 1;
        while (i4 < i3) {
            double d3 = (1.5707963267948966d / d2) * i4;
            double dCos = Math.cos(d3);
            double dSin = Math.sin(d3);
            hVar2.t(i4, dCos, dSin);
            int i5 = i4;
            hVar2.t(i2 - i5, dSin, dCos);
            i4 = i5 + 1;
        }
        return hVar2;
    }

    private static h f(int i2) {
        if (i2 >= 20) {
            return e(3 << i2);
        }
        if (f1706d[i2] == null) {
            f1706d[i2] = e(3 << i2);
        }
        return f1706d[i2];
    }

    private static void g(h hVar, h[] hVarArr) {
        int i2 = hVar.f1699b;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i2);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        i iVar5 = new i();
        i iVar6 = new i();
        while (iNumberOfLeadingZeros >= 2) {
            int i3 = iNumberOfLeadingZeros - 2;
            h hVar2 = hVarArr[i3];
            int i4 = 1 << iNumberOfLeadingZeros;
            int i5 = 0;
            while (i5 < i2) {
                int i6 = 0;
                while (true) {
                    int i7 = i4 / 4;
                    if (i6 < i7) {
                        iVar5.e(hVar2, i6);
                        iVar5.f(iVar6);
                        int i8 = i5 + i6;
                        int i9 = i7 + i8;
                        hVar.f(i8, hVar, i9, iVar);
                        int i10 = i8 + (i4 / 2);
                        iVar.b(hVar, i10);
                        int i11 = i4;
                        int i12 = i8 + ((i4 * 3) / 4);
                        iVar.b(hVar, i12);
                        hVar.w(i8, hVar, i9, iVar2);
                        iVar2.h(hVar, i10);
                        int i13 = i3;
                        iVar2.f1701a -= hVar.a(i12);
                        iVar2.f1702b += hVar.c(i12);
                        iVar2.d(iVar5);
                        hVar.v(i8, hVar, i9, iVar3);
                        iVar3.b(hVar, i10);
                        iVar3.h(hVar, i12);
                        iVar3.d(iVar6);
                        hVar.g(i8, hVar, i9, iVar4);
                        iVar4.h(hVar, i10);
                        iVar4.f1701a += hVar.a(i12);
                        double dC = iVar4.f1702b - hVar.c(i12);
                        iVar4.f1702b = dC;
                        int i14 = i5;
                        double d2 = iVar4.f1701a;
                        double d3 = iVar5.f1701a;
                        double d4 = iVar5.f1702b;
                        iVar4.f1701a = (d3 * d2) + ((-dC) * d4);
                        iVar4.f1702b = (d2 * d4) + (dC * iVar5.f1701a);
                        iVar.c(hVar, i8);
                        iVar2.c(hVar, i9);
                        iVar3.c(hVar, i10);
                        iVar4.c(hVar, i12);
                        i6++;
                        i4 = i11;
                        i3 = i13;
                        hVar2 = hVar2;
                        i5 = i14;
                    }
                }
                i5 += i4;
            }
            iNumberOfLeadingZeros = i3;
        }
        if (iNumberOfLeadingZeros > 0) {
            for (int i15 = 0; i15 < i2; i15 += 2) {
                hVar.j(i15, iVar);
                int i16 = i15 + 1;
                hVar.j(i16, iVar2);
                hVar.e(i15, iVar2);
                iVar.i(iVar2, hVar, i16);
            }
        }
    }

    private static void h(h hVar, h hVar2, h hVar3, int i2, double d2) {
        double dSqrt = i2 * (-0.5d) * Math.sqrt(3.0d);
        for (int i3 = 0; i3 < hVar.f1699b; i3++) {
            double dC = hVar.c(i3) + hVar2.c(i3) + hVar3.c(i3);
            double dA = hVar.a(i3) + hVar2.a(i3) + hVar3.a(i3);
            double dA2 = (hVar3.a(i3) - hVar2.a(i3)) * dSqrt;
            double dC2 = (hVar2.c(i3) - hVar3.c(i3)) * dSqrt;
            double dC3 = hVar2.c(i3) + hVar3.c(i3);
            double dA3 = hVar2.a(i3) + hVar3.a(i3);
            double d3 = dC3 * 0.5d;
            double dC4 = hVar.c(i3) - d3;
            double dA4 = hVar.a(i3) + dC2;
            double dC5 = hVar.c(i3) - d3;
            double dA5 = hVar.a(i3) - dC2;
            hVar.s(i3, dC * d2);
            hVar.k(i3, dA * d2);
            hVar2.s(i3, (dC4 + dA2) * d2);
            double d4 = dA3 * 0.5d;
            hVar2.k(i3, (dA4 - d4) * d2);
            hVar3.s(i3, (dC5 - dA2) * d2);
            hVar3.k(i3, (dA5 - d4) * d2);
        }
    }

    private static void i(h hVar, h[] hVarArr, h hVar2) {
        int i2 = hVar.f1699b / 3;
        h hVar3 = new h(hVar, 0, i2);
        int i3 = i2 + i2;
        h hVar4 = new h(hVar, i2, i3);
        h hVar5 = new h(hVar, i3, hVar.f1699b);
        h(hVar3, hVar4, hVar5, 1, 1.0d);
        i iVar = new i();
        for (int i4 = 0; i4 < hVar.f1699b / 4; i4++) {
            iVar.e(hVar2, i4);
            hVar4.n(i4, iVar);
            hVar5.n(i4, iVar);
            hVar5.n(i4, iVar);
        }
        for (int i5 = hVar.f1699b / 4; i5 < i2; i5++) {
            iVar.e(hVar2, i5 - (hVar.f1699b / 4));
            hVar4.p(i5, iVar);
            hVar5.p(i5, iVar);
            hVar5.p(i5, iVar);
        }
        g(hVar3, hVarArr);
        g(hVar4, hVarArr);
        g(hVar5, hVarArr);
    }

    private static void j(h hVar, h[] hVarArr) {
        int i2;
        int i3;
        int i4 = hVar.f1699b;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i4);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        i iVar5 = new i();
        i iVar6 = new i();
        i iVar7 = new i();
        i iVar8 = new i();
        int i5 = 1;
        if (iNumberOfLeadingZeros % 2 != 0) {
            for (int i6 = 0; i6 < i4; i6 += 2) {
                int i7 = i6 + 1;
                hVar.j(i7, iVar3);
                hVar.j(i6, iVar);
                hVar.e(i6, iVar3);
                iVar.i(iVar3, hVar, i7);
            }
            i2 = 2;
        } else {
            i2 = 1;
        }
        i iVar9 = new i();
        i iVar10 = new i();
        while (i2 <= iNumberOfLeadingZeros) {
            h hVar2 = hVarArr[i2 - 1];
            int i8 = i5 << (i2 + 1);
            int i9 = 0;
            while (i9 < i4) {
                int i10 = i2;
                int i11 = 0;
                while (true) {
                    i3 = i9;
                    int i12 = i8 / 4;
                    if (i11 < i12) {
                        iVar9.e(hVar2, i11);
                        iVar9.f(iVar10);
                        int i13 = i11;
                        int i14 = i3 + i13;
                        hVar.j(i14, iVar);
                        int i15 = i12 + i14;
                        hVar.q(i15, iVar9, iVar2);
                        h hVar3 = hVar2;
                        int i16 = i14 + (i8 / 2);
                        hVar.q(i16, iVar10, iVar3);
                        i iVar11 = iVar10;
                        int i17 = i14 + ((i8 * 3) / 4);
                        hVar.o(i17, iVar9, iVar4);
                        iVar5.f1701a = iVar.f1701a + iVar2.f1701a;
                        iVar5.f1702b = iVar.f1702b + iVar2.f1702b;
                        iVar5.a(iVar3);
                        iVar5.a(iVar4);
                        iVar6.f1701a = iVar.f1701a - iVar2.f1702b;
                        iVar6.f1702b = iVar.f1702b + iVar2.f1701a;
                        iVar6.g(iVar3);
                        iVar6.f1701a += iVar4.f1702b;
                        iVar6.f1702b -= iVar4.f1701a;
                        iVar7.f1701a = iVar.f1701a - iVar2.f1701a;
                        iVar7.f1702b = iVar.f1702b - iVar2.f1702b;
                        iVar7.a(iVar3);
                        iVar7.g(iVar4);
                        iVar8.f1701a = iVar.f1701a + iVar2.f1702b;
                        iVar8.f1702b = iVar.f1702b - iVar2.f1701a;
                        iVar8.g(iVar3);
                        iVar8.f1701a -= iVar4.f1702b;
                        iVar8.f1702b += iVar4.f1701a;
                        iVar5.c(hVar, i14);
                        iVar6.c(hVar, i15);
                        iVar7.c(hVar, i16);
                        iVar8.c(hVar, i17);
                        i11 = i13 + 1;
                        i9 = i3;
                        iVar10 = iVar11;
                        i4 = i4;
                        hVar2 = hVar3;
                        iNumberOfLeadingZeros = iNumberOfLeadingZeros;
                    }
                }
                i9 = i3 + i8;
                i2 = i10;
            }
            i2 += 2;
            i5 = 1;
        }
        int i18 = iNumberOfLeadingZeros;
        for (int i19 = 0; i19 < i4; i19++) {
            hVar.x(i19, -i18);
        }
    }

    private static void k(h hVar, h[] hVarArr, h hVar2) {
        int i2 = hVar.f1699b / 3;
        h hVar3 = new h(hVar, 0, i2);
        int i3 = i2 + i2;
        h hVar4 = new h(hVar, i2, i3);
        h hVar5 = new h(hVar, i3, hVar.f1699b);
        j(hVar3, hVarArr);
        j(hVar4, hVarArr);
        j(hVar5, hVarArr);
        i iVar = new i();
        for (int i4 = 0; i4 < hVar.f1699b / 4; i4++) {
            iVar.e(hVar2, i4);
            hVar4.l(i4, iVar);
            hVar5.l(i4, iVar);
            hVar5.l(i4, iVar);
        }
        for (int i5 = hVar.f1699b / 4; i5 < i2; i5++) {
            iVar.e(hVar2, i5 - (hVar.f1699b / 4));
            hVar4.m(i5, iVar);
            hVar5.m(i5, iVar);
            hVar5.m(i5, iVar);
        }
        h(hVar3, hVar4, hVar5, -1, 0.3333333333333333d);
    }

    private static h[] l(int i2) {
        h[] hVarArr = new h[i2 + 1];
        while (i2 >= 0) {
            if (i2 < 20) {
                if (f1705c[i2] == null) {
                    f1705c[i2] = e(1 << i2);
                }
                hVarArr[i2] = f1705c[i2];
            } else {
                hVarArr[i2] = e(1 << i2);
            }
            i2 -= 2;
        }
        return hVarArr;
    }
}
