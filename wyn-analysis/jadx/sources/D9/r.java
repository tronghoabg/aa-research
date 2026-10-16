package D9;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f2604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2605b;

    public r(s sVar, ViewGroup.LayoutParams layoutParams) {
        this.f2605b = sVar;
        this.f2604a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f2604a;
        layoutParams.height = iIntValue;
        this.f2605b.f2610e.setLayoutParams(layoutParams);
    }
}
