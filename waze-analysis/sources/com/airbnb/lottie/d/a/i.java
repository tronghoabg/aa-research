package com.airbnb.lottie.d.a;

import com.airbnb.lottie.a.b.t;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    private final b f2100a;

    /* renamed from: b, reason: collision with root package name */
    private final b f2101b;

    public i(b bVar, b bVar2) {
        this.f2100a = bVar;
        this.f2101b = bVar2;
    }

    @Override // com.airbnb.lottie.d.a.m
    public final com.airbnb.lottie.a.b.f a() {
        return new t(this.f2100a.a(), this.f2101b.a());
    }

    @Override // com.airbnb.lottie.d.a.m
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.d.a.m
    public final boolean c() {
        return this.f2100a.c() && this.f2101b.c();
    }
}
