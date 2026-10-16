package com.waze.main_screen.ag.a;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    private final c f25819a;

    public h(c cVar) {
        x.f(cVar, "config");
        this.f25819a = cVar;
    }

    @Override // com.waze.main_screen.ag.a.d
    public final k a() {
        return ai.y(new g(this.f25819a.a()));
    }
}
