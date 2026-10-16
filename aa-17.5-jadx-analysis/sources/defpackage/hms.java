package defpackage;

/* loaded from: classes2.dex */
public final class hms {
    public static final void a(hmr hmrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(237076523);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hmrVar) : buxVarC.E(hmrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
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
            hju hjuVar = hmrVar.a;
            atn atnVar = atn.a;
            gvq.g(hjuVar, null, buxVarC, 0, 1);
            grv.a(hmrVar.b, atnVar.a(awd.c(cfvVar, 1.0f), cfl.e), buxVarC, 8, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hmrVar, cfyVar, i, 16);
        }
    }

    public static final int b(float f, float f2, gns gnsVar) {
        gnsVar.getClass();
        yob yobVar = hmy.a;
        yop yopVarE = yobVar.e();
        yos yosVar = ypi.a;
        ((ynz) yopVarE.o(yosVar, "WIDISTATE").ai(107)).M("Widget constraints width: %s, height: %s", new dlj(f), new dlj(f2));
        boolean z = false;
        boolean z2 = dlj.a(f, 80.0f) <= 0 || dlj.a(f2, 80.0f) <= 0;
        boolean z3 = dlj.a(f2, 360.0f) >= 0;
        boolean z4 = dlj.a(f, 700.0f) >= 0;
        int iA = dlj.a(f, 400.0f);
        if ((dlj.a(f, 80.0f) > 0 && dlj.a(f, 250.0f) < 0) || (dlj.a(f2, 80.0f) > 0 && dlj.a(f2, 168.0f) < 0)) {
            ((ynz) yobVar.h().o(yosVar, "WIDISTATE").ai(108)).M("Widget container width: %s or height %s are not supported.", new dlj(f), new dlj(f2));
            gnsVar.g();
            return 3;
        }
        if (z2) {
            return 6;
        }
        if (!z3) {
            z = z4;
        } else if (z4) {
            return 4;
        }
        if (z3 && iA >= 0) {
            return 2;
        }
        if (z3) {
            return 1;
        }
        return !z ? 3 : 5;
    }
}
