package j$.util;

import j$.util.Collection;
import j$.util.stream.L3;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class r extends C3054u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C2917l, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.f37923a, new C2920o(consumer));
    }

    @Override // j$.util.C2917l, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new C2922q(Collection.EL.c(this.f37923a));
    }

    @Override // j$.util.C2917l, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return L3.d(spliterator(), false);
    }

    @Override // j$.util.C2917l, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return L3.d(spliterator(), true);
    }

    @Override // j$.util.C2917l, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2916k(this);
    }

    @Override // j$.util.C2917l, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f37923a.toArray();
        for (int i5 = 0; i5 < array.length; i5++) {
            array[i5] = new C2921p((Map.Entry) array[i5]);
        }
        return array;
    }

    @Override // j$.util.C2917l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f37923a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i5 = 0; i5 < array.length; i5++) {
            array[i5] = new C2921p((Map.Entry) array[i5]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C2917l, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f37923a.contains(new C2921p((Map.Entry) obj));
    }

    @Override // j$.util.C2917l, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C3054u, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f37923a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
