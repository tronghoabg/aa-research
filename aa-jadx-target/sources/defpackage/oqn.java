package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oqn extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqn(defpackage.afgq afgqVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = afgqVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [bys, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.b;
        if (i == 0) {
            return new defpackage.oqn((oqo) this.a, afdkVar, 0);
        }
        if (i == 1) {
            return new defpackage.oqn((defpackage.bys) this.a, afdkVar, 1);
        }
        if (i == 2) {
            return new defpackage.oqn((defpackage.tcn) this.a, afdkVar, 2);
        }
        java.lang.Object obj2 = this.a;
        return i != 3 ? new defpackage.oqn((tml) obj2, afdkVar, 4) : new defpackage.oqn((defpackage.afgq) obj2, afdkVar, 3);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [bys, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.b;
        if (i == 0) {
            defpackage.afga.cz(obj);
            ((oqo) this.a).a();
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.afga.cz(obj);
            ?? r2 = this.a;
            defpackage.nji njiVarA = defpackage.nji.a();
            defpackage.yqm yqmVar = defpackage.nif.a;
            njiVarA.k(((java.lang.Boolean) r2.a()).booleanValue());
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.afga.cz(obj);
            ((defpackage.tcn) this.a).u();
            return defpackage.afbk.a;
        }
        if (i != 3) {
            defpackage.afga.cz(obj);
            ((rb) this.a).j();
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        ((defpackage.afgq) this.a).a = false;
        defpackage.bzd.l();
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((defpackage.oqn) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return ((defpackage.oqn) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 2) {
            return ((defpackage.oqn) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 3) {
            return ((defpackage.oqn) b((wi) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.oqn) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqn(defpackage.bys bysVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = bysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqn(oqo oqoVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = oqoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqn(defpackage.tcn tcnVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = tcnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqn(tml tmlVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = tmlVar;
    }
}
