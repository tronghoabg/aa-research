package com.waze.reports;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dd extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ de f33830a;

    dd(de deVar) {
        Objects.requireNonNull(deVar);
        this.f33830a = deVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f33830a.f33834d.K();
    }
}
