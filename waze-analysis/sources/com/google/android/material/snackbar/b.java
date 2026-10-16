package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f6745a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6746b;

    b(o oVar, int i2, byte[] bArr) {
        this.f6746b = i2;
        Objects.requireNonNull(oVar);
        this.f6745a = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f6746b;
        if (i2 == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            n nVar = this.f6745a.f6777b;
            nVar.setScaleX(fFloatValue);
            nVar.setScaleY(fFloatValue);
            return;
        }
        if (i2 == 1) {
            this.f6745a.f6777b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i2 != 2) {
            this.f6745a.f6777b.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else {
            this.f6745a.f6777b.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    b(o oVar, int i2) {
        this.f6746b = i2;
        Objects.requireNonNull(oVar);
        this.f6745a = oVar;
    }

    b(o oVar, int i2, char[] cArr) {
        this.f6746b = i2;
        Objects.requireNonNull(oVar);
        this.f6745a = oVar;
    }

    b(o oVar, int i2, short[] sArr) {
        this.f6746b = i2;
        Objects.requireNonNull(oVar);
        this.f6745a = oVar;
    }
}
