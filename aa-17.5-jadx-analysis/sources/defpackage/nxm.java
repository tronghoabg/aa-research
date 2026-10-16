package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class nxm {
    public static final yph a = yph.c("GH.ComposeNotifCenter");

    public static final void a(final List list, final afec afecVar, final afdr afdrVar, bux buxVar, int i) {
        int i2;
        afecVar.getClass();
        afdrVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-595044300);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfy awgVar = cfy.e;
            cfy cfyVarA = awgVar.a(new aix(ksp.j(krr.p, buxVarC), ckq.a));
            if (nsr.c().b().D() || ldz.a.a().b()) {
                awgVar = new awg(awr.a);
            }
            cfy cfyVarA2 = cfyVarA.a(awgVar);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(list));
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z || objS == buw.a) {
                objS = new nxb(list, i4);
                bvvVar.ad(objS);
            }
            cfy cfyVarK = ebj.k(cfyVarA2, (afdr) objS);
            int i5 = i2 & 896;
            Object objS2 = bvvVar.S();
            if (i5 == 256 || objS2 == buw.a) {
                objS2 = new nxj(afdrVar, 1);
                bvvVar.ad(objS2);
            }
            ca.at(ti.h(cfyVarK, (afec) objS2), null, bxc.i(-1648892130, true, new afeh() { // from class: nxc
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean zB;
                    axr axrVar;
                    ato atoVar = (ato) obj;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    yph yphVar = nxm.a;
                    atoVar.getClass();
                    int i6 = 4;
                    int i7 = 2;
                    int i8 = 1;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar2.C(atoVar) ? 2 : 4;
                    }
                    if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        float fD = atoVar.d();
                        int i9 = nwz.c;
                        boolean z2 = dlj.a(fD, 710.0f) < 0;
                        Object objG = buxVar2.g();
                        Object obj4 = buw.a;
                        if (objG == obj4) {
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                            buxVar2.x(parcelableSnapshotMutableState);
                            objG = parcelableSnapshotMutableState;
                        }
                        final List list2 = list;
                        bwq bwqVar = (bwq) objG;
                        if (list2.isEmpty()) {
                            afdr afdrVar2 = afdrVar;
                            buxVar2.v(-604276558);
                            Boolean boolValueOf = Boolean.valueOf(((Boolean) bwqVar.a()).booleanValue());
                            boolean zC = buxVar2.C(afdrVar2);
                            Object objG2 = buxVar2.g();
                            if (zC || objG2 == obj4) {
                                objG2 = new nkn(afdrVar2, bwqVar, (afck) null, 8);
                                buxVar2.x(objG2);
                            }
                            bvq.g(boolValueOf, (afeg) objG2, buxVar2);
                            nxm.b(afdrVar2, awd.c(cfy.e, 1.0f), buxVar2, 48);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-603761927);
                            Object objG3 = buxVar2.g();
                            if (objG3 == obj4) {
                                objG3 = new nxb(bwqVar, i7);
                                buxVar2.x(objG3);
                            }
                            buxVar2.r((afdr) objG3);
                            Object objG4 = buxVar2.g();
                            if (objG4 == obj4) {
                                objG4 = new SnapshotStateList();
                                buxVar2.x(objG4);
                            }
                            final SnapshotStateList snapshotStateList = (SnapshotStateList) objG4;
                            final axr axrVarA = axs.a(buxVar2);
                            Object objG5 = buxVar2.g();
                            if (objG5 == obj4) {
                                nxb nxbVar = new nxb(axrVarA, 3);
                                lah lahVar = byj.a;
                                bvk bvkVar = new bvk(nxbVar, null);
                                buxVar2.x(bvkVar);
                                objG5 = bvkVar;
                            }
                            bym bymVar = (bym) objG5;
                            Object objG6 = buxVar2.g();
                            if (objG6 == obj4) {
                                nxb nxbVar2 = new nxb(axrVarA, i6);
                                lah lahVar2 = byj.a;
                                bvk bvkVar2 = new bvk(nxbVar2, null);
                                buxVar2.x(bvkVar2);
                                objG6 = bvkVar2;
                            }
                            bym bymVar2 = (bym) objG6;
                            Object objG7 = buxVar2.g();
                            if (objG7 == obj4) {
                                objG7 = "ClearAll";
                                buxVar2.x("ClearAll");
                            }
                            final String str = (String) objG7;
                            Object objG8 = buxVar2.g();
                            if (objG8 == obj4) {
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
                                buxVar2.x(parcelableSnapshotMutableState2);
                                objG8 = parcelableSnapshotMutableState2;
                            }
                            final bwq bwqVar2 = (bwq) objG8;
                            final boolean zB2 = ldz.a.a().b();
                            float f = (z2 ? gjk.b : gjk.i).k;
                            float f2 = z2 ? gjk.b.k : gjk.e.k;
                            avr avrVar = new avr(f, f2, f, f2);
                            cfy cfyVarD = das.d(awd.c(cfy.e, 1.0f), "List");
                            if (zB2) {
                                cfyVarD = bxc.r(cjn.f(cfyVarD, new nqz(11)), new nyq(((Boolean) bymVar.a()).booleanValue(), ((Boolean) bymVar2.a()).booleanValue(), i8));
                            }
                            if (z2) {
                                buxVar2.v(-602731926);
                                buxVar2.o();
                                zB = false;
                            } else {
                                buxVar2.v(257651659);
                                kvv kvvVar = kvv.a;
                                zB = kvv.b(buxVar2);
                                buxVar2.o();
                            }
                            asx asxVarG = atd.g(gjk.a.k);
                            Object objG9 = buxVar2.g();
                            if (objG9 == obj4) {
                                objG9 = new kvt((afck) null, 2, (char[]) null);
                                buxVar2.x(objG9);
                            }
                            final afec afecVar2 = afecVar;
                            afeh afehVar = (afeh) objG9;
                            boolean zE = buxVar2.E(list2) | buxVar2.D(z2) | buxVar2.C(afecVar2) | buxVar2.D(zB2) | buxVar2.C(axrVarA);
                            Object objG10 = buxVar2.g();
                            if (zE || objG10 == obj4) {
                                final boolean z3 = z2;
                                objG10 = new afec() { // from class: nxe
                                    @Override // defpackage.afec
                                    public final Object invoke(Object obj5) {
                                        kvo kvoVar = (kvo) obj5;
                                        yph yphVar2 = nxm.a;
                                        kvoVar.getClass();
                                        niz nizVar = new niz(13);
                                        final List list3 = list2;
                                        int size = list3.size();
                                        mzx mzxVar = new mzx(nizVar, list3, 13, null);
                                        nxj nxjVar = new nxj(list3, 0);
                                        nxk nxkVar = new nxk(list3);
                                        final afec afecVar3 = afecVar2;
                                        boolean z4 = z3;
                                        final SnapshotStateList snapshotStateList2 = snapshotStateList;
                                        final bwq bwqVar3 = bwqVar2;
                                        cct cctVar = new cct(1059042756, true, new kvm(nxkVar, new cct(-470876331, true, new nxl(list3, afecVar3, list3, z4, snapshotStateList2, bwqVar3)), 0));
                                        axl axlVar = kvoVar.a;
                                        axlVar.a(size, mzxVar, nxjVar, cctVar);
                                        nqk nqkVar = new nqk(3);
                                        final boolean z5 = zB2;
                                        final axr axrVar2 = axrVarA;
                                        axlVar.b(str, new cct(1580965385, true, new fun(nqkVar, new cct(414679561, true, new afeh() { // from class: nxa
                                            @Override // defpackage.afeh
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                bux buxVar3 = (bux) obj7;
                                                int iIntValue2 = ((Integer) obj8).intValue();
                                                yph yphVar3 = nxm.a;
                                                ((atm) obj6).getClass();
                                                if (buxVar3.I((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                    boolean z6 = z5;
                                                    cfy cfyVarR = cfy.e;
                                                    cfy cfyVarJ = asl.J(awd.r(cfyVarR), BitmapDescriptorFactory.HUE_RED, (z6 ? gjk.c : gjk.d).k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                                                    ctp ctpVarB = atk.b(cfl.f, false);
                                                    int iG = a.g(buxVar3.b());
                                                    ccx ccxVarN = buxVar3.N();
                                                    cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarJ);
                                                    afdr afdrVar3 = cwb.a;
                                                    buxVar3.M();
                                                    buxVar3.w();
                                                    if (buxVar3.G()) {
                                                        buxVar3.j(afdrVar3);
                                                    } else {
                                                        buxVar3.y();
                                                    }
                                                    byq.c(buxVar3, ctpVarB, cwb.e);
                                                    byq.c(buxVar3, ccxVarN, cwb.d);
                                                    byq.c(buxVar3, Integer.valueOf(iG), cwb.f);
                                                    byq.b(buxVar3, cwb.g);
                                                    byq.c(buxVar3, cfyVarJ2, cwb.c);
                                                    Object objG11 = buxVar3.g();
                                                    Object obj9 = buw.a;
                                                    if (objG11 == obj9) {
                                                        objG11 = bvq.a(afcp.a, buxVar3);
                                                        buxVar3.x(objG11);
                                                    }
                                                    aitx aitxVar = (aitx) objG11;
                                                    if (z6) {
                                                        cfyVarR = awd.r(cfyVarR);
                                                    }
                                                    afec afecVar4 = afecVar3;
                                                    axr axrVar3 = axrVar2;
                                                    List list4 = list3;
                                                    String strE = vq.e(R.string.boardwalk_clear_all, buxVar3);
                                                    boolean zE2 = buxVar3.E(aitxVar) | buxVar3.E(list4) | buxVar3.C(axrVar3) | buxVar3.C(afecVar4);
                                                    Object objG12 = buxVar3.g();
                                                    if (zE2 || objG12 == obj9) {
                                                        objG12 = new nxd(aitxVar, list4, axrVar3, snapshotStateList2, afecVar4, bwqVar3, 0);
                                                        buxVar3.x(objG12);
                                                    }
                                                    khc.q(null, strE, (afdr) objG12, cfyVarR, null, false, false, null, null, null, null, null, buxVar3, 6, 0, 8176);
                                                    buxVar3.n();
                                                } else {
                                                    buxVar3.s();
                                                }
                                                return afak.a;
                                            }
                                        }), 18, null)));
                                        return afak.a;
                                    }
                                };
                                axrVar = axrVarA;
                                buxVar2.x(objG10);
                            } else {
                                axrVar = axrVarA;
                            }
                            fww.z(cfyVarD, axrVar, f, avrVar, asxVarG, null, null, false, null, zB, afehVar, null, (afec) objG10, buxVar2, 0, 0);
                            buxVar2.o();
                        }
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(list, afecVar, afdrVar, i, 12, (byte[]) null);
        }
    }

    public static final void b(afdr afdrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-65126965);
        if (i4 == 0) {
            i2 = i | (true != buxVarC.E(afdrVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarD = das.d(cfyVar, "No notifications");
            ctp ctpVarA = atp.a(atd.e, cfl.k, buxVarC, 54);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarD);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            brp.b(vq.e(R.string.no_notifications, buxVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, czz.av(buxVarC).j, buxVarC, 0, 24576, 114686);
            buxVarC = buxVarC;
            cfv cfvVar = cfy.e;
            asl.A(awd.d(cfvVar, gjk.e.k), buxVarC);
            khc.q(null, vq.e(R.string.close_notification_center, buxVarC), afdrVar, das.d(cfvVar, "Close"), null, false, false, null, null, null, null, null, buxVarC, ((i2 << 6) & 896) | 3078, 0, 8176);
            i3 = 1;
            bvvVar.Y(true);
        } else {
            i3 = 1;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(afdrVar, cfyVar, i, i3);
        }
    }
}
