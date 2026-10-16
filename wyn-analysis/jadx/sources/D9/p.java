package D9;

import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public final class p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f2600e;

    public p(s sVar, float f10, float f11, float f12, float f13) {
        this.f2600e = sVar;
        this.f2596a = f10;
        this.f2597b = f11;
        this.f2598c = f12;
        this.f2599d = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = (valueAnimator.getAnimatedFraction() * this.f2597b) + this.f2596a;
        float animatedFraction2 = (valueAnimator.getAnimatedFraction() * this.f2599d) + this.f2598c;
        s sVar = this.f2600e;
        sVar.c(animatedFraction);
        sVar.f2610e.setAlpha(animatedFraction2);
    }
}
