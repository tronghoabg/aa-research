package android.support.v7.app;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class x extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f635a;

    x(y yVar) {
        this.f635a = yVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        an anVar = this.f635a.f636a;
        anVar.f534h.setAlpha(1.0f);
        anVar.f537k.setListener(null);
        anVar.f537k = null;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        this.f635a.f636a.f534h.setVisibility(0);
    }
}
