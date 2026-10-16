package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class afaz<E> extends afau<E> {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d;

    public afaz(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = b;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(a.bp(i, "Illegal Capacity: "));
            }
            objArr = new Object[i];
        }
        this.d = objArr;
    }

    private final int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        this.d.getClass();
        return r0.length - 1;
    }

    private final int i(int i) {
        this.d.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    private final int j(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int k(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void l(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void m(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            if (i < 10) {
                i = 10;
            }
            this.d = new Object[i];
            return;
        }
        Object[] objArr2 = new Object[woy.dC(length, i)];
        int i2 = this.c;
        objArr.getClass();
        System.arraycopy(objArr, i2, objArr2, 0, length - i2);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i3 = this.c;
        objArr3.getClass();
        System.arraycopy(objArr3, 0, objArr2, length2 - i3, i3);
        this.c = 0;
        this.d = objArr2;
    }

    private final void n(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            woy.cE(objArr, null, i, i2);
        } else {
            woy.cE(objArr, null, i, objArr.length);
            woy.cE(this.d, null, 0, i2);
        }
    }

    private final void o() {
        this.modCount++;
    }

    public final Object a() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        a.aH(i, this.a);
        if (i == this.a) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        o();
        m(this.a + 1);
        int iK = k(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int iH = h(iK);
            int iH2 = h(this.c);
            int i3 = this.c;
            Object[] objArr = this.d;
            if (iH >= i3) {
                objArr[iH2] = objArr[i3];
                woy.dq(objArr, objArr, i3, i3 + 1, iH + 1);
            } else {
                woy.dq(objArr, objArr, i3 - 1, i3, objArr.length);
                Object[] objArr2 = this.d;
                objArr2[objArr2.length - 1] = objArr2[0];
                woy.dq(objArr2, objArr2, 0, 1, iH + 1);
            }
            this.d[iH] = e;
            this.c = iH2;
        } else {
            int iK2 = k(this.c + i2);
            Object[] objArr3 = this.d;
            if (iK < iK2) {
                woy.dq(objArr3, objArr3, iK + 1, iK, iK2);
            } else {
                woy.dq(objArr3, objArr3, 1, 0, iK2);
                Object[] objArr4 = this.d;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                woy.dq(objArr4, objArr4, iK + 1, iK, length);
            }
            this.d[iK] = e;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        a.aH(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        o();
        m(this.a + collection.size());
        int iK = k(this.c + this.a);
        int iK2 = k(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (iK2 >= i2) {
                Object[] objArr = this.d;
                if (i3 >= 0) {
                    woy.dq(objArr, objArr, i3, i2, iK2);
                } else {
                    int length = objArr.length;
                    i3 += length;
                    int i4 = length - i3;
                    if (i4 >= iK2 - i2) {
                        woy.dq(objArr, objArr, i3, i2, iK2);
                    } else {
                        woy.dq(objArr, objArr, i3, i2, i2 + i4);
                        Object[] objArr2 = this.d;
                        woy.dq(objArr2, objArr2, 0, this.c + i4, iK2);
                    }
                }
            } else {
                Object[] objArr3 = this.d;
                woy.dq(objArr3, objArr3, i3, i2, objArr3.length);
                Object[] objArr4 = this.d;
                if (size >= iK2) {
                    woy.dq(objArr4, objArr4, objArr4.length - size, 0, iK2);
                } else {
                    woy.dq(objArr4, objArr4, objArr4.length - size, 0, size);
                    Object[] objArr5 = this.d;
                    woy.dq(objArr5, objArr5, 0, size, iK2);
                }
            }
            this.c = i3;
            l(j(iK2 - size), collection);
        } else {
            int i5 = iK2 + size;
            Object[] objArr6 = this.d;
            if (iK2 < iK) {
                int i6 = size + iK;
                int length2 = objArr6.length;
                if (i6 <= length2) {
                    woy.dq(objArr6, objArr6, i5, iK2, iK);
                } else if (i5 >= length2) {
                    woy.dq(objArr6, objArr6, i5 - length2, iK2, iK);
                } else {
                    int i7 = iK - (i6 - length2);
                    woy.dq(objArr6, objArr6, 0, i7, iK);
                    Object[] objArr7 = this.d;
                    woy.dq(objArr7, objArr7, i5, iK2, i7);
                }
            } else {
                woy.dq(objArr6, objArr6, size, 0, iK);
                Object[] objArr8 = this.d;
                int length3 = objArr8.length;
                if (i5 >= length3) {
                    woy.dq(objArr8, objArr8, i5 - length3, iK2, length3);
                } else {
                    woy.dq(objArr8, objArr8, 0, length3 - size, length3);
                    Object[] objArr9 = this.d;
                    woy.dq(objArr9, objArr9, i5, iK2, objArr9.length - size);
                }
            }
            l(iK2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        m(this.a + 1);
        int iH = h(this.c);
        this.c = iH;
        this.d[iH] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        o();
        m(this.a + 1);
        this.d[k(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.afau
    public final int b() {
        return this.a;
    }

    public final Object c() {
        if (isEmpty()) {
            return null;
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            n(this.c, k(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.afau
    public final Object d(int i) {
        a.aG(i, this.a);
        if (i == this.a - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iK = k(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[iK];
        int i2 = this.a;
        int i3 = i2 >> 1;
        int i4 = this.c;
        if (i < i3) {
            if (iK >= i4) {
                objArr.getClass();
                objArr.getClass();
                System.arraycopy(objArr, i4, objArr, i4 + 1, iK - i4);
            } else {
                objArr.getClass();
                objArr.getClass();
                System.arraycopy(objArr, 0, objArr, 1, iK);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i5 = this.c;
                objArr2.getClass();
                objArr2.getClass();
                System.arraycopy(objArr2, i5, objArr2, i5 + 1, length - i5);
            }
            Object[] objArr3 = this.d;
            int i6 = this.c;
            objArr3[i6] = null;
            this.c = i(i6);
        } else {
            int iK2 = k(i4 + (i2 - 1));
            Object[] objArr4 = this.d;
            if (iK <= iK2) {
                int i7 = iK + 1;
                objArr4.getClass();
                objArr4.getClass();
                System.arraycopy(objArr4, i7, objArr4, iK, (iK2 + 1) - i7);
            } else {
                int i8 = iK + 1;
                int length2 = objArr4.length;
                objArr4.getClass();
                objArr4.getClass();
                System.arraycopy(objArr4, i8, objArr4, iK, length2 - i8);
                Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                objArr5.getClass();
                objArr5.getClass();
                System.arraycopy(objArr5, 1, objArr5, 0, iK2);
            }
            this.d[iK2] = null;
        }
        this.a--;
        return obj;
    }

    public final Object e() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[k(this.c + woy.bh(this))];
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.d[k(this.c + woy.bh(this))];
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        a.aG(i, this.a);
        return (E) this.d[k(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iK = k(this.c + this.a);
        int length = this.c;
        if (length < iK) {
            while (length < iK) {
                if (!affa.f(obj, this.d[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || length < iK) {
            return -1;
        }
        int length2 = this.d.length;
        while (length < length2) {
            if (!affa.f(obj, this.d[length])) {
                length++;
            }
        }
        for (int i2 = 0; i2 < iK; i2++) {
            if (affa.f(obj, this.d[i2])) {
                length = i2 + this.d.length;
                i = this.c;
                return length - i;
            }
        }
        return -1;
        i = this.c;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iCN;
        int i;
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            iCN = iK - 1;
            if (i2 <= iCN) {
                while (!affa.f(obj, this.d[iCN])) {
                    if (iCN != i2) {
                        iCN--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (!isEmpty() && i2 >= iK) {
            int i3 = iK - 1;
            while (true) {
                Object[] objArr = this.d;
                if (i3 < 0) {
                    iCN = woy.cN(objArr);
                    int i4 = this.c;
                    if (i4 <= iCN) {
                        while (!affa.f(obj, this.d[iCN])) {
                            if (iCN != i4) {
                                iCN--;
                            }
                        }
                    }
                } else {
                    if (affa.f(obj, objArr[i3])) {
                        iCN = i3 + this.d.length;
                        i = this.c;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
        return iCN - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iK;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (true) {
                objArr = this.d;
                if (i >= iK2) {
                    break;
                }
                Object obj = objArr[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[iK] = obj;
                    iK++;
                }
                i++;
            }
            woy.cE(objArr, null, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.d;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                Object[] objArr3 = this.d;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[iK] = obj3;
                    iK = i(iK);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = i(i);
        this.a--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iK = k(this.c + (this.a - 1));
        Object[] objArr = this.d;
        Object obj = objArr[iK];
        objArr[iK] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a.aI(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            o();
            int i4 = this.a - i2;
            int i5 = this.c;
            if (i < i4) {
                int iK = k(i5 + (i - 1));
                int iK2 = k(this.c + (i2 - 1));
                while (i > 0) {
                    int i6 = iK + 1;
                    int iMin = Math.min(i, Math.min(i6, iK2 + 1));
                    Object[] objArr = this.d;
                    int i7 = iK2 - iMin;
                    int i8 = iK - iMin;
                    woy.dq(objArr, objArr, i7 + 1, i8 + 1, i6);
                    iK = j(i8);
                    iK2 = j(i7);
                    i -= iMin;
                }
                int iK3 = k(this.c + i3);
                n(this.c, iK3);
                this.c = iK3;
            } else {
                int iK4 = k(i5 + i2);
                int iK5 = k(this.c + i);
                int i9 = this.a;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = Math.min(i9, Math.min(length - iK4, length - iK5));
                    Object[] objArr2 = this.d;
                    int i10 = iK4 + i2;
                    woy.dq(objArr2, objArr2, iK5, iK4, i10);
                    iK4 = k(i10);
                    iK5 = k(iK5 + i2);
                }
                int iK6 = k(this.c + this.a);
                n(j(iK6 - i3), iK6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iK;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (true) {
                objArr = this.d;
                if (i >= iK2) {
                    break;
                }
                Object obj = objArr[i];
                if (collection.contains(obj)) {
                    this.d[iK] = obj;
                    iK++;
                } else {
                    z = true;
                }
                i++;
            }
            woy.cE(objArr, null, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.d;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                Object[] objArr3 = this.d;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[iK] = obj3;
                    iK = i(iK);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a.aG(i, this.a);
        int iK = k(this.c + i);
        Object[] objArr = this.d;
        E e2 = (E) objArr[iK];
        objArr[iK] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) throws NegativeArraySizeException {
        tArr.getClass();
        int length = tArr.length;
        int i = this.a;
        if (length < i) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            woy.dB(this.d, tArr, i2, iK, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.d;
            woy.dq(objArr, tArr, 0, i2, objArr.length);
            Object[] objArr2 = this.d;
            woy.dq(objArr2, tArr, objArr2.length - this.c, 0, iK);
        }
        woy.cx(this.a, tArr);
        return tArr;
    }

    public afaz() {
        this.d = b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        m(this.a + collection.size());
        l(k(this.c + this.a), collection);
        return true;
    }
}
