package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public final class abzi {
    public static volatile admf a;
    public static volatile admf b;
    public static volatile admf c;
    public static volatile admf d;

    private abzi() {
    }

    public static abzh a(adix adixVar) {
        return (abzh) abzh.b(new zkr(2), adixVar);
    }

    public static final double b(double[] dArr, double[] dArr2) {
        double d2 = dArr[0] - dArr2[0];
        double d3 = dArr[1] - dArr2[1];
        double d4 = dArr[2] - dArr2[2];
        return (d2 * d2) + (d3 * d3) + (d4 * d4);
    }

    public static final double[] c(int i) {
        double[][] dArr = acaf.a;
        double dV = a.v((i >> 16) & 255);
        double dV2 = a.v((i >> 8) & 255);
        double dV3 = a.v(i & 255);
        double[][] dArr2 = acaf.a;
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * dV;
        double d3 = dArr3[1] * dV2;
        double d4 = dArr3[2] * dV3;
        double[] dArr4 = dArr2[1];
        double d5 = dArr4[0] * dV;
        double d6 = dArr4[1] * dV2;
        double d7 = dArr4[2] * dV3;
        double[] dArr5 = dArr2[2];
        double d8 = dArr5[0] * dV;
        double d9 = dArr5[1] * dV2;
        double d10 = dArr5[2] * dV3;
        double[] dArr6 = acaf.c;
        double d11 = ((d2 + d3) + d4) / dArr6[0];
        double d12 = ((d5 + d6) + d7) / dArr6[1];
        double d13 = ((d8 + d9) + d10) / dArr6[2];
        double dT = a.t(d11);
        double dT2 = a.t(d12);
        double[] dArr7 = {(116.0d * dT2) - 16.0d, (dT - dT2) * 500.0d, (dT2 - a.t(d13)) * 200.0d};
        return new double[]{dArr7[0], dArr7[1], dArr7[2]};
    }

    static int d(acab acabVar, int[] iArr) {
        int i = acabVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acabVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acabVar.f;
        int i7 = iArr[i5 + i6];
        int i8 = acabVar.e;
        int i9 = i7 - iArr[i5 + i8];
        int i10 = acabVar.c;
        int i11 = i10 << 5;
        int i12 = i2 + i11 + i10;
        int i13 = (i9 - iArr[i12 + i6]) + iArr[i12 + i8];
        int i14 = acabVar.a;
        int i15 = (i14 << 10) + (i14 << 6) + i14;
        int i16 = i4 + i15 + i3;
        int i17 = i15 + i11 + i10;
        return (((i13 - iArr[i16 + i6]) + iArr[i16 + i8]) + iArr[i6 + i17]) - iArr[i17 + i8];
    }

    static int e(acab acabVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = acabVar.a;
            int i6 = acabVar.d;
            int i7 = acabVar.f;
            int i8 = (i5 << 10) + (i5 << 6) + i5;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = -iArr[i9 + i7];
            int i11 = acabVar.e;
            int i12 = i10 + iArr[i9 + i11];
            int i13 = acabVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i2 = i12 + iArr[i7 + i14];
            i3 = iArr[i14 + i11];
        } else if (i4 != 1) {
            int i15 = acabVar.b;
            int i16 = acabVar.d;
            int i17 = acabVar.e;
            int i18 = i16 << 5;
            int i19 = (i15 << 10) + (i15 << 6) + i15;
            int i20 = -iArr[i19 + i18 + i16 + i17];
            int i21 = acabVar.c;
            int i22 = i21 << 5;
            int i23 = i20 + iArr[i19 + i22 + i21 + i17];
            int i24 = acabVar.a;
            int i25 = (i24 << 10) + (i24 << 6) + i24;
            i2 = i23 + iArr[i18 + i25 + i16 + i17];
            i3 = iArr[i25 + i22 + i21 + i17];
        } else {
            int i26 = acabVar.b;
            int i27 = acabVar.c;
            int i28 = acabVar.f;
            int i29 = i27 << 5;
            int i30 = (i26 << 10) + (i26 << 6) + i26 + i29 + i27;
            int i31 = -iArr[i30 + i28];
            int i32 = acabVar.e;
            int i33 = i31 + iArr[i30 + i32];
            int i34 = acabVar.a;
            int i35 = (i34 << 10) + (i34 << 6) + i34 + i29 + i27;
            i2 = i33 + iArr[i28 + i35];
            i3 = iArr[i35 + i32];
        }
        return i2 - i3;
    }

    static int f(acab acabVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = acabVar.d;
            int i7 = acabVar.f;
            int i8 = (i2 << 10) + (i2 << 6) + i2;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = iArr[i9 + i7];
            int i11 = acabVar.e;
            int i12 = i10 - iArr[i9 + i11];
            int i13 = acabVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i3 = i12 - iArr[i7 + i14];
            i4 = iArr[i14 + i11];
        } else if (i5 != 1) {
            int i15 = acabVar.b;
            int i16 = acabVar.d;
            int i17 = i16 << 5;
            int i18 = (i15 << 10) + (i15 << 6) + i15;
            int i19 = iArr[i18 + i17 + i16 + i2];
            int i20 = acabVar.c;
            int i21 = i20 << 5;
            int i22 = i19 - iArr[((i18 + i21) + i20) + i2];
            int i23 = acabVar.a;
            int i24 = (i23 << 10) + (i23 << 6) + i23;
            i3 = i22 - iArr[((i17 + i24) + i16) + i2];
            i4 = iArr[i24 + i21 + i20 + i2];
        } else {
            int i25 = acabVar.b;
            int i26 = acabVar.f;
            int i27 = i2 << 5;
            int i28 = (i25 << 10) + (i25 << 6) + i25 + i27 + i2;
            int i29 = iArr[i28 + i26];
            int i30 = acabVar.e;
            int i31 = i29 - iArr[i28 + i30];
            int i32 = acabVar.a;
            int i33 = (i32 << 10) + (i32 << 6) + i32 + i27 + i2;
            i3 = i31 - iArr[i26 + i33];
            i4 = iArr[i33 + i30];
        }
        return i3 + i4;
    }

    static final acac g(acab acabVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        acab acabVar2 = acabVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iE = e(acabVar2, i8, iArr6);
        int iE2 = e(acabVar2, i8, iArr3);
        int iE3 = e(acabVar2, i8, iArr4);
        int iE4 = e(acabVar2, i8, iArr5);
        double d2 = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iF = f(acabVar2, i8, i10, iArr6) + iE;
            int iF2 = iE2 + f(acabVar2, i8, i10, iArr3);
            int iF3 = iE3 + f(acabVar2, i8, i10, iArr4);
            int iF4 = iE4 + f(acabVar2, i8, i10, iArr5);
            if (iF4 != 0) {
                int i11 = iF * iF;
                int i12 = iF2 * iF2;
                int i13 = iF3 * iF3;
                int i14 = i4 - iF;
                int i15 = i5 - iF2;
                int i16 = i6 - iF3;
                int i17 = i7 - iF4;
                if (i17 != 0) {
                    double d3 = (((i11 + i12) + i13) / iF4) + ((((i14 * i14) + (i15 * i15)) + (i16 * i16)) / i17);
                    if (d3 > d2) {
                        d2 = d3;
                        i9 = i10;
                    }
                }
            }
            i10++;
            acabVar2 = acabVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new acac(i9, d2);
    }

    static final double h(acab acabVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iD = d(acabVar, iArr2);
        int iD2 = d(acabVar, iArr3);
        int iD3 = d(acabVar, iArr4);
        int i = acabVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acabVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acabVar.f;
        double d2 = dArr[i5 + i6];
        int i7 = acabVar.e;
        double d3 = d2 - dArr[i5 + i7];
        int i8 = acabVar.c;
        int i9 = i8 << 5;
        int i10 = i2 + i9 + i8;
        double d4 = (d3 - dArr[i10 + i6]) + dArr[i10 + i7];
        int i11 = acabVar.a;
        int i12 = (i11 << 10) + (i11 << 6) + i11;
        int i13 = i4 + i12 + i3;
        int i14 = i12 + i9 + i8;
        return ((((d4 - dArr[i13 + i6]) + dArr[i13 + i7]) + dArr[i6 + i14]) - dArr[i14 + i7]) - ((((iD * iD) + (iD2 * iD2)) + (iD3 * iD3)) / d(acabVar, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x02c7 A[EDGE_INSN: B:190:0x02c7->B:77:0x02c7 BREAK  A[LOOP:6: B:28:0x016e->B:75:0x02b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b8 A[LOOP:6: B:28:0x016e->B:75:0x02b8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map i(int[] r36) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzi.i(int[]):java.util.Map");
    }

    public static final /* synthetic */ abqx j(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (abqx) abnvVarQ;
    }

    public static final void k(yzz yzzVar, abnp abnpVar) {
        yzzVar.getClass();
        abnpVar.t();
        abqx abqxVar = (abqx) abnpVar.b;
        abqx abqxVar2 = abqx.a;
        abqxVar.c = yzzVar.he;
        abqxVar.b |= 1;
    }

    public static final void l(abpt abptVar, abnp abnpVar) {
        abnpVar.t();
        abqx abqxVar = (abqx) abnpVar.b;
        abqx abqxVar2 = abqx.a;
        abqxVar.d = abptVar;
        abqxVar.b |= 2;
    }

    public static final /* synthetic */ abqj m(abnp abnpVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((abqw) abnpVar.b).c);
        listUnmodifiableList.getClass();
        return new abqj(listUnmodifiableList);
    }

    public static final /* synthetic */ abqw n(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (abqw) abnvVarQ;
    }

    public static final void o(abpt abptVar, abnp abnpVar) {
        abnpVar.t();
        abqw abqwVar = (abqw) abnpVar.b;
        abqw abqwVar2 = abqw.a;
        abqwVar.d = abptVar;
        abqwVar.b |= 1;
    }

    public static final void p(abpt abptVar, abnp abnpVar) {
        abnpVar.t();
        abqw abqwVar = (abqw) abnpVar.b;
        abqw abqwVar2 = abqw.a;
        abqwVar.e = abptVar;
        abqwVar.b |= 2;
    }

    public static final abpt q(Instant instant) {
        abpt abptVarAg = wox.ag(instant);
        abptVarAg.getClass();
        return abptVarAg;
    }

    public static final Duration r(abnf abnfVar) {
        Duration durationAh = wox.ah(abnfVar);
        durationAh.getClass();
        return durationAh;
    }

    public static int s(abpt abptVar, abpt abptVar2) {
        abqu.g(abptVar);
        abqu.g(abptVar2);
        int iCompare = Long.compare(abptVar.b, abptVar2.b);
        return iCompare != 0 ? iCompare : Integer.compare(abptVar.c, abptVar2.c);
    }
}
