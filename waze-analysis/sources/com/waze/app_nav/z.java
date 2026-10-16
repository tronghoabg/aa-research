package com.waze.app_nav;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private final m f15445a;

    /* renamed from: b, reason: collision with root package name */
    private final CompletableDeferred f15446b;

    public z(m mVar) {
        h.g.b.x.f(mVar, "destination");
        this.f15445a = mVar;
        this.f15446b = bo.j();
    }

    public final m a() {
        return this.f15445a;
    }

    public final CompletableDeferred b() {
        return this.f15446b;
    }

    public final String toString() {
        return "Entry(destination=" + this.f15445a + ")";
    }
}
