package com.waze.location.a;

import com.waze.location.bf;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final long f25191a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25192b;

    public /* synthetic */ d(long j2, long j3) {
        this.f25191a = j2;
        this.f25192b = j3;
    }

    @Override // com.waze.location.a.m
    public final l a(Map map, long j2) {
        Object next;
        Object next2;
        h.g.b.x.f(map, "data");
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            if (h.g.b.x.n(((y) entry.getKey()).b(), "gps") && ((y) entry.getKey()).a() == bf.f25345c && j2 - ((c) entry.getValue()).a() <= h.o.a.m(this.f25192b)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        c cVar = entry2 != null ? (c) entry2.getValue() : null;
        if (cVar != null) {
            Iterator it2 = map.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                Map.Entry entry3 = (Map.Entry) next2;
                if (h.g.b.x.n(((y) entry3.getKey()).b(), "network") && ((y) entry3.getKey()).a() == bf.f25345c && j2 - ((c) entry3.getValue()).a() <= h.o.a.m(this.f25192b)) {
                    break;
                }
            }
            Map.Entry entry4 = (Map.Entry) next2;
            c cVar2 = entry4 != null ? (c) entry4.getValue() : null;
            if (cVar2 != null) {
                float fDistanceTo = cVar.c().distanceTo(cVar2.c());
                if (fDistanceTo > this.f25191a) {
                    return new i((long) fDistanceTo, map);
                }
            }
        }
        return null;
    }

    public final String toString() {
        return "LocationInconsistencyDetector(maxDistanceMeters=" + this.f25191a + ", maxTimeDiff=" + h.o.a.y(this.f25192b) + ")";
    }
}
