package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429s extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f18532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1430t f18533b;

    public C1429s(DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t, M m10) {
        this.f18533b = dialogInterfaceOnCancelListenerC1430t;
        this.f18532a = m10;
    }

    @Override // androidx.fragment.app.M
    public final View b(int i5) {
        M m10 = this.f18532a;
        if (m10.c()) {
            return m10.b(i5);
        }
        Dialog dialog = this.f18533b.f18544j;
        if (dialog != null) {
            return dialog.findViewById(i5);
        }
        return null;
    }

    @Override // androidx.fragment.app.M
    public final boolean c() {
        return this.f18532a.c() || this.f18533b.f18547n;
    }
}
