package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awz extends defpackage.cyc<defpackage.awg> {
    private final defpackage.csf a;

    public awz(defpackage.csf csfVar) {
        this.a = csfVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.awg(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.awg) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.awz awzVar = obj instanceof defpackage.awz ? (defpackage.awz) obj : null;
        if (awzVar == null) {
            return false;
        }
        return defpackage.afga.f(this.a, awzVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
