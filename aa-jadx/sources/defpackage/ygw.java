package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ygw<E> extends defpackage.ygm<E> implements java.util.List<E>, java.util.RandomAccess, j$.util.List<E> {
    private static final defpackage.you a = new defpackage.ygs(defpackage.ymx.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static defpackage.ygw B(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return m("_id", obj, obj2, obj3, obj4, obj5, obj6, obj7, "description");
    }

    public static defpackage.ygr j(int i) {
        defpackage.ysr.aL(i, "expectedSize");
        return new defpackage.ygr(i);
    }

    public static defpackage.ygw k(java.lang.Object[] objArr) {
        return l(objArr, objArr.length);
    }

    public static defpackage.ygw l(java.lang.Object[] objArr, int i) {
        return i == 0 ? defpackage.ymx.a : new defpackage.ymx(objArr, i);
    }

    public static defpackage.ygw m(java.lang.Object... objArr) {
        int length = objArr.length;
        defpackage.ysr.B(objArr, length);
        return new defpackage.ymx(objArr, length);
    }

    public static defpackage.ygw n(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return o((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return defpackage.ymx.a;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        ygrVar.i(next);
        ygrVar.l(it);
        return ygrVar.g();
    }

    public static defpackage.ygw o(java.util.Collection collection) {
        if (!(collection instanceof defpackage.ygm)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            defpackage.ysr.B(array, length);
            return l(array, length);
        }
        defpackage.ygw ygwVarD = ((defpackage.ygm) collection).d();
        if (!ygwVarD.f()) {
            return ygwVarD;
        }
        java.lang.Object[] array2 = ygwVarD.toArray();
        return l(array2, array2.length);
    }

    public static defpackage.ygw p(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return defpackage.ymx.a;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        int length = objArr2.length;
        defpackage.ysr.B(objArr2, length);
        return l(objArr2, length);
    }

    public static defpackage.ygw q(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        defpackage.ysr.B(objArr, 1);
        return new defpackage.ymx(objArr, 1);
    }

    public static defpackage.ygw r(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        defpackage.ysr.B(objArr, 2);
        return new defpackage.ymx(objArr, 2);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static defpackage.ygw s(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        defpackage.ysr.B(objArr, 3);
        return new defpackage.ymx(objArr, 3);
    }

    public static defpackage.ygw t(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4};
        defpackage.ysr.B(objArr, 4);
        return new defpackage.ymx(objArr, 4);
    }

    public static defpackage.ygw u(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        defpackage.ysr.B(objArr, 5);
        return new defpackage.ymx(objArr, 5);
    }

    public static defpackage.ygw v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        defpackage.ysr.B(objArr, 6);
        return new defpackage.ymx(objArr, 6);
    }

    public static defpackage.ygw w(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        defpackage.ysr.B(objArr, 7);
        return new defpackage.ymx(objArr, 7);
    }

    @java.lang.SafeVarargs
    public static defpackage.ygw x(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object... objArr) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length + 12];
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
        java.lang.System.arraycopy(objArr, 0, objArr2, 12, length);
        return m(objArr2);
    }

    public static defpackage.ygw y(java.lang.Iterable iterable) {
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) defpackage.ysr.aq(iterable).toArray(new java.lang.Comparable[0]);
        defpackage.ysr.B(comparableArr, comparableArr.length);
        java.util.Arrays.sort(comparableArr);
        return k(comparableArr);
    }

    public static defpackage.ygw z(java.util.Comparator comparator, java.lang.Iterable iterable) {
        comparator.getClass();
        java.lang.Object[] array = defpackage.ysr.aq(iterable).toArray();
        int length = array.length;
        defpackage.ysr.B(array, length);
        java.util.Arrays.sort(array, comparator);
        return l(array, length);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final defpackage.you listIterator(int i) {
        defpackage.ysr.bt(i, size());
        return isEmpty() ? a : new defpackage.ygs(this, i);
    }

    @Override // defpackage.ygm
    public int a(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.ygm
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        return defpackage.ysr.W(this, obj);
    }

    public defpackage.ygw h() {
        return size() <= 1 ? this : new defpackage.ygt(this);
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
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public defpackage.ygw subList(int i, int i2) {
        defpackage.ysr.bi(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? defpackage.ymx.a : new defpackage.ygv(this, i, i3);
    }

    public int indexOf(java.lang.Object obj) {
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

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(java.lang.Object obj) {
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
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(java.util.Comparator comparator) {
        j$.util.List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.ygm
    public java.lang.Object writeReplace() {
        return new defpackage.ygu(toArray());
    }

    @Override // defpackage.ygm
    @java.lang.Deprecated
    public final defpackage.ygw d() {
        return this;
    }
}
