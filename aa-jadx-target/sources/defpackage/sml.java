package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sml extends defpackage.smh {
    private final defpackage.snz a;
    private final defpackage.lhe b;

    public sml(int i, defpackage.snz snzVar, defpackage.lhe lheVar) {
        super(i);
        this.b = lheVar;
        this.a = snzVar;
        if (i == 2 && snzVar.b) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.smh
    public final int a(defpackage.snb snbVar) {
        return this.a.c;
    }

    @Override // defpackage.smh
    public final void b(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        ((defpackage.swx) this.b.a).i(executor, new ljk(runnable, 3));
    }

    @Override // defpackage.smh
    public final boolean c(defpackage.snb snbVar) {
        return this.a.b;
    }

    @Override // defpackage.smh
    public final com.google.android.gms.common.Feature[] d(defpackage.snb snbVar) {
        return this.a.a;
    }

    @Override // defpackage.smn
    public final void f(com.google.android.gms.common.api.Status status) {
        this.b.e(defpackage.sqs.aC(status));
    }

    @Override // defpackage.smn
    public final void g(java.lang.Exception exc) {
        this.b.e(exc);
    }

    @Override // defpackage.smn
    public final void h(defpackage.snb snbVar) throws android.os.DeadObjectException {
        try {
            defpackage.snz snzVar = this.a;
            snzVar.d.a.a(snbVar.b, this.b);
        } catch (android.os.DeadObjectException e) {
            throw e;
        } catch (android.os.RemoteException e2) {
            f(defpackage.smn.j(e2));
        } catch (java.lang.RuntimeException e3) {
            g(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.smn
    public final void i(defpackage.rkq rkqVar, boolean z) {
        ?? r0 = rkqVar.b;
        defpackage.lhe lheVar = this.b;
        r0.put(lheVar, java.lang.Boolean.valueOf(z));
        ((defpackage.swx) lheVar.a).m(new defpackage.smy(rkqVar, lheVar));
    }
}
