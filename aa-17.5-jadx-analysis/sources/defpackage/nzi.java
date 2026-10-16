package defpackage;

import android.animation.Animator;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.apps.auto.components.ui.text.CountIndicatorTextView;

/* loaded from: classes2.dex */
public final class nzi implements Animator.AnimatorListener {
    final /* synthetic */ RailStatusBarFragment a;
    private final /* synthetic */ int b;

    public nzi(RailStatusBarFragment railStatusBarFragment, int i) {
        this.b = i;
        this.a = railStatusBarFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            animator.getClass();
        } else {
            animator.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CountIndicatorTextView countIndicatorTextView = null;
        if (this.b == 0) {
            animator.getClass();
            this.a.i = null;
            return;
        }
        animator.getClass();
        CountIndicatorTextView countIndicatorTextView2 = this.a.h;
        if (countIndicatorTextView2 == null) {
            affa.d("notificationBadgeCount");
        } else {
            countIndicatorTextView = countIndicatorTextView2;
        }
        countIndicatorTextView.setText("");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.b != 0) {
            animator.getClass();
        } else {
            animator.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.b != 0) {
            animator.getClass();
        } else {
            animator.getClass();
        }
    }
}
