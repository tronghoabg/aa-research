package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import androidx.collection.SieveCacheKt;
import h.ab;
import h.g.a.l;
import h.g.b.n;
import h.g.b.o;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);

    /* compiled from: WazeSource */
    public final class SlotIdsSet implements Collection<Object>, j$.util.Collection<Object>, h.g.b.a.a {
        public static final int $stable = 8;
        private final MutableOrderedScatterSet<Object> set;

        public /* synthetic */ SlotIdsSet(MutableOrderedScatterSet mutableOrderedScatterSet, int i2, o oVar) {
            this((i2 & 1) != 0 ? OrderedScatterSetKt.mutableOrderedScatterSetOf() : mutableOrderedScatterSet);
        }

        @Override // java.util.Collection
        /* renamed from: add$ui, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.set.contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void fastForEach(l<Object, ab> lVar) {
            MutableOrderedScatterSet<Object> set = getSet();
            Object[] objArr = set.elements;
            long[] jArr = set.nodes;
            int i2 = set.tail;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = jArr[i2] >> 31;
                lVar.invoke(objArr[i2]);
                i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
            }
        }

        public final void forEach(l<Object, ab> lVar) {
            MutableOrderedScatterSet<Object> mutableOrderedScatterSet = this.set;
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i2 = mutableOrderedScatterSet.tail;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = jArr[i2] >> 31;
                lVar.invoke(objArr[i2]);
                i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
            }
        }

        public final MutableOrderedScatterSet<Object> getSet() {
            return this.set;
        }

        public int getSize() {
            return this.set.getSize();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.set.asMutableSet().iterator();
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.set.remove(obj);
        }

        public final boolean removeAll(l<Object, Boolean> lVar) {
            int i2;
            MutableOrderedScatterSet<Object> mutableOrderedScatterSet = this.set;
            int size = mutableOrderedScatterSet.getSize();
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
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
                                if (lVar.invoke(objArr[i6]).booleanValue()) {
                                    mutableOrderedScatterSet.removeElementAt(i6);
                                }
                            }
                            j2 >>= 8;
                            i5++;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            return size != this.set.getSize();
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(l<Object, Boolean> lVar) {
            int i2;
            MutableOrderedScatterSet<Object> mutableOrderedScatterSet = this.set;
            Object[] objArr = mutableOrderedScatterSet.elements;
            int size = mutableOrderedScatterSet.getSize();
            long[] jArr = mutableOrderedScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
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
                                if (!lVar.invoke(objArr[i6]).booleanValue()) {
                                    mutableOrderedScatterSet.removeElementAt(i6);
                                }
                            }
                            j2 >>= 8;
                            i5++;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            return size != mutableOrderedScatterSet.getSize();
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
        public /* synthetic */ Spliterator spliterator() {
            return Collection.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return n.a(this);
        }

        public final void trimToSize(int i2) {
            this.set.trimToSize(i2);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) n.b(this, tArr);
        }

        public SlotIdsSet(MutableOrderedScatterSet<Object> mutableOrderedScatterSet) {
            this.set = mutableOrderedScatterSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ void getSet$annotations() {
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection<?> collection) {
            return this.set.retainAll((java.util.Collection<? extends Object>) collection);
        }

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection<?> collection) {
            return this.set.remove(collection);
        }
    }
}
