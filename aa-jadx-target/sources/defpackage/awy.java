package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awy extends defpackage.cyc<defpackage.awf> {
    private final defpackage.izq a;

    public awy(defpackage.izq izqVar) {
        this.a = izqVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.awf(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.awf) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.awy awyVar = obj instanceof defpackage.awy ? (defpackage.awy) obj : null;
        return awyVar != null && this.a == awyVar.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
