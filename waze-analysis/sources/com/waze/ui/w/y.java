package com.waze.ui.w;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y implements h.g.a.l {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f43801c;

    /* renamed from: b, reason: collision with root package name */
    public static final y f43800b = new y(1);

    /* renamed from: a, reason: collision with root package name */
    public static final y f43799a = new y(0);

    y(int i2) {
        this.f43801c = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f43801c != 0) {
            h.g.b.x.f((AnimatedContentTransitionScope) obj, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null));
        }
        com.waze.ui.j.h hVar = (com.waze.ui.j.h) obj;
        h.g.b.x.f(hVar, "it");
        Class<?> cls = hVar.getClass();
        int i2 = ar.f48106a;
        return new h.g.b.m(cls);
    }
}
