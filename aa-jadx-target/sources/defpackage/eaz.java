package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eaz extends defpackage.eax {
    private final android.view.View a;

    public eaz(android.view.View view) {
        super(view);
        this.a = view;
    }

    @Override // defpackage.eax, defpackage.ebj
    public final void a() {
        android.view.View view = this.a;
        android.view.WindowInsetsController windowInsetsControllerM = view != null ? bgp$.ExternalSyntheticApiModelOutline0.m(view) : null;
        if (windowInsetsControllerM == null) {
            super.a();
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        eay eayVar = new eay(atomicBoolean);
        bgp$.ExternalSyntheticApiModelOutline0.m(windowInsetsControllerM, eayVar);
        if (!atomicBoolean.get()) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        bgp$.ExternalSyntheticApiModelOutline0.m$1(windowInsetsControllerM, eayVar);
        bgp$.ExternalSyntheticApiModelOutline0.m(windowInsetsControllerM, bgp$.ExternalSyntheticApiModelOutline0.m$1());
    }

    @Override // defpackage.eax, defpackage.ebj
    public final void b() {
        android.view.View view = this.a;
        if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        android.view.WindowInsetsController windowInsetsControllerM = view != null ? bgp$.ExternalSyntheticApiModelOutline0.m(view) : null;
        if (windowInsetsControllerM != null) {
            bgp$.ExternalSyntheticApiModelOutline0.m$1(windowInsetsControllerM, bgp$.ExternalSyntheticApiModelOutline0.m$1());
        }
        super.b();
    }
}
