package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class atl extends defpackage.cyc<defpackage.atm> {
    private final defpackage.cfu a;
    private final boolean b;

    public atl(defpackage.cfu cfuVar, boolean z) {
        this.a = cfuVar;
        this.b = z;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.atm(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.atm atmVar = (defpackage.atm) cgeVar;
        atmVar.a = this.a;
        atmVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.atl atlVar = obj instanceof defpackage.atl ? (defpackage.atl) obj : null;
        return atlVar != null && defpackage.afga.f(this.a, atlVar.a) && this.b == atlVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }
}
