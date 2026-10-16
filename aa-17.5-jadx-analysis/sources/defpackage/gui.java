package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gui {
    public static final void a(guj gujVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-698883431);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gujVar) : buxVarC.E(gujVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i3 = 19;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            b(asl.H(d(cfyVar, false, buxVarC, 1), gjk.d.k), atd.e, null, bxc.i(-881365809, true, new bol(gujVar, i3), buxVarC), buxVarC, 3120, 4);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gujVar, cfyVar, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.cfy r14, defpackage.atc r15, defpackage.cfm r16, defpackage.afeh r17, defpackage.bux r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gui.b(cfy, atc, cfm, afeh, bux, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [bym, java.lang.Object] */
    public static final void c(cfy cfyVar, gab gabVar, afec afecVar, bux buxVar, int i) {
        int i2;
        afecVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(875689041);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 & 896;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 256 || objS == buw.a) {
                objS = new gjt((byte[]) null);
                afecVar.invoke(objS);
                bvvVar.ad(objS);
            }
            gjt gjtVar = (gjt) objS;
            ctp ctpVarA = atp.a(atd.e, cfl.j, buxVarC, 54);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gjtVar.n(gabVar, buxVarC, ((i2 >> 3) & 14) | 8);
            asl.A(awd.i(cfy.e, ((guz) gjtVar.c).i), buxVarC);
            gjtVar.m().invoke(buxVarC, 0);
            ((afeg) gjtVar.a.a()).invoke(buxVarC, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(cfyVar, gabVar, afecVar, i, 3);
        }
    }

    public static final cfy d(cfy cfyVar, boolean z, bux buxVar, int i) {
        cfyVar.getClass();
        if (((z ? 1 : 0) & (i ^ 1)) != 0) {
            buxVar.v(1092359393);
            ((bvv) buxVar).Y(false);
            return awd.e(awd.n(cfyVar, 320.0f, 480.0f), 60.0f, Float.NaN);
        }
        buxVar.v(1092545083);
        hjn hjnVar = ((hjo) buxVar.f(hjp.a)).a;
        hjn hjnVar2 = hjn.c;
        cfy cfyVarE = awd.e(awd.n(cfyVar, ((dlj) ady.a(hjnVar == hjnVar2 ? 400.0f : 320.0f, null, "turnCardMinWidth", null, buxVar, 384, 10).a()).a, ((dlj) ady.a(hjnVar == hjnVar2 ? 480.0f : 400.0f, null, "turnCardMaxWidth", null, buxVar, 384, 10).a()).a), 80.0f, Float.NaN);
        ((bvv) buxVar).Y(false);
        return cfyVarE;
    }

    public static final void e(final float f, final float f2, cfy cfyVar, final gab gabVar, final boolean z, final afeg afegVar, bux buxVar, final int i) {
        int i2;
        final cfy cfyVar2;
        cfv cfvVar;
        bvv bvvVar;
        boolean z2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(824597527);
        if (i3 == 0) {
            i2 = (true != buxVarC.z(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f2) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != ((i & 4096) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != buxVarC.E(afegVar) ? 65536 : 131072;
        }
        int i5 = i4;
        if (buxVarC.I((i5 & 74899) != 74898, i5 & 1)) {
            cfv cfvVar2 = cfy.e;
            ctp ctpVarA = avv.a(new asz(f2, false, null), cfl.n, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar2);
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
            byq.c(buxVarC, cfyVarJ, cwb.c);
            cfy cfyVarI = awd.i(cfvVar2, f);
            if (z) {
                cfyVarI = bxc.n(cfyVarI, -1.0f, 1.0f);
            }
            if (gabVar != null) {
                buxVarC.v(-604978964);
                cfvVar = cfvVar2;
                bvvVar = bvvVar2;
                z2 = true;
                fxp.c(gabVar, f, cfyVarI, null, null, null, false, false, null, buxVarC, ((i5 >> 9) & 14) | 8 | ((i5 << 3) & 112), 1016);
                bvvVar.Y(false);
            } else {
                cfvVar = cfvVar2;
                bvvVar = bvvVar2;
                z2 = true;
                buxVarC.v(-604883825);
                bvvVar.Y(false);
            }
            afegVar.invoke(buxVarC, Integer.valueOf((i5 >> 15) & 14));
            bvvVar.Y(z2);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: guv
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    float f3 = f;
                    float f4 = f2;
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    gui.e(f3, f4, cfyVar2, gabVar, z, afegVar, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                    return afak.a;
                }
            };
        }
    }

    public static final void f(hcv hcvVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-452932232);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hcvVar) : buxVarC.E(hcvVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarAv = ca.av(awd.b(cfyVar, 1.0f), true);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarAv);
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
            gbf.d(hcvVar.a, atn.a.b(cfy.e), null, csh.a, new cjv(gux.c(buxVarC).T()), false, false, null, null, false, buxVarC, 1575936, 932);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hcvVar, cfyVar, i, 3);
        }
    }

    public static final void g(hcu hcuVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-772835823);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hcuVar) : buxVarC.E(hcuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarI = awd.i(cfyVar, gux.g(buxVarC).g.c);
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
            gbf.d(hcuVar.a, cjn.g(awd.i(cfy.e, gux.g(buxVarC).e.c), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.f(buxVarC).a.c, true, 0, 1042431), null, null, new cjv(((cjv) buxVarC.f(bnm.a)).a), false, false, null, null, false, buxVarC, 1572864, 940);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hcuVar, cfyVar, i, 2);
        }
    }
}
