package androidx.collection;

import h.a.aj;
import h.ab;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SparseArrayKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public final class C01771 implements Iterator, a {
        final /* synthetic */ SparseArrayCompat $this_valueIterator;
        private int index;

        C01771(SparseArrayCompat sparseArrayCompat) {
            this.$this_valueIterator = sparseArrayCompat;
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

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i2);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, p<? super Integer, ? super T, ab> pVar) {
        x.f(sparseArrayCompat, "<this>");
        x.f(pVar, "action");
        int size = sparseArrayCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i2)), sparseArrayCompat.valueAt(i2));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i2, T t) {
        x.f(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i2, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i2, h.g.a.a<? extends T> aVar) {
        x.f(sparseArrayCompat, "<this>");
        x.f(aVar, "defaultValue");
        T t = sparseArrayCompat.get(i2);
        return t == null ? aVar.invoke() : t;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> aj keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        return new aj() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // h.a.aj
            public int nextInt() {
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseArrayCompat.keyAt(i2);
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> sparseArrayCompat2) {
        x.f(sparseArrayCompat, "<this>");
        x.f(sparseArrayCompat2, "other");
        SparseArrayCompat<T> sparseArrayCompat3 = new SparseArrayCompat<>(sparseArrayCompat.size() + sparseArrayCompat2.size());
        sparseArrayCompat3.putAll(sparseArrayCompat);
        sparseArrayCompat3.putAll(sparseArrayCompat2);
        return sparseArrayCompat3;
    }

    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i2, Object obj) {
        x.f(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i2, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i2, T t) {
        x.f(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i2, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        return new C01771(sparseArrayCompat);
    }

    public static /* synthetic */ void getSize$annotations(SparseArrayCompat sparseArrayCompat) {
    }
}
