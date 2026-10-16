package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jti {
    public static final void a(fvc fvcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-304799217);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(fvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            cil cilVar = (cil) objS;
            c(fvcVar.a, bxc.j(cfyVar, cilVar), jtj.a, buxVarC, 3120);
            afak afakVar = afak.a;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new dxi(cilVar, (afck) null, 14, (byte[]) null);
                bvvVar.ad(objS2);
            }
            bvq.g(afakVar, (afeg) objS2, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) fvcVar, cfyVar, i, 20);
        }
    }

    public static final void b(cfy cfyVar, fvb fvbVar, bux buxVar, int i) {
        cfy cfyVar2;
        bux buxVarC = buxVar.c(-1512605627);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(fvbVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            String str = fvbVar.a;
            afdr afdrVar = fvbVar.c;
            boolean z = fvbVar.b;
            cfyVar2 = cfy.e;
            khc.q(null, str, afdrVar, das.d(awd.c(cfyVar2, 1.0f), "alphajump-key"), ksy.a(ksy.c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, 479), z, false, czz.au(buxVarC).a, null, null, null, null, buxVarC, 6, 0, 8000);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu(cfyVar2, fvbVar, i, 19);
        }
    }

    public static final void c(List list, cfy cfyVar, afeh afehVar, bux buxVar, int i) {
        afeh afehVar2;
        List list2;
        int i2 = i & 6;
        bux buxVarC = buxVar.c(747848247);
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.A(7) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            if (list.size() <= 1) {
                list2 = afbe.a;
            } else {
                List listBk = woy.bk(new ArrayList());
                for (Object obj : list) {
                    List arrayList = (List) woy.bK(listBk);
                    if (arrayList.size() >= 7) {
                        arrayList = new ArrayList();
                        listBk.add(arrayList);
                    }
                    arrayList.add(obj);
                }
                List list3 = (List) woy.bK(listBk);
                while (list3.size() < 7) {
                    list3.add(null);
                }
                ArrayList arrayList2 = new ArrayList(woy.bp(listBk, 10));
                Iterator it = listBk.iterator();
                while (it.hasNext()) {
                    arrayList2.add(woy.cf((List) it.next()));
                }
                list2 = arrayList2;
            }
            cfy cfyVarJ = asl.J(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16.0f);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            cfv cfvVar = cfy.e;
            int i4 = i3;
            cfy cfyVarK = awd.k(cfvVar, 600.0f, 360.0f);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarK);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ3, afegVar4);
            buxVarC.v(-753281276);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                List list4 = (List) it2.next();
                cfy cfyVarB = ats.b(cfvVar, 1.0f, true);
                ctp ctpVarA2 = avv.a(atd.a, cfl.m, buxVarC, 0);
                Iterator it3 = it2;
                int iG3 = a.g(bvvVar.u);
                ccx ccxVarAh3 = bvvVar.ah();
                cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarB);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA2, afegVar);
                byq.c(buxVarC, ccxVarAh3, afegVar2);
                byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ4, afegVar4);
                avy avyVar = avy.a;
                buxVarC.v(-1179711458);
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    Iterator it5 = it4;
                    cfy cfyVarH = asl.H(avyVar.b(cfvVar, 1.0f, true), gjk.a.k);
                    ctp ctpVarB2 = atk.b(cfl.a, false);
                    cfv cfvVar2 = cfvVar;
                    int iG4 = a.g(bvvVar.u);
                    ccx ccxVarAh4 = bvvVar.ah();
                    cfy cfyVarJ5 = bzi.j(buxVarC, cfyVarH);
                    buxVarC.w();
                    avy avyVar2 = avyVar;
                    if (bvvVar.t) {
                        buxVarC.j(afdrVar);
                    } else {
                        buxVarC.y();
                    }
                    byq.c(buxVarC, ctpVarB2, afegVar);
                    byq.c(buxVarC, ccxVarAh4, afegVar2);
                    byq.c(buxVarC, Integer.valueOf(iG4), afegVar3);
                    byq.b(buxVarC, afecVar);
                    byq.c(buxVarC, cfyVarJ5, afegVar4);
                    if (next == null) {
                        buxVarC.v(-1096626624);
                        bvvVar.Y(false);
                    } else {
                        buxVarC.v(-1096626623);
                        afehVar.invoke(next, buxVarC, Integer.valueOf((i4 >> 6) & 112));
                        bvvVar.Y(false);
                    }
                    bvvVar.Y(true);
                    it4 = it5;
                    cfvVar = cfvVar2;
                    avyVar = avyVar2;
                }
                bvvVar.Y(false);
                bvvVar.Y(true);
                it2 = it3;
            }
            afehVar2 = afehVar;
            bvvVar.Y(false);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            afehVar2 = afehVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(list, cfyVar, afehVar2, i, 15, (short[]) null);
        }
    }

    public static final jta d(gms gmsVar, eqj eqjVar, jsy jsyVar, jtf jtfVar) {
        jst jstVar = new jst(gmsVar, eqjVar, jtfVar, jsyVar);
        return new jta(gmsVar, jstVar, new kex(jstVar, jtfVar), jtfVar, 0);
    }
}
