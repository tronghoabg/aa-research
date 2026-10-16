package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class twi implements defpackage.tqx {
    private final defpackage.gkc f;
    private defpackage.tro c = null;
    private boolean d = false;
    protected boolean a = false;
    public boolean b = false;
    private final java.util.List e = new java.util.ArrayList();

    public twi(defpackage.gkc gkcVar) {
        this.f = gkcVar;
    }

    @Override // defpackage.tqx
    public synchronized void e() {
        this.c = null;
        this.d = false;
    }

    @Override // defpackage.tqx
    public synchronized void g(defpackage.tro troVar) {
        this.c = troVar;
        this.d = false;
    }

    @Override // defpackage.tqx
    public synchronized void h() {
        this.c = null;
        this.d = true;
    }

    public final synchronized void k() {
        this.e.clear();
    }

    protected final void l(java.lang.Runnable runnable) {
        defpackage.gkc gkcVar = this.f;
        gkcVar.getClass();
        if (defpackage.uve.b()) {
            runnable.run();
        } else {
            gkcVar.m(runnable);
            gkcVar.l();
        }
    }

    public final void m() {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        synchronized (this) {
            this.a = true;
            if (this.b) {
                return;
            }
            java.util.List list = this.e;
            ygrVar.k(list);
            list.clear();
            defpackage.tvk tvkVar = new defpackage.tvk(ygrVar.g(), 2);
            if (this.f != null) {
                l(tvkVar);
            } else {
                tvkVar.run();
            }
        }
    }

    public final void n(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                return;
            }
            s(runnable);
        }
    }

    public abstract void o(defpackage.trb trbVar);

    protected final void p(defpackage.trb trbVar, defpackage.tqx tqxVar) {
        defpackage.tro troVar;
        synchronized (this) {
            troVar = this.c;
        }
        if (troVar != null) {
            int iOrdinal = trbVar.ordinal();
            if (iOrdinal == 0) {
                troVar.b(tqxVar);
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                troVar.p(tqxVar);
            }
        }
    }

    public final synchronized boolean q() {
        return this.d;
    }

    protected final synchronized boolean r() {
        return this.c != null || this.d;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    protected final void s(java.lang.Runnable runnable) {
        boolean z;
        synchronized (this) {
            z = this.a;
            if (!z) {
                this.e.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }
}
