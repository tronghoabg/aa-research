package com.waze.view.popups.a;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f45152a;

    ab(af afVar) {
        Objects.requireNonNull(afVar);
        this.f45152a = afVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f45152a.k();
    }
}
