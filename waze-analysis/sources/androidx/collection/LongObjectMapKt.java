package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LongObjectMapKt {
    private static final MutableLongObjectMap EmptyLongObjectMap = new MutableLongObjectMap(0);

    public static final <V> LongObjectMap<V> buildLongObjectMap(l<? super MutableLongObjectMap<V>, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        lVar.invoke(mutableLongObjectMap);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> emptyLongObjectMap() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        x.d(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v, long j3, V v2, long j4, V v3, long j5, V v4, long j6, V v5) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        mutableLongObjectMap.set(j4, v3);
        mutableLongObjectMap.set(j5, v4);
        mutableLongObjectMap.set(j6, v5);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v, long j3, V v2, long j4, V v3, long j5, V v4, long j6, V v5) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        mutableLongObjectMap.set(j4, v3);
        mutableLongObjectMap.set(j5, v4);
        mutableLongObjectMap.set(j6, v5);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> buildLongObjectMap(int i2, l<? super MutableLongObjectMap<V>, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(i2);
        lVar.invoke(mutableLongObjectMap);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v, long j3, V v2) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v, long j3, V v2) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v, long j3, V v2, long j4, V v3) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        mutableLongObjectMap.set(j4, v3);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v, long j3, V v2, long j4, V v3) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        mutableLongObjectMap.set(j4, v3);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v, long j3, V v2, long j4, V v3, long j5, V v4) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        mutableLongObjectMap.set(j4, v3);
        mutableLongObjectMap.set(j5, v4);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v, long j3, V v2, long j4, V v3, long j5, V v4) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v);
        mutableLongObjectMap.set(j3, v2);
        mutableLongObjectMap.set(j4, v3);
        mutableLongObjectMap.set(j5, v4);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new MutableLongObjectMap<>(0, 1, null);
    }

    public static final <V> LongObjectMap<V> longObjectMapOf() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        x.d(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return mutableLongObjectMap;
    }
}
