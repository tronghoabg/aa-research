package androidx.collection;

import h.a.i;
import h.g.b.a.a;
import h.g.b.a.f;
import h.g.b.n;
import h.g.b.x;
import h.m.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableKeys<K, V> implements Set<K>, f {
    private final MutableScatterMap<K, V> parent;

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.MutableKeys$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<K>, a {
        private int current = -1;
        private final Iterator<Integer> iterator;
        final /* synthetic */ MutableKeys<K, V> this$0;

        AnonymousClass1(MutableKeys<K, V> mutableKeys) {
            this.this$0 = mutableKeys;
            this.iterator = k.a(new MutableKeys$iterator$1$iterator$1(mutableKeys, null));
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
        public K next() {
            this.current = this.iterator.next().intValue();
            return (K) ((MutableKeys) this.this$0).parent.keys[this.current];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            ((MutableKeys) this.this$0).parent.removeValueAt(this.current);
            this.current = -1;
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }
    }

    public MutableKeys(MutableScatterMap<K, V> mutableScatterMap) {
        x.f(mutableScatterMap, "parent");
        this.parent = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> collection) {
        x.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        x.f(collection, "elements");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.parent.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<K> iterator() {
        return new AnonymousClass1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r10 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.collection.MutableScatterMap<K, V> r2 = r0.parent
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
            if (r1 == 0) goto Lf
            int r4 = r1.hashCode()
            goto L10
        Lf:
            r4 = 0
        L10:
            int r5 = r2._capacity
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r6
            int r6 = r4 << 16
            r4 = r4 ^ r6
            int r6 = r4 >>> 7
            r6 = r6 & r5
            r7 = 0
        L1d:
            r8 = r4 & 127(0x7f, float:1.78E-43)
            long[] r9 = r2.metadata
            r10 = r6 & 7
            int r11 = r6 >> 3
            r12 = r9[r11]
            int r10 = r10 << 3
            long r12 = r12 >>> r10
            r14 = 1
            int r11 = r11 + r14
            r15 = r9[r11]
            int r9 = 64 - r10
            long r15 = r15 << r9
            long r9 = (long) r10
            long r9 = -r9
            r17 = r4
            r11 = 0
            long r3 = (long) r8
            r8 = 63
            long r8 = r9 >> r8
            long r8 = r8 & r15
            long r8 = r8 | r12
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r3 = r3 * r12
            long r3 = r3 ^ r8
            r12 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r12 = r12 + r3
            long r3 = ~r3
            long r3 = r3 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r12
        L52:
            r15 = 0
            int r10 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r10 == 0) goto L70
            int r10 = java.lang.Long.numberOfTrailingZeros(r3)
            int r10 = r10 >> 3
            int r10 = r10 + r6
            r10 = r10 & r5
            java.lang.Object[] r15 = r2.keys
            r15 = r15[r10]
            boolean r15 = h.g.b.x.n(r15, r1)
            if (r15 == 0) goto L6b
            goto L7a
        L6b:
            r15 = -1
            long r15 = r15 + r3
            long r3 = r3 & r15
            goto L52
        L70:
            long r3 = ~r8
            r10 = 6
            long r3 = r3 << r10
            long r3 = r3 & r8
            long r3 = r3 & r12
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 == 0) goto L83
            r10 = -1
        L7a:
            if (r10 < 0) goto L82
            androidx.collection.MutableScatterMap<K, V> r0 = r0.parent
            r0.removeValueAt(r10)
            return r14
        L82:
            return r11
        L83:
            int r7 = r7 + 8
            int r6 = r6 + r7
            r6 = r6 & r5
            r4 = r17
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
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
                        if (i.ax(collection, this.parent.keys[i6])) {
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

    @Override // java.util.Set, java.util.Collection
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
                        if (!i.ax(collection, this.parent.keys[i6])) {
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

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        x.f(tArr, "array");
        return (T[]) n.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return n.a(this);
    }
}
