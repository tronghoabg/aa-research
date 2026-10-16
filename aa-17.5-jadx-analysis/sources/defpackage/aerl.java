package defpackage;

import j$.lang.Iterable$CC;
import j$.util.List;
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
public abstract class aerl<K> extends aerf<K> implements List<K>, aexm {
    protected aerl() {
    }

    @Override // defpackage.aerf, defpackage.aexk
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
        i(i);
        Iterator<? extends K> it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.next());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aerf, defpackage.aexk
    public /* synthetic */ aeus b() {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public aexm subList(int i, int i2) {
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
            if (aeuiVarListIterator.next() != listIterator.next()) {
                return false;
            }
            size--;
        }
        return true;
    }

    public void f(int i, int i2) {
        throw null;
    }

    @Override // defpackage.aerf, java.lang.Iterable, j$.util.Collection, j$.lang.a
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

    @Override // defpackage.aexm
    public final aeui h() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        aeui aeuiVarListIterator = listIterator(0);
        int size = size();
        int iIdentityHashCode = 1;
        while (size != 0) {
            size--;
            iIdentityHashCode = (iIdentityHashCode * 31) + System.identityHashCode(aeuiVarListIterator.next());
        }
        return iIdentityHashCode;
    }

    protected final void i(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        aeui aeuiVarListIterator = listIterator(0);
        while (aeuiVarListIterator.hasNext()) {
            if (obj == aeuiVarListIterator.next()) {
                return aeuiVarListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    protected final void j(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
    }

    @Override // defpackage.aexm
    public final /* synthetic */ void k(Object[] objArr) {
        m(objArr);
    }

    @Override // defpackage.aexm
    public /* synthetic */ boolean l(int i, aexm aexmVar) {
        throw null;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        aeui aeuiVarListIterator = listIterator(size());
        while (aeuiVarListIterator.hasPrevious()) {
            if (obj == aeuiVarListIterator.previous()) {
                return aeuiVarListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.aexm
    public final /* synthetic */ void m(Object[] objArr) {
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
        k(array);
    }

    @Override // defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
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

    @Override // defpackage.aerf, java.util.AbstractCollection
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
