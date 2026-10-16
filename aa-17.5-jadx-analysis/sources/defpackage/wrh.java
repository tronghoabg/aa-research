package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes3.dex */
final class wrh extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public wrh(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
