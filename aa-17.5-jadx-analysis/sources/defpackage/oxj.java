package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;

/* loaded from: classes2.dex */
public final class oxj implements Animator.AnimatorListener {
    public final /* synthetic */ PagedScrollBarView a;

    public oxj(PagedScrollBarView pagedScrollBarView) {
        this.a = pagedScrollBarView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        PagedScrollBarView pagedScrollBarView = this.a;
        if (z) {
            if (!pagedScrollBarView.l) {
                pagedScrollBarView.g.setVisibility(8);
            }
            pagedScrollBarView.o = 1;
        } else {
            if (pagedScrollBarView.l) {
                pagedScrollBarView.g.setClickable(true);
            }
            pagedScrollBarView.j();
            pagedScrollBarView.o = 3;
            pagedScrollBarView.g.setOnFocusChangeListener(new wti(1));
        }
        onAnimationEnd(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        onAnimationStart(animator);
        if (z) {
            PagedScrollBarView pagedScrollBarView = this.a;
            if (pagedScrollBarView.l) {
                pagedScrollBarView.g.setOnFocusChangeListener(new krj(this, 7));
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PagedScrollBarView pagedScrollBarView = this.a;
        pagedScrollBarView.f.setVisibility(0);
        ViewGroup viewGroup = pagedScrollBarView.g;
        viewGroup.setVisibility(0);
        viewGroup.setClickable(false);
        viewGroup.setFocusable(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PagedScrollBarView pagedScrollBarView = this.a;
        if (pagedScrollBarView.l) {
            return;
        }
        pagedScrollBarView.g.setFocusable(false);
    }
}
