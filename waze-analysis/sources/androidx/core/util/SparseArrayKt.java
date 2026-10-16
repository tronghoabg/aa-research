package androidx.core.util;

import android.util.SparseArray;
import h.a.aj;
import h.ab;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SparseArrayKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.util.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public final class C04091 implements Iterator, a {
        final /* synthetic */ SparseArray $this_valueIterator;
        private int index;

        C04091(SparseArray sparseArray) {
            this.$this_valueIterator = sparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i2 = this.index;
            this.index = i2 + 1;
            return this.$this_valueIterator.valueAt(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }
    }

    public static final <T> boolean contains(SparseArray<T> sparseArray, int i2) {
        x.f(sparseArray, "<this>");
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i2) {
        x.f(sparseArray, "<this>");
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t) {
        x.f(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, p<? super Integer, ? super T, ab> pVar) {
        x.f(sparseArray, "<this>");
        x.f(pVar, "action");
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i2)), sparseArray.valueAt(i2));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i2, T t) {
        x.f(sparseArray, "<this>");
        T t2 = sparseArray.get(i2);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i2, h.g.a.a<? extends T> aVar) {
        x.f(sparseArray, "<this>");
        x.f(aVar, "defaultValue");
        T t = sparseArray.get(i2);
        return t == null ? aVar.invoke() : t;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        x.f(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        x.f(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        x.f(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    public static final <T> aj keyIterator(final SparseArray<T> sparseArray) {
        x.f(sparseArray, "<this>");
        return new aj() { // from class: androidx.core.util.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // h.a.aj
            public int nextInt() {
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseArray.keyAt(i2);
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        x.f(sparseArray, "<this>");
        x.f(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        x.f(sparseArray, "<this>");
        x.f(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i2, T t) {
        x.f(sparseArray, "<this>");
        int iIndexOfKey = sparseArray.indexOfKey(i2);
        if (iIndexOfKey < 0 || !x.n(t, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i2, T t) {
        x.f(sparseArray, "<this>");
        sparseArray.put(i2, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        x.f(sparseArray, "<this>");
        return new C04091(sparseArray);
    }
}
