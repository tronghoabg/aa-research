package android.support.v7.app;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aw extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f557a;

    aw(az azVar) {
        this.f557a = azVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        az azVar = this.f557a;
        azVar.f574k = null;
        azVar.f566c.requestLayout();
    }
}
