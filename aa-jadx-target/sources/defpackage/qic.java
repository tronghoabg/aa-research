package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qic extends defpackage.qus implements defpackage.lhs {
    private static final defpackage.yqm b = defpackage.yqm.c("ADU.AppDecorServicePdr");
    public final java.util.List a = new java.util.ArrayList();
    private final defpackage.qup c;

    public qic(defpackage.qup qupVar) {
        this.c = qupVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhs
    public final /* synthetic */ void a() throws wfo {
        defpackage.wfp.c();
    }

    @Override // defpackage.lhs
    public final synchronized void b() {
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, quw] */
    @Override // defpackage.lhs
    public final synchronized void c() {
        for (defpackage.iko ikoVar : this.a) {
            try {
                ((defpackage.yqj) b.l().ai(7278)).u("notifying client that AppDecorService is ready");
                ikoVar.a.a(this.c);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 7279)).y("failed to notify onStart: %s", e);
            }
        }
        this.a.clear();
    }

    @Override // defpackage.lhs
    public final synchronized void d(boolean z, boolean z2) {
    }

    @Override // defpackage.lhs
    public final synchronized void e() {
    }

    @Override // defpackage.lhs
    public final synchronized boolean g(rcp rcpVar) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, quw] */
    public final synchronized void h(quw quwVar) throws android.os.RemoteException {
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 7276)).y("AppDecorService requested: %s", quwVar);
        quwVar.getClass();
        if (defpackage.ler.c().fY()) {
            quwVar.a(this.c);
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 7277)).u("Session not up yet, saving callback");
        java.util.List list = this.a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((defpackage.iko) it.next()).a.asBinder() == quwVar.asBinder()) {
                throw new java.lang.IllegalStateException("AppDecorServiceReadyCallback is already registered");
            }
        }
        list.add(new defpackage.iko(this, quwVar, 8));
    }

    @Override // defpackage.lhs
    public final void f() {
    }
}
