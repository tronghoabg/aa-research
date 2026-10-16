package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wsc extends defpackage.wrw {
    private final float f;
    private final float g;

    public wsc(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.f = resources.getDimension(2131166892);
        this.g = resources.getDimension(2131166893);
    }

    public final android.animation.Animator e() {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.a;
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new epc());
        return animatorSet;
    }

    public final void f() {
        if (super.b() == null) {
            return;
        }
        android.animation.Animator animatorE = e();
        animatorE.setDuration(this.d);
        animatorE.start();
    }

    public final void g(float f) {
        float fA = a(f);
        android.view.View view = this.a;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.f / width;
        float f3 = this.g / height;
        android.animation.TimeInterpolator timeInterpolator = wlm.a;
        float f4 = ((f2 + 0.0f) * fA) + 0.0f;
        float f5 = (fA * (f3 + 0.0f)) + 0.0f;
        float f6 = 1.0f - f4;
        if (java.lang.Float.isNaN(f6)) {
            return;
        }
        float f7 = 1.0f - f5;
        if (java.lang.Float.isNaN(f7)) {
            return;
        }
        view.setScaleX(f6);
        view.setPivotY(height);
        view.setScaleY(f7);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(f7 != 0.0f ? f6 / f7 : 1.0f);
            }
        }
    }

    public final void h(ny nyVar) {
        if (super.d(nyVar) == null) {
            return;
        }
        g(nyVar.b);
    }
}
