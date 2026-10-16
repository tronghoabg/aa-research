package com.waze.design_components.button.timer;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import com.airbnb.lottie.s;
import com.waze.main_screen.g.f;
import com.waze.menus.SideMenuSearchBar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23372a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23373b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f23373b = i2;
        this.f23372a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23373b) {
            case 0:
                x.f(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                x.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((a) this.f23372a).a(((Float) animatedValue).floatValue());
                break;
            case 1:
                s.U((s) this.f23372a);
                break;
            case 2:
                float animatedFraction = valueAnimator.getAnimatedFraction() * 0.100000024f;
                f fVar = (f) this.f23372a;
                float f2 = 1.0f - animatedFraction;
                fVar.setScaleX(f2);
                fVar.setScaleY(f2);
                fVar.invalidate();
                break;
            case 3:
                SideMenuSearchBar.d((SideMenuSearchBar) this.f23372a, valueAnimator);
                break;
            case 4:
                ((com.waze.view.c.a) this.f23372a).f45027e.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Window window = (Window) this.f23372a;
                window.setStatusBarColor(iIntValue);
                window.getDecorView().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                ((View) this.f23372a).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) this.f23372a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
