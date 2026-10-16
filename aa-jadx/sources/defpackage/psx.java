package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psx implements defpackage.aclt {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public psx(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        return this.b != 0 ? b() : b();
    }

    public final java.util.concurrent.Executor b() {
        int i = this.b;
        defpackage.aclw aclwVar = this.a;
        return i != 0 ? ((defpackage.psr) aclwVar.a()).a(defpackage.psw.GMM_PICKER) : ((defpackage.psr) aclwVar.a()).a(defpackage.psw.LOCATION_FRESHNESS_WAITING_THREADPOOL);
    }
}
