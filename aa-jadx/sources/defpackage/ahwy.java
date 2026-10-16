package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahwy extends defpackage.aipy {
    final /* synthetic */ defpackage.affc<defpackage.agbx, java.lang.Boolean> $predicate;
    final /* synthetic */ defpackage.afgv<defpackage.agbx> $result;

    /* JADX WARN: Multi-variable type inference failed */
    public ahwy(defpackage.afgv<defpackage.agbx> afgvVar, defpackage.affc<? super defpackage.agbx, java.lang.Boolean> affcVar) {
        this.$result = afgvVar;
        this.$predicate = affcVar;
    }

    @Override // defpackage.aipy, defpackage.aiqa
    public void afterChildren(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        if (this.$result.a == null && this.$predicate.invoke(agbxVar).booleanValue()) {
            this.$result.a = agbxVar;
        }
    }

    @Override // defpackage.aipy, defpackage.aiqa
    public boolean beforeChildren(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        return this.$result.a == null;
    }

    @Override // defpackage.aiqa
    public defpackage.agbx result() {
        return (defpackage.agbx) this.$result.a;
    }
}
