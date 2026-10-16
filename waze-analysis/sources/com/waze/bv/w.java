package com.waze.bv;

import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w implements r {

    /* renamed from: a, reason: collision with root package name */
    private final i f17560a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.opengl.t f17561b;

    public w(com.waze.map.opengl.t tVar, i iVar) {
        h.g.b.x.f(tVar, "config");
        h.g.b.x.f(iVar, "controller");
        this.f17561b = tVar;
        this.f17560a = iVar;
    }

    @Override // com.waze.bv.r
    public final kotlinx.coroutines.b.k a() {
        return ai.y(new v(this.f17561b.b(), this));
    }

    public final s b() {
        if (((Boolean) this.f17561b.b().d()).booleanValue()) {
            return new x(this.f17560a);
        }
        return null;
    }
}
