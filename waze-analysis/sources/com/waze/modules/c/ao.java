package com.waze.modules.c;

import com.waze.map.gl;
import i.b.l.sl;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final List f29856a;

    /* renamed from: b, reason: collision with root package name */
    private final List f29857b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f29858c;

    public ao(List list, List list2) {
        h.g.b.x.f(list, "nonHovRoutes");
        h.g.b.x.f(list2, "hovRoutes");
        this.f29856a = list;
        this.f29857b = list2;
        List list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(Long.valueOf(((sl) obj).getHovRouteInfo().getNormalRouteAltId()), obj);
        }
        this.f29858c = linkedHashMap;
    }

    public final List a() {
        return this.f29856a;
    }

    public final sl b(long j2) {
        return (sl) this.f29858c.get(Long.valueOf(j2));
    }

    public final sl c(long j2) {
        Object next;
        Iterator it = this.f29856a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((sl) next).getAltId() == j2) {
                break;
            }
        }
        return (sl) next;
    }

    public final String toString() throws IOException {
        return "PartitionedRoutesByHov(nonHovRoutes=" + h.a.i.aM(this.f29856a, null, null, null, 0, new gl(6), 31) + ", hovRoutes=" + h.a.i.aM(this.f29857b, null, null, null, 0, new gl(7), 31) + ")";
    }
}
