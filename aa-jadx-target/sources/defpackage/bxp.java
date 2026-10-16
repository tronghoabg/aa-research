package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxp extends defpackage.afee implements defpackage.affg {
    /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxp(defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.bxp bxpVar = new defpackage.bxp(afdkVar, 0);
            bxpVar.a = obj;
            return bxpVar;
        }
        if (i != 1) {
            defpackage.bxp bxpVar2 = new defpackage.bxp(afdkVar, 2, (char[]) null);
            bxpVar2.a = obj;
            return bxpVar2;
        }
        defpackage.bxp bxpVar3 = new defpackage.bxp(afdkVar, 1, (byte[]) null);
        bxpVar3.a = obj;
        return bxpVar3;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.b;
        if (i == 0) {
            defpackage.afga.cz(obj);
            return java.lang.Boolean.valueOf(((defpackage.bxo) this.a) == defpackage.bxo.a);
        }
        if (i == 1) {
            defpackage.afga.cz(obj);
            return java.lang.Boolean.valueOf(((defpackage.bxo) this.a).compareTo(defpackage.bxo.e) > 0);
        }
        defpackage.ehp ehpVar = (defpackage.ehp) this.a;
        defpackage.afga.cz(obj);
        return java.lang.Boolean.valueOf(!(ehpVar instanceof defpackage.egv));
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((defpackage.bxp) b((defpackage.bxo) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            return ((defpackage.bxp) b((defpackage.ehp) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bxp) b((defpackage.bxo) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxp(defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxp(defpackage.afdk afdkVar, int i, char[] cArr) {
        super(2, afdkVar);
        this.b = i;
    }
}
