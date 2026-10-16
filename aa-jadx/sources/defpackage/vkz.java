package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vkz extends defpackage.vkh {
    final /* synthetic */ defpackage.vla a;

    public vkz(defpackage.vla vlaVar) {
        this.a = vlaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (a(animator)) {
            return;
        }
        defpackage.vla vlaVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(vlaVar.g, false);
        vlaVar.a();
    }
}
