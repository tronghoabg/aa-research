package com.waze.car_lib.r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dk extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21395a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21396b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21397c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ dl f21398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dk(dl dlVar, h.c.e eVar) {
        super(4, eVar);
        this.f21398d = dlVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        dk dkVar = new dk(this.f21398d, (h.c.e) obj4);
        dkVar.f21395a = (com.waze.o.ad) obj;
        dkVar.f21396b = (cv) obj2;
        dkVar.f21397c = (com.waze.alerters.a.k) obj3;
        return dkVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.o.ad adVar = (com.waze.o.ad) this.f21395a;
        cv cvVar = (cv) this.f21396b;
        com.waze.alerters.a.k kVar = (com.waze.alerters.a.k) this.f21397c;
        boolean z = adVar instanceof df;
        dl dlVar = this.f21398d;
        com.waze.reports_v2.d dVarV = dlVar.v();
        if (!z) {
            return adVar;
        }
        if (dlVar.f21407i.b()) {
            dlVar.f21407i.a();
            df dfVar = (df) adVar;
            List listD = h.a.i.d(dl.b(dlVar));
            List list = dlVar.f21409k;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(dl.c(dlVar, ((com.waze.reports_v2.b.ag) it.next()).g()));
            }
            return df.g(dfVar, h.a.i.af(listD, arrayList), null, null, dVarV, 29);
        }
        if (cvVar != null) {
            df dfVar2 = (df) adVar;
            List listD2 = h.a.i.d(cvVar.a());
            List list2 = dlVar.f21409k;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(dl.c(dlVar, ((com.waze.reports_v2.b.ag) it2.next()).g()));
            }
            return df.g(dfVar2, h.a.i.af(listD2, arrayList2), cvVar, null, dVarV, 21);
        }
        if (kVar == null) {
            return df.g((df) adVar, null, null, null, dVarV, 31);
        }
        df dfVar3 = (df) adVar;
        List listD3 = h.a.i.d(dl.s(dlVar, kVar));
        List list3 = dlVar.f21409k;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(dl.c(dlVar, ((com.waze.reports_v2.b.ag) it3.next()).g()));
        }
        return df.g(dfVar3, h.a.i.af(listD3, arrayList3), null, kVar, dVarV, 13);
    }
}
