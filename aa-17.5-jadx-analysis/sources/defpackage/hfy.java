package defpackage;

/* loaded from: classes2.dex */
public final class hfy implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afeg c;
    final /* synthetic */ hgc d;
    final /* synthetic */ cil e;
    final /* synthetic */ cil f;
    final /* synthetic */ cil g;
    final /* synthetic */ cil h;
    final /* synthetic */ hfi i;
    final /* synthetic */ afeg j;
    final /* synthetic */ afeg k;
    final /* synthetic */ afeg l;
    final /* synthetic */ hga m;
    final /* synthetic */ hge n;
    final /* synthetic */ dom o;

    public hfy(bwq bwqVar, dom domVar, afdr afdrVar, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, hfi hfiVar, afeg afegVar2, afeg afegVar3, afeg afegVar4, hga hgaVar, hge hgeVar) {
        this.a = bwqVar;
        this.o = domVar;
        this.b = afdrVar;
        this.c = afegVar;
        this.d = hgcVar;
        this.e = cilVar;
        this.f = cilVar2;
        this.g = cilVar3;
        this.h = cilVar4;
        this.i = hfiVar;
        this.j = afegVar2;
        this.k = afegVar3;
        this.l = afegVar4;
        this.m = hgaVar;
        this.n = hgeVar;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws dpm {
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.o;
            int i = domVar.b;
            domVar.g();
            buxVar.v(-707227690);
            ajmd ajmdVarL = domVar.l();
            doj dojVarO = ajmdVarL.O();
            doj dojVarP = ajmdVarL.P();
            doj dojVarQ = ajmdVarL.Q();
            doj dojVarR = ajmdVarL.R();
            doj dojVarS = ajmdVarL.S();
            doj dojVarT = ajmdVarL.T();
            Object obj3 = ajmdVarL.a;
            afeg afegVar = this.c;
            hgc hgcVar = this.d;
            cil cilVar = this.e;
            cil cilVar2 = this.f;
            cil cilVar3 = this.g;
            cil cilVar4 = this.h;
            hfi hfiVar = this.i;
            doj dojVarF = ((dom) obj3).f();
            hfz.h(domVar, dojVarO, afegVar, hgcVar, cilVar, cilVar2, cilVar3, cilVar4, hfiVar, buxVar, 14376968);
            hfz.g(domVar, dojVarP, dojVarR, this.j, hgcVar, cilVar3, cilVar2, cilVar, cilVar4, hfiVar, buxVar, 115015688);
            hfz.c(domVar, dojVarQ, dojVarO, this.k, cilVar4, cilVar2, cilVar3, cilVar, hfiVar, buxVar, 14376968);
            hfz.e(domVar, dojVarR, dojVarO, dojVarQ, this.l, hgcVar, cilVar2, cilVar, cilVar3, cilVar4, hfiVar, buxVar, 920125448, 0);
            hfz.d(domVar, dojVarS, dojVarR, hgcVar, buxVar, 8);
            hga hgaVar = this.m;
            hge hgeVar = this.n;
            hfz.i(domVar, dojVarO, dojVarP, dojVarQ, dojVarR, hgaVar, hgeVar, dojVarT, buxVar, 8);
            hfz.f(domVar, hgeVar, dojVarO, dojVarP, dojVarQ, dojVarR, hgaVar, dojVarF, buxVar, 8);
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
