package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aws extends defpackage.cyc<defpackage.awt> {
    private final defpackage.cfy a;

    public aws(defpackage.cfy cfyVar) {
        this.a = cfyVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.awt(this.a, 0);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.awt) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.aws awsVar = obj instanceof defpackage.aws ? (defpackage.aws) obj : null;
        if (awsVar == null) {
            return false;
        }
        return defpackage.afga.f(this.a, awsVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
