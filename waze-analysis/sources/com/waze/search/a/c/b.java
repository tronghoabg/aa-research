package com.waze.search.a.c;

import com.waze.car_lib.o.ab;
import com.waze.li;
import com.waze.ui.ac.m;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f35458a;

    public b(h.g.a.a aVar) {
        x.f(aVar, "symbolStyle");
        this.f35458a = aVar;
    }

    private final int b(String str, com.waze.design_components.b.e eVar) {
        return (x.n(this.f35458a.invoke(), "latam") && x.n(str, "parking")) ? com.waze.design_components.b.d.ai.b() : com.waze.av.c.b.c(str, null, com.waze.design_components.b.d.I, eVar, 2);
    }

    @Override // com.waze.search.a.c.a
    public final com.waze.search.d.a.a.a a(li liVar, l lVar) {
        x.f(liVar, "venueCategoryGroup");
        x.f(lVar, "onClick");
        String strA = liVar.a();
        String strB = liVar.b();
        int iB = b(strA, com.waze.design_components.b.e.f23314c);
        int iB2 = b(strA, com.waze.design_components.b.e.f23312a);
        return new com.waze.search.d.a.a.a(strA, new m(strB), new com.waze.ui.ac.f(iB), new com.waze.ui.ac.f(iB2), new ab(lVar, 19));
    }
}
