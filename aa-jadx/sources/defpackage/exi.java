package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class exi extends defpackage.exc {
    private final android.window.OnBackInvokedDispatcher a;
    private final int b;
    private final android.window.OnBackInvokedCallback e;
    private boolean f;

    public exi(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.a = onBackInvokedDispatcher;
        this.b = i;
        this.e = android.os.Build.VERSION.SDK_INT == 33 ? new android.window.OnBackInvokedCallback() { // from class: exg
            public final void onBackInvoked() {
                this.a.b();
            }
        } : new defpackage.exh(this);
    }

    @Override // defpackage.exc
    protected final void c(boolean z) {
        boolean z2 = this.f;
        if (z) {
            if (z2) {
                return;
            }
            this.a.registerOnBackInvokedCallback(this.b, this.e);
            this.f = true;
            return;
        }
        if (z2) {
            this.a.unregisterOnBackInvokedCallback(this.e);
            this.f = false;
        }
    }
}
