package h.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class u<E> extends o<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f48016a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private int f48017b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f48018c;

    /* renamed from: d, reason: collision with root package name */
    private int f48019d;

    public u(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = f48016a;
        } else {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i2);
            }
            objArr = new Object[i2];
        }
        this.f48018c = objArr;
    }

    private final int g(int i2) {
        return i2 == 0 ? c.A(this.f48018c) : i2 - 1;
    }

    private final int h(int i2) {
        h.g.b.x.f(this.f48018c, "<this>");
        if (i2 == r1.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    private final int i(int i2) {
        return i2 < 0 ? i2 + this.f48018c.length : i2;
    }

    private final int j(int i2) {
        int length = this.f48018c.length;
        return i2 >= length ? i2 - length : i2;
    }

    private final void k(int i2, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f48018c.length;
        while (i2 < length && it.hasNext()) {
            this.f48018c[i2] = it.next();
            i2++;
        }
        int i3 = this.f48017b;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f48018c[i4] = it.next();
        }
        this.f48019d = size() + collection.size();
    }

    private final void l(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f48018c;
        int length = objArr.length;
        if (i2 <= length) {
            return;
        }
        if (objArr == f48016a) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f48018c = new Object[i2];
            return;
        }
        Object[] objArr2 = new Object[c.d(length, i2)];
        c.at(objArr, objArr2, 0, this.f48017b, length);
        Object[] objArr3 = this.f48018c;
        int length2 = objArr3.length;
        int i3 = this.f48017b;
        c.at(objArr3, objArr2, length2 - i3, 0, i3);
        this.f48017b = 0;
        this.f48018c = objArr2;
    }

    private final void m(int i2, int i3) {
        Object[] objArr = this.f48018c;
        if (i2 < i3) {
            c.j(objArr, null, i2, i3);
        } else {
            c.j(objArr, null, i2, objArr.length);
            c.j(this.f48018c, null, 0, i3);
        }
    }

    private final void n() {
        this.modCount++;
    }

    public final Object a() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f48018c[this.f48017b];
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        c.b(i2, size());
        if (i2 == size()) {
            addLast(e2);
            return;
        }
        if (i2 == 0) {
            addFirst(e2);
            return;
        }
        n();
        l(size() + 1);
        int iJ = j(this.f48017b + i2);
        if (i2 < ((size() + 1) >> 1)) {
            int iG = g(iJ);
            int iG2 = g(this.f48017b);
            int i3 = this.f48017b;
            Object[] objArr = this.f48018c;
            if (iG >= i3) {
                objArr[iG2] = objArr[i3];
                c.at(objArr, objArr, i3, i3 + 1, iG + 1);
            } else {
                c.at(objArr, objArr, i3 - 1, i3, objArr.length);
                Object[] objArr2 = this.f48018c;
                objArr2[objArr2.length - 1] = objArr2[0];
                c.at(objArr2, objArr2, 0, 1, iG + 1);
            }
            this.f48018c[iG] = e2;
            this.f48017b = iG2;
        } else {
            int iJ2 = j(this.f48017b + size());
            Object[] objArr3 = this.f48018c;
            if (iJ < iJ2) {
                c.at(objArr3, objArr3, iJ + 1, iJ, iJ2);
            } else {
                c.at(objArr3, objArr3, 1, 0, iJ2);
                Object[] objArr4 = this.f48018c;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                c.at(objArr4, objArr4, iJ + 1, iJ, length);
            }
            this.f48018c[iJ] = e2;
        }
        this.f48019d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        h.g.b.x.f(collection, "elements");
        c.b(i2, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(collection);
        }
        n();
        l(size() + collection.size());
        int iJ = j(this.f48017b + size());
        int iJ2 = j(this.f48017b + i2);
        int size = collection.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.f48017b;
            int i4 = i3 - size;
            if (iJ2 >= i3) {
                Object[] objArr = this.f48018c;
                if (i4 >= 0) {
                    c.at(objArr, objArr, i4, i3, iJ2);
                } else {
                    int length = objArr.length;
                    i4 += length;
                    int i5 = length - i4;
                    if (i5 >= iJ2 - i3) {
                        c.at(objArr, objArr, i4, i3, iJ2);
                    } else {
                        c.at(objArr, objArr, i4, i3, i3 + i5);
                        Object[] objArr2 = this.f48018c;
                        c.at(objArr2, objArr2, 0, this.f48017b + i5, iJ2);
                    }
                }
            } else {
                Object[] objArr3 = this.f48018c;
                c.at(objArr3, objArr3, i4, i3, objArr3.length);
                Object[] objArr4 = this.f48018c;
                if (size >= iJ2) {
                    c.at(objArr4, objArr4, objArr4.length - size, 0, iJ2);
                } else {
                    c.at(objArr4, objArr4, objArr4.length - size, 0, size);
                    Object[] objArr5 = this.f48018c;
                    c.at(objArr5, objArr5, 0, size, iJ2);
                }
            }
            this.f48017b = i4;
            k(i(iJ2 - size), collection);
        } else {
            int i6 = iJ2 + size;
            Object[] objArr6 = this.f48018c;
            if (iJ2 < iJ) {
                int i7 = size + iJ;
                int length2 = objArr6.length;
                if (i7 <= length2) {
                    c.at(objArr6, objArr6, i6, iJ2, iJ);
                } else if (i6 >= length2) {
                    c.at(objArr6, objArr6, i6 - length2, iJ2, iJ);
                } else {
                    int i8 = iJ - (i7 - length2);
                    c.at(objArr6, objArr6, 0, i8, iJ);
                    Object[] objArr7 = this.f48018c;
                    c.at(objArr7, objArr7, i6, iJ2, i8);
                }
            } else {
                c.at(objArr6, objArr6, size, 0, iJ);
                Object[] objArr8 = this.f48018c;
                int length3 = objArr8.length;
                if (i6 >= length3) {
                    c.at(objArr8, objArr8, i6 - length3, iJ2, length3);
                } else {
                    c.at(objArr8, objArr8, 0, length3 - size, length3);
                    Object[] objArr9 = this.f48018c;
                    c.at(objArr9, objArr9, i6, iJ2, objArr9.length - size);
                }
            }
            k(iJ2, collection);
        }
        return true;
    }

    public final void addFirst(E e2) {
        n();
        l(size() + 1);
        int iG = g(this.f48017b);
        this.f48017b = iG;
        this.f48018c[iG] = e2;
        this.f48019d = size() + 1;
    }

    public final void addLast(E e2) {
        n();
        l(size() + 1);
        this.f48018c[j(this.f48017b + size())] = e2;
        this.f48019d = size() + 1;
    }

    public final Object b() {
        if (isEmpty()) {
            return null;
        }
        return this.f48018c[this.f48017b];
    }

    public final Object c() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f48018c[j(this.f48017b + i.e(this))];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            m(this.f48017b, j(this.f48017b + size()));
        }
        this.f48017b = 0;
        this.f48019d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object d() {
        if (isEmpty()) {
            return null;
        }
        return this.f48018c[j(this.f48017b + i.e(this))];
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        c.a(i2, size());
        return (E) this.f48018c[j(this.f48017b + i2)];
    }

    @Override // h.a.o
    public final int getSize() {
        return this.f48019d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iJ = j(this.f48017b + size());
        int length = this.f48017b;
        if (length < iJ) {
            while (length < iJ) {
                if (!h.g.b.x.n(obj, this.f48018c[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f48017b) < iJ) {
            return -1;
        }
        int length2 = this.f48018c.length;
        while (length < length2) {
            if (!h.g.b.x.n(obj, this.f48018c[length])) {
                length++;
            }
        }
        for (int i3 = 0; i3 < iJ; i3++) {
            if (h.g.b.x.n(obj, this.f48018c[i3])) {
                length = i3 + this.f48018c.length;
                i2 = this.f48017b;
                return length - i2;
            }
        }
        return -1;
        i2 = this.f48017b;
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iA;
        int i2;
        int iJ = j(this.f48017b + size());
        int i3 = this.f48017b;
        if (i3 < iJ) {
            iA = iJ - 1;
            if (i3 <= iA) {
                while (!h.g.b.x.n(obj, this.f48018c[iA])) {
                    if (iA != i3) {
                        iA--;
                    }
                }
                i2 = this.f48017b;
            }
            return -1;
        }
        if (!isEmpty() && this.f48017b >= iJ) {
            int i4 = iJ - 1;
            while (true) {
                Object[] objArr = this.f48018c;
                if (i4 < 0) {
                    iA = c.A(objArr);
                    int i5 = this.f48017b;
                    if (i5 <= iA) {
                        while (!h.g.b.x.n(obj, this.f48018c[iA])) {
                            if (iA != i5) {
                                iA--;
                            }
                        }
                    }
                } else {
                    if (h.g.b.x.n(obj, objArr[i4])) {
                        iA = i4 + this.f48018c.length;
                        i2 = this.f48017b;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
        return iA - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iJ;
        Object[] objArr;
        h.g.b.x.f(collection, "elements");
        boolean z = false;
        if (isEmpty() || this.f48018c.length == 0) {
            return false;
        }
        int iJ2 = j(this.f48017b + size());
        int i2 = this.f48017b;
        if (i2 < iJ2) {
            iJ = i2;
            while (true) {
                objArr = this.f48018c;
                if (i2 >= iJ2) {
                    break;
                }
                Object obj = objArr[i2];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.f48018c[iJ] = obj;
                    iJ++;
                }
                i2++;
            }
            c.j(objArr, null, iJ, iJ2);
        } else {
            int length = this.f48018c.length;
            boolean z2 = false;
            int i3 = i2;
            while (i2 < length) {
                Object[] objArr2 = this.f48018c;
                Object obj2 = objArr2[i2];
                objArr2[i2] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.f48018c[i3] = obj2;
                    i3++;
                }
                i2++;
            }
            iJ = j(i3);
            for (int i4 = 0; i4 < iJ2; i4++) {
                Object[] objArr3 = this.f48018c;
                Object obj3 = objArr3[i4];
                objArr3[i4] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.f48018c[iJ] = obj3;
                    iJ = h(iJ);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        n();
        this.f48019d = i(iJ - this.f48017b);
        return true;
    }

    @Override // h.a.o
    public final E removeAt(int i2) {
        c.a(i2, size());
        u<E> uVar = this;
        if (i2 == i.e(uVar)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        n();
        int iJ = j(this.f48017b + i2);
        E e2 = (E) this.f48018c[iJ];
        int size = size() >> 1;
        int i3 = this.f48017b;
        if (i2 < size) {
            Object[] objArr = this.f48018c;
            if (iJ >= i3) {
                c.at(objArr, objArr, i3 + 1, i3, iJ);
            } else {
                c.at(objArr, objArr, 1, 0, iJ);
                Object[] objArr2 = this.f48018c;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i4 = this.f48017b;
                c.at(objArr2, objArr2, i4 + 1, i4, length);
            }
            Object[] objArr3 = this.f48018c;
            int i5 = this.f48017b;
            objArr3[i5] = null;
            this.f48017b = h(i5);
        } else {
            int iJ2 = j(i3 + i.e(uVar));
            Object[] objArr4 = this.f48018c;
            if (iJ <= iJ2) {
                c.at(objArr4, objArr4, iJ, iJ + 1, iJ2 + 1);
            } else {
                c.at(objArr4, objArr4, iJ, iJ + 1, objArr4.length);
                Object[] objArr5 = this.f48018c;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.at(objArr5, objArr5, 0, 1, iJ2 + 1);
            }
            this.f48018c[iJ2] = null;
        }
        this.f48019d = size() - 1;
        return e2;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f48018c;
        int i2 = this.f48017b;
        E e2 = (E) objArr[i2];
        objArr[i2] = null;
        this.f48017b = h(i2);
        this.f48019d = size() - 1;
        return e2;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int iJ = j(this.f48017b + i.e(this));
        Object[] objArr = this.f48018c;
        E e2 = (E) objArr[iJ];
        objArr[iJ] = null;
        this.f48019d = size() - 1;
        return e2;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        c.c(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == size()) {
            clear();
            return;
        }
        if (i4 == 1) {
            remove(i2);
            return;
        }
        n();
        int size = size() - i3;
        int i5 = this.f48017b;
        if (i2 < size) {
            int iJ = j(i5 + (i2 - 1));
            int iJ2 = j(this.f48017b + (i3 - 1));
            while (i2 > 0) {
                int i6 = iJ + 1;
                int iMin = Math.min(i2, Math.min(i6, iJ2 + 1));
                Object[] objArr = this.f48018c;
                int i7 = iJ2 - iMin;
                int i8 = iJ - iMin;
                c.at(objArr, objArr, i7 + 1, i8 + 1, i6);
                iJ = i(i8);
                iJ2 = i(i7);
                i2 -= iMin;
            }
            int iJ3 = j(this.f48017b + i4);
            m(this.f48017b, iJ3);
            this.f48017b = iJ3;
        } else {
            int iJ4 = j(i5 + i3);
            int iJ5 = j(this.f48017b + i2);
            int size2 = size();
            while (true) {
                size2 -= i3;
                if (size2 <= 0) {
                    break;
                }
                int length = this.f48018c.length;
                i3 = Math.min(size2, Math.min(length - iJ4, length - iJ5));
                Object[] objArr2 = this.f48018c;
                int i9 = iJ4 + i3;
                c.at(objArr2, objArr2, iJ5, iJ4, i9);
                iJ4 = j(i9);
                iJ5 = j(iJ5 + i3);
            }
            int iJ6 = j(this.f48017b + size());
            m(i(iJ6 - i4), iJ6);
        }
        this.f48019d = size() - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iJ;
        Object[] objArr;
        h.g.b.x.f(collection, "elements");
        boolean z = false;
        if (isEmpty() || this.f48018c.length == 0) {
            return false;
        }
        int iJ2 = j(this.f48017b + size());
        int i2 = this.f48017b;
        if (i2 < iJ2) {
            iJ = i2;
            while (true) {
                objArr = this.f48018c;
                if (i2 >= iJ2) {
                    break;
                }
                Object obj = objArr[i2];
                if (collection.contains(obj)) {
                    this.f48018c[iJ] = obj;
                    iJ++;
                } else {
                    z = true;
                }
                i2++;
            }
            c.j(objArr, null, iJ, iJ2);
        } else {
            int length = this.f48018c.length;
            boolean z2 = false;
            int i3 = i2;
            while (i2 < length) {
                Object[] objArr2 = this.f48018c;
                Object obj2 = objArr2[i2];
                objArr2[i2] = null;
                if (collection.contains(obj2)) {
                    this.f48018c[i3] = obj2;
                    i3++;
                } else {
                    z2 = true;
                }
                i2++;
            }
            iJ = j(i3);
            for (int i4 = 0; i4 < iJ2; i4++) {
                Object[] objArr3 = this.f48018c;
                Object obj3 = objArr3[i4];
                objArr3[i4] = null;
                if (collection.contains(obj3)) {
                    this.f48018c[iJ] = obj3;
                    iJ = h(iJ);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        n();
        this.f48019d = i(iJ - this.f48017b);
        return true;
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        c.a(i2, size());
        int iJ = j(this.f48017b + i2);
        Object[] objArr = this.f48018c;
        E e3 = (E) objArr[iJ];
        objArr[iJ] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) throws NegativeArraySizeException {
        h.g.b.x.f(tArr, "array");
        if (tArr.length < size()) {
            int size = size();
            h.g.b.x.f(tArr, TypedValues.Custom.S_REFERENCE);
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), size);
            h.g.b.x.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        T[] tArr2 = tArr;
        int iJ = j(this.f48017b + size());
        int i2 = this.f48017b;
        if (i2 < iJ) {
            c.aL(this.f48018c, tArr2, 0, i2, iJ, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f48018c;
            c.at(objArr, tArr2, 0, this.f48017b, objArr.length);
            Object[] objArr2 = this.f48018c;
            c.at(objArr2, tArr2, objArr2.length - this.f48017b, 0, iJ);
        }
        i.aS(size(), tArr2);
        return tArr2;
    }

    public u() {
        this.f48018c = f48016a;
    }

    public u(Collection collection) {
        h.g.b.x.f(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.f48018c = array;
        int length = array.length;
        this.f48019d = length;
        if (length == 0) {
            this.f48018c = f48016a;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        h.g.b.x.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n();
        l(size() + collection.size());
        k(j(this.f48017b + size()), collection);
        return true;
    }
}
