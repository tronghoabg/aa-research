package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class nw implements android.animation.Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    public final defpackage.mr h;
    final int i;
    final android.animation.ValueAnimator j;
    boolean k;
    float l;
    float m;
    public boolean n = false;
    public boolean o = false;
    public float p;

    public nw(defpackage.mr mrVar, int i, float f, float f2, float f3, float f4) {
        this.i = i;
        this.h = mrVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new defpackage.nv(this, 0));
        valueAnimatorOfFloat.setTarget(mrVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.p = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final void a() {
        this.j.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.p = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.o) {
            this.h.n(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
