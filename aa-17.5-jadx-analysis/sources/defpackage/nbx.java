package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nbx implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afdr c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ bwq g;
    final /* synthetic */ ncr h;
    final /* synthetic */ dom i;

    public nbx(bwq bwqVar, dom domVar, afdr afdrVar, afdr afdrVar2, float f, float f2, float f3, bwq bwqVar2, ncr ncrVar) {
        this.a = bwqVar;
        this.i = domVar;
        this.b = afdrVar;
        this.c = afdrVar2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = bwqVar2;
        this.h = ncrVar;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        cfv cfvVar;
        int i;
        float f;
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.i;
            int i2 = domVar.b;
            domVar.g();
            buxVar.v(1305321102);
            afdr afdrVar = this.c;
            boolean zC = buxVar.C(afdrVar);
            Object objG = buxVar.g();
            if (zC || objG == buw.a) {
                hfr hfrVar = new hfr(afdrVar, this.g, 14, null);
                lah lahVar = byj.a;
                bvk bvkVar = new bvk(hfrVar, null);
                buxVar.x(bvkVar);
                objG = bvkVar;
            }
            mwa mwaVar = new mwa(this.d, this.e, this.f, (bym) objG, domVar, afdrVar);
            buxVar.v(-915991294);
            bym bymVarE = bxc.e(this.h.a, buxVar);
            Object objG2 = buxVar.g();
            Object obj3 = buw.a;
            if (objG2 == obj3) {
                ahq ahqVar = new ahq(bymVarE, 15);
                lah lahVar2 = byj.a;
                bvk bvkVar2 = new bvk(ahqVar, null);
                buxVar.x(bvkVar2);
                objG2 = bvkVar2;
            }
            bym bymVar = (bym) objG2;
            Object objG3 = buxVar.g();
            if (objG3 == obj3) {
                ahq ahqVar2 = new ahq(bymVarE, 16);
                lah lahVar3 = byj.a;
                bvk bvkVar3 = new bvk(ahqVar2, null);
                buxVar.x(bvkVar3);
                objG3 = bvkVar3;
            }
            bym bymVar2 = (bym) objG3;
            boolean z2 = ldz.a.a().b() && mcd.z(mwaVar.b, mwaVar.c);
            dom domVar2 = ((tdc) mwaVar.a).a;
            cfv cfvVar2 = cfy.e;
            doj dojVarF = domVar2.f();
            Object objG4 = buxVar.g();
            if (objG4 == obj3) {
                objG4 = muo.i;
                buxVar.x(objG4);
            }
            cfy cfyVarB = mwa.b(cfvVar2, dojVarF, (afec) objG4);
            float f2 = mwaVar.d;
            cfy cfyVarM = ebj.m(cfyVarB, f2);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar, 0);
            int iG = a.g(buxVar.b());
            ccx ccxVarN = buxVar.N();
            cfy cfyVarJ = bzi.j(buxVar, cfyVarM);
            afdr afdrVar2 = cwb.a;
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar2);
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
            cfy cfyVarR = awd.r(ats.b(cfvVar2, 1.0f, true));
            boolean z3 = z2;
            ctp ctpVarA2 = avv.a(atd.a, cfl.m, buxVar, 0);
            int iG2 = a.g(buxVar.b());
            ccx ccxVarN2 = buxVar.N();
            cfy cfyVarJ2 = bzi.j(buxVar, cfyVarR);
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar2);
            } else {
                buxVar.y();
            }
            byq.c(buxVar, ctpVarA2, afegVar);
            byq.c(buxVar, ccxVarN2, afegVar2);
            byq.c(buxVar, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar, afecVar);
            byq.c(buxVar, cfyVarJ2, afegVar4);
            avy avyVar = avy.a;
            int i3 = nca.a;
            ncd ncdVar = (ncd) bymVar.a();
            if (ncdVar == null) {
                buxVar.v(239268624);
                buxVar.o();
                f = f2;
                cfvVar = cfvVar2;
                i = i2;
                z = true;
            } else {
                buxVar.v(239268625);
                boolean z4 = nca.a(bymVar2) == null;
                float f3 = ncb.a;
                float f4 = ncb.a;
                avr avrVar = new avr(f4, f4, f4, z4 ? f4 : 0.0f);
                avr avrVar2 = new avr(f2, f2, f2, (!z3 || z4) ? f2 : gjk.b.k);
                GhIcon ghIcon = ncdVar.a;
                CharSequence charSequence = ncdVar.b;
                CharSequence charSequence2 = ncdVar.c;
                String string = charSequence.toString();
                z = true;
                cfvVar = cfvVar2;
                i = i2;
                String string2 = charSequence2 != null ? charSequence2.toString() : null;
                f = f2;
                nca.b(ghIcon, string, string2, nca.d(ncdVar, buxVar), avyVar.b(awd.b(nca.e(cfvVar2, avrVar, ncdVar, avrVar2, buxVar), 1.0f), 1.0f, true), z4, buxVar, 0, 0);
                buxVar.o();
            }
            float f5 = z != ((Boolean) mwaVar.e.a()).booleanValue() ? 0.0f : f;
            cfv cfvVar3 = cfvVar;
            mwaVar.a(asl.J(cfvVar3, BitmapDescriptorFactory.HUE_RED, f5, f5, BitmapDescriptorFactory.HUE_RED), buxVar, 64);
            buxVar.n();
            ncd ncdVarA = nca.a(bymVar2);
            if (ncdVarA == null) {
                buxVar.v(1729531840);
                buxVar.o();
            } else {
                buxVar.v(1729531841);
                xb.a(asl.I(cfvVar3, f, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, cjv.h(kfn.i(buxVar).y(), 0.4f), buxVar, 0, 2);
                float f6 = ncb.a;
                float f7 = ncb.a;
                avr avrVar3 = new avr(f7, BitmapDescriptorFactory.HUE_RED, f7, f7);
                avr avrVar4 = new avr(f, z3 ? gjk.b.k : f, f, f);
                GhIcon ghIcon2 = ncdVarA.a;
                CharSequence charSequence3 = ncdVarA.b;
                CharSequence charSequence4 = ncdVarA.c;
                nca.b(ghIcon2, charSequence3.toString(), charSequence4 != null ? charSequence4.toString() : null, nca.d(ncdVarA, buxVar), ats.b(awd.r(nca.e(cfvVar3, avrVar3, ncdVarA, avrVar4, buxVar)), 1.0f, true), false, buxVar, 0, 32);
                buxVar.o();
            }
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
