package defpackage;

import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public abstract class aegq extends aegj implements List, aeka {
    protected aegq() {
    }

    @Override // defpackage.aeka
    public final /* synthetic */ Integer A(int i) {
        return aeec.Y(this, i);
    }

    @Override // defpackage.aeka
    public final /* synthetic */ Integer B(int i) {
        return Integer.valueOf(n(i));
    }

    @Override // defpackage.aeka
    public final /* synthetic */ Integer C(int i, Integer num) {
        return Integer.valueOf(o(i, num.intValue()));
    }

    @Override // defpackage.aeka
    public final /* synthetic */ void D(int i, Integer num) {
        q(i, num.intValue());
    }

    protected final void E(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
    }

    protected final void F(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
    }

    @Override // defpackage.aeka
    public final /* synthetic */ void G(int[] iArr) {
        I(iArr);
    }

    @Override // defpackage.aeka
    public /* synthetic */ void H(aejj aejjVar) {
        if (aejjVar == null) {
            J();
            return;
        }
        int[] iArrK = k();
        aejc.b(iArrK, 0, iArrK.length, aejjVar, null);
        G(iArrK);
    }

    @Override // defpackage.aeka
    public final /* synthetic */ void I(int[] iArr) {
        u(0, iArr, iArr.length);
    }

    @Override // defpackage.aeka
    public /* synthetic */ void J() {
        int[] iArrK = k();
        aejc.f(iArrK, iArrK.length);
        G(iArrK);
    }

    @Override // defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public final /* synthetic */ aejr iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        D(i, (Integer) obj);
    }

    public boolean addAll(int i, Collection<? extends Integer> collection) {
        if (collection instanceof aejf) {
            return t(i, (aejf) collection);
        }
        E(i);
        Iterator<? extends Integer> it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            q(i, it.next().intValue());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public /* synthetic */ aekm spliterator() {
        throw null;
    }

    @Override // defpackage.aegj, defpackage.aejf
    public boolean c(int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        s(0, size());
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean d(aejf aejfVar) {
        return t(size(), aejfVar);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        return w(i) >= 0;
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
        if (list instanceof aeka) {
            aekb aekbVarListIterator = listIterator(0);
            aekb aekbVarZ = ((aeka) list).z();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (aekbVarListIterator.nextInt() != aekbVarZ.nextInt()) {
                    return false;
                }
                size = i;
            }
        } else {
            aekb aekbVarListIterator2 = listIterator(0);
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!Objects.equals(aekbVarListIterator2.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // defpackage.aegj, defpackage.aejf
    public boolean g(int i) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        return A(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        aekb aekbVarListIterator = listIterator(0);
        int size = size();
        int iNextInt = 1;
        while (size != 0) {
            size--;
            iNextInt = (iNextInt * 31) + aekbVarListIterator.nextInt();
        }
        return iNextInt;
    }

    @Override // java.util.List
    public final /* synthetic */ int indexOf(Object obj) {
        return w(((Integer) obj).intValue());
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return listIterator(0);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final int[] k() {
        int size = size();
        if (size == 0) {
            return aejc.a;
        }
        int[] iArr = new int[size];
        r(0, iArr, 0, size);
        return iArr;
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public aeka subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ int lastIndexOf(Object obj) {
        return x(((Integer) obj).intValue());
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public int n(int i) {
        throw null;
    }

    public int o(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public aekb listIterator(int i) {
        throw null;
    }

    public void q(int i, int i2) {
        throw null;
    }

    public void r(int i, int[] iArr, int i2, int i3) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object remove(int i) {
        return B(i);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    public void s(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return C(i, (Integer) obj);
    }

    @Override // j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        H((comparator == null || (comparator instanceof aejj)) ? (aejj) comparator : new aejk(comparator));
    }

    @Override // defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    public boolean t(int i, aejf aejfVar) {
        throw null;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aekb aekbVarListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf(aekbVarListIterator.nextInt()));
            size--;
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public void u(int i, int[] iArr, int i2) {
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int compareTo(java.util.List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof aeka) {
            aekb aekbVarListIterator = listIterator(0);
            aekb aekbVarZ = ((aeka) list).z();
            while (aekbVarListIterator.hasNext() && aekbVarZ.hasNext()) {
                int iCompare = Integer.compare(aekbVarListIterator.nextInt(), aekbVarZ.nextInt());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (aekbVarZ.hasNext()) {
                return -1;
            }
            return aekbVarListIterator.hasNext() ? 1 : 0;
        }
        aekb aekbVarListIterator2 = listIterator(0);
        ListIterator listIterator = list.listIterator();
        while (aekbVarListIterator2.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) aekbVarListIterator2.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return aekbVarListIterator2.hasNext() ? 1 : 0;
    }

    @Override // defpackage.aeka
    public int w(int i) {
        aekb aekbVarListIterator = listIterator(0);
        while (aekbVarListIterator.hasNext()) {
            if (i == aekbVarListIterator.nextInt()) {
                return aekbVarListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeka
    public int x(int i) {
        aekb aekbVarListIterator = listIterator(size());
        while (aekbVarListIterator.hasPrevious()) {
            if (i == aekbVarListIterator.a()) {
                return aekbVarListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeka
    public final aekb y() {
        return listIterator(0);
    }

    @Override // defpackage.aeka
    public final aekb z() {
        return listIterator(0);
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        return addAll(size(), collection);
    }
}
