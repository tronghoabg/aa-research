package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import h.a.ak;
import h.a.c;
import h.ab;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    private static final Object DELETED = new Object();

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public final class C01761 implements Iterator, a {
        final /* synthetic */ LongSparseArray $this_valueIterator;
        private int index;

        C01761(LongSparseArray longSparseArray) {
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

    public static final <E> void commonAppend(LongSparseArray<E> longSparseArray, long j2, E e2) {
        x.f(longSparseArray, "<this>");
        int i2 = longSparseArray.size;
        if (i2 != 0 && j2 <= longSparseArray.keys[i2 - 1]) {
            longSparseArray.put(j2, e2);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i2 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != DELETED) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i3;
                i2 = i3;
            }
        }
        long[] jArr2 = longSparseArray.keys;
        if (i2 >= jArr2.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i2 + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iIdealLongArraySize);
            x.e(jArrCopyOf, "copyOf(...)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            x.e(objArrCopyOf, "copyOf(...)");
            longSparseArray.values = objArrCopyOf;
        }
        longSparseArray.keys[i2] = j2;
        longSparseArray.values[i2] = e2;
        longSparseArray.size = i2 + 1;
    }

    public static final <E> void commonClear(LongSparseArray<E> longSparseArray) {
        x.f(longSparseArray, "<this>");
        int i2 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> longSparseArray, long j2) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> longSparseArray, E e2) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e2) >= 0;
    }

    public static final <E> void commonGc(LongSparseArray<E> longSparseArray) {
        x.f(longSparseArray, "<this>");
        int i2 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i3;
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j2) {
        E e2;
        x.f(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        if (iBinarySearch < 0 || (e2 = (E) longSparseArray.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e2;
    }

    public static final Object commonGetInternal(LongSparseArray<?> longSparseArray, long j2, Object obj) {
        Object obj2;
        x.f(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        return (iBinarySearch < 0 || (obj2 = longSparseArray.values[iBinarySearch]) == DELETED) ? obj : obj2;
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> longSparseArray, long j2) {
        x.f(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> longSparseArray, E e2) {
        x.f(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        int i5 = longSparseArray.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (longSparseArray.values[i6] == e2) {
                return i6;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> longSparseArray, int i2) {
        x.f(longSparseArray, "<this>");
        if (i2 < 0 || i2 >= longSparseArray.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (longSparseArray.garbage) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        return longSparseArray.keys[i2];
    }

    public static final <E> void commonPut(LongSparseArray<E> longSparseArray, long j2, E e2) {
        x.f(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        if (iBinarySearch >= 0) {
            longSparseArray.values[iBinarySearch] = e2;
            return;
        }
        int i2 = ~iBinarySearch;
        int i3 = longSparseArray.size;
        if (i2 < i3) {
            Object[] objArr = longSparseArray.values;
            if (objArr[i2] == DELETED) {
                longSparseArray.keys[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i3 >= jArr.length) {
                Object[] objArr2 = longSparseArray.values;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = objArr2[i5];
                    if (obj != DELETED) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i4;
                i2 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i4, j2);
            }
        }
        int i6 = longSparseArray.size;
        long[] jArr2 = longSparseArray.keys;
        if (i6 >= jArr2.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i6 + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iIdealLongArraySize);
            x.e(jArrCopyOf, "copyOf(...)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            x.e(objArrCopyOf, "copyOf(...)");
            longSparseArray.values = objArrCopyOf;
        }
        int i7 = longSparseArray.size;
        if (i7 - i2 != 0) {
            long[] jArr3 = longSparseArray.keys;
            int i8 = i2 + 1;
            c.as(jArr3, jArr3, i8, i2, i7);
            Object[] objArr3 = longSparseArray.values;
            c.at(objArr3, objArr3, i8, i2, longSparseArray.size);
        }
        longSparseArray.keys[i2] = j2;
        longSparseArray.values[i2] = e2;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> longSparseArray, LongSparseArray<? extends E> longSparseArray2) {
        x.f(longSparseArray, "<this>");
        x.f(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            longSparseArray.put(longSparseArray2.keyAt(i2), longSparseArray2.valueAt(i2));
        }
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> longSparseArray, long j2, E e2) {
        x.f(longSparseArray, "<this>");
        E e3 = longSparseArray.get(j2);
        if (e3 == null) {
            longSparseArray.put(j2, e2);
        }
        return e3;
    }

    public static final <E> void commonRemove(LongSparseArray<E> longSparseArray, long j2) {
        x.f(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        if (iBinarySearch >= 0) {
            Object[] objArr = longSparseArray.values;
            if (objArr[iBinarySearch] != DELETED) {
                objArr[iBinarySearch] = DELETED;
                longSparseArray.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> longSparseArray, int i2) {
        x.f(longSparseArray, "<this>");
        Object[] objArr = longSparseArray.values;
        if (objArr[i2] != DELETED) {
            objArr[i2] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> longSparseArray, long j2, E e2, E e3) {
        x.f(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0 || !x.n(longSparseArray.values[iIndexOfKey], e2)) {
            return false;
        }
        longSparseArray.values[iIndexOfKey] = e3;
        return true;
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> longSparseArray, int i2, E e2) {
        x.f(longSparseArray, "<this>");
        if (i2 < 0 || i2 >= longSparseArray.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (longSparseArray.garbage) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        longSparseArray.values[i2] = e2;
    }

    public static final <E> int commonSize(LongSparseArray<E> longSparseArray) {
        x.f(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return longSparseArray.size;
    }

    public static final <E> String commonToString(LongSparseArray<E> longSparseArray) {
        x.f(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(longSparseArray.size * 28);
        sb.append('{');
        int i2 = longSparseArray.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i3));
            sb.append('=');
            E eValueAt = longSparseArray.valueAt(i3);
            if (eValueAt != sb) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final <E> E commonValueAt(LongSparseArray<E> longSparseArray, int i2) {
        x.f(longSparseArray, "<this>");
        if (i2 < 0 || i2 >= longSparseArray.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (longSparseArray.garbage) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        return (E) longSparseArray.values[i2];
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j2) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.containsKey(j2);
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
        return longSparseArray.get(j2, t);
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

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    public static final <T> ak keyIterator(final LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return new ak() { // from class: androidx.collection.LongSparseArrayKt.keyIterator.1
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
        longSparseArray3.putAll(longSparseArray);
        longSparseArray3.putAll(longSparseArray2);
        return longSparseArray3;
    }

    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j2, Object obj) {
        x.f(longSparseArray, "<this>");
        return longSparseArray.remove(j2, obj);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j2, T t) {
        x.f(longSparseArray, "<this>");
        longSparseArray.put(j2, t);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        x.f(longSparseArray, "<this>");
        return new C01761(longSparseArray);
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j2, E e2) {
        E e3;
        x.f(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        return (iBinarySearch < 0 || (e3 = (E) longSparseArray.values[iBinarySearch]) == DELETED) ? e2 : e3;
    }

    public static final <E> E commonReplace(LongSparseArray<E> longSparseArray, long j2, E e2) {
        x.f(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e3 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e2;
        return e3;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> longSparseArray, long j2, E e2) {
        x.f(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0 || !x.n(e2, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }
}
