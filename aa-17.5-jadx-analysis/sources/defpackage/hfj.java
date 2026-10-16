package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public final class hfj implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ float c;
    final /* synthetic */ afeg d;
    final /* synthetic */ cil e;
    final /* synthetic */ hga f;
    final /* synthetic */ cil g;
    final /* synthetic */ cil h;
    final /* synthetic */ hge i;
    final /* synthetic */ afeg j;
    final /* synthetic */ bwq k;
    final /* synthetic */ bwq l;
    final /* synthetic */ afeg m;
    final /* synthetic */ dom n;

    public hfj(bwq bwqVar, dom domVar, afdr afdrVar, float f, afeg afegVar, cil cilVar, hga hgaVar, cil cilVar2, cil cilVar3, hge hgeVar, afeg afegVar2, bwq bwqVar2, bwq bwqVar3, afeg afegVar3) {
        this.a = bwqVar;
        this.n = domVar;
        this.b = afdrVar;
        this.c = f;
        this.d = afegVar;
        this.e = cilVar;
        this.f = hgaVar;
        this.g = cilVar2;
        this.h = cilVar3;
        this.i = hgeVar;
        this.j = afegVar2;
        this.k = bwqVar2;
        this.l = bwqVar3;
        this.m = afegVar3;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) throws dpm {
        dom domVar;
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar2 = this.n;
            int i = domVar2.b;
            domVar2.g();
            buxVar.v(1334443622);
            ajmd ajmdVarL = domVar2.l();
            doj dojVarO = ajmdVarL.O();
            doj dojVarP = ajmdVarL.P();
            doj dojVarQ = ajmdVarL.Q();
            doj dojVarR = ajmdVarL.R();
            doj dojVarS = ajmdVarL.S();
            doj dojVarT = ajmdVarL.T();
            float f = this.c;
            cfv cfvVar = cfy.e;
            boolean z = buxVar.z(f);
            afeg afegVar = this.d;
            boolean zC = z | buxVar.C(afegVar) | buxVar.C(dojVarQ);
            Object objG = buxVar.g();
            if (zC || objG == buw.a) {
                objG = new hfk(f, dojVarQ, afegVar);
                buxVar.x(objG);
            }
            cfy cfyVarH = dom.h(cfvVar, dojVarR, (afec) objG);
            Object objG2 = buxVar.g();
            Object obj3 = buw.a;
            if (objG2 == obj3) {
                domVar = domVar2;
                dah dahVar = new dah(this.k, this.l, 13);
                buxVar.x(dahVar);
                objG2 = dahVar;
            } else {
                domVar = domVar2;
            }
            cfy cfyVarJ = bxc.j(bxc.k(cfyVarH, (afec) objG2), this.e);
            hga hgaVar = this.f;
            dom domVar3 = domVar;
            cfy cfyVarA = ggh.a(hdz.b(cfyVarJ, hgaVar), bcr.b(gjk.e.k), gux.c(buxVar).h(), 0L, null, null, null, false, false, buxVar, 0, 252);
            Object objG3 = buxVar.g();
            if (objG3 == obj3) {
                objG3 = new asg();
                buxVar.x(objG3);
            }
            asf asfVar = (asf) objG3;
            boolean zE = buxVar.E(hgaVar);
            Object objG4 = buxVar.g();
            if (zE || objG4 == obj3) {
                objG4 = new ahq(hgaVar, 7);
                buxVar.x(objG4);
            }
            hdt.d(afp.w(cfyVarA, asfVar, null, true, null, (afdr) objG4), buxVar, 0);
            Object objG5 = buxVar.g();
            if (objG5 == obj3) {
                objG5 = ebq.s;
                buxVar.x(objG5);
            }
            cfy cfyVarJ2 = bxc.j(dom.h(cfvVar, dojVarO, (afec) objG5), this.g);
            Object objG6 = buxVar.g();
            if (objG6 == obj3) {
                gyv gyvVar = new gyv(this.k, 15);
                buxVar.x(gyvVar);
                objG6 = gyvVar;
            }
            hdt.h(ca.be(bxc.l(cfyVarJ2, (afec) objG6)), bxc.i(228641278, true, new fxd(this.m, 4), buxVar), buxVar, 48);
            boolean zC2 = buxVar.C(dojVarO) | buxVar.C(dojVarQ);
            Object objG7 = buxVar.g();
            if (zC2 || objG7 == obj3) {
                objG7 = new dah(dojVarO, dojVarQ, 14);
                buxVar.x(objG7);
            }
            cfy cfyVarJ3 = bxc.j(dom.h(cfvVar, dojVarP, (afec) objG7), this.h);
            Object objG8 = buxVar.g();
            if (objG8 == obj3) {
                gyv gyvVar2 = new gyv(this.l, 16);
                buxVar.x(gyvVar2);
                objG8 = gyvVar2;
            }
            cfy cfyVarBe = ca.be(bxc.l(cfyVarJ3, (afec) objG8));
            afeg afegVar2 = this.j;
            hdt.c(cfyVarBe, bxc.i(1636273700, true, new fxd(afegVar2, 2), buxVar), buxVar, 48);
            Object objG9 = buxVar.g();
            if (objG9 == obj3) {
                objG9 = ebq.r;
                buxVar.x(objG9);
            }
            hdt.b(dom.h(cfvVar, dojVarQ, (afec) objG9), bxc.i(-2104062450, true, new fxd(afegVar, 3), buxVar), buxVar, 48);
            hge hgeVar = this.i;
            boolean z2 = hgeVar.a;
            cfy cfyVarA2 = hdv.c(cfvVar, hgaVar, z2).a(new aix(hgeVar.c, ckq.a));
            boolean zC3 = buxVar.C(afegVar2) | buxVar.C(dojVarO) | buxVar.C(dojVarQ);
            Object objG10 = buxVar.g();
            if (zC3 || objG10 == obj3) {
                objG10 = new gln(afegVar2, dojVarO, dojVarQ, 3);
                buxVar.x(objG10);
            }
            hdt.i(vq.b(dom.h(cfyVarA2, dojVarS, (afec) objG10), -100.0f), buxVar, 0);
            dlj dljVar = hgeVar.b.b;
            dok dokVarB = domVar3.b(dljVar != null ? dljVar.a : BitmapDescriptorFactory.HUE_RED);
            dos dosVar = new dos(Integer.valueOf(domVar3.a()));
            dpl dplVarD = domVar3.d(dosVar);
            dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "hGuideline");
            dplVarD.s("end", BitmapDescriptorFactory.HUE_RED);
            domVar3.e(9);
            domVar3.e(Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED));
            dok dokVar = new dok(dosVar.h, 0, dosVar);
            dok dokVarI = domVar3.i(new dos[]{dojVarO, dokVarB.c});
            dos[] dosVarArr = {dojVarQ, dokVar.c};
            dos dosVar2 = new dos(Integer.valueOf(domVar3.a()));
            dpf dpfVar = new dpf(new char[0]);
            for (int i2 = 0; i2 < 2; i2++) {
                dpfVar.q(dpn.a(dosVarArr[i2].a().toString()));
            }
            dpl dplVarD2 = domVar3.d(dosVar2);
            dplVarD2.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
            dplVarD2.t("direction", "top");
            dplVarD2.s("margin", BitmapDescriptorFactory.HUE_RED);
            dplVarD2.r("contains", dpfVar);
            domVar3.e(12);
            for (int i3 = 0; i3 < 2; i3++) {
                domVar3.e(dosVarArr[i3].hashCode());
            }
            domVar3.e(Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED));
            dok dokVar2 = new dok(dosVar2.h, 0, dosVar2);
            cfy cfyVarA3 = hdv.b(cfvVar, hgaVar, z2).a(new aix(hgeVar.d, ckq.a));
            boolean zC4 = buxVar.C(afegVar2) | buxVar.C(dokVarI) | buxVar.C(dokVar2);
            Object objG11 = buxVar.g();
            if (zC4 || objG11 == obj3) {
                objG11 = new gln(afegVar2, dokVarI, dokVar2, 4);
                buxVar.x(objG11);
            }
            hdt.g(vq.b(dom.h(cfyVarA3, dojVarT, (afec) objG11), -10.0f), buxVar, 0);
            buxVar.o();
            if (domVar3.b != i) {
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
