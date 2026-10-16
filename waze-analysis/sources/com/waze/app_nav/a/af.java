package com.waze.app_nav.a;

import com.waze.settings.cg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.coordinators.s f15105a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15106b;

    af(com.waze.shared_infra.coordinators.s sVar, int i2) {
        this.f15106b = i2;
        this.f15105a = sVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f15106b != 0) {
            com.waze.app_nav.m mVar = (com.waze.app_nav.m) obj;
            Class clsC = mVar.b().c();
            if (h.g.b.x.n(clsC, com.waze.main_screen.af.class)) {
                this.f15105a.H(o.f15157a);
            } else if (!h.g.b.x.n(clsC, cg.class)) {
                this.f15105a.H(new l(mVar));
            }
            return h.ab.f48028a;
        }
        com.waze.app_nav.v vVar = (com.waze.app_nav.v) obj;
        boolean zN = h.g.b.x.n(vVar.a().b().c(), com.waze.main_screen.af.class);
        com.waze.shared_infra.coordinators.s sVar = this.f15105a;
        if (zN) {
            sVar.H(aj.f15110a);
            return h.ab.f48028a;
        }
        List listB = vVar.b();
        ArrayList arrayList = new ArrayList(h.a.i.q(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.app_nav.m) it.next()).b().c());
        }
        ArrayList arrayList2 = arrayList;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (h.g.b.x.n((Class) it2.next(), com.waze.main_screen.af.class)) {
                    return h.ab.f48028a;
                }
            }
        }
        ((ag) sVar).b();
        return h.ab.f48028a;
    }
}
