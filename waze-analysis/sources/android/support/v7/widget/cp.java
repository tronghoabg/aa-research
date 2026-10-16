package android.support.v7.widget;

import android.animation.ValueAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cp implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cq f1257a;

    cp(cq cqVar) {
        this.f1257a = cqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
        cq cqVar = this.f1257a;
        int i2 = (int) fFloatValue;
        cqVar.f1260a.setAlpha(i2);
        cqVar.f1261b.setAlpha(i2);
        cqVar.b();
    }
}
