package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class txs implements android.view.View.OnKeyListener {
    private final java.util.Map a = new java.util.HashMap();

    public txs() {
        a(defpackage.txr.a, 19);
        a(defpackage.txr.b, 20);
        a(defpackage.txr.d, 22);
        a(defpackage.txr.c, 21);
        a(defpackage.txr.e, 157, 70, 81);
        a(defpackage.txr.f, 156, 69);
    }

    private final void a(defpackage.txr txrVar, int... iArr) {
        for (int i : iArr) {
            this.a.put(java.lang.Integer.valueOf(i), txrVar);
        }
    }

    @Override // android.view.View.OnKeyListener
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        return false;
    }
}
