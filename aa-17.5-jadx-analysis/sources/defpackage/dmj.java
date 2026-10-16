package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class dmj {
    public static final afec a = new cmj(19);

    public static final dms a(cxb cxbVar) {
        dme dmeVar = cxbVar.l;
        if (dmeVar != null) {
            return (dms) dmeVar;
        }
        crt.a("Required value was null.");
        throw new aezp();
    }

    public static final void b(afec afecVar, cfy cfyVar, afec afecVar2, bux buxVar, int i, int i2) {
        int i3;
        cfy cfyVar2;
        afec afecVar3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1783766393);
        if (i4 == 0) {
            i3 = (true != buxVarC.E(afecVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afecVar2) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                cfyVar = cfy.e;
            }
            cfy cfyVar3 = cfyVar;
            afec afecVar4 = i6 != 0 ? a : afecVar2;
            c(afecVar, cfyVar3, a, afecVar4, buxVarC, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)));
            cfyVar2 = cfyVar3;
            afecVar3 = afecVar4;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            afecVar3 = afecVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmi(afecVar, cfyVar2, afecVar3, i, i2, 0);
        }
    }

    public static final void c(afec afecVar, cfy cfyVar, afec afecVar2, afec afecVar3, bux buxVar, int i) {
        int i2;
        afec afecVar4;
        ccx ccxVar;
        cfy cfyVar2;
        dlg dlgVar;
        bvv bvvVar;
        dlr dlrVar;
        afec afecVar5 = afecVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-180024211);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afecVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != buxVarC.E(afecVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.E(afecVar5) ? 8192 : 16384;
        }
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar.a(dmm.a).a(cit.a).a(dmq.a).a(dmo.a));
            dlg dlgVar2 = (dlg) buxVarC.f(dbc.d);
            dlr dlrVar2 = (dlr) buxVarC.f(dbc.i);
            ccx ccxVarAh = bvvVar2.ah();
            eqa eqaVar = (eqa) buxVarC.f(erz.a);
            fbg fbgVar = (fbg) buxVarC.f(fbi.a);
            buxVarC.v(1314774735);
            int iG2 = a.g(bvvVar2.u);
            Context context = (Context) buxVarC.f(daa.b);
            bvb bvbVarD = buxVarC.d();
            cdp cdpVar = (cdp) buxVarC.f(cdr.a);
            int i5 = i4;
            View view = (View) buxVarC.f(daa.f);
            boolean zE = buxVarC.E(context) | ((((i5 & 14) ^ 6) > 4 && buxVarC.C(afecVar)) || (i5 & 6) == 4) | buxVarC.E(bvbVarD) | buxVarC.E(cdpVar) | buxVarC.A(iG2) | buxVarC.E(view);
            Object objS = bvvVar2.S();
            if (zE || objS == buw.a) {
                ccxVar = ccxVarAh;
                cfyVar2 = cfyVarJ;
                dlgVar = dlgVar2;
                bvvVar = bvvVar2;
                dlrVar = dlrVar2;
                nla nlaVar = new nla(context, afecVar, bvbVarD, cdpVar, iG2, view, 1);
                bvvVar.ad(nlaVar);
                objS = nlaVar;
            } else {
                ccxVar = ccxVarAh;
                cfyVar2 = cfyVarJ;
                dlgVar = dlgVar2;
                bvvVar = bvvVar2;
                dlrVar = dlrVar2;
            }
            afdr afdrVar = (afdr) objS;
            if (!(bvvVar.a instanceof cza)) {
                throw new IllegalStateException("Invalid applier");
            }
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ccxVar, cwb.d);
            byq.c(buxVarC, cfyVar2, new coi(17));
            byq.c(buxVarC, dlgVar, new coi(18));
            byq.c(buxVarC, eqaVar, new coi(19));
            byq.c(buxVarC, fbgVar, new coi(20));
            byq.c(buxVarC, dlrVar, new dne(1));
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            afecVar5 = afecVar3;
            byq.c(buxVarC, afecVar5, new coi(15));
            afecVar4 = afecVar2;
            byq.c(buxVarC, afecVar4, new coi(16));
            bvvVar.Y(true);
            bvvVar.Y(false);
        } else {
            afecVar4 = afecVar2;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh((Object) afecVar, cfyVar, (Object) afecVar4, afecVar5, i, 0);
        }
    }
}
