package com.waze.view.popups.b;

import android.view.animation.Animation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f45281a;

    t(u uVar) {
        this.f45281a = uVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        h.g.b.x.f(animation, "animation");
        this.f45281a.f().b(c.f45253a);
    }
}
