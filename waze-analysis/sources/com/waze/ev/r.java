package com.waze.ev;

import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f23712a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f23713b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f23714c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f23715d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ s f23716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, h.c.e eVar) {
        super(5, eVar);
        this.f23716e = sVar;
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        r rVar = new r(this.f23716e, (h.c.e) obj5);
        rVar.f23712a = zBooleanValue;
        rVar.f23713b = (String) obj2;
        rVar.f23714c = (String) obj3;
        rVar.f23715d = (List) obj4;
        return rVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        List listH;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f23712a;
        String str = (String) this.f23713b;
        String str2 = (String) this.f23714c;
        List<g> list = (List) this.f23715d;
        s sVar = this.f23716e;
        com.waze.shared_infra.i.e eVar = sVar.f23718b;
        List listD = sVar.d();
        ArrayList arrayList = new ArrayList(h.a.i.q(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) it.next()).d());
        }
        Set setC = com.waze.ac.e.c(eVar, str, arrayList);
        com.waze.shared_infra.i.e eVar2 = sVar.f23718b;
        x.f(eVar2, "logger");
        x.f(str2, "selectedNetworksString");
        if (list == null) {
            listH = h.a.i.h();
        } else {
            List listAf = h.n.o.af(str2, new String[]{"|"}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (g gVar : list) {
                String strA = listAf.contains(gVar.a()) ? gVar.a() : null;
                if (strA != null) {
                    arrayList2.add(strA);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (listAf.size() > arrayList3.size()) {
                eVar2.g("Found network names: " + h.a.i.ad(listAf, h.a.i.au(arrayList3)) + " that don't exist in BE data. Ignoring them.");
            }
            listH = arrayList3;
        }
        return new m(z, setC, listH);
    }
}
