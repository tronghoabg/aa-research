package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class az implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1097a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f1098b;

    az(ba baVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f1098b = baVar;
        this.f1097a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f1098b.f1108b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1097a);
        }
    }
}
