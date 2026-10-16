package com.waze.reports;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class da extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ di f33825a;

    da(di diVar) {
        Objects.requireNonNull(diVar);
        this.f33825a = diVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f33825a.f33845e.D();
    }
}
