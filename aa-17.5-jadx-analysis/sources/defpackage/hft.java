package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public final class hft {
    public static final float a = gjk.c.k;

    public static final void a(cfy cfyVar, final hge hgeVar, final hga hgaVar, final hgc hgcVar, final afeg afegVar, final afeg afegVar2, final afeg afegVar3, bux buxVar, final int i, final int i2) {
        cfy cfyVar2;
        int i3;
        final cfy cfyVar3;
        cfy cfyVar4;
        dor dorVar;
        bwq bwqVar;
        ctp ctpVar;
        bux buxVarC = buxVar.c(1184101112);
        if (i2 != 0) {
            i3 = i | 6;
            cfyVar2 = cfyVar;
        } else if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.A(hgcVar.ordinal()) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.E(afegVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.E(afegVar3) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            } else if (i2 != 0) {
                cfyVar2 = cfy.e;
            }
            buxVarC.l();
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
                objS3 = new cil();
                bvvVar.ad(objS3);
            }
            cil cilVar3 = (cil) objS3;
            cfy cfyVarH = asl.H(hdx.b(hes.e(hdz.b(awd.c(cfyVar2, 1.0f), hgaVar), hgaVar, buxVarC), hgcVar, hgaVar, buxVarC, ((i3 >> 6) & 112) | (i3 & 896)).a(new aix(cjn.i(0), ckq.a)), gjk.c.k);
            buxVarC.v(-1066585843);
            buxVarC.v(-487956875);
            bvvVar.Y(false);
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                objS4 = new dot(dlgVar);
                bvvVar.ad(objS4);
            }
            dot dotVar = (dot) objS4;
            Object objS5 = bvvVar.S();
            if (objS5 == obj) {
                objS5 = new dom((char[]) null);
                bvvVar.ad(objS5);
            }
            dom domVar = (dom) objS5;
            Object objS6 = bvvVar.S();
            if (objS6 == obj) {
                cfyVar4 = cfyVar2;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS6 = parcelableSnapshotMutableState;
            } else {
                cfyVar4 = cfyVar2;
            }
            bwq bwqVar2 = (bwq) objS6;
            Object objS7 = bvvVar.S();
            if (objS7 == obj) {
                objS7 = new dor(domVar);
                bvvVar.ad(objS7);
            }
            dor dorVar2 = (dor) objS7;
            Object objS8 = bvvVar.S();
            if (objS8 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(afak.a, bxp.b);
                bvvVar.ad(parcelableSnapshotMutableState2);
                objS8 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar3 = (bwq) objS8;
            boolean zE = buxVarC.E(dotVar) | buxVarC.A(257);
            Object objS9 = bvvVar.S();
            if (zE || objS9 == obj) {
                objS9 = new hfq(bwqVar3, dotVar, dorVar2, bwqVar2, 0);
                dorVar = dorVar2;
                bwqVar = bwqVar2;
                bvvVar.ad(objS9);
            } else {
                dorVar = dorVar2;
                bwqVar = bwqVar2;
            }
            ctp ctpVar2 = (ctp) objS9;
            Object objS10 = bvvVar.S();
            if (objS10 == obj) {
                ctpVar = ctpVar2;
                objS10 = new hfr(bwqVar, dorVar, 0);
                bvvVar.ad(objS10);
            } else {
                ctpVar = ctpVar2;
            }
            afdr afdrVar = (afdr) objS10;
            boolean zE2 = buxVarC.E(dotVar);
            Object objS11 = bvvVar.S();
            if (zE2 || objS11 == obj) {
                objS11 = new gyv(dotVar, 17);
                bvvVar.ad(objS11);
            }
            crt.g(dds.a(cfyVarH, false, (afec) objS11), bxc.i(-1759682870, true, new hfs(bwqVar3, domVar, afdrVar, afegVar, hgcVar, cilVar, cilVar2, cilVar3, afegVar2, afegVar3, hgaVar, hgeVar), buxVarC), ctpVar, buxVarC, 48);
            bvvVar.Y(false);
            cfyVar3 = cfyVar4;
        } else {
            buxVarC.s();
            cfyVar3 = cfyVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: hfo
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    cfy cfyVar5 = cfyVar3;
                    hge hgeVar2 = hgeVar;
                    hga hgaVar2 = hgaVar;
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    hft.a(cfyVar5, hgeVar2, hgaVar2, hgcVar, afegVar, afegVar2, afegVar3, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6), i2);
                    return afak.a;
                }
            };
        }
    }

    public static /* synthetic */ afak b(dol dolVar, dol dolVar2, dok dokVar, doi doiVar) {
        doiVar.getClass();
        doiVar.e.j(dolVar, BitmapDescriptorFactory.HUE_RED);
        doiVar.g.j(dolVar2, BitmapDescriptorFactory.HUE_RED);
        doiVar.i.k(dokVar, BitmapDescriptorFactory.HUE_RED);
        doiVar.j.k(doiVar.c.g, BitmapDescriptorFactory.HUE_RED);
        doiVar.c(new ncp("spread"));
        doiVar.b(new ncp("spread"));
        return afak.a;
    }

    public static final void c(dom domVar, doj dojVar, doj dojVar2, hgc hgcVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1128726971);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dojVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(dojVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.A(hgcVar.ordinal()) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            int i5 = i2 & 896;
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i5 == 256 || objS == buw.a) {
                objS = new hfl(dojVar2, i4);
                bvvVar.ad(objS);
            }
            cfy cfyVarH = dom.h(cfvVar, dojVar, (afec) objS);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
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
            fwn.f(hgcVar == hgc.a, 0, 0, hff.a, buxVarC, 3072, 6);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(domVar, dojVar, dojVar2, hgcVar, i, 8);
        }
    }

    public static final void d(dom domVar, hge hgeVar, doj dojVar, doj dojVar2, doj dojVar3, hga hgaVar, doj dojVar4, bux buxVar, int i) throws dpm {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1168586361);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(dojVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(dojVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(dojVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(dojVar4) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new hao(14);
                bvvVar.ad(objS);
            }
            hgd hgdVar = hgeVar.b;
            afec afecVar = (afec) objS;
            dol dolVarC = domVar.c(((dlj) afecVar.invoke(null)).a);
            float f = ((dlj) afecVar.invoke(hgdVar.a)).a;
            dos dosVar = new dos(Integer.valueOf(domVar.a()));
            dpl dplVarD = domVar.d(dosVar);
            dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "vGuideline");
            dplVarD.s("end", f);
            domVar.e(5);
            domVar.e(Float.floatToIntBits(f));
            dol dolVar = new dol(dosVar.h, 0, dosVar);
            dok dokVarB = domVar.b(((dlj) afecVar.invoke(hgdVar.b)).a);
            dol dolVarJ = domVar.j(new dos[]{dojVar, dolVarC.c});
            dol dolVarK = domVar.k(new dos[]{dojVar2, dolVar.c});
            dok dokVarI = domVar.i(new dos[]{dojVar3, dokVarB.c});
            cfy cfyVarA = hdv.b(cfy.e, hgaVar, hgeVar.a).a(new aix(hgeVar.d, ckq.a));
            boolean zC = buxVarC.C(dolVarJ) | buxVarC.C(dolVarK) | buxVarC.C(dokVarI);
            Object objS2 = bvvVar.S();
            if (zC || objS2 == obj) {
                objS2 = new cib(dolVarJ, dolVarK, dokVarI, 19, (int[]) null);
                bvvVar.ad(objS2);
            }
            atk.c(vq.b(dom.h(cfyVarA, dojVar4, (afec) objS2), -10.0f), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfp(domVar, hgeVar, dojVar, dojVar2, dojVar3, hgaVar, dojVar4, i, 0);
        }
    }

    public static final void e(final dom domVar, final doj dojVar, final afeg afegVar, hgc hgcVar, final cil cilVar, final cil cilVar2, final cil cilVar3, final boolean z, final boolean z2, bux buxVar, final int i) {
        int i2;
        final hgc hgcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2139569365);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dojVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.A(hgcVar.ordinal()) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar3) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.D(z2) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new hao(13);
                bvvVar.ad(objS);
            }
            cfy cfyVarJ = bxc.j(asl.J(dom.h(cfvVar, dojVar, (afec) objS), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a, BitmapDescriptorFactory.HUE_RED), cilVar);
            boolean z3 = (29360128 & i2) == 8388608;
            int i4 = i2;
            boolean z4 = (458752 & i2) == 131072;
            boolean z5 = (i4 & 234881024) == 67108864;
            boolean z6 = (i4 & 3670016) == 1048576;
            Object objS2 = bvvVar.S();
            if ((z6 | z3 | z4 | z5) || objS2 == obj) {
                objS2 = new afec() { // from class: hfm
                    @Override // defpackage.afec
                    public final Object invoke(Object obj2) {
                        giz gizVar = (giz) obj2;
                        float f = hft.a;
                        gizVar.getClass();
                        boolean zA = false;
                        if (gizVar == giz.d) {
                            if (z) {
                                zA = cilVar2.a(7);
                            } else if (z2) {
                                zA = cilVar3.a(7);
                            }
                        }
                        return Boolean.valueOf(zA);
                    }
                };
                bvvVar.ad(objS2);
            }
            cfy cfyVarJ2 = fxi.j(cfyVarJ, (afec) objS2);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarJ2);
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
            byq.c(buxVarC, cfyVarJ3, cwb.c);
            hgcVar2 = hgcVar;
            fwn.f(hgcVar2 == hgc.b, 0, 0, bxc.i(789357847, true, new guq(afegVar, 15), buxVarC), buxVarC, 3072, 6);
            bvvVar.Y(true);
        } else {
            hgcVar2 = hgcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: hfn
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    dom domVar2 = domVar;
                    doj dojVar2 = dojVar;
                    afeg afegVar2 = afegVar;
                    hgc hgcVar3 = hgcVar2;
                    cil cilVar4 = cilVar;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    hft.e(domVar2, dojVar2, afegVar2, hgcVar3, cilVar4, cilVar2, cilVar3, z, z2, buxVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(dom domVar, doj dojVar, doj dojVar2, afeg afegVar, cil cilVar, cil cilVar2, bux buxVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(921362625);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dojVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(dojVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar2) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            int i5 = i2 & 896;
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i5 == 256 || objS == buw.a) {
                objS = new hfl(dojVar2, i4);
                bvvVar.ad(objS);
            }
            cfy cfyVarJ = bxc.j(asl.J(dom.h(cfvVar, dojVar, (afec) objS), a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), cilVar);
            int i6 = 458752 & i2;
            Object objS2 = bvvVar.S();
            if (i6 == 131072 || objS2 == buw.a) {
                z = false;
                objS2 = new hfl(cilVar2, 0 == true ? 1 : 0);
                bvvVar.ad(objS2);
            } else {
                z = false;
            }
            cfy cfyVarJ2 = fxi.j(cfyVarJ, (afec) objS2);
            ctp ctpVarB = atk.b(cfl.a, z);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarJ2);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            int i7 = i2;
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar2 = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar2);
            afeg afegVar3 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar3);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar4 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar4);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar5 = cwb.c;
            byq.c(buxVarC, cfyVarJ3, afegVar5);
            cfy cfyVarV = awd.v(awd.b(cfvVar, 1.0f), false, 3);
            ctp ctpVarB2 = atk.b(cfl.i, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarV);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar2);
            byq.c(buxVarC, ccxVarAh2, afegVar3);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar5);
            afegVar.invoke(buxVarC, Integer.valueOf((i7 >> 9) & 14));
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(domVar, dojVar, dojVar2, afegVar, cilVar, cilVar2, i, 5);
        }
    }

    public static final void g(dom domVar, doj dojVar, doj dojVar2, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, bux buxVar, int i) {
        int i2;
        hgc hgcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(110454422);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dojVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(dojVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.A(hgcVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar2) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            int i5 = i2 & 896;
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i5 == 256 || objS == buw.a) {
                objS = new hfl(dojVar2, i4);
                bvvVar.ad(objS);
            }
            cfy cfyVarJ = bxc.j(asl.J(dom.h(cfvVar, dojVar, (afec) objS), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a), cilVar);
            int i6 = i2 & 3670016;
            Object objS2 = bvvVar.S();
            int i7 = 3;
            if (i6 == 1048576 || objS2 == buw.a) {
                objS2 = new hfl(cilVar2, i7);
                bvvVar.ad(objS2);
            }
            cfy cfyVarJ2 = fxi.j(cfyVarJ, (afec) objS2);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarJ2);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar2 = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar2);
            afeg afegVar3 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar3);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar4 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar4);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar5 = cwb.c;
            byq.c(buxVarC, cfyVarJ3, afegVar5);
            cfy cfyVarA = awd.t(awd.r(cfvVar), null, 3).a(new aix(cjn.i(0), ckq.a));
            ctp ctpVarB2 = atk.b(cfl.c, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarA);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar2);
            byq.c(buxVarC, ccxVarAh2, afegVar3);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar5);
            hgcVar2 = hgcVar;
            fwn.f(hgcVar2 == hgc.b, 0, 0, bxc.i(680062234, true, new guq(afegVar, 16), buxVarC), buxVarC, 3072, 6);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            hgcVar2 = hgcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfp(domVar, dojVar, dojVar2, afegVar, hgcVar2, cilVar, cilVar2, i, 2);
        }
    }

    public static final void h(dom domVar, doj dojVar, doj dojVar2, doj dojVar3, hga hgaVar, hge hgeVar, doj dojVar4, bux buxVar, int i) throws dpm {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1224545784);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dojVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(dojVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(dojVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(dojVar4) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            dol dolVarJ = domVar.j(new dos[]{dojVar});
            dol dolVarK = domVar.k(new dos[]{dojVar2});
            dok dokVarI = domVar.i(new dos[]{dojVar3});
            cfy cfyVarA = hdv.c(cfy.e, hgaVar, hgeVar.a).a(new aix(hgeVar.c, ckq.a));
            boolean zC = buxVarC.C(dolVarJ) | buxVarC.C(dolVarK) | buxVarC.C(dokVarI);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new cib(dolVarJ, dolVarK, dokVarI, 18, (int[]) null);
                bvvVar.ad(objS);
            }
            atk.c(vq.b(dom.h(cfyVarA, dojVar4, (afec) objS), -100.0f), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfp(domVar, dojVar, dojVar2, dojVar3, hgaVar, hgeVar, dojVar4, i, 1);
        }
    }
}
