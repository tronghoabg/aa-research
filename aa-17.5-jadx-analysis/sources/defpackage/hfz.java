package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hfz {
    public static final float a = gjk.c.k;
    private static final afeg b = hfh.a;

    /* JADX WARN: Removed duplicated region for block: B:177:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.cfy r30, defpackage.hge r31, defpackage.hga r32, defpackage.hgc r33, defpackage.afeg r34, defpackage.afeg r35, defpackage.afeg r36, final defpackage.afeg r37, defpackage.bux r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfz.a(cfy, hge, hga, hgc, afeg, afeg, afeg, afeg, bux, int, int):void");
    }

    public static /* synthetic */ afak b(dol dolVar, dok dokVar, doi doiVar) {
        doiVar.getClass();
        doiVar.e.j(dolVar, BitmapDescriptorFactory.HUE_RED);
        sx sxVar = doiVar.g;
        doj dojVar = doiVar.c;
        sxVar.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
        doiVar.i.k(dokVar, BitmapDescriptorFactory.HUE_RED);
        doiVar.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
        doiVar.c(new ncp("spread"));
        doiVar.b(new ncp("spread"));
        return afak.a;
    }

    public static final void c(dom domVar, doj dojVar, doj dojVar2, afeg afegVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, hfi hfiVar, bux buxVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        float f;
        bvv bvvVar;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1447408144);
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
            obj = cilVar2;
            i2 |= true != buxVarC.C(obj) ? 65536 : 131072;
        } else {
            obj = cilVar2;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar3) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            obj2 = cilVar4;
            i2 |= true != buxVarC.C(obj2) ? 4194304 : 8388608;
        } else {
            obj2 = cilVar4;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.C(hfiVar) ? 33554432 : 67108864;
        }
        int i4 = i2;
        if (buxVarC.I((38347923 & i4) != 38347922, i4 & 1)) {
            int i5 = i4 & 896;
            cfv cfvVar = cfy.e;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (i5 == 256 || objS == buw.a) {
                objS = new hfl(dojVar2, 6);
                bvvVar2.ad(objS);
            }
            cfy cfyVarH = dom.h(cfvVar, dojVar, (afec) objS);
            boolean z2 = hfiVar.d;
            float f2 = z2 ? a : BitmapDescriptorFactory.HUE_RED;
            if (!hfiVar.b) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (z2) {
                f = a;
                z2 = true;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
                z2 = false;
            }
            cfy cfyVarJ = bxc.j(j(cfyVarH, f2, f, z2 ? a : BitmapDescriptorFactory.HUE_RED), cilVar);
            boolean z3 = (234881024 & i4) == 67108864;
            boolean z4 = (458752 & i4) == 131072;
            boolean z5 = (3670016 & i4) == 1048576;
            boolean z6 = (29360128 & i4) == 8388608;
            Object objS2 = bvvVar2.S();
            if ((z6 || (z3 | z4 | z5)) || objS2 == buw.a) {
                bvvVar = bvvVar2;
                Object obj3 = obj2;
                z = false;
                gaz gazVar = new gaz(hfiVar, obj, cilVar3, obj3, 5);
                bvvVar.ad(gazVar);
                objS2 = gazVar;
            } else {
                bvvVar = bvvVar2;
                z = false;
            }
            cfy cfyVarJ2 = fxi.j(cfyVarJ, (afec) objS2);
            ctp ctpVarB = atk.b(cfl.a, z);
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
            cfy cfyVarV = awd.v(awd.b(cfvVar, 1.0f), z, 3);
            ctp ctpVarB2 = atk.b(cfl.g, z);
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
            afegVar.invoke(buxVarC, Integer.valueOf((i4 >> 9) & 14));
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfv(domVar, dojVar, dojVar2, afegVar, cilVar, cilVar2, cilVar3, cilVar4, hfiVar, i, 0);
        }
    }

    public static final void d(dom domVar, doj dojVar, doj dojVar2, hgc hgcVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(799101179);
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
            int i4 = i2 & 896;
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 256 || objS == buw.a) {
                objS = new hfl(dojVar2, 5);
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
            fwn.f(hgcVar == hgc.a, 0, 0, hfh.b, buxVarC, 3072, 6);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(domVar, dojVar, dojVar2, hgcVar, i, 9);
        }
    }

    public static final void e(dom domVar, doj dojVar, doj dojVar2, doj dojVar3, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, hfi hfiVar, bux buxVar, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        Object obj3;
        int i4;
        hgc hgcVar2;
        bux buxVar2;
        Object cibVar;
        int i5;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(-1384929645);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(domVar) : buxVarC.E(domVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(dojVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(dojVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            obj = dojVar3;
            i3 |= true != buxVarC.C(obj) ? 1024 : 2048;
        } else {
            obj = dojVar3;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.A(hgcVar.ordinal()) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.C(cilVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.C(cilVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != buxVarC.C(cilVar3) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            obj2 = cilVar4;
            i3 |= true != buxVarC.C(obj2) ? 268435456 : 536870912;
        } else {
            obj2 = cilVar4;
        }
        if ((i2 & 6) == 0) {
            obj3 = hfiVar;
            i4 = i2 | (true != buxVarC.C(obj3) ? 2 : 4);
        } else {
            obj3 = hfiVar;
            i4 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            boolean z = (i4 & 14) == 4;
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            cfv cfvVar = cfy.e;
            int i7 = i3;
            bvv bvvVar = (bvv) buxVarC;
            boolean z4 = z3;
            Object objS = bvvVar.S();
            if (((z2 | z) || z4) || objS == buw.a) {
                i5 = 8388608;
                cibVar = new cib(obj3, (Object) dojVar2, obj, 20, (char[]) null);
                bvvVar.ad(cibVar);
            } else {
                cibVar = objS;
                i5 = 8388608;
            }
            cfy cfyVarJ = bxc.j(asl.J(dom.h(cfvVar, dojVar, (afec) cibVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a, BitmapDescriptorFactory.HUE_RED), cilVar);
            boolean z5 = (i7 & 29360128) == i5;
            boolean z6 = (i7 & 1879048192) == 536870912;
            boolean z7 = (i7 & 234881024) == 67108864;
            Object objS2 = bvvVar.S();
            if ((z5 | z | z6 | z7) || objS2 == buw.a) {
                gaz gazVar = new gaz(hfiVar, cilVar2, obj2, cilVar3, 6);
                bvvVar.ad(gazVar);
                objS2 = gazVar;
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
            buxVar2 = buxVarC;
            fwn.f(hgcVar2 == hgc.b, 0, 0, bxc.i(628195857, true, new guq(afegVar, 17), buxVarC), buxVar2, 3072, 6);
            bvvVar.Y(true);
        } else {
            hgcVar2 = hgcVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nmx(domVar, dojVar, dojVar2, dojVar3, afegVar, hgcVar2, cilVar, cilVar2, cilVar3, cilVar4, hfiVar, i, i2, 1);
        }
    }

    public static final void f(dom domVar, hge hgeVar, doj dojVar, doj dojVar2, doj dojVar3, doj dojVar4, hga hgaVar, doj dojVar5, bux buxVar, int i) throws dpm {
        int i2;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1579140160);
        if (i4 == 0) {
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
            i2 |= true != buxVarC.C(dojVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.C(dojVar5) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                i3 = 0;
                objS = new hao(15);
                bvvVar.ad(objS);
            } else {
                i3 = 0;
            }
            hgd hgdVar = hgeVar.b;
            afec afecVar = (afec) objS;
            dol dolVarC = domVar.c(((dlj) afecVar.invoke(null)).a);
            dok dokVarB = domVar.b(((dlj) afecVar.invoke(hgdVar.b)).a);
            dos[] dosVarArr = new dos[4];
            dosVarArr[i3] = dojVar4;
            dosVarArr[1] = dojVar;
            dosVarArr[2] = dojVar3;
            dosVarArr[3] = dolVarC.c;
            dol dolVarJ = domVar.j(dosVarArr);
            dos[] dosVarArr2 = new dos[2];
            dosVarArr2[i3] = dojVar2;
            dosVarArr2[1] = dokVarB.c;
            dok dokVarI = domVar.i(dosVarArr2);
            cfy cfyVarA = hdv.b(cfy.e, hgaVar, hgeVar.a).a(new aix(hgeVar.d, ckq.a));
            boolean zC = buxVarC.C(dolVarJ) | buxVarC.C(dokVarI);
            Object objS2 = bvvVar.S();
            if (zC || objS2 == obj) {
                objS2 = new grn(dolVarJ, dokVarI, 14, null);
                bvvVar.ad(objS2);
            }
            atk.c(vq.b(dom.h(cfyVarA, dojVar5, (afec) objS2), -10.0f), buxVarC, i3);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gnx(domVar, hgeVar, dojVar, dojVar2, dojVar3, dojVar4, hgaVar, dojVar5, i, 5);
        }
    }

    public static final void g(final dom domVar, final doj dojVar, final doj dojVar2, afeg afegVar, hgc hgcVar, final cil cilVar, final cil cilVar2, final cil cilVar3, final cil cilVar4, final hfi hfiVar, bux buxVar, final int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        hgc hgcVar2;
        bux buxVar2;
        boolean z;
        final afeg afegVar2 = afegVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1306000782);
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
            i2 |= true != buxVarC.E(afegVar2) ? 1024 : 2048;
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
        if ((12582912 & i) == 0) {
            obj = cilVar3;
            i2 |= true != buxVarC.C(obj) ? 4194304 : 8388608;
        } else {
            obj = cilVar3;
        }
        if ((100663296 & i) == 0) {
            obj2 = cilVar4;
            i2 |= true != buxVarC.C(obj2) ? 33554432 : 67108864;
        } else {
            obj2 = cilVar4;
        }
        if ((805306368 & i) == 0) {
            obj3 = hfiVar;
            i2 |= true != buxVarC.C(obj3) ? 268435456 : 536870912;
        } else {
            obj3 = hfiVar;
        }
        if (buxVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            int i4 = i2 & 896;
            cfv cfvVar = cfy.e;
            int i5 = i2;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 256 || objS == buw.a) {
                objS = new hfl(dojVar2, 7);
                bvvVar.ad(objS);
            }
            cfy cfyVarJ = bxc.j(asl.J(dom.h(cfvVar, dojVar, (afec) objS), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a), cilVar);
            boolean z2 = (i5 & 1879048192) == 536870912;
            boolean z3 = (i5 & 3670016) == 1048576;
            boolean z4 = (i5 & 29360128) == 8388608;
            boolean z5 = (i5 & 234881024) == 67108864;
            Object objS2 = bvvVar.S();
            if ((z5 || (z2 | z3 | z4)) || objS2 == buw.a) {
                z = false;
                objS2 = new gaz(obj3, cilVar2, obj, obj2, 7);
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
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar3 = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar3);
            afeg afegVar4 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar4);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar5 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar5);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar6 = cwb.c;
            byq.c(buxVarC, cfyVarJ3, afegVar6);
            boolean z6 = z;
            cfy cfyVarA = awd.t(awd.r(cfvVar), null, 3).a(new aix(cjn.i(z6 ? 1 : 0), ckq.a));
            ctp ctpVarB2 = atk.b(cfl.c, z6);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarA);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar3);
            byq.c(buxVarC, ccxVarAh2, afegVar4);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar5);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar6);
            hgcVar2 = hgcVar;
            afegVar2 = afegVar;
            buxVar2 = buxVarC;
            fwn.f(hgcVar2 == hgc.b, 0, 0, bxc.i(262600978, true, new guq(afegVar2, 18), buxVarC), buxVar2, 3072, 6);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            hgcVar2 = hgcVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            final hgc hgcVar3 = hgcVar2;
            bxfVarJ.c = new afeg() { // from class: hfx
                @Override // defpackage.afeg
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    dom domVar2 = domVar;
                    doj dojVar3 = dojVar;
                    doj dojVar4 = dojVar2;
                    afeg afegVar7 = afegVar2;
                    hgc hgcVar4 = hgcVar3;
                    cil cilVar5 = cilVar;
                    int i6 = i;
                    int i7 = i6 | 1;
                    int i8 = 306783378 & i7;
                    cil cilVar6 = cilVar4;
                    int i9 = 613566756 & i7;
                    hfi hfiVar2 = hfiVar;
                    int i10 = (i7 & (-920350135)) | i8 | (i9 >> 1);
                    hfz.g(domVar2, dojVar3, dojVar4, afegVar7, hgcVar4, cilVar5, cilVar2, cilVar3, cilVar6, hfiVar2, (bux) obj4, ((i8 + i8) & i9) | i10);
                    return afak.a;
                }
            };
        }
    }

    public static final void h(dom domVar, doj dojVar, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, hfi hfiVar, bux buxVar, int i) {
        int i2;
        Object obj;
        hgc hgcVar2;
        bux buxVar2;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-315971460);
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
            obj = cilVar3;
            i2 |= true != buxVarC.C(obj) ? 524288 : 1048576;
        } else {
            obj = cilVar3;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar4) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.C(hfiVar) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj2 = buw.a;
            if (objS == obj2) {
                objS = new hao(17);
                bvvVar.ad(objS);
            }
            cfy cfyVarH = dom.h(cfvVar, dojVar, (afec) objS);
            boolean z2 = hfiVar.b;
            cfy cfyVarJ = bxc.j(j(cfyVarH, z2 ? a : 0.0f, BitmapDescriptorFactory.HUE_RED, (z2 && hfiVar.d) ? a : 0.0f), cilVar);
            boolean z3 = (234881024 & i2) == 67108864;
            boolean z4 = (458752 & i2) == 131072;
            boolean z5 = (3670016 & i2) == 1048576;
            boolean z6 = (i2 & 29360128) == 8388608;
            Object objS2 = bvvVar.S();
            if (((z5 | z3 | z4) || z6) || objS2 == obj2) {
                z = false;
                gaz gazVar = new gaz(hfiVar, cilVar2, obj, cilVar4, 8);
                bvvVar.ad(gazVar);
                objS2 = gazVar;
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
            buxVar2 = buxVarC;
            fwn.f(hgcVar2 == hgc.b ? true : z, 0, 0, bxc.i(1176789566, true, new guq(afegVar, 19), buxVarC), buxVar2, 3072, 6);
            bvvVar.Y(true);
        } else {
            hgcVar2 = hgcVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfv(domVar, dojVar, afegVar, hgcVar2, cilVar, cilVar2, cilVar3, cilVar4, hfiVar, i, 1);
        }
    }

    public static final void i(dom domVar, doj dojVar, doj dojVar2, doj dojVar3, doj dojVar4, hga hgaVar, hge hgeVar, doj dojVar5, bux buxVar, int i) throws dpm {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1557455225);
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
            i2 |= true != buxVarC.C(dojVar4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.C(dojVar5) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            dol dolVarJ = domVar.j(new dos[]{dojVar4, dojVar, dojVar3});
            dok dokVarI = domVar.i(new dos[]{dojVar2});
            cfy cfyVarA = hdv.c(cfy.e, hgaVar, hgeVar.a).a(new aix(hgeVar.c, ckq.a));
            boolean zC = buxVarC.C(dolVarJ) | buxVarC.C(dokVarI);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new grn(dolVarJ, dokVarI, 13, null);
                bvvVar.ad(objS);
            }
            atk.c(vq.b(dom.h(cfyVarA, dojVar5, (afec) objS), -100.0f), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gnx(domVar, dojVar, dojVar2, dojVar3, dojVar4, hgaVar, hgeVar, dojVar5, i, 4);
        }
    }

    private static final cfy j(cfy cfyVar, final float f, final float f2, final float f3) {
        return bzi.C(cfyVar, new afeh() { // from class: hfu
            @Override // defpackage.afeh
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                cts ctsVar = (cts) obj;
                cto ctoVar = (cto) obj2;
                float f4 = hfz.a;
                ctsVar.getClass();
                ctoVar.getClass();
                cuo cuoVarV = ctoVar.v(((dle) obj3).a);
                if (cuoVarV.a == 0 || cuoVarV.b == 0) {
                    return ctsVar.eK(0, 0, afbf.a, new hao(16));
                }
                float f5 = f3;
                float f6 = f2;
                int iEF = ctsVar.eF(f);
                int iEF2 = ctsVar.eF(f6);
                return ctsVar.eK(cuoVarV.a + iEF, cuoVarV.b + iEF2 + ctsVar.eF(f5), afbf.a, new aia(cuoVarV, iEF2, 14));
            }
        });
    }
}
