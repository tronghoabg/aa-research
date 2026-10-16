package androidx.compose.runtime.collection;

import h.a.i;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.a.a;
import h.g.b.a.b;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    public T[] content;
    private List<T> list;
    private int size;

    /* compiled from: WazeSource */
    final class VectorListIterator<T> implements ListIterator<T>, a {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i2) {
            this.list = list;
            this.index = i2;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.list.add(this.index, t);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i2 = this.index;
            this.index = i2 + 1;
            return this.list.get(i2);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i2 = this.index - 1;
            this.index = i2;
            return this.list.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i2 = this.index - 1;
            this.index = i2;
            this.list.remove(i2);
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.index, t);
        }
    }

    public MutableVector(T[] tArr, int i2) {
        this.content = tArr;
        this.size = i2;
    }

    public final void add(int i2, T t) {
        int i3 = this.size + 1;
        if (this.content.length < i3) {
            resizeStorage(i3);
        }
        T[] tArr = this.content;
        int i4 = this.size;
        if (i2 != i4) {
            System.arraycopy(tArr, i2, tArr, i2 + 1, i4 - i2);
        }
        tArr[i2] = t;
        this.size++;
    }

    public final boolean addAll(int i2, Collection<? extends T> collection) {
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i4 = this.size + size;
        if (this.content.length < i4) {
            resizeStorage(i4);
        }
        T[] tArr = this.content;
        int i5 = this.size;
        if (i2 != i5) {
            System.arraycopy(tArr, i2, tArr, i2 + size, i5 - i2);
        }
        for (T t : collection) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                i.p();
            }
            tArr[i3 + i2] = t;
            i3 = i6;
        }
        this.size += size;
        return true;
    }

    public final boolean any(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar.invoke(tArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T t) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i2 = 0; !x.n(this.content[i2], t); i2++) {
                if (i2 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(MutableVector<T> mutableVector) {
        j jVarU = n.u(0, mutableVector.getSize());
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return true;
        }
        while (contains(mutableVector.content[iA])) {
            if (iA == iB) {
                return true;
            }
            iA++;
        }
        return false;
    }

    public final boolean contentEquals(MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size < 0) {
            return true;
        }
        for (int i2 = 0; x.n(mutableVector.content[i2], this.content[i2]); i2++) {
            if (i2 == size) {
                return true;
            }
        }
        return false;
    }

    public final void ensureCapacity(int i2) {
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T first(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ?? r3 = (Object) tArr[i2];
            if (lVar.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new e();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T firstOrNull(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ?? r2 = (Object) tArr[i2];
            if (lVar.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final <R> R fold(R r, p<? super R, ? super T, ? extends R> pVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            r = pVar.invoke(r, tArr[i2]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            r = qVar.invoke(Integer.valueOf(i2), r, tArr[i2]);
        }
        return r;
    }

    public final <R> R foldRight(R r, p<? super T, ? super R, ? extends R> pVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                r = pVar.invoke(tArr[size], r);
                size--;
            }
        }
        return r;
    }

    public final <R> R foldRightIndexed(R r, q<? super Integer, ? super T, ? super R, ? extends R> qVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                r = qVar.invoke(Integer.valueOf(size), tArr[size], r);
                size--;
            }
        }
        return r;
    }

    public final void forEach(l<? super T, ab> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(tArr[i2]);
        }
    }

    public final void forEachIndexed(p<? super Integer, ? super T, ab> pVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(i2), tArr[i2]);
        }
    }

    public final void forEachReversed(l<? super T, ab> lVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                lVar.invoke(tArr[size]);
                size--;
            }
        }
    }

    public final void forEachReversedIndexed(p<? super Integer, ? super T, ab> pVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                pVar.invoke(Integer.valueOf(size), tArr[size]);
                size--;
            }
        }
    }

    public final T get(int i2) {
        return this.content[i2];
    }

    public final T[] getContent() {
        return this.content;
    }

    public final j getIndices() {
        return n.u(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t) {
        T[] tArr = this.content;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (x.n(t, tArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfFirst(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar.invoke(tArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(l<? super T, Boolean> lVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                if (lVar.invoke(tArr[size]).booleanValue()) {
                    return size;
                }
                size--;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T last(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r2 = (Object) tArr[size];
            if (lVar.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new e();
    }

    public final int lastIndexOf(T t) {
        T[] tArr = this.content;
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            if (x.n(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public final T lastOrNull(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r1 = (Object) tArr[size];
            if (lVar.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        return null;
    }

    public final /* synthetic */ <R> R[] map(l<? super T, ? extends R> lVar) {
        int size = getSize();
        x.i();
        R[] rArr = (R[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            rArr[i2] = lVar.invoke(this.content[i2]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(p<? super Integer, ? super T, ? extends R> pVar) {
        int size = getSize();
        x.i();
        R[] rArr = (R[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            rArr[i2] = pVar.invoke(Integer.valueOf(i2), this.content[i2]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(p<? super Integer, ? super T, ? extends R> pVar) {
        int size = getSize();
        x.i();
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            R rInvoke = pVar.invoke(Integer.valueOf(i3), tArr[i3]);
            if (rInvoke != null) {
                objArr[i2] = rInvoke;
                i2++;
            }
        }
        return new MutableVector<>(objArr, i2);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(l<? super T, ? extends R> lVar) {
        int size = getSize();
        x.i();
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            R rInvoke = lVar.invoke(tArr[i3]);
            if (rInvoke != null) {
                objArr[i2] = rInvoke;
                i2++;
            }
        }
        return new MutableVector<>(objArr, i2);
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final boolean remove(T t) {
        int iIndexOf = indexOf(t);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i2 != this.size;
    }

    public final T removeAt(int i2) {
        T[] tArr = this.content;
        T t = tArr[i2];
        if (i2 != getSize() - 1) {
            int i3 = i2 + 1;
            System.arraycopy(tArr, i3, tArr, i2, this.size - i3);
        }
        int i4 = this.size - 1;
        this.size = i4;
        tArr[i4] = null;
        return t;
    }

    public final void removeIf(l<? super T, Boolean> lVar) {
        int size = getSize();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            T[] tArr = this.content;
            if (i2 >= size) {
                int i4 = size - i3;
                x.f(tArr, "<this>");
                Arrays.fill(tArr, i4, size, (Object) null);
                setSize(i4);
                return;
            }
            if (lVar.invoke(tArr[i2]).booleanValue()) {
                i3++;
            } else if (i3 > 0) {
                T[] tArr2 = this.content;
                tArr2[i2 - i3] = tArr2[i2];
            }
            i2++;
        }
    }

    public final void removeRange(int i2, int i3) {
        if (i3 > i2) {
            int i4 = this.size;
            if (i3 < i4) {
                T[] tArr = this.content;
                System.arraycopy(tArr, i3, tArr, i2, i4 - i3);
            }
            int i5 = this.size - (i3 - i2);
            int size = getSize() - 1;
            if (i5 <= size) {
                int i6 = i5;
                while (true) {
                    this.content[i6] = null;
                    if (i6 == size) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.size = i5;
        }
    }

    public final void resizeStorage(int i2) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i2, length + length)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(Collection<? extends T> collection) {
        int i2 = this.size;
        int size = getSize();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (!collection.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i2 != this.size;
    }

    public final boolean reversedAny(l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        do {
            size--;
            if (size < 0) {
                return false;
            }
        } while (!lVar.invoke(tArr[size]).booleanValue());
        return true;
    }

    public final T set(int i2, T t) {
        T[] tArr = this.content;
        T t2 = tArr[i2];
        tArr[i2] = t;
        return t2;
    }

    public final void setSize(int i2) {
        this.size = i2;
    }

    public final void sortWith(Comparator<T> comparator) {
        T[] tArr = this.content;
        int i2 = this.size;
        x.f(tArr, "<this>");
        x.f(comparator, "comparator");
        Arrays.sort(tArr, 0, i2, comparator);
    }

    public final int sumBy(l<? super T, Integer> lVar) {
        T[] tArr = this.content;
        int iIntValue = 0;
        for (int i2 = 0; i2 < getSize(); i2++) {
            iIntValue += lVar.invoke(tArr[i2]).intValue();
        }
        return iIntValue;
    }

    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new e();
    }

    /* compiled from: WazeSource */
    final class MutableVectorList<T> implements List<T>, b {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            this.vector.add(t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> collection) {
            return this.vector.addAll(i2, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.vector.content[i2];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.vector.removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i2, T t) {
            MutableVectorKt.checkIndex(this, i2);
            return this.vector.set(i2, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            MutableVectorList<T> mutableVectorList = this;
            MutableVectorKt.checkSubIndex(mutableVectorList, i2, i3);
            return new SubList(mutableVectorList, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return h.g.b.n.a(this);
        }

        @Override // java.util.List
        public void add(int i2, T t) {
            this.vector.add(i2, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.g.b.n.b(this, tArr);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }
    }

    /* compiled from: WazeSource */
    final class SubList<T> implements List<T>, b {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i2, int i3) {
            this.list = list;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.List
        public void add(int i2, T t) {
            this.list.add(i2 + this.start, t);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> collection) {
            this.list.addAll(i2 + this.start, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    this.list.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (x.n(this.list.get(i3), obj)) {
                    return true;
                }
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

        @Override // java.util.List
        public T get(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.list.get(i2 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (x.n(this.list.get(i3), obj)) {
                    return i3 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (!x.n(this.list.get(i2), obj)) {
                    if (i2 != i3) {
                        i2--;
                    }
                }
                return i2 - this.start;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (x.n(this.list.get(i3), obj)) {
                    this.list.remove(i3);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i2 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.end;
        }

        public T removeAt(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            this.end--;
            return this.list.remove(i2 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i2 = this.end;
            int i3 = i2 - 1;
            int i4 = this.start;
            if (i4 <= i3) {
                while (true) {
                    if (!collection.contains(this.list.get(i3))) {
                        this.list.remove(i3);
                        this.end--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.end;
        }

        @Override // java.util.List
        public T set(int i2, T t) {
            MutableVectorKt.checkIndex(this, i2);
            return this.list.set(i2 + this.start, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            SubList<T> subList = this;
            MutableVectorKt.checkSubIndex(subList, i2, i3);
            return new SubList(subList, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return h.g.b.n.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.g.b.n.b(this, tArr);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            int i2 = this.end;
            this.end = i2 + 1;
            this.list.add(i2, t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }
    }

    public final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean add(T t) {
        int i2 = this.size + 1;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        tArr[i3] = t;
        this.size = i3 + 1;
        return true;
    }

    public final boolean containsAll(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(MutableVector<T> mutableVector) {
        int i2 = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                remove(mutableVector.content[i3]);
                if (i3 == size) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.size;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new e();
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new e();
    }

    public final boolean containsAll(List<? extends T> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!contains(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(List<? extends T> list) {
        int i2 = this.size;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            remove(list.get(i3));
        }
        return i2 != this.size;
    }

    public final boolean addAll(int i2, MutableVector<T> mutableVector) {
        int i3 = mutableVector.size;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.size + i3;
        if (this.content.length < i4) {
            resizeStorage(i4);
        }
        T[] tArr = this.content;
        int i5 = this.size;
        if (i2 != i5) {
            System.arraycopy(tArr, i2, tArr, i2 + i3, i5 - i2);
        }
        System.arraycopy(mutableVector.content, 0, tArr, i2, i3);
        this.size += i3;
        return true;
    }

    public final boolean addAll(int i2, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i3 = this.size + size;
        if (this.content.length < i3) {
            resizeStorage(i3);
        }
        T[] tArr = this.content;
        int i4 = this.size;
        if (i2 != i4) {
            System.arraycopy(tArr, i2, tArr, i2 + size, i4 - i2);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            tArr[i2 + i5] = list.get(i5);
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }

    public final boolean addAll(List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return false;
        }
        int i2 = this.size + length;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        System.arraycopy(tArr, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }
}
