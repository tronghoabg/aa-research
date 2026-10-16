package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class exi extends defpackage.exc {
    private final android.window.OnBackInvokedDispatcher a;
    private final int b;
    private final android.window.OnBackInvokedCallback e;
    private boolean f;

    public exi(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.a = onBackInvokedDispatcher;
        this.b = i;
        this.e = android.os.Build.VERSION.SDK_INT == 33 ? new android.window.OnBackInvokedCallback() { // from class: exg
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.a.b();
            }
        } : new exh(this);
    }

    @Override // defpackage.exc
    protected final void c(boolean z) {
        boolean z2 = this.f;
        if (z) {
            if (z2) {
                return;
            }
            ag$.ExternalSyntheticApiModelOutline0.m(this.a, this.b, this.e);
            this.f = true;
            return;
        }
        if (z2) {
            ag$.ExternalSyntheticApiModelOutline0.m(this.a, this.e);
            this.f = false;
        }
    }
}
