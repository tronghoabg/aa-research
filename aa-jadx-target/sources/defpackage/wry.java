package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wry {
    private android.window.OnBackInvokedCallback a;

    public android.window.OnBackInvokedCallback a(wrx wrxVar) {
        wrxVar.getClass();
        return new nh(wrxVar, 5);
    }

    public void b(wrx wrxVar, android.view.View view, boolean z) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM;
        if (this.a == null && (onBackInvokedDispatcherM = ag$.ExternalSyntheticApiModelOutline0.m(view)) != null) {
            android.window.OnBackInvokedCallback onBackInvokedCallbackA = a(wrxVar);
            this.a = onBackInvokedCallbackA;
            ag$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, 0, onBackInvokedCallbackA);
        }
    }

    public void c(android.view.View view) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM;
        if (this.a == null || (onBackInvokedDispatcherM = ag$.ExternalSyntheticApiModelOutline0.m(view)) == null) {
            return;
        }
        ag$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, this.a);
        this.a = null;
    }

    final boolean d() {
        return this.a != null;
    }
}
