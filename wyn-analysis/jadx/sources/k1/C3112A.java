package k1;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: k1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3112A extends C3137y {

    /* renamed from: b, reason: collision with root package name */
    public View f38763b;

    /* JADX WARN: Type inference failed for: r4v0, types: [k1.z] */
    @Override // k1.C3137y
    public final void a() {
        View view = this.f38763b;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: k1.z
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i5) {
                atomicBoolean.set((i5 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r42);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r42);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }
}
