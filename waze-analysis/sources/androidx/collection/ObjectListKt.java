package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ObjectListKt {
    private static final Object[] EmptyArray = new Object[0];
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            RuntimeHelpersKt.throwIllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("fromIndex (" + i2 + ") is less than 0.");
        }
        if (i3 > size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ")");
        }
    }

    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        x.d(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2, E e3, E e4) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        mutableObjectList.add(e4);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E... eArr) {
        x.f(eArr, "elements");
        MutableObjectList mutableObjectList = new MutableObjectList(eArr.length);
        mutableObjectList.plusAssign((Object[]) eArr);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e2);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e2) {
        return mutableObjectListOf(e2);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2, E e3) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e2, E e3) {
        return mutableObjectListOf(e2, e3);
    }

    public static final <E> ObjectList<E> objectListOf(E e2, E e3, E e4) {
        return mutableObjectListOf(e2, e3, e4);
    }

    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        x.d(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E... eArr) {
        x.f(eArr, "elements");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(eArr.length);
        mutableObjectList.plusAssign((Object[]) eArr);
        return mutableObjectList;
    }
}
