package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wsc extends defpackage.wrw {
    private final float f;
    private final float g;

    public wsc(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.f = resources.getDimension(com.google.android.projection.gearhead.R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.g = resources.getDimension(com.google.android.projection.gearhead.R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
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
        animatorSet.setInterpolator(new defpackage.epc());
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
        if (width <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || height <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f2 = this.f / width;
        float f3 = this.g / height;
        android.animation.TimeInterpolator timeInterpolator = defpackage.wlm.a;
        float f4 = ((f2 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) * fA) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        float f5 = (fA * (f3 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
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
                childAt.setScaleY(f7 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? f6 / f7 : 1.0f);
            }
        }
    }

    public final void h(defpackage.ny nyVar) {
        if (super.d(nyVar) == null) {
            return;
        }
        g(nyVar.b);
    }
}
