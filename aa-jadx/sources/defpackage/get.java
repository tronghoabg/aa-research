package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class get implements defpackage.gdu {
    public final java.util.List a = new java.util.ArrayList();
    private final defpackage.gdu b;

    public get(defpackage.gdu gduVar) {
        this.b = gduVar;
    }

    @Override // defpackage.gdu
    public final boolean a() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((defpackage.ges) it.next()).a()) {
                return true;
            }
        }
        this.b.a();
        return true;
    }
}
