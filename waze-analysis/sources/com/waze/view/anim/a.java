package com.waze.view.anim;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f44971a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Animation f44972b;

    a(View view, Animation animation) {
        this.f44971a = view;
        this.f44972b = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f44971a.startAnimation(this.f44972b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
