package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class vri {
    public abstract abow a(String str, Object obj);

    public abstract abow b(abow abowVar, abow abowVar2);

    public abstract String c(abow abowVar);

    public final List e(Map map) {
        abow abowVarA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (abowVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(abowVarA);
            }
        }
        return arrayList;
    }

    final List f(List list, List list2) {
        abow abowVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abow abowVar2 = (abow) it.next();
            String strC = c(abowVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    abowVar = null;
                    break;
                }
                abowVar = (abow) it2.next();
                if (strC.equals(c(abowVar))) {
                    break;
                }
            }
            abow abowVarB = b(abowVar2, abowVar);
            if (abowVarB != null) {
                arrayList.add(abowVarB);
            }
        }
        return arrayList;
    }
}
