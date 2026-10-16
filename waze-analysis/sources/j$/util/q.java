package j$.util;

import j$.util.Collection;
import j$.util.stream.Stream;
import j$.util.stream.p8;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q extends t {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.l, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f50272a.contains(new o((Map.Entry) obj));
    }

    @Override // j$.util.l, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.t, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f50272a.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // j$.util.l, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.f50272a, new j$.nio.file.r(consumer, 2));
    }

    @Override // j$.util.l, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new k(this);
    }

    @Override // j$.util.l, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return p8.a(spliterator(), true);
    }

    @Override // j$.util.l, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        return new p(Collection.EL.c(this.f50272a));
    }

    @Override // j$.util.l, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return p8.a(spliterator(), false);
    }

    @Override // j$.util.l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f50272a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i2 = 0; i2 < array.length; i2++) {
            array[i2] = new o((Map.Entry) array[i2]);
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

    @Override // j$.util.l, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f50272a.toArray();
        for (int i2 = 0; i2 < array.length; i2++) {
            array[i2] = new o((Map.Entry) array[i2]);
        }
        return array;
    }
}
