package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FloatSetKt {
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);
    private static final float[] EmptyFloatArray = new float[0];

    public static final FloatSet buildFloatSet(l<? super MutableFloatSet, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(0, 1, null);
        lVar.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf(float... fArr) {
        x.f(fArr, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(fArr.length);
        mutableFloatSet.plusAssign(fArr);
        return mutableFloatSet;
    }

    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f2) {
        int iFloatToIntBits = Float.floatToIntBits(f2) * ScatterMapKt.MurmurHashC1;
        return iFloatToIntBits ^ (iFloatToIntBits << 16);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f2, float f3, float f4) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f2);
        mutableFloatSet.plusAssign(f3);
        mutableFloatSet.plusAssign(f4);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f2) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f2);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f2) {
        return mutableFloatSetOf(f2);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f2, float f3) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f2);
        mutableFloatSet.plusAssign(f3);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f2, float f3) {
        return mutableFloatSetOf(f2, f3);
    }

    public static final FloatSet buildFloatSet(int i2, l<? super MutableFloatSet, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(i2);
        lVar.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f2, float f3, float f4) {
        return mutableFloatSetOf(f2, f3, f4);
    }

    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    public static final MutableFloatSet mutableFloatSetOf(float... fArr) {
        x.f(fArr, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(fArr.length);
        mutableFloatSet.plusAssign(fArr);
        return mutableFloatSet;
    }
}
