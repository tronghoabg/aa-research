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
public abstract class aelk extends aeld implements List, aeps {
    protected aelk() {
    }

    @Override // defpackage.aeps
    public final /* synthetic */ Long A(int i) {
        return Long.valueOf(m(i));
    }

    @Override // defpackage.aeps
    public final /* synthetic */ Long B(int i) {
        return Long.valueOf(n(i));
    }

    @Override // defpackage.aeps
    public final /* synthetic */ Long C(int i, Long l) {
        return Long.valueOf(o(i, l.longValue()));
    }

    @Override // defpackage.aeps
    public final /* synthetic */ void D(int i, Long l) {
        q(i, l.longValue());
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

    @Override // defpackage.aeps
    public final /* synthetic */ void G(long[] jArr) {
        I(jArr);
    }

    @Override // defpackage.aeps
    public /* synthetic */ void H(aepf aepfVar) {
        if (aepfVar == null) {
            J();
            return;
        }
        long[] jArrK = k();
        aeoy.b(jArrK, 0, jArrK.length, aepfVar, null);
        G(jArrK);
    }

    @Override // defpackage.aeps
    public final /* synthetic */ void I(long[] jArr) {
        u(0, jArr, jArr.length);
    }

    @Override // defpackage.aeps
    public /* synthetic */ void J() {
        long[] jArrK = k();
        aeoy.f(jArrK, jArrK.length);
        G(jArrK);
    }

    @Override // defpackage.aeld, defpackage.aepb
    /* renamed from: a */
    public final /* synthetic */ aepm m() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        D(i, (Long) obj);
    }

    public boolean addAll(int i, Collection<? extends Long> collection) {
        if (collection instanceof aepb) {
            return t(i, (aepb) collection);
        }
        E(i);
        Iterator<? extends Long> it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            q(i, it.next().longValue());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public /* synthetic */ aeqd spliterator() {
        throw null;
    }

    @Override // defpackage.aeld, defpackage.aepb
    public boolean c(long j) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        s(0, size());
    }

    @Override // defpackage.aeld
    public final boolean d(aepb aepbVar) {
        return t(size(), aepbVar);
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return w(j) >= 0;
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
        if (list instanceof aeps) {
            aept aeptVarListIterator = listIterator(0);
            aept aeptVarZ = ((aeps) list).z();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (aeptVarListIterator.nextLong() != aeptVarZ.nextLong()) {
                    return false;
                }
                size = i;
            }
        } else {
            aept aeptVarListIterator2 = listIterator(0);
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!Objects.equals(aeptVarListIterator2.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // defpackage.aeld, defpackage.aepb
    public boolean g(long j) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        return A(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        aept aeptVarListIterator = listIterator(0);
        int iG = 1;
        for (int size = size(); size != 0; size--) {
            iG = (iG * 31) + a.g(aeptVarListIterator.nextLong());
        }
        return iG;
    }

    @Override // java.util.List
    public final /* synthetic */ int indexOf(Object obj) {
        return w(((Long) obj).longValue());
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return listIterator(0);
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final long[] k() {
        int size = size();
        if (size == 0) {
            return aeoy.a;
        }
        long[] jArr = new long[size];
        r(0, jArr, 0, size);
        return jArr;
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public aeps subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ int lastIndexOf(Object obj) {
        return x(((Long) obj).longValue());
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public long n(int i) {
        throw null;
    }

    public long o(int i, long j) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public aept listIterator(int i) {
        throw null;
    }

    public void q(int i, long j) {
        throw null;
    }

    public void r(int i, long[] jArr, int i2, int i3) {
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
        return C(i, (Long) obj);
    }

    @Override // j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        H((comparator == null || (comparator instanceof aepf)) ? (aepf) comparator : new aepg(comparator));
    }

    @Override // defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    public boolean t(int i, aepb aepbVar) {
        throw null;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aept aeptVarListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf(aeptVarListIterator.nextLong()));
            size--;
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public void u(int i, long[] jArr, int i2) {
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int compareTo(java.util.List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof aeps) {
            aept aeptVarListIterator = listIterator(0);
            aept aeptVarZ = ((aeps) list).z();
            while (aeptVarListIterator.hasNext() && aeptVarZ.hasNext()) {
                int iCompare = Long.compare(aeptVarListIterator.nextLong(), aeptVarZ.nextLong());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (aeptVarZ.hasNext()) {
                return -1;
            }
            return aeptVarListIterator.hasNext() ? 1 : 0;
        }
        aept aeptVarListIterator2 = listIterator(0);
        ListIterator listIterator = list.listIterator();
        while (aeptVarListIterator2.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) aeptVarListIterator2.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return aeptVarListIterator2.hasNext() ? 1 : 0;
    }

    @Override // defpackage.aeps
    public int w(long j) {
        aept aeptVarListIterator = listIterator(0);
        while (aeptVarListIterator.hasNext()) {
            if (j == aeptVarListIterator.nextLong()) {
                return aeptVarListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeps
    public int x(long j) {
        aept aeptVarListIterator = listIterator(size());
        while (aeptVarListIterator.hasPrevious()) {
            if (j == aeptVarListIterator.a()) {
                return aeptVarListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeps
    public final aept y() {
        return listIterator(0);
    }

    @Override // defpackage.aeps
    public final aept z() {
        return listIterator(0);
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        return addAll(size(), collection);
    }
}
