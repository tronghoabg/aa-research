package com.waze.ui.l;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EnterTransition f42689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ExitTransition f42690b;

    public g(EnterTransition enterTransition, ExitTransition exitTransition) {
        this.f42689a = enterTransition;
        this.f42690b = exitTransition;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return AnimatedContentKt.togetherWith(this.f42689a, this.f42690b);
    }
}
