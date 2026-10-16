package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class tw {
    /* JADX INFO: Thrown type has an unknown type hierarchy: qx */
    public static java.lang.Object a(java.lang.String str, yg ygVar) throws qx, android.os.RemoteException {
        try {
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", defpackage.a.bp(str, "Dispatching call ", " to host"));
            }
            return ygVar.a();
        } catch (java.lang.SecurityException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw new qx(defpackage.a.bp(str, "Remote ", " call failed"), e2);
        }
    }

    public static void b(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, yf yfVar) {
        yq.b(new ae(iOnDoneCallback, str, yfVar, 6, (short[]) null));
    }

    public static void c(defpackage.epy epyVar, java.lang.String str, yf yfVar) {
        yq.b(new ae(epyVar, yfVar, str, 5, (char[]) null));
    }

    public static void d(defpackage.epy epyVar, androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, yf yfVar) {
        yq.b(new defpackage.ye(epyVar, iOnDoneCallback, str, yfVar, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qx */
    public static void e(java.lang.String str, yg ygVar) throws qx {
        try {
            a(str, ygVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void f(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, java.lang.Throwable th) {
        e(java.lang.String.valueOf(str).concat(" onFailure"), new yd(iOnDoneCallback, th, str, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qx */
    public static void g(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, java.lang.Object obj) throws qx {
        e(str.concat(" onSuccess"), new yd(iOnDoneCallback, obj, str, 1));
    }

    public static final void h(final boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, final boolean z2, defpackage.bsd bsdVar, defpackage.bsa bsaVar, defpackage.bmv bmvVar, defpackage.avv avvVar, defpackage.ask askVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        final defpackage.affc affcVar2;
        java.lang.Object obj;
        int i4;
        defpackage.bve bveVar2;
        boolean z3;
        defpackage.ask askVar2;
        long j;
        long j2;
        defpackage.bys bysVarA;
        defpackage.cld cldVar;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(579209066);
        if (i5 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            affcVar2 = affcVar;
            i3 |= true != bveVarC.E(affcVar2) ? 16 : 32;
        } else {
            affcVar2 = affcVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.C(bsdVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.C(bsaVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.C(bmvVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != bveVarC.C(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            obj = avvVar;
            i3 |= true != bveVarC.C(obj) ? 33554432 : 67108864;
        } else {
            obj = avvVar;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != bveVarC.C(askVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != bveVarC.E(affhVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            if (askVar == null) {
                bveVarC.v(-1960617487);
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                askVar2 = (defpackage.ask) objS;
                bwcVar.Y(false);
            } else {
                bveVarC.v(-1725814362);
                bwcVar.Y(false);
                askVar2 = askVar;
            }
            defpackage.afd afdVarB = defpackage.rq.b(2, bveVarC);
            defpackage.bys bysVarI = defpackage.asq.i(askVar2, bveVarC, 0);
            if (z2) {
                j = z ? bsaVar.e : bsaVar.a;
            } else {
                j = bsaVar.c;
            }
            if (z2) {
                j2 = z ? bsaVar.f : bsaVar.b;
            } else {
                j2 = bsaVar.d;
            }
            long j3 = j2;
            if (bmvVar == null) {
                bveVarC.v(-1960202708);
                bwcVar.Y(false);
                bysVarA = null;
            } else {
                bveVarC.v(-1725800331);
                bysVarA = bmvVar.a(z2, askVar2, bveVarC, (((i3 >> 9) & 14) | ((i3 >> 12) & 896)) & 910);
                bwcVar.Y(false);
            }
            float f = bysVarA != null ? ((defpackage.dlr) bysVarA.a()).a : 0.0f;
            boolean zBooleanValue = ((java.lang.Boolean) bysVarI.a()).booleanValue();
            bveVarC.v(-585100128);
            if (zBooleanValue) {
                cldVar = bsdVar.b;
                z4 = z;
            } else if (z) {
                cldVar = bsdVar.c;
                z4 = true;
            } else {
                cldVar = bsdVar.a;
                z4 = false;
            }
            boolean z7 = bsdVar.a instanceof defpackage.bcr;
            if (z7 && (bsdVar.b instanceof defpackage.bcr) && (bsdVar.c instanceof defpackage.bcr)) {
                bveVarC.v(-1740235478);
                bwcVar.ab(359505585, bsdVar, 0, null);
                cldVar.getClass();
                boolean zC = bveVarC.C(afdVarB);
                java.lang.Object objS2 = bwcVar.S();
                if (zC || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.kte((defpackage.bcr) cldVar, afdVarB);
                    bwcVar.ad(objS2);
                }
                defpackage.kte kteVar = (defpackage.kte) objS2;
                java.lang.Object objS3 = bwcVar.S();
                java.lang.Object obj2 = defpackage.bvd.a;
                if (objS3 == obj2) {
                    objS3 = defpackage.afqt.q(-1, 0, 6);
                    bwcVar.ad(objS3);
                }
                aiyk aiykVar = (aiyk) objS3;
                boolean zE = bveVarC.E(aiykVar) | bveVarC.C(cldVar);
                java.lang.Object objS4 = bwcVar.S();
                if (zE || objS4 == obj2) {
                    objS4 = new defpackage.bso(aiykVar, cldVar, 0);
                    bwcVar.ad(objS4);
                }
                bveVarC.r((defpackage.afer) objS4);
                boolean zE2 = bveVarC.E(aiykVar) | bveVarC.C(kteVar);
                java.lang.Object objS5 = bwcVar.S();
                if (zE2 || objS5 == obj2) {
                    objS5 = new defpackage.bsq(aiykVar, kteVar, null, 1, null);
                    bwcVar.ad(objS5);
                }
                defpackage.bvx.f(kteVar, aiykVar, (defpackage.affg) objS5, bveVarC);
                defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
                kteVar.c = dloVar;
                boolean zC2 = bveVarC.C(dloVar) | bveVarC.C(kteVar);
                java.lang.Object objS6 = bwcVar.S();
                if (zC2 || objS6 == obj2) {
                    objS6 = new defpackage.bsp(kteVar, 1);
                    bwcVar.ad(objS6);
                }
                cldVar = (defpackage.bsp) objS6;
                bwcVar.Y(false);
                bwcVar.Y(false);
                bwcVar.Y(false);
                z5 = false;
            } else {
                if (z7 && (bsdVar.b instanceof defpackage.bcr) && (bsdVar.c instanceof defpackage.bcr)) {
                    bveVarC.v(-1740097652);
                    bwcVar.ab(359510031, bsdVar, 0, null);
                    cldVar.getClass();
                    boolean zC3 = bveVarC.C(afdVarB);
                    java.lang.Object objS7 = bwcVar.S();
                    if (zC3 || objS7 == defpackage.bvd.a) {
                        objS7 = new defpackage.kte((defpackage.bcr) cldVar, afdVarB);
                        bwcVar.ad(objS7);
                    }
                    defpackage.kte kteVar2 = (defpackage.kte) objS7;
                    java.lang.Object objS8 = bwcVar.S();
                    java.lang.Object obj3 = defpackage.bvd.a;
                    if (objS8 == obj3) {
                        objS8 = defpackage.afqt.q(-1, 0, 6);
                        bwcVar.ad(objS8);
                    }
                    aiyk aiykVar2 = (aiyk) objS8;
                    boolean zE3 = bveVarC.E(aiykVar2) | bveVarC.C(cldVar);
                    java.lang.Object objS9 = bwcVar.S();
                    if (zE3 || objS9 == obj3) {
                        objS9 = new defpackage.bso(aiykVar2, cldVar, 2);
                        bwcVar.ad(objS9);
                    }
                    bveVarC.r((defpackage.afer) objS9);
                    boolean zE4 = bveVarC.E(aiykVar2) | bveVarC.C(kteVar2);
                    java.lang.Object objS10 = bwcVar.S();
                    if (zE4 || objS10 == obj3) {
                        objS10 = new defpackage.bsq(aiykVar2, kteVar2, null, 0, null, null);
                        bwcVar.ad(objS10);
                    }
                    defpackage.bvx.f(kteVar2, aiykVar2, (defpackage.affg) objS10, bveVarC);
                    defpackage.dlo dloVar2 = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
                    kteVar2.c = dloVar2;
                    boolean zC4 = bveVarC.C(dloVar2) | bveVarC.C(kteVar2);
                    java.lang.Object objS11 = bwcVar.S();
                    if (zC4 || objS11 == obj3) {
                        z5 = false;
                        objS11 = new defpackage.bsp(kteVar2, 0, null);
                        bwcVar.ad(objS11);
                    } else {
                        z5 = false;
                    }
                    cldVar = (defpackage.bsp) objS11;
                    bwcVar.Y(z5);
                } else {
                    z5 = false;
                    bveVarC.v(-1740015006);
                }
                bwcVar.Y(z5);
                bwcVar.Y(z5);
            }
            java.lang.Object objS12 = bwcVar.S();
            java.lang.Object obj4 = defpackage.bvd.a;
            if (objS12 == obj4) {
                objS12 = new defpackage.bmo(14);
                bwcVar.ad(objS12);
            }
            final defpackage.cgf cgfVarA = defpackage.dea.a(cgfVar, z5, (defpackage.affc) objS12);
            final defpackage.ccz cczVarAs = defpackage.dai.as(-1671845632, true, new defpackage.bsc(j3, obj, affhVar, 0), bveVarC);
            defpackage.bvm bvmVar = defpackage.bqv.a;
            if (askVar2 == null) {
                bveVarC.v(643383721);
                java.lang.Object objS13 = bwcVar.S();
                if (objS13 == obj4) {
                    objS13 = new defpackage.asl();
                    bwcVar.ad(objS13);
                }
                askVar2 = (defpackage.ask) objS13;
                z6 = false;
            } else {
                z6 = false;
                bveVarC.v(-533435666);
            }
            bwcVar.Y(z6);
            defpackage.bvm bvmVar2 = defpackage.bqv.a;
            final float f2 = ((defpackage.dlr) bveVarC.f(bvmVar2)).a + 0.0f;
            bveVar2 = bveVarC;
            final long j4 = j;
            final float f3 = f;
            final defpackage.cld cldVar2 = cldVar;
            final defpackage.ask askVar3 = askVar2;
            defpackage.dai.aB(new defpackage.bxk[]{defpackage.bnq.a.b(new defpackage.ckd(j3)), bvmVar2.b(new defpackage.dlr(f2))}, defpackage.dai.as(-1839065134, true, new defpackage.affg() { // from class: bqu
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    defpackage.cgf cgfVarA2;
                    defpackage.bve bveVar3 = (defpackage.bve) obj5;
                    int iIntValue = ((java.lang.Integer) obj6).intValue();
                    int i6 = iIntValue & 3;
                    int i7 = iIntValue & 1;
                    defpackage.bvm bvmVar3 = defpackage.bqv.a;
                    if (bveVar3.I(i6 != 2, i7)) {
                        float f4 = f3;
                        defpackage.affc affcVar3 = affcVar2;
                        boolean z8 = z2;
                        boolean z9 = z;
                        float f5 = f2;
                        long j5 = j4;
                        defpackage.cld cldVar3 = cldVar2;
                        defpackage.ask askVar4 = askVar3;
                        defpackage.cgf cgfVar2 = cgfVarA;
                        defpackage.csu csuVar = defpackage.bok.a;
                        defpackage.cgf cgfVarA3 = cgfVar2.a(defpackage.bou.a);
                        defpackage.bvm bvmVar4 = defpackage.bpk.a;
                        java.lang.Object obj7 = ((defpackage.khb) bveVar3.f(bvmVar4)).a;
                        defpackage.cgc cgcVar = defpackage.cgf.e;
                        defpackage.cgf cgfVarA4 = defpackage.bqv.a(cgfVarA3.a(cgcVar), cldVar3, defpackage.bnl.c(((defpackage.bol) bveVar3.f(defpackage.bom.a)).a, j5, f5, bveVar3), null, ((defpackage.dlo) bveVar3.f(defpackage.dbl.d)).dI(f4));
                        java.lang.Object obj8 = ((defpackage.khb) bveVar3.f(bvmVar4)).a;
                        defpackage.akr akrVarA = defpackage.bpk.a(false, 0.0f, 0L, cldVar3, true, 215);
                        if (akrVarA instanceof defpackage.akr) {
                            cgfVarA2 = new defpackage.bcn(z9, askVar4, akrVarA, z8, affcVar3);
                        } else if (akrVarA == null) {
                            cgfVarA2 = new defpackage.bcn(z9, askVar4, null, z8, affcVar3);
                        } else {
                            cgfVarA2 = askVar4 != null ? defpackage.akn.a(cgcVar, askVar4, akrVarA).a(new defpackage.bcn(z9, askVar4, null, z8, affcVar3)) : new defpackage.cgb(new defpackage.bco(akrVarA, z9, z8, affcVar3));
                        }
                        defpackage.cgf cgfVarA5 = cgfVarA4.a(cgfVarA2).a(new defpackage.bsv(new defpackage.bev(19)));
                        defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
                        long jB = bveVar3.b();
                        long j6 = jB ^ (jB >>> 32);
                        defpackage.cdd cddVarN = bveVar3.N();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar3, cgfVarA5);
                        defpackage.afer aferVar = defpackage.cwl.a;
                        bveVar3.M();
                        bveVar3.w();
                        if (bveVar3.G()) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.affg affgVar = cczVarAs;
                        defpackage.byw.c(bveVar3, ctyVarB, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarN, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf((int) j6), defpackage.cwl.f);
                        bveVar3.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVar3, cgfVarN, defpackage.cwl.c);
                        affgVar.invoke(bveVar3, 0);
                        bveVar3.n();
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2), bveVar2, 56);
            z3 = z4;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z3 = z;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.kuo(z3, affcVar, cgfVar, z2, bsdVar, bsaVar, bmvVar, avvVar, askVar, affhVar, i, i2, 1);
        }
    }

    public static final void i(defpackage.cgf cgfVar, long j, long j2, defpackage.affh affhVar, defpackage.affg affgVar, defpackage.affg affgVar2, defpackage.bve bveVar, int i) {
        defpackage.cgf cgfVar2;
        int i2;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1955286154);
        if (i3 == 0) {
            cgfVar2 = cgfVar;
            i2 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.B(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.E(affgVar2) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bveVar2 = bveVarC;
            defpackage.bqv.b(defpackage.afw.Q(cgfVar2), null, j, j2, 0.0f, null, defpackage.dai.as(830280655, true, new brl(affgVar2, affgVar, affhVar, 2), bveVarC), bveVar2, 114);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new brp(cgfVar, j, j2, affhVar, affgVar, affgVar2, i, 1);
        }
    }

    public static final void j(defpackage.cgf cgfVar, long j, long j2, defpackage.affh affhVar, defpackage.affg affgVar, defpackage.affg affgVar2, defpackage.bve bveVar, int i) {
        defpackage.cgf cgfVar2;
        int i2;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(148841506);
        if (i3 == 0) {
            cgfVar2 = cgfVar;
            i2 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.B(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.E(affgVar2) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bveVar2 = bveVarC;
            defpackage.bqv.b(defpackage.afw.Q(cgfVar2), null, j, j2, 0.0f, null, defpackage.dai.as(-1815327065, true, new brl(affgVar2, affgVar, affhVar, 3), bveVarC), bveVar2, 114);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new brp(cgfVar, j, j2, affhVar, affgVar, affgVar2, i, 0);
        }
    }

    public static final void k(int i, defpackage.cgf cgfVar, long j, long j2, defpackage.affh affhVar, defpackage.affg affgVar, defpackage.affg affgVar2, defpackage.bve bveVar, int i2) {
        int i3;
        defpackage.bve bveVar2;
        long j3;
        long j4;
        long jA;
        long jB;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-1012974221);
        if (i4 == 0) {
            i3 = (true != bveVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != bveVarC.E(affhVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != bveVarC.E(affgVar2) ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i5 = i3 & (-8065);
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || bveVarC.F()) {
                jA = brk.a(bveVarC);
                jB = brk.b(bveVarC);
            } else {
                bveVarC.s();
                jA = j;
                jB = j2;
            }
            bveVarC.l();
            bveVar2 = bveVarC;
            i(cgfVar, jA, jB, affhVar, affgVar, affgVar2, bveVar2, (i5 >> 3) & 523278);
            j3 = jA;
            j4 = jB;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            j3 = j;
            j4 = j2;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bro(i, cgfVar, j3, j4, affhVar, affgVar, affgVar2, i2, 1);
        }
    }

    public static final void l(int i, defpackage.cgf cgfVar, long j, long j2, defpackage.affh affhVar, defpackage.affg affgVar, defpackage.affg affgVar2, defpackage.bve bveVar, int i2) {
        int i3;
        defpackage.affg affgVar3;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        long j3;
        long j4;
        defpackage.affh affhVar2;
        defpackage.affg affgVar4;
        defpackage.affh affhVarAs;
        defpackage.affg affgVar5;
        long j5;
        defpackage.cgf cgfVar3;
        long j6;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(1445190381);
        if (i4 == 0) {
            i3 = (true != bveVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i2 & 384) == 0) {
            i5 = i3 | 176;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        int i6 = 221184 | i5;
        if ((1572864 & i2) == 0) {
            affgVar3 = affgVar2;
            i6 |= true != bveVarC.E(affgVar3) ? 524288 : 1048576;
        } else {
            affgVar3 = affgVar2;
        }
        if (bveVarC.I((599187 & i6) != 599186, i6 & 1)) {
            int i7 = i6 & (-8065);
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || bveVarC.F()) {
                defpackage.cgc cgcVar = defpackage.cgf.e;
                long jA = brk.a(bveVarC);
                long jB = brk.b(bveVarC);
                affhVarAs = defpackage.dai.as(906699528, true, new brn(i, 0), bveVarC);
                affgVar5 = bno.a;
                j5 = jB;
                cgfVar3 = cgcVar;
                j6 = jA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                j6 = j;
                j5 = j2;
                affhVarAs = affhVar;
                affgVar5 = affgVar;
            }
            bveVarC.l();
            bveVar2 = bveVarC;
            j(cgfVar3, j6, j5, affhVarAs, affgVar5, affgVar3, bveVar2, (i7 >> 3) & 523278);
            cgfVar2 = cgfVar3;
            j3 = j6;
            j4 = j5;
            affhVar2 = affhVarAs;
            affgVar4 = affgVar5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            j3 = j;
            j4 = j2;
            affhVar2 = affhVar;
            affgVar4 = affgVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bro(i, cgfVar2, j3, j4, affhVar2, affgVar4, affgVar2, i2, 0);
        }
    }

    public static final int m(defpackage.cth cthVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return cthVar.h(new defpackage.ctb(cszVar, cszVar.p()), new defpackage.cud(csyVar, 2, 2, 0), defpackage.dln.d(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static final int n(defpackage.cth cthVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return cthVar.h(new defpackage.ctb(cszVar, cszVar.p()), new defpackage.cud(csyVar, 2, 1, 0), defpackage.dln.d(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static final int o(defpackage.cth cthVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return cthVar.h(new defpackage.ctb(cszVar, cszVar.p()), new defpackage.cud(csyVar, 1, 2, 0), defpackage.dln.d(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static final int p(defpackage.cth cthVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return cthVar.h(new defpackage.ctb(cszVar, cszVar.p()), new defpackage.cud(csyVar, 1, 1, 0), defpackage.dln.d(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static int q(defpackage.cty ctyVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.cud((defpackage.csy) list.get(i2), 2, 2, 1));
        }
        return ctyVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static int r(defpackage.cty ctyVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.cud((defpackage.csy) list.get(i2), 2, 1, 1));
        }
        return ctyVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static int s(defpackage.cty ctyVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.cud((defpackage.csy) list.get(i2), 1, 2, 1));
        }
        return ctyVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static int t(defpackage.cty ctyVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.cud((defpackage.csy) list.get(i2), 1, 1, 1));
        }
        return ctyVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static final defpackage.cxv u(defpackage.cxv cxvVar) {
        defpackage.cxl cxlVarL = cxvVar.L();
        while (true) {
            defpackage.cxl cxlVarL2 = cxlVarL.l();
            defpackage.cxl cxlVar = null;
            if ((cxlVarL2 != null ? cxlVarL2.j : null) == null) {
                defpackage.cxv cxvVarC = cxlVarL.q().C();
                cxvVarC.getClass();
                return cxvVarC;
            }
            defpackage.cxl cxlVarL3 = cxlVarL.l();
            if (cxlVarL3 != null) {
                cxlVar = cxlVarL3.j;
            }
            cxlVar.getClass();
            defpackage.cxl cxlVarL4 = cxlVarL.l();
            cxlVarL4.getClass();
            cxlVarL = cxlVarL4.j;
            cxlVarL.getClass();
        }
    }

    public static final defpackage.affg v(java.util.List list) {
        return new defpackage.ccz(1271844412, true, new defpackage.bmc(list, 9));
    }

    public static final void w(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.cty ctyVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1663319424);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(ctyVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            int iA = bveVarC.a();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            defpackage.cdd cddVarAh = bwcVar.ah();
            int i4 = ((i2 << 3) & 896) | 6;
            defpackage.afer aferVar = defpackage.cxl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.cmr cmrVar = new defpackage.cmr(3);
            if (bwcVar.t) {
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(cmrVar, 15));
            }
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iA), defpackage.cwl.f);
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i4 >> 6) & 14));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf(cgfVar, affgVar, ctyVar, i, 1, (byte[]) null);
        }
    }
}
