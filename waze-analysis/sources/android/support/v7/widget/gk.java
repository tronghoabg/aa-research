package android.support.v7.widget;

import android.view.View;
import android.view.Window;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gk implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final android.support.v7.view.menu.a f1559a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gm f1560b;

    gk(gm gmVar) {
        this.f1560b = gmVar;
        this.f1559a = new android.support.v7.view.menu.a(gmVar.f1564a.getContext(), gmVar.f1565b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gm gmVar = this.f1560b;
        Window.Callback callback = gmVar.f1566c;
        if (callback == null || !gmVar.f1567d) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1559a);
    }
}
