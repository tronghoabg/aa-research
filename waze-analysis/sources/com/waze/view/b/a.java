package com.waze.view.b;

import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f44980a;

    a(c cVar) {
        Objects.requireNonNull(cVar);
        this.f44980a = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c cVar = this.f44980a;
        cVar.setLevel(iIntValue);
        cVar.invalidateSelf();
    }
}
