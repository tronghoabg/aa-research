package defpackage;

import j$.lang.Iterable$CC;
import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public abstract class aeqv<K> extends aeqq<K> implements List<K>, aeuh {
    protected aeqv() {
    }

    @Override // defpackage.aeqq, defpackage.aetv
    /* renamed from: a */
    public final /* synthetic */ aety iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(K k) {
        add(size(), k);
        return true;
    }

    public boolean addAll(int i, Collection<? extends K> collection) {
        k(i);
        Iterator<? extends K> it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.next());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public /* synthetic */ aeus spliterator() {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public aeuh subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        f(0, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public aeui listIterator(int i) {
        throw null;
    }

    public void e(int i, Object[] objArr, int i2, int i3) {
        throw null;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        aeui aeuiVarListIterator = listIterator(0);
        ListIterator listIterator = list.listIterator();
        while (size != 0) {
            if (!Objects.equals(aeuiVarListIterator.next(), listIterator.next())) {
                return false;
            }
            size--;
        }
        return true;
    }

    public void f(int i, int i2) {
        throw null;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public void forEach(Consumer<? super K> consumer) {
        if (!(this instanceof RandomAccess)) {
            Iterable$CC.$default$forEach(this, consumer);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    public void g(int i, Object[] objArr, int i2) {
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(java.util.List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof aeuh) {
            aeui aeuiVarListIterator = listIterator(0);
            aeui aeuiVarJ = ((aeuh) list).j();
            while (aeuiVarListIterator.hasNext() && aeuiVarJ.hasNext()) {
                int iCompareTo = ((Comparable) aeuiVarListIterator.next()).compareTo(aeuiVarJ.next());
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (aeuiVarJ.hasNext()) {
                return -1;
            }
            return aeuiVarListIterator.hasNext() ? 1 : 0;
        }
        aeui aeuiVarListIterator2 = listIterator(0);
        ListIterator listIterator = list.listIterator();
        while (aeuiVarListIterator2.hasNext() && listIterator.hasNext()) {
            int iCompareTo2 = ((Comparable) aeuiVarListIterator2.next()).compareTo(listIterator.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return aeuiVarListIterator2.hasNext() ? 1 : 0;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        aeui aeuiVarListIterator = listIterator(0);
        int iHashCode = 1;
        for (int size = size(); size != 0; size--) {
            K next = aeuiVarListIterator.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    @Override // defpackage.aeuh
    public final aeui i() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        aeui aeuiVarListIterator = listIterator(0);
        while (aeuiVarListIterator.hasNext()) {
            if (Objects.equals(obj, aeuiVarListIterator.next())) {
                return aeuiVarListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.aeuh
    public final aeui j() {
        return listIterator(0);
    }

    protected final void k(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
    }

    protected final void l(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        aeui aeuiVarListIterator = listIterator(size());
        while (aeuiVarListIterator.hasPrevious()) {
            if (Objects.equals(obj, aeuiVarListIterator.previous())) {
                return aeuiVarListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.aeuh
    public final /* synthetic */ void m(Object[] objArr) {
        o(objArr);
    }

    @Override // defpackage.aeuh
    public /* synthetic */ boolean n(int i, aeuh aeuhVar) {
        throw null;
    }

    @Override // defpackage.aeuh
    public final /* synthetic */ void o(Object[] objArr) {
        g(0, objArr, objArr.length);
    }

    public K remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    public K set(int i, K k) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        Object[] array = toArray();
        if (comparator == null) {
            aett.b(array);
        } else {
            aett.c(array, comparator);
        }
        m(array);
    }

    @Override // defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) Arrays.copyOf(tArr, size);
        }
        e(0, tArr, 0, size);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    @Override // defpackage.aeqq, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aeui aeuiVarListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            size--;
            K next = aeuiVarListIterator.next();
            if (this == next) {
                sb.append("(this list)");
            } else {
                sb.append(String.valueOf(next));
            }
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public void add(int i, K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int size = size();
        if (size == 0) {
            return aett.a;
        }
        Object[] objArr = new Object[size];
        e(0, objArr, 0, size);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends K> collection) {
        return addAll(size(), collection);
    }
}
