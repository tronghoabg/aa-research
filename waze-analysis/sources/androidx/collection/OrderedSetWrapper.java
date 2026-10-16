package androidx.collection;

import e.b.c;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.n;
import h.g.b.x;
import h.m.j;
import h.m.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
class OrderedSetWrapper<E> implements Set<E>, a {
    private final OrderedScatterSet<E> parent;

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.OrderedSetWrapper$iterator$1, reason: invalid class name */
    final class AnonymousClass1 extends f implements p<j<? super E>, e<? super ab>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ OrderedSetWrapper<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OrderedSetWrapper<E> orderedSetWrapper, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = orderedSetWrapper;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(j<? super E> jVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            j jVar;
            Object[] objArr;
            long[] jArr;
            int i2;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i3 = this.label;
            if (i3 == 0) {
                c.b(obj);
                jVar = (j) this.L$0;
                OrderedScatterSet orderedScatterSet = ((OrderedSetWrapper) this.this$0).parent;
                objArr = orderedScatterSet.elements;
                jArr = orderedScatterSet.nodes;
                i2 = orderedScatterSet.tail;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                jArr = (long[]) this.L$2;
                objArr = (Object[]) this.L$1;
                jVar = (j) this.L$0;
                c.b(obj);
            }
            while (i2 != Integer.MAX_VALUE) {
                long j2 = jArr[i2] >> 31;
                Object obj2 = objArr[i2];
                this.L$0 = jVar;
                this.L$1 = objArr;
                this.L$2 = jArr;
                i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
                this.I$0 = i2;
                this.label = 1;
                if (jVar.a(obj2, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
    }

    public OrderedSetWrapper(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "parent");
        this.parent = orderedScatterSet;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        x.f(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return x.n(this.parent, ((OrderedSetWrapper) obj).parent);
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return k.a(new AnonymousClass1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return n.a(this);
    }
}
