package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
final class vkc extends vjk {
    final /* synthetic */ vkd a;

    public vkc(vkd vkdVar) {
        this.a = vkdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        vkd vkdVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(vkdVar.g, false);
        vkdVar.a();
    }
}
