package androidx.collection;

import h.a.i;
import h.g.b.a.a;
import h.g.b.a.b;
import h.g.b.n;
import h.g.b.x;
import h.m.k;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableValues<K, V> implements Collection<V>, b {
    private final MutableScatterMap<K, V> parent;

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.MutableValues$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<V>, a {
        private int current = -1;
        private final Iterator<Integer> iterator;
        final /* synthetic */ MutableValues<K, V> this$0;

        AnonymousClass1(MutableValues<K, V> mutableValues) {
            this.this$0 = mutableValues;
            this.iterator = k.a(new MutableValues$iterator$1$iterator$1(mutableValues, null));
        }

        public final int getCurrent() {
            return this.current;
        }

        public final Iterator<Integer> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            this.current = this.iterator.next().intValue();
            return (V) ((MutableValues) this.this$0).parent.values[this.current];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            ((MutableValues) this.this$0).parent.removeValueAt(this.current);
            this.current = -1;
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }
    }

    public MutableValues(MutableScatterMap<K, V> mutableScatterMap) {
        x.f(mutableScatterMap, "parent");
        this.parent = mutableScatterMap;
    }

    @Override // java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        x.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        x.f(collection, "elements");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.parent.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i4;
                                if (x.n(this.parent.values[i6], obj)) {
                                    this.parent.removeValueAt(i6);
                                    return true;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int i2;
        x.f(collection, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        if (i.ax(collection, this.parent.values[i6])) {
                            this.parent.removeValueAt(i6);
                            z = true;
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i3 == length) {
                return z;
            }
            i3++;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        int i2;
        x.f(collection, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        if (!i.ax(collection, this.parent.values[i6])) {
                            this.parent.removeValueAt(i6);
                            z = true;
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i3 == length) {
                return z;
            }
            i3++;
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        x.f(tArr, "array");
        return (T[]) n.b(this, tArr);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return n.a(this);
    }
}
