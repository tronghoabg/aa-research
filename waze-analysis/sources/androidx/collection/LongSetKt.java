package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LongSetKt {
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final LongSet buildLongSet(l<? super MutableLongSet, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(0, 1, null);
        lVar.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final int hash(long j2) {
        int iM = LongSetKt$$ExternalSyntheticBackport0.m(j2) * ScatterMapKt.MurmurHashC1;
        return iM ^ (iM << 16);
    }

    public static final LongSet longSetOf(long... jArr) {
        x.f(jArr, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(jArr.length);
        mutableLongSet.plusAssign(jArr);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j2, long j3, long j4) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j2);
        mutableLongSet.plusAssign(j3);
        mutableLongSet.plusAssign(j4);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j2) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j2);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j2) {
        return mutableLongSetOf(j2);
    }

    public static final MutableLongSet mutableLongSetOf(long j2, long j3) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j2);
        mutableLongSet.plusAssign(j3);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j2, long j3) {
        return mutableLongSetOf(j2, j3);
    }

    public static final LongSet buildLongSet(int i2, l<? super MutableLongSet, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(i2);
        lVar.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j2, long j3, long j4) {
        return mutableLongSetOf(j2, j3, j4);
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    public static final MutableLongSet mutableLongSetOf(long... jArr) {
        x.f(jArr, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(jArr.length);
        mutableLongSet.plusAssign(jArr);
        return mutableLongSet;
    }
}
