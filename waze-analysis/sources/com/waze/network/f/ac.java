package com.waze.network.f;

import com.waze.realtime.RealtimeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {
    ac(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ac(eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        RealtimeNativeManager.getInstance().realtimeOnSessionDestroyed();
        return h.ab.f48028a;
    }
}
