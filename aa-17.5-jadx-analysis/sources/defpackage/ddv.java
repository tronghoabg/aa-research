package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ddv {
    private static final cjb a = new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f, 10.0f);

    public static final boolean a(ddu dduVar) {
        cyc cycVarF = dduVar.f();
        if (cycVarF != null && cycVarF.ay()) {
            return true;
        }
        ddr ddrVar = dduVar.b;
        return ddrVar.f(ddx.q) || ddrVar.f(ddx.p);
    }

    public static final boolean b(ddu dduVar) {
        if (a(dduVar)) {
            return false;
        }
        ddr ddrVar = dduVar.b;
        if (ddrVar.a) {
            return true;
        }
        aan aanVar = ddrVar.c;
        Object[] objArr = aanVar.b;
        Object[] objArr2 = aanVar.c;
        long[] jArr = aanVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((deb) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            return false;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final zh c(mko mkoVar, afec afecVar) {
        ddu dduVarA = mkoVar.A();
        cxb cxbVar = dduVarA.a;
        if (!cxbVar.an() || !cxbVar.am()) {
            zh zhVar = zi.a;
            zhVar.getClass();
            return zhVar;
        }
        cjb cjbVarB = dduVarA.b();
        zh zhVar2 = new zh(48);
        sm smVar = new sm((char[]) null);
        smVar.l(dlf.q(cjbVarB));
        f(dduVarA, zhVar2, afecVar, dduVarA, new sm((char[]) null), smVar, false);
        return zhVar2;
    }

    private static final void d(zh zhVar, ddu dduVar, ddu dduVar2, boolean z) {
        cxb cxbVar;
        ddu dduVarI = dduVar2.i();
        cjb cjbVarB = (dduVarI == null || (cxbVar = dduVarI.a) == null || !cxbVar.an()) ? a : dduVarI.b();
        int i = dduVar.c;
        int i2 = dduVar2.c;
        if (i2 == i) {
            i2 = -1;
        }
        zhVar.g(i2, new hig(dduVar2, dlf.q(cjbVarB), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e(defpackage.zh r10, defpackage.afec r11, defpackage.ddu r12, defpackage.ddu r13, defpackage.sm r14, defpackage.sm r15, boolean r16) {
        /*
            r1 = r16
            cxb r3 = r13.a
            boolean r4 = r3.an()
            if (r4 == 0) goto L94
            boolean r3 = r3.am()
            if (r3 == 0) goto L94
            boolean r3 = r15.m()
            if (r3 == 0) goto L18
            goto L94
        L18:
            cjb r3 = r13.d()
            boolean r4 = r3.h()
            if (r4 == 0) goto L26
            cjb r3 = r13.e()
        L26:
            dlp r7 = defpackage.dlf.q(r3)
            r14.l(r7)
            r3 = 1
            if (r1 != 0) goto L3f
            ddr r1 = r13.b
            boolean r5 = r1.a
            r6 = 0
            if (r5 == 0) goto L40
            deb r5 = defpackage.ddx.q
            boolean r1 = r1.f(r5)
            if (r1 == 0) goto L40
        L3f:
            r6 = r3
        L40:
            boolean r1 = r14.s(r15)
            if (r1 == 0) goto L9d
            int r1 = r12.c
            int r5 = r13.c
            r8 = -1
            if (r5 != r1) goto L4e
            r5 = r8
        L4e:
            hig r1 = new hig
            dlp r9 = r14.k()
            r1.<init>(r13, r9, r6)
            r10.g(r5, r1)
            r1 = 4
            java.util.List r9 = defpackage.ddu.l(r13, r3, r1)
            int r1 = r9.size()
            int r1 = r1 + r8
            r8 = r1
        L65:
            if (r8 < 0) goto L89
            java.lang.Object r1 = r9.get(r8)
            java.lang.Object r1 = r11.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L86
            java.lang.Object r1 = r9.get(r8)
            ddu r1 = (defpackage.ddu) r1
            r0 = r10
            r2 = r12
            r4 = r14
            r5 = r15
            r3 = r1
            r1 = r11
            e(r0, r1, r2, r3, r4, r5, r6)
        L86:
            int r8 = r8 + (-1)
            goto L65
        L89:
            boolean r0 = b(r13)
            if (r0 == 0) goto L9d
            r5 = r15
            r15.n(r7)
            return
        L94:
            boolean r3 = r13.j()
            if (r3 == 0) goto L9d
            d(r10, r12, r13, r1)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddv.e(zh, afec, ddu, ddu, sm, sm, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void f(defpackage.ddu r16, defpackage.zh r17, defpackage.afec r18, defpackage.ddu r19, defpackage.sm r20, defpackage.sm r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddv.f(ddu, zh, afec, ddu, sm, sm, boolean):void");
    }
}
