package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nh implements android.window.OnBackInvokedCallback {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nh(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, wrx] */
    public final void onBackInvoked() {
        int i = this.b;
        if (i == 0) {
            this.a.run();
            return;
        }
        if (i == 1) {
            ((defpackage.ff) this.a).L();
            return;
        }
        if (i == 2) {
            ?? r5 = this.a;
            if (r5 != 0) {
                r5.invoke();
                return;
            }
            return;
        }
        if (i == 3) {
            this.a.run();
            return;
        }
        if (i != 4) {
            this.a.F();
            return;
        }
        defpackage.rrx.a("GH.ProjectionWindowCB", null, "onBackInvoked: dispatching back key event");
        android.view.KeyEvent keyEvent = new android.view.KeyEvent(0, 4);
        defpackage.rca rcaVar = (defpackage.rca) this.a;
        rcaVar.dispatchKeyEvent(keyEvent);
        rcaVar.dispatchKeyEvent(new android.view.KeyEvent(1, 4));
    }

    public nh(defpackage.rca rcaVar, int i) {
        this.b = i;
        this.a = rcaVar;
    }
}
