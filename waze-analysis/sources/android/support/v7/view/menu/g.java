package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f790a;

    g(k kVar) {
        this.f790a = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        k kVar = this.f790a;
        ViewTreeObserver viewTreeObserver = kVar.f803e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                kVar.f803e = view.getViewTreeObserver();
            }
            kVar.f803e.removeGlobalOnLayoutListener(kVar.f801c);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
