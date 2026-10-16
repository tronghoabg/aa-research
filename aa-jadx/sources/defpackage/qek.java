package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qek implements defpackage.zhh {
    private final defpackage.qed a;
    private final defpackage.qeo b;

    public qek(defpackage.qed qedVar, defpackage.qeo qeoVar) {
        qedVar.getClass();
        this.a = qedVar;
        this.b = qeoVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        this.b.b(this.a);
    }

    @Override // defpackage.zhh
    public final void b(java.lang.Object obj) {
        defpackage.qeo qeoVar = this.b;
        java.lang.Object obj2 = qeoVar.a;
        defpackage.qed qedVar = this.a;
        synchronized (obj2) {
            if (qeoVar.b) {
                return;
            }
            java.util.Map map = qeoVar.c;
            if (!map.containsKey(qedVar) && !qeoVar.d.contains(qedVar)) {
                map.put(qedVar, obj);
                qeoVar.a();
            }
        }
    }
}
