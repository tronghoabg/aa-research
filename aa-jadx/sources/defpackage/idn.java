package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class idn implements defpackage.ido {
    public final java.util.Set a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.ido
    public final void a(android.app.Activity activity) {
        if (!this.b && this.a.add(activity)) {
            android.view.View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new defpackage.idm(this, decorView));
        }
    }
}
