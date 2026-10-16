package android.support.v7.view.menu;

import android.widget.PopupWindow;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aa implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f749a;

    aa(ab abVar) {
        this.f749a = abVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f749a.c();
    }
}
