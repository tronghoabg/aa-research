package android.support.v7.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ab extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f500a;

    ab(ac acVar) {
        this.f500a = acVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        an anVar = this.f500a.f501a;
        anVar.f534h.setVisibility(8);
        PopupWindow popupWindow = anVar.f535i;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (anVar.f534h.getParent() instanceof View) {
            ViewCompat.requestApplyInsets((View) anVar.f534h.getParent());
        }
        anVar.f534h.l();
        anVar.f537k.setListener(null);
        anVar.f537k = null;
        ViewCompat.requestApplyInsets(anVar.f538l);
    }
}
