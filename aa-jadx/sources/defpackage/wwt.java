package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wwt {
    private static defpackage.wwt e;
    public final java.lang.Object a = new java.lang.Object();
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.wwr(this));
    public defpackage.wws c;
    public defpackage.wws d;

    private wwt() {
    }

    public static defpackage.wwt a() {
        defpackage.wwt wwtVar = e;
        if (wwtVar != null) {
            return wwtVar;
        }
        defpackage.wwt wwtVar2 = new defpackage.wwt();
        e = wwtVar2;
        return wwtVar2;
    }

    public final void b(defpackage.wws wwsVar) {
        int i = wwsVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        android.os.Handler handler = this.b;
        handler.removeCallbacksAndMessages(wwsVar);
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 0, wwsVar), i);
    }

    public final void c() {
        defpackage.wws wwsVar = this.d;
        if (wwsVar != null) {
            this.c = wwsVar;
            this.d = null;
            defpackage.xei xeiVar = (defpackage.xei) ((java.lang.ref.WeakReference) wwsVar.c).get();
            if (xeiVar == null) {
                this.c = null;
                return;
            }
            java.lang.Object obj = xeiVar.a;
            android.os.Handler handler = com.google.android.material.snackbar.BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final boolean d(defpackage.wws wwsVar, int i) {
        defpackage.xei xeiVar = (defpackage.xei) ((java.lang.ref.WeakReference) wwsVar.c).get();
        if (xeiVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(wwsVar);
        java.lang.Object obj = xeiVar.a;
        android.os.Handler handler = com.google.android.material.snackbar.BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(defpackage.xei xeiVar) {
        synchronized (this.a) {
            if (g(xeiVar)) {
                defpackage.wws wwsVar = this.c;
                if (!wwsVar.b) {
                    wwsVar.b = true;
                    this.b.removeCallbacksAndMessages(wwsVar);
                }
            }
        }
    }

    public final void f(defpackage.xei xeiVar) {
        synchronized (this.a) {
            if (g(xeiVar)) {
                defpackage.wws wwsVar = this.c;
                if (wwsVar.b) {
                    wwsVar.b = false;
                    b(wwsVar);
                }
            }
        }
    }

    public final boolean g(defpackage.xei xeiVar) {
        defpackage.wws wwsVar = this.c;
        return wwsVar != null && wwsVar.a(xeiVar);
    }

    public final boolean h(defpackage.xei xeiVar) {
        defpackage.wws wwsVar = this.d;
        return wwsVar != null && wwsVar.a(xeiVar);
    }
}
