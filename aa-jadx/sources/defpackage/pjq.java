package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjq {
    public final java.util.concurrent.Executor b;
    private static final defpackage.ypg f = defpackage.ypg.c("com/google/android/apps/gmm/kits/mapcore/gesture/CompositePickHandlerImpl");
    public static final defpackage.kzi d = new defpackage.kzi();
    public final java.util.Map a = new j$.util.concurrent.ConcurrentHashMap();
    public defpackage.aadh c = null;
    public final defpackage.kzi e = d;

    public pjq(java.util.concurrent.Executor executor) {
        this.b = executor;
    }

    public final void a(defpackage.tta ttaVar) {
        this.a.remove(defpackage.pjp.d(ttaVar));
    }

    public final void b(defpackage.tta ttaVar, defpackage.pjs pjsVar) {
        this.a.put(defpackage.pjp.d(ttaVar), pjsVar);
    }
}
