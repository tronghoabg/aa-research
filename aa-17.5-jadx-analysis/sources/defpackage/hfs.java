package defpackage;

/* loaded from: classes2.dex */
public final class hfs implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afeg c;
    final /* synthetic */ hgc d;
    final /* synthetic */ cil e;
    final /* synthetic */ cil f;
    final /* synthetic */ cil g;
    final /* synthetic */ afeg h;
    final /* synthetic */ afeg i;
    final /* synthetic */ hga j;
    final /* synthetic */ hge k;
    final /* synthetic */ dom l;

    public hfs(bwq bwqVar, dom domVar, afdr afdrVar, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, cil cilVar3, afeg afegVar2, afeg afegVar3, hga hgaVar, hge hgeVar) {
        this.a = bwqVar;
        this.l = domVar;
        this.b = afdrVar;
        this.c = afegVar;
        this.d = hgcVar;
        this.e = cilVar;
        this.f = cilVar2;
        this.g = cilVar3;
        this.h = afegVar2;
        this.i = afegVar3;
        this.j = hgaVar;
        this.k = hgeVar;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws dpm {
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.l;
            int i = domVar.b;
            domVar.g();
            buxVar.v(577464363);
            ajmd ajmdVarL = domVar.l();
            doj dojVarO = ajmdVarL.O();
            doj dojVarP = ajmdVarL.P();
            doj dojVarQ = ajmdVarL.Q();
            doj dojVarR = ajmdVarL.R();
            doj dojVarS = ajmdVarL.S();
            doj dojVarT = ajmdVarL.T();
            afeg afegVar = this.c;
            hgc hgcVar = this.d;
            cil cilVar = this.e;
            cil cilVar2 = this.f;
            cil cilVar3 = this.g;
            afeg afegVar2 = this.h;
            Object objG = buxVar.g();
            Object obj3 = buw.a;
            if (objG == obj3) {
                objG = gge.c;
                buxVar.x(objG);
            }
            boolean z = !affa.f(afegVar2, objG);
            afeg afegVar3 = this.i;
            Object objG2 = buxVar.g();
            if (objG2 == obj3) {
                objG2 = gge.d;
                buxVar.x(objG2);
            }
            hft.e(domVar, dojVarO, afegVar, hgcVar, cilVar, cilVar2, cilVar3, z, !affa.f(afegVar3, objG2), buxVar, 1794056);
            hft.c(domVar, dojVarP, dojVarR, hgcVar, buxVar, 8);
            hft.g(domVar, dojVarQ, dojVarO, afegVar2, hgcVar, cilVar2, cilVar, buxVar, 1769480);
            hft.f(domVar, dojVarR, dojVarQ, afegVar3, cilVar3, cilVar, buxVar, 221192);
            hga hgaVar = this.j;
            hge hgeVar = this.k;
            hft.h(domVar, dojVarO, dojVarR, dojVarQ, hgaVar, hgeVar, dojVarS, buxVar, 8);
            hft.d(domVar, hgeVar, dojVarO, dojVarR, dojVarQ, hgaVar, dojVarT, buxVar, 8);
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
