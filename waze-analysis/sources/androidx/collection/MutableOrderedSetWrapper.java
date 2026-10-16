package androidx.collection;

import h.g.b.a.a;
import h.g.b.a.f;
import h.g.b.x;
import h.m.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, f {
    private final MutableOrderedScatterSet<E> parent;

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.MutableOrderedSetWrapper$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<E>, a {
        private int current = -1;
        private final Iterator<E> iterator;
        final /* synthetic */ MutableOrderedSetWrapper<E> this$0;

        AnonymousClass1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper) {
            this.this$0 = mutableOrderedSetWrapper;
            this.iterator = k.a(new MutableOrderedSetWrapper$iterator$1$iterator$1(mutableOrderedSetWrapper, this, null));
        }

        public final int getCurrent() {
            return this.current;
        }

        public final Iterator<E> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current != -1) {
                ((MutableOrderedSetWrapper) this.this$0).parent.removeElementAt(this.current);
                this.current = -1;
            }
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper(MutableOrderedScatterSet<E> mutableOrderedScatterSet) {
        super(mutableOrderedScatterSet);
        x.f(mutableOrderedScatterSet, "parent");
        this.parent = mutableOrderedScatterSet;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean add(E e2) {
        return this.parent.add(e2);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        x.f(collection, "elements");
        return this.parent.addAll(collection);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.parent.remove(obj);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        return this.parent.removeAll(collection);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        return this.parent.retainAll(collection);
    }
}
