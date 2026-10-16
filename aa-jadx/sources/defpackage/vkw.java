package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vkw extends defpackage.vkh {
    final /* synthetic */ defpackage.vkx a;

    public vkw(defpackage.vkx vkxVar) {
        this.a = vkxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (a(animator)) {
            return;
        }
        defpackage.vkx vkxVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(vkxVar.a, false);
        vkxVar.a();
    }
}
