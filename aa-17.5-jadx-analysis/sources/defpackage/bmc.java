package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class bmc implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bmc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [gbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v61, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [avx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [avp, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        float f;
        int i = this.c;
        int i2 = 13;
        byte[] bArr = null;
        float fH = BitmapDescriptorFactory.HUE_RED;
        switch (i) {
            case 0:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = iIntValue & 3;
                int i4 = iIntValue & 1;
                avp avpVar = bmf.a;
                if (buxVar.I(i3 != 2, i4)) {
                    ?? r1 = this.b;
                    this.a.invoke(buxVar, 0);
                    if (r1 == 0) {
                        buxVar.v(-1102003461);
                    } else {
                        buxVar.v(795735494);
                        r1.invoke(buxVar, 0);
                    }
                    buxVar.o();
                } else {
                    buxVar.s();
                }
                break;
            case 1:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i5 = iIntValue2 & 3;
                int i6 = iIntValue2 & 1;
                avp avpVar2 = bmf.a;
                if (buxVar2.I(i5 != 2, i6)) {
                    Object obj3 = this.b;
                    Object obj4 = this.a;
                    float f2 = ((dlj) buxVar2.f(bof.c)).a;
                    if (true == Float.isNaN(f2)) {
                        f2 = 0.0f;
                    }
                    avp avpVar3 = bmo.a;
                    bmf.c(((dlj) afpt.k(new dlj(8.0f - (f2 - bmo.c())), new dlj(BitmapDescriptorFactory.HUE_RED), new dlj(8.0f))).a, bxc.i(-459506658, true, new bmc(obj4, obj3, false ? 1 : 0), buxVar2), buxVar2, 390);
                } else {
                    buxVar2.s();
                }
                break;
            case 2:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    this.b.invoke(this.a, buxVar3, 0);
                } else {
                    buxVar3.s();
                }
                break;
            case 3:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i7 = iIntValue4 & 3;
                int i8 = iIntValue4 & 1;
                float f3 = bon.a;
                if (buxVar4.I(i7 != 2, i8)) {
                    cfy cfyVarJ = asl.J(this.a.b(cfy.e, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    int iG = a.g(buxVar4.b());
                    ccx ccxVarN = buxVar4.N();
                    cfy cfyVarJ2 = bzi.j(buxVar4, cfyVarJ);
                    afdr afdrVar = cwb.a;
                    buxVar4.M();
                    buxVar4.w();
                    if (buxVar4.G()) {
                        buxVar4.j(afdrVar);
                    } else {
                        buxVar4.y();
                    }
                    ?? r0 = this.b;
                    byq.c(buxVar4, ctpVarB, cwb.e);
                    byq.c(buxVar4, ccxVarN, cwb.d);
                    byq.c(buxVar4, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar4, cwb.g);
                    byq.c(buxVar4, cfyVarJ2, cwb.c);
                    r0.invoke(buxVar4, 0);
                    buxVar4.n();
                } else {
                    buxVar4.s();
                }
                break;
            case 4:
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    this.b.invoke(this.a, buxVar5, 6);
                } else {
                    buxVar5.s();
                }
                break;
            case 5:
                bux buxVar6 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    this.b.invoke(this.a, buxVar6, 6);
                } else {
                    buxVar6.s();
                }
                break;
            case 6:
                bux buxVar7 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    this.b.invoke(this.a, buxVar7, 0);
                } else {
                    buxVar7.s();
                }
                break;
            case 7:
                bux buxVar8 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    ?? r3 = this.a;
                    cfv cfvVar = cfy.e;
                    int i9 = brv.a;
                    cfy cfyVarG = asl.G(awd.q(cfvVar, BitmapDescriptorFactory.HUE_RED, 40.0f, 1), r3);
                    ctp ctpVarA = avv.a(atd.e, cfl.n, buxVar8, 54);
                    int iG2 = a.g(buxVar8.b());
                    ccx ccxVarN2 = buxVar8.N();
                    cfy cfyVarJ3 = bzi.j(buxVar8, cfyVarG);
                    afdr afdrVar2 = cwb.a;
                    buxVar8.M();
                    buxVar8.w();
                    if (buxVar8.G()) {
                        buxVar8.j(afdrVar2);
                    } else {
                        buxVar8.y();
                    }
                    ?? r02 = this.b;
                    byq.c(buxVar8, ctpVarA, cwb.e);
                    byq.c(buxVar8, ccxVarN2, cwb.d);
                    byq.c(buxVar8, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar8, cwb.g);
                    byq.c(buxVar8, cfyVarJ3, cwb.c);
                    r02.invoke(avy.a, buxVar8, 6);
                    buxVar8.n();
                } else {
                    buxVar8.s();
                }
                break;
            case 8:
                int iIntValue9 = ((Integer) obj).intValue();
                ddu dduVar = (ddu) obj2;
                if (!((zj) ((bii) this.b).b).a(dduVar.c)) {
                    cgq cgqVar = (cgq) this.a;
                    cgqVar.m(iIntValue9, dduVar);
                    cgqVar.k();
                }
                break;
            case 9:
                bux buxVar9 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    czz.B((col) this.a, this.b, buxVar9, 0);
                } else {
                    buxVar9.s();
                }
                break;
            case 10:
                bux buxVar10 = (bux) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    boolean zA = ((ctc) this.a).a();
                    buxVar10.L(Boolean.valueOf(zA));
                    boolean zD = buxVar10.D(zA);
                    if (zA) {
                        this.b.invoke(buxVar10, 0);
                    } else {
                        buxVar10.k(zD);
                    }
                    buxVar10.q();
                } else {
                    buxVar10.s();
                }
                break;
            case 11:
                bux buxVar11 = (bux) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    Object obj5 = this.b;
                    boolean zE = buxVar11.E(obj5);
                    Object objG = buxVar11.g();
                    if (zE || objG == buw.a) {
                        objG = new bsh(this.a, obj5, 10, bArr);
                        buxVar11.x(objG);
                    }
                    re.e((afdr) objG, null, null, 0L, 0L, null, dlc.a, buxVar11, 12582912);
                } else {
                    buxVar11.s();
                }
                break;
            case 12:
                bux buxVar12 = (bux) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (buxVar12.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    dlb.a((String) this.a, (String) this.b, buxVar12, new Object[0]);
                } else {
                    buxVar12.s();
                }
                break;
            case 13:
                bux buxVar13 = (bux) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (buxVar13.I((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    cfv cfvVar2 = cfy.e;
                    Object objG2 = buxVar13.g();
                    Object obj6 = buw.a;
                    if (objG2 == obj6) {
                        objG2 = new dmw(true ? 1 : 0);
                        buxVar13.x(objG2);
                    }
                    Object obj7 = this.b;
                    cfy cfyVarA = dds.a(cfvVar2, false, (afec) objG2);
                    boolean zE2 = buxVar13.E(obj7);
                    Object objG3 = buxVar13.g();
                    if (zE2 || objG3 == obj6) {
                        objG3 = new ddz(obj7, 11);
                        buxVar13.x(objG3);
                    }
                    ?? r03 = this.a;
                    cfy cfyVarT = bxc.t(tt.e(cfyVarA, (afec) objG3), true != ((Boolean) ((dnq) obj7).h.a()).booleanValue() ? 0.0f : 1.0f);
                    afeg afegVar = (afeg) r03.a();
                    Object objG4 = buxVar13.g();
                    if (objG4 == obj6) {
                        objG4 = dna.a;
                        buxVar13.x(objG4);
                    }
                    ctp ctpVar = (ctp) objG4;
                    int iG3 = a.g(buxVar13.b());
                    ccx ccxVarN3 = buxVar13.N();
                    cfy cfyVarJ4 = bzi.j(buxVar13, cfyVarT);
                    afdr afdrVar3 = cwb.a;
                    buxVar13.M();
                    buxVar13.w();
                    if (buxVar13.G()) {
                        buxVar13.j(afdrVar3);
                    } else {
                        buxVar13.y();
                    }
                    byq.c(buxVar13, ctpVar, cwb.e);
                    byq.c(buxVar13, ccxVarN3, cwb.d);
                    byq.c(buxVar13, Integer.valueOf(iG3), cwb.f);
                    byq.b(buxVar13, cwb.g);
                    byq.c(buxVar13, cfyVarJ4, cwb.c);
                    afegVar.invoke(buxVar13, 0);
                    buxVar13.n();
                } else {
                    buxVar13.s();
                }
                break;
            case 14:
                bux buxVar14 = (bux) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (buxVar14.I((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    czz.am(dnb.a.b(true), bxc.i(1022273628, true, new bmc(this.b, this.a, i2, bArr), buxVar14), buxVar14, 56);
                } else {
                    buxVar14.s();
                }
                break;
            case 15:
                bux buxVar15 = (bux) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (buxVar15.I((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    gcx.d(bxc.j(awd.c(cfy.e, 1.0f), (cil) this.a), (gcz) this.b, buxVar15, 64);
                } else {
                    buxVar15.s();
                }
                break;
            case 16:
                bux buxVar16 = (bux) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (buxVar16.I((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    ?? r2 = this.b;
                    this.a.invoke(buxVar16, 6);
                    r2.invoke(buxVar16, 6);
                } else {
                    buxVar16.s();
                }
                break;
            case 17:
                bux buxVar17 = (bux) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (buxVar17.I((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    gny.f(null, this.a, this.b, buxVar17, 0);
                } else {
                    buxVar17.s();
                }
                break;
            case 18:
                bux buxVar18 = (bux) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (buxVar18.I((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    gpa gpaVar = (gpa) this.b;
                    goz gozVar = gpaVar.b;
                    if (gozVar.b) {
                        buxVar18.v(-1402960318);
                        float fH2 = fww.h(buxVar18);
                        buxVar18.o();
                        f = fH2;
                    } else {
                        buxVar18.v(-1402918127);
                        buxVar18.o();
                        f = 0.0f;
                    }
                    bym bymVarA = ady.a(f, null, "surfaceAreaTopAnchor", null, buxVar18, 384, 10);
                    if (gozVar.d) {
                        buxVar18.v(-1402682558);
                        fH = fww.h(buxVar18);
                        buxVar18.o();
                    } else {
                        buxVar18.v(-1402640367);
                        buxVar18.o();
                    }
                    ?? r04 = this.a;
                    hge hgeVar = new hge(new hgd(new dlj(((dlj) ady.a(fH, null, "surfaceAreaEndAnchor", null, buxVar18, 384, 10).a()).a), new dlj(((dlj) bymVarA.a()).a)), 13);
                    if (gpaVar.d) {
                        buxVar18.v(-1402286688);
                        gny.e(gpaVar.c, hgeVar, gpaVar.a, r04, gpaVar.e, gpaVar.f, gpaVar.g, gozVar.e, buxVar18, 2097152);
                        buxVar18.o();
                    } else {
                        buxVar18.v(-1401885114);
                        gny.c(gpaVar.c, hgeVar, gpaVar.h, gpaVar.a, r04, gpaVar.g, gozVar.a, gozVar.c, buxVar18, 262144);
                        buxVar18.o();
                    }
                } else {
                    buxVar18.s();
                }
                break;
            case 19:
                bux buxVar19 = (bux) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (buxVar19.I((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    hkw.g(null, bxc.i(240340727, true, new gsl(this.b, 3), buxVar19), this.a, buxVar19, 48, 1);
                } else {
                    buxVar19.s();
                }
                break;
            default:
                bux buxVar20 = (bux) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (buxVar20.I((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    ca.at(this.a, null, bxc.i(-1475269109, true, new bol(this.b, 16), buxVar20), buxVar20, 3072, 6);
                } else {
                    buxVar20.s();
                }
                break;
        }
        return afak.a;
    }

    public /* synthetic */ bmc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
