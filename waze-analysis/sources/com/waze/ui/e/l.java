package com.waze.ui.e;

import androidx.compose.animation.core.Transition;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Transition f42227a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f42228b;

    public l(Transition transition, int i2) {
        this.f42228b = i2;
        this.f42227a = transition;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f42228b;
        if (i2 == 0) {
            return this.f42227a.getTargetState();
        }
        if (i2 == 1) {
            return this.f42227a.getTargetState();
        }
        if (i2 == 2) {
            return this.f42227a.getTargetState();
        }
        if (i2 == 3) {
            return this.f42227a.getTargetState();
        }
        if (i2 == 4) {
            return this.f42227a.getTargetState();
        }
        Transition transition = this.f42227a;
        return i2 != 5 ? transition.getTargetState() : transition.getTargetState();
    }
}
