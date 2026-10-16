package defpackage;

/* loaded from: classes2.dex */
public class gvj {
    public static void a(gvh gvhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(897919903);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gvhVar) : buxVarC.E(gvhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarA = atp.a(atd.g(gjk.d.k), cfl.k, buxVarC, 48);
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
            hju hjuVar = gvhVar.b;
            if (hjuVar == null) {
                buxVarC.v(1353213447);
            } else {
                buxVarC.v(-649084614);
                gvq.g(hjuVar, cfy.e, buxVarC, 48, 0);
            }
            bvvVar.Y(false);
            gvq.g(gvhVar.a, cfy.e, buxVarC, 48, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(gvhVar, cfyVar, i, 8, null);
        }
    }

    public static hjo b(int i, int i2) {
        hjn hjnVar = hjn.b;
        if (i < hjnVar.d) {
            hjnVar = hjn.a;
        } else {
            hjn hjnVar2 = hjn.c;
            if (i >= hjnVar2.d) {
                hjnVar = hjnVar2;
            }
        }
        hjm hjmVar = hjm.b;
        if (i2 < hjmVar.d) {
            hjmVar = hjm.a;
        } else {
            hjm hjmVar2 = hjm.c;
            if (i2 >= hjmVar2.d) {
                hjmVar = hjmVar2;
            }
        }
        return new hjo(hjnVar, hjmVar, i, i2);
    }

    public static long c(float f, bux buxVar) {
        return ((dlg) buxVar.f(dbc.d)).eI(f);
    }

    public static bry d(int i, bux buxVar, int i2) {
        hjl hjlVar;
        dhs dhsVar = hjj.a;
        dfw dfwVar = new dfw(0L, 0L, null, hjj.a, 0L, 0, 0L, 16777183);
        int i3 = 1 == i2 ? 1 : i;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 0) {
            hjlVar = hjl.a;
        } else if (i4 == 1) {
            hjlVar = hjl.b;
        } else {
            if (i4 != 2) {
                throw new aezs();
            }
            hjlVar = hjl.c;
        }
        dfw dfwVarE = e(dfwVar, hjlVar.d, buxVar);
        dfw dfwVarE2 = e(dfwVar, hjlVar.e, buxVar);
        dfw dfwVarE3 = e(dfwVar, hjlVar.f, buxVar);
        dfw dfwVarE4 = e(dfwVar, hjlVar.g, buxVar);
        dfw dfwVarE5 = e(dfwVar, hjlVar.h, buxVar);
        dfw dfwVarE6 = e(dfwVar, hjlVar.i, buxVar);
        dfw dfwVarE7 = e(dfwVar, hjlVar.j, buxVar);
        die dieVar = hjj.b;
        dfw dfwVarV = dfw.v(dfwVarE7, 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        dfw dfwVarV2 = dfw.v(e(dfwVar, hjlVar.k, buxVar), 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        dfw dfwVarV3 = dfw.v(e(dfwVar, hjlVar.l, buxVar), 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        dfw dfwVarE8 = e(dfwVar, hjlVar.m, buxVar);
        dfw dfwVarE9 = e(dfwVar, hjlVar.n, buxVar);
        dfw dfwVarE10 = e(dfwVar, hjlVar.o, buxVar);
        dfw dfwVarV4 = dfw.v(e(dfwVar, hjlVar.p, buxVar), 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        dfw dfwVarV5 = dfw.v(e(dfwVar, hjlVar.q, buxVar), 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        dfw dfwVarV6 = dfw.v(e(dfwVar, hjlVar.r, buxVar), 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        return new bry(dfwVarE, dfwVarE2, dfwVarE3, dfwVarE4, dfwVarE5, dfwVarE6, dfwVarV, dfwVarV2, dfwVarV3, dfwVarE8, dfwVarE9, dfwVarE10, dfwVarV4, dfwVarV5, dfwVarV6, dfwVarE, dfwVarE2, dfwVarE3, dfwVarE4, dfwVarE5, dfwVarE6, dfwVarV, dfwVarV2, dfwVarV3, dfwVarE8, dfwVarE9, dfwVarE10, dfwVarV4, dfwVarV5, dfwVarV6);
    }

    private static dfw e(dfw dfwVar, hjk hjkVar, bux buxVar) {
        return dfw.v(dfwVar, 0L, c(hjkVar.a, buxVar), null, null, null, null, 0L, null, 0, 0, c(hjkVar.b, buxVar), null, null, 16646141);
    }
}
