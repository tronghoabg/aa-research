package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qlt extends qle {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        qlt qltVar = (qlt) qleVar;
        qltVar.a.addAll(this.a);
        qltVar.b.addAll(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            for (qma qmaVar : (List) entry.getValue()) {
                if (qmaVar != null) {
                    String str2 = str == null ? "" : str;
                    Map map = qltVar.c;
                    if (!map.containsKey(str2)) {
                        map.put(str2, new ArrayList());
                    }
                    ((List) map.get(str2)).add(qmaVar);
                }
            }
        }
    }

    public final String toString() {
        HashMap map = new HashMap();
        List list = this.a;
        if (!list.isEmpty()) {
            map.put("products", list);
        }
        List list2 = this.b;
        if (!list2.isEmpty()) {
            map.put("promotions", list2);
        }
        Map map2 = this.c;
        if (!map2.isEmpty()) {
            map.put("impressions", map2);
        }
        map.put("productAction", null);
        return qle.a(map, 0);
    }
}
