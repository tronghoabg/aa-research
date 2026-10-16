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
public abstract class aexx extends aexq implements List, aeyx {
    protected aexx() {
    }

    @Override // defpackage.aeyx
    public final /* synthetic */ Short A(int i, Short sh) {
        return Short.valueOf(n(i, sh.shortValue()));
    }

    @Override // defpackage.aeyx
    public final /* synthetic */ void B(int i, Short sh) {
        o(i, sh.shortValue());
    }

    protected final void C(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
    }

    protected final void D(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
    }

    @Override // defpackage.aeyx
    public final /* synthetic */ void E(short[] sArr) {
        G(sArr);
    }

    @Override // defpackage.aeyx
    public /* synthetic */ void F(aeyk aeykVar) {
        if (aeykVar == null) {
            H();
            return;
        }
        short[] sArrH = h();
        aeyf.b(sArrH, 0, sArrH.length, aeykVar, null);
        E(sArrH);
    }

    @Override // defpackage.aeyx
    public final /* synthetic */ void G(short[] sArr) {
        s(0, sArr, sArr.length);
    }

    @Override // defpackage.aeyx
    public /* synthetic */ void H() {
        short[] sArrH = h();
        aeyf.f(sArrH, sArrH.length);
        E(sArrH);
    }

    @Override // defpackage.aexq, defpackage.aeyi
    /* renamed from: a */
    public final /* synthetic */ aeyu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        B(i, (Short) obj);
    }

    public boolean addAll(int i, Collection<? extends Short> collection) {
        if (collection instanceof aeyi) {
            return r(i, (aeyi) collection);
        }
        C(i);
        Iterator<? extends Short> it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            o(i, it.next().shortValue());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aexq, defpackage.aeyi
    public /* synthetic */ aeze b() {
        throw null;
    }

    @Override // defpackage.aexq
    public final boolean c(aeyi aeyiVar) {
        return r(size(), aeyiVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        q(0, size());
    }

    @Override // defpackage.aexq, defpackage.aeyi
    public final boolean d(short s) {
        return u(s) >= 0;
    }

    @Override // defpackage.aexq, defpackage.aeyi
    public boolean e(short s) {
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
        if (list instanceof aeyx) {
            aeyy aeyyVarListIterator = listIterator(0);
            aeyy aeyyVarX = ((aeyx) list).x();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (aeyyVarListIterator.d() != aeyyVarX.d()) {
                    return false;
                }
                size = i;
            }
        } else {
            aeyy aeyyVarListIterator2 = listIterator(0);
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!Objects.equals(aeyyVarListIterator2.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        return y(i);
    }

    @Override // defpackage.aexq, defpackage.aeyi
    public final short[] h() {
        int size = size();
        if (size == 0) {
            return aeyf.a;
        }
        short[] sArr = new short[size];
        p(0, sArr, 0, size);
        return sArr;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        aeyy aeyyVarListIterator = listIterator(0);
        int size = size();
        int iD = 1;
        while (size != 0) {
            size--;
            iD = (iD * 31) + aeyyVarListIterator.d();
        }
        return iD;
    }

    @Override // defpackage.aexq, defpackage.aeyi
    public void i(short s) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ int indexOf(Object obj) {
        return u(((Short) obj).shortValue());
    }

    @Override // defpackage.aexq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public aeyx subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public aeyy listIterator(int i) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ int lastIndexOf(Object obj) {
        return v(((Short) obj).shortValue());
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public short m(int i) {
        throw null;
    }

    public short n(int i, short s) {
        throw null;
    }

    public void o(int i, short s) {
        throw null;
    }

    public void p(int i, short[] sArr, int i2, int i3) {
        throw null;
    }

    public void q(int i, int i2) {
        throw null;
    }

    public boolean r(int i, aeyi aeyiVar) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object remove(int i) {
        return z(i);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    public void s(int i, short[] sArr, int i2) {
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return A(i, (Short) obj);
    }

    @Override // j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        F((comparator == null || (comparator instanceof aeyk)) ? (aeyk) comparator : new aeyl(comparator));
    }

    @Override // defpackage.aexq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(java.util.List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof aeyx) {
            aeyy aeyyVarListIterator = listIterator(0);
            aeyy aeyyVarX = ((aeyx) list).x();
            while (aeyyVarListIterator.hasNext() && aeyyVarX.hasNext()) {
                int iCompare = Short.compare(aeyyVarListIterator.d(), aeyyVarX.d());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (aeyyVarX.hasNext()) {
                return -1;
            }
            return aeyyVarListIterator.hasNext() ? 1 : 0;
        }
        aeyy aeyyVarListIterator2 = listIterator(0);
        ListIterator listIterator = list.listIterator();
        while (aeyyVarListIterator2.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) aeyyVarListIterator2.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return aeyyVarListIterator2.hasNext() ? 1 : 0;
    }

    @Override // defpackage.aexq, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aeyy aeyyVarListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf((int) aeyyVarListIterator.d()));
            size--;
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.aeyx
    public int u(short s) {
        aeyy aeyyVarListIterator = listIterator(0);
        while (aeyyVarListIterator.hasNext()) {
            if (s == aeyyVarListIterator.d()) {
                return aeyyVarListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeyx
    public int v(short s) {
        aeyy aeyyVarListIterator = listIterator(size());
        while (aeyyVarListIterator.hasPrevious()) {
            if (s == aeyyVarListIterator.e()) {
                return aeyyVarListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aeyx
    public final aeyy w() {
        return listIterator(0);
    }

    @Override // defpackage.aeyx
    public final aeyy x() {
        return listIterator(0);
    }

    @Override // defpackage.aeyx
    public final /* synthetic */ Short y(int i) {
        return Short.valueOf(l(i));
    }

    @Override // defpackage.aeyx
    public final /* synthetic */ Short z(int i) {
        return Short.valueOf(m(i));
    }

    @Override // defpackage.aexq, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Short> collection) {
        return addAll(size(), collection);
    }
}
