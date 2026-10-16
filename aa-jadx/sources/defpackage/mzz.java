package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mzz implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public mzz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.c != 0) {
            return;
        }
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.c != 0) {
            return;
        }
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        if (this.c == 0) {
            animator.getClass();
            return;
        }
        java.lang.Object obj = this.a;
        defpackage.fcu fcuVar = (defpackage.fcu) this.b;
        defpackage.fcv fcvVar = (defpackage.fcv) obj;
        fcvVar.a(1.0f, fcuVar, true);
        fcuVar.e();
        fcuVar.f();
        fcuVar.g();
        if (!fcvVar.d) {
            fcvVar.c += 1.0f;
            return;
        }
        fcvVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        fcuVar.c(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        if (this.c != 0) {
            ((defpackage.fcv) this.a).c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            return;
        }
        animator.getClass();
        java.lang.Object obj = this.a;
        ((android.view.View) obj).setVisibility(0);
        ((android.widget.ImageView) obj).setImageDrawable((android.graphics.drawable.Drawable) this.b);
    }
}
