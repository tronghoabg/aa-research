package androidx.compose.runtime.collection;

import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i2, l<? super Integer, ? extends T> lVar) {
        x.i();
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = lVar.invoke(Integer.valueOf(i3));
        }
        return new MutableVector<>(objArr, i2);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i2, int i3, Object obj) {
        x.i();
        if (1 == (i3 & 1)) {
            i2 = 16;
        }
        return new MutableVector(new Object[i2], 0);
    }

    public static final void checkIndex(List<?> list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throwListIndexOutOfBoundsException(i2, size);
        }
    }

    public static final void checkSubIndex(List<?> list, int i2, int i3) {
        if (i2 > i3) {
            throwReversedIndicesException(i2, i3);
        }
        if (i2 < 0) {
            throwNegativeIndexException(i2);
        }
        if (i3 > list.size()) {
            throwOutOfRangeException(i3, list.size());
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        x.i();
        return new MutableVector<>(new Object[16], 0);
    }

    private static final void throwListIndexOutOfBoundsException(int i2, int i3) {
        throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + i3 + " elements.");
    }

    private static final void throwNegativeIndexException(int i2) {
        throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than 0.");
    }

    private static final void throwOutOfRangeException(int i2, int i3) {
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + i3 + ')');
    }

    private static final void throwReversedIndicesException(int i2, int i3) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i2) {
        x.i();
        return new MutableVector<>(new Object[i2], 0);
    }
}
