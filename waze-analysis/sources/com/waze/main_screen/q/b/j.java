package com.waze.main_screen.q.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.q.a.b f27396a;

    public j(com.waze.main_screen.q.a.b bVar) {
        x.f(bVar, "nearDestinationRepository");
        this.f27396a = bVar;
    }

    @Override // com.waze.main_screen.q.b.g
    public final i a(f fVar) {
        x.f(fVar, "onClosed");
        return new n(fVar, this.f27396a);
    }
}
