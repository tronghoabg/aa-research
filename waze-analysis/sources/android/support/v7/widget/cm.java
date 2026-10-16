package android.support.v7.widget;

import android.animation.ValueAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cq f1253a;

    cm(cq cqVar) {
        this.f1253a = cqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cq cqVar = this.f1253a;
        int i2 = cqVar.f1269j;
        if (i2 == 1) {
            cqVar.f1268i.cancel();
        } else if (i2 != 2) {
            return;
        }
        cqVar.f1269j = 3;
        ValueAnimator valueAnimator = cqVar.f1268i;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.start();
    }
}
