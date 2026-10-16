package com.bytedance.adsdk.oa;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class wk<K, V> {

    /* renamed from: oa, reason: collision with root package name */
    wk<K, V>.oa f24597oa;

    public final class oa implements Set<K> {
        public oa() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            wk.this.yo();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return wk.this.uef(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return wk.uef(wk.this.oa(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return wk.uef(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iUef = wk.this.uef() - 1; iUef >= 0; iUef--) {
                Object objUef = wk.this.uef(iUef, 0);
                iHashCode += objUef == null ? 0 : objUef.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return wk.this.uef() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new uef(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iUef = wk.this.uef(obj);
            if (iUef < 0) {
                return false;
            }
            wk.this.uef(iUef);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return wk.oa(wk.this.oa(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return wk.yo(wk.this.oa(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return wk.this.uef();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return wk.this.oa(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) wk.this.uef(tArr, 0);
        }
    }

    public final class uef<T> implements Iterator<T> {
        boolean moa = false;

        /* renamed from: oa, reason: collision with root package name */
        int f24598oa;
        final int uef;
        int yo;

        public uef(int i5) {
            this.uef = i5;
            this.f24598oa = wk.this.uef();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.yo < this.f24598oa;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) wk.this.uef(this.yo, this.uef);
            this.yo++;
            this.moa = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.moa) {
                throw new IllegalStateException();
            }
            int i5 = this.yo - 1;
            this.yo = i5;
            this.f24598oa--;
            this.moa = false;
            wk.this.uef(i5);
        }
    }

    public static <K, V> boolean oa(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean uef(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean yo(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Set<K> moa() {
        if (this.f24597oa == null) {
            this.f24597oa = new oa();
        }
        return this.f24597oa;
    }

    public abstract Map<K, V> oa();

    public abstract int uef();

    public abstract int uef(Object obj);

    public abstract Object uef(int i5, int i10);

    public abstract void uef(int i5);

    public abstract void yo();

    public <T> T[] uef(T[] tArr, int i5) {
        int iUef = uef();
        if (tArr.length < iUef) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iUef));
        }
        for (int i10 = 0; i10 < iUef; i10++) {
            tArr[i10] = uef(i10, i5);
        }
        if (tArr.length > iUef) {
            tArr[iUef] = null;
        }
        return tArr;
    }

    public Object[] oa(int i5) {
        int iUef = uef();
        Object[] objArr = new Object[iUef];
        for (int i10 = 0; i10 < iUef; i10++) {
            objArr[i10] = uef(i10, i5);
        }
        return objArr;
    }

    public static <T> boolean uef(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
