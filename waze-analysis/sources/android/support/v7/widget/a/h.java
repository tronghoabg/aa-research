package android.support.v7.widget.a;

import android.animation.ValueAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f1003a;

    h(i iVar) {
        this.f1003a = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1003a.b(valueAnimator.getAnimatedFraction());
    }
}
