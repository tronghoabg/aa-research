package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ndg implements afeh {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afeh c;
    final /* synthetic */ afdr d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ bwq g;
    final /* synthetic */ ndp h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ boolean k;
    final /* synthetic */ boolean l;
    final /* synthetic */ afdr m;
    final /* synthetic */ boolean n;
    final /* synthetic */ boolean o;
    final /* synthetic */ asf p;
    final /* synthetic */ bym q;
    final /* synthetic */ bym r;

    public ndg(boolean z, boolean z2, afeh afehVar, afdr afdrVar, float f, float f2, bwq bwqVar, ndp ndpVar, boolean z3, boolean z4, boolean z5, boolean z6, afdr afdrVar2, boolean z7, boolean z8, asf asfVar, bym bymVar, bym bymVar2) {
        this.a = z;
        this.b = z2;
        this.c = afehVar;
        this.d = afdrVar;
        this.e = f;
        this.f = f2;
        this.g = bwqVar;
        this.h = ndpVar;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = afdrVar2;
        this.n = z7;
        this.o = z8;
        this.p = asfVar;
        this.q = bymVar;
        this.r = bymVar2;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        afdr afdrVar;
        float f;
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (buxVar.I((iIntValue & 17) != 16, iIntValue & 1)) {
            float f2 = !this.a ? BitmapDescriptorFactory.HUE_RED : (this.b || ldz.a.a().b()) ? gjk.c.k : gjk.d.k;
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            afeh afehVar = this.c;
            afdr afdrVar2 = this.d;
            float f3 = this.e;
            float f4 = this.f;
            bwq bwqVar = this.g;
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(buxVar.b());
            ccx ccxVarN = buxVar.N();
            cfy cfyVarJ = bzi.j(buxVar, cfyVarC);
            afdr afdrVar3 = cwb.a;
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar3);
            } else {
                buxVar.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVar, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar, ccxVarN, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVar, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVar, cfyVarJ, afegVar4);
            if (afehVar != null) {
                buxVar.v(-1045966238);
                afdrVar = afdrVar2;
                cfy cfyVarC2 = awd.c(cfvVar, 1.0f);
                f = f3;
                ctp ctpVarB2 = atk.b(cfl.e, false);
                int iG2 = a.g(buxVar.b());
                ccx ccxVarN2 = buxVar.N();
                cfy cfyVarJ2 = bzi.j(buxVar, cfyVarC2);
                buxVar.M();
                buxVar.w();
                if (buxVar.G()) {
                    buxVar.j(afdrVar3);
                } else {
                    buxVar.y();
                }
                byq.c(buxVar, ctpVarB2, afegVar);
                byq.c(buxVar, ccxVarN2, afegVar2);
                byq.c(buxVar, Integer.valueOf(iG2), afegVar3);
                byq.b(buxVar, afecVar);
                byq.c(buxVar, cfyVarJ2, afegVar4);
                afehVar.invoke(atn.a, buxVar, 6);
                buxVar.n();
                buxVar.o();
            } else {
                afdrVar = afdrVar2;
                f = f3;
                buxVar.v(-1045816322);
                buxVar.o();
            }
            cfy cfyVarC3 = awd.c(asl.H(cfvVar, f2), 1.0f);
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
            dor dorVar = (dor) objG4;
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
                objG6 = new hfq(bwqVar3, dotVar, dorVar, bwqVar2, 7);
                buxVar.x(objG6);
            }
            ctp ctpVar = (ctp) objG6;
            Object objG7 = buxVar.g();
            if (objG7 == obj4) {
                objG7 = new hfr(bwqVar2, dorVar, 15);
                buxVar.x(objG7);
            }
            afdr afdrVar4 = (afdr) objG7;
            boolean zE2 = buxVar.E(dotVar);
            Object objG8 = buxVar.g();
            if (zE2 || objG8 == obj4) {
                objG8 = new hko(dotVar, 19);
                buxVar.x(objG8);
            }
            crt.g(dds.a(cfyVarC3, false, (afec) objG8), bxc.i(-1759682870, true, new ndf(bwqVar3, domVar, afdrVar4, afdrVar, f, f4, f2, bwqVar, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r), buxVar), ctpVar, buxVar, 48);
            buxVar.o();
            buxVar.n();
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
