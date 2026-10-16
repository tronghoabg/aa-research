package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eaz extends defpackage.eax {
    private final android.view.View a;

    public eaz(android.view.View view) {
        super(view);
        this.a = view;
    }

    @Override // defpackage.eax, defpackage.ebj
    public final void a() {
        android.view.View view = this.a;
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.view.WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener = new android.view.WindowInsetsController$OnControllableInsetsChangedListener() { // from class: eay
            public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
        if (!atomicBoolean.get()) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
        windowInsetsController.hide(android.view.WindowInsets.Type.ime());
    }

    @Override // defpackage.eax, defpackage.ebj
    public final void b() {
        android.view.View view = this.a;
        if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(android.view.WindowInsets.Type.ime());
        }
        super.b();
    }
}
