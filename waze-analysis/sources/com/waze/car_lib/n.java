package com.waze.car_lib;

import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.k.b f20331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f20332b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f20333c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20334d;

    public n(org.a.d.k.b bVar, Object obj, List list, int i2) {
        this.f20334d = i2;
        this.f20331a = bVar;
        this.f20332b = obj;
        this.f20333c = list;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() throws org.a.d.d.b {
        org.a.d.e.c cVar;
        int i2 = this.f20334d;
        org.a.d.k.b bVar = this.f20331a;
        if (i2 != 0) {
            com.waze.shared_infra.n.c cVarO = bVar.f().o();
            Object obj = this.f20332b;
            org.a.d.i.a aVarG = bVar.g();
            String strC = bVar.c();
            org.a.d.c.c cVar2 = org.a.d.c.c.f56384c;
            m mVar = new m(obj, 1);
            int i3 = h.g.b.ar.f48106a;
            org.a.d.c.a aVar = new org.a.d.c.a(aVarG, new h.g.b.m(kotlinx.coroutines.af.class), null, mVar, cVar2, this.f20333c);
            String strB = org.a.b.c.a.b(aVar.c(), aVar.e(), aVar.f());
            Object obj2 = cVarO.j().get(strB);
            cVar = obj2 instanceof org.a.d.e.c ? (org.a.d.e.c) obj2 : null;
            if (cVar != null) {
                cVar.e(strC, obj);
            } else {
                org.a.d.e.c cVar3 = new org.a.d.e.c(aVar);
                com.waze.shared_infra.n.c.r(cVarO, true, strB, cVar3);
                Iterator it = aVar.a().iterator();
                while (it.hasNext()) {
                    com.waze.shared_infra.n.c.r(cVarO, true, org.a.b.c.a.b((h.l.c) it.next(), aVar.e(), aVar.f()), cVar3);
                }
            }
            return h.ab.f48028a;
        }
        com.waze.shared_infra.n.c cVarO2 = bVar.f().o();
        Object obj3 = this.f20332b;
        org.a.d.i.a aVarG2 = bVar.g();
        String strC2 = bVar.c();
        org.a.d.c.c cVar4 = org.a.d.c.c.f56384c;
        m mVar2 = new m(obj3, 0);
        int i4 = h.g.b.ar.f48106a;
        org.a.d.c.a aVar2 = new org.a.d.c.a(aVarG2, new h.g.b.m(o.class), null, mVar2, cVar4, this.f20333c);
        String strB2 = org.a.b.c.a.b(aVar2.c(), aVar2.e(), aVar2.f());
        Object obj4 = cVarO2.j().get(strB2);
        cVar = obj4 instanceof org.a.d.e.c ? (org.a.d.e.c) obj4 : null;
        if (cVar != null) {
            cVar.e(strC2, obj3);
        } else {
            org.a.d.e.c cVar5 = new org.a.d.e.c(aVar2);
            com.waze.shared_infra.n.c.r(cVarO2, true, strB2, cVar5);
            Iterator it2 = aVar2.a().iterator();
            while (it2.hasNext()) {
                com.waze.shared_infra.n.c.r(cVarO2, true, org.a.b.c.a.b((h.l.c) it2.next(), aVar2.e(), aVar2.f()), cVar5);
            }
        }
        return h.ab.f48028a;
    }
}
