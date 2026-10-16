package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435y extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f18566a;

    public C1435y(F f10) {
        this.f18566a = f10;
    }

    @Override // androidx.fragment.app.M
    public final View b(int i5) {
        F f10 = this.f18566a;
        View view = f10.mView;
        if (view != null) {
            return view.findViewById(i5);
        }
        throw new IllegalStateException("Fragment " + f10 + " does not have a view");
    }

    @Override // androidx.fragment.app.M
    public final boolean c() {
        return this.f18566a.mView != null;
    }
}
