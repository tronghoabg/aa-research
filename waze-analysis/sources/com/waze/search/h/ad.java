package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f35765a;

    public ad(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "currLocation");
        this.f35765a = aVar;
    }

    public final Integer a(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        com.waze.shared_infra.h.c cVar2 = (com.waze.shared_infra.h.c) this.f35765a.invoke();
        if (cVar2.h() && cVar.h()) {
            return Integer.valueOf(h.h.a.b(com.waze.sharedui.utils.f.b(cVar2, cVar)));
        }
        return null;
    }
}
