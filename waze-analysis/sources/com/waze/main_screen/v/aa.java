package com.waze.main_screen.v;

import androidx.compose.animation.core.TransitionState;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa implements m {

    /* renamed from: a, reason: collision with root package name */
    private final n f27774a;

    /* renamed from: b, reason: collision with root package name */
    private final TransitionState f27775b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f27776c;

    public aa(n nVar, TransitionState transitionState, MutableState mutableState) {
        h.g.b.x.f(transitionState, "visibleState");
        h.g.b.x.f(mutableState, "isShown");
        this.f27774a = nVar;
        this.f27775b = transitionState;
        this.f27776c = mutableState;
    }

    @Override // com.waze.main_screen.v.m
    public final TransitionState a() {
        return this.f27775b;
    }

    @Override // com.waze.main_screen.v.m
    public final n b() {
        return this.f27774a;
    }

    @Override // com.waze.main_screen.v.m
    public final void c() {
        this.f27776c.setValue(false);
    }

    @Override // com.waze.main_screen.v.m
    public final void d() {
        this.f27776c.setValue(true);
    }
}
