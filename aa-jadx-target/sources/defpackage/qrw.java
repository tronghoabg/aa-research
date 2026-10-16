package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qrw implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public qrw(defpackage.qsa qsaVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = qsaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qwq] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, qwq] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        int i = this.c;
        if (i == 0) {
            defpackage.ypu ypuVarAi = defpackage.qsa.a.l().ai(7704);
            ?? r1 = this.a;
            ypuVarAi.y("doBinderTask on main thread. task=%s", r1);
            defpackage.qsa qsaVar = (defpackage.qsa) this.b;
            qsaVar.j();
            qsaVar.r.c();
            if (qsaVar.g == null) {
                throw new java.lang.IllegalStateException("CarNotConnected");
            }
            if (qsaVar.i) {
                throw new java.lang.IllegalStateException("CarNotConnected");
            }
            return (java.lang.Boolean) r1.call();
        }
        if (i != 1) {
            return java.lang.Boolean.valueOf(((rng) this.a).a.sendKeyEvent((android.view.KeyEvent) this.b));
        }
        defpackage.ypu ypuVarAi2 = defpackage.qsa.a.l().ai(7701);
        ?? r2 = this.a;
        ypuVarAi2.y("registerClient on main thread. client=%s", r2.asBinder());
        java.lang.Object obj = this.b;
        defpackage.qsa qsaVar2 = (defpackage.qsa) obj;
        qsaVar2.j();
        java.util.List list = qsaVar2.f;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((defpackage.qrz) it.next()).a.asBinder() == r2.asBinder()) {
                defpackage.qsa.a.l().ai(7703).y("Client %s already registered", this.a.asBinder());
                return java.lang.Boolean.FALSE;
            }
        }
        try {
            list.add(new defpackage.qrz((defpackage.qsa) obj, r2));
            return java.lang.Boolean.TRUE;
        } catch (android.os.RemoteException unused) {
            defpackage.qsa.a.g().ai(7702).u("Client already dead?");
            return java.lang.Boolean.FALSE;
        }
    }

    public qrw(rng rngVar, android.view.KeyEvent keyEvent, int i) {
        this.c = i;
        this.b = keyEvent;
        this.a = rngVar;
    }
}
