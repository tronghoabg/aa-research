package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class hdt {
    public static final void a(hdu hduVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1003124252);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hduVar) : buxVarC.E(hduVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarF = byx.f(hduVar.a, null, null, buxVarC, 3);
            cfy cfyVarI = awd.i(cfyVar, gux.g(buxVarC).c.c);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            ti.c(((Boolean) bymVarF.a()).booleanValue(), bxc.n(cfy.e, 1.5f, 1.5f), hduVar.b, null, buxVarC, 432);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hduVar, cfyVar, i, 13);
        }
    }

    public static final void b(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1087831224);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        int i4 = 3;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 3) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu(cfyVar, afegVar, i, i4);
        }
    }

    public static final void c(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1366186850);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 3) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu(cfyVar, afegVar, i, i4);
        }
    }

    public static final void d(cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1564844639);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cfyVar, i, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.cfy r16, defpackage.hge r17, defpackage.hga r18, defpackage.afeg r19, defpackage.afeg r20, defpackage.bux r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdt.e(cfy, hge, hga, afeg, afeg, bux, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.cfy r17, defpackage.hge r18, defpackage.hga r19, defpackage.afeg r20, defpackage.afeg r21, defpackage.afeg r22, defpackage.bux r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdt.f(cfy, hge, hga, afeg, afeg, afeg, bux, int, int):void");
    }

    public static final void g(cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(82177411);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cfyVar, i, 20);
        }
    }

    public static final void h(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1577352250);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 3) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu(cfyVar, afegVar, i, i4);
        }
    }

    public static final void i(cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1884905592);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cfyVar, i, 18);
        }
    }

    public static final void j(cfy cfyVar, hge hgeVar, hga hgaVar, afeg afegVar, afeg afegVar2, afeg afegVar3, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        afeg afegVar4;
        bux buxVar2;
        dor dorVar;
        bwq bwqVar;
        int i3;
        boolean z;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(2003427189);
        if (i4 == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            afegVar4 = afegVar3;
            i2 |= true != buxVarC.E(afegVar4) ? 65536 : 131072;
        } else {
            afegVar4 = afegVar3;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            float f = gjk.c.k;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new cil();
                bvvVar.ad(objS2);
            }
            cil cilVar2 = (cil) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS3 = parcelableSnapshotMutableState;
            }
            bwq bwqVar2 = (bwq) objS3;
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                objS4 = new cil();
                bvvVar.ad(objS4);
            }
            cil cilVar3 = (cil) objS4;
            Object objS5 = bvvVar.S();
            if (objS5 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState2);
                objS5 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar3 = (bwq) objS5;
            cfy cfyVarH = asl.H(hdz.b(awd.b(awd.r(cfyVar2), 1.0f), hgaVar).a(new aix(cjn.i(0), ckq.a)), f);
            buxVarC.v(-1066585843);
            buxVarC.v(-487956875);
            bvvVar.Y(false);
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            Object objS6 = bvvVar.S();
            if (objS6 == obj) {
                objS6 = new dot(dlgVar);
                bvvVar.ad(objS6);
            }
            dot dotVar = (dot) objS6;
            Object objS7 = bvvVar.S();
            if (objS7 == obj) {
                objS7 = new dom((char[]) null);
                bvvVar.ad(objS7);
            }
            dom domVar = (dom) objS7;
            Object objS8 = bvvVar.S();
            if (objS8 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState3);
                objS8 = parcelableSnapshotMutableState3;
            }
            bwq bwqVar4 = (bwq) objS8;
            Object objS9 = bvvVar.S();
            if (objS9 == obj) {
                objS9 = new dor(domVar);
                bvvVar.ad(objS9);
            }
            dor dorVar2 = (dor) objS9;
            Object objS10 = bvvVar.S();
            if (objS10 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new ParcelableSnapshotMutableState(afak.a, bxp.b);
                bvvVar.ad(parcelableSnapshotMutableState4);
                objS10 = parcelableSnapshotMutableState4;
            }
            bwq bwqVar5 = (bwq) objS10;
            boolean zE = buxVarC.E(dotVar) | buxVarC.A(257);
            Object objS11 = bvvVar.S();
            if (zE || objS11 == obj) {
                objS11 = new hfq(bwqVar5, dotVar, dorVar2, bwqVar4, 1);
                dorVar = dorVar2;
                bwqVar = bwqVar4;
                bvvVar.ad(objS11);
            } else {
                dorVar = dorVar2;
                bwqVar = bwqVar4;
            }
            ctp ctpVar = (ctp) objS11;
            Object objS12 = bvvVar.S();
            if (objS12 == obj) {
                i3 = i2;
                z = true;
                objS12 = new hfr(bwqVar, dorVar, 1);
                bvvVar.ad(objS12);
            } else {
                i3 = i2;
                z = true;
            }
            afdr afdrVar = (afdr) objS12;
            boolean zE2 = buxVarC.E(dotVar);
            Object objS13 = bvvVar.S();
            if (zE2 || objS13 == obj) {
                objS13 = new gyv(dotVar, 14);
                bvvVar.ad(objS13);
            }
            boolean z2 = z;
            int i5 = i3;
            buxVar2 = buxVarC;
            crt.g(dds.a(cfyVarH, false, (afec) objS13), bxc.i(-1759682870, z2, new hfj(bwqVar5, domVar, afdrVar, f, afegVar4, cilVar, hgaVar, cilVar2, cilVar3, hgeVar, afegVar2, bwqVar2, bwqVar3, afegVar), buxVar2), ctpVar, buxVar2, 48);
            bvvVar.Y(false);
            boolean z3 = (i5 & 7168) == 2048 ? z2 : false;
            if ((57344 & i5) != 16384) {
                z2 = false;
            }
            afak afakVar = afak.a;
            Object objS14 = bvvVar.S();
            if ((z3 | z2) || objS14 == obj) {
                objS14 = new fry(afegVar, cilVar2, cilVar, afegVar2, cilVar3, bwqVar2, bwqVar3, (afck) null, 3);
                bvvVar.ad(objS14);
            }
            bvq.g(afakVar, (afeg) objS14, buxVar2);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(cfyVar, hgeVar, hgaVar, afegVar, afegVar2, afegVar3, i, 4);
        }
    }

    public static final void k(cfy cfyVar, hge hgeVar, hga hgaVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-133048407);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            f(cfyVar, hgeVar, hgaVar, null, afegVar, null, buxVarC, (i2 & 1022) | ((i2 << 3) & 57344), 40);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(cfyVar, hgeVar, hgaVar, afegVar, i, 7);
        }
    }

    public static int l(List list, hug hugVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = hugVar.a((ImageHeaderParser) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType m(List list, ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : n(list, new hub(byteBuffer, 0));
    }

    public static ImageHeaderParser.ImageType n(List list, huh huhVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeA = huhVar.a((ImageHeaderParser) list.get(i));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean o(List list, huf hufVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (hufVar.a((ImageHeaderParser) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int p(List list, InputStream inputStream, hxl hxlVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ibp(inputStream, hxlVar);
        }
        inputStream.mark(5242880);
        return l(list, new hud(inputStream, hxlVar, 0));
    }

    public static ImageHeaderParser.ImageType q(List list, InputStream inputStream, hxl hxlVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ibp(inputStream, hxlVar);
        }
        inputStream.mark(5242880);
        return n(list, new hub(inputStream, 1));
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }
}
