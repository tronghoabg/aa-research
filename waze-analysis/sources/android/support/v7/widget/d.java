package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f1307a;

    d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1307a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1307a;
        actionBarOverlayLayout.f884d = null;
        actionBarOverlayLayout.f883c = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1307a;
        actionBarOverlayLayout.f884d = null;
        actionBarOverlayLayout.f883c = false;
    }
}
