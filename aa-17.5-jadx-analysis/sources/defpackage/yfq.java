package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public abstract class yfq<E> extends yfg<E> implements List<E>, RandomAccess, j$.util.List<E> {
    private static final ynp a = new yfm(yls.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static yfq B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m("_id", obj, obj2, obj3, obj4, obj5, obj6, obj7, "description");
    }

    public static yfl j(int i) {
        wub.G(i, "expectedSize");
        return new yfl(i);
    }

    public static yfq k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    public static yfq l(Object[] objArr, int i) {
        return i == 0 ? yls.a : new yls(objArr, i);
    }

    public static yfq m(Object... objArr) {
        int length = objArr.length;
        yrm.B(objArr, length);
        return new yls(objArr, length);
    }

    public static yfq n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return yls.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        yfl yflVar = new yfl(4);
        yflVar.i(next);
        yflVar.l(it);
        return yflVar.g();
    }

    public static yfq o(Collection collection) {
        if (!(collection instanceof yfg)) {
            Object[] array = collection.toArray();
            int length = array.length;
            yrm.B(array, length);
            return l(array, length);
        }
        yfq yfqVarD = ((yfg) collection).d();
        if (!yfqVarD.f()) {
            return yfqVarD;
        }
        Object[] array2 = yfqVarD.toArray();
        return l(array2, array2.length);
    }

    public static yfq p(Object[] objArr) {
        if (objArr.length == 0) {
            return yls.a;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        yrm.B(objArr2, length);
        return l(objArr2, length);
    }

    public static yfq q(Object obj) {
        Object[] objArr = {obj};
        yrm.B(objArr, 1);
        return new yls(objArr, 1);
    }

    public static yfq r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        yrm.B(objArr, 2);
        return new yls(objArr, 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static yfq s(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        yrm.B(objArr, 3);
        return new yls(objArr, 3);
    }

    public static yfq t(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {obj, obj2, obj3, obj4};
        yrm.B(objArr, 4);
        return new yls(objArr, 4);
    }

    public static yfq u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        yrm.B(objArr, 5);
        return new yls(objArr, 5);
    }

    public static yfq v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        yrm.B(objArr, 6);
        return new yls(objArr, 6);
    }

    public static yfq w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        yrm.B(objArr, 7);
        return new yls(objArr, 7);
    }

    @SafeVarargs
    public static yfq x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return m(objArr2);
    }

    public static yfq y(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) yrm.aq(iterable).toArray(new Comparable[0]);
        yrm.B(comparableArr, comparableArr.length);
        Arrays.sort(comparableArr);
        return k(comparableArr);
    }

    public static yfq z(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] array = yrm.aq(iterable).toArray();
        int length = array.length;
        yrm.B(array, length);
        Arrays.sort(array, comparator);
        return l(array, length);
    }

    @Override // java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ynp listIterator(int i) {
        woy.aj(i, size());
        return isEmpty() ? a : new yfm(this, i);
    }

    @Override // defpackage.yfg
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.yfg
    /* renamed from: e */
    public final yno iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return yrm.W(this, obj);
    }

    public yfq h() {
        return size() <= 1 ? this : new yfn(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public yfq subList(int i, int i2) {
        woy.Y(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? yls.a : new yfp(this, i, i3);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.yfg
    public Object writeReplace() {
        return new yfo(toArray());
    }

    @Override // defpackage.yfg
    @Deprecated
    public final yfq d() {
        return this;
    }
}
