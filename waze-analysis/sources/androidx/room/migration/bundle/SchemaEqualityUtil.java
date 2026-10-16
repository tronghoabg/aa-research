package androidx.room.migration.bundle;

import h.a.r;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SchemaEqualityUtil {
    public static final SchemaEqualityUtil INSTANCE = new SchemaEqualityUtil();

    private SchemaEqualityUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K extends SchemaEquality<K>> boolean checkSchemaEquality(List<? extends K> list, List<? extends K> list2) {
        if (list == null) {
            return list2 == null;
        }
        if (list2 == null || list.size() != list2.size()) {
            return false;
        }
        List<? extends K> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return true;
        }
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            SchemaEquality schemaEquality = (SchemaEquality) it.next();
            List<? extends K> list4 = list2;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (INSTANCE.checkSchemaEquality(schemaEquality, (SchemaEquality) it2.next())) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ <K, R> Map<K, R> filterValuesInstance(Map<K, ?> map) {
        x.f(map, "<this>");
        Map mapC = r.c();
        for (Map.Entry<K, ?> entry : map.entrySet()) {
            K key = entry.getKey();
            Object value = entry.getValue();
            x.i();
            if (value instanceof Object) {
                mapC.put(key, value);
            }
        }
        return r.b(mapC);
    }

    public final <K extends SchemaEquality<K>> boolean checkSchemaEquality(K k2, K k3) {
        if (k2 == null) {
            return k3 == null;
        }
        if (k3 != null) {
            return k2.isSchemaEqual(k3);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T, K extends SchemaEquality<K>> boolean checkSchemaEquality(Map<T, ? extends K> map, Map<T, ? extends K> map2) {
        if (map == null) {
            return map2 == null;
        }
        if (map2 == null || map.size() != map2.size()) {
            return false;
        }
        Set<Map.Entry<T, ? extends K>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!INSTANCE.checkSchemaEquality((SchemaEquality) entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
