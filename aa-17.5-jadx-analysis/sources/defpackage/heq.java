package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes2.dex */
public final class heq {
    public static final void a(hey heyVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1605727294);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(heyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            hdo.b(cfyVar2, heyVar.b, heyVar.c, bxc.i(1465561962, true, new gsl(heyVar, 15), buxVarC), buxVarC, ((i2 >> 3) & 14) | 3648);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(heyVar, cfyVar2, i, 17);
        }
    }

    public static final cfy b(cfy cfyVar, bux buxVar) {
        cfyVar.getClass();
        if (!((ggk) buxVar.f(ggo.a)).D()) {
            buxVar.v(1678585490);
            buxVar.o();
            return cfyVar;
        }
        buxVar.v(1678109175);
        afak afakVar = afak.a;
        Object objG = buxVar.g();
        if (objG == buw.a) {
            objG = gha.c;
            buxVar.x(objG);
        }
        cfy cfyVarA = crh.a(cfyVar, afakVar, (PointerInputEventHandler) objG);
        buxVar.o();
        return cfyVarA;
    }
}
