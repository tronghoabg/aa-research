package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ngk {
    public static final yph a = yph.c("CarControlsRailFrg");

    public static final void a(njs njsVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1097237893);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(njsVar) : buxVarC.E(njsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarF = bxc.f(njsVar.d, null, buxVarC);
            boolean z2 = roc.ag(bymVarF) != null;
            List listAg = roc.ag(bymVarF);
            if (listAg == null) {
                listAg = afbe.a;
            }
            boolean z3 = z2 && !listAg.isEmpty();
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(listAg.isEmpty());
            boolean zD = buxVarC.D(z2) | buxVarC.E(listAg);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zD || objS == buw.a) {
                objS = new kvr(z2, listAg, (afck) null, 2);
                bvvVar.ad(objS);
            }
            bvq.f(boolValueOf, boolValueOf2, (afeg) objS, buxVarC);
            buxVarC.v(2116369381);
            cfy cuiVar = cfy.e;
            cfy cfyVarC = awd.c(cuiVar, 1.0f);
            if (z) {
                cfyVarC = cfyVarC.a(new aix(kfn.i(buxVarC).a(), ckq.a));
            }
            bvvVar.Y(false);
            ksy ksyVar = nly.a;
            cfy cfyVarI = asl.I(cfyVarC, BitmapDescriptorFactory.HUE_RED, 24.0f);
            ctp ctpVarA = atp.a(atd.i(15.0f, cfl.m), cfl.k, buxVarC, 48);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            long j = njsVar.f;
            if (z3) {
                cuiVar = new cui(j, new ndo(13));
            }
            e(listAg, cuiVar, buxVarC, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(njsVar, z, i, 5);
        }
    }

    public static final void b(njs njsVar, oal oalVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(270553247);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(njsVar) : buxVarC.E(njsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(oalVar) : buxVarC.E(oalVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bym bymVarF = bxc.f(njsVar.e, null, buxVarC);
            boolean z2 = roc.ag(bymVarF) != null;
            List listAg = roc.ag(bymVarF);
            if (listAg == null) {
                listAg = afbe.a;
            }
            List list = listAg;
            boolean z3 = z2 && !list.isEmpty();
            bym bymVarF2 = bxc.f(lhj.a.a(), false, buxVarC);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(list.isEmpty());
            boolean zD = buxVarC.D(z2) | buxVarC.E(list);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zD || objS == buw.a) {
                objS = new kvr(z2, list, (afck) null, 3, (byte[]) null);
                bvvVar.ad(objS);
            }
            bvq.f(boolValueOf, boolValueOf2, (afeg) objS, buxVarC);
            if (((Boolean) bymVarF2.a()).booleanValue()) {
                buxVarC.v(-1600779120);
                long j = njsVar.f;
                ygr ygrVar = oal.a;
                int i4 = i2 << 6;
                c(list, z3, j, oalVar, z, buxVarC, (i4 & 7168) | 4096 | (i4 & 57344));
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1600564693);
                d(list, z3, njsVar.f, z, buxVarC, (i2 << 3) & 7168);
                buxVarC = buxVarC;
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(njsVar, oalVar, z, i, 5);
        }
    }

    public static final void c(final List list, final boolean z, final long j, final oal oalVar, final boolean z2, bux buxVar, final int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(416863494);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(oalVar) : buxVarC.E(oalVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            buxVarC.v(1173868208);
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            if (z2) {
                cfyVarC = cfyVarC.a(new aix(kfn.i(buxVarC).a(), ckq.a));
            }
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            ksy ksyVar = nly.a;
            cfy cfyVarI = asl.I(cfyVarC, BitmapDescriptorFactory.HUE_RED, 24.0f);
            cfm cfmVar = cfl.k;
            ctp ctpVarA = atp.a(atd.g, cfmVar, buxVarC, 54);
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
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            int i4 = i2;
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            e(list, g(cfvVar, z, j), buxVarC, i4 & 14);
            ctp ctpVarA2 = atp.a(atd.c, cfmVar, buxVarC, 48);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
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
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            asf asfVar = (asf) objS;
            ygr ygrVar = oal.a;
            nyx.b(null, asfVar, oalVar, false, false, false, z2, true, false, true, buxVarC, ((i4 >> 3) & 896) | 918553136 | ((i4 << 6) & 3670016), 57);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: ngi
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    ngk.c(list2, z, j, oalVar, z2, buxVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }

    public static final void d(final List list, final boolean z, final long j, final boolean z2, bux buxVar, final int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(762907756);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            buxVarC.v(-1285046602);
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            if (z2) {
                cfyVarC = cfyVarC.a(new aix(kfn.i(buxVarC).a(), ckq.a));
            }
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            ksy ksyVar = nly.a;
            cfy cfyVarI = asl.I(cfyVarC, BitmapDescriptorFactory.HUE_RED, 24.0f);
            ctp ctpVarA = atp.a(atd.i(15.0f, cfl.m), cfl.k, buxVarC, 48);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            e(list, g(cfvVar, z, j), buxVarC, i2 & 14);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: ngj
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    ngk.d(list, z, j, z2, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }

    public static final void e(List list, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(788389558);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfm cfmVar = cfl.k;
            ksy ksyVar = nly.a;
            ctp ctpVarA = atp.a(atd.i(15.0f, cfl.m), cfmVar, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
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
            buxVarC.v(1526306720);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kjl kjlVar = (kjl) it.next();
                if (kjlVar instanceof kjk) {
                    buxVarC.v(70994763);
                    kjk kjkVar = (kjk) kjlVar;
                    int i4 = kjkVar.a.a.a;
                    if (a.Y(i4, 320865540)) {
                        buxVarC.v(1526312738);
                        kjlVar.getClass();
                        lvl.Y(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 356517120)) {
                        buxVarC.v(1526316786);
                        kjlVar.getClass();
                        lvl.T(kjkVar, true, buxVarC, 48, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 354419976)) {
                        buxVarC.v(1526321313);
                        kjlVar.getClass();
                        lvl.P(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 356517131)) {
                        buxVarC.v(1526325561);
                        kjlVar.getClass();
                        lvl.I(kjkVar, null, true, buxVarC, 384, 2);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 289408269)) {
                        buxVarC.v(1526330658);
                        kjlVar.getClass();
                        lws.F(kjkVar, null, true, buxVarC, 384, 2);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 358614275) || a.Y(i4, 627081341)) {
                        buxVarC.v(1526338231);
                        kjlVar.getClass();
                        lws.z(kjkVar, null, true, buxVarC, 384, 2);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 356517121)) {
                        buxVarC.v(1526343043);
                        kjlVar.getClass();
                        nkl.d(kjkVar, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 624984185)) {
                        buxVarC.v(1526347453);
                        kjlVar.getClass();
                        nkx.d(kjkVar, true, buxVarC, 48, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 354419973)) {
                        buxVarC.v(1526352191);
                        kjlVar.getClass();
                        lvl.aa(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 354419977)) {
                        buxVarC.v(1526356063);
                        kjlVar.getClass();
                        lws.E(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else {
                        buxVarC.v(72467604);
                        bvvVar.Y(false);
                    }
                    bvvVar.Y(false);
                } else if (kjlVar instanceof kji) {
                    buxVarC.v(72536300);
                    lvl.Z((kji) kjlVar, 1, buxVarC, 48);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(72624340);
                    bvvVar.Y(false);
                }
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(list, cfyVar, i, 5);
        }
    }

    public static final void f(ngg nggVar, qrn qrnVar, njs njsVar, oal oalVar, bux buxVar, int i) {
        int i2;
        njs njsVar2;
        oal oalVar2;
        njs njsVar3;
        oal oalVar3;
        nggVar.getClass();
        qrnVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1603872793);
        if (i3 == 0) {
            i2 = (true != buxVarC.A(nggVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(qrnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                njx njxVar = new njx(qrnVar, 1);
                eru eruVarA = esh.a(buxVarC);
                if (eruVarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                njsVar3 = (njs) epq.e(affw.b(njs.class), eruVarA, null, njxVar, ecw.g(eruVarA));
                oam oamVar = new oam(qrnVar);
                eru eruVarA2 = esh.a(buxVarC);
                if (eruVarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                oalVar3 = (oal) epq.e(affw.b(oal.class), eruVarA2, null, oamVar, ecw.g(eruVarA2));
            } else {
                buxVarC.s();
                njsVar3 = njsVar;
                oalVar3 = oalVar;
            }
            buxVarC.l();
            njs njsVar4 = njsVar3;
            ksr.a(null, null, false, null, bxc.i(-1326636657, true, new gvp(nggVar, njsVar4, oalVar3, qrnVar, 3), buxVarC), buxVarC, 24960, 11);
            oalVar2 = oalVar3;
            njsVar2 = njsVar4;
        } else {
            buxVarC.s();
            njsVar2 = njsVar;
            oalVar2 = oalVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(nggVar, qrnVar, njsVar2, oalVar2, i, 14);
        }
    }

    private static final cfy g(cfy cfyVar, boolean z, long j) {
        return z ? new cui(j, new ndo(12)) : cfyVar;
    }
}
