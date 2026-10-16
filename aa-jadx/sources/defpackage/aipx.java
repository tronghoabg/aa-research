package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aipx extends defpackage.aipy {
    final /* synthetic */ defpackage.affc val$predicate;
    final /* synthetic */ boolean[] val$result;

    public aipx(defpackage.affc affcVar, boolean[] zArr) {
        this.val$predicate = affcVar;
        this.val$result = zArr;
    }

    @Override // defpackage.aipy, defpackage.aiqa
    public boolean beforeChildren(java.lang.Object obj) {
        if (((java.lang.Boolean) this.val$predicate.invoke(obj)).booleanValue()) {
            this.val$result[0] = true;
        }
        return !this.val$result[0];
    }

    @Override // defpackage.aiqa
    public java.lang.Boolean result() {
        return java.lang.Boolean.valueOf(this.val$result[0]);
    }
}
