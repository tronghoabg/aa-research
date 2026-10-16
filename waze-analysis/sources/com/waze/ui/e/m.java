package com.waze.ui.e;

import androidx.compose.animation.core.Transition;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Transition f42229a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f42230b;

    public m(Transition transition, int i2) {
        this.f42230b = i2;
        this.f42229a = transition;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f42230b;
        if (i2 == 0) {
            return this.f42229a.getSegment();
        }
        if (i2 == 1) {
            return this.f42229a.getSegment();
        }
        if (i2 == 2) {
            return this.f42229a.getSegment();
        }
        if (i2 == 3) {
            return this.f42229a.getSegment();
        }
        if (i2 == 4) {
            return this.f42229a.getSegment();
        }
        Transition transition = this.f42229a;
        return i2 != 5 ? transition.getSegment() : transition.getSegment();
    }
}
