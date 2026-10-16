package com.waze.view.b;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f44982a;

    public final void a() {
        ValueAnimator valueAnimator = this.f44982a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    protected final void b(long j2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.f44982a = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(j2);
        this.f44982a.setInterpolator(null);
        this.f44982a.addUpdateListener(new a(this));
        this.f44982a.addListener(new b(this));
        this.f44982a.start();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i2) {
        return true;
    }
}
