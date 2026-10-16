package android.support.v7.widget.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.v7.widget.fe;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class i implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    private float f1004a;

    /* renamed from: d, reason: collision with root package name */
    final float f1005d;

    /* renamed from: e, reason: collision with root package name */
    final float f1006e;

    /* renamed from: f, reason: collision with root package name */
    final float f1007f;

    /* renamed from: g, reason: collision with root package name */
    final float f1008g;

    /* renamed from: h, reason: collision with root package name */
    final fe f1009h;

    /* renamed from: i, reason: collision with root package name */
    final int f1010i;

    /* renamed from: j, reason: collision with root package name */
    final ValueAnimator f1011j;

    /* renamed from: k, reason: collision with root package name */
    boolean f1012k;

    /* renamed from: l, reason: collision with root package name */
    float f1013l;
    float m;
    boolean n = false;
    boolean o = false;

    i(fe feVar, int i2, float f2, float f3, float f4, float f5) {
        this.f1010i = i2;
        this.f1009h = feVar;
        this.f1005d = f2;
        this.f1006e = f3;
        this.f1007f = f4;
        this.f1008g = f5;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1011j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new h(this));
        valueAnimatorOfFloat.setTarget(feVar.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f1004a = 0.0f;
    }

    public final void a() {
        this.f1011j.cancel();
    }

    public final void b(float f2) {
        this.f1004a = f2;
    }

    public final void c() {
        float f2 = this.f1005d;
        float f3 = this.f1007f;
        if (f2 == f3) {
            this.f1013l = this.f1009h.itemView.getTranslationX();
        } else {
            this.f1013l = f2 + (this.f1004a * (f3 - f2));
        }
        float f4 = this.f1006e;
        float f5 = this.f1008g;
        this.m = f4 == f5 ? this.f1009h.itemView.getTranslationY() : f4 + (this.f1004a * (f5 - f4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1004a = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.o) {
            this.f1009h.setIsRecyclable(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
