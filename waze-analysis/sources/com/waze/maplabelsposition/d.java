package com.waze.maplabelsposition;

import com.waze.map.b.dp;
import com.waze.shared_infra.i.e;
import h.a.r;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final MapLabelsPositionsNativeManager f29612a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f29613b;

    /* renamed from: c, reason: collision with root package name */
    private final e f29614c;

    /* renamed from: d, reason: collision with root package name */
    private final ab f29615d;

    public d(MapLabelsPositionsNativeManager mapLabelsPositionsNativeManager, com.waze.shared_infra.i.b bVar, e eVar, ab abVar) {
        x.f(mapLabelsPositionsNativeManager, "nativeManager");
        x.f(bVar, "exceptionReporter");
        x.f(eVar, "logger");
        x.f(abVar, "backgroundDispatcher");
        this.f29612a = mapLabelsPositionsNativeManager;
        this.f29613b = bVar;
        this.f29614c = eVar;
        this.f29615d = abVar;
    }

    @Override // com.waze.maplabelsposition.b
    public final Object a(List list, List list2, h.c.e eVar) {
        if (list.isEmpty()) {
            this.f29613b.a(new IllegalArgumentException("calculateLabelsPositioning called with empty polylines list."), null);
            this.f29614c.g("calculateLabelsPositioning called with empty polylines list.");
            return r.j();
        }
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((dp) it.next()).b().size() < 2) {
                    this.f29613b.a(new IllegalArgumentException("calculateLabelsPositioning called with a polyline with less than 2 geopositions."), null);
                    this.f29614c.g("calculateLabelsPositioning called with a polyline with less than 2 geopositions.");
                    return r.j();
                }
            }
        }
        return aj.v(this.f29615d, new c(this, list, list2, null), eVar);
    }
}
