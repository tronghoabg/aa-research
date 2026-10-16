package com.waze.view.popups.b;

import android.view.animation.Animation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f45287a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f45288b;

    x(z zVar, h hVar) {
        this.f45287a = zVar;
        this.f45288b = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f45287a.a().b(this.f45288b);
    }
}
