package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wsh extends defpackage.wrw {
    private final float f;
    private final float g;
    private final float h;

    public wsh(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.f = resources.getDimension(com.google.android.projection.gearhead.R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.g = resources.getDimension(com.google.android.projection.gearhead.R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.h = resources.getDimension(com.google.android.projection.gearhead.R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void e() {
        if (super.b() == null) {
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.a;
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.d);
        animatorSet.start();
    }

    public final void f(defpackage.ny nyVar, int i) {
        if (super.d(nyVar) != null) {
            g(nyVar.b, nyVar.c == 0, i);
        }
    }

    public final void g(float f, boolean z, int i) {
        float fA = a(f);
        boolean zH = h(i);
        android.view.View view = this.a;
        int width = view.getWidth();
        float f2 = width;
        int height = view.getHeight();
        if (f2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            float f3 = height;
            if (f3 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            float f4 = this.f / f2;
            float f5 = this.g / f2;
            float f6 = this.h / f3;
            if (zH) {
                f2 = 0.0f;
            }
            boolean z2 = z == zH;
            view.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            android.animation.TimeInterpolator timeInterpolator = defpackage.wlm.a;
            float f7 = ((f5 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) * fA) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            float f8 = (fA * (f6 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            float f9 = f7 + 1.0f;
            if (java.lang.Float.isNaN(f9)) {
                return;
            }
            float f10 = 1.0f - f8;
            if (java.lang.Float.isNaN(f10)) {
                return;
            }
            view.setScaleX(f9);
            view.setScaleY(f10);
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    android.view.View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(zH ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f11 = z2 ? 1.0f - f7 : 1.0f;
                    float f12 = f10 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? (f9 / f10) * f11 : 1.0f;
                    if (!java.lang.Float.isNaN(f11) && !java.lang.Float.isNaN(f12)) {
                        childAt.setScaleX(f11);
                        childAt.setScaleY(f12);
                    }
                }
            }
        }
    }

    public final boolean h(int i) {
        return (android.view.Gravity.getAbsoluteGravity(i, this.a.getLayoutDirection()) & 3) == 3;
    }
}
