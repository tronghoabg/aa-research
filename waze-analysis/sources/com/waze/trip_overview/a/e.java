package com.waze.trip_overview.a;

import com.waze.map.b.fg;
import com.waze.map.b.fh;
import com.waze.map.b.fi;
import com.waze.map.b.fj;
import com.waze.map.b.fk;
import com.waze.map.bc;
import com.waze.modules.c.ap;
import com.waze.modules.c.ea;
import com.waze.modules.c.ec;
import com.waze.sharedui.web.at;
import h.a.i;
import h.g.b.x;
import h.k.n;
import h.n.o;
import i.a.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f40984a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.c.d f40985b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40986c;

    public e(a aVar, com.waze.map.c.d dVar, com.waze.shared_infra.i.e eVar) {
        x.f(aVar, "config");
        x.f(dVar, "mapMarkerCreator");
        x.f(eVar, "logger");
        this.f40984a = aVar;
        this.f40985b = dVar;
        this.f40986c = eVar;
    }

    private static final bc b(com.waze.shared_infra.h.c cVar, com.waze.map.c.d dVar, fk fkVar) {
        return dVar.a(cVar, fkVar);
    }

    private static final bc c(com.waze.shared_infra.h.c cVar, com.waze.map.c.d dVar, fk fkVar) {
        return dVar.b(cVar, fkVar);
    }

    @Override // com.waze.trip_overview.a.d
    public final c a(ea eaVar, boolean z) {
        f fVar;
        a aVar = this.f40984a;
        x.f(aVar, "<this>");
        com.waze.shared_infra.i.e eVar = this.f40986c;
        x.f(eVar, "logger");
        eVar.a("parsing closure zoom levels: '" + aVar.b() + "'");
        List listAf = o.af(aVar.b(), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listAf.iterator();
        while (it.hasNext()) {
            Float fE = o.e((String) it.next());
            Float fValueOf = fE != null ? Float.valueOf(n.g(fE.floatValue(), 0.0f, 1.0f)) : null;
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 4 || ((Number) arrayList2.get(0)).floatValue() > ((Number) arrayList2.get(1)).floatValue() || ((Number) arrayList2.get(1)).floatValue() > ((Number) arrayList2.get(2)).floatValue() || ((Number) arrayList2.get(2)).floatValue() > ((Number) arrayList2.get(3)).floatValue()) {
            eVar.b("failed to parse closure zoom levels");
            fVar = null;
        } else {
            fVar = new f(new fk(((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue()), new fk(((Number) arrayList2.get(1)).floatValue(), ((Number) arrayList2.get(2)).floatValue()), new fk(((Number) arrayList2.get(2)).floatValue(), ((Number) arrayList2.get(3)).floatValue()));
        }
        if (eaVar == null || fVar == null) {
            return new c(i.h(), i.h(), i.h());
        }
        x.f(aVar, "<this>");
        x.f(eVar, "logger");
        eVar.a("parsing closure main road types: '" + aVar.a() + "'");
        List listAf2 = o.af(aVar.a(), new String[]{","}, 0, 6);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listAf2.iterator();
        while (it2.hasNext()) {
            Integer numF = o.f((String) it2.next());
            if (numF != null) {
                arrayList3.add(numF);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            g gVarB = g.b(((Number) it3.next()).intValue());
            ap apVarE = gVarB != null ? com.waze.ae.e.e(gVarB) : null;
            if (apVarE != null) {
                arrayList4.add(apVarE);
            }
        }
        Set setAu = i.au(arrayList4);
        Objects.toString(setAu);
        eVar.a("closure main road types are: ".concat(String.valueOf(setAu)));
        List listB = eaVar.b();
        fk fkVarH = at.h(fVar.a(), fVar.b());
        fk fkVarA = fVar.a();
        List<com.waze.modules.c.g> list = listB;
        ArrayList arrayList5 = new ArrayList(i.q(list, 10));
        for (com.waze.modules.c.g gVar : list) {
            arrayList5.add(new fi(gVar.b(), fj.f28346i, true != (gVar.a() != null && i.ax(setAu, gVar.a())) ? fkVarA : fkVarH));
        }
        ArrayList arrayList6 = arrayList5;
        List<com.waze.shared_infra.h.c> listA = eaVar.a();
        ArrayList arrayList7 = new ArrayList();
        for (com.waze.shared_infra.h.c cVar : listA) {
            com.waze.map.c.d dVar = this.f40985b;
            i.aD(arrayList7, i.i(b(cVar, dVar, fVar.b()), c(cVar, dVar, fVar.c())));
        }
        ArrayList arrayList8 = arrayList7;
        List<com.waze.shared_infra.h.c> listC = eaVar.c();
        fk fkVarH2 = at.h(fVar.a(), fVar.b());
        ArrayList arrayList9 = new ArrayList();
        for (com.waze.shared_infra.h.c cVar2 : listC) {
            com.waze.map.c.d dVar2 = this.f40985b;
            i.aD(arrayList9, i.i(b(cVar2, dVar2, fkVarH2), c(cVar2, dVar2, fVar.c())));
        }
        List listAf3 = i.af(arrayList8, arrayList9);
        List<ec> listD = eaVar.d();
        ArrayList arrayList10 = new ArrayList(i.q(listD, 10));
        for (ec ecVar : listD) {
            arrayList10.add(new fg(ecVar.b(), fh.f28333a, !z ? ecVar.a() : null));
        }
        eVar.a("built " + arrayList6.size() + " polylines & " + listAf3.size() + " pins on " + fVar);
        return new c(arrayList6, listAf3, arrayList10);
    }
}
