package com.waze.sharedui.views;

import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ValueAnimator f39273a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OvalButton f39274b;

    s(OvalButton ovalButton, ValueAnimator valueAnimator) {
        this.f39273a = valueAnimator;
        Objects.requireNonNull(ovalButton);
        this.f39274b = ovalButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OvalButton ovalButton = this.f39274b;
        if (ovalButton.u > 0) {
            if (ovalButton.F) {
                this.f39273a.cancel();
                ovalButton.performClick();
            } else if (ovalButton.I != null) {
                com.waze.main_screen.bottom_bars.scrollable_eta.d.d((com.waze.main_screen.bottom_bars.scrollable_eta.d) ovalButton.I.f10212a);
            }
        }
    }
}
