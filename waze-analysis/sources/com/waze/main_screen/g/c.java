package com.waze.main_screen.g;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f26374a;

    c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f26374a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        d dVar = this.f26374a;
        if (dVar.f26381g != null) {
            dVar.f26381g.a();
        }
    }
}
