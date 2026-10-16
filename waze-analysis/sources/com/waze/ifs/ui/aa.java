package com.waze.ifs.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f24487a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24488b;

    aa(EditBoxFadeBg editBoxFadeBg, int i2) {
        this.f24488b = i2;
        Objects.requireNonNull(editBoxFadeBg);
        this.f24487a = editBoxFadeBg;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f24488b != 0) {
            ((EditBoxFadeBg) this.f24487a).getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else {
            ViewCompat.setElevation(((ab) this.f24487a).f24489a, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    aa(ab abVar, int i2) {
        this.f24488b = i2;
        Objects.requireNonNull(abVar);
        this.f24487a = abVar;
    }
}
