package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.b.a.a;
import h.g.b.a.b;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import h.m.h;
import h.m.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    /* compiled from: WazeSource */
    final class MutableObjectListIterator<T> implements ListIterator<T>, a {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i2) {
            x.f(list, "list");
            this.list = list;
            this.prevIndex = i2 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            int i2 = this.prevIndex + 1;
            this.prevIndex = i2;
            this.list.add(i2, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() + (-1);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i2 = this.prevIndex + 1;
            this.prevIndex = i2;
            return this.list.get(i2);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i2 = this.prevIndex;
            this.prevIndex = i2 - 1;
            return this.list.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.prevIndex, t);
        }
    }

    public /* synthetic */ MutableObjectList(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 16 : i2);
    }

    private final void throwIndexOutOfBoundsInclusiveException(int i2) {
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableObjectList._size;
        }
        mutableObjectList.trim(i2);
    }

    public final void add(int i2, E e2) {
        if (i2 < 0 || i2 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i2);
        }
        int i3 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i3) {
            resizeStorage(i3, objArr);
        }
        Object[] objArr2 = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            c.at(objArr2, objArr2, i2 + 1, i2, i4);
        }
        objArr2[i2] = e2;
        this._size++;
    }

    public final boolean addAll(int i2, Collection<? extends E> collection) {
        x.f(collection, "elements");
        if (i2 < 0 || i2 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i2);
        }
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = this._size + collection.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (i2 != this._size) {
            c.at(objArr2, objArr2, collection.size() + i2, i2, this._size);
        }
        for (Object obj : collection) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i.p();
            }
            objArr2[i3 + i2] = obj;
            i3 = i4;
        }
        this._size += collection.size();
        return true;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        c.j(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            resizeStorage(i2, objArr);
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> scatterSet) {
        int i2;
        x.f(scatterSet, "elements");
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        remove(objArr[(i3 << 3) + i5]);
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> scatterSet) {
        int i2;
        x.f(scatterSet, "elements");
        if (scatterSet.isEmpty()) {
            return;
        }
        int size = this._size + scatterSet.getSize();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        add(objArr2[(i3 << 3) + i5]);
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final boolean remove(E e2) {
        int iIndexOf = indexOf(e2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(E[] eArr) {
        x.f(eArr, "elements");
        int i2 = this._size;
        for (E e2 : eArr) {
            remove(e2);
        }
        return i2 != this._size;
    }

    public final E removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i2);
        }
        Object[] objArr = this.content;
        E e2 = (E) objArr[i2];
        if (i2 != this._size - 1) {
            c.at(objArr, objArr, i2, i2 + 1, this._size);
        }
        int i3 = this._size - 1;
        this._size = i3;
        objArr[i3] = null;
        return e2;
    }

    public final void removeIf(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = 0;
        j jVarU = n.u(0, this._size);
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA <= iB) {
            while (true) {
                objArr[iA - i3] = objArr[iA];
                if (lVar.invoke(objArr[iA]).booleanValue()) {
                    i3++;
                }
                if (iA == iB) {
                    break;
                } else {
                    iA++;
                }
            }
        }
        c.j(objArr, null, i2 - i3, i2);
        this._size -= i3;
    }

    public final void removeRange(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this._size) || i3 < 0 || i3 > i4) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Start (" + i2 + ") and end (" + i3 + ") must be in 0.." + this._size);
        }
        if (i3 < i2) {
            RuntimeHelpersKt.throwIllegalArgumentException("Start (" + i2 + ") is more than end (" + i3 + ")");
        }
        if (i3 != i2) {
            int i5 = this._size;
            if (i3 < i5) {
                Object[] objArr = this.content;
                c.at(objArr, objArr, i2, i3, i5);
            }
            int i6 = this._size;
            int i7 = i6 - (i3 - i2);
            c.j(this.content, null, i7, i6);
            this._size = i7;
        }
    }

    public final void resizeStorage(int i2, Object[] objArr) {
        x.f(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i2, (length * 3) / 2)];
        c.at(objArr, objArr2, 0, 0, length);
        this.content = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!objectList.contains(objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final E set(int i2, E e2) {
        if (i2 < 0 || i2 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i2);
        }
        Object[] objArr = this.content;
        E e3 = (E) objArr[i2];
        objArr[i2] = e2;
        return e3;
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        Object[] objArr = this.content;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            x.e(objArrCopyOf, "copyOf(...)");
            this.content = objArrCopyOf;
        }
    }

    /* compiled from: WazeSource */
    final class ObjectListMutableList<T> implements List<T>, b {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> mutableObjectList) {
            x.f(mutableObjectList, "objectList");
            this.objectList = mutableObjectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            this.objectList.add(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            x.f(collection, "elements");
            return this.objectList.addAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            x.f(collection, "elements");
            return this.objectList.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.get(i2);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            x.f(collection, "elements");
            return this.objectList.removeAll(collection);
        }

        public T removeAt(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            x.f(collection, "elements");
            return this.objectList.retainAll((Collection<? extends T>) collection);
        }

        @Override // java.util.List
        public T set(int i2, T t) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.set(i2, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            ObjectListMutableList<T> objectListMutableList = this;
            ObjectListKt.checkSubIndex(objectListMutableList, i2, i3);
            return new SubList(objectListMutableList, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            x.f(tArr, "array");
            return (T[]) h.g.b.n.b(this, tArr);
        }

        @Override // java.util.List
        public void add(int i2, T t) {
            this.objectList.add(i2, t);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return h.g.b.n.a(this);
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> collection) {
            x.f(collection, "elements");
            return this.objectList.addAll(i2, collection);
        }
    }

    /* compiled from: WazeSource */
    final class SubList<T> implements List<T>, b {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i2, int i3) {
            x.f(list, "list");
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
            x.f(collection, "elements");
            this.list.addAll(i2 + this.start, collection);
            this.end += collection.size();
            return collection.size() > 0;
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
            x.f(collection, "elements");
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
            ObjectListKt.checkIndex(this, i2);
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
            return new MutableObjectListIterator(this, 0);
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
            return new MutableObjectListIterator(this, 0);
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
            x.f(collection, "elements");
            int i2 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.end;
        }

        public T removeAt(int i2) {
            ObjectListKt.checkIndex(this, i2);
            this.end--;
            return this.list.remove(i2 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            x.f(collection, "elements");
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
            ObjectListKt.checkIndex(this, i2);
            return this.list.set(i2 + this.start, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            SubList<T> subList = this;
            ObjectListKt.checkSubIndex(subList, i2, i3);
            return new SubList(subList, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            x.f(tArr, "array");
            return (T[]) h.g.b.n.b(this, tArr);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return h.g.b.n.a(this);
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
            x.f(collection, "elements");
            this.list.addAll(this.end, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }
    }

    public MutableObjectList(int i2) {
        super(i2, null);
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public final void trim() {
        trim$default(this, 0, 1, null);
    }

    public final boolean removeAll(ScatterSet<E> scatterSet) {
        x.f(scatterSet, "elements");
        int i2 = this._size;
        minusAssign((ScatterSet) scatterSet);
        return i2 != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        int i2 = this._size;
        minusAssign((Iterable) iterable);
        return i2 != this._size;
    }

    public final boolean removeAll(List<? extends E> list) {
        x.f(list, "elements");
        int i2 = this._size;
        minusAssign((List) list);
        return i2 != this._size;
    }

    public final boolean removeAll(h<? extends E> hVar) {
        x.f(hVar, "elements");
        int i2 = this._size;
        minusAssign((h) hVar);
        return i2 != this._size;
    }

    public final boolean removeAll(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        int i2 = this._size;
        minusAssign((ObjectList) objectList);
        return i2 != this._size;
    }

    public final boolean retainAll(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!i.ax(iterable, objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean add(E e2) {
        int i2 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            resizeStorage(i2, objArr);
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        objArr2[i3] = e2;
        this._size = i3 + 1;
        return true;
    }

    public final boolean retainAll(Collection<? extends E> collection) {
        x.f(collection, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!collection.contains(objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean retainAll(h<? extends E> hVar) {
        x.f(hVar, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!k.t(hVar, objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean retainAll(E[] eArr) {
        x.f(eArr, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (c.C(eArr, objArr[i3]) < 0) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(objArr[i3]);
        }
    }

    public final void minusAssign(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(E e2) {
        remove(e2);
    }

    public final void minusAssign(List<? extends E> list) {
        x.f(list, "elements");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(list.get(i2));
        }
    }

    public final void minusAssign(h<? extends E> hVar) {
        x.f(hVar, "elements");
        Iterator<? extends E> it = hVar.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(E[] eArr) {
        x.f(eArr, "elements");
        for (E e2 : eArr) {
            remove(e2);
        }
    }

    public final boolean addAll(int i2, ObjectList<E> objectList) {
        x.f(objectList, "elements");
        if (i2 < 0 || i2 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i2);
        }
        if (objectList.isEmpty()) {
            return false;
        }
        int i3 = this._size + objectList._size;
        Object[] objArr = this.content;
        if (objArr.length < i3) {
            resizeStorage(i3, objArr);
        }
        Object[] objArr2 = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            c.at(objArr2, objArr2, objectList._size + i2, i2, i4);
        }
        c.at(objectList.content, objArr2, i2, 0, objectList._size);
        this._size += objectList._size;
        return true;
    }

    public final void plusAssign(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        if (objectList.isEmpty()) {
            return;
        }
        int i2 = this._size + objectList._size;
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            resizeStorage(i2, objArr);
        }
        c.at(objectList.content, this.content, this._size, 0, objectList._size);
        this._size += objectList._size;
    }

    public final void plusAssign(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(int i2, E[] eArr) {
        x.f(eArr, "elements");
        if (i2 < 0 || i2 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i2);
        }
        int length = eArr.length;
        if (length == 0) {
            return false;
        }
        int i3 = this._size + length;
        Object[] objArr = this.content;
        if (objArr.length < i3) {
            resizeStorage(i3, objArr);
        }
        Object[] objArr2 = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            c.at(objArr2, objArr2, i2 + length, i2, i4);
        }
        c.aL(eArr, objArr2, i2, 0, 0, 12);
        this._size += length;
        return true;
    }

    public final void plusAssign(E e2) {
        add(e2);
    }

    public final void plusAssign(List<? extends E> list) {
        x.f(list, "elements");
        if (list.isEmpty()) {
            return;
        }
        int i2 = this._size;
        int size = list.size() + i2;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            objArr2[i3 + i2] = list.get(i3);
        }
        this._size += list.size();
    }

    public final boolean addAll(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        int i2 = this._size;
        plusAssign((ObjectList) objectList);
        return i2 != this._size;
    }

    public final boolean addAll(ScatterSet<E> scatterSet) {
        x.f(scatterSet, "elements");
        int i2 = this._size;
        plusAssign((ScatterSet) scatterSet);
        return i2 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        int i2 = this._size;
        plusAssign((Iterable) iterable);
        return i2 != this._size;
    }

    public final boolean addAll(List<? extends E> list) {
        x.f(list, "elements");
        int i2 = this._size;
        plusAssign((List) list);
        return i2 != this._size;
    }

    public final boolean addAll(h<? extends E> hVar) {
        x.f(hVar, "elements");
        int i2 = this._size;
        plusAssign((h) hVar);
        return i2 != this._size;
    }

    public final void plusAssign(h<? extends E> hVar) {
        x.f(hVar, "elements");
        Iterator<? extends E> it = hVar.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(E[] eArr) {
        x.f(eArr, "elements");
        int i2 = this._size;
        plusAssign((Object[]) eArr);
        return i2 != this._size;
    }

    public final void plusAssign(E[] eArr) {
        x.f(eArr, "elements");
        int length = eArr.length;
        if (length == 0) {
            return;
        }
        int i2 = this._size + length;
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            resizeStorage(i2, objArr);
        }
        c.aL(eArr, this.content, this._size, 0, 0, 12);
        this._size += length;
    }
}
