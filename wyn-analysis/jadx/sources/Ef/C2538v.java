package ef;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* renamed from: ef.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2538v implements Collection, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f34687a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof C2537u)) {
            return false;
        }
        int i5 = ((C2537u) obj).f34686a;
        int[] iArr = this.f34687a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (i5 == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C2537u) {
                    int i5 = ((C2537u) obj).f34686a;
                    int[] iArr = this.f34687a;
                    int length = iArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (i5 == iArr[i10]) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C2538v) {
            return AbstractC3340k.a(this.f34687a, ((C2538v) obj).f34687a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f34687a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f34687a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Uf.h(this.f34687a, 2);
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
        return this.f34687a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f34687a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        return AbstractC3339j.c(this, array);
    }
}
