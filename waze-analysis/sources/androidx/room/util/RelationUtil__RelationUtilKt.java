package androidx.room.util;

import androidx.collection.LongSparseArray;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class RelationUtil__RelationUtilKt {
    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> longSparseArray, boolean z, l<? super LongSparseArray<V>, ab> lVar) {
        x.f(longSparseArray, "map");
        x.f(lVar, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray2 = new LongSparseArray<>(999);
        int size = longSparseArray.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (z) {
                longSparseArray2.put(longSparseArray.keyAt(i2), longSparseArray.valueAt(i2));
            } else {
                longSparseArray2.put(longSparseArray.keyAt(i2), null);
            }
            i2++;
            i3++;
            if (i3 == 999) {
                lVar.invoke(longSparseArray2);
                if (!z) {
                    longSparseArray.putAll(longSparseArray2);
                }
                longSparseArray2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            lVar.invoke(longSparseArray2);
            if (z) {
                return;
            }
            longSparseArray.putAll(longSparseArray2);
        }
    }

    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z, l<? super Map<K, V>, ab> lVar) {
        int i2;
        x.f(map, "map");
        x.f(lVar, "fetchBlock");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0: while (true) {
            i2 = 0;
            for (K k2 : map.keySet()) {
                if (z) {
                    linkedHashMap.put(k2, map.get(k2));
                } else {
                    linkedHashMap.put(k2, null);
                }
                i2++;
                if (i2 == 999) {
                    lVar.invoke(linkedHashMap);
                    if (!z) {
                        map.putAll(linkedHashMap);
                    }
                    linkedHashMap.clear();
                }
            }
            break loop0;
        }
        if (i2 > 0) {
            lVar.invoke(linkedHashMap);
            if (z) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}
