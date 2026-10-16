package ff;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class k implements Collection, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f35424a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35425b;

    public k(Object[] values, boolean z2) {
        AbstractC3340k.e(values, "values");
        this.f35424a = values;
        this.f35425b = z2;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return m.e0(obj, this.f35424a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m.e0(it.next(), this.f35424a)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f35424a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC3340k.i(this.f35424a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f35424a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        return AbstractC3339j.c(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f35424a;
        AbstractC3340k.e(objArr, "<this>");
        if (this.f35425b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }
}
