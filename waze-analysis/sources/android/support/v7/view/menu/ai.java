package android.support.v7.view.menu;

import android.support.v7.widget.dp;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ai implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f762a;

    ai(ak akVar) {
        this.f762a = akVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ak akVar = this.f762a;
        if (akVar.u()) {
            dp dpVar = akVar.f764a;
            if (dpVar.G()) {
                return;
            }
            View view = akVar.f766c;
            if (view == null || !view.isShown()) {
                akVar.k();
            } else {
                dpVar.s();
            }
        }
    }
}
