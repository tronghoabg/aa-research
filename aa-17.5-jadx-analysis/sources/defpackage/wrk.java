package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wrk extends wqz {
    private final float f;
    private final float g;
    private final float h;

    public wrk(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void e() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.a;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.d);
        animatorSet.start();
    }

    public final void f(nw nwVar, int i) {
        if (super.d(nwVar) != null) {
            g(nwVar.b, nwVar.c == 0, i);
        }
    }

    public final void g(float f, boolean z, int i) {
        float fA = a(f);
        boolean zH = h(i);
        View view = this.a;
        float width = view.getWidth();
        int height = view.getHeight();
        if (width > BitmapDescriptorFactory.HUE_RED) {
            float f2 = height;
            if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            float f3 = this.f / width;
            float f4 = this.g / width;
            float f5 = this.h / f2;
            if (zH) {
                width = 0.0f;
            }
            boolean z2 = z == zH;
            view.setPivotX(width);
            if (!z2) {
                f4 = -f3;
            }
            TimeInterpolator timeInterpolator = wkn.a;
            float f6 = ((f4 + BitmapDescriptorFactory.HUE_RED) * fA) + BitmapDescriptorFactory.HUE_RED;
            float f7 = (fA * (f5 + BitmapDescriptorFactory.HUE_RED)) + BitmapDescriptorFactory.HUE_RED;
            float f8 = f6 + 1.0f;
            if (Float.isNaN(f8)) {
                return;
            }
            float f9 = 1.0f - f7;
            if (Float.isNaN(f9)) {
                return;
            }
            view.setScaleX(f8);
            view.setScaleY(f9);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(zH ? (r1 - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f10 = z2 ? 1.0f - f6 : 1.0f;
                    float f11 = f9 != BitmapDescriptorFactory.HUE_RED ? (f8 / f9) * f10 : 1.0f;
                    if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f11);
                    }
                }
            }
        }
    }

    public final boolean h(int i) {
        return (Gravity.getAbsoluteGravity(i, this.a.getLayoutDirection()) & 3) == 3;
    }
}
