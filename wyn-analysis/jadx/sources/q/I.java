package q;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class I implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E9.d f43658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f43659b;

    public I(J j8, E9.d dVar) {
        this.f43659b = j8;
        this.f43658a = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f43659b.f43664H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f43658a);
        }
    }
}
