package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class czx extends defpackage.dzw {
    final /* synthetic */ defpackage.czz a;
    final /* synthetic */ defpackage.cxl b;
    final /* synthetic */ defpackage.czz c;
    final /* synthetic */ defpackage.dau d;

    public czx(defpackage.czz czzVar, defpackage.cxl cxlVar, defpackage.czz czzVar2, defpackage.dau dauVar) {
        this.a = czzVar;
        this.b = cxlVar;
        this.c = czzVar2;
        this.d = dauVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    @Override // defpackage.dzw
    public final void c(android.view.View view, edn ednVar) {
        super.c(view, ednVar);
        defpackage.czz czzVar = this.a;
        defpackage.dah dahVar = czzVar.q;
        if (dahVar.B()) {
            ednVar.U(false);
        }
        defpackage.cxl cxlVar = this.b;
        defpackage.cxl cxlVarL = cxlVar.l();
        while (true) {
            if (cxlVarL == null) {
                cxlVarL = null;
                break;
            } else if (cxlVarL.v.i(8)) {
                break;
            } else {
                cxlVarL = cxlVarL.l();
            }
        }
        java.lang.Integer numValueOf = cxlVarL != null ? java.lang.Integer.valueOf(cxlVarL.c) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == czzVar.W.x().c) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        defpackage.czz czzVar2 = this.c;
        ednVar.J(czzVar2, numValueOf.intValue());
        int i = cxlVar.c;
        int iD = dahVar.w.d(i);
        if (iD != -1) {
            defpackage.dau dauVar = this.d;
            android.view.View viewB = dauVar != null ? defpackage.dbc.b(dauVar, iD) : null;
            if (viewB != null) {
                ednVar.S(viewB);
            } else {
                ednVar.T(czzVar2, iD);
            }
            czzVar.R(i, ednVar.a, dahVar.o);
        }
        int iD2 = dahVar.x.d(i);
        if (iD2 != -1) {
            defpackage.dau dauVar2 = this.d;
            android.view.View viewB2 = dauVar2 != null ? defpackage.dbc.b(dauVar2, iD2) : null;
            if (viewB2 != null) {
                ednVar.R(viewB2);
            } else {
                ednVar.a.setTraversalAfter(czzVar2, iD2);
            }
            czzVar.R(i, ednVar.a, dahVar.p);
        }
    }
}
