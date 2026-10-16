package android.support.v7.widget;

import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class au implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd f1088a;

    au(bd bdVar) {
        this.f1088a = bdVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bd bdVar = this.f1088a;
        if (!bdVar.b().u()) {
            bdVar.c();
        }
        ViewTreeObserver viewTreeObserver = bdVar.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
