package com.waze.location;

import android.location.Location;
import com.waze.navigate.dg;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final bf f25396a = bf.f25344b;

    /* renamed from: b, reason: collision with root package name */
    private final dg f25397b;

    /* renamed from: c, reason: collision with root package name */
    private final y f25398c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f25399d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25400e;

    public g(dg dgVar, y yVar, com.waze.shared_infra.q.e eVar) {
        h.g.b.x.f(dgVar, "navigationInfoInterface");
        h.g.b.x.f(yVar, "locationEventManager");
        h.g.b.x.f(eVar, "wazeClock");
        this.f25397b = dgVar;
        this.f25398c = yVar;
        this.f25399d = eVar;
    }

    static /* synthetic */ Object d(g gVar, h.c.e eVar) {
        if (!gVar.f25400e) {
            gVar.f25400e = true;
            Object objE = kotlinx.coroutines.b.ai.e(new aw(kotlinx.coroutines.b.ai.D(gVar.f25397b.aj()), gVar, 1), new d(gVar, null), eVar);
            if (objE == h.c.a.a.f48038a) {
                return objE;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List f(List list) {
        Iterator it;
        List list2 = list;
        List listB = h.a.i.b();
        Iterator it2 = list2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            c cVar = (c) next;
            int iB = h.h.a.b(cVar.a() / 20.0f);
            if (i2 == listB.size() - 1 || iB == 0) {
                it = it2;
                Location location = new Location(cVar.b());
                location.setTime(this.f25399d.a());
                listB.add(location);
            } else {
                Location locationB = ((c) list2.get(i3)).b();
                double latitude = locationB.getLatitude() - cVar.b().getLatitude();
                double longitude = locationB.getLongitude() - cVar.b().getLongitude();
                double latitude2 = cVar.b().getLatitude();
                double longitude2 = cVar.b().getLongitude();
                int i4 = 0;
                while (i4 < iB) {
                    double d2 = iB;
                    Iterator it3 = it2;
                    Location location2 = new Location(cVar.b());
                    latitude2 += latitude / d2;
                    double d3 = longitude2 + (longitude / d2);
                    location2.setLatitude(latitude2);
                    location2.setLongitude(d3);
                    longitude2 = d3;
                    location2.setTime(this.f25399d.a());
                    listB.add(location2);
                    i4++;
                    it2 = it3;
                }
                it = it2;
            }
            list2 = list;
            i2 = i3;
            it2 = it;
        }
        return h.a.i.a(listB);
    }

    public final Object c(h.c.e eVar) {
        return d(this, eVar);
    }
}
