package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lvs {
    public static final void A(wif wifVar) {
        T(wifVar, defpackage.zbd.mk);
    }

    public static final defpackage.mqi B(android.content.Context context) {
        context.getClass();
        return new defpackage.mqi(new android.content.ComponentName(context.getPackageName(), com.google.android.apps.auto.components.phone.PhoneCarAppService.class.getName()), (byte[]) null);
    }

    public static defpackage.mdw C() {
        return (defpackage.mdw) defpackage.mkp.a.i(defpackage.mdw.class);
    }

    public static defpackage.mdu D() {
        return (defpackage.mdu) defpackage.mkp.a.i(defpackage.mdu.class);
    }

    public static defpackage.mdq E() {
        return (defpackage.mdq) defpackage.mkp.a.i(defpackage.mdq.class);
    }

    public static final defpackage.eqp F(kjq kjqVar) {
        kkf kkfVar = kjqVar.c;
        byte[] bArr = null;
        klx klxVar = kkfVar != null ? kkfVar.a : null;
        kly klyVar = klxVar != null ? new kly(klxVar.a) : null;
        if (klyVar != null && defpackage.a.X(klyVar.a, 354419973)) {
            kls klsVar = klxVar.b;
            int i = 20;
            return U(defpackage.npu.a.a().a(new npt("acControl", klsVar), new defpackage.niw(klsVar, i)), new defpackage.njy(i));
        }
        if (klyVar != null && defpackage.a.X(klyVar.a, 354419977)) {
            return U(defpackage.npu.a.a().b(klxVar.b), new nli(0));
        }
        if (klyVar == null || !defpackage.a.X(klyVar.a, 354419978)) {
            return defpackage.tcu.b;
        }
        kls klsVar2 = klxVar.b;
        defpackage.npu npuVarA = defpackage.npu.a.a();
        return U(npuVarA.a(new npt("autoControl", klsVar2), new defpackage.nma(npuVarA, klsVar2, 9, bArr)), new nli(1));
    }

    public static final void G(nlh nlhVar, defpackage.bve bveVar, int i) {
        int i2;
        nlh nlhVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-793543294);
        if (i3 == 0) {
            i2 = (true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            nlhVar2 = nlhVar;
            defpackage.lwz.i(nlhVar2, null, null, null, nlb.a, bveVarC, (i2 & 14) | 24576, 14);
        } else {
            nlhVar2 = nlhVar;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlu(nlhVar2, i, 1);
        }
    }

    public static final void H(kkl kklVar, defpackage.afia afiaVar, com.google.android.gms.car.control.CarAction carAction, defpackage.affg affgVar, nlh nlhVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.afer aferVar;
        kkl kklVar2 = kklVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1259206083);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(kklVar2) : bveVarC.E(kklVar2)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(afiaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(carAction) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? bveVarC.C(affgVar) : bveVarC.E(affgVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS);
            }
            aiuw aiuwVar = (aiuw) objS;
            if (kklVar2 instanceof kki) {
                bveVarC.v(764361051);
                boolean zE = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && bveVarC.E(affgVar))) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && bveVarC.E(kklVar2))) | bveVarC.E(aiuwVar) | bveVarC.E(carAction) | bveVarC.E(afiaVar);
                java.lang.Object objS2 = bwcVar.S();
                if (zE || objS2 == obj) {
                    dnc dncVar = new dnc(aiuwVar, carAction, kklVar2, afiaVar, affgVar, 3);
                    kklVar2 = kklVar2;
                    bwcVar.ad(dncVar);
                    objS2 = dncVar;
                }
                aferVar = (defpackage.afer) objS2;
                bwcVar.Y(false);
            } else {
                bveVarC.v(764678925);
                bwcVar.Y(false);
                aferVar = null;
            }
            defpackage.lxy.I(aferVar, null, null, defpackage.dai.as(-895030258, true, new myl(kklVar2, nlhVar, 4), bveVarC), bveVarC, 3072, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gbt(kklVar2, afiaVar, carAction, affgVar, nlhVar, i, 4);
        }
    }

    public static final void I(kjq kjqVar, boolean z, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z2;
        defpackage.bxl bxlVarJ;
        nlg nlgVar;
        kjqVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(538138407);
        if (i4 == 0) {
            i3 = i | (true != bveVarC.E(kjqVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            int i6 = i3 << 15;
            boolean z4 = z3 & z;
            kkf kkfVar = kjqVar.a;
            boolean zC = bveVarC.C(kkfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            byte[] bArr = null;
            if (zC || objS == defpackage.bvd.a) {
                defpackage.npu npuVarA = defpackage.npu.a.a();
                kls klsVar = kkfVar.a.b;
                objS = (npw) npuVarA.a(new npt("fanSpeedControl", klsVar), new defpackage.nma(npuVarA, klsVar, 6, bArr));
                bwcVar.ad(objS);
            }
            npw npwVar = (npw) objS;
            boolean zContains = kjqVar.d.contains(1);
            boolean zC2 = bveVarC.C(kjqVar);
            java.lang.Object objS2 = bwcVar.S();
            if (zC2 || objS2 == defpackage.bvd.a) {
                objS2 = F(kjqVar);
                bwcVar.ad(objS2);
            }
            int i7 = i6 & 3670016;
            defpackage.bys bysVarL = defpackage.bxi.l((defpackage.eqp) objS2, bveVarC);
            if (npwVar == null) {
                bveVarC.v(-1431219210);
                kkk kkkVar = kkk.a;
                defpackage.afia afiaVar = new defpackage.afia(0, 0);
                java.lang.Object objS3 = bwcVar.S();
                if (objS3 == defpackage.bvd.a) {
                    objS3 = new defpackage.dxd((defpackage.afdk) null, 5, (boolean[]) null);
                    bwcVar.ad(objS3);
                }
                J(zContains, kkkVar, afiaVar, null, (defpackage.affg) objS3, null, z4, bveVarC, i7 | 3120, 32);
                bwcVar.Y(false);
                bxlVarJ = bveVarC.J();
                if (bxlVarJ == null) {
                    return;
                } else {
                    nlgVar = new nlg(kjqVar, z4, i, i2, 1);
                }
            } else {
                bveVarC.v(-1431029893);
                bwcVar.Y(false);
                kkl kklVarAy = defpackage.tna.ay(defpackage.bxi.m(npwVar.c, kkk.a, bveVarC));
                com.google.android.gms.car.control.CarAction carAction = kjqVar.b;
                boolean zE = bveVarC.E(npwVar);
                java.lang.Object objS4 = bwcVar.S();
                if (zE || objS4 == defpackage.bvd.a) {
                    objS4 = new nlr(npwVar, (defpackage.afdk) null, 1, (byte[]) null);
                    bwcVar.ad(objS4);
                }
                J(zContains, kklVarAy, npwVar.a, carAction, (defpackage.affg) objS4, (nlh) bysVarL.a(), z4, bveVarC, i7, 0);
                z2 = z4;
            }
            bxlVarJ.c = nlgVar;
        }
        bveVarC.s();
        z2 = z;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            nlgVar = new nlg(kjqVar, z2, i, i2, 0);
            bxlVarJ.c = nlgVar;
        }
    }

    public static final void J(boolean z, kkl kklVar, defpackage.afia afiaVar, com.google.android.gms.car.control.CarAction carAction, defpackage.affg affgVar, nlh nlhVar, boolean z2, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z3;
        defpackage.bve bveVar2;
        nlh nlhVar2;
        nlh nlhVar3;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(61601353);
        if (i4 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(kklVar) : bveVarC.E(kklVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(afiaVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(carAction) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((32768 & i) == 0 ? bveVarC.C(affgVar) : bveVarC.E(affgVar)) ? 8192 : 16384;
        }
        int i5 = i2 & 32;
        int i6 = 196608;
        if (i5 != 0) {
            i3 |= i6;
        } else if ((196608 & i) == 0) {
            i6 = true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 65536 : 131072;
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            z3 = z2;
            i3 |= true != bveVarC.D(z3) ? 524288 : 1048576;
        } else {
            z3 = z2;
        }
        if (bveVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i7 = i3 >> 3;
            nlh nlhVar4 = i5 != 0 ? null : nlhVar;
            java.lang.Integer num = (java.lang.Integer) kkm.b(kklVar);
            if (num == null) {
                nlhVar3 = nlh.e;
            } else {
                nlhVar3 = num.intValue() == 0 ? nlh.f : nlhVar4;
            }
            if (z) {
                bveVarC.v(1215322914);
                bveVar2 = bveVarC;
                H(kklVar, afiaVar, carAction, affgVar, nlhVar3, bveVar2, i7 & 8190);
                ((defpackage.bwc) bveVar2).Y(false);
            } else {
                bveVarC.v(1215415480);
                L(kklVar, afiaVar, carAction, affgVar, nlhVar3, z3, bveVarC, i7 & 466942);
                bveVar2 = bveVarC;
                ((defpackage.bwc) bveVar2).Y(false);
            }
            nlhVar2 = nlhVar4;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            nlhVar2 = nlhVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mcp(z, kklVar, afiaVar, carAction, affgVar, nlhVar2, z2, i, i2, 2);
        }
    }

    public static final void K(kkl kklVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(999507020);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(kklVar) : bveVarC.E(kklVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        int i4 = 13;
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            java.lang.Integer num = (java.lang.Integer) kkm.b(kklVar);
            java.lang.String strValueOf = (num == null || num.intValue() == 0) ? null : java.lang.String.valueOf(num.intValue());
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.e, defpackage.cfs.n, bveVarC, 54);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
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
            defpackage.cne cneVarH = defpackage.day.h(2131231011, bveVarC, 0);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.ktf ktfVar = nmt.a;
            defpackage.boh.a(cneVarH, null, defpackage.awj.i(cgcVar, 32.0f), 0L, bveVarC, 56, 8);
            defpackage.acw acwVarZ = defpackage.acs.z(null, 3);
            defpackage.cft cftVar = defpackage.cfs.l;
            defpackage.lwz.i(strValueOf, null, acwVarZ.a(defpackage.acs.n(null, cftVar, 13)), defpackage.acs.A(null, 3).a(defpackage.acs.s(null, cftVar, 13)), nkz.a, bveVarC, 28032, 2);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nau(kklVar, cgfVar, i, i4);
        }
    }

    public static final void L(kkl kklVar, defpackage.afia afiaVar, com.google.android.gms.car.control.CarAction carAction, defpackage.affg affgVar, nlh nlhVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.afer aferVar;
        int i3;
        java.lang.Object lybVar;
        defpackage.bwc bwcVar;
        aiuw aiuwVar;
        java.lang.Integer num;
        int i4;
        java.lang.Object obj;
        byte[] bArr;
        boolean z2;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-784327483);
        if (i5 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(kklVar) : bveVarC.E(kklVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(afiaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(carAction) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? bveVarC.C(affgVar) : bveVarC.E(affgVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.D(z) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            java.lang.Object obj2 = defpackage.bvd.a;
            if (objS == obj2) {
                objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar2.ad(objS);
            }
            aiuw aiuwVar2 = (aiuw) objS;
            java.lang.Integer num2 = (java.lang.Integer) kkm.b(kklVar);
            boolean z3 = num2 != null && num2.intValue() > ((java.lang.Number) defpackage.afga.aw(afiaVar)).intValue();
            boolean z4 = num2 != null && num2.intValue() < ((java.lang.Number) defpackage.afga.au(afiaVar)).intValue();
            if (carAction == null) {
                bveVarC.v(-1277285529);
                bwcVar2.Y(false);
                aferVar = null;
            } else {
                bveVarC.v(-1277255738);
                boolean zE = bveVarC.E(carAction);
                java.lang.Object objS2 = bwcVar2.S();
                if (zE || objS2 == obj2) {
                    objS2 = new defpackage.niw(carAction, 9);
                    bwcVar2.ad(objS2);
                }
                aferVar = (defpackage.afer) objS2;
                bwcVar2.Y(false);
            }
            int i6 = i2 & 7168;
            defpackage.afer aferVar2 = aferVar;
            boolean zE2 = bveVarC.E(aiuwVar2) | (i6 == 2048 || ((i2 & 4096) != 0 && bveVarC.E(affgVar))) | bveVarC.C(num2);
            java.lang.Object objS3 = bwcVar2.S();
            if (zE2 || objS3 == obj2) {
                i3 = i2;
                bwcVar = bwcVar2;
                aiuwVar = aiuwVar2;
                num = num2;
                i4 = i6;
                obj = obj2;
                bArr = null;
                z2 = false;
                lybVar = new defpackage.lyb((java.lang.Object) aiuwVar, (java.lang.Object) affgVar, (java.lang.Object) num, 11, (byte[]) null);
                bwcVar.ad(lybVar);
            } else {
                int i7 = i2;
                lybVar = objS3;
                i3 = i7;
                bwcVar = bwcVar2;
                aiuwVar = aiuwVar2;
                num = num2;
                obj = obj2;
                bArr = null;
                z2 = false;
                i4 = i6;
            }
            defpackage.afer aferVar3 = (defpackage.afer) lybVar;
            boolean zE3 = bveVarC.E(aiuwVar) | ((i4 == 2048 || ((i3 & 4096) != 0 && bveVarC.E(affgVar))) ? true : z2) | bveVarC.C(num);
            java.lang.Object objS4 = bwcVar.S();
            if (zE3 || objS4 == obj) {
                defpackage.lyb lybVar2 = new defpackage.lyb((java.lang.Object) aiuwVar, (java.lang.Object) affgVar, (java.lang.Object) num, 12, (byte[]) null);
                bwcVar.ad(lybVar2);
                objS4 = lybVar2;
            }
            bveVar2 = bveVarC;
            defpackage.lxy.D(aferVar3, (defpackage.afer) objS4, z4, z3, aferVar2, null, z, defpackage.dai.as(2030728977, true, new nee(nlhVar, 6), bveVarC), null, null, null, null, defpackage.dai.as(25728255, true, new myl(num, kklVar, 2, bArr), bveVarC), bveVar2, ((i3 << 3) & 3670016) | 12582912, 384, 3872);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bof(kklVar, afiaVar, carAction, affgVar, nlhVar, z, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void M(boolean z, boolean z2, boolean z3, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        boolean z4;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        long j;
        int i4;
        int i5;
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(778555051);
        if (i6 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 1024 : 2048;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 8192 : 16384;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i3 & 1)) {
                if (i7 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (true != defpackage.ca.bl(bveVarC)) {
                    j = -6634453162000384L;
                } else {
                    j = -126164664320000L;
                }
                if (z2) {
                    i4 = 2131231829;
                } else {
                    i4 = 2131231830;
                }
                defpackage.cne cneVarH = defpackage.day.h(i4, bveVarC, 0);
                if (z2) {
                    i5 = 2132083811;
                } else {
                    i5 = 2132083812;
                }
                java.lang.String strE = defpackage.vm.e(i5, bveVarC);
                defpackage.afar afarVar = defpackage.ktz.a;
                int i8 = i3 << 3;
                defpackage.lxy.A(cneVarH, 0.0f, strE, z, affcVar, cgfVar4, z3, defpackage.jxh.h(j, bveVarC, 32255), bveVarC, ((i3 << 9) & 7168) | 8 | (57344 & i8) | (i8 & 458752) | ((i3 << 12) & 3670016), 2);
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nlc(z, z2, z3, affcVar, cgfVar3, i, i2, 0);
            }
        }
        i3 |= 24576;
        cgfVar2 = cgfVar;
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bveVarC.I(z4, i3 & 1)) {
            if (i7 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (true != defpackage.ca.bl(bveVarC)) {
                j = -6634453162000384L;
            } else {
                j = -126164664320000L;
            }
            if (z2) {
                i4 = 2131231829;
            } else {
                i4 = 2131231830;
            }
            defpackage.cne cneVarH2 = defpackage.day.h(i4, bveVarC, 0);
            if (z2) {
                i5 = 2132083811;
            } else {
                i5 = 2132083812;
            }
            java.lang.String strE2 = defpackage.vm.e(i5, bveVarC);
            defpackage.afar afarVar2 = defpackage.ktz.a;
            int i9 = i3 << 3;
            defpackage.lxy.A(cneVarH2, 0.0f, strE2, z, affcVar, cgfVar4, z3, defpackage.jxh.h(j, bveVarC, 32255), bveVarC, ((i3 << 9) & 7168) | 8 | (57344 & i9) | (i9 & 458752) | ((i3 << 12) & 3670016), 2);
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlc(z, z2, z3, affcVar, cgfVar3, i, i2, 0);
        }
    }

    public static final void N(kjq kjqVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        kjqVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(926047250);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (bveVarC.I((i4 & 19) != 18, i4 & 1)) {
            kkf kkfVar = kjqVar.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            boolean zC = bveVarC.C(kkfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                defpackage.npu npuVarA = defpackage.npu.a.a();
                kls klsVar = kkfVar.a.b;
                objS = (nqr) npuVarA.a(new npt("defrostControl", klsVar), new defpackage.nma(npuVarA, klsVar, 5, null));
                bwcVar.ad(objS);
            }
            nqr nqrVar = (nqr) objS;
            boolean zF = defpackage.afga.f(kkfVar.a.b, new klw(1));
            if (nqrVar == null) {
                bveVarC.v(1299015205);
                java.lang.Object objS2 = bwcVar.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.njy(17);
                    bwcVar.ad(objS2);
                }
                M(false, zF, false, (defpackage.affc) objS2, null, bveVarC, 3462, 16);
                bwcVar.Y(false);
                defpackage.bxl bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.nau(kjqVar, cgcVar, i, 11);
                    return;
                }
                return;
            }
            bveVarC.v(1299118032);
            bwcVar.Y(false);
            java.lang.Object objS3 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS3 == obj) {
                objS3 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS3);
            }
            aiuw aiuwVar = (aiuw) objS3;
            defpackage.bys bysVarM = defpackage.bxi.m(nqrVar.a, kkk.a, bveVarC);
            com.google.android.gms.car.control.CarAction carAction = kjqVar.b;
            java.lang.Boolean bool = (java.lang.Boolean) kkm.b(defpackage.tna.ay(bysVarM));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            boolean z = defpackage.tna.ay(bysVarM) instanceof kki;
            boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(carAction) | bveVarC.E(nqrVar);
            java.lang.Object objS4 = bwcVar.S();
            if (zE || objS4 == obj) {
                objS4 = new defpackage.nkc(aiuwVar, carAction, nqrVar, 3);
                bwcVar.ad(objS4);
            }
            M(zBooleanValue, zF, z, (defpackage.affc) objS4, cgcVar, bveVarC, (i4 << 9) & 57344, 0);
            cgfVar = cgcVar;
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ2 = bveVarC.J();
        if (bxlVarJ2 != null) {
            bxlVarJ2.c = new defpackage.nau(kjqVar, cgfVar, i, 12);
        }
    }

    public static final void O(kjo kjoVar, int i, defpackage.bve bveVar, int i2) {
        int i3;
        int i4;
        kjoVar.getClass();
        int i5 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(1338013043);
        if (i5 == 0) {
            i3 = (true != bveVarC.E(kjoVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i + (-1)) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            int i6 = kjoVar.a.a;
            if (i6 == 1) {
                i4 = 2131231568;
            } else if (i6 == 2) {
                i4 = 2131231699;
            } else {
                if (i6 != 3) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bo(i6, "Unsupported action has no icon "));
                }
                i4 = 2131231629;
            }
            boolean zE = bveVarC.E(kjoVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.niw(kjoVar, 7);
                bwcVar.ad(objS);
            }
            defpackage.afer aferVar = (defpackage.afer) objS;
            if (i == 2) {
                bveVarC.v(-844262726);
                defpackage.lxy.C(defpackage.day.h(i4, bveVarC, 0), aferVar, bveVarC, 8);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-844163526);
                defpackage.cne cneVarH = defpackage.day.h(i4, bveVarC, 0);
                defpackage.bcr bcrVar = defpackage.bxi.o(bveVarC).b;
                defpackage.ktf ktfVar = nmt.a;
                defpackage.ktf ktfVar2 = nmt.a;
                defpackage.ktf ktfVar3 = defpackage.ktf.a;
                defpackage.khg.m(cneVarH, aferVar, null, ktfVar2, false, bcrVar, null, null, null, bveVarC, 8, 0, 4020);
                bwcVar.Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nkx(kjoVar, i, i2);
        }
    }

    public static final void P(kjq kjqVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.bxl bxlVarJ;
        defpackage.nau nauVar;
        java.lang.String strE;
        kjqVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-772981396);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (bveVarC.I((i4 & 19) != 18, i4 & 1)) {
            kkf kkfVar = kjqVar.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            boolean zC = bveVarC.C(kkfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            byte[] bArr = null;
            if (zC || objS == defpackage.bvd.a) {
                defpackage.npu npuVarA = defpackage.npu.a.a();
                kls klsVar = kkfVar.a.b;
                objS = (nqr) npuVarA.a(new npt("acOnControl", klsVar), new defpackage.nma(npuVarA, klsVar, 11, bArr));
                bwcVar.ad(objS);
            }
            nqr nqrVar = (nqr) objS;
            java.lang.String strE2 = defpackage.vm.e(2132083809, bveVarC);
            if (nqrVar == null) {
                bveVarC.v(1726165868);
                java.lang.Object objS2 = bwcVar.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.njy(16);
                    bwcVar.ad(objS2);
                }
                defpackage.lxy.z(strE2, null, false, (defpackage.affc) objS2, null, false, null, bveVarC, 200064, 82);
                bwcVar.Y(false);
                bxlVarJ = bveVarC.J();
                if (bxlVarJ == null) {
                    return;
                } else {
                    nauVar = new defpackage.nau(kjqVar, cgcVar, i, 7);
                }
            } else {
                bveVarC.v(1726267734);
                bwcVar.Y(false);
                java.lang.Object objS3 = bwcVar.S();
                java.lang.Object obj = defpackage.bvd.a;
                if (objS3 == obj) {
                    objS3 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                    bwcVar.ad(objS3);
                }
                aiuw aiuwVar = (aiuw) objS3;
                defpackage.bys bysVarM = defpackage.bxi.m(nqrVar.a, kkk.a, bveVarC);
                com.google.android.gms.car.control.CarAction carAction = kjqVar.b;
                if (defpackage.afga.f(kkm.b(defpackage.tna.ay(bysVarM)), java.lang.Boolean.FALSE)) {
                    bveVarC.v(194246064);
                    strE = defpackage.vm.e(2132083813, bveVarC);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(1726701361);
                    bwcVar.Y(false);
                    strE = null;
                }
                java.lang.Boolean bool = (java.lang.Boolean) kkm.b(defpackage.tna.ay(bysVarM));
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                boolean z = defpackage.tna.ay(bysVarM) instanceof kki;
                boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(carAction) | bveVarC.E(nqrVar);
                java.lang.Object objS4 = bwcVar.S();
                if (zE || objS4 == obj) {
                    objS4 = new defpackage.nkc(aiuwVar, carAction, nqrVar, 2);
                    bwcVar.ad(objS4);
                }
                cgfVar2 = cgcVar;
                defpackage.lxy.z(strE2, strE, zBooleanValue, (defpackage.affc) objS4, cgfVar2, z, null, bveVarC, (i4 << 9) & 57344, 64);
            }
            bxlVarJ.c = nauVar;
        }
        bveVarC.s();
        cgfVar2 = cgfVar;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            nauVar = new defpackage.nau(kjqVar, cgfVar2, i, 8);
            bxlVarJ.c = nauVar;
        }
    }

    public static final void Q(defpackage.nkp nkpVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        long jK;
        defpackage.bwc bwcVar;
        nkpVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-596924716);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bys bysVarM = defpackage.bxi.m(nkpVar.e(), 0, bveVarC);
            defpackage.ktf ktfVar = defpackage.ktf.c;
            float f = ktfVar.h;
            if (defpackage.lem.a.a().b()) {
                bveVarC.v(-1819330751);
                jK = defpackage.ksx.j(defpackage.kry.o, bveVarC);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(-1819280314);
                jK = defpackage.ksx.k(defpackage.krz.a, bveVarC);
                ((defpackage.bwc) bveVarC).Y(false);
            }
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.asl();
                bwcVar2.ad(objS);
            }
            defpackage.ask askVar = (defpackage.ask) objS;
            defpackage.cgf cgfVarI = defpackage.awj.i(cgfVar, f);
            defpackage.avv avvVar = defpackage.bms.a;
            defpackage.cld cldVarE = defpackage.bms.e(bveVarC);
            defpackage.afar afarVar = defpackage.ktl.a;
            long j = jK;
            int i4 = i2;
            defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarI, cldVarE, defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255).j, defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255).k, ktfVar.o, ktfVar.p, askVar, false, false, bveVarC, 1572864, 192);
            int i5 = i4 & 14;
            boolean zC = (i5 == 4 || ((i4 & 8) != 0 && bveVarC.E(nkpVar))) | bveVarC.C(r27);
            java.lang.Object objS2 = bwcVar2.S();
            if (zC || objS2 == obj) {
                objS2 = new defpackage.mtd(nkpVar, r27, 17);
                bwcVar = bwcVar2;
                bwcVar.ad(objS2);
            } else {
                bwcVar = bwcVar2;
            }
            defpackage.cgf cgfVarY = defpackage.dai.y(defpackage.afw.w(cgfVarA, askVar, null, true, null, (defpackage.afer) objS2), "geminiLive");
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarY);
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
            int i6 = jvq.y;
            android.os.Bundle bundleB = jug.b();
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarH = defpackage.cjv.h(defpackage.awj.c(cgcVar, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.bcw.a, true, 0, 1042431);
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = new defpackage.nef(19);
                bwcVar.ad(objS3);
            }
            defpackage.cgf cgfVarR = defpackage.bzd.r(cgfVarH, (defpackage.affc) objS3);
            vv vvVarF = duf.f(bveVarC);
            defpackage.epx epxVar = (defpackage.epx) defpackage.ebn.c(((defpackage.eqg) bveVarC.f(defpackage.esf.a)).getLifecycle(), bveVarC).a();
            java.lang.Object objS4 = bwcVar.S();
            if (objS4 == obj) {
                objS4 = defpackage.muy.o;
                bwcVar.ad(objS4);
            }
            defpackage.bwc bwcVar3 = bwcVar;
            bveVar2 = bveVarC;
            duf.g(jvq.class, cgfVarR, vvVarF, bundleB, epxVar, (defpackage.affc) objS4, bveVar2, 0);
            if (defpackage.lee.a.a().b()) {
                bveVar2.v(-864425688);
                bwcVar3.Y(false);
            } else {
                bveVar2.v(-864879280);
                defpackage.cgf cgfVarC = defpackage.awj.c(cgcVar, 1.0f);
                java.lang.Object objS5 = bwcVar3.S();
                if (objS5 == obj) {
                    objS5 = new defpackage.nef(20);
                    bwcVar3.ad(objS5);
                }
                defpackage.cgf cgfVarR2 = defpackage.bzd.r(cgfVarC, (defpackage.affc) objS5);
                boolean z = bveVar2.z(f) | bveVar2.B(j);
                java.lang.Object objS6 = bwcVar3.S();
                if (z || objS6 == obj) {
                    objS6 = new bnu(f, j, 2);
                    bwcVar3.ad(objS6);
                }
                defpackage.afw.z(cgfVarR2, (defpackage.affc) objS6, bveVar2, 0);
                bwcVar3.Y(false);
            }
            defpackage.cgf cgfVarC2 = defpackage.awj.c(cgcVar, 1.0f);
            boolean zC2 = bveVar2.C(r27) | (i5 == 4 || ((i4 & 8) != 0 && bveVar2.E(nkpVar)));
            java.lang.Object objS7 = bwcVar3.S();
            if (zC2 || objS7 == obj) {
                objS7 = new defpackage.mtd(nkpVar, bysVarM, 18);
                bwcVar3.ad(objS7);
            }
            defpackage.atp.c(defpackage.dai.y(defpackage.afw.w(cgfVarC2, askVar, null, true, null, (defpackage.afer) objS7), "geminiLive"), bveVar2, 0);
            bwcVar3.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nau(nkpVar, cgfVar, i, 6);
        }
    }

    public static /* synthetic */ defpackage.afbk R(defpackage.byj byjVar) {
        byjVar.h(byjVar.e() - 1);
        return defpackage.afbk.a;
    }

    public static final boolean S(android.content.Context context) {
        return ((android.net.wifi.WifiManager) context.getSystemService(android.net.wifi.WifiManager.class)).isWifiApEnabled();
    }

    private static final void T(wif wifVar, defpackage.zbd zbdVar) {
        defpackage.lxy.e();
        defpackage.lxy.f(((luh) wifVar.c).h, zbdVar, (android.content.ComponentName) wifVar.b);
    }

    private static final defpackage.eqp U(nps npsVar, defpackage.affc affcVar) {
        defpackage.eqp eqpVarA;
        return (npsVar == null || (eqpVarA = npsVar.a()) == null) ? defpackage.tcu.b : juc.c(juc.b(eqpVarA, affcVar));
    }

    public static /* synthetic */ void a(lvn lvnVar) {
        if (lvnVar instanceof lvr) {
            defpackage.lnt.m().h((lvr) lvnVar);
        } else if (lvnVar instanceof lvp) {
            defpackage.lnt.m().f(lvnVar, false, false);
        }
    }

    public static final java.lang.String b(android.content.Context context, com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition) {
        defpackage.ygw ygwVarA;
        com.google.android.gms.car.navigation.DestinationDistance destinationDistance;
        context.getClass();
        if (navigationCurrentPosition == null || (ygwVarA = navigationCurrentPosition.a()) == null || (destinationDistance = (com.google.android.gms.car.navigation.DestinationDistance) defpackage.afga.aB(ygwVarA)) == null) {
            return null;
        }
        int iCeil = (int) java.lang.Math.ceil(destinationDistance.c / 60.0d);
        if (iCeil > 10) {
            int i = iCeil % 5;
            iCeil += i == 0 ? 0 : 5 - i;
        }
        if (iCeil <= 10) {
            java.lang.String quantityString = context.getResources().getQuantityString(2131951646, iCeil, java.lang.Integer.valueOf(iCeil));
            quantityString.getClass();
            return quantityString;
        }
        if (iCeil < 60) {
            java.lang.String string = context.getString(2132085274, java.lang.Integer.valueOf(iCeil));
            string.getClass();
            return string;
        }
        int i2 = iCeil / 60;
        int i3 = iCeil % 60;
        java.lang.String string2 = i3 == 0 ? context.getString(2132085273, java.lang.Integer.valueOf(i2)) : context.getString(2132085272, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        string2.getClass();
        return string2;
    }

    public static /* synthetic */ java.lang.String c(android.content.Context context, android.location.Location location) {
        java.util.Locale locale = java.util.Locale.US;
        locale.getClass();
        locale.getClass();
        if (location == null) {
            return null;
        }
        android.net.Uri.Builder builderAppendEncodedPath = new android.net.Uri.Builder().scheme("https").appendEncodedPath("/maps.google.com");
        java.lang.String str = java.lang.String.format(locale, "?q=%.6f,%.6f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(location.getLongitude())}, 2));
        str.getClass();
        java.lang.String language = locale.getLanguage();
        java.lang.String country = locale.getCountry();
        country.getClass();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        locale2.getClass();
        java.lang.String lowerCase = country.toLowerCase(locale2);
        lowerCase.getClass();
        return context.getString(2132085278, builderAppendEncodedPath.appendEncodedPath(str + "&hl=" + language + "&gl=" + lowerCase + "&entry=gps").toString());
    }

    public static defpackage.lvd d() {
        return (defpackage.lvd) defpackage.mkp.a.i(defpackage.lvd.class);
    }

    public static final defpackage.zbd e(wif wifVar) {
        return lug.e.equals(wifVar.d) ? defpackage.zbd.mw : defpackage.zbd.mx;
    }

    public static final defpackage.zbd f(wif wifVar) {
        luh luhVar = luh.b;
        luh luhVar2 = (luh) wifVar.c;
        boolean zEquals = luhVar2.equals(luhVar);
        boolean zEquals2 = lug.e.equals(wifVar.d);
        boolean zEquals3 = luhVar2.equals(luh.c);
        if (zEquals2) {
            return defpackage.zbd.nh;
        }
        if (zEquals3) {
            return defpackage.zbd.mR;
        }
        if (((luf) wifVar.e).equals(luf.a)) {
            return zEquals ? defpackage.zbd.mI : defpackage.zbd.mn;
        }
        return zEquals ? defpackage.zbd.mH : defpackage.zbd.mm;
    }

    public static final defpackage.zbd g(wif wifVar) {
        luh luhVar = luh.b;
        luh luhVar2 = (luh) wifVar.c;
        boolean zEquals = luhVar2.equals(luhVar);
        boolean zEquals2 = lug.e.equals(wifVar.d);
        boolean zEquals3 = luhVar2.equals(luh.c);
        if (zEquals2) {
            return defpackage.zbd.ni;
        }
        if (zEquals3) {
            return defpackage.zbd.mS;
        }
        if (((luf) wifVar.e).equals(luf.a)) {
            return zEquals ? defpackage.zbd.mG : defpackage.zbd.mr;
        }
        return zEquals ? defpackage.zbd.mF : defpackage.zbd.mq;
    }

    public static final defpackage.zbd h(wif wifVar) {
        luh luhVar = luh.b;
        luh luhVar2 = (luh) wifVar.c;
        boolean zEquals = luhVar2.equals(luhVar);
        boolean zEquals2 = luhVar2.equals(luh.c);
        if (zEquals) {
            return defpackage.zbd.ne;
        }
        return zEquals2 ? defpackage.zbd.nf : defpackage.zbd.mL;
    }

    public static final void i(wif wifVar) {
        T(wifVar, defpackage.zbd.ml);
    }

    public static final void j(wif wifVar) {
        T(wifVar, ((luh) wifVar.c).equals(luh.b) ? defpackage.zbd.mJ : defpackage.zbd.mj);
    }

    public static final void k(wif wifVar) {
        defpackage.zbd zbdVar;
        defpackage.zbd zbdVar2;
        boolean zEquals = ((luh) wifVar.c).equals(luh.b);
        boolean zEquals2 = lug.e.equals(wifVar.d);
        wifVar.b();
        if (zEquals2) {
            zbdVar = defpackage.zbd.mP;
        } else {
            zbdVar = zEquals ? defpackage.zbd.mK : defpackage.zbd.mi;
        }
        T(wifVar, zbdVar);
        if (wifVar.a) {
            if (zEquals2) {
                zbdVar2 = defpackage.zbd.KI;
            } else {
                zbdVar2 = zEquals ? defpackage.zbd.KJ : defpackage.zbd.KK;
            }
            T(wifVar, zbdVar2);
        }
    }

    public static final void l(wif wifVar) {
        wifVar.b();
        T(wifVar, defpackage.zbd.mO);
    }

    public static final void m(wif wifVar) {
        T(wifVar, defpackage.zbd.Lb);
    }

    public static final void n(wif wifVar) {
        T(wifVar, defpackage.zbd.KY);
    }

    public static final void o(wif wifVar) {
        T(wifVar, defpackage.zbd.Lc);
    }

    public static final void p(wif wifVar) {
        T(wifVar, defpackage.zbd.KZ);
    }

    public static final void q(wif wifVar) {
        T(wifVar, defpackage.zbd.Lf);
    }

    public static final void r(wif wifVar) {
        T(wifVar, defpackage.zbd.KV);
    }

    public static final void s(wif wifVar) {
        T(wifVar, defpackage.zbd.KU);
    }

    public static final void t(wif wifVar) {
        T(wifVar, defpackage.zbd.Le);
    }

    public static final void u(wif wifVar) {
        T(wifVar, defpackage.zbd.KT);
    }

    public static final void v(wif wifVar) {
        T(wifVar, defpackage.zbd.KR);
    }

    public static final void w(wif wifVar) {
        T(wifVar, defpackage.zbd.Ld);
    }

    public static final void x(wif wifVar) {
        T(wifVar, defpackage.zbd.KQ);
    }

    public static final void y(wif wifVar) {
        T(wifVar, defpackage.zbd.La);
    }

    public static final void z(wif wifVar) {
        T(wifVar, defpackage.zbd.KM);
    }
}
