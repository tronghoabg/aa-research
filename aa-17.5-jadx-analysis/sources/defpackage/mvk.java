package defpackage;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class mvk {
    public static final yph a = yph.c("GH.EarthHostFragment");

    public static final int a(String str, List list) {
        if (affa.f(str, "choose_widget")) {
            return list.size();
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (affa.f(String.valueOf(((oqb) it.next()).a), str)) {
                break;
            }
            i++;
        }
        return i == -1 ? list.size() : i;
    }

    public static final List b(bwq bwqVar) {
        return (List) bwqVar.a();
    }

    public static final void c(oqc oqcVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-18871125);
        int i4 = 1;
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(oqcVar) : buxVarC.E(oqcVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarD = das.d(asl.H(awd.c(cfvVar, 1.0f), gjk.b.k), "earth_host_choose_widget_card");
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarD);
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
            Context context = (Context) buxVarC.f(daa.b);
            boolean zE = ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(oqcVar))) | buxVarC.E(context);
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new mvg(context, i4);
                bvvVar.ad(objS);
            }
            afdr afdrVar2 = (afdr) objS;
            cfy cfyVarK = kfn.k(awd.c(cfvVar, 1.0f), bcr.b(24.0f), buxVarC, 0);
            bcm bcmVarB = bcr.b(24.0f);
            aezr aezrVar = ktf.a;
            buxVar2 = buxVarC;
            khc.j(afdrVar2, cfyVarK, null, false, false, bcmVarB, null, kgq.e(kfn.i(buxVarC).K(), 0L, 0L, 0L, 0L, 0L, 0L, buxVar2, 254), null, null, null, null, false, bxc.i(-1212345575, true, new fun(oqcVar, context, 20), buxVar2), buxVar2, 0, 24576, 16220);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(oqcVar, i, 12);
        }
    }

    public static final void d(final oqc oqcVar, final opr oprVar, final int i, cfy cfyVar, afei afeiVar, bux buxVar, int i2) {
        int i3;
        afei afeiVar2;
        oqcVar.getClass();
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-797974428);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(oqcVar) : buxVarC.E(oqcVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? buxVarC.C(oprVar) : buxVarC.E(oprVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.A(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if (buxVarC.I((i5 & 9363) != 9362, i5 & 1)) {
            final cct cctVarI = bxc.i(-2117182002, true, new dxm(oprVar, 9), buxVarC);
            final bym bymVarF = bxc.f(oqcVar.a, afbe.a, buxVarC);
            ca.at(cfyVar, null, bxc.i(1858004302, true, new afeh() { // from class: mvc
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final int i6;
                    final bwq bwqVar;
                    ato atoVar = (ato) obj;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    yph yphVar = mvk.a;
                    atoVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar2.C(atoVar) ? 2 : 4;
                    }
                    int i7 = 0;
                    if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        bym bymVar = bymVarF;
                        float fA = ((dlg) buxVar2.f(dbc.d)).a();
                        float fD = atoVar.d();
                        float f = gjk.b.k;
                        float f2 = f + f + BitmapDescriptorFactory.HUE_RED;
                        List listL = mva.l(roc.ag(bymVar), afpt.b((fD - f2) + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) * fA, afpt.b((atoVar.c() - f2) + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) * fA, buxVar2);
                        Object objG = buxVar2.g();
                        Object obj4 = buw.a;
                        if (objG == obj4) {
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(listL, bxp.c);
                            buxVar2.x(parcelableSnapshotMutableState);
                            objG = parcelableSnapshotMutableState;
                        }
                        opr oprVar2 = oprVar;
                        int i8 = i;
                        bwq bwqVar2 = (bwq) objG;
                        int size = mvk.b(bwqVar2).size() + 1;
                        boolean z = size > 1;
                        boolean zC = buxVar2.C(mvk.b(bwqVar2)) | buxVar2.A(i8);
                        Object objG2 = buxVar2.g();
                        if (zC || objG2 == obj4) {
                            String strE = oprVar2.e(i8);
                            int iMin = (strE == null || affa.f(strE, "choose_widget")) ? Math.min(i8, mvk.b(bwqVar2).size()) : mvk.a(strE, mvk.b(bwqVar2));
                            ype ypeVar = (ype) mvk.a.f();
                            Integer numValueOf = Integer.valueOf(i8);
                            objG2 = Integer.valueOf(iMin);
                            ypeVar.R("EarthHostFragment stack %d initialized at page %d (savedWidgetId: %s)", numValueOf, objG2, strE);
                            buxVar2.x(objG2);
                        }
                        int iIntValue2 = ((Number) objG2).intValue();
                        int i9 = z ? (1073741823 - (1073741823 % size)) + iIntValue2 : iIntValue2;
                        boolean zD = buxVar2.D(z) | buxVar2.A(size);
                        Object objG3 = buxVar2.g();
                        if (zD || objG3 == obj4) {
                            objG3 = new mvd(z, size, i7);
                            buxVar2.x(objG3);
                        }
                        bbt bbtVarB = bbv.b(i9, (afdr) objG3, buxVar2, 2);
                        boolean z2 = !nsr.c().b().E();
                        boolean zM = mva.m(bbtVarB, size, buxVar2);
                        List listB = mvk.b(bwqVar2);
                        Object objG4 = buxVar2.g();
                        if (objG4 == obj4) {
                            objG4 = new mqm(bwqVar2, 9);
                            buxVar2.x(objG4);
                        }
                        afec afecVar = (afec) objG4;
                        Object objG5 = buxVar2.g();
                        if (objG5 == obj4) {
                            objG5 = mvh.a;
                            buxVar2.x(objG5);
                        }
                        afeg afegVar = (afeg) objG5;
                        Object objG6 = buxVar2.g();
                        if (objG6 == obj4) {
                            objG6 = mvi.a;
                            buxVar2.x(objG6);
                        }
                        boolean z3 = z;
                        mva.k(bbtVarB, z3, size, listL, listB, afecVar, afegVar, (afeg) objG6, iIntValue2, i8, oprVar2, buxVar2, 14352384, 8, 0);
                        Integer numValueOf2 = Integer.valueOf(bbtVarB.o());
                        List listB2 = mvk.b(bwqVar2);
                        boolean zC2 = buxVar2.C(bbtVarB) | buxVar2.A(size) | buxVar2.E(oprVar2) | buxVar2.A(i8);
                        Object objG7 = buxVar2.g();
                        if (zC2 || objG7 == obj4) {
                            mvj mvjVar = new mvj(bbtVarB, size, oprVar2, i8, bwqVar2, null);
                            i6 = size;
                            bwqVar = bwqVar2;
                            buxVar2.x(mvjVar);
                            objG7 = mvjVar;
                        } else {
                            i6 = size;
                            bwqVar = bwqVar2;
                        }
                        bvq.f(numValueOf2, listB2, (afeg) objG7, buxVar2);
                        cfv cfvVar = cfy.e;
                        cfy cfyVarC = awd.c(cfvVar, 1.0f);
                        ctp ctpVarB = atk.b(cfl.a, false);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarC);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        final oqc oqcVar2 = oqcVar;
                        final afei afeiVar3 = cctVarI;
                        byq.c(buxVar2, ctpVarB, cwb.e);
                        byq.c(buxVar2, ccxVarN, cwb.d);
                        byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                        byq.b(buxVar2, cwb.g);
                        byq.c(buxVar2, cfyVarJ, cwb.c);
                        atn atnVar = atn.a;
                        mcd.u(z2, bbtVarB, afp.E(awd.c(cfvVar, 1.0f), cjv.h(kfn.i(buxVar2).a(), ((Number) ady.b(true != bbtVarB.i() ? BitmapDescriptorFactory.HUE_RED : 0.1f, null, null, null, buxVar2, 0, 30).a()).floatValue()), bcr.b(24.0f)), gjk.c.k, null, bxc.i(-1827953186, true, new afei() { // from class: mve
                            @Override // defpackage.afei
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int iIntValue3 = ((Integer) obj6).intValue();
                                bux buxVar3 = (bux) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                yph yphVar2 = mvk.a;
                                ((bbk) obj5).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= true != buxVar3.A(iIntValue3) ? 16 : 32;
                                }
                                if (buxVar3.I((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
                                    oqb oqbVar = (oqb) woy.bI(mvk.b(bwqVar), mcd.n(iIntValue3, i6));
                                    if ((oqbVar != null ? oqbVar.b : null) == null) {
                                        oqc oqcVar3 = oqcVar2;
                                        buxVar3.v(-662774883);
                                        jur.b(bxc.i(29358555, true, new msw(oqcVar3, 15), buxVar3), buxVar3, 6);
                                        buxVar3.o();
                                        return afak.a;
                                    }
                                    afei afeiVar4 = afeiVar3;
                                    buxVar3.v(-662675900);
                                    buxVar3.o();
                                    int i10 = oqbVar.a;
                                    buxVar3.t(-21375979, Integer.valueOf(i10));
                                    afeiVar4.invoke(oqbVar, das.d(asl.H(awd.c(cfy.e, 1.0f), gjk.b.k), "earth_host_widget_card_" + i10), buxVar3, 8);
                                    buxVar3.m();
                                } else {
                                    buxVar3.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 1572864, 48);
                        jur.b(bxc.i(-312558618, true, new mvf(atnVar, zM, bbtVarB, z2, i6, z3, 0), buxVar2), buxVar2, 6);
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, ((i5 >> 9) & 14) | 3072, 6);
            afeiVar2 = cctVarI;
        } else {
            buxVarC.s();
            afeiVar2 = afeiVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmv(oqcVar, oprVar, i, cfyVar, afeiVar2, i2, 9);
        }
    }
}
