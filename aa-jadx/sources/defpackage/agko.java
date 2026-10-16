package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agko implements defpackage.aiah {
    public static final defpackage.agko INSTANCE = new defpackage.agko();

    private agko() {
    }

    @Override // defpackage.aiah
    public void reportCannotInferVisibility(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        java.util.Objects.toString(agbxVar);
        throw new java.lang.IllegalStateException("Cannot infer visibility for ".concat(agbxVar.toString()));
    }

    @Override // defpackage.aiah
    public void reportIncompleteHierarchy(defpackage.agca agcaVar, java.util.List<java.lang.String> list) {
        agcaVar.getClass();
        list.getClass();
        throw new java.lang.IllegalStateException("Incomplete hierarchy for class " + agcaVar.getName() + ", unresolved classes " + list);
    }
}
