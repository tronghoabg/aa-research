package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import h.a.i;
import h.b.a;
import h.g.a.l;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final <T> boolean all(ObjectList<T> objectList, l<? super T, Boolean> lVar) {
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (!lVar.invoke(objArr[i3]).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> ObjectList<T> fastFilter(ObjectList<T> objectList, l<? super T, Boolean> lVar) {
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (!lVar.invoke(objArr[i3]).booleanValue()) {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i4 = objectList._size;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (lVar.invoke(obj).booleanValue()) {
                        mutableObjectList.add(obj);
                    }
                }
                return mutableObjectList;
            }
        }
        return objectList;
    }

    public static final <T, R> ObjectList<R> fastMap(ObjectList<T> objectList, l<? super T, ? extends R> lVar) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableObjectList.add(lVar.invoke(objArr[i3]));
        }
        return mutableObjectList;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(ObjectList<T> objectList, l<? super T, ? extends K> lVar) {
        if (objectList.getSize() <= 1) {
            return true;
        }
        K kInvoke = lVar.invoke(objectList.get(0));
        if (kInvoke == null) {
            return false;
        }
        int size = objectList.getSize();
        int i2 = 1;
        while (i2 < size) {
            K kInvoke2 = lVar.invoke(objectList.get(i2));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i2++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T> T removeLast(MutableObjectList<T> mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int size = mutableObjectList.getSize() - 1;
        T t = mutableObjectList.get(size);
        mutableObjectList.removeAt(size);
        return t;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(MutableObjectList<T> mutableObjectList, final l<? super T, ? extends K> lVar) {
        List<T> listAsMutableList = mutableObjectList.asMutableList();
        if (listAsMutableList.size() > 1) {
            i.t(listAsMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    l lVar2 = lVar;
                    return a.a((Comparable) lVar2.invoke(t), (Comparable) lVar2.invoke(t2));
                }
            });
        }
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(ObjectList<T> objectList, l<? super T, ? extends K> lVar) {
        if (isSorted(objectList, lVar)) {
            return objectList;
        }
        MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, lVar);
        return mutableObjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> MutableObjectList<T> toMutableObjectList(ObjectList<T> objectList) {
        MutableObjectList<T> mutableObjectList = (MutableObjectList<T>) new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableObjectList.add(objArr[i3]);
        }
        return mutableObjectList;
    }
}
