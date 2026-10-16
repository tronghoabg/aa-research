package com.waze.design_components.button.timer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeButtonTimer extends a {

    /* renamed from: a, reason: collision with root package name */
    private d f23368a;

    /* renamed from: b, reason: collision with root package name */
    private final ValueAnimator f23369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeButtonTimer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        x.e(valueAnimatorOfFloat, "ofFloat(...)");
        this.f23369b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new c(this));
        valueAnimatorOfFloat.addUpdateListener(new b(this, 0));
    }

    public final void c() {
        this.f23368a = null;
        this.f23369b.cancel();
    }

    public final void d(long j2, long j3, d dVar) {
        x.f(dVar, "timerCallback");
        this.f23368a = dVar;
        ValueAnimator valueAnimator = this.f23369b;
        valueAnimator.cancel();
        valueAnimator.setDuration(j2);
        valueAnimator.setCurrentPlayTime(j3);
        valueAnimator.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeButtonTimer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeButtonTimer(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeButtonTimer(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
