package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class akp extends defpackage.cyc<defpackage.akq> {
    private final defpackage.asj a;
    private final defpackage.akr b;

    public akp(defpackage.asj asjVar, defpackage.akr akrVar) {
        this.a = asjVar;
        this.b = akrVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.akq(this.b.a(this.a));
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.akq akqVar = (defpackage.akq) cgeVar;
        defpackage.cwn cwnVarA = this.b.a(this.a);
        akqVar.V(akqVar.a);
        akqVar.a = cwnVarA;
        akqVar.W(cwnVarA);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akp)) {
            return false;
        }
        defpackage.akp akpVar = (defpackage.akp) obj;
        return defpackage.afga.f(this.a, akpVar.a) && defpackage.afga.f(this.b, akpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
