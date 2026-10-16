package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uta {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ypg b = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/vector/gl/GeometryUtilInternal");
    private static final int[] c = {1, 0, 3, 2};
    private static final int[] d = {3, 2, 1, 0};
    private static final int[] e = {5, 4};
    private static final int[] f = {5, 4, 6, 5, 4};
    private static final float g = 0.5f / defpackage.ust.b;

    public static float a(float f2) {
        while (f2 > 5.368709E8f) {
            f2 -= 1.0737418E9f;
        }
        while (f2 < -5.368709E8f) {
            f2 += 1.0737418E9f;
        }
        return f2;
    }

    static int b(float f2) {
        return ((int) (((f2 * g) + 0.5f) * 255.0f)) & 255;
    }

    static int c(float f2) {
        return (char) (((f2 * g) + 0.5f) * 65535.0f);
    }

    public static defpackage.usy d(float[] fArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 4) {
            defpackage.ysr.bj(fArr[i] <= 255.0f);
            float f2 = fArr[i] * 0.003921569f;
            i++;
            int i4 = (int) (f2 * 65535.0f);
            i3 = (i3 << 8) | (i4 & 255);
            i2 = (i2 << 8) | ((i4 >> 8) & 255);
        }
        return new defpackage.usy(i2, i3);
    }

    public static void e(float[] fArr, float f2, float f3, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float f4, float f5, defpackage.uti utiVar) {
        int i;
        int i2;
        int length = fArr.length;
        if (length < 4) {
            return;
        }
        int i3 = length >> 1;
        int i4 = (iArr == null || iArr.length == 0) ? i3 : iArr[0];
        float f6 = fArr2[0] * f4;
        float f7 = fArr3[0] * f4;
        float f8 = fArr4[0] * f4;
        if (f6 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            defpackage.tqf tqfVarB = defpackage.tqf.b();
            defpackage.tqd tqdVarA = tqfVarB.a();
            defpackage.tqd tqdVarA2 = tqfVarB.a();
            defpackage.tqd tqdVarA3 = tqfVarB.a();
            tqdVarA.b = a(fArr[0] - f2);
            tqdVarA.c = fArr[1] - f3;
            tqdVarA2.b = a(fArr[2] - f2);
            tqdVarA2.c = fArr[3] - f3;
            defpackage.tqd.p(tqdVarA2, tqdVarA, tqdVarA3);
            tqdVarA3.b = a(tqdVarA3.b);
            float fC = tqdVarA3.c();
            defpackage.tqd tqdVarA4 = tqfVarB.a();
            defpackage.tqd tqdVarA5 = tqfVarB.a();
            float f9 = f6;
            float f10 = f8 + f5;
            int i5 = 1;
            float f11 = f7;
            int i6 = 0;
            boolean z = false;
            float f12 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            float f13 = fC;
            int i7 = i4;
            int i8 = 0;
            int i9 = 0;
            while (i8 < i3 && i9 < 20) {
                float f14 = f10 - f5;
                float f15 = f14 - f12;
                float f16 = f13;
                int i10 = i8;
                int i11 = i5;
                float f17 = f12;
                float fC2 = f16;
                while (true) {
                    if (f15 <= fC2) {
                        i = i11;
                        i2 = i10;
                        break;
                    }
                    int i12 = i11 + 1;
                    if (i12 == i3) {
                        i2 = i11;
                        i = i12;
                        z = true;
                        break;
                    }
                    tqdVarA.o(tqdVarA2);
                    int i13 = i12 + i12;
                    float f18 = f14;
                    tqdVarA2.b = a(fArr[i13] - f2);
                    tqdVarA2.c = fArr[i13 + 1] - f3;
                    defpackage.tqd.p(tqdVarA2, tqdVarA, tqdVarA3);
                    tqdVarA3.b = a(tqdVarA3.b);
                    f17 += fC2;
                    fC2 = tqdVarA3.c();
                    f15 = f18 - f17;
                    i10 = i11;
                    i11 = i12;
                    f14 = f18;
                }
                if (z) {
                    break;
                }
                defpackage.tqd.i(tqdVarA3, f15 / fC2, tqdVarA4);
                defpackage.tqd.g(tqdVarA4, tqdVarA, tqdVarA4);
                tqdVarA4.b = a(tqdVarA4.b);
                tqdVarA5.o(tqdVarA3);
                float f19 = f9 / 2.0f;
                defpackage.tqf tqfVarB2 = defpackage.tqf.b();
                defpackage.tqd.k(tqdVarA5, tqdVarA5);
                defpackage.tqd.l(tqdVarA5, tqdVarA5);
                int i14 = i7;
                defpackage.tqd tqdVarA6 = tqfVarB2.a();
                int i15 = i3;
                defpackage.tqd tqdVarA7 = tqfVarB2.a();
                defpackage.tqd tqdVar = tqdVarA3;
                defpackage.tqd tqdVarA8 = tqfVarB2.a();
                defpackage.tqd tqdVar2 = tqdVarA2;
                defpackage.tqd tqdVarA9 = tqfVarB2.a();
                int i16 = i9;
                float f20 = -f19;
                m(f20, f19, tqdVarA5, tqdVarA6);
                m(f20, f20, tqdVarA5, tqdVarA7);
                m(f19, f20, tqdVarA5, tqdVarA8);
                m(f19, f19, tqdVarA5, tqdVarA9);
                boolean zM = utiVar.m(utiVar.f + 6);
                defpackage.tqd tqdVar3 = tqdVarA5;
                defpackage.tqf tqfVar = tqfVarB;
                defpackage.tqd tqdVar4 = tqdVarA;
                float f21 = f10;
                utiVar.e(tqdVarA4.b + tqdVarA6.b, tqdVarA4.c + tqdVarA6.c, f21, 0, 1);
                utiVar.e(tqdVarA7.b + tqdVarA4.b, tqdVarA7.c + tqdVarA4.c, f21, 0, 0);
                utiVar.e(tqdVarA8.b + tqdVarA4.b, tqdVarA8.c + tqdVarA4.c, f21, 1, 0);
                utiVar.e(tqdVarA6.b + tqdVarA4.b, tqdVarA6.c + tqdVarA4.c, f21, 0, 1);
                utiVar.e(tqdVarA8.b + tqdVarA4.b, tqdVarA8.c + tqdVarA4.c, f21, 1, 0);
                utiVar.e(tqdVarA9.b + tqdVarA4.b, tqdVarA9.c + tqdVarA4.c, f21, 1, 1);
                tqfVarB2.c(tqdVarA6);
                tqfVarB2.c(tqdVarA7);
                tqfVarB2.c(tqdVarA8);
                tqfVarB2.c(tqdVarA9);
                i9 = !zM ? i16 + 1 : i16;
                if (i2 >= i14) {
                    int i17 = i6 + 1;
                    int i18 = (iArr == null || i17 >= iArr.length) ? i15 : iArr[i17];
                    if (i17 < fArr2.length) {
                        f9 = f4 * fArr2[i17];
                    }
                    if (i17 < fArr3.length) {
                        i6 = i17;
                        i7 = i18;
                        f11 = fArr3[i17] * f4;
                    } else {
                        i6 = i17;
                        i7 = i18;
                    }
                } else {
                    i7 = i14;
                }
                float f22 = f9 + f11 + f21;
                tqfVarB = tqfVar;
                i8 = i2;
                tqdVarA5 = tqdVar3;
                f13 = fC2;
                f12 = f17;
                i3 = i15;
                i5 = i;
                tqdVarA3 = tqdVar;
                tqdVarA2 = tqdVar2;
                tqdVarA = tqdVar4;
                f10 = f22;
            }
            defpackage.tqf tqfVar2 = tqfVarB;
            utiVar.i();
            tqfVar2.c(tqdVarA4);
            tqfVar2.c(tqdVarA5);
            tqfVar2.c(tqdVarA);
            tqfVar2.c(tqdVarA2);
            tqfVar2.c(tqdVarA3);
        }
    }

    static void f(int[] iArr, int i, int i2, int[] iArr2, float[] fArr, float[] fArr2, float[] fArr3, float f2, float f3, defpackage.uti utiVar) {
        int length = iArr.length;
        if (length < 4) {
            return;
        }
        float[] fArr4 = new float[length];
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            fArr4[i3] = iArr[i3] - i;
            int i4 = i3 + 1;
            fArr4[i4] = iArr[i4] - i2;
        }
        e(fArr4, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, iArr2, fArr, fArr2, fArr3, f2, f3, utiVar);
    }

    public static void g(defpackage.usz uszVar, float[] fArr, int i, int i2, int i3, int i4, int[] iArr, float[] fArr2, int[] iArr2, boolean z, float f2, defpackage.uti utiVar) {
        char c2;
        defpackage.qsv qsvVar;
        float[] fArr3;
        defpackage.tqd tqdVar;
        int[] iArr3;
        if (uszVar.a() < 4) {
            return;
        }
        defpackage.usw uswVar = new defpackage.usw(uszVar, utiVar.g, i4, fArr2, iArr2, iArr, fArr);
        uswVar.i = i;
        uswVar.j = i2;
        uswVar.k = i3;
        uswVar.l = z;
        defpackage.usx usxVar = new defpackage.usx(uswVar);
        usxVar.l = 0;
        usxVar.k = 0;
        usxVar.j = iArr2.length == 0 ? uswVar.n : iArr2[0];
        usxVar.i = f2;
        int iA = uszVar.a() / 2;
        float[] fArr4 = new float[iA];
        fArr4[0] = f2;
        defpackage.tqd tqdVar2 = new defpackage.tqd();
        defpackage.tqd tqdVar3 = new defpackage.tqd();
        for (int i5 = 1; i5 < iA; i5++) {
            int i6 = i5 - 1;
            uszVar.d(i6 + i6, tqdVar2);
            uszVar.d(i5 + i5, tqdVar3);
            defpackage.tqd tqdVar4 = new defpackage.tqd();
            defpackage.tqd.p(tqdVar3, tqdVar2, tqdVar4);
            if (z) {
                tqdVar4.b = a(tqdVar4.b);
            }
            fArr4[i5] = fArr4[i6] + tqdVar4.c();
        }
        defpackage.xtf xtfVar = new defpackage.xtf(iArr[usxVar.k]);
        xtfVar.e = f2;
        xtfVar.a = fArr4[java.lang.Math.min(iA - 1, usxVar.j)] - xtfVar.e;
        xtfVar.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        xtfVar.d = uswVar.m ? 0.0f : fArr[usxVar.k];
        defpackage.qsv qsvVar2 = new defpackage.qsv((char[]) null, (byte[]) null);
        defpackage.tqf tqfVarB = defpackage.tqf.b();
        defpackage.tqd tqdVarA = tqfVarB.a();
        defpackage.tqd tqdVarA2 = tqfVarB.a();
        defpackage.tqd tqdVarC = uszVar.c();
        if (tqdVarC == null) {
            uszVar.d(0, usxVar.a);
            uszVar.d(2, usxVar.b);
            usxVar.a();
            defpackage.tqd tqdVar5 = usxVar.e;
            defpackage.tqd.l(tqdVar5, tqdVarA2);
            defpackage.tqd tqdVar6 = usxVar.a;
            float f3 = xtfVar.d;
            c2 = 3;
            defpackage.tqd tqdVar7 = (defpackage.tqd) qsvVar2.b;
            o(tqdVar5, f3, tqdVar7);
            defpackage.tqd.g(tqdVar6, tqdVar7, tqdVarA);
            defpackage.tqf tqfVarB2 = defpackage.tqf.b();
            defpackage.tqd tqdVarA3 = tqfVarB2.a();
            tqdVarA3.o(tqdVar5);
            defpackage.tqd.j(tqdVarA3, tqdVarA3);
            if (n(uswVar.i) && !uswVar.h) {
                defpackage.tqd tqdVar8 = new defpackage.tqd();
                defpackage.tqd.p(tqdVarA2, tqdVar5, tqdVar8);
                iArr3 = c;
                r(utiVar, uswVar, tqdVarA, iArr3[0], -1.0f, tqdVar8, xtfVar);
                utiVar.j();
                defpackage.tqd tqdVarA4 = tqfVarB2.a();
                defpackage.tqd.g(tqdVarA2, tqdVar5, tqdVarA4);
                r(utiVar, uswVar, tqdVarA, iArr3[1], -1.0f, tqdVarA4, xtfVar);
                tqfVarB2.c(tqdVarA4);
                tqdVar = tqdVarA3;
            } else if (uswVar.h) {
                iArr3 = c;
                r(utiVar, uswVar, tqdVarA, iArr3[2], usxVar.i, tqdVarA3, xtfVar);
                tqdVar = tqdVarA3;
            } else {
                tqdVar = tqdVarA3;
                iArr3 = c;
                r(utiVar, uswVar, tqdVarA, iArr3[2], usxVar.i, tqdVar, xtfVar);
            }
            r(utiVar, uswVar, tqdVarA, iArr3[2], usxVar.i, tqdVar, xtfVar);
            r(utiVar, uswVar, tqdVarA, iArr3[3], usxVar.i, tqdVar5, xtfVar);
            tqfVarB2.c(tqdVar);
            fArr3 = fArr4;
            qsvVar = qsvVar2;
        } else {
            c2 = 3;
            usxVar.a = tqdVarC;
            uszVar.d(0, usxVar.b);
            uszVar.d(2, usxVar.c);
            usxVar.a();
            t(utiVar, uswVar, xtfVar, usxVar, qsvVar2, fArr4, tqdVarA, true);
            qsvVar = qsvVar2;
            fArr3 = fArr4;
        }
        usxVar.l = 1;
        if (uszVar.a() > 4) {
            int i7 = 2;
            while (i7 < uszVar.a() - 2) {
                i7 += 2;
                uszVar.d(i7, usxVar.c);
                t(utiVar, uswVar, xtfVar, usxVar, qsvVar, fArr3, tqdVarA, false);
                usxVar.l++;
            }
        } else {
            usxVar.c.o(usxVar.b);
            usxVar.f.o(usxVar.e);
        }
        float f4 = usxVar.i;
        defpackage.tqd tqdVar9 = usxVar.d;
        float fC = f4 + tqdVar9.c();
        usxVar.i = fC;
        xtfVar.b = (fC - xtfVar.e) / xtfVar.a;
        defpackage.tqd tqdVarB = uszVar.b();
        if (tqdVarB == null) {
            defpackage.tqd tqdVar10 = usxVar.c;
            defpackage.tqd tqdVar11 = usxVar.f;
            float f5 = xtfVar.d;
            defpackage.tqd tqdVar12 = (defpackage.tqd) qsvVar.b;
            o(tqdVar11, f5, tqdVar12);
            defpackage.tqd.g(tqdVar10, tqdVar12, tqdVarA);
            if (n(uswVar.j) && !uswVar.h) {
                boolean z2 = uswVar.e;
                int[] iArr4 = d;
                int iK = k(z2, iArr4[0]);
                float f6 = usxVar.i;
                defpackage.tqd tqdVar13 = (defpackage.tqd) qsvVar.a;
                defpackage.tqd.j(tqdVar11, tqdVar13);
                r(utiVar, uswVar, tqdVarA, iK, f6, tqdVar13, xtfVar);
                r(utiVar, uswVar, tqdVarA, k(z2, iArr4[1]), usxVar.i, tqdVar11, xtfVar);
                float f7 = usxVar.i + 2.0f;
                defpackage.tqd.l(tqdVar11, tqdVarA2);
                defpackage.tqd.j(tqdVarA2, tqdVarA2);
                int iK2 = k(z2, iArr4[2]);
                defpackage.tqd.p(tqdVarA2, tqdVar11, tqdVar13);
                float f8 = -f7;
                r(utiVar, uswVar, tqdVarA, iK2, f8, tqdVar13, xtfVar);
                int iK3 = k(z2, iArr4[c2]);
                defpackage.tqd.g(tqdVarA2, tqdVar11, tqdVar13);
                r(utiVar, uswVar, tqdVarA, iK3, f8, tqdVar13, xtfVar);
                utiVar.j();
            } else if (uswVar.h) {
                uswVar.o.d(2, usxVar.c);
                defpackage.tqd tqdVar14 = usxVar.c;
                defpackage.tqd tqdVar15 = usxVar.b;
                defpackage.tqd tqdVar16 = (defpackage.tqd) qsvVar.a;
                defpackage.tqd.p(tqdVar14, tqdVar15, tqdVar16);
                if (uswVar.l) {
                    tqdVar16.b = a(tqdVar16.b);
                }
                defpackage.tqd.l(tqdVar16, tqdVar11);
                defpackage.tqd.k(tqdVar11, tqdVar11);
                defpackage.tqd.i(tqdVar11, 255.0f, tqdVar11);
                boolean z3 = defpackage.tqd.a(defpackage.tqd.a, tqdVar9, tqdVar16) > 0;
                defpackage.tqd tqdVar17 = usxVar.e;
                defpackage.tqd tqdVarL = l(tqdVar17, tqdVar11);
                o(tqdVarL, xtfVar.d, tqdVar12);
                defpackage.tqd tqdVar18 = (defpackage.tqd) qsvVar.d;
                defpackage.tqd.g(tqdVar15, tqdVar12, tqdVar18);
                s(utiVar, uswVar, tqdVar18, tqdVar17, tqdVar11, tqdVarL, usxVar.i, xtfVar, xtfVar, false, z3);
                utiVar.j();
            } else {
                int[] iArr5 = d;
                int i8 = iArr5[0];
                float f9 = usxVar.i;
                defpackage.tqd tqdVar19 = (defpackage.tqd) qsvVar.a;
                defpackage.tqd.j(tqdVar11, tqdVar19);
                r(utiVar, uswVar, tqdVarA, i8, f9, tqdVar19, xtfVar);
                r(utiVar, uswVar, tqdVarA, iArr5[1], usxVar.i, tqdVar11, xtfVar);
                utiVar.j();
            }
        } else {
            usxVar.c = tqdVarB;
            t(utiVar, uswVar, xtfVar, usxVar, qsvVar, fArr3, tqdVarA, false);
            utiVar.j();
        }
        tqfVarB.c(tqdVarA);
        tqfVarB.c(tqdVarA2);
    }

    public static void h(int i, int[] iArr, int i2, int i3, int i4, float[] fArr, int i5, int i6, int i7, int i8, int[] iArr2, float[] fArr2, int[] iArr3, boolean z, float f2, int[] iArr4, int[] iArr5, defpackage.uti utiVar) {
        g(new defpackage.usv(iArr, i, i2, i3, i4, z, iArr4, iArr5), fArr, i5, i6, i7, i8, iArr2, fArr2, iArr3, z, f2, utiVar);
        utiVar.i();
    }

    private static float i(defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        return (float) java.lang.Math.atan2(defpackage.tqd.a(defpackage.tqd.a, tqdVar, tqdVar2), tqdVar.b(tqdVar2));
    }

    private static float j(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3, defpackage.tqd tqdVar4, defpackage.tqd tqdVar5) {
        defpackage.tqd.p(tqdVar2, tqdVar, tqdVar4);
        defpackage.tqd.p(tqdVar3, tqdVar, tqdVar5);
        return tqdVar5.b(tqdVar4) / tqdVar4.b(tqdVar4);
    }

    private static int k(boolean z, int i) {
        return z ? i : i + 8;
    }

    private static defpackage.tqd l(defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        defpackage.tqd tqdVar3 = new defpackage.tqd();
        defpackage.tqd.g(tqdVar, tqdVar2, tqdVar3);
        double dAbs = java.lang.Math.abs(255.0d / java.lang.Math.cos(i(tqdVar, tqdVar2) / 2.0f));
        defpackage.tqd.k(tqdVar3, tqdVar3);
        defpackage.tqd.i(tqdVar3, (float) dAbs, tqdVar3);
        return tqdVar3;
    }

    private static void m(float f2, float f3, defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        tqdVar2.n(f2, f3);
        defpackage.tqd.e(tqdVar2, tqdVar, tqdVar2);
    }

    private static boolean n(int i) {
        return i == 2 || i == 1 || i == 4;
    }

    private static void o(defpackage.tqd tqdVar, float f2, defpackage.tqd tqdVar2) {
        if (f2 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            tqdVar2.n(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float fC = tqdVar.c();
        if (fC == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            tqdVar2.o(tqdVar);
        } else {
            defpackage.tqd.i(tqdVar, f2 / fC, tqdVar2);
        }
    }

    private static int p(defpackage.uti utiVar, defpackage.usw uswVar, defpackage.xtf xtfVar, int i) {
        int i2 = (i << 24) & (-16777216);
        if (!utiVar.b) {
            return uswVar.g | i2 | (xtfVar.c & 255);
        }
        return ((uswVar.f << 8) & 65280) | i2 | ((((int) (xtfVar.b * 255.0f)) << 16) & 16711680) | (xtfVar.c & 255);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c A[LOOP:0: B:19:0x0089->B:21:0x008c, LOOP_END] */
    private static void q(defpackage.uti utiVar, defpackage.usw uswVar, defpackage.tqd tqdVar, float f2, defpackage.xtf xtfVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3, int i) {
        defpackage.tqd[] tqdVarArr;
        int iAbs;
        defpackage.tqd[] tqdVarArr2;
        int i2;
        defpackage.usw uswVar2 = uswVar;
        int i3 = uswVar2.k;
        if (i3 != 0) {
            float fI = i(tqdVar2, tqdVar3);
            if (i3 == 1) {
                iAbs = 2;
            } else {
                if (i3 == 2) {
                    iAbs = (int) (((double) (java.lang.Math.abs(fI) * 10.0f)) / 3.141592653589793d);
                    if (iAbs <= 0) {
                        tqdVarArr = new defpackage.tqd[0];
                    }
                    for (defpackage.tqd tqdVar4 : tqdVarArr2) {
                        r(utiVar, uswVar2, tqdVar, i, f2, tqdVar4, xtfVar);
                        uswVar2 = uswVar;
                        r(utiVar, uswVar2, tqdVar, f[2], f2, defpackage.tqd.a, xtfVar);
                    }
                }
                ((defpackage.ype) ((defpackage.ype) b.h()).ai(9656)).w("Unknown jointShape: %d", i3);
                tqdVarArr = new defpackage.tqd[0];
            }
            defpackage.tqd[] tqdVarArr3 = new defpackage.tqd[iAbs - 1];
            for (int i4 = 1; i4 < iAbs; i4++) {
                defpackage.tqd tqdVar5 = new defpackage.tqd();
                double d2 = (i4 * fI) / iAbs;
                tqdVar5.b = (float) ((((double) tqdVar2.b) * java.lang.Math.cos(d2)) - (((double) tqdVar2.c) * java.lang.Math.sin(d2)));
                tqdVar5.c = (float) ((((double) tqdVar2.b) * java.lang.Math.sin(d2)) + (((double) tqdVar2.c) * java.lang.Math.cos(d2)));
                tqdVarArr3[i4 - 1] = tqdVar5;
            }
            tqdVarArr2 = tqdVarArr3;
            while (i2 < tqdVarArr2.length) {
                r(utiVar, uswVar2, tqdVar, i, f2, tqdVar4, xtfVar);
                uswVar2 = uswVar;
                r(utiVar, uswVar2, tqdVar, f[2], f2, defpackage.tqd.a, xtfVar);
            }
        }
        tqdVarArr = new defpackage.tqd[0];
        tqdVarArr2 = tqdVarArr;
        while (i2 < tqdVarArr2.length) {
            r(utiVar, uswVar2, tqdVar, i, f2, tqdVar4, xtfVar);
            uswVar2 = uswVar;
            r(utiVar, uswVar2, tqdVar, f[2], f2, defpackage.tqd.a, xtfVar);
        }
    }

    private static void r(defpackage.uti utiVar, defpackage.usw uswVar, defpackage.tqd tqdVar, int i, float f2, defpackage.tqd tqdVar2, defpackage.xtf xtfVar) {
        defpackage.usy usyVar = uswVar.d;
        if (uswVar.e) {
            int iP = p(utiVar, uswVar, xtfVar, i);
            float f3 = utiVar.h * f2;
            double d2 = f3 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1.0d : -1.0d;
            int iMin = ((int) java.lang.Math.min(65535.0d, ((d2 * java.lang.Math.min(((double) f3) * d2, 131068.0d)) + 131068.0d) * 0.25d)) | ((b(tqdVar2.b) << 16) & 16711680) | ((b(tqdVar2.c) << 24) & (-16777216));
            if (usyVar == null) {
                utiVar.c(utiVar.i, tqdVar.b, tqdVar.c, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                utiVar.i.putInt(iP);
                utiVar.i.putInt(iMin);
                utiVar.f++;
                return;
            }
            utiVar.c(utiVar.i, tqdVar.b, tqdVar.c, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            utiVar.i.putInt(iP);
            utiVar.i.putInt(iMin);
            utiVar.i.putInt(usyVar.a);
            utiVar.i.putInt(usyVar.b);
            utiVar.f++;
            return;
        }
        int iP2 = p(utiVar, uswVar, xtfVar, i);
        int iC = c(tqdVar2.b);
        int iC2 = c(tqdVar2.c);
        int i2 = (iC >> 8) | ((iC2 << 8) & 16711680) | ((iC2 << 24) & (-16777216)) | (65280 & (iC << 8));
        if (usyVar == null) {
            utiVar.c(utiVar.i, tqdVar.b, tqdVar.c, f2);
            utiVar.i.putInt(iP2);
            utiVar.i.putInt(i2);
            utiVar.f++;
            return;
        }
        utiVar.c(utiVar.i, tqdVar.b, tqdVar.c, f2);
        utiVar.i.putInt(iP2);
        utiVar.i.putInt(i2);
        utiVar.i.putInt(usyVar.a);
        utiVar.i.putInt(usyVar.b);
        utiVar.f++;
    }

    private static void s(defpackage.uti utiVar, defpackage.usw uswVar, defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3, defpackage.tqd tqdVar4, float f2, defpackage.xtf xtfVar, defpackage.xtf xtfVar2, boolean z, boolean z2) {
        defpackage.tqd tqdVar5;
        defpackage.tqd tqdVar6;
        defpackage.tqd tqdVar7;
        defpackage.tqd tqdVar8;
        defpackage.tqd tqdVar9;
        defpackage.tqd tqdVar10;
        defpackage.tqd tqdVar11;
        defpackage.tqf tqfVarB = defpackage.tqf.b();
        defpackage.tqd tqdVarA = tqfVarB.a();
        tqdVarA.o(tqdVar2);
        defpackage.tqd.j(tqdVarA, tqdVarA);
        defpackage.tqd tqdVarA2 = tqfVarB.a();
        tqdVarA2.o(tqdVar2);
        defpackage.tqd tqdVarA3 = tqfVarB.a();
        tqdVarA3.n(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        defpackage.tqd tqdVarA4 = tqfVarB.a();
        tqdVarA4.o(tqdVar3);
        defpackage.tqd.j(tqdVarA4, tqdVarA4);
        defpackage.tqd tqdVarA5 = tqfVarB.a();
        tqdVarA5.o(tqdVar3);
        defpackage.tqd tqdVarA6 = tqfVarB.a();
        tqdVarA6.o(tqdVar4);
        defpackage.tqd.j(tqdVarA6, tqdVarA6);
        defpackage.tqd tqdVarA7 = tqfVarB.a();
        tqdVarA7.o(tqdVar4);
        if (z2) {
            int[] iArr = f;
            tqdVar6 = tqdVarA7;
            r(utiVar, uswVar, tqdVar, iArr[0], f2, tqdVarA, xtfVar);
            r(utiVar, uswVar, tqdVar, iArr[1], f2, tqdVarA2, xtfVar);
            r(utiVar, uswVar, tqdVar, iArr[0], f2, tqdVarA, xtfVar);
            r(utiVar, uswVar, tqdVar, iArr[2], f2, tqdVarA3, xtfVar);
            defpackage.tqd tqdVar12 = new defpackage.tqd();
            defpackage.tqd.j(tqdVar2, tqdVar12);
            defpackage.tqd tqdVar13 = new defpackage.tqd();
            defpackage.tqd.j(tqdVar3, tqdVar13);
            q(utiVar, uswVar, tqdVar, f2, xtfVar, tqdVar12, tqdVar13, iArr[0]);
            r(utiVar, uswVar, tqdVar, iArr[3], f2, tqdVarA4, xtfVar);
            tqdVar11 = tqdVarA4;
            r(utiVar, uswVar, tqdVar, iArr[4], f2, tqdVarA5, xtfVar);
            tqdVar10 = tqdVarA5;
            if (z) {
                r(utiVar, uswVar, tqdVar, iArr[3], f2, tqdVar11, xtfVar2);
                tqdVar5 = tqdVar11;
                r(utiVar, uswVar, tqdVar, iArr[4], f2, tqdVar10, xtfVar2);
                tqdVar7 = tqdVarA2;
                tqdVar8 = tqdVarA3;
                tqdVar9 = tqdVarA6;
                tqdVar11 = tqdVar5;
            } else {
                tqdVar7 = tqdVarA2;
                tqdVar8 = tqdVarA3;
                tqdVar9 = tqdVarA6;
            }
        } else {
            tqdVar5 = tqdVarA4;
            tqdVar6 = tqdVarA7;
            int[] iArr2 = f;
            r(utiVar, uswVar, tqdVar, iArr2[0], f2, tqdVarA, xtfVar);
            r(utiVar, uswVar, tqdVar, iArr2[1], f2, tqdVarA2, xtfVar);
            tqdVar7 = tqdVarA2;
            r(utiVar, uswVar, tqdVar, iArr2[2], f2, tqdVarA3, xtfVar);
            tqdVar8 = tqdVarA3;
            tqdVar9 = tqdVarA6;
            q(utiVar, uswVar, tqdVar, f2, xtfVar, tqdVar2, tqdVar3, iArr2[4]);
            r(utiVar, uswVar, tqdVar, iArr2[4], f2, tqdVarA5, xtfVar);
            r(utiVar, uswVar, tqdVar, iArr2[3], f2, tqdVar5, xtfVar);
            r(utiVar, uswVar, tqdVar, iArr2[4], f2, tqdVarA5, xtfVar);
            if (z) {
                r(utiVar, uswVar, tqdVar, iArr2[3], f2, tqdVar5, xtfVar2);
                tqdVar11 = tqdVar5;
                r(utiVar, uswVar, tqdVar, iArr2[4], f2, tqdVarA5, xtfVar2);
                tqdVar10 = tqdVarA5;
            } else {
                tqdVar10 = tqdVarA5;
                tqdVar11 = tqdVar5;
            }
        }
        tqfVarB.c(tqdVarA);
        tqfVarB.c(tqdVar7);
        tqfVarB.c(tqdVar8);
        tqfVarB.c(tqdVar11);
        tqfVarB.c(tqdVar10);
        tqfVarB.c(tqdVar9);
        tqfVarB.c(tqdVar6);
    }

    private static void t(defpackage.uti utiVar, defpackage.usw uswVar, defpackage.xtf xtfVar, defpackage.usx usxVar, defpackage.qsv qsvVar, float[] fArr, defpackage.tqd tqdVar, boolean z) {
        defpackage.tqd tqdVar2;
        defpackage.tqd tqdVar3;
        defpackage.tqd tqdVar4;
        boolean z2;
        defpackage.tqd tqdVar5;
        java.lang.Object obj;
        defpackage.usw uswVar2 = uswVar;
        int i = usxVar.l;
        int i2 = usxVar.j;
        float f2 = fArr[i];
        usxVar.i = f2;
        xtfVar.b = (f2 - xtfVar.e) / xtfVar.a;
        defpackage.tqd tqdVar6 = usxVar.c;
        defpackage.tqd tqdVar7 = usxVar.b;
        defpackage.tqd tqdVar8 = usxVar.g;
        defpackage.tqd.p(tqdVar6, tqdVar7, tqdVar8);
        if (uswVar2.l) {
            tqdVar8.b = a(tqdVar8.b);
        }
        defpackage.tqd tqdVar9 = usxVar.f;
        defpackage.tqd.l(tqdVar8, tqdVar9);
        defpackage.tqd.k(tqdVar9, tqdVar9);
        defpackage.tqd.i(tqdVar9, 255.0f, tqdVar9);
        defpackage.tqd tqdVar10 = usxVar.d;
        boolean z3 = defpackage.tqd.a(defpackage.tqd.a, tqdVar10, tqdVar8) > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        defpackage.tqd tqdVar11 = usxVar.e;
        defpackage.tqd.g(tqdVar11, tqdVar9, usxVar.h);
        float fB = tqdVar9.b(usxVar.h);
        if (fB > 1.0f && tqdVar10.b(tqdVar8) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            defpackage.tqd tqdVar12 = usxVar.h;
            defpackage.tqd.i(tqdVar12, 65025.0f / fB, tqdVar12);
            if (z3) {
                defpackage.tqd tqdVar13 = usxVar.h;
                obj = qsvVar.d;
                defpackage.tqd.g(tqdVar7, tqdVar13, (defpackage.tqd) obj);
            } else {
                defpackage.tqd tqdVar14 = usxVar.h;
                obj = qsvVar.d;
                defpackage.tqd.p(tqdVar7, tqdVar14, (defpackage.tqd) obj);
            }
            if (!uswVar2.m) {
                defpackage.tqd tqdVar15 = usxVar.a;
                java.lang.Object obj2 = qsvVar.a;
                defpackage.tqd tqdVar16 = (defpackage.tqd) qsvVar.c;
                defpackage.tqd tqdVar17 = (defpackage.tqd) obj2;
                defpackage.tqd tqdVar18 = (defpackage.tqd) obj;
                if (j(tqdVar7, tqdVar15, tqdVar18, tqdVar17, tqdVar16) >= 0.5f || j(tqdVar7, usxVar.c, tqdVar18, tqdVar17, tqdVar16) >= 0.5f) {
                    uswVar2 = uswVar;
                } else {
                    defpackage.tqd tqdVar19 = usxVar.h;
                    float f3 = xtfVar.d;
                    defpackage.tqd tqdVar20 = (defpackage.tqd) qsvVar.b;
                    o(tqdVar19, f3, tqdVar20);
                    defpackage.tqd.g(tqdVar7, tqdVar20, tqdVar);
                    int[] iArr = e;
                    int i3 = iArr[0];
                    float f4 = usxVar.i;
                    defpackage.tqd.j(usxVar.h, tqdVar17);
                    tqdVar2 = tqdVar8;
                    tqdVar4 = tqdVar11;
                    r(utiVar, uswVar, tqdVar, i3, f4, tqdVar17, xtfVar);
                    tqdVar3 = tqdVar10;
                    r(utiVar, uswVar, tqdVar, iArr[1], usxVar.i, usxVar.h, xtfVar);
                    if (i >= i2) {
                        int i4 = usxVar.k + 1;
                        usxVar.k = i4;
                        int[] iArr2 = uswVar.a;
                        int i5 = i4 < iArr2.length ? iArr2[i4] : uswVar.n;
                        usxVar.j = i5;
                        xtfVar.d = uswVar.c[i4];
                        xtfVar.c = uswVar.b[i4];
                        xtfVar.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                        float f5 = fArr[java.lang.Math.min(fArr.length - 1, i5)];
                        float f6 = fArr[usxVar.l];
                        xtfVar.a = f5 - f6;
                        xtfVar.e = f6;
                        o(usxVar.h, xtfVar.d, tqdVar20);
                        defpackage.tqd.g(tqdVar7, tqdVar20, tqdVar);
                        int i6 = iArr[0];
                        float f7 = usxVar.i;
                        defpackage.tqd.j(usxVar.h, tqdVar17);
                        r(utiVar, uswVar, tqdVar, i6, f7, tqdVar17, xtfVar);
                        r(utiVar, uswVar, tqdVar, iArr[1], usxVar.i, usxVar.h, xtfVar);
                    }
                }
                tqdVar5 = tqdVar9;
            }
            tqdVar4.o(tqdVar5);
            tqdVar3.o(tqdVar2);
            usxVar.a.o(tqdVar7);
            tqdVar7.o(usxVar.c);
        }
        z3 = z3;
        tqdVar2 = tqdVar8;
        tqdVar3 = tqdVar10;
        tqdVar4 = tqdVar11;
        defpackage.xtf xtfVar2 = new defpackage.xtf(xtfVar);
        defpackage.tqd tqdVar21 = usxVar.h;
        float f8 = xtfVar.d;
        defpackage.tqd tqdVar22 = (defpackage.tqd) qsvVar.b;
        o(tqdVar21, f8, tqdVar22);
        defpackage.tqd tqdVar23 = (defpackage.tqd) qsvVar.a;
        defpackage.tqd.g(tqdVar7, tqdVar22, tqdVar23);
        if (i >= i2) {
            int i7 = usxVar.k + 1;
            usxVar.k = i7;
            int[] iArr3 = uswVar2.a;
            int i8 = i7 < iArr3.length ? iArr3[i7] : uswVar2.n;
            usxVar.j = i8;
            xtfVar.d = uswVar2.c[i7];
            xtfVar.c = uswVar2.b[i7];
            xtfVar.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            float f9 = fArr[java.lang.Math.min(fArr.length - 1, i8)];
            float f10 = fArr[usxVar.l];
            xtfVar.a = f9 - f10;
            xtfVar.e = f10;
            z2 = true;
        } else {
            z2 = false;
        }
        usxVar.h = l(tqdVar4, tqdVar9);
        if (z) {
            defpackage.tqd tqdVar24 = usxVar.h;
            float f11 = usxVar.i;
            defpackage.tqd tqdVar25 = new defpackage.tqd(tqdVar9);
            defpackage.tqd.j(tqdVar25, tqdVar25);
            defpackage.tqd tqdVar26 = new defpackage.tqd(tqdVar9);
            defpackage.tqd tqdVar27 = new defpackage.tqd(tqdVar24);
            defpackage.tqd.j(tqdVar27, tqdVar27);
            new defpackage.tqd(tqdVar24);
            if (z3) {
                int[] iArr4 = f;
                r(utiVar, uswVar2, tqdVar23, iArr4[3], f11, tqdVar25, xtfVar);
                utiVar.j();
                r(utiVar, uswVar, tqdVar23, iArr4[4], f11, tqdVar26, xtfVar);
            } else {
                int[] iArr5 = f;
                r(utiVar, uswVar, tqdVar23, iArr5[3], f11, tqdVar25, xtfVar);
                utiVar.j();
                r(utiVar, uswVar, tqdVar23, iArr5[4], f11, tqdVar26, xtfVar);
            }
            tqdVar5 = tqdVar9;
        } else {
            tqdVar5 = tqdVar9;
            s(utiVar, uswVar, tqdVar23, tqdVar4, tqdVar5, usxVar.h, usxVar.i, xtfVar2, xtfVar, z2, z3);
        }
        tqdVar4.o(tqdVar5);
        tqdVar3.o(tqdVar2);
        usxVar.a.o(tqdVar7);
        tqdVar7.o(usxVar.c);
    }
}
