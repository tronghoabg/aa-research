package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqf extends defpackage.cyc<defpackage.cqi> {
    private final defpackage.cqc a;
    private final defpackage.tu b;

    public cqf(defpackage.cqc cqcVar, defpackage.tu tuVar) {
        this.a = cqcVar;
        this.b = tuVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cqi(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cqi cqiVar = (defpackage.cqi) cgeVar;
        cqiVar.a = this.a;
        cqiVar.h();
        defpackage.tu tuVar = this.b;
        if (tuVar == null) {
            cqiVar.b = new defpackage.tu();
        } else if (!defpackage.afga.f(tuVar, cqiVar.b)) {
            cqiVar.b = tuVar;
        }
        if (cqiVar.A) {
            cqiVar.i();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cqf)) {
            return false;
        }
        defpackage.cqf cqfVar = (defpackage.cqf) obj;
        return defpackage.afga.f(cqfVar.a, this.a) && defpackage.afga.f(cqfVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.tu tuVar = this.b;
        return iHashCode + (tuVar != null ? tuVar.hashCode() : 0);
    }
}
