package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class LRUMap<K, V> implements LookupCache<K, V>, Serializable {
    private static final long serialVersionUID = 2;
    protected final int _initialEntries;
    protected final transient PrivateMaxEntriesMap<K, V> _map;
    protected final int _maxEntries;

    public LRUMap(int i2, int i3) {
        this._initialEntries = i2;
        this._maxEntries = i3;
        PrivateMaxEntriesMap.Builder builder = new PrivateMaxEntriesMap.Builder();
        builder.initialCapacity(i2);
        builder.maximumCapacity(i3);
        builder.concurrencyLevel(4);
        this._map = builder.build();
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public void clear() {
        this._map.clear();
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public void contents(BiConsumer<K, V> biConsumer) {
        for (Map.Entry<K, V> entry : this._map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public LookupCache<K, V> emptyCopy() {
        return new LRUMap(this._initialEntries, this._maxEntries);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V get(Object obj) {
        return this._map.get(obj);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V put(K k2, V v) {
        return this._map.put(k2, v);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V putIfAbsent(K k2, V v) {
        return this._map.putIfAbsent(k2, v);
    }

    protected Object readResolve() {
        return new LRUMap(this._initialEntries, this._maxEntries);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public int size() {
        return this._map.size();
    }
}
