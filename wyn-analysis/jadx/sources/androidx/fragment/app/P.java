package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class P implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f18336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f18337b;

    public P(Q q4, l0 l0Var) {
        this.f18337b = q4;
        this.f18336a = l0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        l0 l0Var = this.f18336a;
        l0Var.k();
        C1426o.j((ViewGroup) l0Var.f18480c.mView.getParent(), this.f18337b.f18338a).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
