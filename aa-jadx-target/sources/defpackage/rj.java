package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rj {
    private static final boolean A(defpackage.cjc cjcVar, defpackage.affc affcVar) {
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cjc[16]);
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitChildren called on an unattached node");
        }
        defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar = cjcVar.q;
        defpackage.cge cgeVar2 = cgeVar.u;
        if (cgeVar2 == null) {
            defpackage.cjv.x(bzcVar2, cgeVar);
        } else {
            bzcVar2.n(cgeVar2);
        }
        while (true) {
            int i = bzcVar2.b;
            if (i == 0) {
                break;
            }
            defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i - 1);
            if ((cgeVarO.s & 1024) == 0) {
                defpackage.cjv.x(bzcVar2, cgeVarO);
            } else {
                while (cgeVarO != null) {
                    if ((cgeVarO.r & 1024) != 0) {
                        defpackage.bzc bzcVar3 = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.cjc) {
                                bzcVar.n((defpackage.cjc) cgeVarO);
                            } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i2 = 0;
                                for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                    if ((cgeVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cgeVarO = cgeVar3;
                                        } else {
                                            if (bzcVar3 == null) {
                                                bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar3.n(cgeVarO);
                                            }
                                            bzcVar3.n(cgeVar3);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar3);
                        }
                        break;
                    }
                    cgeVarO = cgeVarO.u;
                }
            }
        }
        bzcVar.j(cjd.a);
        java.lang.Object[] objArr = bzcVar.a;
        int i3 = bzcVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            defpackage.cjc cjcVar2 = (defpackage.cjc) objArr[i4];
            if (defpackage.mw.o(cjcVar2) && o(cjcVar2, affcVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qx */
    public static rr a(qs qsVar, qw qwVar) throws qx {
        int i = qsVar.d;
        if (i == 0) {
            throw new java.lang.IllegalStateException("Car App API level hasn't been established yet");
        }
        if (i < 3) {
            throw new qx("Create CarHardwareManager failed", new java.lang.IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            android.content.pm.ServiceInfo serviceInfoA = androidx.car.app.CarAppMetadataHolderService.a(qsVar);
            java.lang.String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (rr) java.lang.Class.forName(string).getConstructor(qs.class, qw.class).newInstance(qsVar, qwVar);
            }
            throw new java.lang.ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ReflectiveOperationException unused) {
            throw new java.lang.IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    public static final boe b(defpackage.bnk bnkVar, long j) {
        boe boeVar = bnkVar.ab;
        if (boeVar != null) {
            return boeVar;
        }
        long jH = defpackage.ckd.h(j, 0.38f);
        boe boeVar2 = new boe(defpackage.cjv.j(0), j, defpackage.cjv.j(0), jH);
        bnkVar.ab = boeVar2;
        return boeVar2;
    }

    public static final boe c(long j, long j2, defpackage.bve bveVar) {
        return b(defpackage.bxi.n(bveVar), ((defpackage.ckd) bveVar.f(defpackage.bnq.a)).a).a(defpackage.cjv.c(), j, defpackage.cjv.c(), j2);
    }

    public static final void d(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.cld cldVar, long j, long j2, bny bnyVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        defpackage.afer aferVar2;
        int i2;
        defpackage.affg affgVar2;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(748201188);
        if (i3 == 0) {
            aferVar2 = aferVar;
            i2 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cldVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.B(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.B(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(bnyVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.C(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            affgVar2 = affgVar;
            i2 |= true != bveVarC.E(affgVar2) ? 4194304 : 8388608;
        } else {
            affgVar2 = affgVar;
        }
        if (bveVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            int i4 = i2 << 9;
            bveVar2 = bveVarC;
            f(aferVar2, defpackage.bsf.a(10, bveVarC), cgfVar, cldVar, j, j2, bnyVar, affgVar2, bveVar2, (i2 & 14) | 3456 | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i2 >> 21) & 14);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bod(aferVar, cgfVar, cldVar, j, j2, bnyVar, affgVar, i, 1);
        }
    }

    public static final void e(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.cld cldVar, long j, long j2, bny bnyVar, defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        defpackage.afer aferVar2;
        int i2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        defpackage.cld cldVar2;
        long j3;
        long j4;
        bny bnyVar2;
        long j5;
        bny bnyVar3;
        long j6;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar3;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1039585610);
        if (i3 == 0) {
            aferVar2 = aferVar;
            i2 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = i4 | 1572864;
        if ((i & 12582912) == 0) {
            i5 |= true != bveVarC.E(affhVar) ? 4194304 : 8388608;
        }
        if (bveVarC.I((4793491 & i5) != 4793490, i5 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.cld cldVarB = defpackage.bqa.b(8, bveVarC);
                long jF = defpackage.bnl.f(27, bveVarC);
                long jD = defpackage.bnl.d(jF, bveVarC);
                j5 = jF;
                bnyVar3 = new bny();
                j6 = jD;
                cgfVar3 = cgcVar;
                cldVar3 = cldVarB;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                cldVar3 = cldVar;
                j5 = j;
                j6 = j2;
                bnyVar3 = bnyVar;
            }
            bveVarC.l();
            bveVar2 = bveVarC;
            d(aferVar2, cgfVar3, cldVar3, j5, j6, bnyVar3, defpackage.dai.as(-1233936436, true, new defpackage.bmc(affhVar, 5), bveVarC), bveVar2, 12582912 | (i5 & 14) | (i5 & 112) | (3670016 & i5));
            cgfVar2 = cgfVar3;
            cldVar2 = cldVar3;
            j3 = j5;
            j4 = j6;
            bnyVar2 = bnyVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            cldVar2 = cldVar;
            j3 = j;
            j4 = j2;
            bnyVar2 = bnyVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bod(aferVar, cgfVar2, cldVar2, j3, j4, bnyVar2, affhVar, i, 0);
        }
    }

    public static final void f(defpackage.afer aferVar, defpackage.dgd dgdVar, defpackage.cgf cgfVar, defpackage.cld cldVar, long j, long j2, bny bnyVar, defpackage.affg affgVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.afer aferVar2;
        int i3;
        defpackage.affg affgVar2;
        int i4;
        defpackage.bve bveVar2;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(121669932);
        if (i5 == 0) {
            aferVar2 = aferVar;
            i3 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(dgdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.z(56.0f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.z(56.0f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.C(cldVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.B(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != bveVarC.B(j2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != bveVarC.C(bnyVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != bveVarC.C(null) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            affgVar2 = affgVar;
            i4 = i2 | (true != bveVarC.E(affgVar2) ? 2 : 4);
        } else {
            affgVar2 = affgVar;
            i4 = i2;
        }
        int i6 = 3;
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            bveVarC.v(-282853233);
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.asl();
                bwcVar.ad(objS);
            }
            defpackage.ask askVar = (defpackage.ask) objS;
            bwcVar.Y(false);
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.bmo(i6);
                bwcVar.ad(objS2);
            }
            defpackage.cgf cgfVarA = defpackage.dea.a(cgfVar, false, (defpackage.affc) objS2);
            float f = bnyVar.a;
            int i7 = i3 >> 21;
            boolean zC = bveVarC.C(askVar);
            java.lang.Object objS3 = bwcVar.S();
            if (zC || objS3 == obj) {
                float f2 = bnyVar.b;
                float f3 = bnyVar.d;
                float f4 = bnyVar.c;
                objS3 = new bob();
                bwcVar.ad(objS3);
            }
            bob bobVar = (bob) objS3;
            boolean zE = bveVarC.E(bobVar) | ((((i7 & 112) ^ 48) > 32 && bveVarC.C(bnyVar)) || (i7 & 48) == 32);
            java.lang.Object objS4 = bwcVar.S();
            if (zE || objS4 == obj) {
                objS4 = new defpackage.bnx(bobVar, bnyVar, (defpackage.afdk) null, 1);
                bwcVar.ad(objS4);
            }
            defpackage.bvx.g(bnyVar, (defpackage.affg) objS4, bveVarC);
            boolean zC2 = bveVarC.C(askVar) | bveVarC.E(bobVar);
            java.lang.Object objS5 = bwcVar.S();
            if (zC2 || objS5 == obj) {
                objS5 = new dxi(askVar, bobVar, (defpackage.afdk) null, 1);
                bwcVar.ad(objS5);
            }
            defpackage.bvx.g(askVar, (defpackage.affg) objS5, bveVarC);
            bveVar2 = bveVarC;
            defpackage.bqv.c(aferVar2, cgfVarA, false, cldVar, j, j2, 6.0f, ((defpackage.dlr) bobVar.e.b.a()).a, null, askVar, defpackage.dai.as(-1779603465, true, new defpackage.bsc(j2, dgdVar, affgVar2, 1), bveVarC), bveVar2, 260);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new boc(aferVar, dgdVar, cgfVar, cldVar, j, j2, bnyVar, affgVar, i, i2);
        }
    }

    public static final long[] g(java.util.List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = defpackage.bzo.u(((defpackage.ckd) list.get(i)).a);
        }
        return jArr;
    }

    public static final int[] h(java.util.List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            long j = ((defpackage.ckd) list.get(i)).a;
            float[] fArr = defpackage.clr.a;
            iArr[i] = (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32);
        }
        return iArr;
    }

    public static final void i(java.util.List list) {
        if (list.size() < 2) {
            throw new java.lang.IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
    }

    public static final java.lang.Boolean j(defpackage.cjc cjcVar, int i, defpackage.cjj cjjVar, defpackage.affc affcVar) {
        java.lang.Object objValueOf;
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.cjc cjcVarM = defpackage.mw.m(cjcVar);
                if (cjcVarM == null) {
                    throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = cjcVarM.g().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        java.lang.Boolean boolJ = j(cjcVarM, i, cjjVar, affcVar);
                        if (!defpackage.afga.f(boolJ, java.lang.Boolean.FALSE)) {
                            return boolJ;
                        }
                        if (cjjVar == null) {
                            if (cjcVarM.g() != defpackage.cja.b) {
                                throw new java.lang.IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            defpackage.cjc cjcVarL = defpackage.mw.l(cjcVarM);
                            if (cjcVarL == null) {
                                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cjjVar = defpackage.mw.n(cjcVarL);
                        }
                        return java.lang.Boolean.valueOf(v(cjcVar, cjjVar, i, affcVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new defpackage.afas();
                        }
                        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cjjVar == null) {
                    cjjVar = defpackage.mw.n(cjcVarM);
                }
                return java.lang.Boolean.valueOf(v(cjcVar, cjjVar, i, affcVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.afas();
                }
                if (((defpackage.cio) cjcVar.b()).a) {
                    objValueOf = affcVar.invoke(cjcVar);
                } else {
                    objValueOf = cjjVar == null ? java.lang.Boolean.valueOf(k(cjcVar, i, affcVar)) : java.lang.Boolean.valueOf(m(cjcVar, cjjVar, i, affcVar));
                }
                return (java.lang.Boolean) objValueOf;
            }
        }
        return java.lang.Boolean.valueOf(k(cjcVar, i, affcVar));
    }

    public static final boolean k(defpackage.cjc cjcVar, int i, defpackage.affc affcVar) {
        defpackage.cjj cjjVar;
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cjc[16]);
        s(cjcVar, bzcVar);
        int i2 = bzcVar.b;
        if (i2 <= 1) {
            defpackage.cjc cjcVar2 = (defpackage.cjc) (i2 == 0 ? null : bzcVar.a[0]);
            if (cjcVar2 != null) {
                return ((java.lang.Boolean) affcVar.invoke(cjcVar2)).booleanValue();
            }
        } else {
            if (true == defpackage.a.X(i, 7)) {
                i = 4;
            }
            if (defpackage.a.X(i, 4) || defpackage.a.X(i, 6)) {
                defpackage.cjj cjjVarN = defpackage.mw.n(cjcVar);
                float f = cjjVarN.b;
                float f2 = cjjVarN.c;
                cjjVar = new defpackage.cjj(f, f2, f, f2);
            } else {
                if (!defpackage.a.X(i, 3) && !defpackage.a.X(i, 5)) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                }
                defpackage.cjj cjjVarN2 = defpackage.mw.n(cjcVar);
                float f3 = cjjVarN2.d;
                float f4 = cjjVarN2.e;
                cjjVar = new defpackage.cjj(f3, f4, f3, f4);
            }
            defpackage.cjc cjcVarR = r(bzcVar, cjjVar, i);
            if (cjcVarR != null) {
                return ((java.lang.Boolean) affcVar.invoke(cjcVarR)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean l(defpackage.cjj cjjVar, defpackage.cjj cjjVar2, defpackage.cjj cjjVar3, int i) {
        if (!w(cjjVar, i, cjjVar3)) {
            return false;
        }
        if (w(cjjVar2, i, cjjVar3) && !t(cjjVar3, cjjVar, cjjVar2, i)) {
            return !t(cjjVar3, cjjVar2, cjjVar, i) && q(i, cjjVar3, cjjVar) < q(i, cjjVar3, cjjVar2);
        }
        return true;
    }

    public static final boolean m(defpackage.cjc cjcVar, defpackage.cjj cjjVar, int i, defpackage.affc affcVar) {
        defpackage.cjc cjcVarR;
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cjc[16]);
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitChildren called on an unattached node");
        }
        defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar = cjcVar.q;
        defpackage.cge cgeVar2 = cgeVar.u;
        if (cgeVar2 == null) {
            defpackage.cjv.x(bzcVar2, cgeVar);
        } else {
            bzcVar2.n(cgeVar2);
        }
        while (true) {
            int i2 = bzcVar2.b;
            if (i2 == 0) {
                break;
            }
            defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i2 - 1);
            if ((cgeVarO.s & 1024) == 0) {
                defpackage.cjv.x(bzcVar2, cgeVarO);
            } else {
                while (cgeVarO != null) {
                    if ((cgeVarO.r & 1024) != 0) {
                        defpackage.bzc bzcVar3 = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.cjc) {
                                defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO;
                                if (cjcVar2.A) {
                                    bzcVar.n(cjcVar2);
                                }
                            } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i3 = 0;
                                for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                    if ((cgeVar3.r & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cgeVarO = cgeVar3;
                                        } else {
                                            if (bzcVar3 == null) {
                                                bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar3.n(cgeVarO);
                                            }
                                            bzcVar3.n(cgeVar3);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar3);
                        }
                        break;
                    }
                    cgeVarO = cgeVarO.u;
                }
            }
        }
        while (bzcVar.b != 0 && (cjcVarR = r(bzcVar, cjjVar, i)) != null) {
            if (((defpackage.cio) cjcVarR.b()).a) {
                return ((java.lang.Boolean) affcVar.invoke(cjcVarR)).booleanValue();
            }
            if (v(cjcVarR, cjjVar, i, affcVar)) {
                return true;
            }
            bzcVar.m(cjcVarR);
        }
        return false;
    }

    public static final boolean n(defpackage.cjc cjcVar, defpackage.affc affcVar) {
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.cjc cjcVarM = defpackage.mw.m(cjcVar);
                if (cjcVarM == null) {
                    throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = cjcVarM.g().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (n(cjcVarM, affcVar) || y(cjcVar, cjcVarM, 2, affcVar)) {
                            return true;
                        }
                        return ((defpackage.cio) cjcVarM.b()).a && ((java.lang.Boolean) affcVar.invoke(cjcVarM)).booleanValue();
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new defpackage.afas();
                        }
                        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return y(cjcVar, cjcVarM, 2, affcVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.afas();
                }
                if (z(cjcVar, affcVar)) {
                    return true;
                }
                return ((defpackage.cio) cjcVar.b()).a && ((java.lang.Boolean) affcVar.invoke(cjcVar)).booleanValue();
            }
        }
        return z(cjcVar, affcVar);
    }

    public static final boolean o(defpackage.cjc cjcVar, defpackage.affc affcVar) {
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.cjc cjcVarM = defpackage.mw.m(cjcVar);
                if (cjcVarM != null) {
                    return o(cjcVarM, affcVar) || y(cjcVar, cjcVarM, 1, affcVar);
                }
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ((defpackage.cio) cjcVar.b()).a ? ((java.lang.Boolean) affcVar.invoke(cjcVar)).booleanValue() : A(cjcVar, affcVar);
                }
                throw new defpackage.afas();
            }
        }
        return A(cjcVar, affcVar);
    }

    public static final boolean p(defpackage.cjc cjcVar, defpackage.cjc cjcVar2, int i, defpackage.affc affcVar) {
        defpackage.cge cgeVar;
        defpackage.cyg cygVar;
        if (cjcVar.g() != defpackage.cja.b) {
            throw new java.lang.IllegalStateException("This function should only be used within a parent that has focus.");
        }
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cjc[16]);
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitChildren called on an unattached node");
        }
        defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar2 = cjcVar.q;
        defpackage.cge cgeVar3 = cgeVar2.u;
        if (cgeVar3 == null) {
            defpackage.cjv.x(bzcVar2, cgeVar2);
        } else {
            bzcVar2.n(cgeVar3);
        }
        while (true) {
            int i2 = bzcVar2.b;
            cgeVar = null;
            if (i2 == 0) {
                break;
            }
            defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i2 - 1);
            if ((cgeVarO.s & 1024) == 0) {
                defpackage.cjv.x(bzcVar2, cgeVarO);
            } else {
                while (cgeVarO != null) {
                    if ((cgeVarO.r & 1024) != 0) {
                        defpackage.bzc bzcVar3 = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.cjc) {
                                bzcVar.n((defpackage.cjc) cgeVarO);
                            } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i3 = 0;
                                for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                    if ((cgeVar4.r & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cgeVarO = cgeVar4;
                                        } else {
                                            if (bzcVar3 == null) {
                                                bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar3.n(cgeVarO);
                                            }
                                            bzcVar3.n(cgeVar4);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar3);
                        }
                        break;
                    }
                    cgeVarO = cgeVarO.u;
                }
            }
        }
        bzcVar.j(cjd.a);
        if (defpackage.a.X(i, 1)) {
            defpackage.afia afiaVarM = defpackage.afqt.m(0, bzcVar.b);
            int i4 = afiaVarM.a;
            int i5 = afiaVarM.b;
            if (i4 <= i5) {
                boolean zF = false;
                while (true) {
                    if (zF) {
                        defpackage.cjc cjcVar3 = (defpackage.cjc) bzcVar.a[i4];
                        if (defpackage.mw.o(cjcVar3) && o(cjcVar3, affcVar)) {
                            return true;
                        }
                    }
                    zF |= defpackage.afga.f(bzcVar.a[i4], cjcVar2);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!defpackage.a.X(i, 2)) {
                throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search");
            }
            defpackage.afia afiaVarM2 = defpackage.afqt.m(0, bzcVar.b);
            int i6 = afiaVarM2.a;
            int i7 = afiaVarM2.b;
            if (i6 <= i7) {
                boolean zF2 = false;
                while (true) {
                    if (zF2) {
                        defpackage.cjc cjcVar4 = (defpackage.cjc) bzcVar.a[i7];
                        if (defpackage.mw.o(cjcVar4) && n(cjcVar4, affcVar)) {
                            return true;
                        }
                    }
                    zF2 |= defpackage.afga.f(bzcVar.a[i7], cjcVar2);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        if (!defpackage.a.X(i, 1) && ((defpackage.cio) cjcVar.b()).a) {
            if (!cjcVar.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar5 = cjcVar.q.t;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVar);
            loop5: while (cxlVarR != null) {
                if ((cxlVarR.v.f.s & 1024) != 0) {
                    while (cgeVar5 != null) {
                        if ((cgeVar5.r & 1024) != 0) {
                            defpackage.cge cgeVarO2 = cgeVar5;
                            defpackage.bzc bzcVar4 = null;
                            while (cgeVarO2 != null) {
                                if (cgeVarO2 instanceof defpackage.cjc) {
                                    cgeVar = cgeVarO2;
                                    break loop5;
                                }
                                if ((cgeVarO2.r & 1024) != 0 && (cgeVarO2 instanceof defpackage.cwo)) {
                                    int i8 = 0;
                                    for (defpackage.cge cgeVar6 = ((defpackage.cwo) cgeVarO2).C; cgeVar6 != null; cgeVar6 = cgeVar6.u) {
                                        if ((cgeVar6.r & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                cgeVarO2 = cgeVar6;
                                            } else {
                                                if (bzcVar4 == null) {
                                                    bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO2 != null) {
                                                    bzcVar4.n(cgeVarO2);
                                                }
                                                bzcVar4.n(cgeVar6);
                                                cgeVarO2 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                cgeVarO2 = defpackage.cjv.o(bzcVar4);
                            }
                        }
                        cgeVar5 = cgeVar5.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar5 = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
            }
            if (cgeVar != null) {
                return ((java.lang.Boolean) affcVar.invoke(cjcVar)).booleanValue();
            }
        }
        return false;
    }

    private static final long q(int i, defpackage.cjj cjjVar, defpackage.cjj cjjVar2) {
        float f;
        float f2;
        float f3;
        long jX = (long) x(cjjVar2, i, cjjVar);
        if (defpackage.a.X(i, 3) || defpackage.a.X(i, 4)) {
            float f4 = cjjVar.c;
            f = f4 + ((cjjVar.e - f4) / 2.0f);
            f2 = cjjVar2.c;
            f3 = cjjVar2.e;
        } else {
            if (!defpackage.a.X(i, 5) && !defpackage.a.X(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f5 = cjjVar.b;
            f = f5 + ((cjjVar.d - f5) / 2.0f);
            f2 = cjjVar2.b;
            f3 = cjjVar2.d;
        }
        float f6 = f - (f2 + ((f3 - f2) / 2.0f));
        long j = 13 * jX * jX;
        long j2 = (long) f6;
        return j + (j2 * j2);
    }

    private static final defpackage.cjc r(defpackage.bzc bzcVar, defpackage.cjj cjjVar, int i) {
        defpackage.cjj cjjVarE;
        if (defpackage.a.X(i, 3)) {
            cjjVarE = cjjVar.e((cjjVar.d - cjjVar.b) + 1.0f, 0.0f);
        } else if (defpackage.a.X(i, 4)) {
            cjjVarE = cjjVar.e(-((cjjVar.d - cjjVar.b) + 1.0f), 0.0f);
        } else if (defpackage.a.X(i, 5)) {
            cjjVarE = cjjVar.e(0.0f, (cjjVar.e - cjjVar.c) + 1.0f);
        } else {
            if (!defpackage.a.X(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            cjjVarE = cjjVar.e(0.0f, -((cjjVar.e - cjjVar.c) + 1.0f));
        }
        java.lang.Object[] objArr = bzcVar.a;
        int i2 = bzcVar.b;
        defpackage.cjc cjcVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.cjc cjcVar2 = (defpackage.cjc) objArr[i3];
            if (defpackage.mw.o(cjcVar2)) {
                defpackage.cjj cjjVarN = defpackage.mw.n(cjcVar2);
                if (l(cjjVarN, cjjVarE, cjjVar, i)) {
                    cjcVar = cjcVar2;
                    cjjVarE = cjjVarN;
                }
            }
        }
        return cjcVar;
    }

    private static final void s(defpackage.cwn cwnVar, defpackage.bzc bzcVar) {
        defpackage.cge cgeVar = (defpackage.cge) cwnVar;
        if (!cgeVar.q.A) {
            defpackage.csc.c("visitChildren called on an unattached node");
        }
        defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar2 = cgeVar.q;
        defpackage.cge cgeVar3 = cgeVar2.u;
        if (cgeVar3 == null) {
            defpackage.cjv.x(bzcVar2, cgeVar2);
        } else {
            bzcVar2.n(cgeVar3);
        }
        while (true) {
            int i = bzcVar2.b;
            if (i == 0) {
                return;
            }
            defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i - 1);
            if ((cgeVarO.s & 1024) == 0) {
                defpackage.cjv.x(bzcVar2, cgeVarO);
            } else {
                while (cgeVarO != null) {
                    if ((cgeVarO.r & 1024) != 0) {
                        defpackage.bzc bzcVar3 = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.cjc) {
                                defpackage.cjc cjcVar = (defpackage.cjc) cgeVarO;
                                if (cjcVar.A && !defpackage.cjv.r(cjcVar).D) {
                                    if (((defpackage.cio) cjcVar.b()).a) {
                                        bzcVar.n(cjcVar);
                                    } else {
                                        s(cjcVar, bzcVar);
                                    }
                                }
                            } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i2 = 0;
                                for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                    if ((cgeVar4.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cgeVarO = cgeVar4;
                                        } else {
                                            if (bzcVar3 == null) {
                                                bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar3.n(cgeVarO);
                                            }
                                            bzcVar3.n(cgeVar4);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar3);
                        }
                        break;
                    }
                    cgeVarO = cgeVarO.u;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x009e A[RETURN] */
    private static final boolean t(defpackage.cjj cjjVar, defpackage.cjj cjjVar2, defpackage.cjj cjjVar3, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (u(cjjVar3, i, cjjVar) || !u(cjjVar2, i, cjjVar)) {
            return false;
        }
        if (defpackage.a.X(i, 3)) {
            if (cjjVar.b < cjjVar3.d) {
                return true;
            }
        } else if (defpackage.a.X(i, 4)) {
            if (cjjVar.d > cjjVar3.b) {
                return true;
            }
        } else if (defpackage.a.X(i, 5)) {
            if (cjjVar.c < cjjVar3.e) {
                return true;
            }
        } else {
            if (!defpackage.a.X(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (cjjVar.e > cjjVar3.c) {
                return true;
            }
        }
        if (defpackage.a.X(i, 3) || defpackage.a.X(i, 4)) {
            return true;
        }
        float fX = x(cjjVar2, i, cjjVar);
        if (!defpackage.a.X(i, 3)) {
            if (defpackage.a.X(i, 4)) {
                f = cjjVar3.d;
                f2 = cjjVar.d;
            } else if (defpackage.a.X(i, 5)) {
                f3 = cjjVar.c;
                f4 = cjjVar3.c;
            } else {
                if (!defpackage.a.X(i, 6)) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                }
                f = cjjVar3.e;
                f2 = cjjVar.e;
            }
            f5 = f - f2;
            if (f5 < 1.0f) {
                f5 = 1.0f;
            }
            if (fX >= f5) {
                return false;
            }
            return true;
        }
        f3 = cjjVar.b;
        f4 = cjjVar3.b;
        f5 = f3 - f4;
        if (f5 < 1.0f) {
            f5 = 1.0f;
        }
        if (fX >= f5) {
            return false;
        }
        return true;
    }

    private static final boolean u(defpackage.cjj cjjVar, int i, defpackage.cjj cjjVar2) {
        if (defpackage.a.X(i, 3) || defpackage.a.X(i, 4)) {
            return cjjVar.e > cjjVar2.c && cjjVar.c < cjjVar2.e;
        }
        if (defpackage.a.X(i, 5) || defpackage.a.X(i, 6)) {
            return cjjVar.d > cjjVar2.b && cjjVar.b < cjjVar2.d;
        }
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean v(defpackage.cjc cjcVar, defpackage.cjj cjjVar, int i, defpackage.affc affcVar) {
        if (m(cjcVar, cjjVar, i, affcVar)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.ly.r(cjcVar, i, new cje(((defpackage.czz) defpackage.cjv.t(cjcVar)).J.b(), cjcVar, cjjVar, i, affcVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean w(defpackage.cjj cjjVar, int i, defpackage.cjj cjjVar2) {
        if (defpackage.a.X(i, 3)) {
            float f = cjjVar2.d;
            float f2 = cjjVar.d;
            return (f > f2 || cjjVar2.b >= f2) && cjjVar2.b > cjjVar.b;
        }
        if (defpackage.a.X(i, 4)) {
            float f3 = cjjVar2.b;
            float f4 = cjjVar.b;
            return (f3 < f4 || cjjVar2.d <= f4) && cjjVar2.d < cjjVar.d;
        }
        if (defpackage.a.X(i, 5)) {
            float f5 = cjjVar2.e;
            float f6 = cjjVar.e;
            return (f5 > f6 || cjjVar2.c >= f6) && cjjVar2.c > cjjVar.c;
        }
        if (!defpackage.a.X(i, 6)) {
            throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = cjjVar2.c;
        float f8 = cjjVar.c;
        return (f7 < f8 || cjjVar2.e <= f8) && cjjVar2.e < cjjVar.e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[RETURN] */
    private static /* synthetic */ float x(defpackage.cjj cjjVar, int i, defpackage.cjj cjjVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!defpackage.a.X(i, 3)) {
            if (defpackage.a.X(i, 4)) {
                f = cjjVar.b;
                f2 = cjjVar2.d;
            } else if (defpackage.a.X(i, 5)) {
                f3 = cjjVar2.c;
                f4 = cjjVar.e;
            } else {
                if (!defpackage.a.X(i, 6)) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                }
                f = cjjVar.c;
                f2 = cjjVar2.e;
            }
            f5 = f - f2;
            if (f5 < 0.0f) {
                return 0.0f;
            }
            return f5;
        }
        f3 = cjjVar2.b;
        f4 = cjjVar.d;
        f5 = f3 - f4;
        if (f5 < 0.0f) {
            return 0.0f;
        }
        return f5;
    }

    private static final boolean y(defpackage.cjc cjcVar, defpackage.cjc cjcVar2, int i, defpackage.affc affcVar) {
        if (p(cjcVar, cjcVar2, i, affcVar)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.ly.r(cjcVar, i, new cje(((defpackage.czz) defpackage.cjv.t(cjcVar)).J.b(), cjcVar, cjcVar2, i, affcVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean z(defpackage.cjc cjcVar, defpackage.affc affcVar) {
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cjc[16]);
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitChildren called on an unattached node");
        }
        defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar = cjcVar.q;
        defpackage.cge cgeVar2 = cgeVar.u;
        if (cgeVar2 == null) {
            defpackage.cjv.x(bzcVar2, cgeVar);
        } else {
            bzcVar2.n(cgeVar2);
        }
        while (true) {
            int i = bzcVar2.b;
            if (i == 0) {
                break;
            }
            defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i - 1);
            if ((cgeVarO.s & 1024) == 0) {
                defpackage.cjv.x(bzcVar2, cgeVarO);
            } else {
                while (cgeVarO != null) {
                    if ((cgeVarO.r & 1024) != 0) {
                        defpackage.bzc bzcVar3 = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.cjc) {
                                bzcVar.n((defpackage.cjc) cgeVarO);
                            } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i2 = 0;
                                for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                    if ((cgeVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cgeVarO = cgeVar3;
                                        } else {
                                            if (bzcVar3 == null) {
                                                bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar3.n(cgeVarO);
                                            }
                                            bzcVar3.n(cgeVar3);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar3);
                        }
                        break;
                    }
                    cgeVarO = cgeVarO.u;
                }
            }
        }
        bzcVar.j(cjd.a);
        int i3 = bzcVar.b - 1;
        java.lang.Object[] objArr = bzcVar.a;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                defpackage.cjc cjcVar2 = (defpackage.cjc) objArr[i3];
                if (defpackage.mw.o(cjcVar2) && n(cjcVar2, affcVar)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }
}
