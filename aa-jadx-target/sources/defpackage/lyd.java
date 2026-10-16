package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lyd {
    private static final long A(defpackage.bwx bwxVar) {
        return ((defpackage.dly) bwxVar.a()).a;
    }

    private static final long B(defpackage.bwx bwxVar) {
        return ((defpackage.dly) bwxVar.a()).a;
    }

    public static final defpackage.eqp a(defpackage.lun lunVar) {
        defpackage.eqp eqpVarA = lunVar.a();
        eqpVarA.getClass();
        defpackage.ygw ygwVar = (defpackage.ygw) eqpVarA.e();
        ygwVar.getClass();
        if (ygwVar.size() == 1) {
            return lunVar.b((mesquite.messaging.model.Container) ygwVar.get(0));
        }
        throw new java.lang.UnsupportedOperationException("Multiple containers are not supported for messaging apps");
    }

    public static final defpackage.lun b(java.lang.String str) {
        return defpackage.luv.e().j(defpackage.kit.b().e(), defpackage.luv.e().a(str)) ? defpackage.lvh.h() : defpackage.lvb.a().b(str, defpackage.mqh.b);
    }

    public static void c() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0224  */
    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    public static final void d(defpackage.afer aferVar, java.lang.String str, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, defpackage.ktl ktlVar, boolean z, defpackage.cgf cgfVar, boolean z2, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        defpackage.cgf cgfVar3;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        boolean z5;
        defpackage.cld cldVarT;
        boolean z6;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3;
        defpackage.cne cneVar;
        boolean z7;
        defpackage.cne cneVar2;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon4 = ghIcon;
        aferVar.getClass();
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-564850216);
        if (i6 == 0) {
            i3 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.C(ghIcon4) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.C(ktlVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.D(z) ? 8192 : 16384;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 65536 : 131072;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i4 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(z2)) {
                    i5 = 524288;
                } else {
                    i5 = 1048576;
                }
                i3 |= i5;
            }
            if (bveVarC.I((599187 & i3) != 599186, i3 & 1)) {
                if (i7 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 = z3 & z2;
                if (str == null && str.length() != 0 && z) {
                    bveVarC.v(229340096);
                    int i8 = (i3 & 112) | 8 | ((i3 << 6) & 896);
                    int i9 = (i3 << 18) & 1879048192;
                    int i10 = (i3 >> 6) & 7168;
                    if (defpackage.lee.a.a().b()) {
                        bveVarC.v(229380086);
                        if (ghIcon4 == null) {
                            bveVarC.v(229405598);
                            ((defpackage.bwc) bveVarC).Y(false);
                            cneVar2 = null;
                            ghIcon3 = null;
                        } else {
                            bveVarC.v(-1655167805);
                            defpackage.cne cneVarF = defpackage.lgo.f(ghIcon4, 0.0f, bveVarC, 3);
                            ((defpackage.bwc) bveVarC).Y(false);
                            ghIcon3 = ghIcon4;
                            cneVar2 = cneVarF;
                        }
                        defpackage.khg.r(cneVar2, str, aferVar, cgfVar4, defpackage.ktf.c, false, z5, null, defpackage.khg.t(bveVarC), ktlVar, null, null, bveVarC, (i3 & 3670016) | i8 | i10 | i9, 0, 7328);
                        bveVarC = bveVarC;
                        ((defpackage.bwc) bveVarC).Y(false);
                        z7 = false;
                    } else {
                        bveVarC.v(229663829);
                        if (ghIcon4 == null) {
                            bveVarC.v(229700222);
                            ((defpackage.bwc) bveVarC).Y(false);
                            cneVar = null;
                            ghIcon3 = null;
                        } else {
                            bveVarC.v(-1655158301);
                            defpackage.cne cneVarF2 = defpackage.lgo.f(ghIcon4, 0.0f, bveVarC, 3);
                            ((defpackage.bwc) bveVarC).Y(false);
                            ghIcon3 = ghIcon4;
                            cneVar = cneVarF2;
                        }
                        int i11 = i8 | i10 | i9;
                        z7 = false;
                        defpackage.khg.l(cneVar, str, aferVar, cgfVar4, defpackage.ktf.c, false, null, ktlVar, null, null, bveVarC, i11, 0, 7648);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    ((defpackage.bwc) bveVarC).Y(z7);
                    ghIcon4 = ghIcon3;
                    z6 = z5;
                } else {
                    if (ghIcon4 == null) {
                        bveVarC.v(230210762);
                        ((defpackage.bwc) bveVarC).Y(false);
                        throw new java.lang.IllegalArgumentException("Cannot create action button. No icon or label given.");
                    }
                    bveVarC.v(229911488);
                    defpackage.cne cneVarF3 = defpackage.lgo.f(ghIcon4, 0.0f, bveVarC, 3);
                    defpackage.cgf cgfVarM = defpackage.awj.m(cgfVar4, 96.0f);
                    defpackage.ktf ktfVar = defpackage.ktf.c;
                    if (defpackage.lee.a.a().b()) {
                        bveVarC.v(-1655143133);
                        cldVarT = defpackage.khg.t(bveVarC);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else {
                        bveVarC.v(230187077);
                        ((defpackage.bwc) bveVarC).Y(false);
                        cldVarT = null;
                    }
                    z6 = z5;
                    defpackage.khg.s(cneVarF3, aferVar, cgfVarM, ktfVar, false, z6, null, cldVarT, ktlVar, null, null, null, bveVarC, ((i3 << 3) & 112) | 8 | ((i3 >> 3) & 458752) | (234881024 & (i3 << 15)), 0, 7760);
                    bveVarC = bveVarC;
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                z4 = z6;
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                z4 = z2;
                cgfVar3 = cgfVar2;
            }
            ghIcon2 = ghIcon4;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcp(aferVar, str, ghIcon2, ktlVar, z, cgfVar3, z4, i, i2, 0);
            }
        }
        i3 |= 196608;
        cgfVar2 = cgfVar;
        i4 = i2 & 64;
        if (i4 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(z2)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i3 |= i5;
        }
        if (bveVarC.I((599187 & i3) != 599186, i3 & 1)) {
            if (i7 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            z5 = z3 & z2;
            if (str == null) {
                if (ghIcon4 == null) {
                    bveVarC.v(230210762);
                    ((defpackage.bwc) bveVarC).Y(false);
                    throw new java.lang.IllegalArgumentException("Cannot create action button. No icon or label given.");
                }
                bveVarC.v(229911488);
                defpackage.cne cneVarF4 = defpackage.lgo.f(ghIcon4, 0.0f, bveVarC, 3);
                defpackage.cgf cgfVarM2 = defpackage.awj.m(cgfVar4, 96.0f);
                defpackage.ktf ktfVar2 = defpackage.ktf.c;
                if (defpackage.lee.a.a().b()) {
                    bveVarC.v(-1655143133);
                    cldVarT = defpackage.khg.t(bveVarC);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(230187077);
                    ((defpackage.bwc) bveVarC).Y(false);
                    cldVarT = null;
                }
                z6 = z5;
                defpackage.khg.s(cneVarF4, aferVar, cgfVarM2, ktfVar2, false, z6, null, cldVarT, ktlVar, null, null, null, bveVarC, ((i3 << 3) & 112) | 8 | ((i3 >> 3) & 458752) | (234881024 & (i3 << 15)), 0, 7760);
                bveVarC = bveVarC;
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                if (ghIcon4 == null) {
                    bveVarC.v(230210762);
                    ((defpackage.bwc) bveVarC).Y(false);
                    throw new java.lang.IllegalArgumentException("Cannot create action button. No icon or label given.");
                }
                bveVarC.v(229911488);
                defpackage.cne cneVarF5 = defpackage.lgo.f(ghIcon4, 0.0f, bveVarC, 3);
                defpackage.cgf cgfVarM3 = defpackage.awj.m(cgfVar4, 96.0f);
                defpackage.ktf ktfVar3 = defpackage.ktf.c;
                if (defpackage.lee.a.a().b()) {
                    bveVarC.v(-1655143133);
                    cldVarT = defpackage.khg.t(bveVarC);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(230187077);
                    ((defpackage.bwc) bveVarC).Y(false);
                    cldVarT = null;
                }
                z6 = z5;
                defpackage.khg.s(cneVarF5, aferVar, cgfVarM3, ktfVar3, false, z6, null, cldVarT, ktlVar, null, null, null, bveVarC, ((i3 << 3) & 112) | 8 | ((i3 >> 3) & 458752) | (234881024 & (i3 << 15)), 0, 7760);
                bveVarC = bveVarC;
                ((defpackage.bwc) bveVarC).Y(false);
            }
            z4 = z6;
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            z4 = z2;
            cgfVar3 = cgfVar2;
        }
        ghIcon2 = ghIcon4;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mcp(aferVar, str, ghIcon2, ktlVar, z, cgfVar3, z4, i, i2, 0);
        }
    }

    public static final float g(float f) {
        if (!defpackage.lee.a.a().b()) {
            return f;
        }
        float f2 = defpackage.gjr.P1.k;
        return f + f2 + f2 + 0.0f + 0.0f;
    }

    public static final java.lang.Float h(defpackage.bys bysVar) {
        return (java.lang.Float) bysVar.a();
    }

    public static final void i(defpackage.msx msxVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVarK;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1517905627);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(msxVar) : bveVarC.E(msxVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            mst mstVar = msxVar.a;
            defpackage.cgf cgfVar = msxVar.b;
            if (mstVar == null || defpackage.afga.f(mstVar, defpackage.msp.a)) {
                bveVar2 = bveVarC;
                bveVar2.v(-1783952955);
                ((defpackage.bwc) bveVar2).Y(false);
            } else if (defpackage.afga.f(mstVar, defpackage.msq.a)) {
                bveVarC.v(-1581565683);
                if (defpackage.lee.a.a().b()) {
                    bveVarC.v(-1783866868);
                    int i4 = jvq.y;
                    boolean z = msxVar.f;
                    android.os.Bundle bundleB = jug.b();
                    defpackage.cgf cgfVarC = defpackage.awj.c(cgfVar, 1.0f);
                    defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                    java.lang.Object objS = bwcVar.S();
                    java.lang.Object obj = defpackage.bvd.a;
                    if (objS == obj) {
                        objS = ggk.e;
                        bwcVar.ad(objS);
                    }
                    defpackage.cgf cgfVarA = defpackage.kms.a(cgfVarC, (defpackage.afer) objS);
                    boolean z2 = !z;
                    java.lang.Object objS2 = bwcVar.S();
                    if (objS2 == obj) {
                        objS2 = new defpackage.asl();
                        bwcVar.ad(objS2);
                    }
                    bveVar2 = bveVarC;
                    defpackage.ca.at(cgfVarA, null, defpackage.dai.as(-343067436, true, new mtp(z2, bundleB), bveVarC), bveVar2, 3072, 6);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-1783676807);
                    int i5 = jvq.y;
                    android.os.Bundle bundleB2 = jug.b();
                    defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
                    java.lang.Object objS3 = bwcVar2.S();
                    java.lang.Object obj2 = defpackage.bvd.a;
                    if (objS3 == obj2) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dly(0L), defpackage.bxv.c);
                        bwcVar2.ad(parcelableSnapshotMutableState);
                        objS3 = parcelableSnapshotMutableState;
                    }
                    defpackage.bwx bwxVar = (defpackage.bwx) objS3;
                    defpackage.cgf cgfVarC2 = defpackage.awj.c(cgfVar, 1.0f);
                    if (android.os.Build.VERSION.SDK_INT == 34) {
                        bveVarC.v(-944124220);
                        defpackage.cgc cgcVar = defpackage.cgf.e;
                        java.lang.Object objS4 = bwcVar2.S();
                        if (objS4 == obj2) {
                            objS4 = new fxm(bwxVar, 5);
                            bwcVar2.ad(objS4);
                        }
                        cgfVarK = defpackage.ca.K(cgcVar, null, (defpackage.affg) objS4, 1);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(-944010543);
                        bwcVar2.Y(false);
                        cgfVarK = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarA2 = cgfVarC2.a(cgfVarK);
                    java.lang.Object objS5 = bwcVar2.S();
                    if (objS5 == obj2) {
                        objS5 = ggk.f;
                        bwcVar2.ad(objS5);
                    }
                    defpackage.cgf cgfVarA3 = defpackage.kms.a(cgfVarA2, (defpackage.afer) objS5);
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                    int iF = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh = bwcVar2.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA3);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                    bwcVar2.ab(1169735167, new defpackage.dly(((defpackage.dly) bwxVar.a()).a), 0, null);
                    boolean zBl = defpackage.ca.bl(bveVarC);
                    float f = zBl ? 0.0f : 1.0f;
                    int iDN = ((defpackage.dlo) bveVarC.f(defpackage.dbl.d)).dN(1.0f);
                    defpackage.cgc cgcVar2 = defpackage.cgf.e;
                    defpackage.cgf cgfVarC3 = defpackage.awj.c(cgcVar2, 1.0f);
                    boolean zA = bveVarC.A(iDN);
                    java.lang.Object objS6 = bwcVar2.S();
                    if (zA || objS6 == obj2) {
                        objS6 = new mtq(iDN);
                        bwcVar2.ad(objS6);
                    }
                    duf.g(jvq.class, cgfVarC3, duf.f(bveVarC), bundleB2, (defpackage.epx) defpackage.ebn.c(((defpackage.eqg) bveVarC.f(defpackage.esf.a)).getLifecycle(), bveVarC).a(), (defpackage.affc) objS6, bveVarC, 48);
                    bveVar2 = bveVarC;
                    k(f, bveVar2, 0);
                    if (zBl) {
                        bveVar2.v(1903162541);
                        bwcVar2.Y(false);
                    } else {
                        bveVar2.v(1902822347);
                        defpackage.cgf cgfVarC4 = defpackage.awj.c(cgcVar2, 1.0f);
                        long j = defpackage.ksx.j(defpackage.kry.n, bveVar2);
                        defpackage.bcr bcrVar = defpackage.kta.a;
                        defpackage.atp.c(defpackage.afw.D(cgfVarC4, f, j, defpackage.kta.c), bveVar2, 0);
                        bwcVar2.Y(false);
                    }
                    bwcVar2.Y(false);
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                }
                ((defpackage.bwc) bveVar2).Y(false);
            } else {
                bveVar2 = bveVarC;
                if (defpackage.afga.f(mstVar, defpackage.msr.a)) {
                    bveVar2.v(-1581552788);
                    defpackage.mzk.o(cgfVar, defpackage.leh.a.a().f() && !msxVar.c, msxVar.e, null, null, bveVar2, 0);
                    bveVar2 = bveVar2;
                    ((defpackage.bwc) bveVar2).Y(false);
                } else if (defpackage.afga.f(mstVar, mss.a)) {
                    bveVar2.v(-1581545475);
                    nco.c(cgfVar, msxVar.d, bveVar2, 0);
                    ((defpackage.bwc) bveVar2).Y(false);
                } else if (mstVar instanceof mst) {
                    bveVar2.v(-1581541654);
                    ndz.i(mstVar.a, cgfVar, msxVar.d, (neg) null, msxVar.f, bveVar2, 0);
                    bveVar2 = bveVar2;
                    ((defpackage.bwc) bveVar2).Y(false);
                } else if (defpackage.afga.f(mstVar, msu.a)) {
                    bveVar2.v(-1581534092);
                    defpackage.mlv.h(cgfVar, null, bveVar2, 0);
                    ((defpackage.bwc) bveVar2).Y(false);
                } else {
                    if (!defpackage.afga.f(mstVar, msv.a)) {
                        bveVar2.v(-1581568194);
                        ((defpackage.bwc) bveVar2).Y(false);
                        throw new defpackage.afas();
                    }
                    bveVar2.v(-1581532145);
                    defpackage.mvm.t(cgfVar, msxVar.d, bveVar2, 0);
                    ((defpackage.bwc) bveVar2).Y(false);
                }
            }
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(msxVar, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0221  */
    /* JADX WARN: Code duplicated, block: B:104:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:110:0x024f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0260  */
    /* JADX WARN: Code duplicated, block: B:116:0x0276  */
    /* JADX WARN: Code duplicated, block: B:117:0x027e  */
    /* JADX WARN: Code duplicated, block: B:120:0x02af  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x0336  */
    /* JADX WARN: Code duplicated, block: B:127:0x0349  */
    /* JADX WARN: Code duplicated, block: B:128:0x0361  */
    /* JADX WARN: Code duplicated, block: B:131:0x0375  */
    /* JADX WARN: Code duplicated, block: B:137:0x0382  */
    /* JADX WARN: Code duplicated, block: B:140:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x038b  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x016e  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:92:0x0209  */
    /* JADX WARN: Code duplicated, block: B:95:0x0214  */
    public static final void j(final boolean z, final defpackage.muf mufVar, defpackage.cgf cgfVar, boolean z2, defpackage.affh affhVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        defpackage.affh affhVar2;
        int i7;
        int i8;
        boolean z4;
        defpackage.bve bveVar2;
        final boolean z5;
        final defpackage.cgf cgfVar3;
        final defpackage.affh affhVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        boolean z6;
        defpackage.bwc bwcVar;
        final defpackage.bys bysVarM;
        java.lang.Object objS;
        java.lang.Object obj;
        final boolean zBooleanValue;
        java.lang.Object objS2;
        defpackage.bys bysVar;
        java.lang.Object objS3;
        java.lang.Object objS4;
        defpackage.bwx bwxVar;
        java.lang.Boolean boolValueOf;
        int i9;
        boolean z7;
        int i10;
        boolean z8;
        boolean z9;
        java.lang.Object mtsVar;
        java.lang.Boolean bool;
        defpackage.bys bysVar2;
        defpackage.bwx bwxVar2;
        java.lang.Object objS5;
        java.lang.Object objS6;
        float f;
        defpackage.afer aferVar;
        defpackage.cgc cgcVar;
        java.lang.Object objS7;
        boolean z10;
        java.lang.Object objS8;
        defpackage.bwc bwcVar2;
        defpackage.afer aferVar2;
        defpackage.bxl bxlVarJ2;
        mufVar.getClass();
        int i11 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1762683372);
        if (i11 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(mufVar) : bveVarC.E(mufVar)) ? 16 : 32;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != bveVarC.D(z2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bveVarC.I(z4, i8 & 1)) {
                    if (i12 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    z6 = z3 & z2;
                    if (i6 != 0) {
                        affhVar2 = defpackage.msy.a;
                    }
                    if (z6) {
                        bveVarC.v(-1829926199);
                        defpackage.bys bysVarL = defpackage.bxi.l(mufVar.g, bveVarC);
                        defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.awj.t(cgfVar4, null, 3));
                        float f2 = defpackage.mwo.a;
                        defpackage.cgf cgfVarH = defpackage.asq.H(cgfVarR, defpackage.mwo.b);
                        defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        int iF = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh = bwcVar2.ah();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarH);
                        aferVar2 = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                        defpackage.byw.b(bveVarC, defpackage.cwl.g);
                        defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                        affhVar2.invoke(new defpackage.msx((defpackage.msw) bysVarL.a(), defpackage.dai.y(defpackage.awj.d(defpackage.awj.r(defpackage.cgf.e), defpackage.mwo.c), "earth_minimized_card"), z, null, false, true, 24), bveVarC, java.lang.Integer.valueOf(((i8 >> 9) & 112) | 8));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                        bxlVarJ2 = bveVarC.J();
                        if (bxlVarJ2 != null) {
                            bxlVarJ2.c = new mtg(z, mufVar, cgfVar4, affhVar2, i, i2, 0);
                            return;
                        }
                        return;
                    }
                    bveVarC.v(-1829337106);
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.Y(false);
                    bysVarM = defpackage.bxi.m(mufVar.e, defpackage.afce.a, bveVarC);
                    objS = bwcVar.S();
                    obj = defpackage.bvd.a;
                    if (objS == obj) {
                        defpackage.leq.a.a();
                        objS = java.lang.Boolean.valueOf(defpackage.acyc.aD());
                        bwcVar.ad(objS);
                    }
                    zBooleanValue = ((java.lang.Boolean) objS).booleanValue();
                    objS2 = bwcVar.S();
                    if (objS2 == obj) {
                        defpackage.afer aferVar3 = new defpackage.afer() { // from class: mti
                            @Override // defpackage.afer
                            public final java.lang.Object invoke() {
                                boolean z11 = true;
                                if ((!z || zBooleanValue) && defpackage.tna.aq(bysVarM).isEmpty()) {
                                    z11 = false;
                                }
                                return java.lang.Boolean.valueOf(z11);
                            }
                        };
                        defpackage.lam lamVar = defpackage.byp.a;
                        defpackage.bvr bvrVar = new defpackage.bvr(aferVar3, null);
                        bwcVar.ad(bvrVar);
                        objS2 = bvrVar;
                    }
                    bysVar = (defpackage.bys) objS2;
                    objS3 = bwcVar.S();
                    if (objS3 == obj) {
                        objS3 = new defpackage.aft(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                        bwcVar.ad(objS3);
                    }
                    defpackage.aft aftVar = (defpackage.aft) objS3;
                    aftVar.d(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                    objS4 = bwcVar.S();
                    if (objS4 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                        bwcVar.ad(parcelableSnapshotMutableState);
                        objS4 = parcelableSnapshotMutableState;
                    }
                    bwxVar = (defpackage.bwx) objS4;
                    boolValueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue());
                    java.util.List listAq = defpackage.tna.aq(bysVarM);
                    java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z);
                    final defpackage.affh affhVar4 = affhVar2;
                    i9 = i8 & 14;
                    if (i9 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i10 = i8 & 112;
                    if (i10 != 32 || ((i8 & 64) != 0 && bveVarC.E(mufVar))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | z7;
                    java.lang.Object objS9 = bwcVar.S();
                    if (!z9 || objS9 == obj) {
                        bool = boolValueOf;
                        bysVar2 = bysVar;
                        bwxVar2 = bwxVar;
                        mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                        bwcVar.ad(mtsVar);
                    } else {
                        mtsVar = objS9;
                        bysVar2 = bysVar;
                        bwxVar2 = bwxVar;
                        bool = boolValueOf;
                    }
                    defpackage.bvx.e(bool, listAq, boolValueOf2, (defpackage.affg) mtsVar, bveVarC);
                    objS5 = bwcVar.S();
                    if (objS5 == obj) {
                        objS5 = new defpackage.cit();
                        bwcVar.ad(objS5);
                    }
                    final defpackage.cit citVar = (defpackage.cit) objS5;
                    objS6 = bwcVar.S();
                    if (objS6 == obj) {
                        objS6 = new defpackage.cit();
                        bwcVar.ad(objS6);
                    }
                    final defpackage.cit citVar2 = (defpackage.cit) objS6;
                    if (defpackage.lee.a.a().b()) {
                        f = (-defpackage.gjr.P1.k) + 0.0f;
                    } else {
                        f = defpackage.gjr.P2.k;
                    }
                    float f3 = f;
                    defpackage.cgf cgfVarC = defpackage.awj.c(cgfVar4, 1.0f);
                    defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.a, false);
                    int iF2 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh2 = bwcVar.ah();
                    defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarC);
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB2, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                    cgcVar = defpackage.cgf.e;
                    defpackage.bwx bwxVar3 = bwxVar2;
                    final defpackage.bys bysVar3 = bysVar2;
                    defpackage.cgf cgfVar5 = cgfVar4;
                    l(z, aftVar, defpackage.dai.as(-1221133507, true, new defpackage.ggb(mufVar, aftVar, bysVarM, bysVar3, affhVar4, z, citVar, bwxVar3, citVar2, 3), bveVarC), defpackage.dai.as(2072777918, true, new defpackage.affg() { // from class: mtk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj2;
                            int iIntValue = ((java.lang.Integer) obj3).intValue();
                            int i13 = iIntValue & 3;
                            int i14 = 2;
                            if (bveVar3.I(i13 != 2, iIntValue & 1)) {
                                defpackage.bys bysVar4 = bysVar3;
                                boolean z11 = z;
                                defpackage.cit citVar3 = citVar2;
                                defpackage.msw mswVar = (defpackage.msw) defpackage.bxi.l(mufVar.g, bveVar3).a();
                                defpackage.cgf cgfVarQ = defpackage.bzd.q(defpackage.dai.y(defpackage.cgf.e, "bottom_card"), citVar3);
                                boolean zD = bveVar3.D(z11);
                                java.lang.Object objG = bveVar3.g();
                                if (zD || objG == defpackage.bvd.a) {
                                    objG = new defpackage.hes(z11, citVar, bysVar4, i14);
                                    bveVar3.x(objG);
                                }
                                affhVar4.invoke(new defpackage.msx(mswVar, defpackage.fxj.h(cgfVarQ, (defpackage.affc) objG), z11, null, ((java.lang.Boolean) bysVar4.a()).booleanValue(), false, 40), bveVar3, 8);
                            } else {
                                bveVar3.s();
                            }
                            return defpackage.afbk.a;
                        }
                    }, bveVarC), defpackage.awj.c(cgcVar, 1.0f), f3, null, bveVarC, i9 | 28032);
                    bveVar2 = bveVarC;
                    objS7 = bwcVar.S();
                    if (objS7 == obj) {
                        objS7 = java.lang.Boolean.valueOf(defpackage.acyc.at());
                        bwcVar.ad(objS7);
                    }
                    if (((java.lang.Boolean) objS7).booleanValue()) {
                        bveVar2.v(-2047541928);
                        defpackage.mcl.u(defpackage.awj.c(cgcVar, 1.0f), 0, 0, null, bveVar2, 6);
                        bwcVar.Y(false);
                    } else {
                        bveVar2.v(-2047484268);
                        bwcVar.Y(false);
                    }
                    bwcVar.Y(true);
                    if (i10 != 32 || ((i8 & 64) != 0 && bveVar2.E(mufVar))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objS8 = bwcVar.S();
                    if (z10 || objS8 == obj) {
                        objS8 = new defpackage.kyt(mufVar, 2);
                        bwcVar.ad(objS8);
                    }
                    defpackage.kmj.a(null, (defpackage.mnj) objS8, bveVar2, 0, 1);
                    z5 = z6;
                    cgfVar3 = cgfVar5;
                    affhVar3 = affhVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    z5 = z2;
                    cgfVar3 = cgfVar2;
                    affhVar3 = affhVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: mtl
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            boolean z11 = z;
                            int i13 = i | 1;
                            int i14 = 306783378 & i13;
                            int i15 = 613566756 & i13;
                            defpackage.lyd.j(z11, mufVar, cgfVar3, z5, affhVar3, bveVar3, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            affhVar2 = affhVar;
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i8 & 1)) {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z6 = z3 & z2;
                if (i6 != 0) {
                    affhVar2 = defpackage.msy.a;
                }
                if (z6) {
                    bveVarC.v(-1829926199);
                    defpackage.bys bysVarL2 = defpackage.bxi.l(mufVar.g, bveVarC);
                    defpackage.cgf cgfVarR2 = defpackage.awj.r(defpackage.awj.t(cgfVar4, null, 3));
                    float f4 = defpackage.mwo.a;
                    defpackage.cgf cgfVarH2 = defpackage.asq.H(cgfVarR2, defpackage.mwo.b);
                    defpackage.cty ctyVarB3 = defpackage.atp.b(defpackage.cfs.a, false);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    int iF3 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh3 = bwcVar2.ah();
                    defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarH2);
                    aferVar2 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB3, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                    affhVar2.invoke(new defpackage.msx((defpackage.msw) bysVarL2.a(), defpackage.dai.y(defpackage.awj.d(defpackage.awj.r(defpackage.cgf.e), defpackage.mwo.c), "earth_minimized_card"), z, null, false, true, 24), bveVarC, java.lang.Integer.valueOf(((i8 >> 9) & 112) | 8));
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                    bxlVarJ2 = bveVarC.J();
                    if (bxlVarJ2 != null) {
                        bxlVarJ2.c = new mtg(z, mufVar, cgfVar4, affhVar2, i, i2, 0);
                        return;
                    }
                    return;
                }
                bveVarC.v(-1829337106);
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.Y(false);
                bysVarM = defpackage.bxi.m(mufVar.e, defpackage.afce.a, bveVarC);
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    defpackage.leq.a.a();
                    objS = java.lang.Boolean.valueOf(defpackage.acyc.aD());
                    bwcVar.ad(objS);
                }
                zBooleanValue = ((java.lang.Boolean) objS).booleanValue();
                objS2 = bwcVar.S();
                if (objS2 == obj) {
                    defpackage.afer aferVar4 = new defpackage.afer() { // from class: mti
                        @Override // defpackage.afer
                        public final java.lang.Object invoke() {
                            boolean z11 = true;
                            if ((!z || zBooleanValue) && defpackage.tna.aq(bysVarM).isEmpty()) {
                                z11 = false;
                            }
                            return java.lang.Boolean.valueOf(z11);
                        }
                    };
                    defpackage.lam lamVar2 = defpackage.byp.a;
                    defpackage.bvr bvrVar2 = new defpackage.bvr(aferVar4, null);
                    bwcVar.ad(bvrVar2);
                    objS2 = bvrVar2;
                }
                bysVar = (defpackage.bys) objS2;
                objS3 = bwcVar.S();
                if (objS3 == obj) {
                    objS3 = new defpackage.aft(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                    bwcVar.ad(objS3);
                }
                defpackage.aft aftVar2 = (defpackage.aft) objS3;
                aftVar2.d(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                objS4 = bwcVar.S();
                if (objS4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState2);
                    objS4 = parcelableSnapshotMutableState2;
                }
                bwxVar = (defpackage.bwx) objS4;
                boolValueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue());
                java.util.List listAq2 = defpackage.tna.aq(bysVarM);
                java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(z);
                final defpackage.affh affhVar5 = affhVar2;
                i9 = i8 & 14;
                if (i9 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i10 = i8 & 112;
                if (i10 != 32) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                z9 = z8 | z7;
                java.lang.Object objS10 = bwcVar.S();
                if (z9) {
                    bool = boolValueOf;
                    bysVar2 = bysVar;
                    bwxVar2 = bwxVar;
                    mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                    bwcVar.ad(mtsVar);
                } else {
                    bool = boolValueOf;
                    bysVar2 = bysVar;
                    bwxVar2 = bwxVar;
                    mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                    bwcVar.ad(mtsVar);
                }
                defpackage.bvx.e(bool, listAq2, boolValueOf3, (defpackage.affg) mtsVar, bveVarC);
                objS5 = bwcVar.S();
                if (objS5 == obj) {
                    objS5 = new defpackage.cit();
                    bwcVar.ad(objS5);
                }
                final defpackage.cit citVar3 = (defpackage.cit) objS5;
                objS6 = bwcVar.S();
                if (objS6 == obj) {
                    objS6 = new defpackage.cit();
                    bwcVar.ad(objS6);
                }
                final defpackage.cit citVar4 = (defpackage.cit) objS6;
                if (defpackage.lee.a.a().b()) {
                    f = (-defpackage.gjr.P1.k) + 0.0f;
                } else {
                    f = defpackage.gjr.P2.k;
                }
                float f5 = f;
                defpackage.cgf cgfVarC2 = defpackage.awj.c(cgfVar4, 1.0f);
                defpackage.cty ctyVarB4 = defpackage.atp.b(defpackage.cfs.a, false);
                int iF4 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh4 = bwcVar.ah();
                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarC2);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB4, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
                cgcVar = defpackage.cgf.e;
                defpackage.bwx bwxVar4 = bwxVar2;
                final defpackage.bys bysVar4 = bysVar2;
                defpackage.cgf cgfVar6 = cgfVar4;
                l(z, aftVar2, defpackage.dai.as(-1221133507, true, new defpackage.ggb(mufVar, aftVar2, bysVarM, bysVar4, affhVar5, z, citVar3, bwxVar4, citVar4, 3), bveVarC), defpackage.dai.as(2072777918, true, new defpackage.affg() { // from class: mtk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj2;
                        int iIntValue = ((java.lang.Integer) obj3).intValue();
                        int i13 = iIntValue & 3;
                        int i14 = 2;
                        if (bveVar3.I(i13 != 2, iIntValue & 1)) {
                            defpackage.bys bysVar5 = bysVar4;
                            boolean z11 = z;
                            defpackage.cit citVar5 = citVar4;
                            defpackage.msw mswVar = (defpackage.msw) defpackage.bxi.l(mufVar.g, bveVar3).a();
                            defpackage.cgf cgfVarQ = defpackage.bzd.q(defpackage.dai.y(defpackage.cgf.e, "bottom_card"), citVar5);
                            boolean zD = bveVar3.D(z11);
                            java.lang.Object objG = bveVar3.g();
                            if (zD || objG == defpackage.bvd.a) {
                                objG = new defpackage.hes(z11, citVar3, bysVar5, i14);
                                bveVar3.x(objG);
                            }
                            affhVar5.invoke(new defpackage.msx(mswVar, defpackage.fxj.h(cgfVarQ, (defpackage.affc) objG), z11, null, ((java.lang.Boolean) bysVar5.a()).booleanValue(), false, 40), bveVar3, 8);
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVarC), defpackage.awj.c(cgcVar, 1.0f), f5, null, bveVarC, i9 | 28032);
                bveVar2 = bveVarC;
                objS7 = bwcVar.S();
                if (objS7 == obj) {
                    objS7 = java.lang.Boolean.valueOf(defpackage.acyc.at());
                    bwcVar.ad(objS7);
                }
                if (((java.lang.Boolean) objS7).booleanValue()) {
                    bveVar2.v(-2047541928);
                    defpackage.mcl.u(defpackage.awj.c(cgcVar, 1.0f), 0, 0, null, bveVar2, 6);
                    bwcVar.Y(false);
                } else {
                    bveVar2.v(-2047484268);
                    bwcVar.Y(false);
                }
                bwcVar.Y(true);
                if (i10 != 32) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                objS8 = bwcVar.S();
                if (z10) {
                    objS8 = new defpackage.kyt(mufVar, 2);
                    bwcVar.ad(objS8);
                } else {
                    objS8 = new defpackage.kyt(mufVar, 2);
                    bwcVar.ad(objS8);
                }
                defpackage.kmj.a(null, (defpackage.mnj) objS8, bveVar2, 0, 1);
                z5 = z6;
                cgfVar3 = cgfVar6;
                affhVar3 = affhVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                z5 = z2;
                cgfVar3 = cgfVar2;
                affhVar3 = affhVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: mtl
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        boolean z11 = z;
                        int i13 = i | 1;
                        int i14 = 306783378 & i13;
                        int i15 = 613566756 & i13;
                        defpackage.lyd.j(z11, mufVar, cgfVar3, z5, affhVar3, bveVar3, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 384;
        cgfVar2 = cgfVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != bveVarC.D(z2)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i3 |= i5;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i8 & 1)) {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z6 = z3 & z2;
                if (i6 != 0) {
                    affhVar2 = defpackage.msy.a;
                }
                if (z6) {
                    bveVarC.v(-1829926199);
                    defpackage.bys bysVarL3 = defpackage.bxi.l(mufVar.g, bveVarC);
                    defpackage.cgf cgfVarR3 = defpackage.awj.r(defpackage.awj.t(cgfVar4, null, 3));
                    float f6 = defpackage.mwo.a;
                    defpackage.cgf cgfVarH3 = defpackage.asq.H(cgfVarR3, defpackage.mwo.b);
                    defpackage.cty ctyVarB5 = defpackage.atp.b(defpackage.cfs.a, false);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    int iF5 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh5 = bwcVar2.ah();
                    defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarH3);
                    aferVar2 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB5, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh5, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF5), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN5, defpackage.cwl.c);
                    affhVar2.invoke(new defpackage.msx((defpackage.msw) bysVarL3.a(), defpackage.dai.y(defpackage.awj.d(defpackage.awj.r(defpackage.cgf.e), defpackage.mwo.c), "earth_minimized_card"), z, null, false, true, 24), bveVarC, java.lang.Integer.valueOf(((i8 >> 9) & 112) | 8));
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                    bxlVarJ2 = bveVarC.J();
                    if (bxlVarJ2 != null) {
                        bxlVarJ2.c = new mtg(z, mufVar, cgfVar4, affhVar2, i, i2, 0);
                        return;
                    }
                    return;
                }
                bveVarC.v(-1829337106);
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.Y(false);
                bysVarM = defpackage.bxi.m(mufVar.e, defpackage.afce.a, bveVarC);
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    defpackage.leq.a.a();
                    objS = java.lang.Boolean.valueOf(defpackage.acyc.aD());
                    bwcVar.ad(objS);
                }
                zBooleanValue = ((java.lang.Boolean) objS).booleanValue();
                objS2 = bwcVar.S();
                if (objS2 == obj) {
                    defpackage.afer aferVar5 = new defpackage.afer() { // from class: mti
                        @Override // defpackage.afer
                        public final java.lang.Object invoke() {
                            boolean z11 = true;
                            if ((!z || zBooleanValue) && defpackage.tna.aq(bysVarM).isEmpty()) {
                                z11 = false;
                            }
                            return java.lang.Boolean.valueOf(z11);
                        }
                    };
                    defpackage.lam lamVar3 = defpackage.byp.a;
                    defpackage.bvr bvrVar3 = new defpackage.bvr(aferVar5, null);
                    bwcVar.ad(bvrVar3);
                    objS2 = bvrVar3;
                }
                bysVar = (defpackage.bys) objS2;
                objS3 = bwcVar.S();
                if (objS3 == obj) {
                    objS3 = new defpackage.aft(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                    bwcVar.ad(objS3);
                }
                defpackage.aft aftVar3 = (defpackage.aft) objS3;
                aftVar3.d(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                objS4 = bwcVar.S();
                if (objS4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState3);
                    objS4 = parcelableSnapshotMutableState3;
                }
                bwxVar = (defpackage.bwx) objS4;
                boolValueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue());
                java.util.List listAq3 = defpackage.tna.aq(bysVarM);
                java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(z);
                final defpackage.affh affhVar6 = affhVar2;
                i9 = i8 & 14;
                if (i9 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i10 = i8 & 112;
                if (i10 != 32) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                z9 = z8 | z7;
                java.lang.Object objS11 = bwcVar.S();
                if (z9) {
                    bool = boolValueOf;
                    bysVar2 = bysVar;
                    bwxVar2 = bwxVar;
                    mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                    bwcVar.ad(mtsVar);
                } else {
                    bool = boolValueOf;
                    bysVar2 = bysVar;
                    bwxVar2 = bwxVar;
                    mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                    bwcVar.ad(mtsVar);
                }
                defpackage.bvx.e(bool, listAq3, boolValueOf4, (defpackage.affg) mtsVar, bveVarC);
                objS5 = bwcVar.S();
                if (objS5 == obj) {
                    objS5 = new defpackage.cit();
                    bwcVar.ad(objS5);
                }
                final defpackage.cit citVar5 = (defpackage.cit) objS5;
                objS6 = bwcVar.S();
                if (objS6 == obj) {
                    objS6 = new defpackage.cit();
                    bwcVar.ad(objS6);
                }
                final defpackage.cit citVar6 = (defpackage.cit) objS6;
                if (defpackage.lee.a.a().b()) {
                    f = (-defpackage.gjr.P1.k) + 0.0f;
                } else {
                    f = defpackage.gjr.P2.k;
                }
                float f7 = f;
                defpackage.cgf cgfVarC3 = defpackage.awj.c(cgfVar4, 1.0f);
                defpackage.cty ctyVarB6 = defpackage.atp.b(defpackage.cfs.a, false);
                int iF6 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh6 = bwcVar.ah();
                defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarC3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB6, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh6, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF6), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN6, defpackage.cwl.c);
                cgcVar = defpackage.cgf.e;
                defpackage.bwx bwxVar5 = bwxVar2;
                final defpackage.bys bysVar5 = bysVar2;
                defpackage.cgf cgfVar7 = cgfVar4;
                l(z, aftVar3, defpackage.dai.as(-1221133507, true, new defpackage.ggb(mufVar, aftVar3, bysVarM, bysVar5, affhVar6, z, citVar5, bwxVar5, citVar6, 3), bveVarC), defpackage.dai.as(2072777918, true, new defpackage.affg() { // from class: mtk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj2;
                        int iIntValue = ((java.lang.Integer) obj3).intValue();
                        int i13 = iIntValue & 3;
                        int i14 = 2;
                        if (bveVar3.I(i13 != 2, iIntValue & 1)) {
                            defpackage.bys bysVar6 = bysVar5;
                            boolean z11 = z;
                            defpackage.cit citVar7 = citVar6;
                            defpackage.msw mswVar = (defpackage.msw) defpackage.bxi.l(mufVar.g, bveVar3).a();
                            defpackage.cgf cgfVarQ = defpackage.bzd.q(defpackage.dai.y(defpackage.cgf.e, "bottom_card"), citVar7);
                            boolean zD = bveVar3.D(z11);
                            java.lang.Object objG = bveVar3.g();
                            if (zD || objG == defpackage.bvd.a) {
                                objG = new defpackage.hes(z11, citVar5, bysVar6, i14);
                                bveVar3.x(objG);
                            }
                            affhVar6.invoke(new defpackage.msx(mswVar, defpackage.fxj.h(cgfVarQ, (defpackage.affc) objG), z11, null, ((java.lang.Boolean) bysVar6.a()).booleanValue(), false, 40), bveVar3, 8);
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVarC), defpackage.awj.c(cgcVar, 1.0f), f7, null, bveVarC, i9 | 28032);
                bveVar2 = bveVarC;
                objS7 = bwcVar.S();
                if (objS7 == obj) {
                    objS7 = java.lang.Boolean.valueOf(defpackage.acyc.at());
                    bwcVar.ad(objS7);
                }
                if (((java.lang.Boolean) objS7).booleanValue()) {
                    bveVar2.v(-2047541928);
                    defpackage.mcl.u(defpackage.awj.c(cgcVar, 1.0f), 0, 0, null, bveVar2, 6);
                    bwcVar.Y(false);
                } else {
                    bveVar2.v(-2047484268);
                    bwcVar.Y(false);
                }
                bwcVar.Y(true);
                if (i10 != 32) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                objS8 = bwcVar.S();
                if (z10) {
                    objS8 = new defpackage.kyt(mufVar, 2);
                    bwcVar.ad(objS8);
                } else {
                    objS8 = new defpackage.kyt(mufVar, 2);
                    bwcVar.ad(objS8);
                }
                defpackage.kmj.a(null, (defpackage.mnj) objS8, bveVar2, 0, 1);
                z5 = z6;
                cgfVar3 = cgfVar7;
                affhVar3 = affhVar6;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                z5 = z2;
                cgfVar3 = cgfVar2;
                affhVar3 = affhVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: mtl
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        boolean z11 = z;
                        int i13 = i | 1;
                        int i14 = 306783378 & i13;
                        int i15 = 613566756 & i13;
                        defpackage.lyd.j(z11, mufVar, cgfVar3, z5, affhVar3, bveVar3, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 24576;
        affhVar2 = affhVar;
        i8 = i3;
        if ((i8 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bveVarC.I(z4, i8 & 1)) {
            if (i12 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            z6 = z3 & z2;
            if (i6 != 0) {
                affhVar2 = defpackage.msy.a;
            }
            if (z6) {
                bveVarC.v(-1829926199);
                defpackage.bys bysVarL4 = defpackage.bxi.l(mufVar.g, bveVarC);
                defpackage.cgf cgfVarR4 = defpackage.awj.r(defpackage.awj.t(cgfVar4, null, 3));
                float f8 = defpackage.mwo.a;
                defpackage.cgf cgfVarH4 = defpackage.asq.H(cgfVarR4, defpackage.mwo.b);
                defpackage.cty ctyVarB7 = defpackage.atp.b(defpackage.cfs.a, false);
                bwcVar2 = (defpackage.bwc) bveVarC;
                int iF7 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh7 = bwcVar2.ah();
                defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarH4);
                aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB7, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh7, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF7), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN7, defpackage.cwl.c);
                affhVar2.invoke(new defpackage.msx((defpackage.msw) bysVarL4.a(), defpackage.dai.y(defpackage.awj.d(defpackage.awj.r(defpackage.cgf.e), defpackage.mwo.c), "earth_minimized_card"), z, null, false, true, 24), bveVarC, java.lang.Integer.valueOf(((i8 >> 9) & 112) | 8));
                bwcVar2.Y(true);
                bwcVar2.Y(false);
                bxlVarJ2 = bveVarC.J();
                if (bxlVarJ2 != null) {
                    bxlVarJ2.c = new mtg(z, mufVar, cgfVar4, affhVar2, i, i2, 0);
                    return;
                }
                return;
            }
            bveVarC.v(-1829337106);
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.Y(false);
            bysVarM = defpackage.bxi.m(mufVar.e, defpackage.afce.a, bveVarC);
            objS = bwcVar.S();
            obj = defpackage.bvd.a;
            if (objS == obj) {
                defpackage.leq.a.a();
                objS = java.lang.Boolean.valueOf(defpackage.acyc.aD());
                bwcVar.ad(objS);
            }
            zBooleanValue = ((java.lang.Boolean) objS).booleanValue();
            objS2 = bwcVar.S();
            if (objS2 == obj) {
                defpackage.afer aferVar6 = new defpackage.afer() { // from class: mti
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z11 = true;
                        if ((!z || zBooleanValue) && defpackage.tna.aq(bysVarM).isEmpty()) {
                            z11 = false;
                        }
                        return java.lang.Boolean.valueOf(z11);
                    }
                };
                defpackage.lam lamVar4 = defpackage.byp.a;
                defpackage.bvr bvrVar4 = new defpackage.bvr(aferVar6, null);
                bwcVar.ad(bvrVar4);
                objS2 = bvrVar4;
            }
            bysVar = (defpackage.bys) objS2;
            objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = new defpackage.aft(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
                bwcVar.ad(objS3);
            }
            defpackage.aft aftVar4 = (defpackage.aft) objS3;
            aftVar4.d(java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue()));
            objS4 = bwcVar.S();
            if (objS4 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState4);
                objS4 = parcelableSnapshotMutableState4;
            }
            bwxVar = (defpackage.bwx) objS4;
            boolValueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue());
            java.util.List listAq4 = defpackage.tna.aq(bysVarM);
            java.lang.Boolean boolValueOf5 = java.lang.Boolean.valueOf(z);
            final defpackage.affh affhVar7 = affhVar2;
            i9 = i8 & 14;
            if (i9 == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            i10 = i8 & 112;
            if (i10 != 32) {
                z8 = true;
            } else {
                z8 = true;
            }
            z9 = z8 | z7;
            java.lang.Object objS12 = bwcVar.S();
            if (z9) {
                bool = boolValueOf;
                bysVar2 = bysVar;
                bwxVar2 = bwxVar;
                mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                bwcVar.ad(mtsVar);
            } else {
                bool = boolValueOf;
                bysVar2 = bysVar;
                bwxVar2 = bwxVar;
                mtsVar = new defpackage.mts(z, mufVar, bysVar2, bwxVar2, null);
                bwcVar.ad(mtsVar);
            }
            defpackage.bvx.e(bool, listAq4, boolValueOf5, (defpackage.affg) mtsVar, bveVarC);
            objS5 = bwcVar.S();
            if (objS5 == obj) {
                objS5 = new defpackage.cit();
                bwcVar.ad(objS5);
            }
            final defpackage.cit citVar7 = (defpackage.cit) objS5;
            objS6 = bwcVar.S();
            if (objS6 == obj) {
                objS6 = new defpackage.cit();
                bwcVar.ad(objS6);
            }
            final defpackage.cit citVar8 = (defpackage.cit) objS6;
            if (defpackage.lee.a.a().b()) {
                f = (-defpackage.gjr.P1.k) + 0.0f;
            } else {
                f = defpackage.gjr.P2.k;
            }
            float f9 = f;
            defpackage.cgf cgfVarC4 = defpackage.awj.c(cgfVar4, 1.0f);
            defpackage.cty ctyVarB8 = defpackage.atp.b(defpackage.cfs.a, false);
            int iF8 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh8 = bwcVar.ah();
            defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarC4);
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB8, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh8, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF8), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN8, defpackage.cwl.c);
            cgcVar = defpackage.cgf.e;
            defpackage.bwx bwxVar6 = bwxVar2;
            final defpackage.bys bysVar6 = bysVar2;
            defpackage.cgf cgfVar8 = cgfVar4;
            l(z, aftVar4, defpackage.dai.as(-1221133507, true, new defpackage.ggb(mufVar, aftVar4, bysVarM, bysVar6, affhVar7, z, citVar7, bwxVar6, citVar8, 3), bveVarC), defpackage.dai.as(2072777918, true, new defpackage.affg() { // from class: mtk
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i13 = iIntValue & 3;
                    int i14 = 2;
                    if (bveVar3.I(i13 != 2, iIntValue & 1)) {
                        defpackage.bys bysVar7 = bysVar6;
                        boolean z11 = z;
                        defpackage.cit citVar9 = citVar8;
                        defpackage.msw mswVar = (defpackage.msw) defpackage.bxi.l(mufVar.g, bveVar3).a();
                        defpackage.cgf cgfVarQ = defpackage.bzd.q(defpackage.dai.y(defpackage.cgf.e, "bottom_card"), citVar9);
                        boolean zD = bveVar3.D(z11);
                        java.lang.Object objG = bveVar3.g();
                        if (zD || objG == defpackage.bvd.a) {
                            objG = new defpackage.hes(z11, citVar7, bysVar7, i14);
                            bveVar3.x(objG);
                        }
                        affhVar7.invoke(new defpackage.msx(mswVar, defpackage.fxj.h(cgfVarQ, (defpackage.affc) objG), z11, null, ((java.lang.Boolean) bysVar7.a()).booleanValue(), false, 40), bveVar3, 8);
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), defpackage.awj.c(cgcVar, 1.0f), f9, null, bveVarC, i9 | 28032);
            bveVar2 = bveVarC;
            objS7 = bwcVar.S();
            if (objS7 == obj) {
                objS7 = java.lang.Boolean.valueOf(defpackage.acyc.at());
                bwcVar.ad(objS7);
            }
            if (((java.lang.Boolean) objS7).booleanValue()) {
                bveVar2.v(-2047541928);
                defpackage.mcl.u(defpackage.awj.c(cgcVar, 1.0f), 0, 0, null, bveVar2, 6);
                bwcVar.Y(false);
            } else {
                bveVar2.v(-2047484268);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
            if (i10 != 32) {
                z10 = true;
            } else {
                z10 = true;
            }
            objS8 = bwcVar.S();
            if (z10) {
                objS8 = new defpackage.kyt(mufVar, 2);
                bwcVar.ad(objS8);
            } else {
                objS8 = new defpackage.kyt(mufVar, 2);
                bwcVar.ad(objS8);
            }
            defpackage.kmj.a(null, (defpackage.mnj) objS8, bveVar2, 0, 1);
            z5 = z6;
            cgfVar3 = cgfVar8;
            affhVar3 = affhVar7;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z5 = z2;
            cgfVar3 = cgfVar2;
            affhVar3 = affhVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: mtl
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    boolean z11 = z;
                    int i13 = i | 1;
                    int i14 = 306783378 & i13;
                    int i15 = 613566756 & i13;
                    defpackage.lyd.j(z11, mufVar, cgfVar3, z5, affhVar3, bveVar3, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void k(float f, defpackage.bve bveVar, int i) {
        int i2;
        long jK;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-21248746);
        if (i3 == 0) {
            i2 = (true != bveVarC.z(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
            if (defpackage.lem.a.a().b()) {
                bveVarC.v(-1661048385);
                jK = defpackage.ksx.j(defpackage.kry.o, bveVarC);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(-1660997948);
                jK = defpackage.ksx.k(defpackage.krz.a, bveVarC);
                ((defpackage.bwc) bveVarC).Y(false);
            }
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
            boolean zC = bveVarC.C(dloVar) | ((i2 & 14) == 4) | bveVarC.B(jK);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new mth(dloVar, f, jK);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVarC, (defpackage.affc) objS, bveVarC, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nap(f, i, 1);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void l(boolean r19, defpackage.aft r20, defpackage.affg r21, defpackage.affg r22, defpackage.cgf r23, float r24, defpackage.affg r25, defpackage.bve r26, int r27) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyd.l(boolean, aft, affg, affg, cgf, float, affg, bve, int):void");
    }

    public static final android.os.Bundle m(boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("IS_HORIZONTAL", z);
        return bundle;
    }

    public static defpackage.oyk n() {
        return (defpackage.oyk) defpackage.mkp.a.i(defpackage.oyk.class);
    }

    public static final nuv o(java.util.List list, defpackage.nve nveVar) {
        java.lang.Object next;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            nvh nvhVar = ((nuv) next).c;
            if (nvhVar.l && nvhVar.x == nveVar) {
                return (nuv) next;
            }
        }
        next = null;
        return (nuv) next;
    }

    public static final boolean p(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final boolean q(java.util.List list, int i) {
        if (list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((defpackage.nvt) it.next()).b == i) {
                return true;
            }
        }
        return false;
    }

    public static defpackage.ntk r() {
        return (defpackage.ntk) defpackage.mkp.a.i(defpackage.ntk.class);
    }

    public static /* synthetic */ boolean s(com.google.android.gms.car.display.CarDisplayNativeUiElement carDisplayNativeUiElement) {
        return carDisplayNativeUiElement.a != null;
    }

    public static final void t(defpackage.cgf cgfVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(487608329);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(aferVar2) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.ksz.a(defpackage.ksx.f(bveVarC), null, false, null, defpackage.dai.as(512904545, true, new nln(cgfVar, aferVar, aferVar2, 2), bveVarC), bveVarC, 24576, 14);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kld(cgfVar, aferVar, aferVar2, i, 15, (char[]) null);
        }
    }

    public static final npk u(int i) {
        java.lang.Object next;
        defpackage.afbo afboVar = new defpackage.afbo((defpackage.afbr) npk.i);
        do {
            if (!afboVar.hasNext()) {
                next = null;
                break;
            }
            next = afboVar.next();
        } while (((npk) next).j != i);
        npk npkVar = (npk) next;
        if (npkVar != null) {
            return npkVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bo(i, "Unexpected fan direction value: "));
    }

    public static /* synthetic */ nqm v(int i) {
        nqm nqmVar = nqm.a;
        if (i == nqmVar.c) {
            return nqmVar;
        }
        nqm nqmVar2 = nqm.b;
        if (i == nqmVar2.c) {
            return nqmVar2;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bo(i, "Unexpected temperature display unit value: "));
    }

    public static final long w(defpackage.bwx bwxVar) {
        return ((defpackage.dly) bwxVar.a()).a;
    }

    public static final boolean x() {
        return defpackage.acyc.B() == ((long) defpackage.zbd.Dc.a());
    }

    public static final defpackage.cgf y(defpackage.cgf cgfVar, defpackage.cld cldVar, defpackage.bve bveVar) {
        cgfVar.getClass();
        cldVar.getClass();
        bveVar.v(-1553871329);
        if (x()) {
            java.lang.Object objG = bveVar.g();
            java.lang.Object obj = defpackage.bvd.a;
            if (objG == obj) {
                java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dly(0L), defpackage.bxv.c);
                bveVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objG;
            java.lang.Object objG2 = bveVar.g();
            if (objG2 == obj) {
                objG2 = new noh(bwxVar, 16);
                bveVar.x(objG2);
            }
            defpackage.cgf cgfVarD = defpackage.ty.d(cgfVar, (defpackage.affc) objG2);
            if (!defpackage.a.i(A(bwxVar), 0L)) {
                defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
                float fDG = dloVar.dG((int) (A(bwxVar) >> 32));
                float fDG2 = dloVar.dG((int) (A(bwxVar) & 4294967295L));
                defpackage.bcr bcrVar = (defpackage.bcr) cldVar;
                long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits((int) (A(bwxVar) >> 32))) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits((int) (A(bwxVar) & 4294967295L))));
                float fA = bcrVar.a.a(jFloatToRawIntBits, dloVar);
                float[] fArrF = xue.f(dloVar.dF(bcrVar.c.a(jFloatToRawIntBits, dloVar)), dloVar.dF(bcrVar.b.a(jFloatToRawIntBits, dloVar)), dloVar.dF(bcrVar.d.a(jFloatToRawIntBits, dloVar)), dloVar.dF(fA));
                int i = defpackage.cjv.i(defpackage.kfp.i(bveVar).A());
                java.lang.Object objG3 = bveVar.g();
                if (objG3 == obj) {
                    java.lang.Object parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(xrq.c, defpackage.bxv.c);
                    bveVar.x(parcelableSnapshotMutableState2);
                    objG3 = parcelableSnapshotMutableState2;
                }
                defpackage.bwx bwxVar2 = (defpackage.bwx) objG3;
                boolean z = bveVar.z(fDG) | bveVar.z(fDG2) | bveVar.C(fArrF) | bveVar.A(i);
                java.lang.Object objG4 = bveVar.g();
                if (z || objG4 == obj) {
                    objG4 = new npe(fDG, fDG2, fArrF, i);
                    bveVar.x(objG4);
                }
                npe npeVar = (npe) objG4;
                boolean zC = bveVar.C(npeVar);
                java.lang.Object objG5 = bveVar.g();
                if (zC || objG5 == obj) {
                    objG5 = npeVar.j();
                    bveVar.x(objG5);
                }
                java.util.Map map = (java.util.Map) objG5;
                xrr xrrVarI = npeVar.i();
                xrq xrqVar = (xrq) bwxVar2.a();
                java.lang.Object objG6 = bveVar.g();
                if (objG6 == obj) {
                    objG6 = new nee(bwxVar2, 11);
                    bveVar.x(objG6);
                }
                defpackage.cgf cgfVarM = defpackage.wpu.M(cgfVarD, xrrVarI, xrqVar, map, (defpackage.affg) objG6, hh$.ExternalSyntheticApiModelOutline0.m((android.content.Context) bveVar.f(defpackage.daj.b)), npeVar.i(), 960);
                bveVar.o();
                return cgfVarM;
            }
            cgfVar = cgfVarD;
        }
        bveVar.o();
        return cgfVar;
    }

    public static final defpackage.cgf z(defpackage.cgf cgfVar, defpackage.bve bveVar) {
        defpackage.cgf cgfVarD;
        cgfVar.getClass();
        bveVar.v(167718904);
        if (x()) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dly(0L), defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new noh(bwxVar, 15);
                bwcVar.ad(objS2);
            }
            cgfVarD = defpackage.ty.d(cgfVar, (defpackage.affc) objS2);
            if (!defpackage.a.i(B(bwxVar), 0L)) {
                defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
                float fDG = dloVar.dG((int) (B(bwxVar) >> 32));
                float fDG2 = dloVar.dG((int) (B(bwxVar) & 4294967295L));
                int i = defpackage.cjv.i(defpackage.kfp.i(bveVar).A());
                int i2 = defpackage.cjv.i(defpackage.kfp.i(bveVar).O());
                boolean z = bveVar.z(fDG) | bveVar.z(fDG2) | bveVar.A(i2) | bveVar.A(i);
                java.lang.Object objS3 = bwcVar.S();
                if (z || objS3 == obj) {
                    objS3 = new npf(fDG, fDG2, i2, i);
                    bwcVar.ad(objS3);
                }
                npf npfVar = (npf) objS3;
                java.lang.Object objS4 = bwcVar.S();
                if (objS4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(xrq.c, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState2);
                    objS4 = parcelableSnapshotMutableState2;
                }
                defpackage.bwx bwxVar2 = (defpackage.bwx) objS4;
                boolean zC = bveVar.C(npfVar);
                java.lang.Object objS5 = bwcVar.S();
                if (zC || objS5 == obj) {
                    objS5 = npfVar.j();
                    bwcVar.ad(objS5);
                }
                java.util.Map map = (java.util.Map) objS5;
                xrr xrrVarF = npfVar.f();
                xrq xrqVar = (xrq) bwxVar2.a();
                java.lang.Object objS6 = bwcVar.S();
                if (objS6 == obj) {
                    objS6 = new nee(bwxVar2, 10);
                    bwcVar.ad(objS6);
                }
                defpackage.cgf cgfVarM = defpackage.wpu.M(cgfVarD, xrrVarF, xrqVar, map, (defpackage.affg) objS6, hh$.ExternalSyntheticApiModelOutline0.m((android.content.Context) bveVar.f(defpackage.daj.b)), null, 992);
                bwcVar.Y(false);
                return cgfVarM;
            }
        } else {
            cgfVarD = cgfVar;
        }
        ((defpackage.bwc) bveVar).Y(false);
        return cgfVarD;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public final void e(java.lang.String str, defpackage.cgf cgfVar, boolean z, java.lang.String str2, defpackage.dgd dgdVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        java.lang.String str3;
        int i7;
        defpackage.dgd dgdVar2;
        boolean z3;
        defpackage.cgf cgfVar3;
        java.lang.String str4;
        defpackage.dgd dgdVar3;
        boolean z4;
        defpackage.bxl bxlVarJ;
        int i8;
        defpackage.bwc bwcVar;
        int i9;
        defpackage.dgd dgdVar4;
        java.lang.String str5;
        defpackage.afer aferVar;
        defpackage.cgc cgcVar;
        int i10;
        int i11;
        boolean z5 = z;
        str.getClass();
        int i12 = i & 6;
        defpackage.bve bveVarC = bveVar.c(320881143);
        if (i12 == 0) {
            i3 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != bveVarC.D(z5)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    str3 = str2;
                    if (true != bveVarC.C(str3)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    i11 = 8192;
                    if ((i2 & 16) == 0) {
                        dgdVar2 = dgdVar;
                        if (bveVarC.C(dgdVar2)) {
                            i11 = 16384;
                        }
                    } else {
                        dgdVar2 = dgdVar;
                    }
                    i3 |= i11;
                } else {
                    dgdVar2 = dgdVar;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    i8 = i2 & 16;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i13 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        z5 &= z2;
                        if (i6 != 0) {
                            str3 = null;
                        }
                        if (i8 != 0) {
                            dgdVar4 = defpackage.bxi.p(bveVarC).d;
                            i9 = i3 & (-57345);
                            str5 = str3;
                        } else {
                            i9 = i3;
                        }
                        bveVarC.l();
                        defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                        int iF = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh = bwcVar.ah();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar3);
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                        defpackage.byw.b(bveVarC, defpackage.cwl.g);
                        defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                        defpackage.awe aweVar = defpackage.awe.a;
                        cgcVar = defpackage.cgf.e;
                        i10 = ((i9 << 9) & 29360128) | 24960;
                        defpackage.brv.b(str, aweVar.b(cgcVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, i9 & 14, i10, 110588);
                        bveVarC = bveVarC;
                        if (str5 != null) {
                            bveVarC.v(522048234);
                            defpackage.brv.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, (i9 >> 9) & 14, i10, 110590);
                            bwcVar.Y(false);
                        } else {
                            bveVarC.v(522145295);
                            bwcVar.Y(false);
                        }
                        if (z5) {
                            bveVarC = bveVarC;
                            bveVarC.v(522181968);
                            defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                            defpackage.boh.a(defpackage.day.h(2131233167, bveVarC, 0), null, defpackage.awj.i(cgcVar, 24.0f), defpackage.kfp.i(bveVarC).b(), bveVarC, 440, 0);
                            bwcVar.Y(false);
                        } else {
                            bveVarC = bveVarC;
                            bveVarC.v(522457775);
                            bwcVar.Y(false);
                        }
                        bwcVar.Y(true);
                        str4 = str5;
                        dgdVar3 = dgdVar4;
                    } else {
                        bveVarC.s();
                        if (i8 != 0) {
                            i3 &= -57345;
                        }
                        i9 = i3;
                        cgfVar3 = cgfVar2;
                    }
                    str5 = str3;
                    dgdVar4 = dgdVar2;
                    bveVarC.l();
                    defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                    int iF2 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh2 = bwcVar.ah();
                    defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVar3);
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                    defpackage.awe aweVar2 = defpackage.awe.a;
                    cgcVar = defpackage.cgf.e;
                    i10 = ((i9 << 9) & 29360128) | 24960;
                    defpackage.brv.b(str, aweVar2.b(cgcVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, i9 & 14, i10, 110588);
                    bveVarC = bveVarC;
                    if (str5 != null) {
                        bveVarC.v(522048234);
                        defpackage.brv.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, (i9 >> 9) & 14, i10, 110590);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(522145295);
                        bwcVar.Y(false);
                    }
                    if (z5) {
                        bveVarC = bveVarC;
                        bveVarC.v(522181968);
                        defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                        defpackage.boh.a(defpackage.day.h(2131233167, bveVarC, 0), null, defpackage.awj.i(cgcVar, 24.0f), defpackage.kfp.i(bveVarC).b(), bveVarC, 440, 0);
                        bwcVar.Y(false);
                    } else {
                        bveVarC = bveVarC;
                        bveVarC.v(522457775);
                        bwcVar.Y(false);
                    }
                    bwcVar.Y(true);
                    str4 = str5;
                    dgdVar3 = dgdVar4;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    str4 = str3;
                    dgdVar3 = dgdVar2;
                }
                z4 = z5;
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new gqo(this, str, cgfVar3, z4, str4, dgdVar3, i, i2, 2);
                }
            }
            i3 |= 3072;
            str3 = str2;
            if ((i & 24576) == 0) {
                i11 = 8192;
                if ((i2 & 16) == 0) {
                    dgdVar2 = dgdVar;
                    if (bveVarC.C(dgdVar2)) {
                        i11 = 16384;
                    }
                } else {
                    dgdVar2 = dgdVar;
                }
                i3 |= i11;
            } else {
                dgdVar2 = dgdVar;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                i8 = i2 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    z5 &= z2;
                    if (i6 != 0) {
                        str3 = null;
                    }
                    if (i8 != 0) {
                        dgdVar4 = defpackage.bxi.p(bveVarC).d;
                        i9 = i3 & (-57345);
                        str5 = str3;
                    } else {
                        i9 = i3;
                        str5 = str3;
                        dgdVar4 = dgdVar2;
                    }
                } else {
                    if (i13 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    z5 &= z2;
                    if (i6 != 0) {
                        str3 = null;
                    }
                    if (i8 != 0) {
                        dgdVar4 = defpackage.bxi.p(bveVarC).d;
                        i9 = i3 & (-57345);
                        str5 = str3;
                    } else {
                        i9 = i3;
                        str5 = str3;
                        dgdVar4 = dgdVar2;
                    }
                }
                bveVarC.l();
                defpackage.cty ctyVarA3 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVar3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA3, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                defpackage.awe aweVar3 = defpackage.awe.a;
                cgcVar = defpackage.cgf.e;
                i10 = ((i9 << 9) & 29360128) | 24960;
                defpackage.brv.b(str, aweVar3.b(cgcVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, i9 & 14, i10, 110588);
                bveVarC = bveVarC;
                if (str5 != null) {
                    bveVarC.v(522048234);
                    defpackage.brv.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, (i9 >> 9) & 14, i10, 110590);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(522145295);
                    bwcVar.Y(false);
                }
                if (z5) {
                    bveVarC = bveVarC;
                    bveVarC.v(522181968);
                    defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                    defpackage.boh.a(defpackage.day.h(2131233167, bveVarC, 0), null, defpackage.awj.i(cgcVar, 24.0f), defpackage.kfp.i(bveVarC).b(), bveVarC, 440, 0);
                    bwcVar.Y(false);
                } else {
                    bveVarC = bveVarC;
                    bveVarC.v(522457775);
                    bwcVar.Y(false);
                }
                bwcVar.Y(true);
                str4 = str5;
                dgdVar3 = dgdVar4;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                str4 = str3;
                dgdVar3 = dgdVar2;
            }
            z4 = z5;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gqo(this, str, cgfVar3, z4, str4, dgdVar3, i, i2, 2);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != bveVarC.D(z5)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                str3 = str2;
                if (true != bveVarC.C(str3)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                i11 = 8192;
                if ((i2 & 16) == 0) {
                    dgdVar2 = dgdVar;
                    if (bveVarC.C(dgdVar2)) {
                        i11 = 16384;
                    }
                } else {
                    dgdVar2 = dgdVar;
                }
                i3 |= i11;
            } else {
                dgdVar2 = dgdVar;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                i8 = i2 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    z5 &= z2;
                    if (i6 != 0) {
                        str3 = null;
                    }
                    if (i8 != 0) {
                        dgdVar4 = defpackage.bxi.p(bveVarC).d;
                        i9 = i3 & (-57345);
                        str5 = str3;
                    } else {
                        i9 = i3;
                        str5 = str3;
                        dgdVar4 = dgdVar2;
                    }
                } else {
                    if (i13 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    z5 &= z2;
                    if (i6 != 0) {
                        str3 = null;
                    }
                    if (i8 != 0) {
                        dgdVar4 = defpackage.bxi.p(bveVarC).d;
                        i9 = i3 & (-57345);
                        str5 = str3;
                    } else {
                        i9 = i3;
                        str5 = str3;
                        dgdVar4 = dgdVar2;
                    }
                }
                bveVarC.l();
                defpackage.cty ctyVarA4 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                int iF4 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh4 = bwcVar.ah();
                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVar3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA4, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
                defpackage.awe aweVar4 = defpackage.awe.a;
                cgcVar = defpackage.cgf.e;
                i10 = ((i9 << 9) & 29360128) | 24960;
                defpackage.brv.b(str, aweVar4.b(cgcVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, i9 & 14, i10, 110588);
                bveVarC = bveVarC;
                if (str5 != null) {
                    bveVarC.v(522048234);
                    defpackage.brv.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, (i9 >> 9) & 14, i10, 110590);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(522145295);
                    bwcVar.Y(false);
                }
                if (z5) {
                    bveVarC = bveVarC;
                    bveVarC.v(522181968);
                    defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                    defpackage.boh.a(defpackage.day.h(2131233167, bveVarC, 0), null, defpackage.awj.i(cgcVar, 24.0f), defpackage.kfp.i(bveVarC).b(), bveVarC, 440, 0);
                    bwcVar.Y(false);
                } else {
                    bveVarC = bveVarC;
                    bveVarC.v(522457775);
                    bwcVar.Y(false);
                }
                bwcVar.Y(true);
                str4 = str5;
                dgdVar3 = dgdVar4;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                str4 = str3;
                dgdVar3 = dgdVar2;
            }
            z4 = z5;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gqo(this, str, cgfVar3, z4, str4, dgdVar3, i, i2, 2);
            }
        }
        i3 |= 3072;
        str3 = str2;
        if ((i & 24576) == 0) {
            i11 = 8192;
            if ((i2 & 16) == 0) {
                dgdVar2 = dgdVar;
                if (bveVarC.C(dgdVar2)) {
                    i11 = 16384;
                }
            } else {
                dgdVar2 = dgdVar;
            }
            i3 |= i11;
        } else {
            dgdVar2 = dgdVar;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            i8 = i2 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                z5 &= z2;
                if (i6 != 0) {
                    str3 = null;
                }
                if (i8 != 0) {
                    dgdVar4 = defpackage.bxi.p(bveVarC).d;
                    i9 = i3 & (-57345);
                    str5 = str3;
                } else {
                    i9 = i3;
                    str5 = str3;
                    dgdVar4 = dgdVar2;
                }
            } else {
                if (i13 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                z5 &= z2;
                if (i6 != 0) {
                    str3 = null;
                }
                if (i8 != 0) {
                    dgdVar4 = defpackage.bxi.p(bveVarC).d;
                    i9 = i3 & (-57345);
                    str5 = str3;
                } else {
                    i9 = i3;
                    str5 = str3;
                    dgdVar4 = dgdVar2;
                }
            }
            bveVarC.l();
            defpackage.cty ctyVarA5 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            int iF5 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh5 = bwcVar.ah();
            defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVar3);
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA5, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh5, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF5), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN5, defpackage.cwl.c);
            defpackage.awe aweVar5 = defpackage.awe.a;
            cgcVar = defpackage.cgf.e;
            i10 = ((i9 << 9) & 29360128) | 24960;
            defpackage.brv.b(str, aweVar5.b(cgcVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, i9 & 14, i10, 110588);
            bveVarC = bveVarC;
            if (str5 != null) {
                bveVarC.v(522048234);
                defpackage.brv.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVar4, bveVarC, (i9 >> 9) & 14, i10, 110590);
                bwcVar.Y(false);
            } else {
                bveVarC.v(522145295);
                bwcVar.Y(false);
            }
            if (z5) {
                bveVarC = bveVarC;
                bveVarC.v(522181968);
                defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                defpackage.boh.a(defpackage.day.h(2131233167, bveVarC, 0), null, defpackage.awj.i(cgcVar, 24.0f), defpackage.kfp.i(bveVarC).b(), bveVarC, 440, 0);
                bwcVar.Y(false);
            } else {
                bveVarC = bveVarC;
                bveVarC.v(522457775);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
            str4 = str5;
            dgdVar3 = dgdVar4;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            str4 = str3;
            dgdVar3 = dgdVar2;
        }
        z4 = z5;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gqo(this, str, cgfVar3, z4, str4, dgdVar3, i, i2, 2);
        }
    }

    public final void f(java.lang.String str, defpackage.cgf cgfVar, boolean z, defpackage.dgd dgdVar, defpackage.bve bveVar, int i) {
        java.lang.String str2;
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.dgd dgdVar2;
        defpackage.dgd dgdVar3;
        str.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-747255059);
        if (i3 == 0) {
            str2 = str;
            i2 = (true != bveVarC.C(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.D(z) ? 128 : 256;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 = i4 | 11264;
        }
        if (bveVarC.I((i5 & 9363) != 9362, i5 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                cgfVar2 = defpackage.cgf.e;
                dgdVar3 = defpackage.bxi.p(bveVarC).e;
            } else {
                bveVarC.s();
                cgfVar2 = cgfVar;
                dgdVar3 = dgdVar;
            }
            bveVarC.l();
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar2);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.awe aweVar = defpackage.awe.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.brv.b(str2, aweVar.b(cgcVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 0, false, 2, 0, dgdVar3, bveVarC, i5 & 14, 24576, 114684);
            bveVarC = bveVarC;
            bveVarC.v(-932896175);
            bwcVar.Y(false);
            if (z) {
                bveVarC.v(-932859502);
                defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                defpackage.boh.a(defpackage.day.h(2131233167, bveVarC, 0), null, defpackage.awj.i(cgcVar, 24.0f), defpackage.kfp.i(bveVarC).b(), bveVarC, 440, 0);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-932583695);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
            dgdVar2 = dgdVar3;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            dgdVar2 = dgdVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mco(this, str, cgfVar2, z, dgdVar2, i, 0);
        }
    }
}
