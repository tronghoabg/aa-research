package com.waze.car_lib.r;

import com.waze.R;
import com.waze.gw.Gateway;
import com.waze.reports_v2.c.Cdo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f21391a;

    /* renamed from: b, reason: collision with root package name */
    int f21392b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dl f21393c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f21394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dj(dl dlVar, kotlinx.coroutines.b.bn bnVar, h.c.e eVar) {
        super(2, eVar);
        this.f21393c = dlVar;
        this.f21394d = bnVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new dj(this.f21393c, this.f21394d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        dl dlVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21392b != 0) {
            dlVar = (dl) this.f21391a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            dl dlVar2 = this.f21393c;
            this.f21391a = dlVar2;
            this.f21392b = 1;
            Object objA = dlVar2.f21399a.a(this);
            if (objA == aVar) {
                return aVar;
            }
            dlVar = dlVar2;
            obj = objA;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (obj2 instanceof com.waze.reports_v2.b.ag) {
                arrayList.add(obj2);
            }
        }
        dlVar.f21409k = arrayList;
        kotlinx.coroutines.b.bn bnVar = this.f21394d;
        dl dlVar3 = this.f21393c;
        String strC = dlVar3.f21400b.c(R.string.AAOS_UGC_REPORTS_TITLE, new Object[0]);
        List list = dlVar3.f21409k;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(dl.c(dlVar3, ((com.waze.reports_v2.b.ag) it.next()).g()));
        }
        bnVar.c((df) Gateway.patchAaReportMenuState(new df(strC, arrayList2, false, dlVar3.v(), 28)));
        Cdo cdo = dlVar3.f21401c;
        List list2 = dlVar3.f21409k;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new com.waze.reports_v2.c.ck(((com.waze.reports_v2.b.ag) it2.next()).g()));
        }
        cdo.e(arrayList3, dlVar3.v() instanceof com.waze.reports_v2.a);
        if (dlVar3.v() instanceof com.waze.reports_v2.a) {
            dlVar3.t(com.waze.car_lib.b.bd.f19025a);
        }
        return h.ab.f48028a;
    }
}
