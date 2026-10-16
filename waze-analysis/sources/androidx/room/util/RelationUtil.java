package androidx.room.util;

import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import h.ab;
import h.g.a.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RelationUtil {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> arrayMap, boolean z, l<? super ArrayMap<K, V>, ab> lVar) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z, lVar);
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z, l<? super HashMap<K, V>, ab> lVar) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(map, z, lVar);
    }

    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> longSparseArray, boolean z, l<? super LongSparseArray<V>, ab> lVar) {
        RelationUtil__RelationUtilKt.recursiveFetchLongSparseArray(longSparseArray, z, lVar);
    }

    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z, l<? super Map<K, V>, ab> lVar) {
        RelationUtil__RelationUtilKt.recursiveFetchMap(map, z, lVar);
    }
}
