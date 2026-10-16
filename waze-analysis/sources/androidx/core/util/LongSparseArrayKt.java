package androidx.core.util;

import android.util.LongSparseArray;
import h.a.ak;
import h.ab;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LongSparseArrayKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public final class C04081 implements Iterator, a {
        final /* synthetic */ LongSparseArray $this_valueIterator;
        private int index;

        C04081(LongSparseArray longSparseArray) {
            this.$this_valueIterator = longSparseArray;
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

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j2) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j2) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, p<? super Long, ? super T, ab> pVar) {
        x.f(longSparseArray, "<this>");
        x.f(pVar, "action");
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i2)), longSparseArray.valueAt(i2));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j2, T t) {
        x.f(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j2);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j2, h.g.a.a<? extends T> aVar) {
        x.f(longSparseArray, "<this>");
        x.f(aVar, "defaultValue");
        T t = longSparseArray.get(j2);
        return t == null ? aVar.invoke() : t;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    public static final <T> ak keyIterator(final LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return new ak() { // from class: androidx.core.util.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // h.a.ak
            public long nextLong() {
                int i2 = this.index;
                this.index = i2 + 1;
                return longSparseArray.keyAt(i2);
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        x.f(longSparseArray, "<this>");
        x.f(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        x.f(longSparseArray, "<this>");
        x.f(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            longSparseArray.put(longSparseArray2.keyAt(i2), longSparseArray2.valueAt(i2));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j2, T t) {
        x.f(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0 || !x.n(t, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j2, T t) {
        x.f(longSparseArray, "<this>");
        longSparseArray.put(j2, t);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return new C04081(longSparseArray);
    }
}
