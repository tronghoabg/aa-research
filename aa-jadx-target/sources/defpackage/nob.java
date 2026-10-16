package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nob {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.aez b = new defpackage.aeu(0.18f, 0.89f, 0.32f, 1.28f);
    private static final defpackage.aez c = new defpackage.aeu(0.48f, 0.0f, 0.48f, 0.99f);

    public static /* synthetic */ defpackage.afbk a(defpackage.nod nodVar, boolean z, defpackage.cit citVar, defpackage.cim cimVar) {
        cimVar.getClass();
        cimVar.a(nodVar.j);
        if (z) {
            cimVar.e(citVar);
            cimVar.i(citVar);
        } else {
            cimVar.h(citVar);
            cimVar.d(citVar);
        }
        return defpackage.afbk.a;
    }

    public static final void b(defpackage.nod nodVar, defpackage.cgf cgfVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        boolean z2;
        defpackage.bwc bwcVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-328629227);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(nodVar) : bveVarC.E(nodVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cgf cgfVarI = defpackage.asq.I(cgfVar, 4.0f, 0.0f);
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.e, z ? defpackage.cfs.l : defpackage.cfs.j, bveVarC, 6);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarI);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            int i4 = true != z ? 1 : 3;
            java.lang.CharSequence charSequence = nodVar.l;
            if (charSequence == null || afzh.v(charSequence)) {
                z2 = false;
                bveVar2 = bveVarC;
                bwcVar = bwcVar2;
                bveVar2.v(-555791881);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-556042888);
                java.lang.String string = charSequence.toString();
                long j = defpackage.ksx.j(defpackage.kry.s, bveVarC);
                defpackage.dgd dgdVarW = defpackage.dgd.w(defpackage.bxi.p(bveVarC).k, 0L, 0L, null, null, null, null, 0L, null, 0, i4, 0L, null, null, 16711679);
                bwcVar = bwcVar2;
                z2 = false;
                defpackage.brv.b(string, null, j, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVarW, bveVarC, 0, 24960, 110586);
                bveVar2 = bveVarC;
                bwcVar.Y(false);
            }
            java.lang.CharSequence charSequence2 = nodVar.m;
            if (charSequence2 == null || afzh.v(charSequence2)) {
                bveVar2.v(-555428809);
                bwcVar.Y(z2);
            } else {
                bveVar2.v(-555686543);
                java.lang.String string2 = charSequence2.toString();
                long j2 = defpackage.ksx.j(defpackage.kry.w, bveVar2);
                defpackage.dgd dgdVarW2 = defpackage.dgd.w(defpackage.bxi.p(bveVar2).l, 0L, 0L, null, null, null, null, 0L, null, 0, i4, 0L, null, null, 16711679);
                defpackage.bve bveVar3 = bveVar2;
                defpackage.brv.b(string2, null, j2, 0L, null, 0L, null, 0L, 2, false, 1, 0, dgdVarW2, bveVar3, 0, 24960, 110586);
                bveVar2 = bveVar3;
                bwcVar.Y(z2);
            }
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(nodVar, cgfVar, z, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0279  */
    /* JADX WARN: Code duplicated, block: B:148:0x027d  */
    public static final void c(defpackage.cgf cgfVar, defpackage.noc nocVar, defpackage.cit citVar, defpackage.cit citVar2, defpackage.cit citVar3, defpackage.bwx bwxVar, defpackage.nnk nnkVar, java.lang.String str, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cit citVar4;
        defpackage.bwx bwxVar2;
        defpackage.bve bveVar2;
        defpackage.bxl bxlVarJ;
        goe goeVar;
        long j;
        defpackage.bwc bwcVar;
        java.lang.Object obj;
        boolean z;
        java.lang.Object objS;
        int i3;
        defpackage.bve bveVarC = bveVar.c(1030026683);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nocVar) : bveVarC.E(nocVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(citVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(citVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(citVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(bwxVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.A(nnkVar.ordinal()) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != bveVarC.C(str) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != bveVarC.D(true) ? 33554432 : 67108864;
        }
        if (bveVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nocVar.a;
            if (ghIcon == null) {
                bxlVarJ = bveVarC.J();
                if (bxlVarJ == null) {
                    return;
                } else {
                    goeVar = new goe(cgfVar, nocVar, citVar, citVar2, citVar3, bwxVar, nnkVar, str, i, 4);
                }
            } else {
                android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
                if (ghIcon.t()) {
                    bveVarC.v(-2015945248);
                    android.content.res.ColorStateList colorStateListD = ghIcon.d(context);
                    if (colorStateListD != null) {
                        bveVarC.v(2013181394);
                        ((defpackage.bwc) bveVarC).Y(false);
                        j = defpackage.cjv.j(colorStateListD.getDefaultColor());
                    } else {
                        bveVarC.v(2013183204);
                        j = defpackage.ksx.j(defpackage.kry.w, bveVarC);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(-2015790186);
                    int i4 = nocVar.c - 1;
                    if (i4 == 1) {
                        bveVarC.v(2013187716);
                        j = defpackage.ksx.j(defpackage.kry.I, bveVarC);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else if (i4 == 2) {
                        bveVarC.v(2013190660);
                        j = defpackage.ksx.j(defpackage.kry.E, bveVarC);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else if (i4 != 3) {
                        bveVarC.v(2013195396);
                        j = defpackage.ksx.j(defpackage.kry.w, bveVarC);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else {
                        bveVarC.v(2013193668);
                        j = defpackage.ksx.j(defpackage.kry.s, bveVarC);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                int i5 = nocVar.c - 1;
                boolean zA = bveVarC.A(i5);
                defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
                java.lang.Object objS2 = bwcVar2.S();
                defpackage.ckd ckdVar = null;
                if (zA || objS2 == defpackage.bvd.a) {
                    objS2 = i5 != 3 ? null : defpackage.kry.v;
                    bwcVar2.ad(objS2);
                }
                defpackage.kry kryVar = (defpackage.kry) objS2;
                if (kryVar == null) {
                    bveVarC.v(-2015159523);
                    bwcVar2.Y(false);
                } else {
                    bveVarC.v(2013204836);
                    long j2 = defpackage.ksx.j(kryVar, bveVarC);
                    bwcVar2.Y(false);
                    ckdVar = new defpackage.ckd(j2);
                }
                long j3 = ckdVar != null ? ckdVar.a : defpackage.cjv.j(0);
                defpackage.afar afarVar = defpackage.ktl.a;
                citVar4 = citVar2;
                bwxVar2 = bwxVar;
                int i6 = i2;
                defpackage.ktl ktlVarG = defpackage.kgu.g(j3, j, 0L, 0L, bveVarC, 252);
                defpackage.cgf cgfVarQ = defpackage.bzd.q(cgfVar, citVar);
                if (citVar4 != null) {
                    cgfVarQ = defpackage.bzd.q(cgfVarQ, citVar4);
                }
                if (citVar3 != null) {
                    cgfVarQ = defpackage.bzd.q(cgfVarQ, citVar3);
                }
                boolean z2 = (i6 & 458752) == 131072;
                boolean z3 = (i6 & 3670016) == 1048576;
                java.lang.Object objS3 = bwcVar2.S();
                if ((z2 || z3) || objS3 == defpackage.bvd.a) {
                    objS3 = new defpackage.nkb(bwxVar2, nnkVar, 4);
                    bwcVar = bwcVar2;
                    bwcVar.ad(objS3);
                } else {
                    bwcVar = bwcVar2;
                }
                defpackage.cgf cgfVarY = defpackage.dai.y(defpackage.bzd.s(cgfVarQ, (defpackage.affc) objS3), str);
                defpackage.cne cneVarF = defpackage.lgo.f(ghIcon, 0.0f, bveVarC, 3);
                if ((i6 & 112) != 32) {
                    if ((i6 & 64) != 0) {
                        obj = nocVar;
                        if (bveVarC.E(obj)) {
                        }
                        objS = bwcVar.S();
                        i3 = 12;
                        if (z || objS == defpackage.bvd.a) {
                            objS = new defpackage.niw(obj, i3);
                            bwcVar.ad(objS);
                        }
                        defpackage.khg.m(cneVarF, (defpackage.afer) objS, cgfVarY, null, true, null, ktlVarG, null, null, bveVarC, ((i6 >> 12) & 57344) | 8, 0, 3816);
                        bveVar2 = bveVarC;
                    } else {
                        obj = nocVar;
                    }
                    z = false;
                    objS = bwcVar.S();
                    i3 = 12;
                    if (z) {
                        objS = new defpackage.niw(obj, i3);
                        bwcVar.ad(objS);
                    } else {
                        objS = new defpackage.niw(obj, i3);
                        bwcVar.ad(objS);
                    }
                    defpackage.khg.m(cneVarF, (defpackage.afer) objS, cgfVarY, null, true, null, ktlVarG, null, null, bveVarC, ((i6 >> 12) & 57344) | 8, 0, 3816);
                    bveVar2 = bveVarC;
                } else {
                    obj = nocVar;
                }
                z = true;
                objS = bwcVar.S();
                i3 = 12;
                if (z) {
                    objS = new defpackage.niw(obj, i3);
                    bwcVar.ad(objS);
                } else {
                    objS = new defpackage.niw(obj, i3);
                    bwcVar.ad(objS);
                }
                defpackage.khg.m(cneVarF, (defpackage.afer) objS, cgfVarY, null, true, null, ktlVarG, null, null, bveVarC, ((i6 >> 12) & 57344) | 8, 0, 3816);
                bveVar2 = bveVarC;
            }
            bxlVarJ.c = goeVar;
        }
        citVar4 = citVar2;
        bwxVar2 = bwxVar;
        bveVar2 = bveVarC;
        bveVar2.s();
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            goeVar = new goe(cgfVar, nocVar, citVar, citVar4, citVar3, bwxVar2, nnkVar, str, i, 5);
            bxlVarJ.c = goeVar;
        }
    }

    public static final void d(defpackage.nod nodVar, defpackage.bwx bwxVar, defpackage.cit citVar, defpackage.cit citVar2, defpackage.cit citVar3, defpackage.cit citVar4, defpackage.cit citVar5, defpackage.cit citVar6, defpackage.cit citVar7, defpackage.cit citVar8, defpackage.cit citVar9, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.bwx bwxVar2;
        defpackage.cit citVar10;
        defpackage.cit citVar11;
        defpackage.cit citVar12;
        defpackage.cit citVar13;
        defpackage.cit citVar14;
        defpackage.cit citVar15;
        defpackage.cit citVar16;
        defpackage.cit citVar17;
        defpackage.cit citVar18;
        int i4;
        defpackage.bve bveVarC = bveVar.c(-416995450);
        if ((i & 6) == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(nodVar) : bveVarC.E(nodVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            bwxVar2 = bwxVar;
            i3 |= true != bveVarC.C(bwxVar2) ? 16 : 32;
        } else {
            bwxVar2 = bwxVar;
        }
        if ((i & 384) == 0) {
            citVar10 = citVar;
            i3 |= true != bveVarC.C(citVar10) ? 128 : 256;
        } else {
            citVar10 = citVar;
        }
        if ((i & 3072) == 0) {
            citVar11 = citVar2;
            i3 |= true != bveVarC.C(citVar11) ? 1024 : 2048;
        } else {
            citVar11 = citVar2;
        }
        if ((i & 24576) == 0) {
            citVar12 = citVar3;
            i3 |= true != bveVarC.C(citVar12) ? 8192 : 16384;
        } else {
            citVar12 = citVar3;
        }
        if ((196608 & i) == 0) {
            citVar13 = citVar4;
            i3 |= true != bveVarC.C(citVar13) ? 65536 : 131072;
        } else {
            citVar13 = citVar4;
        }
        if ((1572864 & i) == 0) {
            citVar14 = citVar5;
            i3 |= true != bveVarC.C(citVar14) ? 524288 : 1048576;
        } else {
            citVar14 = citVar5;
        }
        if ((12582912 & i) == 0) {
            citVar15 = citVar6;
            i3 |= true != bveVarC.C(citVar15) ? 4194304 : 8388608;
        } else {
            citVar15 = citVar6;
        }
        if ((100663296 & i) == 0) {
            citVar16 = citVar7;
            i3 |= true != bveVarC.C(citVar16) ? 33554432 : 67108864;
        } else {
            citVar16 = citVar7;
        }
        if ((805306368 & i) == 0) {
            citVar17 = citVar8;
            i3 |= true != bveVarC.C(citVar17) ? 268435456 : 536870912;
        } else {
            citVar17 = citVar8;
        }
        if ((i2 & 6) == 0) {
            citVar18 = citVar9;
            i4 = i2 | (true != bveVarC.C(citVar18) ? 2 : 4);
        } else {
            citVar18 = citVar9;
            i4 = i2;
        }
        int i5 = i3;
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.D(true) ? 16 : 32;
        }
        if (bveVarC.I(((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i5 & 1)) {
            defpackage.cit citVar19 = citVar18;
            defpackage.cit citVar20 = citVar11;
            defpackage.cit citVar21 = citVar16;
            defpackage.cit citVar22 = citVar10;
            defpackage.dai.aA(defpackage.dbl.i.b(defpackage.dlz.a), defpackage.dai.as(-784217402, true, new nnq(nodVar, citVar22, citVar13, citVar14, bwxVar2, citVar20, citVar15, citVar21, citVar12, citVar17, citVar19), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nnr(nodVar, bwxVar, citVar, citVar2, citVar3, citVar4, citVar5, citVar6, citVar7, citVar8, citVar9, i, i2, 0);
        }
    }

    public static final void e(final defpackage.abn abnVar, final defpackage.nod nodVar, final defpackage.bwx bwxVar, final defpackage.cit citVar, final defpackage.cit citVar2, final defpackage.cit citVar3, final boolean z, final boolean z2, defpackage.bve bveVar, final int i) {
        int i2;
        defpackage.bwx bwxVar2;
        defpackage.cit citVar4;
        defpackage.cit citVar5;
        final boolean z3;
        char c2;
        defpackage.bve bveVarC = bveVar.c(490277810);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(abnVar) : bveVarC.E(abnVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nodVar) : bveVarC.E(nodVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            bwxVar2 = bwxVar;
            i2 |= true != bveVarC.C(bwxVar2) ? 128 : 256;
        } else {
            bwxVar2 = bwxVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(citVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            citVar4 = citVar2;
            i2 |= true != bveVarC.C(citVar4) ? 8192 : 16384;
        } else {
            citVar4 = citVar2;
        }
        if ((196608 & i) == 0) {
            citVar5 = citVar3;
            i2 |= true != bveVarC.C(citVar5) ? 65536 : 131072;
        } else {
            citVar5 = citVar3;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.D(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z3 = z2;
            c2 = ' ';
            i2 |= true != bveVarC.D(z3) ? 4194304 : 8388608;
        } else {
            z3 = z2;
            c2 = ' ';
        }
        if ((100663296 & i) == 0) {
            i2 |= true != bveVarC.D(true) ? 33554432 : 67108864;
        }
        if (bveVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            int i3 = i2;
            defpackage.cgf cgfVarA = abnVar.a(defpackage.cgf.e, defpackage.acs.z(defpackage.ca.F(450, 0, null, 6), 2).a(defpackage.acs.q(defpackage.ca.F(450, 0, b, 2), 0.5f, 0L, 4)), defpackage.acs.A(defpackage.ca.F(300, 100, null, 4), 2).a(defpackage.acs.r(new defpackage.ags(300, 100, c), 0.5f, 0L, 4)));
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> c2);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.nkn(5);
                bwcVar.ad(objS);
            }
            defpackage.affc affcVar = (defpackage.affc) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.nkn(6);
                bwcVar.ad(objS2);
            }
            final defpackage.bwx bwxVar3 = bwxVar2;
            final defpackage.cit citVar6 = citVar4;
            final defpackage.cit citVar7 = citVar5;
            defpackage.ca.V(nodVar, null, affcVar, null, null, (defpackage.affc) objS2, defpackage.dai.as(281558874, true, new defpackage.affi() { // from class: nnu
                @Override // defpackage.affi
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    defpackage.noc nocVar;
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
                    final defpackage.nod nodVar2 = (defpackage.nod) obj3;
                    defpackage.bve bveVar2 = (defpackage.bve) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    int i4 = defpackage.nob.a;
                    ((defpackage.abn) obj2).getClass();
                    nodVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != ((iIntValue & 64) == 0 ? bveVar2.C(nodVar2) : bveVar2.E(nodVar2)) ? 16 : 32;
                    }
                    if (bveVar2.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        boolean z4 = z;
                        final defpackage.cit citVar8 = citVar7;
                        final defpackage.cit citVar9 = citVar6;
                        final defpackage.bwx bwxVar4 = bwxVar3;
                        final defpackage.cit citVar10 = citVar;
                        final boolean z5 = z3;
                        if (nodVar2.c == null && (ghIcon = (nocVar = nodVar2.b).a) != null && ghIcon.b == 6 && nodVar2.d == null) {
                            bveVar2.v(-150455832);
                            defpackage.nne nneVar = new defpackage.nne(ghIcon, nodVar2.r, null, null, false, nocVar.b);
                            defpackage.avr avrVar = new defpackage.avr(6.0f, 6.0f, 6.0f, 6.0f);
                            boolean zD = ((iIntValue & 112) == 32 || ((iIntValue & 64) != 0 && bveVar2.E(nodVar2))) | bveVar2.D(z5) | bveVar2.C(citVar10);
                            java.lang.Object objG = bveVar2.g();
                            if (zD || objG == defpackage.bvd.a) {
                                objG = new defpackage.hes(nodVar2, z5, citVar10, 3);
                                bveVar2.x(objG);
                            }
                            defpackage.cgf cgfVarR = defpackage.bzd.r(avrVar, (defpackage.affc) objG);
                            boolean zC = bveVar2.C(bwxVar4);
                            java.lang.Object objG2 = bveVar2.g();
                            if (zC || objG2 == defpackage.bvd.a) {
                                objG2 = new noh(bwxVar4, 1);
                                bveVar2.x(objG2);
                            }
                            defpackage.cgf cgfVarA2 = cgfVarR.a(new defpackage.chx((defpackage.affc) objG2));
                            boolean z6 = nodVar2.j;
                            if (z6 && citVar9 != null) {
                                cgfVarA2 = cgfVarA2.a(new defpackage.ciu(citVar9));
                            }
                            if (z6 && citVar8 != null) {
                                cgfVarA2 = cgfVarA2.a(new defpackage.ciu(citVar8));
                            }
                            defpackage.kfn.i(cgfVarA2.a(new defpackage.dci("appAction")), nneVar, z4, true, bveVar2, 64, 0);
                            bveVar2.o();
                        } else {
                            bveVar2.v(-149099954);
                            defpackage.kil.b(defpackage.dai.as(951425367, true, new defpackage.cvi(nodVar2, 16), bveVar2), z4 ? new defpackage.avr(6.0f, 6.0f, 6.0f, 6.0f) : defpackage.cgf.e, 0.0f, 0L, 0L, null, 0L, defpackage.dai.as(-1671476898, true, new defpackage.affg() { // from class: nno
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                    defpackage.cit citVar11;
                                    defpackage.cit citVar12;
                                    defpackage.bve bveVar3 = (defpackage.bve) obj6;
                                    int iIntValue2 = ((java.lang.Integer) obj7).intValue();
                                    int i5 = iIntValue2 & 3;
                                    int i6 = iIntValue2 & 1;
                                    int i7 = defpackage.nob.a;
                                    if (bveVar3.I(i5 != 2, i6)) {
                                        defpackage.cit citVar13 = citVar10;
                                        boolean z7 = z5;
                                        defpackage.nod nodVar3 = nodVar2;
                                        boolean z8 = nodVar3.f;
                                        float f = true != z8 ? 20.0f : 32.0f;
                                        defpackage.bcr bcrVar = defpackage.bcw.a;
                                        defpackage.bct bctVar = new defpackage.bct(f);
                                        defpackage.bcr bcrVar2 = new defpackage.bcr(bctVar, bctVar, bctVar, bctVar);
                                        defpackage.bct bctVar2 = new defpackage.bct(true != z8 ? 16.0f : 28.0f);
                                        defpackage.bcr bcrVar3 = new defpackage.bcr(bctVar2, bctVar2, bctVar2, bctVar2);
                                        defpackage.afar afarVar = defpackage.ktl.a;
                                        defpackage.ktl ktlVarI = defpackage.kgu.i(bveVar3);
                                        defpackage.ktf ktfVar = defpackage.ktf.f;
                                        defpackage.cgc cgcVar = defpackage.cgf.e;
                                        boolean zE = bveVar3.E(nodVar3) | bveVar3.D(z7) | bveVar3.C(citVar13);
                                        java.lang.Object objG3 = bveVar3.g();
                                        if (zE || objG3 == defpackage.bvd.a) {
                                            objG3 = new defpackage.bbg(nodVar3, z7, citVar13, 3);
                                            bveVar3.x(objG3);
                                        }
                                        defpackage.bwx bwxVar5 = bwxVar4;
                                        defpackage.cgf cgfVarR2 = defpackage.bzd.r(cgcVar, (defpackage.affc) objG3);
                                        boolean zC2 = bveVar3.C(bwxVar5);
                                        java.lang.Object objG4 = bveVar3.g();
                                        if (zC2 || objG4 == defpackage.bvd.a) {
                                            objG4 = new defpackage.nnp(bwxVar5, 0);
                                            bveVar3.x(objG4);
                                        }
                                        defpackage.cgf cgfVarA3 = cgfVarR2.a(new defpackage.chx((defpackage.affc) objG4));
                                        boolean z9 = nodVar3.j;
                                        if (z9 && (citVar12 = citVar9) != null) {
                                            cgfVarA3 = cgfVarA3.a(new defpackage.ciu(citVar12));
                                        }
                                        if (z9 && (citVar11 = citVar8) != null) {
                                            cgfVarA3 = cgfVarA3.a(new defpackage.ciu(citVar11));
                                        }
                                        defpackage.cgf cgfVarA4 = cgfVarA3.a(new defpackage.dci("appAction"));
                                        boolean zE2 = bveVar3.E(nodVar3);
                                        java.lang.Object objG5 = bveVar3.g();
                                        if (zE2 || objG5 == defpackage.bvd.a) {
                                            objG5 = new defpackage.njw(nodVar3, 5);
                                            bveVar3.x(objG5);
                                        }
                                        defpackage.khg.k((defpackage.afer) objG5, cgfVarA4, ktfVar, true, false, bcrVar2, null, ktlVarI, null, null, null, null, false, null, defpackage.dai.as(-365602651, true, new defpackage.aly(nodVar3, bcrVar3, 4), bveVar3), bveVar3, 0, 196608, 32592);
                                    } else {
                                        bveVar3.s();
                                    }
                                    return defpackage.afbk.a;
                                }
                            }, bveVar2), bveVar2, 12607494, 108);
                            bveVar2.o();
                        }
                    } else {
                        bveVar2.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVarC, ((i3 >> 3) & 14) | 1769864, 26);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: nnv
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    defpackage.abn abnVar2 = abnVar;
                    defpackage.nod nodVar2 = nodVar;
                    defpackage.bwx bwxVar4 = bwxVar;
                    defpackage.cit citVar8 = citVar;
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    defpackage.nob.e(abnVar2, nodVar2, bwxVar4, citVar8, citVar2, citVar3, z, z2, bveVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:128:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0201  */
    /* JADX WARN: Code duplicated, block: B:148:0x0214  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0224  */
    /* JADX WARN: Code duplicated, block: B:156:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x0234  */
    /* JADX WARN: Code duplicated, block: B:159:0x0238  */
    /* JADX WARN: Code duplicated, block: B:160:0x023b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0241  */
    /* JADX WARN: Code duplicated, block: B:164:0x0244  */
    /* JADX WARN: Code duplicated, block: B:166:0x0248  */
    /* JADX WARN: Code duplicated, block: B:167:0x024b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0251  */
    /* JADX WARN: Code duplicated, block: B:171:0x0254  */
    /* JADX WARN: Code duplicated, block: B:173:0x0258  */
    /* JADX WARN: Code duplicated, block: B:174:0x025b  */
    /* JADX WARN: Code duplicated, block: B:183:0x026f  */
    /* JADX WARN: Code duplicated, block: B:189:0x028f  */
    /* JADX WARN: Code duplicated, block: B:193:0x02bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:199:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:203:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:213:0x0345  */
    /* JADX WARN: Code duplicated, block: B:219:0x036e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0398  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:234:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:241:0x045f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0463  */
    /* JADX WARN: Code duplicated, block: B:245:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:246:0x04ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [bwc] */
    /* JADX WARN: Type inference failed for: r13v4, types: [bwc] */
    /* JADX WARN: Type inference failed for: r13v5, types: [bwc] */
    /* JADX WARN: Type inference failed for: r13v6, types: [bwc] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final void f(final defpackage.abn abnVar, final defpackage.nod nodVar, final defpackage.cgf cgfVar, final defpackage.cit citVar, defpackage.cit citVar2, final boolean z, final defpackage.cit citVar3, final defpackage.cit citVar4, boolean z2, defpackage.bve bveVar, final int i) {
        int i2;
        defpackage.bve bveVar2;
        final defpackage.cit citVar5;
        final boolean z3;
        defpackage.nnk nnkVar;
        java.lang.Object obj;
        boolean zD;
        java.lang.Object objS;
        defpackage.nnk nnkVar2;
        boolean z4;
        boolean zA;
        java.lang.Object objS2;
        defpackage.nnk nnkVar3;
        final defpackage.nnk nnkVar4;
        defpackage.nnk nnkVar5;
        defpackage.cit citVar6;
        defpackage.cit citVar7;
        defpackage.nnk nnkVar6;
        defpackage.cit citVar8;
        defpackage.cit citVar9;
        defpackage.nnk nnkVar7;
        defpackage.cit citVar10;
        defpackage.cit citVar11;
        boolean z5;
        boolean zC;
        java.lang.Object objS3;
        defpackage.bwx bwxVar;
        defpackage.nod nodVar2;
        ?? r13;
        boolean z6;
        boolean zD2;
        java.lang.Object objS4;
        defpackage.bcr bcrVar;
        defpackage.bcr bcrVar2;
        defpackage.cgf cgfVarV;
        float f;
        defpackage.bwx bwxVar2;
        boolean z7;
        boolean zC2;
        java.lang.Object objS5;
        ?? r14;
        java.lang.Object obj2;
        defpackage.cit citVar12;
        defpackage.cit citVar13;
        defpackage.cit citVar14;
        defpackage.bwx bwxVar3;
        defpackage.cgf cgfVarA;
        java.lang.Object obj3;
        int i3;
        ?? r9;
        java.lang.Object objS6;
        int i4;
        defpackage.afer aferVar;
        defpackage.ccz cczVarAs;
        defpackage.ccz cczVarAs2;
        ?? r17;
        defpackage.ccz cczVarAs3;
        ?? r15;
        nodVar.getClass();
        citVar.getClass();
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1867849709);
        if (i5 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(abnVar) : bveVarC.E(abnVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nodVar) : bveVarC.E(nodVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(citVar) ? 1024 : 2048;
        }
        int i6 = i2 | 24576;
        if ((196608 & i) == 0) {
            i6 |= true != bveVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i6 |= true != bveVarC.C(citVar3) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != bveVarC.C(citVar4) ? 4194304 : 8388608;
        }
        int i7 = i6 | 100663296;
        if (bveVarC.I((i7 & 38347923) != 38347922, i7 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS7 = bwcVar.S();
            java.lang.Object obj4 = defpackage.bvd.a;
            if (objS7 == obj4) {
                objS7 = new defpackage.cit();
                bwcVar.ad(objS7);
            }
            defpackage.cit citVar15 = (defpackage.cit) objS7;
            defpackage.yqm yqmVar = defpackage.nte.a;
            final boolean zJ = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().J();
            java.lang.Object objS8 = bwcVar.S();
            if (objS8 == obj4) {
                objS8 = defpackage.cis.a;
                bwcVar.ad(objS8);
            }
            defpackage.cit citVar16 = new defpackage.cit();
            defpackage.cit citVar17 = new defpackage.cit();
            defpackage.cit citVar18 = new defpackage.cit();
            java.lang.Object objS9 = bwcVar.S();
            if (objS9 == obj4) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.nnk.a, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS9 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar4 = (defpackage.bwx) objS9;
            java.lang.Object objS10 = bwcVar.S();
            if (objS10 == obj4) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(nodVar, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS10 = parcelableSnapshotMutableState2;
            }
            final defpackage.cit citVar19 = citVar3 == null ? citVar15 : citVar3;
            defpackage.bwx bwxVar5 = (defpackage.bwx) objS10;
            int i8 = i7 & 112;
            boolean zA2 = bveVarC.A(((defpackage.nnk) bwxVar4.a()).ordinal()) | (i8 == 32 || ((i7 & 64) != 0 && bveVarC.C(nodVar)));
            java.lang.Object objS11 = bwcVar.S();
            if (zA2 || objS11 == obj4) {
                defpackage.nnk nnkVar8 = (defpackage.nnk) bwxVar4.a();
                if (nnkVar8 == defpackage.nnk.a || !g(nnkVar8, nodVar)) {
                    nnkVar = nnkVar8;
                    nnkVar = defpackage.nnk.b;
                }
                nnkVar = nnkVar8;
                bwcVar.ad(nnkVar);
                obj = nnkVar;
            } else {
                obj = objS11;
            }
            final defpackage.nnk nnkVar9 = (defpackage.nnk) obj;
            if (i8 != 32) {
                boolean z8 = (i7 & 64) != 0 && bveVarC.C(nodVar);
                zD = z8 | bveVarC.D(zJ);
                objS = bwcVar.S();
                if (zD || objS == obj4) {
                    if (citVar4 == null) {
                        objS = defpackage.nnk.a;
                    } else if (zJ) {
                        if (nodVar.q != null) {
                            objS = defpackage.nnk.e;
                        } else if (nodVar.p != null) {
                            objS = defpackage.nnk.d;
                        } else if (nodVar.o != null) {
                            objS = defpackage.nnk.c;
                        } else {
                            objS = defpackage.nnk.a;
                        }
                    } else if (nodVar.o != null) {
                        objS = defpackage.nnk.c;
                    } else if (nodVar.p != null) {
                        objS = defpackage.nnk.d;
                    } else if (nodVar.q != null) {
                        objS = defpackage.nnk.e;
                    } else {
                        objS = defpackage.nnk.a;
                    }
                    bwcVar.ad(objS);
                }
                nnkVar2 = (defpackage.nnk) objS;
                boolean zA3 = bveVarC.A(((defpackage.nnk) bwxVar4.a()).ordinal());
                if (i8 != 32 || ((i7 & 64) != 0 && bveVarC.C(nodVar))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zA = z4 | zA3 | bveVarC.A(nnkVar2.ordinal());
                objS2 = bwcVar.S();
                if (zA || objS2 == obj4) {
                    nnkVar3 = (defpackage.nnk) bwxVar4.a();
                    if (nnkVar3 != defpackage.nnk.a || !g(nnkVar3, nodVar)) {
                        nnkVar3 = nnkVar2;
                    }
                    bwcVar.ad(nnkVar3);
                    objS2 = nnkVar3;
                }
                nnkVar4 = (defpackage.nnk) objS2;
                nnkVar5 = defpackage.nnk.c;
                if (nnkVar9 == nnkVar5) {
                    citVar6 = citVar19;
                } else {
                    citVar6 = null;
                }
                if (nnkVar4 == nnkVar5) {
                    citVar7 = citVar4;
                } else {
                    citVar7 = null;
                }
                nnkVar6 = defpackage.nnk.d;
                if (nnkVar9 == nnkVar6) {
                    citVar8 = citVar19;
                } else {
                    citVar8 = null;
                }
                if (nnkVar4 == nnkVar6) {
                    citVar9 = citVar4;
                } else {
                    citVar9 = null;
                }
                nnkVar7 = defpackage.nnk.e;
                if (nnkVar9 == nnkVar7) {
                    citVar10 = citVar19;
                } else {
                    citVar10 = null;
                }
                if (nnkVar4 == nnkVar7) {
                    citVar11 = citVar4;
                } else {
                    citVar11 = null;
                }
                if (i8 != 32 || ((i7 & 64) != 0 && bveVarC.E(nodVar))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zC = z5 | bveVarC.C(citVar19);
                objS3 = bwcVar.S();
                if (!zC || objS3 == obj4) {
                    defpackage.bwc bwcVar2 = bwcVar;
                    bwxVar = bwxVar4;
                    nodVar2 = nodVar;
                    defpackage.noa noaVar = new defpackage.noa(nodVar2, bwxVar5, bwxVar, citVar19, null);
                    bwcVar2.ad(noaVar);
                    objS3 = noaVar;
                    r13 = bwcVar2;
                } else {
                    r13 = bwcVar;
                    bwxVar = bwxVar4;
                    nodVar2 = nodVar;
                }
                defpackage.bvx.g(nodVar2, (defpackage.affg) objS3, bveVarC);
                z6 = nodVar2.f;
                zD2 = bveVarC.D(z6);
                objS4 = r13.S();
                if (zD2 || objS4 == obj4) {
                    if (z6) {
                        defpackage.bcr bcrVar3 = defpackage.bcw.a;
                        defpackage.bcu bcuVar = new defpackage.bcu(50.0f);
                        bcrVar = new defpackage.bcr(bcuVar, bcuVar, bcuVar, bcuVar);
                    } else {
                        defpackage.bcr bcrVar4 = defpackage.bcw.a;
                        defpackage.bct bctVar = new defpackage.bct(20.0f);
                        bcrVar = new defpackage.bcr(bctVar, bctVar, bctVar, bctVar);
                    }
                    objS4 = bcrVar;
                    r13.ad(objS4);
                }
                bcrVar2 = (defpackage.bcr) objS4;
                bveVarC.v(292906661);
                if (z) {
                    cgfVarV = cgfVar;
                } else {
                    cgfVarV = defpackage.awj.v(cgfVar, false, 3);
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = 6.0f;
                }
                bwxVar2 = bwxVar;
                defpackage.cgf cgfVarA2 = cgfVarV.a(new defpackage.avr(0.0f, f, 0.0f, f));
                defpackage.kry kryVar = defpackage.kry.q;
                defpackage.ksw kswVar = defpackage.ksx.a;
                defpackage.cgf cgfVarH = defpackage.cjv.h(cgfVarA2.a(new defpackage.ajc(defpackage.ksx.b(defpackage.kfp.i(bveVarC), kryVar), bcrVar2)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bcrVar2, true, 0, 1042431);
                if (i8 != 32 || ((i7 & 64) != 0 && bveVarC.E(nodVar2))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zC2 = z7 | bveVarC.C(citVar19) | bveVarC.C(citVar16) | bveVarC.C(citVar17) | bveVarC.C(citVar18);
                objS5 = r13.S();
                if (!zC2 || objS5 == obj4) {
                    defpackage.cit citVar20 = citVar19;
                    r14 = 0;
                    obj2 = obj4;
                    defpackage.nns nnsVar = new defpackage.nns(nodVar2, bwxVar2, citVar20, citVar16, citVar17, citVar18, 0);
                    citVar12 = citVar16;
                    citVar13 = citVar17;
                    citVar14 = citVar18;
                    citVar19 = citVar20;
                    bwxVar3 = bwxVar2;
                    r13.ad(nnsVar);
                    objS5 = nnsVar;
                } else {
                    citVar13 = citVar17;
                    citVar12 = citVar16;
                    citVar14 = citVar18;
                    bwxVar3 = bwxVar2;
                    r14 = 0;
                    obj2 = obj4;
                }
                cgfVarA = cgfVarH.a(new defpackage.chx((defpackage.affc) objS5));
                if (nodVar2.j) {
                    obj3 = obj2;
                    i3 = 4;
                    bveVar2 = bveVarC;
                } else {
                    i3 = 4;
                    obj3 = obj2;
                    bveVar2 = bveVarC;
                    cgfVarA = defpackage.kvi.a(cgfVarA, bcrVar2, 0L, 0L, null, null, null, true, false, bveVarC, 12582912, 190).a(new defpackage.ciu(citVar19));
                    if (citVar4 != null) {
                        cgfVarA = cgfVarA.a(new defpackage.ciu(citVar4));
                    }
                }
                r13.Y(r14);
                if (i8 != 32 || ((i7 & 64) != 0 && bveVar2.E(nodVar2))) {
                    r9 = 1;
                } else {
                    r9 = r14;
                }
                objS6 = r13.S();
                i4 = 6;
                if (r9 == 0 || objS6 == obj3) {
                    objS6 = new defpackage.njw(nodVar2, i4);
                    r13.ad(objS6);
                }
                defpackage.cgf cgfVarA3 = defpackage.ca.K(abnVar.a(cgfVarA.a(new defpackage.ajm(null, null, true, true, null, null, (defpackage.afer) objS6)), defpackage.acs.z(defpackage.ca.F(150, r14, null, 6), 2), defpackage.acs.A(defpackage.ca.F(150, 100, null, i3), 2)), null, null, 3).a(new defpackage.dci("widget"));
                defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVar2, 48);
                long j = r13.u;
                long j2 = j ^ (j >>> 32);
                defpackage.cdd cddVarAh = r13.ah();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarA3);
                aferVar = defpackage.cwl.a;
                bveVar2.w();
                if (r13.t) {
                    bveVar2.j(aferVar);
                } else {
                    bveVar2.y();
                }
                defpackage.byw.c(bveVar2, ctyVarA, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
                bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                final defpackage.awe aweVar = defpackage.awe.a;
                final defpackage.nod nodVar3 = nodVar2;
                final defpackage.bwx bwxVar6 = bwxVar3;
                cczVarAs = defpackage.dai.as(-1898963110, true, new defpackage.affg() { // from class: nnw
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj5;
                        int iIntValue = ((java.lang.Integer) obj6).intValue();
                        int i9 = iIntValue & 3;
                        int i10 = iIntValue & 1;
                        int i11 = defpackage.nob.a;
                        if (bveVar3.I(i9 != 2, i10)) {
                            boolean z9 = zJ;
                            boolean z10 = z;
                            defpackage.cit citVar21 = citVar4;
                            defpackage.nnk nnkVar10 = nnkVar4;
                            defpackage.cit citVar22 = citVar19;
                            defpackage.nnk nnkVar11 = nnkVar9;
                            defpackage.cit citVar23 = citVar;
                            defpackage.bwx bwxVar7 = bwxVar6;
                            defpackage.nod nodVar4 = nodVar3;
                            defpackage.abn abnVar2 = abnVar;
                            defpackage.nnk nnkVar12 = defpackage.nnk.b;
                            defpackage.nob.e(abnVar2, nodVar4, bwxVar7, citVar23, nnkVar11 == nnkVar12 ? citVar22 : null, nnkVar10 != nnkVar12 ? null : citVar21, z10, z9, bveVar3, 448);
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar2);
                cczVarAs2 = defpackage.dai.as(1778055627, true, new defpackage.affg() { // from class: nnx
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj5;
                        int iIntValue = ((java.lang.Integer) obj6).intValue();
                        int i9 = iIntValue & 3;
                        int i10 = iIntValue & 1;
                        int i11 = defpackage.nob.a;
                        if (bveVar3.I(i9 != 2, i10)) {
                            defpackage.nod nodVar4 = nodVar3;
                            if (!nodVar4.i || defpackage.lxy.r(nodVar4)) {
                                bveVar3.v(223686071);
                                bveVar3.o();
                            } else {
                                boolean z9 = zJ;
                                defpackage.awd awdVar = aweVar;
                                bveVar3.v(223604386);
                                defpackage.nob.b(nodVar4, awdVar.b(defpackage.cgf.e, 1.0f, true), z9, bveVar3, 8);
                                bveVar3.o();
                            }
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar2);
                r17 = r13;
                final defpackage.cit citVar21 = citVar6;
                final defpackage.cit citVar22 = citVar7;
                final defpackage.cit citVar23 = citVar8;
                final defpackage.cit citVar24 = citVar9;
                final defpackage.cit citVar25 = citVar10;
                final defpackage.cit citVar26 = citVar11;
                final defpackage.cit citVar27 = citVar12;
                final defpackage.cit citVar28 = citVar14;
                final defpackage.cit citVar29 = citVar13;
                cczVarAs3 = defpackage.dai.as(823312490, true, new defpackage.affg() { // from class: nny
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj5;
                        int iIntValue = ((java.lang.Integer) obj6).intValue();
                        int i9 = iIntValue & 3;
                        int i10 = iIntValue & 1;
                        int i11 = defpackage.nob.a;
                        if (bveVar3.I(i9 != 2, i10)) {
                            defpackage.nod nodVar4 = nodVar3;
                            if (nodVar4.j) {
                                defpackage.cit citVar30 = citVar26;
                                defpackage.cit citVar31 = citVar25;
                                defpackage.cit citVar32 = citVar24;
                                defpackage.cit citVar33 = citVar23;
                                defpackage.cit citVar34 = citVar22;
                                defpackage.cit citVar35 = citVar21;
                                defpackage.cit citVar36 = citVar28;
                                defpackage.cit citVar37 = citVar29;
                                defpackage.cit citVar38 = citVar27;
                                defpackage.bwx bwxVar7 = bwxVar6;
                                bveVar3.v(-1255775368);
                                defpackage.nob.d(nodVar4, bwxVar7, citVar38, citVar37, citVar36, citVar35, citVar34, citVar33, citVar32, citVar31, citVar30, bveVar3, 56, 0);
                                bveVar3.o();
                            } else {
                                bveVar3.v(-1254914312);
                                bveVar3.o();
                            }
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar2);
                if (zJ) {
                    bveVar2.v(-166650010);
                    cczVarAs3.invoke(bveVar2, 6);
                    cczVarAs2.invoke(bveVar2, 6);
                    cczVarAs.invoke(bveVar2, 6);
                    ?? r16 = r17;
                    r16.Y(false);
                    r15 = r16;
                } else {
                    ?? r18 = r17;
                    bveVar2.v(-166575610);
                    cczVarAs.invoke(bveVar2, 6);
                    cczVarAs2.invoke(bveVar2, 6);
                    cczVarAs3.invoke(bveVar2, 6);
                    r18.Y(false);
                    r15 = r18;
                }
                r15.Y(true);
                z3 = true;
                citVar5 = citVar15;
            } else {
                i8 = 32;
            }
            zD = z8 | bveVarC.D(zJ);
            objS = bwcVar.S();
            if (zD) {
                if (citVar4 == null) {
                    objS = defpackage.nnk.a;
                } else if (zJ) {
                    if (nodVar.q != null) {
                        objS = defpackage.nnk.e;
                    } else if (nodVar.p != null) {
                        objS = defpackage.nnk.d;
                    } else if (nodVar.o != null) {
                        objS = defpackage.nnk.c;
                    } else {
                        objS = defpackage.nnk.a;
                    }
                } else if (nodVar.o != null) {
                    objS = defpackage.nnk.c;
                } else if (nodVar.p != null) {
                    objS = defpackage.nnk.d;
                } else if (nodVar.q != null) {
                    objS = defpackage.nnk.e;
                } else {
                    objS = defpackage.nnk.a;
                }
                bwcVar.ad(objS);
            } else {
                if (citVar4 == null) {
                    objS = defpackage.nnk.a;
                } else if (zJ) {
                    if (nodVar.q != null) {
                        objS = defpackage.nnk.e;
                    } else if (nodVar.p != null) {
                        objS = defpackage.nnk.d;
                    } else if (nodVar.o != null) {
                        objS = defpackage.nnk.c;
                    } else {
                        objS = defpackage.nnk.a;
                    }
                } else if (nodVar.o != null) {
                    objS = defpackage.nnk.c;
                } else if (nodVar.p != null) {
                    objS = defpackage.nnk.d;
                } else if (nodVar.q != null) {
                    objS = defpackage.nnk.e;
                } else {
                    objS = defpackage.nnk.a;
                }
                bwcVar.ad(objS);
            }
            nnkVar2 = (defpackage.nnk) objS;
            boolean zA4 = bveVarC.A(((defpackage.nnk) bwxVar4.a()).ordinal());
            if (i8 != 32) {
                z4 = true;
            } else {
                z4 = true;
            }
            zA = z4 | zA4 | bveVarC.A(nnkVar2.ordinal());
            objS2 = bwcVar.S();
            if (zA) {
                nnkVar3 = (defpackage.nnk) bwxVar4.a();
                if (nnkVar3 != defpackage.nnk.a) {
                    nnkVar3 = nnkVar2;
                } else {
                    nnkVar3 = nnkVar2;
                }
                bwcVar.ad(nnkVar3);
                objS2 = nnkVar3;
            } else {
                nnkVar3 = (defpackage.nnk) bwxVar4.a();
                if (nnkVar3 != defpackage.nnk.a) {
                    nnkVar3 = nnkVar2;
                } else {
                    nnkVar3 = nnkVar2;
                }
                bwcVar.ad(nnkVar3);
                objS2 = nnkVar3;
            }
            nnkVar4 = (defpackage.nnk) objS2;
            nnkVar5 = defpackage.nnk.c;
            if (nnkVar9 == nnkVar5) {
                citVar6 = citVar19;
            } else {
                citVar6 = null;
            }
            if (nnkVar4 == nnkVar5) {
                citVar7 = citVar4;
            } else {
                citVar7 = null;
            }
            nnkVar6 = defpackage.nnk.d;
            if (nnkVar9 == nnkVar6) {
                citVar8 = citVar19;
            } else {
                citVar8 = null;
            }
            if (nnkVar4 == nnkVar6) {
                citVar9 = citVar4;
            } else {
                citVar9 = null;
            }
            nnkVar7 = defpackage.nnk.e;
            if (nnkVar9 == nnkVar7) {
                citVar10 = citVar19;
            } else {
                citVar10 = null;
            }
            if (nnkVar4 == nnkVar7) {
                citVar11 = citVar4;
            } else {
                citVar11 = null;
            }
            if (i8 != 32) {
                z5 = true;
            } else {
                z5 = true;
            }
            zC = z5 | bveVarC.C(citVar19);
            objS3 = bwcVar.S();
            if (zC) {
                defpackage.bwc bwcVar3 = bwcVar;
                bwxVar = bwxVar4;
                nodVar2 = nodVar;
                defpackage.noa noaVar2 = new defpackage.noa(nodVar2, bwxVar5, bwxVar, citVar19, null);
                bwcVar3.ad(noaVar2);
                objS3 = noaVar2;
                r13 = bwcVar3;
            } else {
                defpackage.bwc bwcVar4 = bwcVar;
                bwxVar = bwxVar4;
                nodVar2 = nodVar;
                defpackage.noa noaVar3 = new defpackage.noa(nodVar2, bwxVar5, bwxVar, citVar19, null);
                bwcVar4.ad(noaVar3);
                objS3 = noaVar3;
                r13 = bwcVar4;
            }
            defpackage.bvx.g(nodVar2, (defpackage.affg) objS3, bveVarC);
            z6 = nodVar2.f;
            zD2 = bveVarC.D(z6);
            objS4 = r13.S();
            if (zD2) {
                if (z6) {
                    defpackage.bcr bcrVar5 = defpackage.bcw.a;
                    defpackage.bcu bcuVar2 = new defpackage.bcu(50.0f);
                    bcrVar = new defpackage.bcr(bcuVar2, bcuVar2, bcuVar2, bcuVar2);
                } else {
                    defpackage.bcr bcrVar6 = defpackage.bcw.a;
                    defpackage.bct bctVar2 = new defpackage.bct(20.0f);
                    bcrVar = new defpackage.bcr(bctVar2, bctVar2, bctVar2, bctVar2);
                }
                objS4 = bcrVar;
                r13.ad(objS4);
            } else {
                if (z6) {
                    defpackage.bcr bcrVar7 = defpackage.bcw.a;
                    defpackage.bcu bcuVar3 = new defpackage.bcu(50.0f);
                    bcrVar = new defpackage.bcr(bcuVar3, bcuVar3, bcuVar3, bcuVar3);
                } else {
                    defpackage.bcr bcrVar8 = defpackage.bcw.a;
                    defpackage.bct bctVar3 = new defpackage.bct(20.0f);
                    bcrVar = new defpackage.bcr(bctVar3, bctVar3, bctVar3, bctVar3);
                }
                objS4 = bcrVar;
                r13.ad(objS4);
            }
            bcrVar2 = (defpackage.bcr) objS4;
            bveVarC.v(292906661);
            if (z) {
                cgfVarV = defpackage.awj.v(cgfVar, false, 3);
            } else {
                cgfVarV = cgfVar;
            }
            if (z) {
                f = 0.0f;
            } else {
                f = 6.0f;
            }
            bwxVar2 = bwxVar;
            defpackage.cgf cgfVarA4 = cgfVarV.a(new defpackage.avr(0.0f, f, 0.0f, f));
            defpackage.kry kryVar2 = defpackage.kry.q;
            defpackage.ksw kswVar2 = defpackage.ksx.a;
            defpackage.cgf cgfVarH2 = defpackage.cjv.h(cgfVarA4.a(new defpackage.ajc(defpackage.ksx.b(defpackage.kfp.i(bveVarC), kryVar2), bcrVar2)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bcrVar2, true, 0, 1042431);
            if (i8 != 32) {
                z7 = true;
            } else {
                z7 = true;
            }
            zC2 = z7 | bveVarC.C(citVar19) | bveVarC.C(citVar16) | bveVarC.C(citVar17) | bveVarC.C(citVar18);
            objS5 = r13.S();
            if (zC2) {
                defpackage.cit citVar210 = citVar19;
                r14 = 0;
                obj2 = obj4;
                defpackage.nns nnsVar2 = new defpackage.nns(nodVar2, bwxVar2, citVar210, citVar16, citVar17, citVar18, 0);
                citVar12 = citVar16;
                citVar13 = citVar17;
                citVar14 = citVar18;
                citVar19 = citVar210;
                bwxVar3 = bwxVar2;
                r13.ad(nnsVar2);
                objS5 = nnsVar2;
            } else {
                defpackage.cit citVar211 = citVar19;
                r14 = 0;
                obj2 = obj4;
                defpackage.nns nnsVar3 = new defpackage.nns(nodVar2, bwxVar2, citVar211, citVar16, citVar17, citVar18, 0);
                citVar12 = citVar16;
                citVar13 = citVar17;
                citVar14 = citVar18;
                citVar19 = citVar211;
                bwxVar3 = bwxVar2;
                r13.ad(nnsVar3);
                objS5 = nnsVar3;
            }
            cgfVarA = cgfVarH2.a(new defpackage.chx((defpackage.affc) objS5));
            if (nodVar2.j) {
                i3 = 4;
                obj3 = obj2;
                bveVar2 = bveVarC;
                cgfVarA = defpackage.kvi.a(cgfVarA, bcrVar2, 0L, 0L, null, null, null, true, false, bveVarC, 12582912, 190).a(new defpackage.ciu(citVar19));
                if (citVar4 != null) {
                    cgfVarA = cgfVarA.a(new defpackage.ciu(citVar4));
                }
            } else {
                obj3 = obj2;
                i3 = 4;
                bveVar2 = bveVarC;
            }
            r13.Y(r14);
            if (i8 != 32) {
                r9 = 1;
            } else {
                r9 = 1;
            }
            objS6 = r13.S();
            i4 = 6;
            if (r9 == 0) {
                objS6 = new defpackage.njw(nodVar2, i4);
                r13.ad(objS6);
            } else {
                objS6 = new defpackage.njw(nodVar2, i4);
                r13.ad(objS6);
            }
            defpackage.cgf cgfVarA5 = defpackage.ca.K(abnVar.a(cgfVarA.a(new defpackage.ajm(null, null, true, true, null, null, (defpackage.afer) objS6)), defpackage.acs.z(defpackage.ca.F(150, r14, null, 6), 2), defpackage.acs.A(defpackage.ca.F(150, 100, null, i3), 2)), null, null, 3).a(new defpackage.dci("widget"));
            defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVar2, 48);
            long j3 = r13.u;
            long j4 = j3 ^ (j3 >>> 32);
            defpackage.cdd cddVarAh2 = r13.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar2, cgfVarA5);
            aferVar = defpackage.cwl.a;
            bveVar2.w();
            if (r13.t) {
                bveVar2.j(aferVar);
            } else {
                bveVar2.y();
            }
            defpackage.byw.c(bveVar2, ctyVarA2, defpackage.cwl.e);
            defpackage.byw.c(bveVar2, cddVarAh2, defpackage.cwl.d);
            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j4), defpackage.cwl.f);
            bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVar2, cgfVarN2, defpackage.cwl.c);
            final defpackage.awd aweVar2 = defpackage.awe.a;
            final defpackage.nod nodVar4 = nodVar2;
            final defpackage.bwx bwxVar7 = bwxVar3;
            cczVarAs = defpackage.dai.as(-1898963110, true, new defpackage.affg() { // from class: nnw
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj5;
                    int iIntValue = ((java.lang.Integer) obj6).intValue();
                    int i9 = iIntValue & 3;
                    int i10 = iIntValue & 1;
                    int i11 = defpackage.nob.a;
                    if (bveVar3.I(i9 != 2, i10)) {
                        boolean z9 = zJ;
                        boolean z10 = z;
                        defpackage.cit citVar212 = citVar4;
                        defpackage.nnk nnkVar10 = nnkVar4;
                        defpackage.cit citVar213 = citVar19;
                        defpackage.nnk nnkVar11 = nnkVar9;
                        defpackage.cit citVar214 = citVar;
                        defpackage.bwx bwxVar8 = bwxVar7;
                        defpackage.nod nodVar5 = nodVar4;
                        defpackage.abn abnVar2 = abnVar;
                        defpackage.nnk nnkVar12 = defpackage.nnk.b;
                        defpackage.nob.e(abnVar2, nodVar5, bwxVar8, citVar214, nnkVar11 == nnkVar12 ? citVar213 : null, nnkVar10 != nnkVar12 ? null : citVar212, z10, z9, bveVar3, 448);
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2);
            cczVarAs2 = defpackage.dai.as(1778055627, true, new defpackage.affg() { // from class: nnx
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj5;
                    int iIntValue = ((java.lang.Integer) obj6).intValue();
                    int i9 = iIntValue & 3;
                    int i10 = iIntValue & 1;
                    int i11 = defpackage.nob.a;
                    if (bveVar3.I(i9 != 2, i10)) {
                        defpackage.nod nodVar5 = nodVar4;
                        if (!nodVar5.i || defpackage.lxy.r(nodVar5)) {
                            bveVar3.v(223686071);
                            bveVar3.o();
                        } else {
                            boolean z9 = zJ;
                            defpackage.awd awdVar = aweVar2;
                            bveVar3.v(223604386);
                            defpackage.nob.b(nodVar5, awdVar.b(defpackage.cgf.e, 1.0f, true), z9, bveVar3, 8);
                            bveVar3.o();
                        }
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2);
            r17 = r13;
            final defpackage.cit citVar212 = citVar6;
            final defpackage.cit citVar213 = citVar7;
            final defpackage.cit citVar214 = citVar8;
            final defpackage.cit citVar215 = citVar9;
            final defpackage.cit citVar216 = citVar10;
            final defpackage.cit citVar217 = citVar11;
            final defpackage.cit citVar218 = citVar12;
            final defpackage.cit citVar219 = citVar14;
            final defpackage.cit citVar220 = citVar13;
            cczVarAs3 = defpackage.dai.as(823312490, true, new defpackage.affg() { // from class: nny
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj5;
                    int iIntValue = ((java.lang.Integer) obj6).intValue();
                    int i9 = iIntValue & 3;
                    int i10 = iIntValue & 1;
                    int i11 = defpackage.nob.a;
                    if (bveVar3.I(i9 != 2, i10)) {
                        defpackage.nod nodVar5 = nodVar4;
                        if (nodVar5.j) {
                            defpackage.cit citVar30 = citVar217;
                            defpackage.cit citVar31 = citVar216;
                            defpackage.cit citVar32 = citVar215;
                            defpackage.cit citVar33 = citVar214;
                            defpackage.cit citVar34 = citVar213;
                            defpackage.cit citVar35 = citVar212;
                            defpackage.cit citVar36 = citVar219;
                            defpackage.cit citVar37 = citVar220;
                            defpackage.cit citVar38 = citVar218;
                            defpackage.bwx bwxVar8 = bwxVar7;
                            bveVar3.v(-1255775368);
                            defpackage.nob.d(nodVar5, bwxVar8, citVar38, citVar37, citVar36, citVar35, citVar34, citVar33, citVar32, citVar31, citVar30, bveVar3, 56, 0);
                            bveVar3.o();
                        } else {
                            bveVar3.v(-1254914312);
                            bveVar3.o();
                        }
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2);
            if (zJ) {
                bveVar2.v(-166650010);
                cczVarAs3.invoke(bveVar2, 6);
                cczVarAs2.invoke(bveVar2, 6);
                cczVarAs.invoke(bveVar2, 6);
                ?? r19 = r17;
                r19.Y(false);
                r15 = r19;
            } else {
                ?? r110 = r17;
                bveVar2.v(-166575610);
                cczVarAs.invoke(bveVar2, 6);
                cczVarAs2.invoke(bveVar2, 6);
                cczVarAs3.invoke(bveVar2, 6);
                r110.Y(false);
                r15 = r110;
            }
            r15.Y(true);
            z3 = true;
            citVar5 = citVar15;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            citVar5 = citVar2;
            z3 = z2;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: nnz
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj5;
                    ((java.lang.Integer) obj6).intValue();
                    defpackage.abn abnVar2 = abnVar;
                    defpackage.nod nodVar5 = nodVar;
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.cit citVar30 = citVar;
                    defpackage.cit citVar31 = citVar5;
                    int i9 = i | 1;
                    int i10 = 306783378 & i9;
                    int i11 = 613566756 & i9;
                    defpackage.nob.f(abnVar2, nodVar5, cgfVar2, citVar30, citVar31, z, citVar3, citVar4, z3, bveVar3, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 + i10) & i11));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    private static final boolean g(defpackage.nnk nnkVar, defpackage.nod nodVar) {
        if (!nodVar.j) {
            return nnkVar == defpackage.nnk.b;
        }
        int iOrdinal = nnkVar.ordinal();
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4 && nodVar.q != null) {
                    return true;
                }
            } else if (nodVar.p != null) {
                return true;
            }
        } else if (nodVar.o != null) {
            return true;
        }
        return false;
    }
}
