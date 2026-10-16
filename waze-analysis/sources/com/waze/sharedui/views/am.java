package com.waze.sharedui.views;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class am implements Animation.AnimationListener {
    am(WazeSwitchView wazeSwitchView) {
        Objects.requireNonNull(wazeSwitchView);
    }

    abstract void a();

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
