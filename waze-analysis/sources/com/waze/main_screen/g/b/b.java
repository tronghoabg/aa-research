package com.waze.main_screen.g.b;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends com.waze.view.anim.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f26359a;

    b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f26359a = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f26359a.f26360a.f26367f.setVisibility(8);
    }
}
