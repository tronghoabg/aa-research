package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Row;
import androidx.car.app.model.SectionedItemList;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class gqk {
    public static final void a(final gql gqlVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        byb bybVar;
        aizk aizkVar;
        long jC;
        long jU;
        long j;
        int i3;
        long j2;
        long j3;
        bwq bwqVar;
        byb bybVar2;
        bwq bwqVar2;
        bvv bvvVar;
        boolean z;
        hjw hjwVar;
        hjw hjwVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1804370868);
        if (i4 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqlVar) : buxVarC.E(gqlVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqlVar.a, null, buxVarC);
            bym bymVarD2 = dyz.d(gqlVar.b, Float.valueOf(BitmapDescriptorFactory.HUE_RED), buxVarC);
            aiyk aiykVar = gqlVar.c;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new dww((afck) null, 2, (char[]) null);
                bvvVar2.ad(objS);
            }
            bym bymVarD3 = dyz.d(aiykVar, objS, buxVarC);
            aiyk aiykVar2 = gqlVar.d;
            gqm gqmVar = new gqm(null, null);
            hjw hjwVar3 = hjw.a;
            bym bymVarD4 = dyz.d(aiykVar2, gqmVar, buxVarC);
            final bym bymVarD5 = dyz.d(gqlVar.e, false, buxVarC);
            bym bymVarD6 = dyz.d(gqlVar.f, false, buxVarC);
            Object objS2 = bvvVar2.S();
            if (objS2 == obj) {
                objS2 = new asg();
                bvvVar2.ad(objS2);
            }
            asf asfVar = (asf) objS2;
            Object objS3 = bvvVar2.S();
            if (objS3 == obj) {
                objS3 = aizq.e(0, 1, 0, 5);
                bvvVar2.ad(objS3);
            }
            aizk aizkVar2 = (aizk) objS3;
            Object objS4 = bvvVar2.S();
            if (objS4 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar2.ad(parcelableSnapshotMutableState);
                objS4 = parcelableSnapshotMutableState;
            }
            bwq bwqVar3 = (bwq) objS4;
            Object objS5 = bvvVar2.S();
            if (objS5 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar2.ad(parcelableSnapshotMutableState2);
                objS5 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar4 = (bwq) objS5;
            Object objS6 = bvvVar2.S();
            if (objS6 == obj) {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = new ParcelableSnapshotMutableFloatState(((Number) bymVarD2.a()).floatValue());
                bvvVar2.ad(parcelableSnapshotMutableFloatState);
                objS6 = parcelableSnapshotMutableFloatState;
            }
            byb bybVar3 = (byb) objS6;
            Float fValueOf = Float.valueOf(((Number) bymVarD2.a()).floatValue());
            boolean zC = buxVarC.C(bymVarD2);
            Object objS7 = bvvVar2.S();
            if (zC || objS7 == obj) {
                objS7 = new gqj(bwqVar3, bymVarD2, bybVar3, (afck) null, 0);
                bybVar = bybVar3;
                bvvVar2.ad(objS7);
            } else {
                bybVar = bybVar3;
            }
            bvq.g(fValueOf, (afeg) objS7, buxVarC);
            bym bymVarC = byx.c((afeg) bymVarD3.a(), buxVarC);
            afak afakVar = afak.a;
            boolean zE = buxVarC.E(aizkVar2) | buxVarC.C(bymVarC);
            Object objS8 = bvvVar2.S();
            if (zE || objS8 == obj) {
                objS8 = new bqi(aizkVar2, bymVarC, bwqVar3, (afck) null, 10);
                aizkVar = aizkVar2;
                bwqVar3 = bwqVar3;
                bvvVar2.ad(objS8);
            } else {
                aizkVar = aizkVar2;
            }
            bvq.g(afakVar, (afeg) objS8, buxVarC);
            gqm gqmVar2 = (gqm) bymVarD4.a();
            boolean zBooleanValue = ((Boolean) bwqVar4.a()).booleanValue();
            if (zBooleanValue || (hjwVar2 = gqmVar2.a) == null) {
                buxVarC.v(1612572517);
                jC = gux.c(buxVarC).C();
                bvvVar2.Y(false);
            } else {
                buxVarC.v(1612611608);
                jC = l(hjwVar2, buxVarC);
                bvvVar2.Y(false);
            }
            if (zBooleanValue || (hjwVar = gqmVar2.b) == null) {
                buxVarC.v(1612742335);
                jU = gux.c(buxVarC).u();
                bvvVar2.Y(false);
            } else {
                buxVarC.v(1612787378);
                jU = l(hjwVar, buxVarC);
                bvvVar2.Y(false);
            }
            long jH = cjv.h(jU, 0.15f);
            bqb bqbVar = bqb.a;
            long jN = cjn.n();
            long jN2 = cjn.n();
            long jN3 = cjn.n();
            long jN4 = cjn.n();
            bpv bpvVarB = bqb.b(czz.at(buxVarC));
            if (jC != 16) {
                j = jC;
            } else {
                j = bpvVarB.a;
                jC = 16;
            }
            if (jC != 16) {
                i3 = 0;
                j2 = jC;
            } else {
                i3 = 0;
                j2 = bpvVarB.b;
            }
            long j4 = jN != 16 ? jN : bpvVarB.c;
            if (jH != 16) {
                j3 = jH;
            } else {
                j3 = bpvVarB.d;
                jH = 16;
            }
            long j5 = jN2 != 16 ? jN2 : bpvVarB.e;
            long jI = cjn.i(i3);
            if (jI == 16) {
                jI = bpvVarB.f;
            }
            long j6 = jI;
            if (jC == 16) {
                jC = bpvVarB.g;
            }
            long j7 = jC;
            long j8 = jN3 != 16 ? jN3 : bpvVarB.h;
            if (jH == 16) {
                jH = bpvVarB.i;
            }
            final bpv bpvVar = new bpv(j, j2, j4, j3, j5, j6, j7, j8, jH, jN4 != 16 ? jN4 : bpvVarB.j);
            asx asxVarG = atd.g(gjk.b.k);
            cfr cfrVar = cfl.n;
            buxVarC.v(-1166334189);
            float f = gpp.a;
            aizk aizkVar3 = aizkVar;
            int i5 = 1;
            cfy cfyVarA = ggh.a(cfyVar, gpp.h, 0L, 0L, null, null, null, false, true, buxVarC, ((i2 >> 3) & 14) | 100663296, 126);
            if (((Boolean) bwqVar4.a()).booleanValue()) {
                Object objS9 = bvvVar2.S();
                if (objS9 == obj) {
                    objS9 = new gqr(i5);
                    bvvVar2.ad(objS9);
                }
                cfyVarA = fxi.j(cfyVarA, (afec) objS9);
            }
            bvvVar2.Y(false);
            cfy cfyVarJ = asl.J(cfyVarA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.a.k, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA = avv.a(asxVarG, cfrVar, buxVarC, 48);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            boolean z2 = gqlVar.g;
            avy avyVar = avy.a;
            float fE = bybVar.e();
            afgw afgwVar = new afgw(BitmapDescriptorFactory.HUE_RED, 1.0f);
            cfy cfyVarB = avyVar.b(cfy.e, 1.0f, true);
            final float f2 = true != z2 ? 16.0f : 24.0f;
            cfy cfyVarD = awd.d(cfyVarB, f2);
            boolean zE2 = buxVarC.E(aizkVar3);
            Object objS10 = bvvVar2.S();
            if (zE2 || objS10 == obj) {
                bwq bwqVar5 = bwqVar3;
                byb bybVar4 = bybVar;
                objS10 = new gaz(aizkVar3, bwqVar4, bybVar4, bwqVar5, 4);
                bwqVar = bwqVar4;
                bybVar2 = bybVar4;
                bwqVar2 = bwqVar5;
                bvvVar2.ad(objS10);
            } else {
                bwqVar2 = bwqVar3;
                bwqVar = bwqVar4;
                bybVar2 = bybVar;
            }
            cfy cfyVarE = crt.e(cfyVarD, (afec) objS10);
            Object objS11 = bvvVar2.S();
            if (objS11 == obj) {
                objS11 = new dmz(bwqVar, 10);
                bvvVar2.ad(objS11);
            }
            cfy cfyVarD2 = das.d(ti.h(cfyVarE, (afec) objS11), "slider");
            boolean zBooleanValue2 = ((Boolean) bymVarD5.a()).booleanValue();
            Object objS12 = bvvVar2.S();
            if (objS12 == obj) {
                objS12 = new gdg(bwqVar2, bybVar2, 19, null);
                bvvVar2.ad(objS12);
            }
            afec afecVar = (afec) objS12;
            boolean zE3 = buxVarC.E(aizkVar3);
            Object objS13 = bvvVar2.S();
            if (zE3 || objS13 == obj) {
                objS13 = new fwc(aizkVar3, bybVar2, 7);
                bvvVar2.ad(objS13);
            }
            bqh.e(fE, afecVar, cfyVarD2, zBooleanValue2, (afdr) objS13, bpvVar, asfVar, bxc.i(1361016404, true, new afeh() { // from class: gqi
                @Override // defpackage.afeh
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    bux buxVar3 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((bqj) obj2).getClass();
                    int i6 = iIntValue & 17;
                    if (buxVar3.I(i6 != 16, iIntValue & 1)) {
                        bym bymVar = bymVarD5;
                        float f3 = f2;
                        bqb.a.c(new asg(), asl.J(cfy.e, true != gqlVar.g ? 0.0f : 2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), bpvVar, ((Boolean) bymVar.a()).booleanValue(), roc.aA(4.0f, f3), buxVar3, 196608);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), bxc.i(-335006955, true, new fum(bpvVar, gqlVar, bymVarD6, bymVarD5, 4), buxVarC), afgwVar, buxVarC, 907542576, 0);
            buxVar2 = buxVarC;
            String str = (String) bymVarD.a();
            if (str == null) {
                buxVar2.v(-1341535296);
                bvvVar2.Y(false);
                z = true;
                bvvVar = bvvVar2;
            } else {
                buxVar2.v(-1341535295);
                bvvVar = bvvVar2;
                brp.b(str, null, gux.c(buxVar2).v(), 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar2).l, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 16777151), buxVar2, 0, 0, 131066);
                buxVar2 = buxVar2;
                bvvVar.Y(false);
                z = true;
            }
            bvvVar.Y(z);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqlVar, cfyVar, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.bqj r32, defpackage.bpv r33, boolean r34, boolean r35, boolean r36, defpackage.bux r37, int r38) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqk.b(bqj, bpv, boolean, boolean, boolean, bux, int):void");
    }

    public static final fwm c(bym bymVar) {
        return (fwm) bymVar.a();
    }

    public static final fwm d(bym bymVar) {
        return (fwm) bymVar.a();
    }

    public static final void e(fwm fwmVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        bxf bxfVarJ;
        gox goxVar;
        bux buxVarC = buxVar.c(-1162985164);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fwmVar) : buxVarC.E(fwmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            fwi fwiVar = fwmVar.a;
            fxl fxlVar = fwiVar instanceof fxl ? (fxl) fwiVar : null;
            if (fxlVar == null) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    goxVar = new gox(fwmVar, afdrVar, i, 16);
                    bxfVarJ.c = goxVar;
                }
                return;
            }
            int iH = cjn.h(gux.c(buxVarC).a());
            fwd fwdVar = new fwd(iH, iH);
            int iH2 = cjn.h(gux.c(buxVarC).a());
            fwd fwdVar2 = new fwd(iH2, iH2);
            int iH3 = cjn.h(gux.c(buxVarC).a());
            fwd fwdVar3 = new fwd(iH3, iH3);
            int iH4 = cjn.h(gux.c(buxVarC).v());
            fwd fwdVar4 = new fwd(iH4, iH4);
            int iH5 = cjn.h(gux.c(buxVarC).v());
            fwd fwdVar5 = new fwd(iH5, iH5);
            int iH6 = cjn.h(gux.c(buxVarC).a());
            gvq.g(fwm.a(fwmVar, fxl.e(fxlVar, afdrVar, new fwe(fwdVar4, fwdVar2, fwdVar, fwdVar5, new fwd(iH6, iH6), fwdVar3, null, null), false, false, 491), null, null, 6), null, buxVarC, 8, 1);
        } else {
            buxVarC.s();
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            goxVar = new gox(fwmVar, afdrVar, i, 17);
            bxfVarJ.c = goxVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.fwm r17, defpackage.cfy r18, java.util.List r19, boolean r20, defpackage.afdr r21, defpackage.dlj r22, defpackage.bux r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqk.f(fwm, cfy, java.util.List, boolean, afdr, dlj, bux, int, int):void");
    }

    public static final void g(fwm fwmVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        bxf bxfVarJ;
        gox goxVar;
        bux buxVarC = buxVar.c(-1196306393);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fwmVar) : buxVarC.E(fwmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            fxo fxoVar = fwmVar.b;
            fwy fwyVar = fxoVar instanceof fwy ? (fwy) fxoVar : null;
            if (fwyVar == null) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    goxVar = new gox(fwmVar, afdrVar, i, 18);
                    bxfVarJ.c = goxVar;
                }
                return;
            }
            gjy.b(fwm.a(fwmVar, null, fwy.c(fwyVar, afdrVar, new hjw(gux.c(buxVarC).v(), gux.c(buxVarC).v()), false, null, 107), null, 5), null, new hjw(gux.c(buxVarC).a(), gux.c(buxVarC).a()), null, buxVarC, 8, 10);
        } else {
            buxVarC.s();
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            goxVar = new gox(fwmVar, afdrVar, i, 19);
            bxfVarJ.c = goxVar;
        }
    }

    public static final har h(ItemList itemList, geu geuVar) {
        han hanVarA;
        int selectedIndex = -1;
        if (itemList.getSelectedIndex() >= 0 && itemList.getSelectedIndex() < itemList.getItems().size() && itemList.getOnSelectedDelegate() != null) {
            selectedIndex = itemList.getSelectedIndex();
        }
        int i = selectedIndex;
        List<uf> items = itemList.getItems();
        items.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(items, 10));
        int i2 = 0;
        int i3 = 0;
        for (Object obj : items) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                woy.bo();
            }
            uf ufVar = (uf) obj;
            if (ufVar instanceof Row) {
                hanVarA = haq.b((Row) ufVar, geuVar);
            } else {
                if (!(ufVar instanceof ConversationItem)) {
                    Objects.toString(ufVar);
                    throw new IllegalArgumentException("Unsupported item for RowSection: ".concat(String.valueOf(ufVar)));
                }
                hanVarA = haq.a((ConversationItem) ufVar, geuVar);
            }
            han hanVarC = hanVarA;
            if (itemList.getOnSelectedDelegate() != null) {
                hanVarC = han.c(hanVarC, false, null, new has(geuVar, itemList, i3, i2), null, null, 65471);
            }
            arrayList.add(hanVarC);
            i3 = i4;
        }
        return new har(null, itemList.getNoItemsMessage(), grv.c(itemList, geuVar), i, arrayList, 67);
    }

    public static final har i(SectionedItemList sectionedItemList, geu geuVar) {
        sectionedItemList.getClass();
        return har.f(h(sectionedItemList.getItemList(), geuVar), sectionedItemList.getHeader(), null, 0, null, 126);
    }

    public static /* synthetic */ String j(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "CONVERSATION" : "ICON" : "LARGE" : "MEDIUM" : "SMALL" : "EXTRA_SMALL";
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final defpackage.gqh r38, final defpackage.ncp r39, defpackage.cfy r40, boolean r41, boolean r42, int r43, defpackage.bux r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqk.k(gqh, ncp, cfy, boolean, boolean, int, bux, int, int):void");
    }

    private static final long l(hjw hjwVar, bux buxVar) {
        return fww.q(hjwVar.b(buxVar), 0L, 0, buxVar, 14);
    }
}
