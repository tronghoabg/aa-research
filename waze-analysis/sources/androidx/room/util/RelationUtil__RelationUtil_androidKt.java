package androidx.room.util;

import androidx.collection.ArrayMap;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> arrayMap, boolean z, l<? super ArrayMap<K, V>, ab> lVar) {
        x.f(arrayMap, "map");
        x.f(lVar, "fetchBlock");
        ArrayMap arrayMap2 = new ArrayMap(999);
        int size = arrayMap.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (z) {
                arrayMap2.put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
            } else {
                arrayMap2.put(arrayMap.keyAt(i2), null);
            }
            i2++;
            i3++;
            if (i3 == 999) {
                lVar.invoke(arrayMap2);
                if (!z) {
                    arrayMap.putAll((Map) arrayMap2);
                }
                arrayMap2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            lVar.invoke(arrayMap2);
            if (z) {
                return;
            }
            arrayMap.putAll((Map) arrayMap2);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z, l<? super HashMap<K, V>, ab> lVar) {
        int i2;
        x.f(map, "map");
        x.f(lVar, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i2 = 0;
            for (K k2 : map.keySet()) {
                x.e(k2, "next(...)");
                if (z) {
                    map2.put(k2, map.get(k2));
                } else {
                    map2.put(k2, null);
                }
                i2++;
                if (i2 == 999) {
                    lVar.invoke(map2);
                    if (!z) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i2 > 0) {
            lVar.invoke(map2);
            if (z) {
                return;
            }
            map.putAll(map2);
        }
    }
}
