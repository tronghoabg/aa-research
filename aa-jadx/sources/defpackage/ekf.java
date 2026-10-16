package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ekf implements defpackage.ekk {
    private final defpackage.ekk[] a;

    public ekf(defpackage.ekk... ekkVarArr) {
        this.a = ekkVarArr;
    }

    @Override // defpackage.ekk
    public final defpackage.ekj a(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            defpackage.ekk ekkVar = this.a[i];
            if (ekkVar.b(cls)) {
                return ekkVar.a(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // defpackage.ekk
    public final boolean b(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
