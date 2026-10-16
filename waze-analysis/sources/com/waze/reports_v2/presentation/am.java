package com.waze.reports_v2.presentation;

import android.view.View;
import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f34804a;

    am(ap apVar, View view) {
        this.f34804a = view;
        Objects.requireNonNull(apVar);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f34804a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
