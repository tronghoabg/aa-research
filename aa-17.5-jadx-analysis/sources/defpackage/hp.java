package defpackage;

import android.widget.PopupWindow;

/* loaded from: classes2.dex */
final class hp implements PopupWindow.OnDismissListener {
    final /* synthetic */ hq a;

    public hp(hq hqVar) {
        this.a = hqVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
