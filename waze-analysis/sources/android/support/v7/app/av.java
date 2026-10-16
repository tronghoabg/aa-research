package android.support.v7.app;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class av extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f556a;

    av(az azVar) {
        this.f556a = azVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        View view2;
        az azVar = this.f556a;
        if (azVar.f572i && (view2 = azVar.f568e) != null) {
            view2.setTranslationY(0.0f);
            azVar.f566c.setTranslationY(0.0f);
        }
        azVar.f566c.setVisibility(8);
        azVar.f566c.a(false);
        azVar.f574k = null;
        android.support.v7.view.a aVar = azVar.f571h;
        if (aVar != null) {
            aVar.a(azVar.f570g);
            azVar.f570g = null;
            azVar.f571h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = azVar.f565b;
        if (actionBarOverlayLayout != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }
}
