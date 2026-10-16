package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oyg implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.google.android.apps.auto.sdk.ui.PagedScrollBarView a;

    public oyg(com.google.android.apps.auto.sdk.ui.PagedScrollBarView pagedScrollBarView) {
        this.a = pagedScrollBarView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        com.google.android.apps.auto.sdk.ui.PagedScrollBarView pagedScrollBarView = this.a;
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
            pagedScrollBarView.g.setOnFocusChangeListener(new defpackage.wuf(1));
        }
        onAnimationEnd(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        onAnimationStart(animator);
        if (z) {
            com.google.android.apps.auto.sdk.ui.PagedScrollBarView pagedScrollBarView = this.a;
            if (pagedScrollBarView.l) {
                pagedScrollBarView.g.setOnFocusChangeListener(new defpackage.krq(this, 7));
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        com.google.android.apps.auto.sdk.ui.PagedScrollBarView pagedScrollBarView = this.a;
        pagedScrollBarView.f.setVisibility(0);
        android.view.ViewGroup viewGroup = pagedScrollBarView.g;
        viewGroup.setVisibility(0);
        viewGroup.setClickable(false);
        viewGroup.setFocusable(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.apps.auto.sdk.ui.PagedScrollBarView pagedScrollBarView = this.a;
        if (pagedScrollBarView.l) {
            return;
        }
        pagedScrollBarView.g.setFocusable(false);
    }
}
