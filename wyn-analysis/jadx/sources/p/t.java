package p;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f43105a;

    public t(v vVar) {
        this.f43105a = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f43105a.c();
    }
}
