package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q {
    static void a(List list) {
        Set<o> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (o oVar : (Set) it2.next()) {
                        for (r rVar : oVar.a().k()) {
                            if (rVar.l() && (set = (Set) map.get(new p(rVar.j(), rVar.n()))) != null) {
                                for (o oVar2 : set) {
                                    oVar.c(oVar2);
                                    oVar2.d(oVar);
                                }
                            }
                        }
                    }
                }
                HashSet<o> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (o oVar3 : hashSet) {
                    if (oVar3.g()) {
                        hashSet2.add(oVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    o oVar4 = (o) hashSet2.iterator().next();
                    hashSet2.remove(oVar4);
                    i2++;
                    for (o oVar5 : oVar4.b()) {
                        oVar5.e(oVar4);
                        if (oVar5.g()) {
                            hashSet2.add(oVar5);
                        }
                    }
                }
                if (i2 == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (o oVar6 : hashSet) {
                    if (!oVar6.g() && !oVar6.f()) {
                        arrayList.add(oVar6.a());
                    }
                }
                throw new s(arrayList);
            }
            c cVar = (c) it.next();
            o oVar7 = new o(cVar);
            for (ae aeVar : cVar.l()) {
                p pVar = new p(aeVar, !cVar.p());
                if (!map.containsKey(pVar)) {
                    map.put(pVar, new HashSet());
                }
                Set set2 = (Set) map.get(pVar);
                if (!set2.isEmpty() && !pVar.f8969b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", aeVar));
                }
                set2.add(oVar7);
            }
        }
    }

    public static com.google.firebase.g.c b(d dVar, Class cls) {
        return dVar.b(new ae(ad.class, cls));
    }

    public static Object c(d dVar, ae aeVar) {
        com.google.firebase.g.c cVarB = dVar.b(aeVar);
        if (cVarB == null) {
            return null;
        }
        return cVarB.a();
    }

    public static Object d(d dVar, Class cls) {
        return c(dVar, new ae(ad.class, cls));
    }

    public static Set e(d dVar, Class cls) {
        return dVar.g(new ae(ad.class, cls));
    }
}
