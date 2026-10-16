package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class wvk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wvk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            ((BaseTransientBottomBar) this.a).j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 1) {
            ((CollapsingToolbarLayout) this.a).e(((Integer) valueAnimator.getAnimatedValue()).intValue());
            return;
        }
        if (i == 2) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            wvs wvsVar = ((BaseTransientBottomBar) this.a).j;
            wvsVar.setScaleX(fFloatValue);
            wvsVar.setScaleY(fFloatValue);
            return;
        }
        if (i == 3) {
            ((BaseTransientBottomBar) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i == 4) {
            ((BaseTransientBottomBar) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i != 5) {
            ((TextInputLayout) this.a).q.z(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }
}
