package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adk extends defpackage.cyc<defpackage.ado> {
    private final defpackage.afd a;
    private final defpackage.cfu b;
    private final defpackage.affg c;

    public adk(defpackage.afd afdVar, defpackage.cfu cfuVar, defpackage.affg affgVar) {
        this.a = afdVar;
        this.b = cfuVar;
        this.c = affgVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ado(this.a, this.b, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ado adoVar = (defpackage.ado) cgeVar;
        adoVar.a = this.a;
        adoVar.c = this.c;
        adoVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adk)) {
            return false;
        }
        defpackage.adk adkVar = (defpackage.adk) obj;
        return defpackage.afga.f(adkVar.a, this.a) && adkVar.c == this.c && defpackage.afga.f(adkVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.affg affgVar = this.c;
        return (iHashCode * 31) + (affgVar != null ? affgVar.hashCode() : 0);
    }
}
