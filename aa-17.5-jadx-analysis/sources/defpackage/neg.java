package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class neg implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ nel f;
    final /* synthetic */ dom g;

    public neg(bwq bwqVar, dom domVar, afdr afdrVar, float f, float f2, float f3, nel nelVar) {
        this.a = bwqVar;
        this.g = domVar;
        this.b = afdrVar;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = nelVar;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.g;
            int i = domVar.b;
            domVar.g();
            buxVar.v(1305321102);
            boolean zC = buxVar.C(null);
            Object objG = buxVar.g();
            if (zC || objG == buw.a) {
                gge ggeVar = new gge(9);
                lah lahVar = byj.a;
                objG = new bvk(ggeVar, null);
                buxVar.x(objG);
            }
            new mwa(this.c, this.d, this.e, (bym) objG, domVar, null);
            buxVar.v(2044413955);
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            ctp ctpVarA = avv.a(atd.e, cfl.n, buxVar, 54);
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
            afeg afegVar = cwb.e;
            byq.c(buxVar, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar, ccxVarN, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVar, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVar, cfyVarJ, afegVar4);
            nel nelVar = this.f;
            ca.bb(dao.b(((Number) bxc.f(nelVar.f, Integer.valueOf(R.drawable.dash_weather_unknown), buxVar).a()).intValue(), buxVar, 0), null, awd.i(cfvVar, 112.0f), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar, 440, 120);
            ctp ctpVarA2 = atp.a(atd.c, cfl.k, buxVar, 48);
            int iG2 = a.g(buxVar.b());
            ccx ccxVarN2 = buxVar.N();
            cfy cfyVarJ2 = bzi.j(buxVar, cfvVar);
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar);
            } else {
                buxVar.y();
            }
            byq.c(buxVar, ctpVarA2, afegVar);
            byq.c(buxVar, ccxVarN2, afegVar2);
            byq.c(buxVar, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar, afecVar);
            byq.c(buxVar, cfyVarJ2, afegVar4);
            ats atsVar = ats.a;
            bym bymVarF = bxc.f(nelVar.c, "", buxVar);
            bym bymVarE = bxc.e(nelVar.b, buxVar);
            brp.b(roc.aq(bymVarF).toString(), asl.I(cfvVar, gjk.d.k, BitmapDescriptorFactory.HUE_RED), 0L, kgq.k(72.0f, buxVar), (!ldz.a.a().b() || affa.f(mva.s(bymVarE), true)) ? null : die.j, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar).g, buxVar, 0, 0, 130988);
            Boolean boolS = mva.s(bymVarE);
            boolean zC2 = buxVar.C(bymVarE);
            Object objG2 = buxVar.g();
            if (zC2 || objG2 == buw.a) {
                objG2 = new dxi(bymVarE, (afck) null, 20, (byte[]) null);
                buxVar.x(objG2);
            }
            bvq.g(boolS, (afeg) objG2, buxVar);
            ca.P(atsVar, affa.f(mva.s(bymVarE), true), null, null, null, null, bxc.i(-597994874, true, new nde(nelVar, 5), buxVar), buxVar, 1572870, 30);
            buxVar.n();
            buxVar.n();
            buxVar.o();
            buxVar.o();
            if (domVar.b != i) {
                buxVar.v(1658858795);
                buxVar.r(this.b);
                buxVar.o();
            } else {
                buxVar.v(1659148056);
                buxVar.o();
            }
        }
        return afak.a;
    }
}
