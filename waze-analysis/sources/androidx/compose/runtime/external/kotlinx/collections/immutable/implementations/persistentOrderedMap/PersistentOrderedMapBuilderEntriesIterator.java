package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import h.g.b.a.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, a {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        PersistentOrderedMapBuilderLinksIterator<K, V> persistentOrderedMapBuilderLinksIterator = this.internal;
        return new MutableMapEntry(persistentOrderedMapBuilderLinksIterator.getBuilder$runtime().getHashMapBuilder$runtime(), this.internal.getLastIteratedKey$runtime(), persistentOrderedMapBuilderLinksIterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }
}
