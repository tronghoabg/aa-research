package com.waze.navbar;

import android.animation.LayoutTransition;
import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f30870a;

    c(f fVar) {
        Objects.requireNonNull(fVar);
        this.f30870a = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        f fVar = this.f30870a;
        LayoutTransition layoutTransition = fVar.getLayoutTransition();
        fVar.setLayoutTransition(null);
        fVar.f30883j.setVisibility(8);
        fVar.setLayoutTransition(layoutTransition);
    }
}
