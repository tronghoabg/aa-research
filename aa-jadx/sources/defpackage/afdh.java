package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afdh implements defpackage.afdn {
    private final defpackage.affc a;
    private final defpackage.afdn b;

    public afdh(defpackage.afdn afdnVar, defpackage.affc affcVar) {
        this.a = affcVar;
        this.b = afdnVar instanceof defpackage.afdh ? ((defpackage.afdh) afdnVar).b : afdnVar;
    }

    public final defpackage.afdm a(defpackage.afdm afdmVar) {
        return (defpackage.afdm) this.a.invoke(afdmVar);
    }

    public final boolean b(defpackage.afdn afdnVar) {
        afdnVar.getClass();
        return afdnVar == this || this.b == afdnVar;
    }

    public afdh() {
        this(defpackage.afdl.k, new defpackage.tci(5));
    }
}
