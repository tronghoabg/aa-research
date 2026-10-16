package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FloatListKt {
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    public static final FloatList buildFloatList(l<? super MutableFloatList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(0, 1, null);
        lVar.invoke(mutableFloatList);
        return mutableFloatList;
    }

    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    public static final FloatList floatListOf(float... fArr) {
        x.f(fArr, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(fArr.length);
        mutableFloatList.addAll(mutableFloatList._size, fArr);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float... fArr) {
        x.f(fArr, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(fArr.length);
        mutableFloatList.addAll(mutableFloatList._size, fArr);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f2) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f2);
        return mutableFloatList;
    }

    public static final FloatList buildFloatList(int i2, l<? super MutableFloatList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(i2);
        lVar.invoke(mutableFloatList);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float f2) {
        return mutableFloatListOf(f2);
    }

    public static final MutableFloatList mutableFloatListOf(float f2, float f3) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f2);
        mutableFloatList.add(f3);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float f2, float f3) {
        return mutableFloatListOf(f2, f3);
    }

    public static final FloatList floatListOf(float f2, float f3, float f4) {
        return mutableFloatListOf(f2, f3, f4);
    }

    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f2, float f3, float f4) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f2);
        mutableFloatList.add(f3);
        mutableFloatList.add(f4);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }
}
