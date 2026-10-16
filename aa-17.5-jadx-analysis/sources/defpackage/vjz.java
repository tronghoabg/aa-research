package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
final class vjz extends vjk {
    final /* synthetic */ vka a;

    public vjz(vka vkaVar) {
        this.a = vkaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        vka vkaVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(vkaVar.a, false);
        vkaVar.a();
    }
}
