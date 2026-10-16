package com.waze.bl.d.a;

import android.util.Size;
import com.waze.map.as;
import com.waze.map.ay;
import com.waze.map.bc;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bl.c.c.a f17072a;

    public j(com.waze.bl.c.c.a aVar, d dVar) {
        x.f(aVar, "collisionDetector");
        x.f(dVar, "viewFactory");
        this.f17072a = aVar;
    }

    @Override // com.waze.bl.d.a.g
    public final List a(List list) {
        x.f(list, "candidates");
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.bl.c.b.a) it.next()).b());
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            com.waze.bl.c.b.a aVar = (com.waze.bl.c.b.a) obj;
            arrayList3.add(new bc(aVar.b(), new ay(new Size(1, 1), new h(i2, aVar, this.f17072a.a(aVar.b(), new i(arrayList2, i2)) ? b.f17044b : b.f17043a, 0)), as.f27963e, null, null, 0.0f, null, 1016));
            i2 = i3;
        }
        return arrayList3;
    }
}
