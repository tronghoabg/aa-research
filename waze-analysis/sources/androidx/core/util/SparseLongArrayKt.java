package androidx.core.util;

import android.util.SparseLongArray;
import h.a.aj;
import h.a.ak;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(SparseLongArray sparseLongArray, int i2) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i2) >= 0;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i2) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i2) >= 0;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j2) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j2) >= 0;
    }

    public static final void forEach(SparseLongArray sparseLongArray, p<? super Integer, ? super Long, ab> pVar) {
        x.f(sparseLongArray, "<this>");
        x.f(pVar, "action");
        int size = sparseLongArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i2)), Long.valueOf(sparseLongArray.valueAt(i2)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i2, long j2) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.get(i2, j2);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i2, a<Long> aVar) {
        x.f(sparseLongArray, "<this>");
        x.f(aVar, "defaultValue");
        int iIndexOfKey = sparseLongArray.indexOfKey(i2);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : aVar.invoke().longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        x.f(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    public static final aj keyIterator(final SparseLongArray sparseLongArray) {
        x.f(sparseLongArray, "<this>");
        return new aj() { // from class: androidx.core.util.SparseLongArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // h.a.aj
            public int nextInt() {
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseLongArray.keyAt(i2);
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }
        };
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        x.f(sparseLongArray, "<this>");
        x.f(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        x.f(sparseLongArray, "<this>");
        x.f(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i2), sparseLongArray2.valueAt(i2));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i2, long j2) {
        x.f(sparseLongArray, "<this>");
        int iIndexOfKey = sparseLongArray.indexOfKey(i2);
        if (iIndexOfKey < 0 || j2 != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void set(SparseLongArray sparseLongArray, int i2, long j2) {
        x.f(sparseLongArray, "<this>");
        sparseLongArray.put(i2, j2);
    }

    public static final ak valueIterator(final SparseLongArray sparseLongArray) {
        x.f(sparseLongArray, "<this>");
        return new ak() { // from class: androidx.core.util.SparseLongArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // h.a.ak
            public long nextLong() {
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseLongArray.valueAt(i2);
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }
        };
    }
}
