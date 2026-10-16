package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class gka {
    public static final Object a(gmo gmoVar) {
        Map map = hio.a;
        return gur.f(gmoVar).a("car-app-model");
    }

    public static final void b(gmo gmoVar, Object obj) {
        Map map = hio.a;
        gur.f(gmoVar).b("car-app-model", obj);
    }

    public static final void c(gpl gplVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(936756009);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gplVar) : buxVarC.E(gplVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarX = asl.x(awd.c(cfvVar, 1.0f).a(cfyVar), asl.v(buxVarC));
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarX);
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
            gvq.g(gplVar.a, null, buxVarC, 0, 1);
            grv.a(gplVar.b, ats.a(ats.b(cfvVar, 1.0f, true), cfl.k), buxVarC, 8, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gplVar, cfyVar, i, 3);
        }
    }

    public static final cfy d(cfy cfyVar, ncp ncpVar) {
        cfyVar.getClass();
        ncpVar.getClass();
        return fxi.k(ca.be(bxc.k(bxc.j(cfyVar, (cil) ncpVar.a), new goa(ncpVar, 4))), (cil) ncpVar.c, null, null, null);
    }

    public static final cfy e(cfy cfyVar, ncp ncpVar) {
        cfyVar.getClass();
        ncpVar.getClass();
        return fxi.k(bxc.j(cfyVar, (cil) ncpVar.c), null, (cil) ncpVar.a, null, null);
    }

    public static final cfy f(cfy cfyVar, ncp ncpVar) {
        ncpVar.getClass();
        return ca.be(bxc.k(cfyVar, new goa(ncpVar, 6)));
    }
}
