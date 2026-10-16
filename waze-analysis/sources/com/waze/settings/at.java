package com.waze.settings;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class at implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36792b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36793c;

    public /* synthetic */ at(Object obj, Object obj2, int i2) {
        this.f36793c = i2;
        this.f36791a = obj;
        this.f36792b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f36793c == 0) {
            h.g.b.x.f(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            h.g.b.x.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((ba) this.f36791a).F = ((Float) animatedValue).floatValue();
            ((av) this.f36792b).b();
            return;
        }
        h.g.b.x.f(valueAnimator, "valueAnimator");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        h.g.b.x.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue2).intValue();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.f36791a;
        layoutParams.height = iIntValue;
        ((View) this.f36792b).setLayoutParams(layoutParams);
    }
}
