package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aj implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f763a;

    aj(ak akVar) {
        this.f763a = akVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ak akVar = this.f763a;
        ViewTreeObserver viewTreeObserver = akVar.f767d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                akVar.f767d = view.getViewTreeObserver();
            }
            akVar.f767d.removeGlobalOnLayoutListener(akVar.f765b);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
