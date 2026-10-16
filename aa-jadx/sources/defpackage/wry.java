package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wry {
    private android.window.OnBackInvokedCallback a;

    public android.window.OnBackInvokedCallback a(defpackage.wrx wrxVar) {
        wrxVar.getClass();
        return new defpackage.nh(wrxVar, 5);
    }

    public void b(defpackage.wrx wrxVar, android.view.View view, boolean z) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            android.window.OnBackInvokedCallback onBackInvokedCallbackA = a(wrxVar);
            this.a = onBackInvokedCallbackA;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallbackA);
        }
    }

    public void c(android.view.View view) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }

    final boolean d() {
        return this.a != null;
    }
}
