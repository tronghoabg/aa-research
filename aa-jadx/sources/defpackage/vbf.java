package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vbf implements defpackage.vav {
    private final defpackage.vav a;
    private final java.util.Map b = new java.util.HashMap();

    public vbf(defpackage.vav vavVar) {
        new java.util.WeakHashMap();
        this.a = vavVar;
    }

    private final defpackage.vbb h(defpackage.vbb vbbVar) {
        defpackage.vbe vbeVar = new defpackage.vbe(this, vbbVar, 0);
        synchronized (this) {
            this.b.put(vbbVar, vbeVar);
        }
        return vbeVar;
    }

    @Override // defpackage.vav
    public final int a() {
        throw null;
    }

    @Override // defpackage.vav
    public final defpackage.zhs b() {
        throw null;
    }

    @Override // defpackage.vav
    public final java.lang.Object c() {
        return (com.google.android.apps.gmm.systems.accounts.GmmAccount) this.a.c();
    }

    @Override // defpackage.vav
    public final void d(defpackage.vbb vbbVar, java.util.concurrent.Executor executor) {
        this.a.d(h(vbbVar), executor);
    }

    @Override // defpackage.vav
    public final void e(defpackage.vbb vbbVar, java.util.concurrent.Executor executor) {
        this.a.e(h(vbbVar), executor);
    }

    @Override // defpackage.vav
    public final void f(defpackage.vbb vbbVar) {
        defpackage.vbb vbbVar2;
        synchronized (this) {
            vbbVar2 = (defpackage.vbb) this.b.remove(vbbVar);
        }
        if (vbbVar2 != null) {
            this.a.f(vbbVar2);
        }
    }

    @Override // defpackage.vav
    public final boolean g(defpackage.vbb vbbVar) {
        boolean zContainsKey;
        synchronized (this) {
            zContainsKey = this.b.containsKey(vbbVar);
        }
        return zContainsKey;
    }
}
