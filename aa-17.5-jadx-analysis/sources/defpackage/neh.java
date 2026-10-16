package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class neh implements afeh {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ nel d;

    public neh(boolean z, float f, float f2, nel nelVar) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = nelVar;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object hfqVar;
        dor dorVar;
        bwq bwqVar;
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (buxVar.I(i != 16, iIntValue & 1)) {
            float f = (this.a || ldz.a.a().b()) ? gjk.c.k : gjk.d.k;
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            float f2 = this.b;
            float f3 = this.c;
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(buxVar.b());
            ccx ccxVarN = buxVar.N();
            cfy cfyVarJ = bzi.j(buxVar, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar);
            } else {
                buxVar.y();
            }
            byq.c(buxVar, ctpVarB, cwb.e);
            byq.c(buxVar, ccxVarN, cwb.d);
            byq.c(buxVar, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar, cwb.g);
            byq.c(buxVar, cfyVarJ, cwb.c);
            buxVar.v(-1045816322);
            buxVar.o();
            cfy cfyVarC2 = awd.c(asl.H(cfvVar, f), 1.0f);
            buxVar.v(-1066585843);
            buxVar.v(-487956875);
            buxVar.o();
            dlg dlgVar = (dlg) buxVar.f(dbc.d);
            Object objG = buxVar.g();
            Object obj4 = buw.a;
            if (objG == obj4) {
                objG = new dot(dlgVar);
                buxVar.x(objG);
            }
            dot dotVar = (dot) objG;
            Object objG2 = buxVar.g();
            if (objG2 == obj4) {
                objG2 = new dom((char[]) null);
                buxVar.x(objG2);
            }
            dom domVar = (dom) objG2;
            Object objG3 = buxVar.g();
            if (objG3 == obj4) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                buxVar.x(parcelableSnapshotMutableState);
                objG3 = parcelableSnapshotMutableState;
            }
            bwq bwqVar2 = (bwq) objG3;
            Object objG4 = buxVar.g();
            if (objG4 == obj4) {
                objG4 = new dor(domVar);
                buxVar.x(objG4);
            }
            dor dorVar2 = (dor) objG4;
            Object objG5 = buxVar.g();
            if (objG5 == obj4) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(afak.a, bxp.b);
                buxVar.x(parcelableSnapshotMutableState2);
                objG5 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar3 = (bwq) objG5;
            boolean zE = buxVar.E(dotVar) | buxVar.A(257);
            Object objG6 = buxVar.g();
            if (zE || objG6 == obj4) {
                hfqVar = new hfq(bwqVar3, dotVar, dorVar2, bwqVar2, 9);
                dorVar = dorVar2;
                bwqVar = bwqVar2;
                buxVar.x(hfqVar);
            } else {
                hfqVar = objG6;
                dorVar = dorVar2;
                bwqVar = bwqVar2;
            }
            ctp ctpVar = (ctp) hfqVar;
            Object objG7 = buxVar.g();
            if (objG7 == obj4) {
                objG7 = new hfr(bwqVar, dorVar, 18);
                buxVar.x(objG7);
            }
            afdr afdrVar2 = (afdr) objG7;
            boolean zE2 = buxVar.E(dotVar);
            Object objG8 = buxVar.g();
            if (zE2 || objG8 == obj4) {
                objG8 = new ndr(dotVar, 4);
                buxVar.x(objG8);
            }
            crt.g(dds.a(cfyVarC2, false, (afec) objG8), bxc.i(-1759682870, true, new neg(bwqVar3, domVar, afdrVar2, f2, f3, f, this.d), buxVar), ctpVar, buxVar, 48);
            buxVar.o();
            buxVar.n();
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
