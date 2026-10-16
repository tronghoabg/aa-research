package l8;

import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: l8.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3409K extends AbstractC3404F implements List, RandomAccess, j$.util.List {

    /* renamed from: b, reason: collision with root package name */
    public static final C3407I f40056b = new C3407I(e0.f40101e, 0);

    public static e0 h(int i5, Object[] objArr) {
        return i5 == 0 ? e0.f40101e : new e0(objArr, i5);
    }

    public static C3406H i() {
        return new C3406H(4);
    }

    public static AbstractC3409K j(Collection collection) {
        if (!(collection instanceof AbstractC3404F)) {
            Object[] array = collection.toArray();
            AbstractC3437s.b(array.length, array);
            return h(array.length, array);
        }
        AbstractC3409K abstractC3409KA = ((AbstractC3404F) collection).a();
        if (!abstractC3409KA.f()) {
            return abstractC3409KA;
        }
        Object[] array2 = abstractC3409KA.toArray(AbstractC3404F.f40047a);
        return h(array2.length, array2);
    }

    public static e0 k(Object[] objArr) {
        if (objArr.length == 0) {
            return e0.f40101e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC3437s.b(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static e0 m(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        AbstractC3437s.b(5, objArr);
        return h(5, objArr);
    }

    public static e0 n(Object obj) {
        Object[] objArr = {obj};
        AbstractC3437s.b(1, objArr);
        return h(1, objArr);
    }

    public static e0 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC3437s.b(2, objArr);
        return h(2, objArr);
    }

    public static e0 p(d0 d0Var, List list) {
        List list2;
        d0Var.getClass();
        List list3 = list;
        if (list3 instanceof Collection) {
            list2 = list3;
        } else {
            Iterator it = list3.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        AbstractC3437s.b(array.length, array);
        Arrays.sort(array, d0Var);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l8.AbstractC3404F
    public int b(int i5, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i5 + i10] = get(i10);
        }
        return i5 + size;
    }

    @Override // l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Fe.b.v(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        if (Fe.b.v(get(i5), list.get(i5))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // l8.AbstractC3404F
    /* renamed from: g */
    public final t0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i5 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i5 = ~(~(get(i10).hashCode() + (i5 * 31)));
        }
        return i5;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (obj.equals(get(i5))) {
                return i5;
            }
        }
        return -1;
    }

    @Override // l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C3407I listIterator(int i5) {
        Fe.e.u(i5, size());
        return isEmpty() ? f40056b : new C3407I(this, i5);
    }

    @Override // java.util.List
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
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC3409K subList(int i5, int i10) {
        Fe.e.v(i5, i10, size());
        int i11 = i10 - i5;
        return i11 == size() ? this : i11 == 0 ? e0.f40101e : new C3408J(this, i5, i11);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l8.AbstractC3404F
    public final AbstractC3409K a() {
        return this;
    }
}
