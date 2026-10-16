package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class wqe implements wqf {
    private final /* synthetic */ int a;

    @Override // defpackage.wqf
    public final void a(ValueAnimator valueAnimator, View view) {
        int i = this.a;
        if (i == 0) {
            int i2 = wqg.a;
            Float f = (Float) valueAnimator.getAnimatedValue();
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
            return;
        }
        if (i == 1) {
            int i3 = wqg.a;
            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i != 2) {
            int i4 = wqg.a;
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            int i5 = wqg.a;
            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
