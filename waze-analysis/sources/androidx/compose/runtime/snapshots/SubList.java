package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import h.a.aj;
import h.e;
import h.g.b.a.a;
import h.g.b.a.b;
import h.g.b.ao;
import h.g.b.x;
import h.k.n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SubList<T> implements List<T>, b {
    public static final int $stable = 8;
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public SubList(SnapshotStateList<T> snapshotStateList, int i2, int i3) {
        this.parentList = snapshotStateList;
        this.offset = i2;
        this.structure = SnapshotStateListKt.getStructure(snapshotStateList);
        this.size = i3 - i2;
    }

    private final void validateModification() {
        if (SnapshotStateListKt.getStructure(this.parentList) != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        validateModification();
        this.parentList.add(this.offset + size(), t);
        this.size = size() + 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends T> collection) {
        validateModification();
        boolean zAddAll = this.parentList.addAll(i2 + this.offset, collection);
        if (zAddAll) {
            this.size = size() + collection.size();
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i2 = this.offset;
            snapshotStateList.removeRange(i2, size() + i2);
            this.size = 0;
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i2) {
        validateModification();
        SnapshotStateListKt.validateRange(i2, size());
        return this.parentList.get(this.offset + i2);
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i2 = this.offset;
        Iterator<Integer> it = n.u(i2, size() + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((aj) it).nextInt();
            if (x.n(obj, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        for (int size = (this.offset + size()) - 1; size >= this.offset; size--) {
            if (x.n(obj, this.parentList.get(size))) {
                return size - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i2) {
        validateModification();
        ao aoVar = new ao();
        aoVar.f48103a = i2 - 1;
        return new AnonymousClass1(aoVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public T removeAt(int i2) {
        validateModification();
        T tRemove = this.parentList.remove(this.offset + i2);
        this.size = size() - 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        validateModification();
        int i2 = this.offset;
        int iRetainAllInRange$runtime = this.parentList.retainAllInRange$runtime(collection, i2, size() + i2);
        if (iRetainAllInRange$runtime > 0) {
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
            this.size = size() - iRetainAllInRange$runtime;
        }
        return iRetainAllInRange$runtime > 0;
    }

    @Override // java.util.List
    public T set(int i2, T t) {
        SnapshotStateListKt.validateRange(i2, size());
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        T t2 = snapshotStateList.set(i2 + this.offset, t);
        this.structure = SnapshotStateListKt.getStructure(snapshotStateList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > size()) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i4 = this.offset;
        return new SubList(snapshotStateList, i2 + i4, i3 + i4);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return h.g.b.n.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) h.g.b.n.b(this, tArr);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements ListIterator<T>, a {
        final /* synthetic */ ao $current;
        final /* synthetic */ SubList<T> this$0;

        AnonymousClass1(ao aoVar, SubList<T> subList) {
            this.$current = aoVar;
            this.this$0 = subList;
        }

        @Override // java.util.ListIterator
        public Void add(T t) {
            SnapshotStateListKt.modificationError();
            throw new e();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.$current.f48103a < this.this$0.size() + (-1);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.$current.f48103a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i2 = this.$current.f48103a + 1;
            SnapshotStateListKt.validateRange(i2, this.this$0.size());
            this.$current.f48103a = i2;
            return this.this$0.get(i2);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.$current.f48103a + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            SubList<T> subList = this.this$0;
            int i2 = this.$current.f48103a;
            SnapshotStateListKt.validateRange(i2, subList.size());
            this.$current.f48103a = i2 - 1;
            return this.this$0.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.$current.f48103a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Void remove() {
            SnapshotStateListKt.modificationError();
            throw new e();
        }

        @Override // java.util.ListIterator
        public Void set(T t) {
            SnapshotStateListKt.modificationError();
            throw new e();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            add((AnonymousClass1) obj);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            set((AnonymousClass1) obj);
        }
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i2) {
        return removeAt(i2);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public void add(int i2, T t) {
        validateModification();
        this.parentList.add(this.offset + i2, t);
        this.size = size() + 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
