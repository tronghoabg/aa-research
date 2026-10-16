package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends e.a.h.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e.a.i iVar, e.a.h hVar) {
        super(iVar, hVar);
        h.g.b.x.f(iVar, "channel");
        h.g.b.x.f(hVar, "callOptions");
    }

    @Override // e.a.h.e
    public final /* bridge */ /* synthetic */ e.a.h.e build(e.a.i iVar, e.a.h hVar) {
        h.g.b.x.f(iVar, "channel");
        h.g.b.x.f(hVar, "callOptions");
        return new m(iVar, hVar);
    }
}
