package com.waze.bl.b.c;

import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements com.waze.bl.c.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f16933a;

    public c(a aVar, b bVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(bVar, "distanceCalculator");
        this.f16933a = aVar;
    }

    @Override // com.waze.bl.c.c.a
    public final boolean a(com.waze.shared_infra.h.c cVar, List list) {
        h.g.b.x.f(cVar, "candidate");
        h.g.b.x.f(list, "others");
        List<com.waze.shared_infra.h.c> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (com.waze.shared_infra.h.c cVar2 : list2) {
            h.g.b.x.f(cVar, "coordinate1");
            h.g.b.x.f(cVar2, "coordinate2");
            if (com.waze.shared_infra.h.b.c(cVar, cVar2) < this.f16933a.a()) {
                return true;
            }
        }
        return false;
    }
}
