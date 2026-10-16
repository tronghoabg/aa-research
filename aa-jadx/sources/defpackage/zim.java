package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zim extends defpackage.zhd implements java.util.concurrent.RunnableFuture {
    private volatile defpackage.zhq a;

    public zim(defpackage.zgm zgmVar) {
        this.a = new defpackage.zik(this, zgmVar);
    }

    @Override // defpackage.zga
    protected final void b() {
        defpackage.zhq zhqVar;
        if (q() && (zhqVar = this.a) != null) {
            zhqVar.h();
        }
        this.a = null;
    }

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zhq zhqVar = this.a;
        return zhqVar != null ? defpackage.a.bV(zhqVar, "task=[", "]") : super.eW();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        defpackage.zhq zhqVar = this.a;
        if (zhqVar != null) {
            zhqVar.run();
        }
        this.a = null;
    }

    public zim(java.util.concurrent.Callable callable) {
        this.a = new defpackage.zil(this, callable);
    }
}
