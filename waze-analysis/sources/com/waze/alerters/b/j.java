package com.waze.alerters.b;

import com.waze.alerters.a.ac;
import com.waze.alerters.a.ad;
import com.waze.alerters.a.z;
import com.waze.navigate.cc;
import com.waze.navigate.cd;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14247a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14248b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f14249c = i2;
        this.f14248b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f14249c;
        Object obj2 = this.f14248b;
        if (i2 != 0) {
            j jVar = new j((e) obj2, eVar, 1);
            jVar.f14247a = obj;
            return jVar;
        }
        j jVar2 = new j((p) obj2, eVar, 0);
        jVar2.f14247a = obj;
        return jVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f14249c != 0 ? ((j) create((List) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((j) create((List) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        ad adVarD;
        Object objD;
        com.waze.alerters.a.c cVar;
        if (this.f14249c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            List list = (List) this.f14247a;
            p pVar = (p) this.f14248b;
            h hVarD = p.d(pVar, p.e(pVar, pVar.f14264f, list));
            bn bnVar = pVar.f14265g;
            z zVarA = hVarD.a();
            if (zVarA != null && (adVarD = zVarA.d()) != null) {
                objB = adVarD.b();
            }
            bnVar.e(objB == ac.f14149b ? new cc(hVarD.a().d().a()) : cd.f31163a);
            pVar.f14264f = hVarD;
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list2 = (List) this.f14247a;
        e eVar = (e) this.f14248b;
        List listC = eVar.f14228c.c();
        ArrayList arrayList = new ArrayList(h.a.i.q(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.alerters.a.c) it.next()).a());
        }
        Set setAu = h.a.i.au(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!setAu.contains(((com.waze.alerters.a.c) obj2).a())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        eVar.f14228c = e.c(eVar, eVar.f14228c, list2);
        com.waze.alerters.a.c cVarA = eVar.f14228c.a();
        e.f(eVar, arrayList3, cVarA != null ? cVarA.a() : null);
        bn bnVar2 = eVar.f14229d;
        do {
            objD = bnVar2.d();
            cVar = (com.waze.alerters.a.c) objD;
        } while (!bnVar2.f(objD, eVar.f14228c.a()));
        com.waze.k kVarA = cVar != null ? cVar.a() : null;
        com.waze.alerters.a.c cVarA2 = eVar.f14228c.a();
        if (!x.n(kVarA, cVarA2 != null ? cVarA2.a() : null)) {
            com.waze.shared_infra.i.e eVar2 = eVar.f14226a;
            com.waze.alerters.a.c cVarA3 = eVar.f14228c.a();
            objB = cVarA3 != null ? cVarA3.a() : null;
            Objects.toString(objB);
            eVar2.g("selected alerter: alerterId=".concat(String.valueOf(objB)));
            com.waze.alerters.a.c cVarA4 = eVar.f14228c.a();
            if (cVarA4 != null) {
                cVarA4.i();
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14249c = i2;
        this.f14248b = pVar;
    }
}
