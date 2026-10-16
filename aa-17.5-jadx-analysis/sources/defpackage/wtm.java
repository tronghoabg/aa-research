package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final class wtm extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;
    final /* synthetic */ wtu b;

    public wtm(wtu wtuVar, AnimatorSet animatorSet) {
        this.a = animatorSet;
        this.b = wtuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wtu wtuVar = this.b;
        SearchView searchView = wtuVar.a;
        if (!searchView.j()) {
            searchView.d();
        }
        searchView.l(4, true);
        if (wtuVar.n == this.a) {
            wtuVar.n = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wtu wtuVar = this.b;
        wtuVar.c.setVisibility(0);
        wtuVar.a.l(3, true);
    }
}
