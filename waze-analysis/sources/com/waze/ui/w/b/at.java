package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at extends av {

    /* renamed from: a, reason: collision with root package name */
    private final bi f43613a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43614b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(bi biVar, int i2, int i3) {
        super(biVar, false);
        h.g.b.x.f(biVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f43613a = biVar;
        this.f43614b = i2;
        this.f43615c = i3;
    }

    @Override // com.waze.ui.w.b.av
    public final int a() {
        return this.f43614b;
    }

    @Override // com.waze.ui.w.b.av
    public final int b() {
        return this.f43615c;
    }

    public final bi c() {
        return this.f43613a;
    }
}
