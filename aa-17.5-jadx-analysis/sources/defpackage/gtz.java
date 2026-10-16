package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class gtz {
    public static final void a(gua guaVar, bux buxVar, int i) {
        int i2;
        int i3;
        gua guaVar2;
        bqv bqvVar;
        bxf bxfVarJ;
        bvv bvvVar;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-642549593);
        boolean z = true;
        if (i4 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(guaVar) : buxVarC.E(guaVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            Long l = guaVar.c;
            if (l == null) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bqvVar = new bqv(guaVar, i, 12);
                    bxfVarJ.c = bqvVar;
                }
                return;
            }
            long jLongValue = l.longValue() / 1000;
            afdr afdrVar = guaVar.d;
            if (afdrVar == null) {
                buxVarC.v(474479712);
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !buxVarC.E(guaVar))) {
                    z = false;
                }
                bvv bvvVar2 = (bvv) buxVarC;
                Object objS = bvvVar2.S();
                if (z || objS == buw.a) {
                    objS = new grl(2);
                    bvvVar2.ad(objS);
                }
                afdrVar = (afdr) objS;
                bvvVar = bvvVar2;
            } else {
                buxVarC.v(985136409);
                bvvVar = (bvv) buxVarC;
            }
            bvvVar.Y(false);
            afdr afdrVar2 = afdrVar;
            bvv bvvVar3 = (bvv) buxVarC;
            Object objS2 = bvvVar3.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                objS2 = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
                bvvVar3.ad(objS2);
            }
            byb bybVar = (byb) objS2;
            Object objS3 = bvvVar3.S();
            if (objS3 == obj) {
                objS3 = new gbz(bybVar, 18);
                bvvVar3.ad(objS3);
            }
            boz.e((afdr) objS3, das.d(awd.d(awd.r(cfy.e), 4.0f), "indicator_test_tag"), czz.at(buxVarC).a, czz.at(buxVarC).c, 0, BitmapDescriptorFactory.HUE_RED, null, buxVarC, 54, 112);
            Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            boolean zC = buxVarC.C(afdrVar2) | buxVarC.B(jLongValue);
            Object objS4 = bvvVar3.S();
            if (zC || objS4 == obj) {
                gty gtyVar = new gty(afdrVar2, jLongValue, bybVar, (afck) null, 0);
                bvvVar3.ad(gtyVar);
                objS4 = gtyVar;
            }
            bvq.g(fValueOf, (afeg) objS4, buxVarC);
            guaVar2 = guaVar;
            i3 = i;
        } else {
            i3 = i;
            guaVar2 = guaVar;
            buxVarC.s();
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bqvVar = new bqv(guaVar2, i3, 13);
            bxfVarJ.c = bqvVar;
        }
    }

    public static final void b(final gua guaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(483469933);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(guaVar) : buxVarC.E(guaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            geu geuVar = (geu) buxVarC.f(gew.a);
            ggk ggkVar = (ggk) geuVar.F(ggk.class);
            String packageName = ((gmh) geuVar.d()).a.getPackageName();
            packageName.getClass();
            final boolean zC = ggkVar.C(packageName);
            vy.a(awd.n(cfyVar, Float.NaN, 350.0f), gux.f(buxVarC).a.d, vs.c(czz.at(buxVarC).p, 0L, buxVarC, 14), fxa.h(), null, bxc.i(1950271455, true, new afeh() { // from class: gtx
                /* JADX WARN: Removed duplicated region for block: B:38:0x01f9  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x020f  */
                @Override // defpackage.afeh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
                    /*
                        Method dump skipped, instructions count: 684
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.gtx.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, buxVarC), buxVarC, 196608, 16);
            buxVarC = buxVarC;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(guaVar, cfyVar, i, 13);
        }
    }

    public static final afdr c(gte gteVar) {
        if (gteVar instanceof gtc) {
            return ((gtc) gteVar).b;
        }
        return null;
    }

    public static final void d(hcs hcsVar, cfy cfyVar, boolean z, hjw hjwVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1264471644);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hcsVar) : buxVarC.E(hcsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 16 : 32;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(hjwVar) : buxVarC.E(hjwVar)) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            fxo fxoVar = hcsVar.a;
            fwx fwxVar = z ? fwx.d : fwx.b;
            hjw hjwVar2 = hjw.a;
            fwl.b(fxoVar, fwxVar, cfyVar2, hjwVar, false, null, null, null, null, buxVarC, ((i2 << 3) & 896) | (i2 & 7168), 496);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hkv(hcsVar, cfyVar, z, hjwVar, i, 1);
        }
    }

    public static final void e(avx avxVar, List list, int i, float f, bux buxVar, int i2) {
        float f2;
        ArrayList arrayList;
        int i3 = i2 & 6;
        bux buxVarC = buxVar.c(-1642337785);
        boolean z = true;
        int i4 = i3 == 0 ? (true != buxVarC.C(avxVar) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.A(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            f2 = f;
            i4 |= true != buxVarC.z(f2) ? 1024 : 2048;
        } else {
            f2 = f;
        }
        int i5 = 0;
        if (buxVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                arrayList = new ArrayList((size / 3) + (size % 3 == 0 ? 0 : 1));
                for (int i6 = 0; i6 >= 0 && i6 < size; i6 += 3) {
                    int iF = afpt.f(3, size - i6);
                    ArrayList arrayList2 = new ArrayList(iF);
                    for (int i7 = 0; i7 < iF; i7++) {
                        arrayList2.add(list.get(i7 + i6));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                it.getClass();
                Iterator itA = !it.hasNext() ? afbd.a : afrg.a(new afbp(it, null));
                while (itA.hasNext()) {
                    arrayList.add((List) itA.next());
                }
            }
            Iterator it2 = woy.cd(arrayList, i).iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    woy.bo();
                }
                List list2 = (List) next;
                cfv cfvVar = cfy.e;
                cfy cfyVarB = avxVar.b(cfvVar, 1.0f, z);
                ctp ctpVarA = atp.a(atd.g(f2), cfl.j, buxVarC, i5);
                bvv bvvVar = (bvv) buxVarC;
                int iG = a.g(bvvVar.u);
                ccx ccxVarAh = bvvVar.ah();
                cfy cfyVarJ = bzi.j(buxVarC, cfyVarB);
                afdr afdrVar = cwb.a;
                buxVarC.w();
                Iterator it3 = it2;
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
                buxVarC.v(1298926477);
                int i10 = 0;
                for (Iterator it4 = list2.iterator(); it4.hasNext(); it4 = it4) {
                    Object next2 = it4.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        woy.bo();
                    }
                    grx.e((hbj) next2, das.d(awd.r(cfvVar), "item-" + ((i8 * 3) + i10)), buxVarC, hbj.a);
                    i10 = i11;
                }
                bvvVar.Y(false);
                z = true;
                bvvVar.Y(true);
                f2 = f;
                i5 = 0;
                i8 = i9;
                it2 = it3;
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fzb(avxVar, list, i, f, i2, 2);
        }
    }

    public static final void f(gbg gbgVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1350671031);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
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
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gbf.d(gbgVar, awd.c(cfy.e, 1.0f), null, csh.b, null, false, false, null, null, false, buxVarC, (i2 & 14) | 3120, 1012);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(gbgVar, cfyVar, i, 1);
        }
    }

    public static final void g(final gbg gbgVar, final List list, final float f, final cfy cfyVar, bux buxVar, final int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1807248398);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            buxVarC.v(-2070639621);
            float fEw = dlgVar.ew(czz.av(buxVarC).i.h());
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            buxVarC.v(-2070636710);
            float fEw2 = dlgVar.ew(czz.av(buxVarC).l.h());
            bvvVar.Y(false);
            hir hirVar = gux.e(buxVarC).c;
            float f2 = gux.e(buxVarC).b.d;
            float f3 = fEw + fEw2;
            hcd hcdVar = hcd.f;
            float fB = hcdVar.b();
            float fD = hdd.d((hjo) buxVarC.f(hjp.a));
            float fA = hcdVar.a();
            float f4 = f2 + 8.0f + BitmapDescriptorFactory.HUE_RED;
            float f5 = ((f3 + BitmapDescriptorFactory.HUE_RED + f4 + f4 + BitmapDescriptorFactory.HUE_RED + BitmapDescriptorFactory.HUE_RED) * 3.0f) + BitmapDescriptorFactory.HUE_RED + fB + fB + BitmapDescriptorFactory.HUE_RED + BitmapDescriptorFactory.HUE_RED;
            int iMax = Math.max(1, ((int) ((f - f5) + BitmapDescriptorFactory.HUE_RED)) / ((int) ((fD + fA) + BitmapDescriptorFactory.HUE_RED)));
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            cfy cfyVarBe = ca.be(bxc.j(awd.d(awd.r(cfyVar), f5), (cil) objS));
            ctp ctpVarA = avv.a(atd.g(fA), cfl.m, buxVarC, 0);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarBe);
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
            avy avyVar = avy.a;
            f(gbgVar, awd.i(cfy.e, f5), buxVarC, i2 & 14);
            e(avyVar, list, iMax, fB, buxVarC, (i2 & 112) | 6);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: hcn
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    gtz.g(gbgVar, list, f, cfyVar, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }
}
