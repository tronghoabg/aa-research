package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jya {
    public static void a() {
    }

    public static final void b(android.graphics.Rect rect, android.view.View view) {
        view.getClass();
        if (view.getVisibility() == 8) {
            return;
        }
        rect.right = java.lang.Math.min(rect.right, view.getLeft());
    }

    public static final void c(android.graphics.Rect rect, android.view.View view) {
        view.getClass();
        if (view.getVisibility() == 8) {
            return;
        }
        rect.left = java.lang.Math.max(rect.left, view.getRight());
    }

    public static final wif d(gfa gfaVar, lug lugVar, boolean z) {
        luf lufVar;
        android.content.ComponentName componentName = gfaVar.d().a;
        boolean zEquals = j$.util.Objects.equals(componentName.getPackageName(), "com.google.android.projection.gearhead");
        if (zEquals) {
            componentName = new android.content.ComponentName(gfaVar.b().getSessionId(), "");
        }
        android.content.ComponentName componentName2 = componentName;
        if (j$.util.Objects.equals(componentName2.getPackageName(), "com.google.android.projection.gearhead")) {
            lufVar = luf.b;
        } else {
            lufVar = zEquals ? luf.a : luf.c;
        }
        return new wif(lufVar, lugVar, zEquals ? luh.d : luh.e, componentName2, z);
    }

    public static final void e(defpackage.cgf cgfVar, defpackage.cld cldVar, defpackage.bmz bmzVar, defpackage.bna bnaVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        defpackage.cld cldVar2;
        defpackage.bmz bmzVar2;
        defpackage.affh affhVar2;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar3;
        defpackage.bmz bmzVar3;
        defpackage.bna bnaVar2;
        defpackage.cld cldVarB;
        defpackage.bmz bmzVarF;
        defpackage.cgf cgfVar4;
        defpackage.bmz bmzVar4;
        defpackage.cld cldVar4;
        int i4;
        defpackage.bna bnaVarE;
        affhVar.getClass();
        int i5 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(-672961241);
        if (i5 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i6 = 32;
                }
            } else {
                cldVar2 = cldVar;
            }
            i3 |= i6;
        } else {
            cldVar2 = cldVar;
        }
        if ((i & 384) == 0) {
            int i7 = 128;
            if ((i2 & 4) == 0) {
                bmzVar2 = bmzVar;
                if (bveVarC.C(bmzVar2)) {
                    i7 = 256;
                }
            } else {
                bmzVar2 = bmzVar;
            }
            i3 |= i7;
        } else {
            bmzVar2 = bmzVar;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            affhVar2 = affhVar;
            i8 |= true != bveVarC.E(affhVar2) ? 65536 : 131072;
        } else {
            affhVar2 = affhVar;
        }
        if (bveVarC.I((74899 & i8) != 74898, i8 & 1)) {
            int i9 = i2 & 4;
            int i10 = i2 & 2;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.cgf cgfVar5 = i5 != 0 ? defpackage.cgf.e : cgfVar2;
                if (i10 != 0) {
                    i8 &= -113;
                    cldVarB = defpackage.vz.b(bveVarC);
                } else {
                    cldVarB = cldVar2;
                }
                if (i9 != 0) {
                    bmzVarF = f(0L, bveVarC, 15);
                    i8 &= -897;
                } else {
                    bmzVarF = bmzVar2;
                }
                cgfVar4 = cgfVar5;
                bmzVar4 = bmzVarF;
                cldVar4 = cldVarB;
                i4 = i8 & (-7169);
                bnaVarE = defpackage.vz.e(0);
            } else {
                bveVarC.s();
                if (i10 != 0) {
                    i8 &= -113;
                }
                if (i9 != 0) {
                    i8 &= -897;
                }
                i4 = i8 & (-7169);
                bnaVarE = bnaVar;
                cgfVar4 = cgfVar2;
                cldVar4 = cldVar2;
                bmzVar4 = bmzVar2;
            }
            bveVarC.l();
            defpackage.wf.a(cgfVar4, cldVar4, bmzVar4, bnaVarE, null, affhVar2, bveVarC, i4 & 517118, 0);
            cgfVar3 = cgfVar4;
            cldVar3 = cldVar4;
            bmzVar3 = bmzVar4;
            bnaVar2 = bnaVarE;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            cldVar3 = cldVar2;
            bmzVar3 = bmzVar2;
            bnaVar2 = bnaVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.kus(cgfVar3, cldVar3, bmzVar3, bnaVar2, affhVar, i, i2, 0);
        }
    }

    public static final defpackage.bmz f(long j, defpackage.bve bveVar, int i) {
        if ((i & 1) != 0) {
            j = defpackage.kfp.i(bveVar).G();
        }
        long j2 = j;
        return new defpackage.bmz(j2, defpackage.bnl.d(j2, bveVar), defpackage.cjv.m(defpackage.ckd.h(defpackage.kfp.i(bveVar).G(), 0.38f), defpackage.bnl.b(defpackage.bxi.n(bveVar), 0.0f)), defpackage.ckd.h(defpackage.bnl.d(j2, bveVar), 0.38f));
    }

    public static final void g(android.view.View view, com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor focusInterceptor) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new kwm(view, focusInterceptor, viewTreeObserver));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:120:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x026d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0273  */
    /* JADX WARN: Code duplicated, block: B:127:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02de  */
    /* JADX WARN: Code duplicated, block: B:143:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:151:0x032b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0343  */
    /* JADX WARN: Code duplicated, block: B:156:0x0351  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [bwc] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v8, types: [bwc] */
    /* JADX WARN: Type inference failed for: r6v9, types: [bwc] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v19 */
    public static final void h(defpackage.aqk aqkVar, defpackage.cgf cgfVar, boolean z, defpackage.affh affhVar, defpackage.affh affhVar2, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        boolean zB;
        int i4;
        int i5;
        boolean z2;
        defpackage.affh affhVar3;
        defpackage.cgf cgfVar3;
        boolean z3;
        defpackage.affh affhVar4;
        defpackage.bxl bxlVarJ;
        int i6;
        int i7;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        int i8;
        defpackage.cgf cgfVar5;
        boolean z4;
        defpackage.affh affhVar5;
        java.lang.Object objS;
        java.lang.Object obj;
        aiuw aiuwVar;
        java.lang.Object objS2;
        defpackage.afer aferVar;
        defpackage.affg affgVar;
        defpackage.affg affgVar2;
        defpackage.affh affhVar6;
        defpackage.affg affgVar3;
        defpackage.affh affhVar7;
        int i9;
        java.lang.Object obj2;
        defpackage.bwc bwcVar2;
        defpackage.affg affgVar4;
        defpackage.afer aferVar2;
        ?? r0;
        int i10;
        ?? r6;
        int i11;
        ?? r9;
        ?? r7;
        java.lang.Object objS3;
        ?? r8;
        int i12;
        boolean z5;
        boolean z6;
        java.lang.Object objS4;
        int i13;
        boolean zE;
        int i14;
        defpackage.affh affhVar8 = affhVar;
        aqkVar.getClass();
        defpackage.bve bveVarC = bveVar.c(-1159638926);
        if ((i & 6) == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(aqkVar) : bveVarC.E(aqkVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                i14 = 128;
                if ((i2 & 4) == 0) {
                    zB = z;
                    if (bveVarC.D(zB)) {
                        i14 = 256;
                    }
                } else {
                    zB = z;
                }
                i3 |= i14;
            } else {
                zB = z;
            }
            if ((i & 3072) == 0) {
                i13 = 1024;
                if ((i2 & 8) == 0) {
                    if ((i & 4096) == 0) {
                        zE = bveVarC.C(affhVar8);
                    } else {
                        zE = bveVarC.E(affhVar8);
                    }
                    if (zE) {
                        i13 = 2048;
                    }
                }
                i3 |= i13;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar2)) {
                        i5 = 8192;
                    } else {
                        i5 = 16384;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i3 & 1)) {
                    i6 = i2 & 8;
                    i7 = i2 & 4;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i7 != 0) {
                            i3 &= -897;
                            kwb kwbVar = kwb.a;
                            zB = kwb.b(bveVarC);
                        }
                        if (i6 != 0) {
                            kwb kwbVar2 = kwb.a;
                            i3 &= -7169;
                            affhVar8 = kwb.b;
                        }
                        if (i4 != 0) {
                            i8 = i3;
                            cgfVar5 = cgfVar4;
                            z4 = zB;
                            affhVar5 = kvn.a;
                        } else {
                            i8 = i3;
                            cgfVar5 = cgfVar4;
                        }
                        bveVarC.l();
                        objS = bwcVar.S();
                        obj = defpackage.bvd.a;
                        if (objS == obj) {
                            objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                            bwcVar.ad(objS);
                        }
                        aiuwVar = (aiuw) objS;
                        objS2 = bwcVar.S();
                        if (objS2 == obj) {
                            objS2 = new defpackage.kmu(5);
                            bwcVar.ad(objS2);
                        }
                        defpackage.cgf cgfVarQ = defpackage.awj.q(defpackage.bzd.r(cgfVar5, (defpackage.affc) objS2), defpackage.ktf.c.h, 0.0f, 2);
                        defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
                        int iF = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh = bwcVar.ah();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarQ);
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.affg affgVar5 = defpackage.cwl.e;
                        defpackage.byw.c(bveVarC, ctyVarA, affgVar5);
                        defpackage.affg affgVar6 = defpackage.cwl.d;
                        defpackage.byw.c(bveVarC, cddVarAh, affgVar6);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
                        affgVar = defpackage.cwl.f;
                        defpackage.byw.c(bveVarC, numValueOf, affgVar);
                        defpackage.affc affcVar = defpackage.cwl.g;
                        defpackage.byw.b(bveVarC, affcVar);
                        affgVar2 = defpackage.cwl.c;
                        defpackage.byw.c(bveVarC, cgfVarN, affgVar2);
                        if (z4) {
                            i12 = i8 & 14;
                            int i16 = (i8 & 7168) ^ 3072;
                            bveVarC.v(212980776);
                            defpackage.cne cneVarH = defpackage.day.h(2131231936, bveVarC, 0);
                            boolean zG = aqkVar.g();
                            defpackage.affh affhVar9 = affhVar5;
                            defpackage.ktf ktfVar = defpackage.ktf.a;
                            boolean zE2 = ((i16 <= 2048 && bveVarC.E(affhVar8)) || (i8 & 3072) == 2048) | bveVarC.E(aiuwVar);
                            if (i12 != 4 || ((i8 & 8) != 0 && bveVarC.E(aqkVar))) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = z5 | zE2;
                            objS4 = bwcVar.S();
                            if (!z6 || objS4 == obj) {
                                affhVar6 = affhVar8;
                                defpackage.ah ahVar = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                                bwcVar.ad(ahVar);
                                objS4 = ahVar;
                            } else {
                                affhVar6 = affhVar8;
                            }
                            defpackage.afer aferVar3 = (defpackage.afer) objS4;
                            i9 = i8;
                            affhVar7 = affhVar9;
                            affgVar3 = affgVar2;
                            obj2 = obj;
                            affgVar4 = affgVar;
                            aferVar2 = aferVar;
                            r0 = 0;
                            bwcVar2 = bwcVar;
                            defpackage.khg.m(cneVarH, aferVar3, null, ktfVar, zG, null, null, null, null, bveVarC, 8, 0, 4068);
                            bveVarC = bveVarC;
                            bwcVar2.Y(false);
                        } else {
                            affhVar6 = affhVar8;
                            affgVar3 = affgVar2;
                            affhVar7 = affhVar5;
                            i9 = i8;
                            obj2 = obj;
                            bwcVar2 = bwcVar;
                            affgVar4 = affgVar;
                            aferVar2 = aferVar;
                            r0 = 0;
                            bveVarC.v(213230822);
                            bwcVar2.Y(false);
                        }
                        defpackage.cgf cgfVarB = defpackage.atx.b(defpackage.cgf.e, 1.0f, true);
                        defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, r0);
                        int iF2 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh2 = bwcVar2.ah();
                        defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarB);
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB, affgVar5);
                        defpackage.byw.c(bveVarC, cddVarAh2, affgVar6);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar4);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN2, affgVar3);
                        i10 = i9;
                        defpackage.affh affhVar10 = affhVar7;
                        affhVar10.invoke(defpackage.ats.a, bveVarC, java.lang.Integer.valueOf(((i10 >> 9) & 112) | 6));
                        bwcVar2.Y(true);
                        if (z4) {
                            i11 = i10 & 14;
                            int i17 = (i10 & 7168) ^ 3072;
                            bveVarC.v(213323016);
                            defpackage.cne cneVarH2 = defpackage.day.h(2131231935, bveVarC, r0);
                            boolean zH = aqkVar.h();
                            defpackage.ktf ktfVar2 = defpackage.ktf.a;
                            int i18 = (((i17 > 2048 || !bveVarC.E(affhVar6)) && (i10 & 3072) != 2048) ? r0 : 1) | (bveVarC.E(aiuwVar) ? 1 : 0);
                            if (i11 != 4 || ((i10 & 8) != 0 && bveVarC.E(aqkVar))) {
                                r9 = 1;
                            } else {
                                r9 = r0;
                            }
                            r7 = i18 | r9;
                            objS3 = bwcVar2.S();
                            if (r7 == 0 || objS3 == obj2) {
                                defpackage.bwc bwcVar3 = bwcVar2;
                                defpackage.ah ahVar2 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                                bwcVar3.ad(ahVar2);
                                objS3 = ahVar2;
                                r8 = bwcVar3;
                            } else {
                                r8 = bwcVar2;
                            }
                            defpackage.bve bveVar2 = bveVarC;
                            defpackage.khg.m(cneVarH2, (defpackage.afer) objS3, null, ktfVar2, zH, null, null, null, null, bveVar2, 8, 0, 4068);
                            bveVarC = bveVar2;
                            r8.Y(r0);
                            r6 = r8;
                        } else {
                            ?? r10 = bwcVar2;
                            bveVarC.v(213573062);
                            r10.Y(r0);
                            r6 = r10;
                        }
                        r6.Y(true);
                        affhVar3 = affhVar6;
                        z3 = z4;
                        cgfVar3 = cgfVar5;
                        affhVar4 = affhVar10;
                    } else {
                        bveVarC.s();
                        if (i7 != 0) {
                            i3 &= -897;
                        }
                        if (i6 != 0) {
                            i3 &= -7169;
                        }
                        i8 = i3;
                        cgfVar5 = cgfVar2;
                    }
                    z4 = zB;
                    affhVar5 = affhVar2;
                    bveVarC.l();
                    objS = bwcVar.S();
                    obj = defpackage.bvd.a;
                    if (objS == obj) {
                        objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                        bwcVar.ad(objS);
                    }
                    aiuwVar = (aiuw) objS;
                    objS2 = bwcVar.S();
                    if (objS2 == obj) {
                        objS2 = new defpackage.kmu(5);
                        bwcVar.ad(objS2);
                    }
                    defpackage.cgf cgfVarQ2 = defpackage.awj.q(defpackage.bzd.r(cgfVar5, (defpackage.affc) objS2), defpackage.ktf.c.h, 0.0f, 2);
                    defpackage.cty ctyVarA2 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
                    int iF3 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh3 = bwcVar.ah();
                    defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarQ2);
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.affg affgVar7 = defpackage.cwl.e;
                    defpackage.byw.c(bveVarC, ctyVarA2, affgVar7);
                    defpackage.affg affgVar8 = defpackage.cwl.d;
                    defpackage.byw.c(bveVarC, cddVarAh3, affgVar8);
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iF3);
                    affgVar = defpackage.cwl.f;
                    defpackage.byw.c(bveVarC, numValueOf2, affgVar);
                    defpackage.affc affcVar2 = defpackage.cwl.g;
                    defpackage.byw.b(bveVarC, affcVar2);
                    affgVar2 = defpackage.cwl.c;
                    defpackage.byw.c(bveVarC, cgfVarN3, affgVar2);
                    if (z4) {
                        i12 = i8 & 14;
                        int i19 = (i8 & 7168) ^ 3072;
                        bveVarC.v(212980776);
                        defpackage.cne cneVarH3 = defpackage.day.h(2131231936, bveVarC, 0);
                        boolean zG2 = aqkVar.g();
                        defpackage.affh affhVar11 = affhVar5;
                        defpackage.ktf ktfVar3 = defpackage.ktf.a;
                        boolean zE3 = ((i19 <= 2048 && bveVarC.E(affhVar8)) || (i8 & 3072) == 2048) | bveVarC.E(aiuwVar);
                        if (i12 != 4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z5 | zE3;
                        objS4 = bwcVar.S();
                        if (z6) {
                            affhVar6 = affhVar8;
                            defpackage.ah ahVar3 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                            bwcVar.ad(ahVar3);
                            objS4 = ahVar3;
                        } else {
                            affhVar6 = affhVar8;
                            defpackage.ah ahVar4 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                            bwcVar.ad(ahVar4);
                            objS4 = ahVar4;
                        }
                        defpackage.afer aferVar4 = (defpackage.afer) objS4;
                        i9 = i8;
                        affhVar7 = affhVar11;
                        affgVar3 = affgVar2;
                        obj2 = obj;
                        affgVar4 = affgVar;
                        aferVar2 = aferVar;
                        r0 = 0;
                        bwcVar2 = bwcVar;
                        defpackage.khg.m(cneVarH3, aferVar4, null, ktfVar3, zG2, null, null, null, null, bveVarC, 8, 0, 4068);
                        bveVarC = bveVarC;
                        bwcVar2.Y(false);
                    } else {
                        affhVar6 = affhVar8;
                        affgVar3 = affgVar2;
                        affhVar7 = affhVar5;
                        i9 = i8;
                        obj2 = obj;
                        bwcVar2 = bwcVar;
                        affgVar4 = affgVar;
                        aferVar2 = aferVar;
                        r0 = 0;
                        bveVarC.v(213230822);
                        bwcVar2.Y(false);
                    }
                    defpackage.cgf cgfVarB2 = defpackage.atx.b(defpackage.cgf.e, 1.0f, true);
                    defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.a, r0);
                    int iF4 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh4 = bwcVar2.ah();
                    defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarB2);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB2, affgVar7);
                    defpackage.byw.c(bveVarC, cddVarAh4, affgVar8);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), affgVar4);
                    defpackage.byw.b(bveVarC, affcVar2);
                    defpackage.byw.c(bveVarC, cgfVarN4, affgVar3);
                    i10 = i9;
                    defpackage.affh affhVar12 = affhVar7;
                    affhVar12.invoke(defpackage.ats.a, bveVarC, java.lang.Integer.valueOf(((i10 >> 9) & 112) | 6));
                    bwcVar2.Y(true);
                    if (z4) {
                        i11 = i10 & 14;
                        int i110 = (i10 & 7168) ^ 3072;
                        bveVarC.v(213323016);
                        defpackage.cne cneVarH4 = defpackage.day.h(2131231935, bveVarC, r0);
                        boolean zH2 = aqkVar.h();
                        defpackage.ktf ktfVar4 = defpackage.ktf.a;
                        int i111 = (((i110 > 2048 || !bveVarC.E(affhVar6)) && (i10 & 3072) != 2048) ? r0 : 1) | (bveVarC.E(aiuwVar) ? 1 : 0);
                        if (i11 != 4) {
                            r9 = 1;
                        } else {
                            r9 = 1;
                        }
                        r7 = i111 | r9;
                        objS3 = bwcVar2.S();
                        if (r7 == 0) {
                            defpackage.bwc bwcVar4 = bwcVar2;
                            defpackage.ah ahVar5 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                            bwcVar4.ad(ahVar5);
                            objS3 = ahVar5;
                            r8 = bwcVar4;
                        } else {
                            defpackage.bwc bwcVar5 = bwcVar2;
                            defpackage.ah ahVar6 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                            bwcVar5.ad(ahVar6);
                            objS3 = ahVar6;
                            r8 = bwcVar5;
                        }
                        defpackage.bve bveVar3 = bveVarC;
                        defpackage.khg.m(cneVarH4, (defpackage.afer) objS3, null, ktfVar4, zH2, null, null, null, null, bveVar3, 8, 0, 4068);
                        bveVarC = bveVar3;
                        r8.Y(r0);
                        r6 = r8;
                    } else {
                        ?? r11 = bwcVar2;
                        bveVarC.v(213573062);
                        r11.Y(r0);
                        r6 = r11;
                    }
                    r6.Y(true);
                    affhVar3 = affhVar6;
                    z3 = z4;
                    cgfVar3 = cgfVar5;
                    affhVar4 = affhVar12;
                } else {
                    bveVarC.s();
                    affhVar3 = affhVar8;
                    cgfVar3 = cgfVar2;
                    z3 = zB;
                    affhVar4 = affhVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new gwe(aqkVar, cgfVar3, z3, affhVar3, affhVar4, i, i2, 3);
                }
            }
            i3 |= 24576;
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i3 & 1)) {
                i6 = i2 & 8;
                i7 = i2 & 4;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        kwb kwbVar3 = kwb.a;
                        zB = kwb.b(bveVarC);
                    }
                    if (i6 != 0) {
                        kwb kwbVar4 = kwb.a;
                        i3 &= -7169;
                        affhVar8 = kwb.b;
                    }
                    if (i4 != 0) {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = kvn.a;
                    } else {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = affhVar2;
                    }
                } else {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        kwb kwbVar5 = kwb.a;
                        zB = kwb.b(bveVarC);
                    }
                    if (i6 != 0) {
                        kwb kwbVar6 = kwb.a;
                        i3 &= -7169;
                        affhVar8 = kwb.b;
                    }
                    if (i4 != 0) {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = kvn.a;
                    } else {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = affhVar2;
                    }
                }
                bveVarC.l();
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                    bwcVar.ad(objS);
                }
                aiuwVar = (aiuw) objS;
                objS2 = bwcVar.S();
                if (objS2 == obj) {
                    objS2 = new defpackage.kmu(5);
                    bwcVar.ad(objS2);
                }
                defpackage.cgf cgfVarQ3 = defpackage.awj.q(defpackage.bzd.r(cgfVar5, (defpackage.affc) objS2), defpackage.ktf.c.h, 0.0f, 2);
                defpackage.cty ctyVarA3 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
                int iF5 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh5 = bwcVar.ah();
                defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarQ3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.affg affgVar9 = defpackage.cwl.e;
                defpackage.byw.c(bveVarC, ctyVarA3, affgVar9);
                defpackage.affg affgVar10 = defpackage.cwl.d;
                defpackage.byw.c(bveVarC, cddVarAh5, affgVar10);
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(iF5);
                affgVar = defpackage.cwl.f;
                defpackage.byw.c(bveVarC, numValueOf3, affgVar);
                defpackage.affc affcVar3 = defpackage.cwl.g;
                defpackage.byw.b(bveVarC, affcVar3);
                affgVar2 = defpackage.cwl.c;
                defpackage.byw.c(bveVarC, cgfVarN5, affgVar2);
                if (z4) {
                    i12 = i8 & 14;
                    int i112 = (i8 & 7168) ^ 3072;
                    bveVarC.v(212980776);
                    defpackage.cne cneVarH5 = defpackage.day.h(2131231936, bveVarC, 0);
                    boolean zG3 = aqkVar.g();
                    defpackage.affh affhVar13 = affhVar5;
                    defpackage.ktf ktfVar5 = defpackage.ktf.a;
                    boolean zE4 = ((i112 <= 2048 && bveVarC.E(affhVar8)) || (i8 & 3072) == 2048) | bveVarC.E(aiuwVar);
                    if (i12 != 4) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z5 | zE4;
                    objS4 = bwcVar.S();
                    if (z6) {
                        affhVar6 = affhVar8;
                        defpackage.ah ahVar7 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                        bwcVar.ad(ahVar7);
                        objS4 = ahVar7;
                    } else {
                        affhVar6 = affhVar8;
                        defpackage.ah ahVar8 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                        bwcVar.ad(ahVar8);
                        objS4 = ahVar8;
                    }
                    defpackage.afer aferVar5 = (defpackage.afer) objS4;
                    i9 = i8;
                    affhVar7 = affhVar13;
                    affgVar3 = affgVar2;
                    obj2 = obj;
                    affgVar4 = affgVar;
                    aferVar2 = aferVar;
                    r0 = 0;
                    bwcVar2 = bwcVar;
                    defpackage.khg.m(cneVarH5, aferVar5, null, ktfVar5, zG3, null, null, null, null, bveVarC, 8, 0, 4068);
                    bveVarC = bveVarC;
                    bwcVar2.Y(false);
                } else {
                    affhVar6 = affhVar8;
                    affgVar3 = affgVar2;
                    affhVar7 = affhVar5;
                    i9 = i8;
                    obj2 = obj;
                    bwcVar2 = bwcVar;
                    affgVar4 = affgVar;
                    aferVar2 = aferVar;
                    r0 = 0;
                    bveVarC.v(213230822);
                    bwcVar2.Y(false);
                }
                defpackage.cgf cgfVarB3 = defpackage.atx.b(defpackage.cgf.e, 1.0f, true);
                defpackage.cty ctyVarB3 = defpackage.atp.b(defpackage.cfs.a, r0);
                int iF6 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh6 = bwcVar2.ah();
                defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarB3);
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB3, affgVar9);
                defpackage.byw.c(bveVarC, cddVarAh6, affgVar10);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF6), affgVar4);
                defpackage.byw.b(bveVarC, affcVar3);
                defpackage.byw.c(bveVarC, cgfVarN6, affgVar3);
                i10 = i9;
                defpackage.affh affhVar14 = affhVar7;
                affhVar14.invoke(defpackage.ats.a, bveVarC, java.lang.Integer.valueOf(((i10 >> 9) & 112) | 6));
                bwcVar2.Y(true);
                if (z4) {
                    i11 = i10 & 14;
                    int i113 = (i10 & 7168) ^ 3072;
                    bveVarC.v(213323016);
                    defpackage.cne cneVarH6 = defpackage.day.h(2131231935, bveVarC, r0);
                    boolean zH3 = aqkVar.h();
                    defpackage.ktf ktfVar6 = defpackage.ktf.a;
                    int i114 = (((i113 > 2048 || !bveVarC.E(affhVar6)) && (i10 & 3072) != 2048) ? r0 : 1) | (bveVarC.E(aiuwVar) ? 1 : 0);
                    if (i11 != 4) {
                        r9 = 1;
                    } else {
                        r9 = 1;
                    }
                    r7 = i114 | r9;
                    objS3 = bwcVar2.S();
                    if (r7 == 0) {
                        defpackage.bwc bwcVar6 = bwcVar2;
                        defpackage.ah ahVar9 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                        bwcVar6.ad(ahVar9);
                        objS3 = ahVar9;
                        r8 = bwcVar6;
                    } else {
                        defpackage.bwc bwcVar7 = bwcVar2;
                        defpackage.ah ahVar10 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                        bwcVar7.ad(ahVar10);
                        objS3 = ahVar10;
                        r8 = bwcVar7;
                    }
                    defpackage.bve bveVar4 = bveVarC;
                    defpackage.khg.m(cneVarH6, (defpackage.afer) objS3, null, ktfVar6, zH3, null, null, null, null, bveVar4, 8, 0, 4068);
                    bveVarC = bveVar4;
                    r8.Y(r0);
                    r6 = r8;
                } else {
                    ?? r12 = bwcVar2;
                    bveVarC.v(213573062);
                    r12.Y(r0);
                    r6 = r12;
                }
                r6.Y(true);
                affhVar3 = affhVar6;
                z3 = z4;
                cgfVar3 = cgfVar5;
                affhVar4 = affhVar14;
            } else {
                bveVarC.s();
                affhVar3 = affhVar8;
                cgfVar3 = cgfVar2;
                z3 = zB;
                affhVar4 = affhVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gwe(aqkVar, cgfVar3, z3, affhVar3, affhVar4, i, i2, 3);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        if ((i & 384) == 0) {
            i14 = 128;
            if ((i2 & 4) == 0) {
                zB = z;
                if (bveVarC.D(zB)) {
                    i14 = 256;
                }
            } else {
                zB = z;
            }
            i3 |= i14;
        } else {
            zB = z;
        }
        if ((i & 3072) == 0) {
            i13 = 1024;
            if ((i2 & 8) == 0) {
                if ((i & 4096) == 0) {
                    zE = bveVarC.C(affhVar8);
                } else {
                    zE = bveVarC.E(affhVar8);
                }
                if (zE) {
                    i13 = 2048;
                }
            }
            i3 |= i13;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar2)) {
                    i5 = 8192;
                } else {
                    i5 = 16384;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i3 & 1)) {
                i6 = i2 & 8;
                i7 = i2 & 4;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        kwb kwbVar7 = kwb.a;
                        zB = kwb.b(bveVarC);
                    }
                    if (i6 != 0) {
                        kwb kwbVar8 = kwb.a;
                        i3 &= -7169;
                        affhVar8 = kwb.b;
                    }
                    if (i4 != 0) {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = kvn.a;
                    } else {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = affhVar2;
                    }
                } else {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        kwb kwbVar9 = kwb.a;
                        zB = kwb.b(bveVarC);
                    }
                    if (i6 != 0) {
                        kwb kwbVar10 = kwb.a;
                        i3 &= -7169;
                        affhVar8 = kwb.b;
                    }
                    if (i4 != 0) {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = kvn.a;
                    } else {
                        i8 = i3;
                        cgfVar5 = cgfVar4;
                        z4 = zB;
                        affhVar5 = affhVar2;
                    }
                }
                bveVarC.l();
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                    bwcVar.ad(objS);
                }
                aiuwVar = (aiuw) objS;
                objS2 = bwcVar.S();
                if (objS2 == obj) {
                    objS2 = new defpackage.kmu(5);
                    bwcVar.ad(objS2);
                }
                defpackage.cgf cgfVarQ4 = defpackage.awj.q(defpackage.bzd.r(cgfVar5, (defpackage.affc) objS2), defpackage.ktf.c.h, 0.0f, 2);
                defpackage.cty ctyVarA4 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
                int iF7 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh7 = bwcVar.ah();
                defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarQ4);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.affg affgVar11 = defpackage.cwl.e;
                defpackage.byw.c(bveVarC, ctyVarA4, affgVar11);
                defpackage.affg affgVar12 = defpackage.cwl.d;
                defpackage.byw.c(bveVarC, cddVarAh7, affgVar12);
                java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(iF7);
                affgVar = defpackage.cwl.f;
                defpackage.byw.c(bveVarC, numValueOf4, affgVar);
                defpackage.affc affcVar4 = defpackage.cwl.g;
                defpackage.byw.b(bveVarC, affcVar4);
                affgVar2 = defpackage.cwl.c;
                defpackage.byw.c(bveVarC, cgfVarN7, affgVar2);
                if (z4) {
                    i12 = i8 & 14;
                    int i115 = (i8 & 7168) ^ 3072;
                    bveVarC.v(212980776);
                    defpackage.cne cneVarH7 = defpackage.day.h(2131231936, bveVarC, 0);
                    boolean zG4 = aqkVar.g();
                    defpackage.affh affhVar15 = affhVar5;
                    defpackage.ktf ktfVar7 = defpackage.ktf.a;
                    boolean zE5 = ((i115 <= 2048 && bveVarC.E(affhVar8)) || (i8 & 3072) == 2048) | bveVarC.E(aiuwVar);
                    if (i12 != 4) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z5 | zE5;
                    objS4 = bwcVar.S();
                    if (z6) {
                        affhVar6 = affhVar8;
                        defpackage.ah ahVar11 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                        bwcVar.ad(ahVar11);
                        objS4 = ahVar11;
                    } else {
                        affhVar6 = affhVar8;
                        defpackage.ah ahVar12 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                        bwcVar.ad(ahVar12);
                        objS4 = ahVar12;
                    }
                    defpackage.afer aferVar6 = (defpackage.afer) objS4;
                    i9 = i8;
                    affhVar7 = affhVar15;
                    affgVar3 = affgVar2;
                    obj2 = obj;
                    affgVar4 = affgVar;
                    aferVar2 = aferVar;
                    r0 = 0;
                    bwcVar2 = bwcVar;
                    defpackage.khg.m(cneVarH7, aferVar6, null, ktfVar7, zG4, null, null, null, null, bveVarC, 8, 0, 4068);
                    bveVarC = bveVarC;
                    bwcVar2.Y(false);
                } else {
                    affhVar6 = affhVar8;
                    affgVar3 = affgVar2;
                    affhVar7 = affhVar5;
                    i9 = i8;
                    obj2 = obj;
                    bwcVar2 = bwcVar;
                    affgVar4 = affgVar;
                    aferVar2 = aferVar;
                    r0 = 0;
                    bveVarC.v(213230822);
                    bwcVar2.Y(false);
                }
                defpackage.cgf cgfVarB4 = defpackage.atx.b(defpackage.cgf.e, 1.0f, true);
                defpackage.cty ctyVarB4 = defpackage.atp.b(defpackage.cfs.a, r0);
                int iF8 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh8 = bwcVar2.ah();
                defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarB4);
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB4, affgVar11);
                defpackage.byw.c(bveVarC, cddVarAh8, affgVar12);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF8), affgVar4);
                defpackage.byw.b(bveVarC, affcVar4);
                defpackage.byw.c(bveVarC, cgfVarN8, affgVar3);
                i10 = i9;
                defpackage.affh affhVar16 = affhVar7;
                affhVar16.invoke(defpackage.ats.a, bveVarC, java.lang.Integer.valueOf(((i10 >> 9) & 112) | 6));
                bwcVar2.Y(true);
                if (z4) {
                    i11 = i10 & 14;
                    int i116 = (i10 & 7168) ^ 3072;
                    bveVarC.v(213323016);
                    defpackage.cne cneVarH8 = defpackage.day.h(2131231935, bveVarC, r0);
                    boolean zH4 = aqkVar.h();
                    defpackage.ktf ktfVar8 = defpackage.ktf.a;
                    int i117 = (((i116 > 2048 || !bveVarC.E(affhVar6)) && (i10 & 3072) != 2048) ? r0 : 1) | (bveVarC.E(aiuwVar) ? 1 : 0);
                    if (i11 != 4) {
                        r9 = 1;
                    } else {
                        r9 = 1;
                    }
                    r7 = i117 | r9;
                    objS3 = bwcVar2.S();
                    if (r7 == 0) {
                        defpackage.bwc bwcVar8 = bwcVar2;
                        defpackage.ah ahVar13 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                        bwcVar8.ad(ahVar13);
                        objS3 = ahVar13;
                        r8 = bwcVar8;
                    } else {
                        defpackage.bwc bwcVar9 = bwcVar2;
                        defpackage.ah ahVar14 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                        bwcVar9.ad(ahVar14);
                        objS3 = ahVar14;
                        r8 = bwcVar9;
                    }
                    defpackage.bve bveVar5 = bveVarC;
                    defpackage.khg.m(cneVarH8, (defpackage.afer) objS3, null, ktfVar8, zH4, null, null, null, null, bveVar5, 8, 0, 4068);
                    bveVarC = bveVar5;
                    r8.Y(r0);
                    r6 = r8;
                } else {
                    ?? r13 = bwcVar2;
                    bveVarC.v(213573062);
                    r13.Y(r0);
                    r6 = r13;
                }
                r6.Y(true);
                affhVar3 = affhVar6;
                z3 = z4;
                cgfVar3 = cgfVar5;
                affhVar4 = affhVar16;
            } else {
                bveVarC.s();
                affhVar3 = affhVar8;
                cgfVar3 = cgfVar2;
                z3 = zB;
                affhVar4 = affhVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gwe(aqkVar, cgfVar3, z3, affhVar3, affhVar4, i, i2, 3);
            }
        }
        i3 |= 24576;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bveVarC.I(z2, i3 & 1)) {
            i6 = i2 & 8;
            i7 = i2 & 4;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    kwb kwbVar11 = kwb.a;
                    zB = kwb.b(bveVarC);
                }
                if (i6 != 0) {
                    kwb kwbVar12 = kwb.a;
                    i3 &= -7169;
                    affhVar8 = kwb.b;
                }
                if (i4 != 0) {
                    i8 = i3;
                    cgfVar5 = cgfVar4;
                    z4 = zB;
                    affhVar5 = kvn.a;
                } else {
                    i8 = i3;
                    cgfVar5 = cgfVar4;
                    z4 = zB;
                    affhVar5 = affhVar2;
                }
            } else {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    kwb kwbVar13 = kwb.a;
                    zB = kwb.b(bveVarC);
                }
                if (i6 != 0) {
                    kwb kwbVar14 = kwb.a;
                    i3 &= -7169;
                    affhVar8 = kwb.b;
                }
                if (i4 != 0) {
                    i8 = i3;
                    cgfVar5 = cgfVar4;
                    z4 = zB;
                    affhVar5 = kvn.a;
                } else {
                    i8 = i3;
                    cgfVar5 = cgfVar4;
                    z4 = zB;
                    affhVar5 = affhVar2;
                }
            }
            bveVarC.l();
            objS = bwcVar.S();
            obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS);
            }
            aiuwVar = (aiuw) objS;
            objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.kmu(5);
                bwcVar.ad(objS2);
            }
            defpackage.cgf cgfVarQ5 = defpackage.awj.q(defpackage.bzd.r(cgfVar5, (defpackage.affc) objS2), defpackage.ktf.c.h, 0.0f, 2);
            defpackage.cty ctyVarA5 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
            int iF9 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh9 = bwcVar.ah();
            defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVarC, cgfVarQ5);
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar13 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA5, affgVar13);
            defpackage.affg affgVar14 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh9, affgVar14);
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(iF9);
            affgVar = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf5, affgVar);
            defpackage.affc affcVar5 = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar5);
            affgVar2 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN9, affgVar2);
            if (z4) {
                i12 = i8 & 14;
                int i118 = (i8 & 7168) ^ 3072;
                bveVarC.v(212980776);
                defpackage.cne cneVarH9 = defpackage.day.h(2131231936, bveVarC, 0);
                boolean zG5 = aqkVar.g();
                defpackage.affh affhVar17 = affhVar5;
                defpackage.ktf ktfVar9 = defpackage.ktf.a;
                boolean zE6 = ((i118 <= 2048 && bveVarC.E(affhVar8)) || (i8 & 3072) == 2048) | bveVarC.E(aiuwVar);
                if (i12 != 4) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z5 | zE6;
                objS4 = bwcVar.S();
                if (z6) {
                    affhVar6 = affhVar8;
                    defpackage.ah ahVar15 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                    bwcVar.ad(ahVar15);
                    objS4 = ahVar15;
                } else {
                    affhVar6 = affhVar8;
                    defpackage.ah ahVar16 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 16, (short[]) null);
                    bwcVar.ad(ahVar16);
                    objS4 = ahVar16;
                }
                defpackage.afer aferVar7 = (defpackage.afer) objS4;
                i9 = i8;
                affhVar7 = affhVar17;
                affgVar3 = affgVar2;
                obj2 = obj;
                affgVar4 = affgVar;
                aferVar2 = aferVar;
                r0 = 0;
                bwcVar2 = bwcVar;
                defpackage.khg.m(cneVarH9, aferVar7, null, ktfVar9, zG5, null, null, null, null, bveVarC, 8, 0, 4068);
                bveVarC = bveVarC;
                bwcVar2.Y(false);
            } else {
                affhVar6 = affhVar8;
                affgVar3 = affgVar2;
                affhVar7 = affhVar5;
                i9 = i8;
                obj2 = obj;
                bwcVar2 = bwcVar;
                affgVar4 = affgVar;
                aferVar2 = aferVar;
                r0 = 0;
                bveVarC.v(213230822);
                bwcVar2.Y(false);
            }
            defpackage.cgf cgfVarB5 = defpackage.atx.b(defpackage.cgf.e, 1.0f, true);
            defpackage.cty ctyVarB5 = defpackage.atp.b(defpackage.cfs.a, r0);
            int iF10 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh10 = bwcVar2.ah();
            defpackage.cgf cgfVarN10 = defpackage.bzo.n(bveVarC, cgfVarB5);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB5, affgVar13);
            defpackage.byw.c(bveVarC, cddVarAh10, affgVar14);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF10), affgVar4);
            defpackage.byw.b(bveVarC, affcVar5);
            defpackage.byw.c(bveVarC, cgfVarN10, affgVar3);
            i10 = i9;
            defpackage.affh affhVar18 = affhVar7;
            affhVar18.invoke(defpackage.ats.a, bveVarC, java.lang.Integer.valueOf(((i10 >> 9) & 112) | 6));
            bwcVar2.Y(true);
            if (z4) {
                i11 = i10 & 14;
                int i119 = (i10 & 7168) ^ 3072;
                bveVarC.v(213323016);
                defpackage.cne cneVarH10 = defpackage.day.h(2131231935, bveVarC, r0);
                boolean zH5 = aqkVar.h();
                defpackage.ktf ktfVar10 = defpackage.ktf.a;
                int i1110 = (((i119 > 2048 || !bveVarC.E(affhVar6)) && (i10 & 3072) != 2048) ? r0 : 1) | (bveVarC.E(aiuwVar) ? 1 : 0);
                if (i11 != 4) {
                    r9 = 1;
                } else {
                    r9 = 1;
                }
                r7 = i1110 | r9;
                objS3 = bwcVar2.S();
                if (r7 == 0) {
                    defpackage.bwc bwcVar10 = bwcVar2;
                    defpackage.ah ahVar17 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                    bwcVar10.ad(ahVar17);
                    objS3 = ahVar17;
                    r8 = bwcVar10;
                } else {
                    defpackage.bwc bwcVar11 = bwcVar2;
                    defpackage.ah ahVar18 = new defpackage.ah(aiuwVar, affhVar6, aqkVar, 17, (short[]) null);
                    bwcVar11.ad(ahVar18);
                    objS3 = ahVar18;
                    r8 = bwcVar11;
                }
                defpackage.bve bveVar6 = bveVarC;
                defpackage.khg.m(cneVarH10, (defpackage.afer) objS3, null, ktfVar10, zH5, null, null, null, null, bveVar6, 8, 0, 4068);
                bveVarC = bveVar6;
                r8.Y(r0);
                r6 = r8;
            } else {
                ?? r14 = bwcVar2;
                bveVarC.v(213573062);
                r14.Y(r0);
                r6 = r14;
            }
            r6.Y(true);
            affhVar3 = affhVar6;
            z3 = z4;
            cgfVar3 = cgfVar5;
            affhVar4 = affhVar18;
        } else {
            bveVarC.s();
            affhVar3 = affhVar8;
            cgfVar3 = cgfVar2;
            z3 = zB;
            affhVar4 = affhVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gwe(aqkVar, cgfVar3, z3, affhVar3, affhVar4, i, i2, 3);
        }
    }

    public static /* synthetic */ defpackage.cgf i(defpackage.cgf cgfVar, defpackage.aqk aqkVar) {
        defpackage.affg affgVar = kwc.a;
        long jC = defpackage.cjv.c();
        kvy kvyVar = kwc.b;
        cgfVar.getClass();
        aqkVar.getClass();
        kvyVar.getClass();
        return cgfVar.a(new defpackage.cgb(new kvw(jC, kvyVar, aqkVar, 0)));
    }

    public final void j(defpackage.cgf cgfVar, defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(970077674);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.bcf();
                bwcVar.ad(objS);
            }
            defpackage.bcf bcfVar = (defpackage.bcf) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS2);
            }
            aiuw aiuwVar = (aiuw) objS2;
            defpackage.cgf cgfVarR = defpackage.afw.R(cgfVar, bcfVar);
            boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(bcfVar);
            java.lang.Object objS3 = bwcVar.S();
            if (zE || objS3 == obj) {
                objS3 = new defpackage.jxq(aiuwVar, bcfVar, 12, null);
                bwcVar.ad(objS3);
            }
            defpackage.cgf cgfVarS = defpackage.bzd.s(cgfVarR, (defpackage.affc) objS3);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarS);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            affhVar.invoke(defpackage.ats.a, bveVarC, java.lang.Integer.valueOf((i2 & 112) | 6));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kld(this, cgfVar, affhVar, i, 6, (byte[]) null);
        }
    }
}
