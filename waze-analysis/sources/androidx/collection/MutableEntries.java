package androidx.collection;

import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.a.f;
import h.g.b.au;
import h.g.b.n;
import h.g.b.x;
import h.m.j;
import h.m.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, f {
    private final MutableScatterMap<K, V> parent;

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.MutableEntries$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Map.Entry<K, V>>, a {
        private int current = -1;
        private Iterator<? extends Map.Entry<K, V>> iterator;
        final /* synthetic */ MutableEntries<K, V> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name and collision with other inner class name */
        final class C00181 extends h.c.b.a.f implements p<j<? super Map.Entry<K, V>>, e<? super ab>, Object> {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ MutableEntries<K, V> this$0;
            final /* synthetic */ AnonymousClass1 this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00181(MutableEntries<K, V> mutableEntries, AnonymousClass1 anonymousClass1, e<? super C00181> eVar) {
                super(2, eVar);
                this.this$0 = mutableEntries;
                this.this$1 = anonymousClass1;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00181 c00181 = new C00181(this.this$0, this.this$1, eVar);
                c00181.L$0 = obj;
                return c00181;
            }

            @Override // h.g.a.p
            public final Object invoke(j<? super Map.Entry<K, V>> jVar, e<? super ab> eVar) {
                return ((C00181) create(jVar, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:21:0x00b8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b4 -> B:22:0x00bb). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cd -> B:27:0x00ce). Please report as a decompilation issue!!! */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries.AnonymousClass1.C00181.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        AnonymousClass1(MutableEntries<K, V> mutableEntries) {
            this.this$0 = mutableEntries;
            this.iterator = k.a(new C00181(mutableEntries, this, null));
        }

        public final int getCurrent() {
            return this.current;
        }

        public final Iterator<Map.Entry<K, V>> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            ((MutableEntries) this.this$0).parent.removeValueAt(this.current);
            this.current = -1;
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }

        public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
            x.f(it, "<set-?>");
            this.iterator = it;
        }
    }

    public MutableEntries(MutableScatterMap<K, V> mutableScatterMap) {
        x.f(mutableScatterMap, "parent");
        this.parent = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry<K, V> entry) {
        x.f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        x.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    public boolean contains(Map.Entry<K, V> entry) {
        x.f(entry, "element");
        return x.n(this.parent.get(entry.getKey()), entry.getValue());
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
            Map.Entry entry = (Map.Entry) it.next();
            if (!x.n(this.parent.get(entry.getKey()), entry.getValue())) {
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
    public Iterator<Map.Entry<K, V>> iterator() {
        return new AnonymousClass1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        r19 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.util.Map.Entry<K, V> r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "element"
            r2 = r21
            h.g.b.x.f(r2, r1)
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L18
            int r5 = r3.hashCode()
            goto L19
        L18:
            r5 = 0
        L19:
            int r6 = r1._capacity
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r7
            int r7 = r5 << 16
            r5 = r5 ^ r7
            int r7 = r5 >>> 7
            r7 = r7 & r6
            r8 = 0
        L26:
            r9 = r5 & 127(0x7f, float:1.78E-43)
            long[] r10 = r1.metadata
            r11 = r7 & 7
            int r12 = r7 >> 3
            r13 = r10[r12]
            int r11 = r11 << 3
            long r13 = r13 >>> r11
            r15 = 1
            int r12 = r12 + r15
            r16 = r10[r12]
            int r10 = 64 - r11
            long r16 = r16 << r10
            long r10 = (long) r11
            long r10 = -r10
            r18 = r5
            r12 = 0
            long r4 = (long) r9
            r9 = 63
            long r9 = r10 >> r9
            long r9 = r16 & r9
            long r9 = r9 | r13
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r13
            long r4 = r4 ^ r9
            r13 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r13 = r13 + r4
            long r4 = ~r4
            long r4 = r4 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r13
        L5d:
            r16 = 0
            int r11 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r11 == 0) goto L7f
            int r11 = java.lang.Long.numberOfTrailingZeros(r4)
            int r11 = r11 >> 3
            int r11 = r11 + r7
            r11 = r11 & r6
            r19 = r12
            java.lang.Object[] r12 = r1.keys
            r12 = r12[r11]
            boolean r12 = h.g.b.x.n(r12, r3)
            if (r12 == 0) goto L78
            goto L8b
        L78:
            r11 = -1
            long r11 = r11 + r4
            long r4 = r4 & r11
            r12 = r19
            goto L5d
        L7f:
            r19 = r12
            long r4 = ~r9
            r11 = 6
            long r4 = r4 << r11
            long r4 = r4 & r9
            long r4 = r4 & r13
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto La4
            r11 = -1
        L8b:
            if (r11 < 0) goto La3
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            java.lang.Object[] r1 = r1.values
            r1 = r1[r11]
            java.lang.Object r2 = r2.getValue()
            boolean r1 = h.g.b.x.n(r1, r2)
            if (r1 == 0) goto La3
            androidx.collection.MutableScatterMap<K, V> r0 = r0.parent
            r0.removeValueAt(r11)
            return r15
        La3:
            return r19
        La4:
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r5 = r18
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries.remove(java.util.Map$Entry):boolean");
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
                        Iterator<?> it = collection.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (x.n(entry.getKey(), this.parent.keys[i6]) && x.n(entry.getValue(), this.parent.values[i6])) {
                                this.parent.removeValueAt(i6);
                                z = true;
                                break;
                            }
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
                        Iterator<?> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                this.parent.removeValueAt(i6);
                                z = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!x.n(entry.getKey(), this.parent.keys[i6]) || !x.n(entry.getValue(), this.parent.values[i6])) {
                            }
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

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (au.f(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (au.f(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }
}
