package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.V;
import n3.C3592d;

/* renamed from: com.moloco.sdk.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1880b implements InterfaceC1457v, n3.f {

    /* renamed from: a, reason: collision with root package name */
    public final C1459x f28489a = new C1459x(this);

    /* renamed from: b, reason: collision with root package name */
    public final n3.e f28490b = new n3.e(this);

    public static final void a(C1880b c1880b, FrameLayout frameLayout) {
        c1880b.getClass();
        View rootView = frameLayout.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (tg.b.y(rootView) == null) {
            tg.b.O(rootView, c1880b);
            try {
                c1880b.f28490b.b(null);
            } catch (Throwable th) {
                Fe.e.z(th);
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (V.e(rootView) == null) {
            V.h(rootView, c1880b);
            EnumC1449m enumC1449m = EnumC1449m.ON_CREATE;
            C1459x c1459x = c1880b.f28489a;
            c1459x.f(enumC1449m);
            c1459x.f(EnumC1449m.ON_START);
            c1459x.f(EnumC1449m.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        return this.f28489a;
    }

    @Override // n3.f
    public final C3592d getSavedStateRegistry() {
        return this.f28490b.f40911b;
    }
}
