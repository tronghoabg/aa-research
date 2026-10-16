package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.carstream.tech.core.ui.SplashArt;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ q1(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - (fFloatValue * fFloatValue);
                float f2 = (0.5f * f) + 1.0f;
                View view = this.b;
                view.setScaleX(f2);
                view.setScaleY(f2);
                view.setAlpha((1.0f - f) * 0.45f);
                break;
            default:
                g6 g6Var = (g6) this.b;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f3 = (fFloatValue2 % 340.0f) / 170.0f;
                SplashArt splashArt = g6Var.a;
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = g6.d;
                if (f3 > 1.0f) {
                    f3 = 2.0f - f3;
                }
                splashArt.t = accelerateDecelerateInterpolator.getInterpolation(f3) * 3.1f;
                float[] fArr = g6.e;
                float[] fArr2 = g6.f;
                Interpolator[] interpolatorArr = g6.h;
                splashArt.r = g6.a(fFloatValue2, fArr, fArr2, interpolatorArr);
                splashArt.s = g6.a(fFloatValue2, fArr, g6.g, interpolatorArr);
                float[] fArr3 = g6.i;
                float[] fArr4 = g6.j;
                Interpolator[] interpolatorArr2 = g6.l;
                splashArt.u = g6.a(fFloatValue2, fArr3, fArr4, interpolatorArr2);
                splashArt.v = g6.a(fFloatValue2, fArr3, g6.k, interpolatorArr2);
                float[] fArr5 = g6.m;
                float[] fArr6 = g6.n;
                Interpolator[] interpolatorArr3 = g6.p;
                splashArt.w = g6.a(fFloatValue2, fArr5, fArr6, interpolatorArr3);
                splashArt.x = g6.a(fFloatValue2, fArr5, g6.o, interpolatorArr3);
                splashArt.invalidate();
                break;
        }
    }
}
