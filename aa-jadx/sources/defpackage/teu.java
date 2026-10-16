package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class teu implements defpackage.zhh {
    private final defpackage.tet a;

    public teu(defpackage.tet tetVar) {
        this.a = tetVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        th.getClass();
        if (!(th instanceof java.util.concurrent.CancellationException)) {
            throw new java.lang.IllegalStateException("Unexpected exception while evaluating future", th);
        }
    }

    @Override // defpackage.zhh
    public final void b(java.lang.Object obj) {
        this.a.a(obj);
    }
}
