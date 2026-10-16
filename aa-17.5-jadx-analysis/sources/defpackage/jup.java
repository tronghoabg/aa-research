package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jup {
    public static final void a(avx avxVar, gdd gddVar, int i, bux buxVar, int i2) {
        int i3;
        bvv bvvVar;
        afdr afdrVar;
        bvv bvvVar2;
        afdr afdrVar2;
        bvv bvvVar3;
        fwm fwmVar;
        afdr afdrVar3;
        bvv bvvVar4;
        afdr afdrVar4;
        bvv bvvVar5;
        afdr afdrVar5;
        bvv bvvVar6;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-818016996);
        int i5 = 2;
        int i6 = 4;
        int i7 = 1;
        if (i4 == 0) {
            i3 = (true != buxVarC.C(avxVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.E(gddVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.A(i) ? 128 : 256;
        }
        int i8 = 0;
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            int i9 = 3;
            int i10 = i3 >> 3;
            afdr afdrVar6 = null;
            if (((ggk) buxVarC.f(ggo.a)).f()) {
                buxVarC.v(100372178);
                Map map = jum.a;
                Map map2 = jum.a;
                Integer numValueOf = Integer.valueOf(i);
                Object obj = map2.get(numValueOf);
                obj.getClass();
                gcq gcqVar = new gcq(gey.b(vq.e(((Number) obj).intValue(), buxVarC)));
                gfa gfaVar = (gfa) gddVar.d.get(numValueOf);
                gcq gcqVar2 = gfaVar != null ? new gcq(gfaVar) : null;
                afec afecVar = gddVar.b;
                if (afecVar == null) {
                    buxVarC.v(-911863505);
                    ((bvv) buxVarC).Y(false);
                    afdrVar3 = null;
                } else {
                    int i11 = (i10 & 112) ^ 48;
                    buxVarC.v(-911863504);
                    boolean zC = ((i11 > 32 && buxVarC.A(i)) || (i10 & 48) == 32) | buxVarC.C(afecVar);
                    bvv bvvVar7 = (bvv) buxVarC;
                    Object objS = bvvVar7.S();
                    if (zC || objS == buw.a) {
                        objS = new juo(afecVar, i, i6);
                        bvvVar7.ad(objS);
                    }
                    afdrVar3 = (afdr) objS;
                    bvvVar7.Y(false);
                }
                if (afdrVar3 == null) {
                    buxVarC.v(-911841215);
                    bvv bvvVar8 = (bvv) buxVarC;
                    Object objS2 = bvvVar8.S();
                    if (objS2 == buw.a) {
                        objS2 = new grl(18);
                        bvvVar8.ad(objS2);
                    }
                    afdrVar3 = (afdr) objS2;
                    bvvVar4 = bvvVar8;
                } else {
                    buxVarC.v(1910247177);
                    bvvVar4 = (bvv) buxVarC;
                }
                bvvVar4.Y(false);
                afdr afdrVar7 = afdrVar3;
                afec afecVar2 = gddVar.c;
                if (afecVar2 == null) {
                    buxVarC.v(-911803985);
                    ((bvv) buxVarC).Y(false);
                    afdrVar4 = null;
                } else {
                    int i12 = (i10 & 112) ^ 48;
                    buxVarC.v(-911803984);
                    boolean zC2 = ((i12 > 32 && buxVarC.A(i)) || (i10 & 48) == 32) | buxVarC.C(afecVar2);
                    bvv bvvVar9 = (bvv) buxVarC;
                    Object objS3 = bvvVar9.S();
                    if (zC2 || objS3 == buw.a) {
                        objS3 = new juo(afecVar2, i, 5);
                        bvvVar9.ad(objS3);
                    }
                    afdrVar4 = (afdr) objS3;
                    bvvVar9.Y(false);
                }
                if (afdrVar4 == null) {
                    buxVarC.v(-911781695);
                    bvv bvvVar10 = (bvv) buxVarC;
                    Object objS4 = bvvVar10.S();
                    if (objS4 == buw.a) {
                        objS4 = new grl(13);
                        bvvVar10.ad(objS4);
                    }
                    afdrVar4 = (afdr) objS4;
                    bvvVar5 = bvvVar10;
                } else {
                    buxVarC.v(1910249159);
                    bvvVar5 = (bvv) buxVarC;
                }
                bvvVar5.Y(false);
                afdr afdrVar8 = afdrVar4;
                afec afecVar3 = gddVar.a;
                if (afecVar3 == null) {
                    buxVarC.v(-911730577);
                    ((bvv) buxVarC).Y(false);
                    afdrVar5 = null;
                } else {
                    int i13 = (i10 & 112) ^ 48;
                    buxVarC.v(-911730576);
                    boolean zC3 = ((i13 > 32 && buxVarC.A(i)) || (i10 & 48) == 32) | buxVarC.C(afecVar3);
                    bvv bvvVar11 = (bvv) buxVarC;
                    Object objS5 = bvvVar11.S();
                    if (zC3 || objS5 == buw.a) {
                        objS5 = new juo(afecVar3, i, i7);
                        bvvVar11.ad(objS5);
                    }
                    afdrVar5 = (afdr) objS5;
                    bvvVar11.Y(false);
                }
                if (afdrVar5 == null) {
                    buxVarC.v(-911708287);
                    bvv bvvVar12 = (bvv) buxVarC;
                    Object objS6 = bvvVar12.S();
                    if (objS6 == buw.a) {
                        objS6 = new grl(14);
                        bvvVar12.ad(objS6);
                    }
                    afdrVar5 = (afdr) objS6;
                    bvvVar6 = bvvVar12;
                } else {
                    buxVarC.v(1910251310);
                    bvvVar6 = (bvv) buxVarC;
                }
                bvvVar6.Y(false);
                long jI = cjn.i(0);
                fwmVar = new fwm(null, new fwq(gcqVar, gcqVar2, new hjw(jI, jI), afdrVar7, afdrVar8, afdrVar5), null);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(100429745);
                Map map3 = jum.a;
                Map map4 = jum.a;
                Integer numValueOf2 = Integer.valueOf(i);
                Object obj2 = map4.get(numValueOf2);
                obj2.getClass();
                String strE = vq.e(((Number) obj2).intValue(), buxVarC);
                afec afecVar4 = gddVar.b;
                if (afecVar4 == null) {
                    buxVarC.v(1798474462);
                    ((bvv) buxVarC).Y(false);
                } else {
                    int i14 = (i10 & 112) ^ 48;
                    buxVarC.v(1798474463);
                    boolean zC4 = buxVarC.C(afecVar4) | ((i14 > 32 && buxVarC.A(i)) || (i10 & 48) == 32);
                    bvv bvvVar13 = (bvv) buxVarC;
                    Object objS7 = bvvVar13.S();
                    if (zC4 || objS7 == buw.a) {
                        objS7 = new juo(afecVar4, i, i8);
                        bvvVar13.ad(objS7);
                    }
                    afdrVar6 = (afdr) objS7;
                    bvvVar13.Y(false);
                }
                if (afdrVar6 == null) {
                    buxVarC.v(1798496752);
                    bvv bvvVar14 = (bvv) buxVarC;
                    Object objS8 = bvvVar14.S();
                    if (objS8 == buw.a) {
                        objS8 = new grl(15);
                        bvvVar14.ad(objS8);
                    }
                    afdrVar6 = (afdr) objS8;
                    bvvVar = bvvVar14;
                } else {
                    buxVarC.v(1997677434);
                    bvvVar = (bvv) buxVarC;
                }
                bvvVar.Y(false);
                afdr afdrVar9 = afdrVar6;
                afec afecVar5 = gddVar.c;
                if (afecVar5 == null) {
                    buxVarC.v(1798533982);
                    ((bvv) buxVarC).Y(false);
                    afdrVar = null;
                } else {
                    int i15 = (i10 & 112) ^ 48;
                    buxVarC.v(1798533983);
                    boolean zC5 = ((i15 > 32 && buxVarC.A(i)) || (i10 & 48) == 32) | buxVarC.C(afecVar5);
                    bvv bvvVar15 = (bvv) buxVarC;
                    Object objS9 = bvvVar15.S();
                    if (zC5 || objS9 == buw.a) {
                        objS9 = new juo(afecVar5, i, i5);
                        bvvVar15.ad(objS9);
                    }
                    afdrVar = (afdr) objS9;
                    bvvVar15.Y(false);
                }
                if (afdrVar == null) {
                    buxVarC.v(1798556272);
                    bvv bvvVar16 = (bvv) buxVarC;
                    Object objS10 = bvvVar16.S();
                    if (objS10 == buw.a) {
                        objS10 = new grl(16);
                        bvvVar16.ad(objS10);
                    }
                    afdrVar = (afdr) objS10;
                    bvvVar2 = bvvVar16;
                } else {
                    buxVarC.v(1997679416);
                    bvvVar2 = (bvv) buxVarC;
                }
                bvvVar2.Y(false);
                afdr afdrVar10 = afdrVar;
                afec afecVar6 = gddVar.a;
                if (afecVar6 == null) {
                    buxVarC.v(1798607390);
                    ((bvv) buxVarC).Y(false);
                    afdrVar2 = null;
                } else {
                    int i16 = (i10 & 112) ^ 48;
                    buxVarC.v(1798607391);
                    boolean zC6 = ((i16 > 32 && buxVarC.A(i)) || (i10 & 48) == 32) | buxVarC.C(afecVar6);
                    bvv bvvVar17 = (bvv) buxVarC;
                    Object objS11 = bvvVar17.S();
                    if (zC6 || objS11 == buw.a) {
                        objS11 = new juo(afecVar6, i, i9);
                        bvvVar17.ad(objS11);
                    }
                    afdrVar2 = (afdr) objS11;
                    bvvVar17.Y(false);
                }
                if (afdrVar2 == null) {
                    buxVarC.v(1798629680);
                    bvv bvvVar18 = (bvv) buxVarC;
                    Object objS12 = bvvVar18.S();
                    if (objS12 == buw.a) {
                        objS12 = new grl(17);
                        bvvVar18.ad(objS12);
                    }
                    afdrVar2 = (afdr) objS12;
                    bvvVar3 = bvvVar18;
                } else {
                    buxVarC.v(1997681567);
                    bvvVar3 = (bvv) buxVarC;
                }
                bvvVar3.Y(false);
                fwmVar = new fwm(new gdc(strE, afdrVar9, afdrVar10, afdrVar2, (gfa) gddVar.d.get(numValueOf2)), null, null);
                ((bvv) buxVarC).Y(false);
            }
            fwl.a(fwmVar, das.d(awd.b(avxVar.b(kml.b(cfy.e), 1.0f, true), 1.0f), a.bp(i, "dialpad-button-")), null, false, bcr.b(gjk.c.k), null, null, null, buxVarC, 8, 236);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(avxVar, gddVar, i, i2, 13, null);
        }
    }

    public static /* synthetic */ afak b(afec afecVar, int i) {
        afecVar.invoke(Integer.valueOf(i));
        return afak.a;
    }

    public static final void c(gdd gddVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1834465509);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(gddVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarI = asl.I(cfyVar, gjk.f.k, BitmapDescriptorFactory.HUE_RED);
            Map map = jum.a;
            cfy cfyVarE = awd.e(cfyVarI, Float.NaN, 600.0f);
            float f = gjk.a.k;
            ctp ctpVarA = atp.a(atd.i(f, cfl.n), cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarE);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
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
            cfv cfvVar = cfy.e;
            int i4 = i2;
            cfy cfyVarB = ats.b(awd.r(cfvVar), 1.0f, true);
            asx asxVarG = atd.g(f);
            cfr cfrVar = cfl.m;
            ctp ctpVarA2 = avv.a(asxVarG, cfrVar, buxVarC, 0);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            avy avyVar = avy.a;
            int i5 = ((i4 << 3) & 112) | 390;
            a(avyVar, gddVar, 1, buxVarC, i5);
            a(avyVar, gddVar, 2, buxVarC, i5);
            a(avyVar, gddVar, 3, buxVarC, i5);
            bvvVar.Y(true);
            cfy cfyVarB2 = ats.b(awd.r(cfvVar), 1.0f, true);
            ctp ctpVarA3 = avv.a(atd.g(f), cfrVar, buxVarC, 0);
            int iG3 = a.g(bvvVar.u);
            ccx ccxVarAh3 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarB2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA3, afegVar);
            byq.c(buxVarC, ccxVarAh3, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ3, afegVar4);
            a(avyVar, gddVar, 4, buxVarC, i5);
            a(avyVar, gddVar, 5, buxVarC, i5);
            a(avyVar, gddVar, 6, buxVarC, i5);
            bvvVar.Y(true);
            cfy cfyVarB3 = ats.b(awd.r(cfvVar), 1.0f, true);
            ctp ctpVarA4 = avv.a(atd.g(f), cfrVar, buxVarC, 0);
            int iG4 = a.g(bvvVar.u);
            ccx ccxVarAh4 = bvvVar.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarB3);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA4, afegVar);
            byq.c(buxVarC, ccxVarAh4, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG4), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar4);
            a(avyVar, gddVar, 7, buxVarC, i5);
            a(avyVar, gddVar, 8, buxVarC, i5);
            a(avyVar, gddVar, 9, buxVarC, i5);
            bvvVar.Y(true);
            cfy cfyVarB4 = ats.b(awd.r(cfvVar), 1.0f, true);
            ctp ctpVarA5 = avv.a(atd.h(f, cfl.k), cfrVar, buxVarC, 0);
            int iG5 = a.g(bvvVar.u);
            ccx ccxVarAh5 = bvvVar.ah();
            cfy cfyVarJ5 = bzi.j(buxVarC, cfyVarB4);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA5, afegVar);
            byq.c(buxVarC, ccxVarAh5, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG5), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ5, afegVar4);
            a(avyVar, gddVar, 10, buxVarC, i5);
            a(avyVar, gddVar, 0, buxVarC, i5);
            a(avyVar, gddVar, 11, buxVarC, i5);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(gddVar, cfyVar, i, 12);
        }
    }

    public static final boolean d(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final boolean e(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final boolean f(int i) {
        return !e(i, 819);
    }

    public static final kll g(int i, int i2) {
        if (i == 0) {
            return kls.a;
        }
        if (i == 2) {
            return new klp(i2);
        }
        if (i == 3) {
            return new kln(i2);
        }
        if (i == 4) {
            return new klk(i2);
        }
        if (i == 5) {
            return new klm(i2);
        }
        if (i == 6) {
            return new klo(i2);
        }
        throw new IllegalArgumentException(a.bp(i, "Unknown area type: "));
    }
}
