package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.b.a.a;
import h.g.b.n;
import h.g.b.o;
import h.g.b.x;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, j$.util.List<Modifier.Node>, a {
    public static final int $stable = 8;
    private MutableObjectList<Object> values = new MutableObjectList<>(16);
    private MutableLongList distanceFromEdgeAndFlags = new MutableLongList(16);
    private int hitDepth = -1;

    /* renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    private final long m9962findBestHitDistancefn2tFes() {
        long jDistanceAndFlags = HitTestResultKt.DistanceAndFlags(Float.POSITIVE_INFINITY, false, false & ((4 & 4) == 0));
        int i2 = this.hitDepth + 1;
        HitTestResult hitTestResult = this;
        x.f(hitTestResult, "<this>");
        int size = hitTestResult.size() - 1;
        if (i2 <= size) {
            while (true) {
                long j2 = this.distanceFromEdgeAndFlags.get(i2);
                if (DistanceAndFlags.m9939compareTo9YPOF3E(j2, jDistanceAndFlags) < 0) {
                    jDistanceAndFlags = j2;
                }
                if ((DistanceAndFlags.m9943getDistanceimpl(jDistanceAndFlags) < 0.0f && DistanceAndFlags.m9946isInLayerimpl(jDistanceAndFlags)) || i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return jDistanceAndFlags;
    }

    private final void removeNodeAtDepth(int i2) {
        this.values.removeAt(i2);
        this.distanceFromEdgeAndFlags.removeAt(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int i2, int i3) {
        if (i2 >= i3) {
            return;
        }
        this.values.removeRange(i2, i3);
        this.distanceFromEdgeAndFlags.removeRange(i2, i3);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.clear();
        this.distanceFromEdgeAndFlags.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int i2) {
        Object obj = this.values.get(i2);
        x.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int getSize() {
        return this.values.getSize();
    }

    public final boolean hasHit() {
        long jM9962findBestHitDistancefn2tFes = m9962findBestHitDistancefn2tFes();
        return DistanceAndFlags.m9943getDistanceimpl(jM9962findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m9946isInLayerimpl(jM9962findBestHitDistancefn2tFes) && !DistanceAndFlags.m9945isInExpandedBoundsimpl(jM9962findBestHitDistancefn2tFes);
    }

    public final void hit(Modifier.Node node, boolean z, h.g.a.a<ab> aVar) {
        int i2 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z, false));
        aVar.invoke();
        this.hitDepth = i2;
    }

    public final void hitExpandedTouchBounds(Modifier.Node node, boolean z, h.g.a.a<ab> aVar) {
        int i2 = this.hitDepth;
        HitTestResult hitTestResult = this;
        x.f(hitTestResult, "<this>");
        if (i2 == hitTestResult.size() - 1) {
            int i3 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, z, true));
            aVar.invoke();
            this.hitDepth = i3;
            return;
        }
        long jM9962findBestHitDistancefn2tFes = m9962findBestHitDistancefn2tFes();
        int i4 = this.hitDepth;
        if (!DistanceAndFlags.m9945isInExpandedBoundsimpl(jM9962findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m9943getDistanceimpl(jM9962findBestHitDistancefn2tFes) > 0.0f) {
                int i5 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.add(node);
                this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, z, true));
                aVar.invoke();
                this.hitDepth = i5;
                return;
            }
            return;
        }
        x.f(hitTestResult, "<this>");
        this.hitDepth = hitTestResult.size() - 1;
        int i6 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, z, true));
        aVar.invoke();
        this.hitDepth = i6;
        if (DistanceAndFlags.m9943getDistanceimpl(m9962findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i4 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i4;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f2, boolean z, h.g.a.a<ab> aVar) {
        int i2 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f2, z, false));
        aVar.invoke();
        this.hitDepth = i2;
    }

    public int indexOf(Modifier.Node node) {
        HitTestResult hitTestResult = this;
        x.f(hitTestResult, "<this>");
        int size = hitTestResult.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (!x.n(this.values.get(i2), node)) {
                if (i2 != size) {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f2, boolean z) {
        int i2 = this.hitDepth;
        x.f(this, "<this>");
        if (i2 == r1.size() - 1) {
            return true;
        }
        return DistanceAndFlags.m9939compareTo9YPOF3E(m9962findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags(f2, z, false & ((4 & 4) == 0))) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public int lastIndexOf(Modifier.Node node) {
        HitTestResult hitTestResult = this;
        x.f(hitTestResult, "<this>");
        for (int size = hitTestResult.size() - 1; size >= 0; size--) {
            if (x.n(this.values.get(size), node)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(h.g.a.a<ab> aVar) {
        int i2 = this.hitDepth;
        aVar.invoke();
        this.hitDepth = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(Modifier.Node node, float f2, boolean z, h.g.a.a<ab> aVar) {
        int i2 = this.hitDepth;
        HitTestResult hitTestResult = this;
        x.f(hitTestResult, "<this>");
        if (i2 == hitTestResult.size() - 1) {
            int i3 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f2, z, false));
            aVar.invoke();
            this.hitDepth = i3;
            int i4 = this.hitDepth + 1;
            x.f(hitTestResult, "<this>");
            if (i4 == hitTestResult.size() - 1 || DistanceAndFlags.m9945isInExpandedBoundsimpl(m9962findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jM9962findBestHitDistancefn2tFes = m9962findBestHitDistancefn2tFes();
        int i5 = this.hitDepth;
        x.f(hitTestResult, "<this>");
        this.hitDepth = hitTestResult.size() - 1;
        int i6 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f2, z, false));
        aVar.invoke();
        this.hitDepth = i6;
        long jM9962findBestHitDistancefn2tFes2 = m9962findBestHitDistancefn2tFes();
        int i7 = this.hitDepth + 1;
        x.f(hitTestResult, "<this>");
        if (i7 >= hitTestResult.size() - 1 || DistanceAndFlags.m9939compareTo9YPOF3E(jM9962findBestHitDistancefn2tFes, jM9962findBestHitDistancefn2tFes2) <= 0) {
            removeNodesInRange(this.hitDepth + 1, size());
        } else {
            int i8 = i5 + 1;
            boolean zM9945isInExpandedBoundsimpl = DistanceAndFlags.m9945isInExpandedBoundsimpl(jM9962findBestHitDistancefn2tFes2);
            int i9 = this.hitDepth;
            removeNodesInRange(i8, zM9945isInExpandedBoundsimpl ? i9 + 2 : i9 + 1);
        }
        this.hitDepth = i5;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public java.util.List<Modifier.Node> subList(int i2, int i3) {
        return new SubList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return n.a(this);
    }

    /* compiled from: WazeSource */
    final class SubList implements java.util.List<Modifier.Node>, j$.util.List<Modifier.Node>, a {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i2, int i3) {
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i2, java.util.Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addFirst(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addLast(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Modifier.Node get(int i2) {
            E e2 = HitTestResult.this.values.get(i2 + this.minIndex);
            x.d(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e2;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public int indexOf(Modifier.Node node) {
            int i2 = this.minIndex;
            int i3 = this.maxIndex;
            if (i2 > i3) {
                return -1;
            }
            while (!x.n(HitTestResult.this.values.get(i2), node)) {
                if (i2 == i3) {
                    return -1;
                }
                i2++;
            }
            return i2 - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            int i2 = this.maxIndex;
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i3, i3, i2);
        }

        public int lastIndexOf(Modifier.Node node) {
            int i2 = this.minIndex;
            int i3 = this.maxIndex;
            if (i2 > i3) {
                return -1;
            }
            while (!x.n(HitTestResult.this.values.get(i3), node)) {
                if (i3 == i2) {
                    return -1;
                }
                i3--;
            }
            return i3 - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i2) {
            int i3 = this.minIndex;
            return HitTestResult.this.new HitTestResultIterator(i2 + i3, i3, this.maxIndex);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, j$.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List, j$.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
        public /* synthetic */ Spliterator spliterator() {
            return List.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.List
        public java.util.List<Modifier.Node> subList(int i2, int i3) {
            int i4 = this.minIndex;
            return HitTestResult.this.new SubList(i2 + i4, i4 + i3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return n.a(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeFirst, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m9965removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeLast, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m9966removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) n.b(this, tArr);
        }

        public boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            int i2 = this.maxIndex;
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i3, i3, i2);
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }
    }

    /* compiled from: WazeSource */
    final class HitTestResultIterator implements ListIterator<Modifier.Node>, a {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i2, int i3, int i4, int i5, o oVar) {
            i4 = (i5 & 4) != 0 ? hitTestResult.size() : i4;
            int i6 = i5 & 2;
            int i7 = i5 & 1;
            this(1 == i7 ? 0 : i2, i6 != 0 ? 0 : i3, i4);
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i2 = this.index;
            this.index = i2 + 1;
            E e2 = mutableObjectList.get(i2);
            x.d(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e2;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i2 = this.index - 1;
            this.index = i2;
            E e2 = mutableObjectList.get(i2);
            x.d(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e2;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i2, int i3, int i4) {
            this.index = i2;
            this.minIndex = i3;
            this.maxIndex = i4;
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m9963removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m9964removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) n.b(this, tArr);
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i2) {
        return new HitTestResultIterator(this, i2, 0, 0, 6, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f2, boolean z, boolean z2, h.g.a.a<ab> aVar) {
        int i2 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f2, z, z2));
        aVar.invoke();
        this.hitDepth = i2;
    }
}
