package android.support.v7.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class z extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f637a;

    z(an anVar) {
        this.f637a = anVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        an anVar = this.f637a;
        anVar.f534h.setAlpha(1.0f);
        anVar.f537k.setListener(null);
        anVar.f537k = null;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        an anVar = this.f637a;
        anVar.f534h.setVisibility(0);
        if (anVar.f534h.getParent() instanceof View) {
            ViewCompat.requestApplyInsets((View) anVar.f534h.getParent());
        }
    }
}
