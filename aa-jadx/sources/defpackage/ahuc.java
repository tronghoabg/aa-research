package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahuc implements defpackage.affc {
    final /* synthetic */ defpackage.agci val$containingDeclaration;

    public ahuc(defpackage.agci agciVar) {
        this.val$containingDeclaration = agciVar;
    }

    @Override // defpackage.affc
    public java.lang.Boolean invoke(defpackage.agbx agbxVar) {
        return java.lang.Boolean.valueOf(agbxVar.getContainingDeclaration() == this.val$containingDeclaration);
    }
}
