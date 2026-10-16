package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class emf {
    private static final java.lang.ThreadLocal i = new java.lang.ThreadLocal();
    public defpackage.eme f;
    public final defpackage.se g;
    public final defpackage.aba a = new defpackage.aba(0);
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final defpackage.ajnd h = new defpackage.ajnd(this, null);
    public final java.lang.Runnable c = new defpackage.eaw(this, 7);
    public boolean d = false;
    public float e = 1.0f;

    public emf(defpackage.se seVar) {
        this.g = seVar;
    }

    static defpackage.emf a() {
        java.lang.ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new defpackage.emf(new defpackage.se((short[]) null)));
        }
        return (defpackage.emf) threadLocal.get();
    }

    final boolean b() {
        return java.lang.Thread.currentThread() == ((android.os.Looper) this.g.b).getThread();
    }
}
