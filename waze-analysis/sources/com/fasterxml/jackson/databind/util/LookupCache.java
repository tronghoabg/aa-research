package com.fasterxml.jackson.databind.util;

import java.util.function.BiConsumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface LookupCache<K, V> {

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.LookupCache$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$contents(LookupCache lookupCache, BiConsumer biConsumer) {
            throw new UnsupportedOperationException();
        }

        public static LookupCache $default$emptyCopy(LookupCache lookupCache) {
            throw new UnsupportedOperationException("LookupCache implementation " + lookupCache.getClass().getName() + " does not implement `emptyCopy()`");
        }
    }

    void clear();

    void contents(BiConsumer<K, V> biConsumer);

    LookupCache<K, V> emptyCopy();

    V get(Object obj);

    V put(K k2, V v);

    V putIfAbsent(K k2, V v);

    int size();
}
