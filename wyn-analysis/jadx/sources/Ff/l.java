package ff;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class l extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f35426d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f35427a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f35428b = f35426d;

    /* renamed from: c, reason: collision with root package name */
    public int f35429c;

    @Override // ff.h
    public final int a() {
        return this.f35429c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        j();
        e(elements.size() + a());
        d(i(a() + this.f35427a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(this.f35429c + 1);
        int length = this.f35427a;
        if (length == 0) {
            Object[] objArr = this.f35428b;
            AbstractC3340k.e(objArr, "<this>");
            length = objArr.length;
        }
        int i5 = length - 1;
        this.f35427a = i5;
        this.f35428b[i5] = obj;
        this.f35429c++;
    }

    public final void addLast(Object obj) {
        j();
        e(a() + 1);
        this.f35428b[i(a() + this.f35427a)] = obj;
        this.f35429c = a() + 1;
    }

    @Override // ff.h
    public final Object c(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35429c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        if (i5 == AbstractC3935e.z(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        j();
        int i11 = i(this.f35427a + i5);
        Object[] objArr = this.f35428b;
        Object obj = objArr[i11];
        if (i5 < (this.f35429c >> 1)) {
            int i12 = this.f35427a;
            if (i11 >= i12) {
                m.h0(objArr, i12 + 1, objArr, i12, i11);
            } else {
                m.h0(objArr, 1, objArr, 0, i11);
                Object[] objArr2 = this.f35428b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f35427a;
                m.h0(objArr2, i13 + 1, objArr2, i13, objArr2.length - 1);
            }
            Object[] objArr3 = this.f35428b;
            int i14 = this.f35427a;
            objArr3[i14] = null;
            this.f35427a = f(i14);
        } else {
            int i15 = i(AbstractC3935e.z(this) + this.f35427a);
            if (i11 <= i15) {
                Object[] objArr4 = this.f35428b;
                m.h0(objArr4, i11, objArr4, i11 + 1, i15 + 1);
            } else {
                Object[] objArr5 = this.f35428b;
                m.h0(objArr5, i11, objArr5, i11 + 1, objArr5.length);
                Object[] objArr6 = this.f35428b;
                objArr6[objArr6.length - 1] = objArr6[0];
                m.h0(objArr6, 0, objArr6, 1, i15 + 1);
            }
            this.f35428b[i15] = null;
        }
        this.f35429c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f35427a, i(a() + this.f35427a));
        }
        this.f35427a = 0;
        this.f35429c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f35428b.length;
        while (i5 < length && it.hasNext()) {
            this.f35428b[i5] = it.next();
            i5++;
        }
        int i10 = this.f35427a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f35428b[i11] = it.next();
        }
        this.f35429c = collection.size() + this.f35429c;
    }

    public final void e(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f35428b;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == f35426d) {
            if (i5 < 10) {
                i5 = 10;
            }
            this.f35428b = new Object[i5];
            return;
        }
        C2648c c2648c = AbstractC2651f.Companion;
        int length = objArr.length;
        c2648c.getClass();
        Object[] objArr2 = new Object[C2648c.e(length, i5)];
        Object[] objArr3 = this.f35428b;
        m.h0(objArr3, 0, objArr2, this.f35427a, objArr3.length);
        Object[] objArr4 = this.f35428b;
        int length2 = objArr4.length;
        int i10 = this.f35427a;
        m.h0(objArr4, length2 - i10, objArr2, 0, i10);
        this.f35427a = 0;
        this.f35428b = objArr2;
    }

    public final int f(int i5) {
        AbstractC3340k.e(this.f35428b, "<this>");
        if (i5 == r0.length - 1) {
            return 0;
        }
        return i5 + 1;
    }

    public final int g(int i5) {
        return i5 < 0 ? i5 + this.f35428b.length : i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35429c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        return this.f35428b[i(this.f35427a + i5)];
    }

    public final void h(int i5, int i10) {
        if (i5 < i10) {
            m.o0(this.f35428b, null, i5, i10);
            return;
        }
        Object[] objArr = this.f35428b;
        Arrays.fill(objArr, i5, objArr.length, (Object) null);
        m.o0(this.f35428b, null, 0, i10);
    }

    public final int i(int i5) {
        Object[] objArr = this.f35428b;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i5;
        int i10 = i(a() + this.f35427a);
        int length = this.f35427a;
        if (length < i10) {
            while (length < i10) {
                if (AbstractC3340k.a(obj, this.f35428b[length])) {
                    i5 = this.f35427a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f35427a) < i10) {
            return -1;
        }
        int length2 = this.f35428b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (AbstractC3340k.a(obj, this.f35428b[i11])) {
                        length = i11 + this.f35428b.length;
                        i5 = this.f35427a;
                    }
                }
                return -1;
            }
            if (AbstractC3340k.a(obj, this.f35428b[length])) {
                i5 = this.f35427a;
                break;
            }
            length++;
        }
        return length - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i5;
        int i10 = i(this.f35429c + this.f35427a);
        int i11 = this.f35427a;
        if (i11 < i10) {
            length = i10 - 1;
            if (i11 <= length) {
                while (!AbstractC3340k.a(obj, this.f35428b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i5 = this.f35427a;
                return length - i5;
            }
            return -1;
        }
        if (!isEmpty() && this.f35427a >= i10) {
            int i12 = i10 - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f35428b;
                    AbstractC3340k.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f35427a;
                    if (i13 <= length) {
                        while (!AbstractC3340k.a(obj, this.f35428b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i5 = this.f35427a;
                    }
                } else {
                    if (AbstractC3340k.a(obj, this.f35428b[i12])) {
                        length = i12 + this.f35428b.length;
                        i5 = this.f35427a;
                        break;
                    }
                    i12--;
                }
            }
            return length - i5;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int i5;
        AbstractC3340k.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f35428b.length != 0) {
            int i10 = i(this.f35429c + this.f35427a);
            int i11 = this.f35427a;
            if (i11 < i10) {
                i5 = i11;
                while (i11 < i10) {
                    Object obj = this.f35428b[i11];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f35428b[i5] = obj;
                        i5++;
                    }
                    i11++;
                }
                m.o0(this.f35428b, null, i5, i10);
            } else {
                int length = this.f35428b.length;
                boolean z10 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f35428b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f35428b[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                i5 = i(i12);
                for (int i13 = 0; i13 < i10; i13++) {
                    Object[] objArr2 = this.f35428b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f35428b[i5] = obj3;
                        i5 = f(i5);
                    }
                }
                z2 = z10;
            }
            if (z2) {
                j();
                this.f35429c = g(i5 - this.f35427a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f35428b;
        int i5 = this.f35427a;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f35427a = f(i5);
        this.f35429c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i5 = i(AbstractC3935e.z(this) + this.f35427a);
        Object[] objArr = this.f35428b;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f35429c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i11 = this.f35429c;
        c2648c.getClass();
        C2648c.d(i5, i10, i11);
        int i12 = i10 - i5;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f35429c) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i5);
            return;
        }
        j();
        if (i5 < this.f35429c - i10) {
            int i13 = i(this.f35427a + (i5 - 1));
            int i14 = i(this.f35427a + (i10 - 1));
            while (i5 > 0) {
                int i15 = i13 + 1;
                int iMin = Math.min(i5, Math.min(i15, i14 + 1));
                Object[] objArr = this.f35428b;
                int i16 = i14 - iMin;
                int i17 = i13 - iMin;
                m.h0(objArr, i16 + 1, objArr, i17 + 1, i15);
                i13 = g(i17);
                i14 = g(i16);
                i5 -= iMin;
            }
            int i18 = i(this.f35427a + i12);
            h(this.f35427a, i18);
            this.f35427a = i18;
        } else {
            int i19 = i(this.f35427a + i10);
            int i20 = i(this.f35427a + i5);
            int i21 = this.f35429c;
            while (true) {
                i21 -= i10;
                if (i21 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f35428b;
                i10 = Math.min(i21, Math.min(objArr2.length - i19, objArr2.length - i20));
                Object[] objArr3 = this.f35428b;
                int i22 = i19 + i10;
                m.h0(objArr3, i20, objArr3, i19, i22);
                i19 = i(i22);
                i20 = i(i20 + i10);
            }
            int i23 = i(this.f35429c + this.f35427a);
            h(g(i23 - i12), i23);
        }
        this.f35429c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i5;
        AbstractC3340k.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f35428b.length != 0) {
            int i10 = i(this.f35429c + this.f35427a);
            int i11 = this.f35427a;
            if (i11 < i10) {
                i5 = i11;
                while (i11 < i10) {
                    Object obj = this.f35428b[i11];
                    if (elements.contains(obj)) {
                        this.f35428b[i5] = obj;
                        i5++;
                    } else {
                        z2 = true;
                    }
                    i11++;
                }
                m.o0(this.f35428b, null, i5, i10);
            } else {
                int length = this.f35428b.length;
                boolean z10 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f35428b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        this.f35428b[i12] = obj2;
                        i12++;
                    } else {
                        z10 = true;
                    }
                    i11++;
                }
                i5 = i(i12);
                for (int i13 = 0; i13 < i10; i13++) {
                    Object[] objArr2 = this.f35428b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        this.f35428b[i5] = obj3;
                        i5 = f(i5);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                j();
                this.f35429c = g(i5 - this.f35427a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35429c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        int i11 = i(this.f35427a + i5);
        Object[] objArr = this.f35428b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int length;
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35429c;
        c2648c.getClass();
        C2648c.c(i5, i10);
        if (i5 == this.f35429c) {
            addLast(obj);
            return;
        }
        if (i5 == 0) {
            addFirst(obj);
            return;
        }
        j();
        e(this.f35429c + 1);
        int i11 = i(this.f35427a + i5);
        int i12 = this.f35429c;
        if (i5 < ((i12 + 1) >> 1)) {
            if (i11 == 0) {
                Object[] objArr = this.f35428b;
                AbstractC3340k.e(objArr, "<this>");
                i11 = objArr.length;
            }
            int i13 = i11 - 1;
            int i14 = this.f35427a;
            if (i14 == 0) {
                Object[] objArr2 = this.f35428b;
                AbstractC3340k.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f35427a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f35428b;
                objArr3[length] = objArr3[i15];
                m.h0(objArr3, i15, objArr3, i15 + 1, i13 + 1);
            } else {
                Object[] objArr4 = this.f35428b;
                m.h0(objArr4, i15 - 1, objArr4, i15, objArr4.length);
                Object[] objArr5 = this.f35428b;
                objArr5[objArr5.length - 1] = objArr5[0];
                m.h0(objArr5, 0, objArr5, 1, i13 + 1);
            }
            this.f35428b[i13] = obj;
            this.f35427a = length;
        } else {
            int i16 = i(i12 + this.f35427a);
            if (i11 < i16) {
                Object[] objArr6 = this.f35428b;
                m.h0(objArr6, i11 + 1, objArr6, i11, i16);
            } else {
                Object[] objArr7 = this.f35428b;
                m.h0(objArr7, 1, objArr7, 0, i16);
                Object[] objArr8 = this.f35428b;
                objArr8[0] = objArr8[objArr8.length - 1];
                m.h0(objArr8, i11 + 1, objArr8, i11, objArr8.length - 1);
            }
            this.f35428b[i11] = obj;
        }
        this.f35429c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) throws NegativeArraySizeException {
        AbstractC3340k.e(array, "array");
        int length = array.length;
        int i5 = this.f35429c;
        if (length < i5) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i5);
            AbstractC3340k.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int i10 = i(this.f35429c + this.f35427a);
        int i11 = this.f35427a;
        if (i11 < i10) {
            m.j0(this.f35428b, i11, array, i10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f35428b;
            m.h0(objArr, 0, array, this.f35427a, objArr.length);
            Object[] objArr2 = this.f35428b;
            m.h0(objArr2, objArr2.length - this.f35427a, array, 0, i10);
        }
        int i12 = this.f35429c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection elements) {
        AbstractC3340k.e(elements, "elements");
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35429c;
        c2648c.getClass();
        C2648c.c(i5, i10);
        if (elements.isEmpty()) {
            return false;
        }
        if (i5 == this.f35429c) {
            return addAll(elements);
        }
        j();
        e(elements.size() + this.f35429c);
        int i11 = i(this.f35429c + this.f35427a);
        int i12 = i(this.f35427a + i5);
        int size = elements.size();
        if (i5 < ((this.f35429c + 1) >> 1)) {
            int i13 = this.f35427a;
            int length = i13 - size;
            if (i12 < i13) {
                Object[] objArr = this.f35428b;
                m.h0(objArr, length, objArr, i13, objArr.length);
                if (size >= i12) {
                    Object[] objArr2 = this.f35428b;
                    m.h0(objArr2, objArr2.length - size, objArr2, 0, i12);
                } else {
                    Object[] objArr3 = this.f35428b;
                    m.h0(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f35428b;
                    m.h0(objArr4, 0, objArr4, size, i12);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f35428b;
                m.h0(objArr5, length, objArr5, i13, i12);
            } else {
                Object[] objArr6 = this.f35428b;
                length += objArr6.length;
                int i14 = i12 - i13;
                int length2 = objArr6.length - length;
                if (length2 >= i14) {
                    m.h0(objArr6, length, objArr6, i13, i12);
                } else {
                    m.h0(objArr6, length, objArr6, i13, i13 + length2);
                    Object[] objArr7 = this.f35428b;
                    m.h0(objArr7, 0, objArr7, this.f35427a + length2, i12);
                }
            }
            this.f35427a = length;
            d(g(i12 - size), elements);
            return true;
        }
        int i15 = i12 + size;
        if (i12 < i11) {
            int i16 = size + i11;
            Object[] objArr8 = this.f35428b;
            if (i16 <= objArr8.length) {
                m.h0(objArr8, i15, objArr8, i12, i11);
            } else if (i15 >= objArr8.length) {
                m.h0(objArr8, i15 - objArr8.length, objArr8, i12, i11);
            } else {
                int length3 = i11 - (i16 - objArr8.length);
                m.h0(objArr8, 0, objArr8, length3, i11);
                Object[] objArr9 = this.f35428b;
                m.h0(objArr9, i15, objArr9, i12, length3);
            }
        } else {
            Object[] objArr10 = this.f35428b;
            m.h0(objArr10, size, objArr10, 0, i11);
            Object[] objArr11 = this.f35428b;
            if (i15 >= objArr11.length) {
                m.h0(objArr11, i15 - objArr11.length, objArr11, i12, objArr11.length);
            } else {
                m.h0(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.f35428b;
                m.h0(objArr12, i15, objArr12, i12, objArr12.length - size);
            }
        }
        d(i12, elements);
        return true;
    }
}
