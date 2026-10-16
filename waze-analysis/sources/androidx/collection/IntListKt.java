package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntListKt {
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList buildIntList(l<? super MutableIntList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        lVar.invoke(mutableIntList);
        return mutableIntList;
    }

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf(int... iArr) {
        x.f(iArr, "elements");
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.addAll(mutableIntList._size, iArr);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int... iArr) {
        x.f(iArr, "elements");
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.addAll(mutableIntList._size, iArr);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i2) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i2);
        return mutableIntList;
    }

    public static final IntList buildIntList(int i2, l<? super MutableIntList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(i2);
        lVar.invoke(mutableIntList);
        return mutableIntList;
    }

    public static final IntList intListOf(int i2) {
        return mutableIntListOf(i2);
    }

    public static final MutableIntList mutableIntListOf(int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i2);
        mutableIntList.add(i3);
        return mutableIntList;
    }

    public static final IntList intListOf(int i2, int i3) {
        return mutableIntListOf(i2, i3);
    }

    public static final IntList intListOf(int i2, int i3, int i4) {
        return mutableIntListOf(i2, i3, i4);
    }

    public static final IntList intListOf() {
        return EmptyIntList;
    }

    public static final MutableIntList mutableIntListOf(int i2, int i3, int i4) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i2);
        mutableIntList.add(i3);
        mutableIntList.add(i4);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }
}
