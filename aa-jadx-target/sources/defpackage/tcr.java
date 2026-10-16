package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class tcr implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tcr(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            ((defpackage.eqp) this.a).m(obj);
            return defpackage.afbk.a;
        }
        if (i != 1) {
            obj.getClass();
            return this.a.invoke();
        }
        defpackage.tdb tdbVar = new defpackage.tdb(obj);
        defpackage.tcm tcmVar = (defpackage.tcm) this.a;
        tcmVar.i = tdbVar;
        tcmVar.a();
        return defpackage.afbk.a;
    }
}
