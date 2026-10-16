package h.a;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;
import l.a.bjc;
import l.a.bjl;
import l.a.bla;
import l.a.bld;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class r {
    public static final /* synthetic */ com.waze.shared_infra.s.c A(bld bldVar) {
        h.g.b.x.f(bldVar, "builder");
        return new com.waze.shared_infra.s.c(bldVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c B(bla blaVar) {
        h.g.b.x.f(blaVar, "builder");
        return new com.waze.shared_infra.s.c(blaVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c C(bjl bjlVar) {
        h.g.b.x.f(bjlVar, "builder");
        return new com.waze.shared_infra.s.c(bjlVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c D(bjc bjcVar) {
        h.g.b.x.f(bjcVar, "builder");
        return new com.waze.shared_infra.s.c(bjcVar);
    }

    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i2 / 0.75f) + 1.0f);
    }

    public static Map b(Map map) {
        h.g.b.x.f(map, "builder");
        return ((h.a.a.i) map).f();
    }

    public static Map c() {
        return new h.a.a.i();
    }

    public static Map d(int i2) {
        return new h.a.a.i(i2);
    }

    public static Map e(h.k kVar) {
        h.g.b.x.f(kVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(kVar.c(), kVar.d());
        h.g.b.x.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map f(Map map) {
        h.g.b.x.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        h.g.b.x.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap g(Map map) {
        h.g.b.x.f(map, "<this>");
        return new TreeMap(map);
    }

    public static Object h(Map map, Object obj) {
        h.g.b.x.f(map, "<this>");
        h.g.b.x.f(map, "<this>");
        if (map instanceof al) {
            return ((al) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static LinkedHashMap i(h.k... kVarArr) {
        h.g.b.x.f(kVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(kVarArr.length));
        x(kVarArr, linkedHashMap);
        return linkedHashMap;
    }

    public static Map j() {
        return ad.f47968a;
    }

    public static Map k(h.k... kVarArr) {
        h.g.b.x.f(kVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(kVarArr.length));
        h.g.b.x.f(kVarArr, "<this>");
        h.g.b.x.f(linkedHashMap, "destination");
        v(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static Map l(Map map, Object obj) {
        h.g.b.x.f(map, "<this>");
        Map mapT = t(map);
        mapT.remove(obj);
        return n(mapT);
    }

    public static Map m(h.k... kVarArr) {
        h.g.b.x.f(kVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(kVarArr.length));
        v(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static Map n(Map map) {
        h.g.b.x.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : f(map) : j();
    }

    public static Map o(Map map, Map map2) {
        h.g.b.x.f(map, "<this>");
        h.g.b.x.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map p(Map map, h.k kVar) {
        h.g.b.x.f(map, "<this>");
        h.g.b.x.f(kVar, "pair");
        if (map.isEmpty()) {
            return e(kVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(kVar.c(), kVar.d());
        return linkedHashMap;
    }

    public static Map q(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            h.g.b.x.f(iterable, "<this>");
            h.g.b.x.f(linkedHashMap, "destination");
            u(linkedHashMap, iterable);
            return n(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ad.f47968a;
        }
        if (size == 1) {
            return e((h.k) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a(collection.size()));
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(linkedHashMap2, "destination");
        u(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map r(Map map) {
        h.g.b.x.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? t(map) : f(map) : j();
    }

    public static Map s(h.k[] kVarArr) {
        h.g.b.x.f(kVarArr, "<this>");
        int length = kVarArr.length;
        if (length == 0) {
            return j();
        }
        if (length == 1) {
            return e(kVarArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(length));
        x(kVarArr, linkedHashMap);
        return linkedHashMap;
    }

    public static Map t(Map map) {
        h.g.b.x.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static void u(Map map, Iterable iterable) {
        h.g.b.x.f(map, "<this>");
        h.g.b.x.f(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h.k kVar = (h.k) it.next();
            map.put(kVar.a(), kVar.b());
        }
    }

    public static void v(Map map, h.k[] kVarArr) {
        h.g.b.x.f(map, "<this>");
        h.g.b.x.f(kVarArr, "pairs");
        for (h.k kVar : kVarArr) {
            map.put(kVar.a(), kVar.b());
        }
    }

    public static h.m.h w(Map map) {
        h.g.b.x.f(map, "<this>");
        return i.av(map.entrySet());
    }

    public static void x(h.k[] kVarArr, Map map) {
        h.g.b.x.f(kVarArr, "<this>");
        h.g.b.x.f(map, "destination");
        v(map, kVarArr);
    }

    public static final void y(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                z(autoCloseable);
                return;
            }
            try {
                z(autoCloseable);
            } catch (Throwable th2) {
                e.a.h.ad.c(th, th2);
            }
        }
    }

    public static /* synthetic */ void z(Object obj) throws Exception {
        ((AutoCloseable) obj).close();
    }
}
