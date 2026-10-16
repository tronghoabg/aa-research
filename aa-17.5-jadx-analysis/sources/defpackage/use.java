package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class use {
    public static final /* synthetic */ int a = 0;
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/internal/vector/gl/GeometryUtilInternal");
    private static final int[] c = {1, 0, 3, 2};
    private static final int[] d = {3, 2, 1, 0};
    private static final int[] e = {5, 4};
    private static final int[] f = {5, 4, 6, 5, 4};
    private static final float g = 0.5f / urw.b;

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

    public static usc d(float[] fArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 4) {
            woy.Z(fArr[i] <= 255.0f);
            float f2 = fArr[i] * 0.003921569f;
            i++;
            int i4 = (int) (f2 * 65535.0f);
            i3 = (i3 << 8) | (i4 & 255);
            i2 = (i2 << 8) | ((i4 >> 8) & 255);
        }
        return new usc(i2, i3);
    }

    public static void e(float[] fArr, float f2, float f3, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float f4, float f5, usm usmVar) {
        int i;
        int i2;
        usm usmVar2 = usmVar;
        int length = fArr.length;
        if (length < 4) {
            return;
        }
        int i3 = length >> 1;
        int i4 = (iArr == null || iArr.length == 0) ? i3 : iArr[0];
        float f6 = fArr2[0] * f4;
        float f7 = fArr3[0] * f4;
        float f8 = fArr4[0] * f4;
        if (f6 > BitmapDescriptorFactory.HUE_RED) {
            tph tphVarB = tph.b();
            tpf tpfVarA = tphVarB.a();
            tpf tpfVarA2 = tphVarB.a();
            tpf tpfVarA3 = tphVarB.a();
            tpfVarA.b = a(fArr[0] - f2);
            tpfVarA.c = fArr[1] - f3;
            tpfVarA2.b = a(fArr[2] - f2);
            tpfVarA2.c = fArr[3] - f3;
            tpf.p(tpfVarA2, tpfVarA, tpfVarA3);
            tpfVarA3.b = a(tpfVarA3.b);
            float fC = tpfVarA3.c();
            tpf tpfVarA4 = tphVarB.a();
            tpf tpfVarA5 = tphVarB.a();
            float f9 = f6;
            float f10 = f8 + f5;
            int i5 = 1;
            float f11 = f7;
            int i6 = 0;
            boolean z = false;
            float f12 = BitmapDescriptorFactory.HUE_RED;
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
                    tpfVarA.o(tpfVarA2);
                    int i13 = i12 + i12;
                    float f18 = f14;
                    tpfVarA2.b = a(fArr[i13] - f2);
                    tpfVarA2.c = fArr[i13 + 1] - f3;
                    tpf.p(tpfVarA2, tpfVarA, tpfVarA3);
                    tpfVarA3.b = a(tpfVarA3.b);
                    f17 += fC2;
                    fC2 = tpfVarA3.c();
                    f15 = f18 - f17;
                    i10 = i11;
                    i11 = i12;
                    f14 = f18;
                }
                if (z) {
                    break;
                }
                tpf.i(tpfVarA3, f15 / fC2, tpfVarA4);
                tpf.g(tpfVarA4, tpfVarA, tpfVarA4);
                tpfVarA4.b = a(tpfVarA4.b);
                tpfVarA5.o(tpfVarA3);
                float f19 = f9 / 2.0f;
                tph tphVarB2 = tph.b();
                tpf.k(tpfVarA5, tpfVarA5);
                tpf.l(tpfVarA5, tpfVarA5);
                int i14 = i7;
                tpf tpfVarA6 = tphVarB2.a();
                int i15 = i3;
                tpf tpfVarA7 = tphVarB2.a();
                tpf tpfVar = tpfVarA3;
                tpf tpfVarA8 = tphVarB2.a();
                tpf tpfVar2 = tpfVarA2;
                tpf tpfVarA9 = tphVarB2.a();
                int i16 = i9;
                float f20 = -f19;
                q(f20, f19, tpfVarA5, tpfVarA6);
                q(f20, f20, tpfVarA5, tpfVarA7);
                q(f19, f20, tpfVarA5, tpfVarA8);
                q(f19, f19, tpfVarA5, tpfVarA9);
                boolean zM = usmVar2.m(usmVar2.f + 6);
                tpf tpfVar3 = tpfVarA5;
                tph tphVar = tphVarB;
                tpf tpfVar4 = tpfVarA;
                float f21 = f10;
                usmVar.e(tpfVarA4.b + tpfVarA6.b, tpfVarA4.c + tpfVarA6.c, f21, 0, 1);
                usmVar.e(tpfVarA7.b + tpfVarA4.b, tpfVarA7.c + tpfVarA4.c, f21, 0, 0);
                usmVar.e(tpfVarA8.b + tpfVarA4.b, tpfVarA8.c + tpfVarA4.c, f21, 1, 0);
                usmVar.e(tpfVarA6.b + tpfVarA4.b, tpfVarA6.c + tpfVarA4.c, f21, 0, 1);
                usmVar.e(tpfVarA8.b + tpfVarA4.b, tpfVarA8.c + tpfVarA4.c, f21, 1, 0);
                usmVar.e(tpfVarA9.b + tpfVarA4.b, tpfVarA9.c + tpfVarA4.c, f21, 1, 1);
                tphVarB2.c(tpfVarA6);
                tphVarB2.c(tpfVarA7);
                tphVarB2.c(tpfVarA8);
                tphVarB2.c(tpfVarA9);
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
                tphVarB = tphVar;
                usmVar2 = usmVar;
                i8 = i2;
                tpfVarA5 = tpfVar3;
                f13 = fC2;
                f12 = f17;
                i3 = i15;
                i5 = i;
                tpfVarA3 = tpfVar;
                tpfVarA2 = tpfVar2;
                tpfVarA = tpfVar4;
                f10 = f22;
            }
            tph tphVar2 = tphVarB;
            usmVar.i();
            tphVar2.c(tpfVarA4);
            tphVar2.c(tpfVarA5);
            tphVar2.c(tpfVarA);
            tphVar2.c(tpfVarA2);
            tphVar2.c(tpfVarA3);
        }
    }

    static void f(int[] iArr, int i, int i2, int[] iArr2, float[] fArr, float[] fArr2, float[] fArr3, float f2, float f3, usm usmVar) {
        int length = iArr.length;
        if (length < 4) {
            return;
        }
        float[] fArr4 = new float[length];
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            fArr4[i3] = iArr[i3] - i;
            fArr4[i3 + 1] = iArr[r2] - i2;
        }
        e(fArr4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iArr2, fArr, fArr2, fArr3, f2, f3, usmVar);
    }

    public static void g(usd usdVar, float[] fArr, int i, int i2, int i3, int i4, int[] iArr, float[] fArr2, int[] iArr2, boolean z, float f2, usm usmVar) {
        float f3;
        char c2;
        qsb qsbVar;
        float[] fArr3;
        tpf tpfVar;
        int[] iArr3;
        if (usdVar.a() < 4) {
            return;
        }
        urz urzVar = new urz(usdVar, usmVar.g, i4, fArr2, iArr2, iArr, fArr);
        urzVar.i = i;
        urzVar.j = i2;
        urzVar.k = i3;
        urzVar.l = z;
        usb usbVar = new usb(urzVar);
        usbVar.l = 0;
        usbVar.k = 0;
        usbVar.j = iArr2.length == 0 ? urzVar.n : iArr2[0];
        usbVar.i = f2;
        int iA = usdVar.a() / 2;
        float[] fArr4 = new float[iA];
        fArr4[0] = f2;
        tpf tpfVar2 = new tpf();
        tpf tpfVar3 = new tpf();
        for (int i5 = 1; i5 < iA; i5++) {
            int i6 = i5 - 1;
            usdVar.d(i6 + i6, tpfVar2);
            usdVar.d(i5 + i5, tpfVar3);
            tpf tpfVar4 = new tpf();
            tpf.p(tpfVar3, tpfVar2, tpfVar4);
            if (z) {
                tpfVar4.b = a(tpfVar4.b);
            }
            fArr4[i5] = fArr4[i6] + tpfVar4.c();
        }
        usa usaVar = new usa(iArr[usbVar.k]);
        usaVar.d = f2;
        usaVar.c = fArr4[Math.min(iA - 1, usbVar.j)] - usaVar.d;
        usaVar.b = BitmapDescriptorFactory.HUE_RED;
        usaVar.e = urzVar.m ? 0.0f : fArr[usbVar.k];
        qsb qsbVar2 = new qsb((byte[]) null, (byte[]) null, (byte[]) null);
        tph tphVarB = tph.b();
        tpf tpfVarA = tphVarB.a();
        tpf tpfVarA2 = tphVarB.a();
        tpf tpfVarC = usdVar.c();
        if (tpfVarC == null) {
            usdVar.d(0, usbVar.a);
            usdVar.d(2, usbVar.b);
            usbVar.a();
            tpf tpfVar5 = usbVar.e;
            tpf.l(tpfVar5, tpfVarA2);
            tpf tpfVar6 = usbVar.a;
            f3 = 0.0f;
            float f4 = usaVar.e;
            c2 = 3;
            tpf tpfVar7 = (tpf) qsbVar2.b;
            s(tpfVar5, f4, tpfVar7);
            tpf.g(tpfVar6, tpfVar7, tpfVarA);
            tph tphVarB2 = tph.b();
            tpf tpfVarA3 = tphVarB2.a();
            tpfVarA3.o(tpfVar5);
            tpf.j(tpfVarA3, tpfVarA3);
            if (r(urzVar.i) && !urzVar.h) {
                tpf tpfVar8 = new tpf();
                tpf.p(tpfVarA2, tpfVar5, tpfVar8);
                iArr3 = c;
                o(usmVar, urzVar, tpfVarA, iArr3[0], -1.0f, tpfVar8, usaVar);
                usmVar.j();
                tpf tpfVarA4 = tphVarB2.a();
                tpf.g(tpfVarA2, tpfVar5, tpfVarA4);
                o(usmVar, urzVar, tpfVarA, iArr3[1], -1.0f, tpfVarA4, usaVar);
                tphVarB2.c(tpfVarA4);
                tpfVar = tpfVarA3;
            } else if (urzVar.h) {
                iArr3 = c;
                o(usmVar, urzVar, tpfVarA, iArr3[2], usbVar.i, tpfVarA3, usaVar);
                tpfVar = tpfVarA3;
            } else {
                tpfVar = tpfVarA3;
                iArr3 = c;
                o(usmVar, urzVar, tpfVarA, iArr3[2], usbVar.i, tpfVar, usaVar);
            }
            o(usmVar, urzVar, tpfVarA, iArr3[2], usbVar.i, tpfVar, usaVar);
            o(usmVar, urzVar, tpfVarA, iArr3[3], usbVar.i, tpfVar5, usaVar);
            tphVarB2.c(tpfVar);
            fArr3 = fArr4;
            qsbVar = qsbVar2;
        } else {
            f3 = 0.0f;
            c2 = 3;
            usbVar.a = tpfVarC;
            usdVar.d(0, usbVar.b);
            usdVar.d(2, usbVar.c);
            usbVar.a();
            t(usmVar, urzVar, usaVar, usbVar, qsbVar2, fArr4, tpfVarA, true);
            qsbVar = qsbVar2;
            fArr3 = fArr4;
        }
        usbVar.l = 1;
        if (usdVar.a() > 4) {
            int i7 = 2;
            while (i7 < usdVar.a() - 2) {
                i7 += 2;
                usdVar.d(i7, usbVar.c);
                t(usmVar, urzVar, usaVar, usbVar, qsbVar, fArr3, tpfVarA, false);
                usbVar.l++;
            }
        } else {
            usbVar.c.o(usbVar.b);
            usbVar.f.o(usbVar.e);
        }
        float f5 = usbVar.i;
        tpf tpfVar9 = usbVar.d;
        float fC = f5 + tpfVar9.c();
        usbVar.i = fC;
        usaVar.b = (fC - usaVar.d) / usaVar.c;
        tpf tpfVarB = usdVar.b();
        if (tpfVarB == null) {
            tpf tpfVar10 = usbVar.c;
            tpf tpfVar11 = usbVar.f;
            float f6 = usaVar.e;
            tpf tpfVar12 = (tpf) qsbVar.b;
            s(tpfVar11, f6, tpfVar12);
            tpf.g(tpfVar10, tpfVar12, tpfVarA);
            if (r(urzVar.j) && !urzVar.h) {
                boolean z2 = urzVar.e;
                int[] iArr4 = d;
                int iL = l(z2, iArr4[0]);
                float f7 = usbVar.i;
                tpf tpfVar13 = (tpf) qsbVar.a;
                tpf.j(tpfVar11, tpfVar13);
                o(usmVar, urzVar, tpfVarA, iL, f7, tpfVar13, usaVar);
                o(usmVar, urzVar, tpfVarA, l(z2, iArr4[1]), usbVar.i, tpfVar11, usaVar);
                float f8 = usbVar.i + 2.0f;
                tpf.l(tpfVar11, tpfVarA2);
                tpf.j(tpfVarA2, tpfVarA2);
                int iL2 = l(z2, iArr4[2]);
                tpf.p(tpfVarA2, tpfVar11, tpfVar13);
                float f9 = -f8;
                o(usmVar, urzVar, tpfVarA, iL2, f9, tpfVar13, usaVar);
                int iL3 = l(z2, iArr4[c2]);
                tpf.g(tpfVarA2, tpfVar11, tpfVar13);
                o(usmVar, urzVar, tpfVarA, iL3, f9, tpfVar13, usaVar);
                usmVar.j();
            } else if (urzVar.h) {
                urzVar.o.d(2, usbVar.c);
                tpf tpfVar14 = usbVar.c;
                tpf tpfVar15 = usbVar.b;
                tpf tpfVar16 = (tpf) qsbVar.a;
                tpf.p(tpfVar14, tpfVar15, tpfVar16);
                if (urzVar.l) {
                    tpfVar16.b = a(tpfVar16.b);
                }
                tpf.l(tpfVar16, tpfVar11);
                tpf.k(tpfVar11, tpfVar11);
                tpf.i(tpfVar11, 255.0f, tpfVar11);
                boolean z3 = tpf.a(tpf.a, tpfVar9, tpfVar16) > f3;
                tpf tpfVar17 = usbVar.e;
                tpf tpfVarM = m(tpfVar17, tpfVar11);
                s(tpfVarM, usaVar.e, tpfVar12);
                tpf tpfVar18 = (tpf) qsbVar.d;
                tpf.g(tpfVar15, tpfVar12, tpfVar18);
                p(usmVar, urzVar, tpfVar18, tpfVar17, tpfVar11, tpfVarM, usbVar.i, usaVar, usaVar, false, z3);
                usmVar.j();
            } else {
                int[] iArr5 = d;
                int i8 = iArr5[0];
                float f10 = usbVar.i;
                tpf tpfVar19 = (tpf) qsbVar.a;
                tpf.j(tpfVar11, tpfVar19);
                o(usmVar, urzVar, tpfVarA, i8, f10, tpfVar19, usaVar);
                o(usmVar, urzVar, tpfVarA, iArr5[1], usbVar.i, tpfVar11, usaVar);
                usmVar.j();
            }
        } else {
            usbVar.c = tpfVarB;
            t(usmVar, urzVar, usaVar, usbVar, qsbVar, fArr3, tpfVarA, false);
            usmVar.j();
        }
        tphVarB.c(tpfVarA);
        tphVarB.c(tpfVarA2);
    }

    public static void h(int i, int[] iArr, int i2, int i3, int i4, float[] fArr, int i5, int i6, int i7, int i8, int[] iArr2, float[] fArr2, int[] iArr3, boolean z, float f2, int[] iArr4, int[] iArr5, usm usmVar) {
        g(new ury(iArr, i, i2, i3, i4, z, iArr4, iArr5), fArr, i5, i6, i7, i8, iArr2, fArr2, iArr3, z, f2, usmVar);
        usmVar.i();
    }

    private static float i(tpf tpfVar, tpf tpfVar2) {
        return (float) Math.atan2(tpf.a(tpf.a, tpfVar, tpfVar2), tpfVar.b(tpfVar2));
    }

    private static float j(tpf tpfVar, tpf tpfVar2, tpf tpfVar3, tpf tpfVar4, tpf tpfVar5) {
        tpf.p(tpfVar2, tpfVar, tpfVar4);
        tpf.p(tpfVar3, tpfVar, tpfVar5);
        return tpfVar5.b(tpfVar4) / tpfVar4.b(tpfVar4);
    }

    private static int k(usm usmVar, urz urzVar, usa usaVar, int i) {
        int i2 = (i << 24) & (-16777216);
        if (!usmVar.b) {
            return urzVar.g | i2 | (usaVar.a & 255);
        }
        return ((urzVar.f << 8) & 65280) | i2 | ((((int) (usaVar.b * 255.0f)) << 16) & 16711680) | (usaVar.a & 255);
    }

    private static int l(boolean z, int i) {
        return z ? i : i + 8;
    }

    private static tpf m(tpf tpfVar, tpf tpfVar2) {
        tpf tpfVar3 = new tpf();
        tpf.g(tpfVar, tpfVar2, tpfVar3);
        double dAbs = Math.abs(255.0d / Math.cos(i(tpfVar, tpfVar2) / 2.0f));
        tpf.k(tpfVar3, tpfVar3);
        tpf.i(tpfVar3, (float) dAbs, tpfVar3);
        return tpfVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[LOOP:0: B:19:0x0089->B:21:0x008c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(defpackage.usm r18, defpackage.urz r19, defpackage.tpf r20, float r21, defpackage.usa r22, defpackage.tpf r23, defpackage.tpf r24, int r25) {
        /*
            r0 = r23
            r1 = r19
            int r2 = r1.k
            r7 = 2
            r3 = 0
            if (r2 != 0) goto Lf
            tpf[] r0 = new defpackage.tpf[r3]
        Lc:
            r8 = r0
            goto L88
        Lf:
            float r4 = i(r23, r24)
            r5 = 1
            if (r2 != r5) goto L18
            r2 = r7
            goto L2e
        L18:
            if (r2 != r7) goto L70
            float r2 = java.lang.Math.abs(r4)
            r6 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r6
            double r8 = (double) r2
            r10 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 / r10
            int r2 = (int) r8
            if (r2 > 0) goto L2e
            tpf[] r0 = new defpackage.tpf[r3]
            goto Lc
        L2e:
            int r6 = r2 + (-1)
            tpf[] r6 = new defpackage.tpf[r6]
        L32:
            if (r5 >= r2) goto L6e
            float r8 = (float) r5
            float r8 = r8 * r4
            tpf r9 = new tpf
            r9.<init>()
            float r10 = r0.b
            double r10 = (double) r10
            float r12 = (float) r2
            float r8 = r8 / r12
            double r12 = (double) r8
            double r14 = java.lang.Math.cos(r12)
            double r10 = r10 * r14
            float r8 = r0.c
            double r14 = (double) r8
            double r16 = java.lang.Math.sin(r12)
            double r14 = r14 * r16
            double r10 = r10 - r14
            float r8 = (float) r10
            r9.b = r8
            float r8 = r0.b
            double r10 = (double) r8
            double r14 = java.lang.Math.sin(r12)
            double r10 = r10 * r14
            float r8 = r0.c
            double r14 = (double) r8
            double r12 = java.lang.Math.cos(r12)
            double r14 = r14 * r12
            double r10 = r10 + r14
            float r8 = (float) r10
            r9.c = r8
            int r8 = r5 + (-1)
            r6[r8] = r9
            int r5 = r5 + 1
            goto L32
        L6e:
            r8 = r6
            goto L88
        L70:
            yob r0 = defpackage.use.b
            yop r0 = r0.h()
            ynz r0 = (defpackage.ynz) r0
            r4 = 9628(0x259c, float:1.3492E-41)
            yop r0 = r0.ai(r4)
            ynz r0 = (defpackage.ynz) r0
            java.lang.String r4 = "Unknown jointShape: %d"
            r0.w(r4, r2)
            tpf[] r0 = new defpackage.tpf[r3]
            goto Lc
        L88:
            r9 = r3
        L89:
            int r0 = r8.length
            if (r9 >= r0) goto Lab
            r5 = r8[r9]
            r0 = r18
            r2 = r20
            r4 = r21
            r6 = r22
            r3 = r25
            o(r0, r1, r2, r3, r4, r5, r6)
            int[] r0 = defpackage.use.f
            r3 = r0[r7]
            tpf r5 = defpackage.tpf.a
            r0 = r18
            r1 = r19
            o(r0, r1, r2, r3, r4, r5, r6)
            int r9 = r9 + 1
            goto L89
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.use.n(usm, urz, tpf, float, usa, tpf, tpf, int):void");
    }

    private static void o(usm usmVar, urz urzVar, tpf tpfVar, int i, float f2, tpf tpfVar2, usa usaVar) {
        usc uscVar = urzVar.d;
        if (urzVar.e) {
            int iK = k(usmVar, urzVar, usaVar, i);
            float f3 = usmVar.h * f2;
            double d2 = f3 >= BitmapDescriptorFactory.HUE_RED ? 1.0d : -1.0d;
            int iMin = ((int) Math.min(65535.0d, ((d2 * Math.min(f3 * d2, 131068.0d)) + 131068.0d) * 0.25d)) | ((b(tpfVar2.b) << 16) & 16711680) | ((b(tpfVar2.c) << 24) & (-16777216));
            if (uscVar == null) {
                usmVar.c(usmVar.i, tpfVar.b, tpfVar.c, BitmapDescriptorFactory.HUE_RED);
                usmVar.i.putInt(iK);
                usmVar.i.putInt(iMin);
                usmVar.f++;
                return;
            }
            usmVar.c(usmVar.i, tpfVar.b, tpfVar.c, BitmapDescriptorFactory.HUE_RED);
            usmVar.i.putInt(iK);
            usmVar.i.putInt(iMin);
            usmVar.i.putInt(uscVar.a);
            usmVar.i.putInt(uscVar.b);
            usmVar.f++;
            return;
        }
        int iK2 = k(usmVar, urzVar, usaVar, i);
        int iC = c(tpfVar2.b);
        int iC2 = c(tpfVar2.c);
        int i2 = (iC >> 8) | ((iC2 << 8) & 16711680) | ((iC2 << 24) & (-16777216)) | (65280 & (iC << 8));
        if (uscVar == null) {
            usmVar.c(usmVar.i, tpfVar.b, tpfVar.c, f2);
            usmVar.i.putInt(iK2);
            usmVar.i.putInt(i2);
            usmVar.f++;
            return;
        }
        usmVar.c(usmVar.i, tpfVar.b, tpfVar.c, f2);
        usmVar.i.putInt(iK2);
        usmVar.i.putInt(i2);
        usmVar.i.putInt(uscVar.a);
        usmVar.i.putInt(uscVar.b);
        usmVar.f++;
    }

    private static void p(usm usmVar, urz urzVar, tpf tpfVar, tpf tpfVar2, tpf tpfVar3, tpf tpfVar4, float f2, usa usaVar, usa usaVar2, boolean z, boolean z2) {
        tpf tpfVar5;
        tpf tpfVar6;
        tpf tpfVar7;
        tpf tpfVar8;
        tpf tpfVar9;
        tpf tpfVar10;
        tpf tpfVar11;
        tph tphVarB = tph.b();
        tpf tpfVarA = tphVarB.a();
        tpfVarA.o(tpfVar2);
        tpf.j(tpfVarA, tpfVarA);
        tpf tpfVarA2 = tphVarB.a();
        tpfVarA2.o(tpfVar2);
        tpf tpfVarA3 = tphVarB.a();
        tpfVarA3.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        tpf tpfVarA4 = tphVarB.a();
        tpfVarA4.o(tpfVar3);
        tpf.j(tpfVarA4, tpfVarA4);
        tpf tpfVarA5 = tphVarB.a();
        tpfVarA5.o(tpfVar3);
        tpf tpfVarA6 = tphVarB.a();
        tpfVarA6.o(tpfVar4);
        tpf.j(tpfVarA6, tpfVarA6);
        tpf tpfVarA7 = tphVarB.a();
        tpfVarA7.o(tpfVar4);
        if (z2) {
            int[] iArr = f;
            tpfVar6 = tpfVarA7;
            o(usmVar, urzVar, tpfVar, iArr[0], f2, tpfVarA, usaVar);
            o(usmVar, urzVar, tpfVar, iArr[1], f2, tpfVarA2, usaVar);
            o(usmVar, urzVar, tpfVar, iArr[0], f2, tpfVarA, usaVar);
            o(usmVar, urzVar, tpfVar, iArr[2], f2, tpfVarA3, usaVar);
            tpf tpfVar12 = new tpf();
            tpf.j(tpfVar2, tpfVar12);
            tpf tpfVar13 = new tpf();
            tpf.j(tpfVar3, tpfVar13);
            n(usmVar, urzVar, tpfVar, f2, usaVar, tpfVar12, tpfVar13, iArr[0]);
            o(usmVar, urzVar, tpfVar, iArr[3], f2, tpfVarA4, usaVar);
            tpfVar11 = tpfVarA4;
            o(usmVar, urzVar, tpfVar, iArr[4], f2, tpfVarA5, usaVar);
            tpfVar10 = tpfVarA5;
            if (z) {
                o(usmVar, urzVar, tpfVar, iArr[3], f2, tpfVar11, usaVar2);
                tpfVar5 = tpfVar11;
                o(usmVar, urzVar, tpfVar, iArr[4], f2, tpfVar10, usaVar2);
                tpfVar7 = tpfVarA2;
                tpfVar8 = tpfVarA3;
                tpfVar9 = tpfVarA6;
                tpfVar11 = tpfVar5;
            } else {
                tpfVar7 = tpfVarA2;
                tpfVar8 = tpfVarA3;
                tpfVar9 = tpfVarA6;
            }
        } else {
            tpfVar5 = tpfVarA4;
            tpfVar6 = tpfVarA7;
            int[] iArr2 = f;
            o(usmVar, urzVar, tpfVar, iArr2[0], f2, tpfVarA, usaVar);
            o(usmVar, urzVar, tpfVar, iArr2[1], f2, tpfVarA2, usaVar);
            tpfVar7 = tpfVarA2;
            o(usmVar, urzVar, tpfVar, iArr2[2], f2, tpfVarA3, usaVar);
            tpfVar8 = tpfVarA3;
            tpfVar9 = tpfVarA6;
            n(usmVar, urzVar, tpfVar, f2, usaVar, tpfVar2, tpfVar3, iArr2[4]);
            o(usmVar, urzVar, tpfVar, iArr2[4], f2, tpfVarA5, usaVar);
            o(usmVar, urzVar, tpfVar, iArr2[3], f2, tpfVar5, usaVar);
            o(usmVar, urzVar, tpfVar, iArr2[4], f2, tpfVarA5, usaVar);
            if (z) {
                o(usmVar, urzVar, tpfVar, iArr2[3], f2, tpfVar5, usaVar2);
                tpfVar11 = tpfVar5;
                o(usmVar, urzVar, tpfVar, iArr2[4], f2, tpfVarA5, usaVar2);
                tpfVar10 = tpfVarA5;
            } else {
                tpfVar10 = tpfVarA5;
                tpfVar11 = tpfVar5;
            }
        }
        tphVarB.c(tpfVarA);
        tphVarB.c(tpfVar7);
        tphVarB.c(tpfVar8);
        tphVarB.c(tpfVar11);
        tphVarB.c(tpfVar10);
        tphVarB.c(tpfVar9);
        tphVarB.c(tpfVar6);
    }

    private static void q(float f2, float f3, tpf tpfVar, tpf tpfVar2) {
        tpfVar2.n(f2, f3);
        tpf.e(tpfVar2, tpfVar, tpfVar2);
    }

    private static boolean r(int i) {
        return i == 2 || i == 1 || i == 4;
    }

    private static void s(tpf tpfVar, float f2, tpf tpfVar2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            tpfVar2.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float fC = tpfVar.c();
        if (fC == BitmapDescriptorFactory.HUE_RED) {
            tpfVar2.o(tpfVar);
        } else {
            tpf.i(tpfVar, f2 / fC, tpfVar2);
        }
    }

    private static void t(usm usmVar, urz urzVar, usa usaVar, usb usbVar, qsb qsbVar, float[] fArr, tpf tpfVar, boolean z) {
        boolean z2;
        tpf tpfVar2;
        tpf tpfVar3;
        tpf tpfVar4;
        boolean z3;
        tpf tpfVar5;
        Object obj;
        urz urzVar2 = urzVar;
        int i = usbVar.l;
        int i2 = usbVar.j;
        float f2 = fArr[i];
        usbVar.i = f2;
        usaVar.b = (f2 - usaVar.d) / usaVar.c;
        tpf tpfVar6 = usbVar.c;
        tpf tpfVar7 = usbVar.b;
        tpf tpfVar8 = usbVar.g;
        tpf.p(tpfVar6, tpfVar7, tpfVar8);
        if (urzVar2.l) {
            tpfVar8.b = a(tpfVar8.b);
        }
        tpf tpfVar9 = usbVar.f;
        tpf.l(tpfVar8, tpfVar9);
        tpf.k(tpfVar9, tpfVar9);
        tpf.i(tpfVar9, 255.0f, tpfVar9);
        tpf tpfVar10 = usbVar.d;
        boolean z4 = tpf.a(tpf.a, tpfVar10, tpfVar8) > BitmapDescriptorFactory.HUE_RED;
        tpf tpfVar11 = usbVar.e;
        tpf.g(tpfVar11, tpfVar9, usbVar.h);
        float fB = tpfVar9.b(usbVar.h);
        if (fB > 1.0f && tpfVar10.b(tpfVar8) >= BitmapDescriptorFactory.HUE_RED) {
            tpf tpfVar12 = usbVar.h;
            tpf.i(tpfVar12, 65025.0f / fB, tpfVar12);
            if (z4) {
                tpf tpfVar13 = usbVar.h;
                obj = qsbVar.d;
                z2 = z4;
                tpf.g(tpfVar7, tpfVar13, (tpf) obj);
            } else {
                z2 = z4;
                tpf tpfVar14 = usbVar.h;
                obj = qsbVar.d;
                tpf.p(tpfVar7, tpfVar14, (tpf) obj);
            }
            if (!urzVar2.m) {
                tpf tpfVar15 = usbVar.a;
                Object obj2 = qsbVar.a;
                tpf tpfVar16 = (tpf) qsbVar.c;
                tpf tpfVar17 = (tpf) obj2;
                tpf tpfVar18 = (tpf) obj;
                if (j(tpfVar7, tpfVar15, tpfVar18, tpfVar17, tpfVar16) >= 0.5f || j(tpfVar7, usbVar.c, tpfVar18, tpfVar17, tpfVar16) >= 0.5f) {
                    urzVar2 = urzVar;
                } else {
                    tpf tpfVar19 = usbVar.h;
                    float f3 = usaVar.e;
                    tpf tpfVar20 = (tpf) qsbVar.b;
                    s(tpfVar19, f3, tpfVar20);
                    tpf.g(tpfVar7, tpfVar20, tpfVar);
                    int[] iArr = e;
                    int i3 = iArr[0];
                    float f4 = usbVar.i;
                    tpf.j(usbVar.h, tpfVar17);
                    tpfVar2 = tpfVar8;
                    tpfVar4 = tpfVar11;
                    o(usmVar, urzVar, tpfVar, i3, f4, tpfVar17, usaVar);
                    tpfVar3 = tpfVar10;
                    o(usmVar, urzVar, tpfVar, iArr[1], usbVar.i, usbVar.h, usaVar);
                    if (i >= i2) {
                        int i4 = usbVar.k + 1;
                        usbVar.k = i4;
                        int[] iArr2 = urzVar.a;
                        int i5 = i4 < iArr2.length ? iArr2[i4] : urzVar.n;
                        usbVar.j = i5;
                        usaVar.e = urzVar.c[i4];
                        usaVar.a = urzVar.b[i4];
                        usaVar.b = BitmapDescriptorFactory.HUE_RED;
                        float f5 = fArr[Math.min(fArr.length - 1, i5)];
                        float f6 = fArr[usbVar.l];
                        usaVar.c = f5 - f6;
                        usaVar.d = f6;
                        s(usbVar.h, usaVar.e, tpfVar20);
                        tpf.g(tpfVar7, tpfVar20, tpfVar);
                        int i6 = iArr[0];
                        float f7 = usbVar.i;
                        tpf.j(usbVar.h, tpfVar17);
                        o(usmVar, urzVar, tpfVar, i6, f7, tpfVar17, usaVar);
                        o(usmVar, urzVar, tpfVar, iArr[1], usbVar.i, usbVar.h, usaVar);
                    }
                    tpfVar5 = tpfVar9;
                }
            }
            tpfVar4.o(tpfVar5);
            tpfVar3.o(tpfVar2);
            usbVar.a.o(tpfVar7);
            tpfVar7.o(usbVar.c);
        }
        z2 = z4;
        tpfVar2 = tpfVar8;
        tpfVar3 = tpfVar10;
        tpfVar4 = tpfVar11;
        usa usaVar2 = new usa(usaVar);
        tpf tpfVar21 = usbVar.h;
        float f8 = usaVar.e;
        tpf tpfVar22 = (tpf) qsbVar.b;
        s(tpfVar21, f8, tpfVar22);
        tpf tpfVar23 = (tpf) qsbVar.a;
        tpf.g(tpfVar7, tpfVar22, tpfVar23);
        if (i >= i2) {
            int i7 = usbVar.k + 1;
            usbVar.k = i7;
            int[] iArr3 = urzVar2.a;
            int i8 = i7 < iArr3.length ? iArr3[i7] : urzVar2.n;
            usbVar.j = i8;
            usaVar.e = urzVar2.c[i7];
            usaVar.a = urzVar2.b[i7];
            usaVar.b = BitmapDescriptorFactory.HUE_RED;
            float f9 = fArr[Math.min(fArr.length - 1, i8)];
            float f10 = fArr[usbVar.l];
            usaVar.c = f9 - f10;
            usaVar.d = f10;
            z3 = true;
        } else {
            z3 = false;
        }
        usbVar.h = m(tpfVar4, tpfVar9);
        if (!z) {
            tpfVar5 = tpfVar9;
            p(usmVar, urzVar, tpfVar23, tpfVar4, tpfVar5, usbVar.h, usbVar.i, usaVar2, usaVar, z3, z2);
            tpfVar4.o(tpfVar5);
            tpfVar3.o(tpfVar2);
            usbVar.a.o(tpfVar7);
            tpfVar7.o(usbVar.c);
        }
        tpf tpfVar24 = usbVar.h;
        float f11 = usbVar.i;
        tpf tpfVar25 = new tpf(tpfVar9);
        tpf.j(tpfVar25, tpfVar25);
        tpf tpfVar26 = new tpf(tpfVar9);
        tpf tpfVar27 = new tpf(tpfVar24);
        tpf.j(tpfVar27, tpfVar27);
        new tpf(tpfVar24);
        if (z2) {
            int[] iArr4 = f;
            o(usmVar, urzVar2, tpfVar23, iArr4[3], f11, tpfVar25, usaVar);
            usmVar.j();
            o(usmVar, urzVar, tpfVar23, iArr4[4], f11, tpfVar26, usaVar);
        } else {
            int[] iArr5 = f;
            o(usmVar, urzVar, tpfVar23, iArr5[3], f11, tpfVar25, usaVar);
            usmVar.j();
            o(usmVar, urzVar, tpfVar23, iArr5[4], f11, tpfVar26, usaVar);
        }
        tpfVar5 = tpfVar9;
        tpfVar4.o(tpfVar5);
        tpfVar3.o(tpfVar2);
        usbVar.a.o(tpfVar7);
        tpfVar7.o(usbVar.c);
    }
}
