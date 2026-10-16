package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wws {
    public int a;
    public boolean b;
    public final java.lang.Object c;

    public wws(int i, defpackage.xei xeiVar) {
        this.c = new java.lang.ref.WeakReference(xeiVar);
        this.a = i;
    }

    final boolean a(defpackage.xei xeiVar) {
        return xeiVar != null && ((java.lang.ref.WeakReference) this.c).get() == xeiVar;
    }

    public wws(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }
}
