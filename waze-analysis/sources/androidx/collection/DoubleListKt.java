package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DoubleListKt {
    private static final DoubleList EmptyDoubleList = new MutableDoubleList(0);

    public static final DoubleList buildDoubleList(l<? super MutableDoubleList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(0, 1, null);
        lVar.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf(double... dArr) {
        x.f(dArr, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(dArr.length);
        mutableDoubleList.addAll(mutableDoubleList._size, dArr);
        return mutableDoubleList;
    }

    public static final DoubleList emptyDoubleList() {
        return EmptyDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double... dArr) {
        x.f(dArr, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(dArr.length);
        mutableDoubleList.addAll(mutableDoubleList._size, dArr);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double d2) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(1);
        mutableDoubleList.add(d2);
        return mutableDoubleList;
    }

    public static final DoubleList buildDoubleList(int i2, l<? super MutableDoubleList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(i2);
        lVar.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf(double d2) {
        return mutableDoubleListOf(d2);
    }

    public static final MutableDoubleList mutableDoubleListOf(double d2, double d3) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(2);
        mutableDoubleList.add(d2);
        mutableDoubleList.add(d3);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf(double d2, double d3) {
        return mutableDoubleListOf(d2, d3);
    }

    public static final DoubleList doubleListOf(double d2, double d3, double d4) {
        return mutableDoubleListOf(d2, d3, d4);
    }

    public static final DoubleList doubleListOf() {
        return EmptyDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double d2, double d3, double d4) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(3);
        mutableDoubleList.add(d2);
        mutableDoubleList.add(d3);
        mutableDoubleList.add(d4);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf() {
        return new MutableDoubleList(0, 1, null);
    }
}
