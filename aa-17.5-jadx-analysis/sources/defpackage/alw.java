package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class alw {
    public static final alp a = new alp(cjv.h(-72057594037927936L, 0.38f), cjv.h(-72057594037927936L, 0.38f));

    public static final void a(alp alpVar, cfy cfyVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-527864079);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(alpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            long j = als.a;
            cfy cfyVarM = bxc.m(cfyVar, 3.0f, bcr.b(4.0f));
            long j2 = alpVar.a;
            cfy cfyVarAY = ca.aY(asl.I(ca.an(cfyVarM.a(new aix(-4294967296L, ckq.a)), 2), BitmapDescriptorFactory.HUE_RED, 8.0f), ca.aX(buxVarC));
            int i4 = (i2 << 3) & 7168;
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarAY);
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
            afehVar.invoke(ats.a, buxVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(alpVar, cfyVar, afehVar, i, 1, null);
        }
    }

    public static final void b(final String str, final boolean z, final alp alpVar, final cfy cfyVar, final afeh afehVar, final afdr afdrVar, bux buxVar, final int i) {
        int i2;
        int i3;
        long j;
        long j2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-2001167027);
        int i5 = 1;
        if (i4 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(alpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            long j3 = als.a;
            int i6 = i2 & 112;
            cfr cfrVar = als.e;
            asx asxVarG = atd.g(12.0f);
            boolean z2 = i6 == 32;
            boolean z3 = (458752 & i2) == 131072;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if ((z2 | z3) || objS == buw.a) {
                objS = new bck(z, afdrVar, i5);
                bvvVar.ad(objS);
            }
            cfy cfyVarI = asl.I(awd.l(awd.r(afp.x(cfyVar, z, str, null, (afdr) objS)), 112.0f, 48.0f, 280.0f, 48.0f), 12.0f, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA = avv.a(asxVarG, cfrVar, buxVarC, 54);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            avy avyVar = avy.a;
            if (afehVar == null) {
                buxVarC.v(-1597947094);
                bvvVar.Y(false);
                i3 = i2;
            } else {
                i3 = i2;
                buxVarC.v(-1597947093);
                cfy cfyVarS = awd.s(cfy.e, 24.0f, BitmapDescriptorFactory.HUE_RED, 24.0f, 24.0f, 2);
                ctp ctpVarB = atk.b(cfl.a, false);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarS);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar2);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, afegVar);
                byq.c(buxVarC, ccxVarAh2, afegVar2);
                byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ2, afegVar4);
                if (z) {
                    long j4 = alpVar.c;
                    j = -72057594037927936L;
                } else {
                    j = alpVar.e;
                }
                afehVar.invoke(new cjv(j), buxVarC, 0);
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            if (z) {
                long j5 = alpVar.b;
                j2 = -72057594037927936L;
            } else {
                j2 = alpVar.d;
            }
            afp.J(str, avyVar.b(cfy.e, 1.0f, true), new dfw(j2, als.a, als.b, null, als.d, 5, als.c, 16613240), 0, false, 1, 0, buxVarC, (i3 & 14) | 1572864, 952);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: alv
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    boolean z4 = z;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    alw.b(str2, z4, alpVar, cfyVar, afehVar, afdrVar, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static final void c(cfy cfyVar, alp alpVar, afec afecVar, bux buxVar, int i) {
        int i2 = i & 384;
        int i3 = i | 54;
        bux buxVarC = buxVar.c(-625529233);
        if (i2 == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        int i4 = 0;
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            cfyVar = cfy.e;
            alpVar = a;
            a(alpVar, cfyVar, bxc.i(-250345048, true, new alt(afecVar, alpVar, i4), buxVarC), buxVarC, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 384);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        alp alpVar2 = alpVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(cfyVar2, alpVar2, afecVar, i, 0);
        }
    }
}
