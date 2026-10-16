package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vbd {
    public volatile boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public vbd(defpackage.xei xeiVar) {
        this.c = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.b = xeiVar;
    }

    private final boolean f() {
        if (e()) {
            return true;
        }
        defpackage.rrx.c("CAR.INPUT", null, "This InputManager doesn't have a valid backing service connection.");
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    final void a(defpackage.vba vbaVar) {
        this.b.execute(new defpackage.umi(this, vbaVar, 12, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Queue] */
    public final void b(defpackage.rmu rmuVar) {
        if (defpackage.omv.c("CAR.INPUT", 3)) {
            defpackage.rrx.a("CAR.INPUT", null, "startInput");
        }
        if (f()) {
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                throw new java.lang.IllegalStateException("expecting main thread");
            }
            ?? r0 = this.c;
            synchronized (r0) {
                if (r0.isEmpty() || r0.peek() != rmuVar) {
                    r0.offer(rmuVar);
                    android.view.inputmethod.EditorInfo editorInfo = new android.view.inputmethod.EditorInfo();
                    android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = rmuVar.onCreateInputConnection(editorInfo);
                    if (defpackage.omv.c("CAR.INPUT", 3)) {
                        defpackage.rrx.d(3, "CAR.INPUT", null, "startInput/editorInfo.imeOptions=%d", java.lang.Integer.valueOf(editorInfo.imeOptions));
                    }
                    if (inputConnectionOnCreateInputConnection == null) {
                        defpackage.rrx.d(6, "CAR.INPUT", null, "Null input connection received for view of type: %s", rmuVar.getClass().getSimpleName());
                        return;
                    }
                    java.lang.Object obj = this.b;
                    defpackage.rng rngVar = new defpackage.rng(inputConnectionOnCreateInputConnection, rmuVar);
                    try {
                        defpackage.qyu qyuVar = ((defpackage.ror) ((defpackage.xei) obj).a).i;
                        if (qyuVar != null) {
                            qyuVar.z(rngVar, editorInfo);
                        }
                    } catch (android.os.RemoteException unused) {
                        defpackage.rbz.h(((defpackage.ror) ((defpackage.xei) obj).a).d);
                    }
                }
            }
        }
    }

    public final void c() {
        if (defpackage.omv.c("CAR.INPUT", 3)) {
            defpackage.rrx.a("CAR.INPUT", null, "stopInput");
        }
        if (f()) {
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                throw new java.lang.IllegalStateException("expecting main thread");
            }
            java.lang.Object obj = this.b;
            try {
                defpackage.qyu qyuVar = ((defpackage.ror) ((defpackage.xei) obj).a).i;
                if (qyuVar != null) {
                    qyuVar.A();
                }
            } catch (android.os.RemoteException unused) {
                defpackage.rbz.h(((defpackage.ror) ((defpackage.xei) obj).a).d);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    public final boolean d() {
        return e() && !this.c.isEmpty();
    }

    public final boolean e() {
        return !this.a;
    }

    public vbd(defpackage.vbc vbcVar, java.util.concurrent.Executor executor) {
        this.a = false;
        this.c = vbcVar;
        this.b = executor;
    }

    public vbd(java.lang.Object obj, java.util.concurrent.Executor executor) {
        this.b = obj;
        this.c = executor;
        this.a = false;
    }
}
