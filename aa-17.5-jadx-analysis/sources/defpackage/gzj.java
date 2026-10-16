package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gzj {
    public static final void a(fzi fziVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        avy avyVar;
        cfr cfrVar;
        boolean z;
        boolean z2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1890859823);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(fziVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarR = awd.r(asl.J(cfyVar, gux.e(buxVarC).a.d, gux.e(buxVarC).b.e, gux.e(buxVarC).a.g, gux.e(buxVarC).b.e));
            asz aszVar = new asz(gux.e(buxVarC).a.g, false, null);
            cfr cfrVar2 = cfl.n;
            ctp ctpVarA = avv.a(aszVar, cfrVar2, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
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
            List list = fziVar.b;
            avy avyVar2 = avy.a;
            if (list.isEmpty()) {
                avyVar = avyVar2;
                cfrVar = cfrVar2;
                z = true;
                buxVarC.v(-1262213875);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1262668428);
                hir hirVar = gux.e(buxVarC).c;
                asz aszVar2 = new asz(16.0f, false, null);
                cfv cfvVar = cfy.e;
                ctp ctpVarA2 = avv.a(aszVar2, cfrVar2, buxVarC, 48);
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
                buxVarC.v(-931102890);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hju hjuVar = (hju) it.next();
                    cfy cfyVarI = awd.i(cfvVar, gux.g(buxVarC).g.c);
                    Iterator it2 = it;
                    ctp ctpVarB = atk.b(cfl.e, false);
                    avy avyVar3 = avyVar2;
                    cfr cfrVar3 = cfrVar2;
                    int iG3 = a.g(bvvVar.u);
                    ccx ccxVarAh3 = bvvVar.ah();
                    cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarI);
                    buxVarC.w();
                    if (bvvVar.t) {
                        buxVarC.j(afdrVar);
                    } else {
                        buxVarC.y();
                    }
                    byq.c(buxVarC, ctpVarB, afegVar);
                    byq.c(buxVarC, ccxVarAh3, afegVar2);
                    byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
                    byq.b(buxVarC, afecVar);
                    byq.c(buxVarC, cfyVarJ3, afegVar4);
                    gvq.g(hjuVar, das.d(cfvVar, "header-start-content"), buxVarC, 48, 0);
                    bvvVar.Y(true);
                    it = it2;
                    avyVar2 = avyVar3;
                    cfrVar2 = cfrVar3;
                }
                avyVar = avyVar2;
                cfrVar = cfrVar2;
                z = true;
                bvvVar.Y(false);
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            gbv gbvVar = fziVar.a;
            cfv cfvVar2 = cfy.e;
            cfy cfyVarB = avyVar.b(cfvVar2, 1.0f, z);
            cfr cfrVar4 = cfrVar;
            gvq.g(gbvVar, cjn.g(awd.d(awd.t(cfyVarB, cfrVar4, 2), gux.g(buxVarC).g.c), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.f(buxVarC).a.g, true, 0, 1042431), buxVarC, 8, 0);
            List list2 = fziVar.c;
            if (list2.isEmpty()) {
                z2 = true;
                buxVarC.v(-1261377619);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1261929233);
                cfy cfyVarN = list2.size() == 2 ? awd.n(cfvVar2, Float.NaN, 128.0f) : cfvVar2;
                hir hirVar2 = gux.e(buxVarC).c;
                ctp ctpVarA3 = avv.a(new asz(16.0f, false, null), cfrVar4, buxVarC, 48);
                int iG4 = a.g(bvvVar.u);
                ccx ccxVarAh4 = bvvVar.ah();
                cfy cfyVarJ4 = bzi.j(buxVarC, cfvVar2);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA3, afegVar);
                byq.c(buxVarC, ccxVarAh4, afegVar2);
                byq.c(buxVarC, Integer.valueOf(iG4), afegVar3);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ4, afegVar4);
                buxVarC.v(-2131310766);
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    gvq.g((hju) it3.next(), cfyVarN, buxVarC, 0, 0);
                }
                bvvVar.Y(false);
                z2 = true;
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            bvvVar.Y(z2);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(fziVar, cfyVar, i, 15, null);
        }
    }

    public static /* synthetic */ afak b(geu geuVar, uw uwVar, int i, int i2) {
        geuVar.t().l(uwVar, i, i2);
        return afak.a;
    }

    public static final void c(hju hjuVar, String str) {
        Map map = hio.a;
        gur.f(hjuVar).b("test-tag", str);
    }

    public static final void d(hju hjuVar, gmo gmoVar) {
        Map map = hio.a;
        gur.f(hjuVar).b("internal-model", gmoVar);
    }

    public static final cfy e(cfy cfyVar, hju hjuVar) {
        cfyVar.getClass();
        return dds.a(cfyVar, false, new hfl(hjuVar, 13));
    }
}
