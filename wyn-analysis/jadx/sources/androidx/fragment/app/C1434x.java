package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1434x extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f18563a;

    public C1434x(F f10) {
        this.f18563a = f10;
    }

    @Override // androidx.fragment.app.D
    public final void a() {
        F f10 = this.f18563a;
        f10.mSavedStateRegistryController.a();
        androidx.lifecycle.V.d(f10);
        Bundle bundle = f10.mSavedFragmentState;
        f10.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
