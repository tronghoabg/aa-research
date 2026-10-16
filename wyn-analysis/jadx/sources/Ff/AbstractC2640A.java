package ff;

import ef.C2527k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* renamed from: ff.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2640A extends AbstractC2641B {
    public static Object P(Object obj, Map map) {
        AbstractC3340k.e(map, "<this>");
        return AbstractC2641B.v(obj, map);
    }

    public static HashMap Q(C2527k... c2527kArr) {
        HashMap map = new HashMap(AbstractC2641B.D(c2527kArr.length));
        V(map, c2527kArr);
        return map;
    }

    public static Map R(C2527k... c2527kArr) {
        if (c2527kArr.length <= 0) {
            return w.f35433a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2641B.D(c2527kArr.length));
        V(linkedHashMap, c2527kArr);
        return linkedHashMap;
    }

    public static LinkedHashMap S(C2527k... c2527kArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2641B.D(c2527kArr.length));
        V(linkedHashMap, c2527kArr);
        return linkedHashMap;
    }

    public static LinkedHashMap T(Map map, Map map2) {
        AbstractC3340k.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map U(Map map, C2527k c2527k) {
        AbstractC3340k.e(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC2641B.E(c2527k);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c2527k.f34671a, c2527k.f34672b);
        return linkedHashMap;
    }

    public static final void V(HashMap map, C2527k[] c2527kArr) {
        for (C2527k c2527k : c2527kArr) {
            map.put(c2527k.f34671a, c2527k.f34672b);
        }
    }

    public static List W(LinkedHashMap linkedHashMap) {
        AbstractC3340k.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        v vVar = v.f35432a;
        if (size != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return AbstractC3935e.C(new C2527k(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                arrayList.add(new C2527k(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C2527k(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return vVar;
    }

    public static Map X(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        w wVar = w.f35433a;
        if (!z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Z(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : AbstractC2641B.N(linkedHashMap) : wVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wVar;
        }
        if (size2 == 1) {
            return AbstractC2641B.E((C2527k) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2641B.D(collection.size()));
        Z(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map Y(Map map) {
        AbstractC3340k.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? a0(map) : AbstractC2641B.N(map) : w.f35433a;
    }

    public static final void Z(Iterable iterable, LinkedHashMap linkedHashMap) {
        AbstractC3340k.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C2527k c2527k = (C2527k) it.next();
            linkedHashMap.put(c2527k.f34671a, c2527k.f34672b);
        }
    }

    public static LinkedHashMap a0(Map map) {
        AbstractC3340k.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
