package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jr implements android.widget.PopupWindow.OnDismissListener {
    final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener a;
    final /* synthetic */ defpackage.js b;

    public jr(defpackage.js jsVar, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = jsVar;
        this.a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
