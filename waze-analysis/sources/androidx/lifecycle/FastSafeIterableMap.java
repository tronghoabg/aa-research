package androidx.lifecycle;

import androidx.collection.MutableScatterMap;
import h.ab;
import h.g.a.l;
import h.g.b.a.a;
import h.g.b.x;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FastSafeIterableMap<K, V> {
    private Entry<K, V> head;
    private final MutableScatterMap<K, Entry<K, V>> map = new MutableScatterMap<>(0, 1, null);
    private Entry<K, V> tail;

    /* compiled from: WazeSource */
    final class Entry<K, V> implements Map.Entry<K, V>, a {
        private boolean isRemoved;
        private final K key;
        private Entry<K, V> next;
        private Entry<K, V> prev;
        private final V value;

        public Entry(K k2, V v) {
            this.key = k2;
            this.value = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Entry copy$default(Entry entry, Object obj, Object obj2, int i2, Object obj3) {
            if ((i2 & 1) != 0) {
                obj = entry.key;
            }
            if ((i2 & 2) != 0) {
                obj2 = entry.value;
            }
            return entry.copy(obj, obj2);
        }

        public final K component1() {
            return this.key;
        }

        public final V component2() {
            return this.value;
        }

        public final Entry<K, V> copy(K k2, V v) {
            return new Entry<>(k2, v);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return x.n(this.key, entry.key) && x.n(this.value, entry.value);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        public final Entry<K, V> getNext() {
            return this.next;
        }

        public final Entry<K, V> getPrev() {
            return this.prev;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.key;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.value;
            return (iHashCode * 31) + (v != null ? v.hashCode() : 0);
        }

        public final boolean isRemoved() {
            return this.isRemoved;
        }

        public final void markRemoved() {
            this.isRemoved = true;
        }

        public final void setNext(Entry<K, V> entry) {
            this.next = entry;
        }

        public final void setPrev(Entry<K, V> entry) {
            this.prev = entry;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "Entry(key=" + this.key + ", value=" + this.value + ")";
        }
    }

    public final Map.Entry<K, V> ceil(K k2) {
        x.f(k2, "key");
        Entry<K, V> entry = this.map.get(k2);
        return entry != null ? entry.getPrev() : null;
    }

    public final boolean contains(K k2) {
        x.f(k2, "key");
        return this.map.containsKey(k2);
    }

    public final Map.Entry<K, V> first() {
        Entry<K, V> entry = this.head;
        if (entry != null) {
            return entry;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final void forEachReversed(l<? super Map.Entry<? extends K, ? extends V>, ab> lVar) {
        x.f(lVar, "action");
        for (Entry<K, V> prev = this.tail; prev != null; prev = prev.getPrev()) {
            if (!prev.isRemoved()) {
                lVar.invoke(prev);
            }
        }
    }

    public final void forEachWithAdditions(l<? super Map.Entry<? extends K, ? extends V>, ab> lVar) {
        x.f(lVar, "action");
        for (Entry<K, V> next = this.head; next != null; next = next.getNext()) {
            if (!next.isRemoved()) {
                lVar.invoke(next);
            }
        }
    }

    public final Map.Entry<K, V> last() {
        Entry<K, V> entry = this.tail;
        if (entry != null) {
            return entry;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final Map.Entry<K, V> lastOrNull() {
        return this.tail;
    }

    public final V putIfAbsent(K k2, V v) {
        x.f(k2, "key");
        x.f(v, "value");
        Entry<K, V> entry = this.map.get(k2);
        if (entry != null) {
            return entry.getValue();
        }
        Entry<K, V> entry2 = new Entry<>(k2, v);
        this.map.set(k2, entry2);
        Entry<K, V> entry3 = this.tail;
        if (entry3 == null) {
            this.head = entry2;
            this.tail = entry2;
            return null;
        }
        entry3.setNext(entry2);
        entry2.setPrev(this.tail);
        this.tail = entry2;
        return null;
    }

    public final V remove(K k2) {
        x.f(k2, "key");
        Entry<K, V> entryRemove = this.map.remove(k2);
        if (entryRemove == null) {
            return null;
        }
        if (entryRemove.getPrev() == null) {
            this.head = entryRemove.getNext();
        } else {
            Entry<K, V> prev = entryRemove.getPrev();
            if (prev != null) {
                prev.setNext(entryRemove.getNext());
            }
        }
        if (entryRemove.getNext() == null) {
            this.tail = entryRemove.getPrev();
        } else {
            Entry<K, V> next = entryRemove.getNext();
            if (next != null) {
                next.setPrev(entryRemove.getPrev());
            }
        }
        entryRemove.markRemoved();
        return entryRemove.getValue();
    }

    public final int size() {
        return this.map.getSize();
    }
}
