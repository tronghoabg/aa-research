package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import h.a.a;
import j$.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PersistentHashMapValues<K, V> extends a<V> implements ImmutableCollection<V>, Collection<V> {
    public static final int $stable = 8;
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapValues(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // h.a.a
    public int getSize() {
        return this.map.size();
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<V> iterator() {
        return new PersistentHashMapValuesIterator(this.map.getNode$runtime());
    }
}
