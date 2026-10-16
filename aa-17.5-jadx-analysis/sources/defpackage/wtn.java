package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
final class wtn extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;
    final /* synthetic */ wtu b;

    public wtn(wtu wtuVar, AnimatorSet animatorSet) {
        this.a = animatorSet;
        this.b = wtuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wtu wtuVar = this.b;
        wtuVar.c.setVisibility(8);
        SearchView searchView = wtuVar.a;
        if (!searchView.j()) {
            wtuVar.j.clearFocus();
        }
        searchView.l(2, true);
        if (wtuVar.n == this.a) {
            wtuVar.n = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.a.l(1, true);
    }
}
