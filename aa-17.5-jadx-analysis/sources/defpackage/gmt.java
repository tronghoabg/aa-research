package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class gmt {
    public static final void a(boolean z, afeh afehVar, bux buxVar, int i) {
        int i2;
        boolean z2;
        afeh afehVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2094056048);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            z2 = z;
            afehVar2 = afehVar;
            fwn.f(z2, 300, 0, afehVar2, buxVarC, (i2 & 14) | 432 | ((i2 << 6) & 7168), 0);
        } else {
            z2 = z;
            afehVar2 = afehVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(z2, afehVar2, i, i4);
        }
    }

    public static final void b(hga hgaVar, hge hgeVar, hgc hgcVar, cfy cfyVar, afeg afegVar, afeg afegVar2, afeg afegVar3, afeg afegVar4, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        afeg afegVar5;
        boolean zA;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1483979288);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.A(hgcVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 1024 : 2048;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            afegVar5 = afegVar3;
            i2 |= true != buxVarC.E(afegVar5) ? 524288 : 1048576;
        } else {
            afegVar5 = afegVar3;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar4) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            int i4 = i2 >> 3;
            int i5 = i2 << 3;
            int i6 = i2 << 6;
            int i7 = i2 & 112;
            int i8 = ((i2 >> 9) & 14) | 24576;
            int i9 = i2;
            if (buxVarC.f(dbc.i) == dlr.a) {
                buxVarC.v(174969945);
                zA = ((hjo) buxVarC.f(hjp.a)).a(hjn.b, hjm.b);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1129102236);
                ((bvv) buxVarC).Y(false);
                zA = false;
            }
            int i10 = i6 & 896;
            int i11 = i5 & 7168;
            int i12 = 458752 & i4;
            boolean z = zA;
            cct cctVarI = bxc.i(-1092644391, true, new bmc(afegVar2, afegVar, 19), buxVarC);
            if (z) {
                buxVarC.v(1129585562);
                hfz.a(cfyVar2, hgeVar, hgaVar, hgcVar, cctVarI, afegVar5, null, afegVar4, buxVarC, i8 | i7 | i10 | i11 | i12 | (i9 & 29360128), 64);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1129892648);
                hft.a(cfyVar, hgeVar, hgaVar, hgcVar, cctVarI, afegVar3, afegVar4, buxVarC, i8 | i7 | i10 | i11 | i12 | (3670016 & i4), 0);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gnx(hgaVar, hgeVar, hgcVar, cfyVar, afegVar, afegVar2, afegVar3, afegVar4, i, 3);
        }
    }

    public static final void c(hga hgaVar, hge hgeVar, cfy cfyVar, hju hjuVar, hju hjuVar2, hju hjuVar3, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        cct cctVar;
        bvv bvvVar;
        cct cctVar2;
        cct cctVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1579683583);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? buxVarC.C(hjuVar2) : buxVarC.E(hjuVar2)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(hjuVar3) : buxVarC.E(hjuVar3)) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (objS == buw.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar2.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            if (hjuVar == null) {
                buxVarC.v(-396464151);
                bvvVar2.Y(false);
                bvvVar = bvvVar2;
                cctVar2 = null;
                cctVar = null;
            } else {
                buxVarC.v(-396464150);
                cctVar = null;
                cct cctVarI = bxc.i(-1654128925, true, new brf(hjuVar, dlgVar, bwqVar, 14, (short[]) null), buxVarC);
                bvvVar = bvvVar2;
                bvvVar.Y(false);
                cctVar2 = cctVarI;
            }
            if (hjuVar2 == null && hjuVar3 == null) {
                buxVarC.v(-394887893);
                bvvVar.Y(false);
                cctVar3 = cctVar;
            } else {
                buxVarC.v(-396111153);
                cct cctVarI2 = bxc.i(365025982, true, new brf(bwqVar, hjuVar2, hjuVar3, 15), buxVarC);
                bvvVar.Y(false);
                cctVar3 = cctVarI2;
            }
            buxVar2 = buxVarC;
            hdt.e(cfyVar, hgeVar, hgaVar, cctVar2, cctVar3, buxVar2, ((i2 >> 6) & 14) | (i2 & 112) | ((i2 << 6) & 896), 0);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(hgaVar, hgeVar, cfyVar, hjuVar, hjuVar2, hjuVar3, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.gtw r29, defpackage.cfy r30, defpackage.bux r31, int r32) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmt.d(gtw, cfy, bux, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gtn e(androidx.car.app.navigation.model.NavigationTemplate r12, defpackage.geu r13) {
        /*
            r12.getClass()
            wz r0 = r12.getNavigationInfo()
            r1 = 0
            if (r0 == 0) goto L74
            androidx.car.app.model.CarColor r2 = r12.getBackgroundColor()
            boolean r3 = r0 instanceof androidx.car.app.navigation.model.MessageInfo
            gtq r4 = new gtq
            gmq r5 = new gmq
            if (r3 == 0) goto L49
            androidx.car.app.navigation.model.MessageInfo r0 = (androidx.car.app.navigation.model.MessageInfo) r0
            androidx.car.app.model.CarText r3 = r0.getTitle()
            androidx.car.app.model.CarIcon r6 = r0.getImage()
            if (r6 == 0) goto L3d
            gqr r8 = new gqr
            r7 = 10
            r8.<init>(r7)
            gqr r9 = new gqr
            r7 = 11
            r9.<init>(r7)
            ghv r10 = defpackage.ghv.a
            r10.getClass()
            r11 = 8
            r7 = r13
            fzy r13 = defpackage.fxp.e(r6, r7, r8, r9, r10, r11)
            goto L3f
        L3d:
            r7 = r13
            r13 = r1
        L3f:
            androidx.car.app.model.CarText r0 = r0.getText()
            gto r6 = new gto
            r6.<init>(r13, r0, r3)
            goto L6d
        L49:
            r7 = r13
            boolean r13 = r0 instanceof androidx.car.app.navigation.model.RoutingInfo
            if (r13 == 0) goto L6c
            androidx.car.app.navigation.model.RoutingInfo r0 = (androidx.car.app.navigation.model.RoutingInfo) r0
            boolean r13 = r0.isLoading()
            if (r13 != 0) goto L6c
            gtr r6 = new gtr
            androidx.car.app.model.Distance r13 = r0.getCurrentDistance()
            androidx.car.app.navigation.model.Step r3 = r0.getCurrentStep()
            androidx.car.app.navigation.model.Step r8 = r0.getNextStep()
            androidx.car.app.model.CarIcon r0 = r0.getJunctionImage()
            r6.<init>(r13, r3, r8, r0)
            goto L6d
        L6c:
            r6 = r1
        L6d:
            r5.<init>(r6)
            r4.<init>(r2, r5)
            goto L76
        L74:
            r7 = r13
            r4 = r1
        L76:
            androidx.car.app.navigation.model.TravelEstimate r13 = r12.getDestinationTravelEstimate()
            if (r13 == 0) goto L81
            gth r13 = defpackage.gmn.b(r13, r7)
            goto L82
        L81:
            r13 = r1
        L82:
            androidx.car.app.model.ActionStrip r0 = r12.getActionStrip()
            androidx.car.app.model.ActionStrip r2 = r12.getMapActionStrip()
            xc r3 = r12.getPanModeDelegate()
            gor r0 = defpackage.gob.b(r0, r2, r3, r7)
            xc r2 = r12.getPanModeDelegate()
            java.lang.Class<ggk> r3 = defpackage.ggk.class
            got r5 = new got
            hem r3 = r7.F(r3)
            ggk r3 = (defpackage.ggk) r3
            boolean r3 = r3.v()
            if (r3 != 0) goto La7
            goto Lb0
        La7:
            if (r2 == 0) goto Lb0
            gdg r1 = new gdg
            r3 = 17
            r1.<init>(r7, r2, r3)
        Lb0:
            r5.<init>(r1)
            gtn r1 = new gtn
            r1.<init>(r4, r13, r0, r5)
            defpackage.gka.b(r1, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmt.e(androidx.car.app.navigation.model.NavigationTemplate, geu):gtn");
    }

    private static final boolean f(afm afmVar) {
        return !afmVar.e();
    }
}
