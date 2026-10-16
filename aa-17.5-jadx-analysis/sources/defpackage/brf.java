package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class brf implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ brf(dlg dlgVar, jva jvaVar, hjo hjoVar, int i) {
        this.d = i;
        this.a = dlgVar;
        this.c = jvaVar;
        this.b = hjoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [atm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v21, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v112, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v141, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v84, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = 4;
        byte[] bArr = null;
        int i3 = 3;
        Integer numValueOf = 0;
        switch (this.d) {
            case 0:
                final cvd cvdVar = (cvd) obj;
                final dle dleVar = (dle) obj2;
                final int iB = dle.b(dleVar.a);
                List listR = cvdVar.r(brk.a, this.a);
                int size = listR.size();
                final afft afftVar = new afft();
                if (size > 0) {
                    afftVar.a = iB / size;
                }
                int size2 = listR.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    numValueOf = Integer.valueOf(Math.max(((cto) listR.get(i4)).c(afftVar.a), numValueOf.intValue()));
                }
                final int iIntValue = numValueOf.intValue();
                final ArrayList arrayList = new ArrayList(listR.size());
                int size3 = listR.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    cto ctoVar = (cto) listR.get(i5);
                    int i6 = afftVar.a;
                    arrayList.add(ctoVar.v(dle.l(i6, i6, iIntValue, iIntValue)));
                }
                final ArrayList arrayList2 = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    float fEy = cvdVar.ey(Math.min(((cto) listR.get(i7)).d(iIntValue), afftVar.a));
                    float f = brb.b;
                    arrayList2.add(new brc(cvdVar.ey(afftVar.a) * i7, cvdVar.ey(afftVar.a), ((dlj) affa.y(new dlj(fEy - (f + f)), new dlj(24.0f))).a));
                }
                final ?? r2 = this.c;
                final ?? r4 = this.b;
                return cvdVar.eK(iB, iIntValue, afbf.a, new afec() { // from class: brg
                    @Override // defpackage.afec
                    public final Object invoke(Object obj3) {
                        int i8;
                        List list = arrayList;
                        cun cunVar = (cun) obj3;
                        int size4 = list.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            cunVar.x((cuo) list.get(i9), afftVar.a * i9, 0);
                        }
                        afeg afegVar = r4;
                        cvd cvdVar2 = cvdVar;
                        List listR2 = cvdVar2.r(brk.b, afegVar);
                        int size5 = listR2.size();
                        int i10 = 0;
                        while (true) {
                            i8 = iIntValue;
                            if (i10 >= size5) {
                                break;
                            }
                            cuo cuoVarV = ((cto) listR2.get(i10)).v(dle.m(dleVar.a, 0, 0, 0, 0, 11));
                            cunVar.x(cuoVarV, 0, i8 - cuoVarV.b);
                            i10++;
                        }
                        List listR3 = cvdVar2.r(brk.c, new cct(1918742627, true, new bmc(r2, arrayList2, 6, null)));
                        int size6 = listR3.size();
                        for (int i11 = 0; i11 < size6; i11++) {
                            cunVar.x(((cto) listR3.get(i11)).v(dlf.v(iB, i8)), 0, 0);
                        }
                        return afak.a;
                    }
                });
            case 1:
                bux buxVar = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i8 = iIntValue2 & 3;
                int i9 = iIntValue2 & 1;
                float f2 = bon.a;
                if (buxVar.I(i8 != 2, i9)) {
                    cfy cfyVarAY = ca.aY(ca.an(asl.I(this.b, BitmapDescriptorFactory.HUE_RED, bon.a), 2), (alh) this.a);
                    ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar, 0);
                    int iG = a.g(buxVar.b());
                    ccx ccxVarN = buxVar.N();
                    cfy cfyVarJ = bzi.j(buxVar, cfyVarAY);
                    afdr afdrVar = cwb.a;
                    buxVar.M();
                    buxVar.w();
                    if (buxVar.G()) {
                        buxVar.j(afdrVar);
                    } else {
                        buxVar.y();
                    }
                    ?? r0 = this.c;
                    byq.c(buxVar, ctpVarA, cwb.e);
                    byq.c(buxVar, ccxVarN, cwb.d);
                    byq.c(buxVar, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar, cwb.g);
                    byq.c(buxVar, cfyVarJ, cwb.c);
                    r0.invoke(ats.a, buxVar, 6);
                    buxVar.n();
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 2:
                bux buxVar2 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    rl.b(1, buxVar2);
                    Object objG = buxVar2.g();
                    Object obj3 = buw.a;
                    if (objG == obj3) {
                        objG = new sm();
                        buxVar2.x(objG);
                    }
                    Object obj4 = this.c;
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    sm smVar = (sm) objG;
                    cfy cfyVarR = awd.r(cfy.e);
                    List listBi = woy.bi(obj6, obj5, bxc.i(-1333331860, true, new bmc(obj4, smVar, 5, null), buxVar2));
                    Object objG2 = buxVar2.g();
                    if (objG2 == obj3) {
                        objG2 = new nah(smVar, 1);
                        buxVar2.x(objG2);
                    }
                    ctw ctwVar = (ctw) objG2;
                    afeg afegVarF = crt.f(listBi);
                    Object objG3 = buxVar2.g();
                    if (objG3 == obj3) {
                        objG3 = new ctx(ctwVar);
                        buxVar2.x(objG3);
                    }
                    ctp ctpVar = (ctp) objG3;
                    int iG2 = a.g(buxVar2.b());
                    ccx ccxVarN2 = buxVar2.N();
                    cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarR);
                    afdr afdrVar2 = cwb.a;
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar2);
                    } else {
                        buxVar2.y();
                    }
                    byq.c(buxVar2, ctpVar, cwb.e);
                    byq.c(buxVar2, ccxVarN2, cwb.d);
                    byq.c(buxVar2, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar2, cwb.g);
                    byq.c(buxVar2, cfyVarJ2, cwb.c);
                    afegVarF.invoke(buxVar2, numValueOf);
                    buxVar2.n();
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 3:
                bux buxVar3 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj7 = this.c;
                    Object obj8 = this.b;
                    Object obj9 = this.a;
                    cfy cfyVarR2 = awd.r(cfy.e);
                    boolean zC = buxVar3.C(obj9) | buxVar3.C(obj8) | buxVar3.C(obj7);
                    Object objG4 = buxVar3.g();
                    if (zC || objG4 == buw.a) {
                        i = 0;
                        objG4 = new brf(obj9, obj8, obj7, i);
                        buxVar3.x(objG4);
                    } else {
                        i = 0;
                    }
                    cuy.a(cfyVarR2, (afeg) objG4, buxVar3, 6, i);
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 4:
                bux buxVar4 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    Object objG5 = buxVar4.g();
                    if (objG5 == buw.a) {
                        objG5 = new ParcelableSnapshotMutableIntState(0);
                        buxVar4.x(objG5);
                    }
                    Object obj10 = this.b;
                    Object obj11 = this.a;
                    Object obj12 = this.c;
                    byd bydVar = (byd) objG5;
                    tl.c(null, null, null, null, bxc.i(-531963740, true, new bmc(obj12, bydVar, 11, null), buxVar4), 0, 0L, 0L, null, bxc.i(993072492, true, new fum((String) obj11, (String) obj10, (Object[]) obj12, bydVar, 1), buxVar4), buxVar4, 805330944, 495);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 5:
                bux buxVar5 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    Object[] objArr = (Object[]) this.c;
                    dlb.a((String) this.a, (String) this.b, buxVar5, Arrays.copyOf(objArr, objArr.length));
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 6:
                bux buxVar6 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    Object obj13 = this.b;
                    fxp.c(((fzv) this.c).f, obj13 != null ? ((dlj) obj13).a : 24.0f, this.a.a(asl.H(awd.c(cjn.g(cfy.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.b(gjk.d.k), true, 0, 1042431), 1.0f), 3.0f), cfl.e), null, csh.b, new cjv(gux.c(buxVar6).s()), false, true, null, buxVar6, 12607496, 840);
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 7:
                bux buxVar7 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    hkw.g(awd.m(cfy.e, Math.min(((dlj) this.b.a()).a, (((ato) this.a).d() * 0.48f) + BitmapDescriptorFactory.HUE_RED)), bxc.i(379042122, true, new bly(this.c, 18), buxVar7), null, buxVar7, 48, 4);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 8:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                this.b.invoke(woy.bU(this.a.subList(num.intValue(), num2.intValue())));
                ?? r02 = this.c;
                if (r02 != 0) {
                    r02.invoke(num, num2);
                }
                return afak.a;
            case 9:
                bux buxVar8 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    cfv cfvVar = cfy.e;
                    atc atcVar = atd.c;
                    cfm cfmVar = cfl.j;
                    ctp ctpVarA2 = atp.a(atcVar, cfmVar, buxVar8, 0);
                    int iG3 = a.g(buxVar8.b());
                    ccx ccxVarN3 = buxVar8.N();
                    cfy cfyVarJ3 = bzi.j(buxVar8, cfvVar);
                    afdr afdrVar3 = cwb.a;
                    buxVar8.M();
                    buxVar8.w();
                    if (buxVar8.G()) {
                        buxVar8.j(afdrVar3);
                    } else {
                        buxVar8.y();
                    }
                    Object obj14 = this.b;
                    Object obj15 = this.c;
                    afeg afegVar = cwb.e;
                    byq.c(buxVar8, ctpVarA2, afegVar);
                    afeg afegVar2 = cwb.d;
                    byq.c(buxVar8, ccxVarN3, afegVar2);
                    Integer numValueOf2 = Integer.valueOf(iG3);
                    afeg afegVar3 = cwb.f;
                    byq.c(buxVar8, numValueOf2, afegVar3);
                    afec afecVar = cwb.g;
                    byq.b(buxVar8, afecVar);
                    afeg afegVar4 = cwb.c;
                    byq.c(buxVar8, cfyVarJ3, afegVar4);
                    ncp ncpVar = (ncp) obj14;
                    gqc gqcVar = (gqc) obj15;
                    gvq.g(gqcVar.a, gka.e(cfvVar, ncpVar), buxVar8, 0, 0);
                    cfy cfyVarD = gka.d(asl.I(cfvVar, gjk.f.k, gjk.e.k), ncpVar);
                    ctp ctpVarA3 = atp.a(atcVar, cfmVar, buxVar8, 0);
                    int iG4 = a.g(buxVar8.b());
                    ccx ccxVarN4 = buxVar8.N();
                    cfy cfyVarJ4 = bzi.j(buxVar8, cfyVarD);
                    buxVar8.M();
                    buxVar8.w();
                    if (buxVar8.G()) {
                        buxVar8.j(afdrVar3);
                    } else {
                        buxVar8.y();
                    }
                    ?? r03 = this.a;
                    byq.c(buxVar8, ctpVarA3, afegVar);
                    byq.c(buxVar8, ccxVarN4, afegVar2);
                    byq.c(buxVar8, Integer.valueOf(iG4), afegVar3);
                    byq.b(buxVar8, afecVar);
                    byq.c(buxVar8, cfyVarJ4, afegVar4);
                    gkd.i(gqcVar, ats.b(cfvVar, 1.0f, true), buxVar8, 0);
                    gqk.k(gqcVar.c, ncpVar, null, false, !((Boolean) r03.a()).booleanValue(), 0, buxVar8, 0, 44);
                    buxVar8.n();
                    buxVar8.n();
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 10:
                bux buxVar9 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    cfv cfvVar2 = cfy.e;
                    ctp ctpVarA4 = atp.a(atd.c, cfl.j, buxVar9, 0);
                    int iG5 = a.g(buxVar9.b());
                    ccx ccxVarN5 = buxVar9.N();
                    cfy cfyVarJ5 = bzi.j(buxVar9, cfvVar2);
                    afdr afdrVar4 = cwb.a;
                    buxVar9.M();
                    buxVar9.w();
                    if (buxVar9.G()) {
                        buxVar9.j(afdrVar4);
                    } else {
                        buxVar9.y();
                    }
                    Object obj16 = this.b;
                    Object obj17 = this.c;
                    afeg afegVar5 = cwb.e;
                    byq.c(buxVar9, ctpVarA4, afegVar5);
                    afeg afegVar6 = cwb.d;
                    byq.c(buxVar9, ccxVarN5, afegVar6);
                    Integer numValueOf3 = Integer.valueOf(iG5);
                    afeg afegVar7 = cwb.f;
                    byq.c(buxVar9, numValueOf3, afegVar7);
                    afec afecVar2 = cwb.g;
                    byq.b(buxVar9, afecVar2);
                    afeg afegVar8 = cwb.c;
                    byq.c(buxVar9, cfyVarJ5, afegVar8);
                    ncp ncpVar2 = (ncp) obj16;
                    gqc gqcVar2 = (gqc) obj17;
                    gvq.g(gqcVar2.a, gka.e(cfvVar2, ncpVar2), buxVar9, 0, 0);
                    float f3 = gjk.g.k;
                    float f4 = gjk.f.k;
                    cfy cfyVarD2 = gka.d(asl.I(cfvVar2, f3, f4), ncpVar2);
                    ctp ctpVarA5 = avv.a(atd.a, cfl.m, buxVar9, 0);
                    int iG6 = a.g(buxVar9.b());
                    ccx ccxVarN6 = buxVar9.N();
                    cfy cfyVarJ6 = bzi.j(buxVar9, cfyVarD2);
                    buxVar9.M();
                    buxVar9.w();
                    if (buxVar9.G()) {
                        buxVar9.j(afdrVar4);
                    } else {
                        buxVar9.y();
                    }
                    ?? r04 = this.a;
                    byq.c(buxVar9, ctpVarA5, afegVar5);
                    byq.c(buxVar9, ccxVarN6, afegVar6);
                    byq.c(buxVar9, Integer.valueOf(iG6), afegVar7);
                    byq.b(buxVar9, afecVar2);
                    byq.c(buxVar9, cfyVarJ6, afegVar8);
                    gkd.n(gqcVar2, ncpVar2, avy.a.b(cfvVar2, 1.0f, true), buxVar9, 0);
                    asl.A(awd.m(cfvVar2, f4), buxVar9);
                    gkd.g(a.ae(r04), true, buxVar9, 56);
                    buxVar9.n();
                    buxVar9.n();
                } else {
                    buxVar9.s();
                }
                return afak.a;
            case 11:
                bux buxVar10 = (bux) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    cfv cfvVar3 = cfy.e;
                    atc atcVar2 = atd.c;
                    cfm cfmVar2 = cfl.j;
                    ctp ctpVarA6 = atp.a(atcVar2, cfmVar2, buxVar10, 0);
                    int iG7 = a.g(buxVar10.b());
                    ccx ccxVarN7 = buxVar10.N();
                    cfy cfyVarJ7 = bzi.j(buxVar10, cfvVar3);
                    afdr afdrVar5 = cwb.a;
                    buxVar10.M();
                    buxVar10.w();
                    if (buxVar10.G()) {
                        buxVar10.j(afdrVar5);
                    } else {
                        buxVar10.y();
                    }
                    Object obj18 = this.b;
                    Object obj19 = this.c;
                    afeg afegVar9 = cwb.e;
                    byq.c(buxVar10, ctpVarA6, afegVar9);
                    afeg afegVar10 = cwb.d;
                    byq.c(buxVar10, ccxVarN7, afegVar10);
                    Integer numValueOf4 = Integer.valueOf(iG7);
                    afeg afegVar11 = cwb.f;
                    byq.c(buxVar10, numValueOf4, afegVar11);
                    afec afecVar3 = cwb.g;
                    byq.b(buxVar10, afecVar3);
                    afeg afegVar12 = cwb.c;
                    byq.c(buxVar10, cfyVarJ7, afegVar12);
                    ncp ncpVar3 = (ncp) obj18;
                    gqc gqcVar3 = (gqc) obj19;
                    gvq.g(gqcVar3.a, gka.e(cfvVar3, ncpVar3), buxVar10, 0, 0);
                    cfy cfyVarD3 = gka.d(asl.I(cfvVar3, gjk.f.k, gjk.e.k), ncpVar3);
                    ctp ctpVarA7 = atp.a(atcVar2, cfmVar2, buxVar10, 0);
                    int iG8 = a.g(buxVar10.b());
                    ccx ccxVarN8 = buxVar10.N();
                    cfy cfyVarJ8 = bzi.j(buxVar10, cfyVarD3);
                    buxVar10.M();
                    buxVar10.w();
                    if (buxVar10.G()) {
                        buxVar10.j(afdrVar5);
                    } else {
                        buxVar10.y();
                    }
                    ?? r05 = this.a;
                    byq.c(buxVar10, ctpVarA7, afegVar9);
                    byq.c(buxVar10, ccxVarN8, afegVar10);
                    byq.c(buxVar10, Integer.valueOf(iG8), afegVar11);
                    byq.b(buxVar10, afecVar3);
                    byq.c(buxVar10, cfyVarJ8, afegVar12);
                    gkd.j(gqcVar3, awd.r(asl.J(ats.b(cfvVar3, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.d.k)), buxVar10, 0);
                    gqk.k(gqcVar3.c, ncpVar3, null, false, !((Boolean) r05.a()).booleanValue(), 0, buxVar10, 0, 44);
                    buxVar10.n();
                    buxVar10.n();
                } else {
                    buxVar10.s();
                }
                return afak.a;
            case 12:
                bux buxVar11 = (bux) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    cfv cfvVar4 = cfy.e;
                    atc atcVar3 = atd.c;
                    ctp ctpVarA8 = atp.a(atcVar3, cfl.j, buxVar11, 0);
                    int iG9 = a.g(buxVar11.b());
                    ccx ccxVarN9 = buxVar11.N();
                    cfy cfyVarJ9 = bzi.j(buxVar11, cfvVar4);
                    afdr afdrVar6 = cwb.a;
                    buxVar11.M();
                    buxVar11.w();
                    if (buxVar11.G()) {
                        buxVar11.j(afdrVar6);
                    } else {
                        buxVar11.y();
                    }
                    Object obj20 = this.b;
                    Object obj21 = this.c;
                    afeg afegVar13 = cwb.e;
                    byq.c(buxVar11, ctpVarA8, afegVar13);
                    afeg afegVar14 = cwb.d;
                    byq.c(buxVar11, ccxVarN9, afegVar14);
                    Integer numValueOf5 = Integer.valueOf(iG9);
                    afeg afegVar15 = cwb.f;
                    byq.c(buxVar11, numValueOf5, afegVar15);
                    afec afecVar4 = cwb.g;
                    byq.b(buxVar11, afecVar4);
                    afeg afegVar16 = cwb.c;
                    byq.c(buxVar11, cfyVarJ9, afegVar16);
                    ncp ncpVar4 = (ncp) obj20;
                    gqc gqcVar4 = (gqc) obj21;
                    gvq.g(gqcVar4.a, gka.e(cfvVar4, ncpVar4), buxVar11, 0, 0);
                    cfy cfyVarD4 = gka.d(asl.H(cfvVar4, gjk.f.k), ncpVar4);
                    ctp ctpVarA9 = atp.a(atcVar3, cfl.k, buxVar11, 48);
                    int iG10 = a.g(buxVar11.b());
                    ccx ccxVarN10 = buxVar11.N();
                    cfy cfyVarJ10 = bzi.j(buxVar11, cfyVarD4);
                    buxVar11.M();
                    buxVar11.w();
                    if (buxVar11.G()) {
                        buxVar11.j(afdrVar6);
                    } else {
                        buxVar11.y();
                    }
                    ?? r06 = this.a;
                    byq.c(buxVar11, ctpVarA9, afegVar13);
                    byq.c(buxVar11, ccxVarN10, afegVar14);
                    byq.c(buxVar11, Integer.valueOf(iG10), afegVar15);
                    byq.b(buxVar11, afecVar4);
                    byq.c(buxVar11, cfyVarJ10, afegVar16);
                    cfy cfyVarB = ats.b(cfvVar4, 1.0f, true);
                    float f5 = gjk.e.k;
                    gkq.c(gqcVar4, asl.J(cfyVarB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5), buxVar11, 0);
                    if (((Boolean) r06.a()).booleanValue()) {
                        buxVar11.v(900010003);
                        gvq.g(gqcVar4.d, asl.J(cfvVar4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5), buxVar11, 0, 0);
                        buxVar11.o();
                    } else {
                        buxVar11.v(900108025);
                        buxVar11.o();
                    }
                    gqk.k(gqcVar4.c, ncpVar4, null, !((Boolean) r06.a()).booleanValue(), false, 0, buxVar11, 0, 52);
                    buxVar11.n();
                    buxVar11.n();
                } else {
                    buxVar11.s();
                }
                return afak.a;
            case 13:
                bux buxVar12 = (bux) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (buxVar12.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    cfv cfvVar5 = cfy.e;
                    atc atcVar4 = atd.c;
                    cfm cfmVar3 = cfl.j;
                    ctp ctpVarA10 = atp.a(atcVar4, cfmVar3, buxVar12, 0);
                    int iG11 = a.g(buxVar12.b());
                    ccx ccxVarN11 = buxVar12.N();
                    cfy cfyVarJ11 = bzi.j(buxVar12, cfvVar5);
                    afdr afdrVar7 = cwb.a;
                    buxVar12.M();
                    buxVar12.w();
                    if (buxVar12.G()) {
                        buxVar12.j(afdrVar7);
                    } else {
                        buxVar12.y();
                    }
                    Object obj22 = this.b;
                    Object obj23 = this.c;
                    afeg afegVar17 = cwb.e;
                    byq.c(buxVar12, ctpVarA10, afegVar17);
                    afeg afegVar18 = cwb.d;
                    byq.c(buxVar12, ccxVarN11, afegVar18);
                    Integer numValueOf6 = Integer.valueOf(iG11);
                    afeg afegVar19 = cwb.f;
                    byq.c(buxVar12, numValueOf6, afegVar19);
                    afec afecVar5 = cwb.g;
                    byq.b(buxVar12, afecVar5);
                    afeg afegVar20 = cwb.c;
                    byq.c(buxVar12, cfyVarJ11, afegVar20);
                    ncp ncpVar5 = (ncp) obj22;
                    gqc gqcVar5 = (gqc) obj23;
                    gvq.g(gqcVar5.a, gka.e(cfvVar5, ncpVar5), buxVar12, 0, 0);
                    cfy cfyVarD5 = gka.d(asl.H(cfvVar5, gjk.g.k), ncpVar5);
                    ctp ctpVarA11 = atp.a(atcVar4, cfmVar3, buxVar12, 0);
                    int iG12 = a.g(buxVar12.b());
                    ccx ccxVarN12 = buxVar12.N();
                    cfy cfyVarJ12 = bzi.j(buxVar12, cfyVarD5);
                    buxVar12.M();
                    buxVar12.w();
                    if (buxVar12.G()) {
                        buxVar12.j(afdrVar7);
                    } else {
                        buxVar12.y();
                    }
                    ?? r07 = this.a;
                    byq.c(buxVar12, ctpVarA11, afegVar17);
                    byq.c(buxVar12, ccxVarN12, afegVar18);
                    byq.c(buxVar12, Integer.valueOf(iG12), afegVar19);
                    byq.b(buxVar12, afecVar5);
                    byq.c(buxVar12, cfyVarJ12, afegVar20);
                    gkq.d(gqcVar5, ats.b(cfvVar5, 1.0f, true), buxVar12, 0);
                    gqk.k(gqcVar5.c, ncpVar5, null, false, !((Boolean) r07.a()).booleanValue(), 0, buxVar12, 0, 44);
                    buxVar12.n();
                    buxVar12.n();
                } else {
                    buxVar12.s();
                }
                return afak.a;
            case 14:
                bux buxVar13 = (bux) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (buxVar13.I((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    Object obj24 = this.b;
                    cfv cfvVar6 = cfy.e;
                    boolean zC2 = buxVar13.C(obj24);
                    Object objG6 = buxVar13.g();
                    if (zC2 || objG6 == buw.a) {
                        objG6 = new grn(obj24, this.a, i3, null);
                        buxVar13.x(objG6);
                    }
                    gvq.g(this.c, tt.f(cfvVar6, (afec) objG6), buxVar13, 0, 0);
                } else {
                    buxVar13.s();
                }
                return afak.a;
            case 15:
                bux buxVar14 = (bux) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (buxVar14.I((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    dlj dljVar = (dlj) this.a.a();
                    cfv cfvVar7 = cfy.e;
                    cfy cfyVarR3 = awd.r(cfvVar7);
                    cfn cfnVar = cfl.a;
                    ctp ctpVarB = atk.b(cfnVar, false);
                    int iG13 = a.g(buxVar14.b());
                    ccx ccxVarN13 = buxVar14.N();
                    cfy cfyVarJ13 = bzi.j(buxVar14, cfyVarR3);
                    afdr afdrVar8 = cwb.a;
                    buxVar14.M();
                    buxVar14.w();
                    if (buxVar14.G()) {
                        buxVar14.j(afdrVar8);
                    } else {
                        buxVar14.y();
                    }
                    ?? r15 = this.b;
                    afeg afegVar21 = cwb.e;
                    byq.c(buxVar14, ctpVarB, afegVar21);
                    afeg afegVar22 = cwb.d;
                    byq.c(buxVar14, ccxVarN13, afegVar22);
                    Integer numValueOf7 = Integer.valueOf(iG13);
                    afeg afegVar23 = cwb.f;
                    byq.c(buxVar14, numValueOf7, afegVar23);
                    afec afecVar6 = cwb.g;
                    byq.b(buxVar14, afecVar6);
                    afeg afegVar24 = cwb.c;
                    byq.c(buxVar14, cfyVarJ13, afegVar24);
                    atn atnVar = atn.a;
                    cfy cfyVarA = dljVar != null ? atnVar.a(awd.m(cfvVar7, dljVar.a), cfl.e) : atnVar.a(cfvVar7, r15 != 0 ? cfl.e : cfl.i);
                    ctp ctpVarA12 = avv.a(r15 != 0 ? atd.h(gjk.c.k, cfl.k) : atd.b, cfl.n, buxVar14, 48);
                    int iG14 = a.g(buxVar14.b());
                    ccx ccxVarN14 = buxVar14.N();
                    cfy cfyVarJ14 = bzi.j(buxVar14, cfyVarA);
                    buxVar14.M();
                    buxVar14.w();
                    if (buxVar14.G()) {
                        buxVar14.j(afdrVar8);
                    } else {
                        buxVar14.y();
                    }
                    byq.c(buxVar14, ctpVarA12, afegVar21);
                    byq.c(buxVar14, ccxVarN14, afegVar22);
                    byq.c(buxVar14, Integer.valueOf(iG14), afegVar23);
                    byq.b(buxVar14, afecVar6);
                    byq.c(buxVar14, cfyVarJ14, afegVar24);
                    avy avyVar = avy.a;
                    if (r15 == 0) {
                        buxVar14.v(-2110478289);
                    } else {
                        buxVar14.v(-2110478288);
                        cfy cfyVarB2 = avyVar.b(cfvVar7, 1.0f, false);
                        ctp ctpVarB2 = atk.b(cfnVar, false);
                        int iG15 = a.g(buxVar14.b());
                        ccx ccxVarN15 = buxVar14.N();
                        cfy cfyVarJ15 = bzi.j(buxVar14, cfyVarB2);
                        buxVar14.M();
                        buxVar14.w();
                        if (buxVar14.G()) {
                            buxVar14.j(afdrVar8);
                        } else {
                            buxVar14.y();
                        }
                        byq.c(buxVar14, ctpVarB2, afegVar21);
                        byq.c(buxVar14, ccxVarN15, afegVar22);
                        byq.c(buxVar14, Integer.valueOf(iG15), afegVar23);
                        byq.b(buxVar14, afecVar6);
                        byq.c(buxVar14, cfyVarJ15, afegVar24);
                        gvq.g(r15, null, buxVar14, 0, 1);
                        buxVar14.n();
                    }
                    buxVar14.o();
                    ?? r08 = this.c;
                    if (r08 == 0) {
                        buxVar14.v(-2110342757);
                    } else {
                        buxVar14.v(-1315001562);
                        gvq.g(r08, awd.m(cfvVar7, 88.0f), buxVar14, 48, 0);
                    }
                    buxVar14.o();
                    buxVar14.n();
                    buxVar14.n();
                } else {
                    buxVar14.s();
                }
                return afak.a;
            case 16:
                bux buxVar15 = (bux) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (buxVar15.I((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    Object obj25 = this.b;
                    Object obj26 = this.c;
                    Object obj27 = this.a;
                    final jva jvaVar = (jva) obj26;
                    ajab ajabVar = jvaVar.k;
                    geu geuVar = jvaVar.b;
                    bvf bvfVar = gfm.a;
                    jsj jsjVarX = geuVar.x();
                    jsjVarX.getClass();
                    czz.an(new bxe[]{dbc.d.b(obj27), gic.a.b(ajabVar), hjp.a.b(obj25), bvfVar.b(jsjVarX)}, bxc.i(-167131613, true, new afeg() { // from class: juz
                        @Override // defpackage.afeg
                        public final Object invoke(Object obj28, Object obj29) {
                            cfy cfyVarBf;
                            bux buxVar16 = (bux) obj28;
                            int iIntValue17 = ((Integer) obj29).intValue();
                            int i10 = iIntValue17 & 3;
                            if (buxVar16.I(i10 != 2, iIntValue17 & 1)) {
                                jva jvaVar2 = jvaVar;
                                dlg dlgVar = (dlg) buxVar16.f(dbc.d);
                                avr avrVar = new avr(dlgVar.ey(jvaVar2.i().a), dlgVar.ey(jvaVar2.i().b), dlgVar.ey(jvaVar2.i().c), dlgVar.ey(jvaVar2.i().d));
                                Object parent = jvaVar2.getParent();
                                parent.getClass();
                                int id = ((View) parent).getId();
                                cfv cfvVar8 = cfy.e;
                                jsj jsjVar = (jsj) buxVar16.f(gfm.a);
                                cfvVar8.getClass();
                                afec afecVar7 = jvaVar2.i;
                                afecVar7.getClass();
                                jsjVar.getClass();
                                afak afakVar = afak.a;
                                boolean zC3 = buxVar16.C(afecVar7);
                                Object objG7 = buxVar16.g();
                                if (zC3 || objG7 == buw.a) {
                                    objG7 = new hgj(afecVar7, 1);
                                    buxVar16.x(objG7);
                                }
                                cfy cfyVarA2 = crh.a(cfvVar8, afakVar, (PointerInputEventHandler) objG7);
                                if (jsjVar.b()) {
                                    buxVar16.v(1928465631);
                                    cic cicVar = (cic) buxVar16.f(dbc.e);
                                    boolean zC4 = buxVar16.C(afecVar7);
                                    Object objG8 = buxVar16.g();
                                    if (zC4 || objG8 == buw.a) {
                                        objG8 = new fzl(afecVar7, 9);
                                        buxVar16.x(objG8);
                                    }
                                    cfy cfyVarG = fxi.g(cfyVarA2, (afec) objG8);
                                    boolean zC5 = buxVar16.C(afecVar7);
                                    Object objG9 = buxVar16.g();
                                    if (zC5 || objG9 == buw.a) {
                                        objG9 = new fzl(afecVar7, 10);
                                        buxVar16.x(objG9);
                                    }
                                    cfy cfyVarF = fxi.f(cfyVarG, (afec) objG9);
                                    boolean zE = buxVar16.E(cicVar);
                                    Object objG10 = buxVar16.g();
                                    if (zE || objG10 == buw.a) {
                                        objG10 = new fzl(cicVar, 11);
                                        buxVar16.x(objG10);
                                    }
                                    cfyVarBf = ca.bf(lv.r(cfyVarF, (afec) objG10), true, null);
                                    buxVar16.o();
                                } else {
                                    buxVar16.v(1928538853);
                                    cic cicVar2 = (cic) buxVar16.f(dbc.e);
                                    Object objG11 = buxVar16.g();
                                    Object obj30 = buw.a;
                                    if (objG11 == obj30) {
                                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(true, bxp.c);
                                        buxVar16.x(parcelableSnapshotMutableState);
                                        objG11 = parcelableSnapshotMutableState;
                                    }
                                    bwq bwqVar = (bwq) objG11;
                                    buxVar16.v(-1571988008);
                                    boolean zC6 = buxVar16.C(afecVar7);
                                    Object objG12 = buxVar16.g();
                                    if (zC6 || objG12 == obj30) {
                                        objG12 = new dah(afecVar7, bwqVar, 8);
                                        buxVar16.x(objG12);
                                    }
                                    cfy cfyVarA3 = cfyVarA2.a(new cpp(null, (afec) objG12));
                                    boolean zC7 = buxVar16.C(afecVar7);
                                    Object objG13 = buxVar16.g();
                                    if (zC7 || objG13 == obj30) {
                                        objG13 = new fzl(afecVar7, 12);
                                        buxVar16.x(objG13);
                                    }
                                    cfy cfyVarE = crt.e(cfyVarA3, (afec) objG13);
                                    if (id == R.id.template_container) {
                                        boolean zC8 = buxVar16.C(afecVar7) | buxVar16.E(cicVar2);
                                        Object objG14 = buxVar16.g();
                                        if (zC8 || objG14 == obj30) {
                                            cib cibVar = new cib((Object) bwqVar, (Object) afecVar7, (Object) cicVar2, 13, (short[]) null);
                                            buxVar16.x(cibVar);
                                            objG14 = cibVar;
                                        }
                                        cfyVarBf = ca.bf(lv.r(cfyVarE, (afec) objG14), true, null);
                                    } else {
                                        cfyVarBf = cfyVarE;
                                    }
                                    buxVar16.o();
                                    buxVar16.o();
                                }
                                cfy cfyVar = cfyVarBf;
                                cfy cfyVarG2 = asl.G(cfvVar8, avrVar);
                                if (acob.W()) {
                                    buxVar16.v(-1149846215);
                                    ghc ghcVar = jvaVar2.d;
                                    afdr afdrVar9 = jvaVar2.g;
                                    afec afecVar8 = jvaVar2.h;
                                    ghd ghdVar = jvaVar2.e;
                                    geu geuVar2 = jvaVar2.b;
                                    aiyk aiykVar = ghcVar.g;
                                    adu aduVar = ghdVar.a;
                                    geuVar2.u();
                                    String string = geuVar2.getString(R.string.speedbump_safety_pause_message);
                                    string.getClass();
                                    fxa.n(aiykVar, afdrVar9, afecVar8, das.d(cfvVar8, "Speedbump"), avrVar, aduVar, string, bxc.i(-552332695, true, new brf(jvaVar2, cfyVar, cfyVarG2, 17, (char[]) null), buxVar16), buxVar16, 12848128);
                                    buxVar16.o();
                                } else {
                                    buxVar16.v(-1149142515);
                                    jvaVar2.c.e(cfyVar, cfyVarG2, buxVar16, sk.AUDIO_CONTENT_BUFFER_SIZE, 0);
                                    buxVar16.o();
                                }
                            } else {
                                buxVar16.s();
                            }
                            return afak.a;
                        }
                    }, buxVar15), buxVar15, 48);
                } else {
                    buxVar15.s();
                }
                return afak.a;
            case 17:
                bux buxVar16 = (bux) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (buxVar16.I((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    ((jva) this.c).c.e(this.a, this.b, buxVar16, sk.AUDIO_CONTENT_BUFFER_SIZE, 0);
                } else {
                    buxVar16.s();
                }
                return afak.a;
            case 18:
                bux buxVar17 = (bux) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (buxVar17.I((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    czz.am(hjp.a.b(this.b), bxc.i(168046871, true, new guk(this.c, this.a, 15, bArr), buxVar17), buxVar17, 56);
                } else {
                    buxVar17.s();
                }
                return afak.a;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                int i10 = 10;
                afbt afbtVar = new afbt(10);
                Object obj28 = this.a;
                if (zBooleanValue) {
                    List listC = ((llc) obj28).c();
                    lky lkyVar = lky.a;
                    if (listC.contains(lkyVar)) {
                        afbtVar.add(new ogz(lkyVar, (afdr) new kku(obj28, this.b, i10, bArr)));
                    }
                }
                if (zBooleanValue2) {
                    llc llcVar = (llc) obj28;
                    List listC2 = llcVar.c();
                    lky lkyVar2 = lky.b;
                    if (listC2.contains(lkyVar2)) {
                        Object obj29 = this.c;
                        ohs ohsVarJ = ebf.j();
                        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.hb);
                        rrbVarH.p(llcVar.d.a);
                        ohsVarJ.F(rrbVarH.l());
                        afbtVar.add(new ogz(lkyVar2, (afdr) new lkd(obj29, i2)));
                    }
                }
                llc llcVar2 = (llc) obj28;
                List listB = llcVar2.b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj30 : listB) {
                    if (llcVar2.c().contains(((ogz) obj30).a)) {
                        arrayList3.add(obj30);
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    afbtVar.add((ogz) it.next());
                }
                return afbtVar.f();
            default:
                bux buxVar18 = (bux) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (buxVar18.I((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    ((myy) this.c).b((Bitmap) this.a, (ltr) this.b, null, buxVar18, 0);
                } else {
                    buxVar18.s();
                }
                return afak.a;
        }
    }

    public /* synthetic */ brf(hjo hjoVar, jvc jvcVar, avp avpVar, int i) {
        this.d = i;
        this.b = hjoVar;
        this.c = jvcVar;
        this.a = avpVar;
    }

    public /* synthetic */ brf(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ brf(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ brf(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ brf(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
