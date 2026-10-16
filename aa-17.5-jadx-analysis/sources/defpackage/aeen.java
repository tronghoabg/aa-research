package defpackage;

import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public abstract class aeen extends aeeg implements List, aefo {
    protected aeen() {
    }

    @Override // defpackage.aefo
    public final /* synthetic */ Byte A(int i) {
        return Byte.valueOf(m(i));
    }

    @Override // defpackage.aefo
    public final /* synthetic */ Byte B(int i, Byte b) {
        return Byte.valueOf(n(i, b.byteValue()));
    }

    @Override // defpackage.aefo
    public final /* synthetic */ void C(int i, Byte b) {
        p(i, b.byteValue());
    }

    protected final void D(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
    }

    protected final void E(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
    }

    @Override // defpackage.aefo
    public final /* synthetic */ void F(byte[] bArr) {
        H(bArr);
    }

    @Override // defpackage.aefo
    public /* synthetic */ void G(aefb aefbVar) {
        if (aefbVar == null) {
            I();
            return;
        }
        byte[] bArrJ = j();
        aeew.b(bArrJ, 0, bArrJ.length, aefbVar, null);
        F(bArrJ);
    }

    @Override // defpackage.aefo
    public final /* synthetic */ void H(byte[] bArr) {
        t(0, bArr, bArr.length);
    }

    @Override // defpackage.aefo
    public /* synthetic */ void I() {
        byte[] bArrJ = j();
        Arrays.sort(bArrJ, 0, bArrJ.length);
        F(bArrJ);
    }

    @Override // defpackage.aeeg, defpackage.aeez
    /* renamed from: a */
    public final /* synthetic */ aefl iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        C(i, (Byte) obj);
    }

    public boolean addAll(int i, Collection<? extends Byte> collection) {
        if (collection instanceof aeez) {
            return s(i, (aeez) collection);
        }
        D(i);
        Iterator<? extends Byte> it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            p(i, it.next().byteValue());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public /* synthetic */ aefz b() {
        throw null;
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public boolean c(byte b) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        r(0, size());
    }

    @Override // defpackage.aeeg
    public final boolean d(aeez aeezVar) {
        return s(size(), aeezVar);
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public final boolean e(byte b) {
        return v(b) >= 0;
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
        if (list instanceof aefo) {
            aefp aefpVarListIterator = listIterator(0);
            aefp aefpVarY = ((aefo) list).y();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (aefpVarListIterator.c() != aefpVarY.c()) {
                    return false;
                }
                size = i;
            }
        } else {
            aefp aefpVarListIterator2 = listIterator(0);
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!Objects.equals(aefpVarListIterator2.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public boolean g(byte b) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        return z(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        aefp aefpVarListIterator = listIterator(0);
        int size = size();
        int iC = 1;
        while (size != 0) {
            size--;
            iC = (iC * 31) + aefpVarListIterator.c();
        }
        return iC;
    }

    @Override // java.util.List
    public final /* synthetic */ int indexOf(Object obj) {
        return v(((Byte) obj).byteValue());
    }

    @Override // defpackage.aeeg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public final byte[] j() {
        int size = size();
        if (size == 0) {
            return aeew.a;
        }
        byte[] bArr = new byte[size];
        q(0, bArr, 0, size);
        return bArr;
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public aefo subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ int lastIndexOf(Object obj) {
        return w(((Byte) obj).byteValue());
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public byte m(int i) {
        throw null;
    }

    public byte n(int i, byte b) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public aefp listIterator(int i) {
        throw null;
    }

    public void p(int i, byte b) {
        throw null;
    }

    public void q(int i, byte[] bArr, int i2, int i3) {
        throw null;
    }

    public void r(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object remove(int i) {
        return A(i);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    public boolean s(int i, aeez aeezVar) {
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return B(i, (Byte) obj);
    }

    @Override // j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        G((comparator == null || (comparator instanceof aefb)) ? (aefb) comparator : new aefc(comparator));
    }

    @Override // defpackage.aeeg, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }

    public void t(int i, byte[] bArr, int i2) {
        throw null;
    }

    @Override // defpackage.aeeg, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aefp aefpVarListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf((int) aefpVarListIterator.c()));
            size--;
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int compareTo(java.util.List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof aefo) {
            aefp aefpVarListIterator = listIterator(0);
            aefp aefpVarY = ((aefo) list).y();
            while (aefpVarListIterator.hasNext() && aefpVarY.hasNext()) {
                int iCompare = Byte.compare(aefpVarListIterator.c(), aefpVarY.c());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (aefpVarY.hasNext()) {
                return -1;
            }
            return aefpVarListIterator.hasNext() ? 1 : 0;
        }
        aefp aefpVarListIterator2 = listIterator(0);
        ListIterator listIterator = list.listIterator();
        while (aefpVarListIterator2.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) aefpVarListIterator2.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return aefpVarListIterator2.hasNext() ? 1 : 0;
    }

    @Override // defpackage.aefo
    public int v(byte b) {
        aefp aefpVarListIterator = listIterator(0);
        while (aefpVarListIterator.hasNext()) {
            if (b == aefpVarListIterator.c()) {
                return aefpVarListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aefo
    public int w(byte b) {
        aefp aefpVarListIterator = listIterator(size());
        while (aefpVarListIterator.hasPrevious()) {
            if (b == aefpVarListIterator.d()) {
                return aefpVarListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // defpackage.aefo
    public final aefp x() {
        return listIterator(0);
    }

    @Override // defpackage.aefo
    public final aefp y() {
        return listIterator(0);
    }

    @Override // defpackage.aefo
    public final /* synthetic */ Byte z(int i) {
        return Byte.valueOf(l(i));
    }

    @Override // defpackage.aeeg, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Byte> collection) {
        return addAll(size(), collection);
    }
}
