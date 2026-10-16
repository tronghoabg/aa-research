package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LongListKt {
    private static final LongList EmptyLongList = new MutableLongList(0);

    public static final LongList buildLongList(l<? super MutableLongList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(0, 1, null);
        lVar.invoke(mutableLongList);
        return mutableLongList;
    }

    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    public static final LongList longListOf(long... jArr) {
        x.f(jArr, "elements");
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.addAll(mutableLongList._size, jArr);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long... jArr) {
        x.f(jArr, "elements");
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.addAll(mutableLongList._size, jArr);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j2) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j2);
        return mutableLongList;
    }

    public static final LongList buildLongList(int i2, l<? super MutableLongList, ab> lVar) {
        x.f(lVar, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(i2);
        lVar.invoke(mutableLongList);
        return mutableLongList;
    }

    public static final LongList longListOf(long j2) {
        return mutableLongListOf(j2);
    }

    public static final MutableLongList mutableLongListOf(long j2, long j3) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        return mutableLongList;
    }

    public static final LongList longListOf(long j2, long j3) {
        return mutableLongListOf(j2, j3);
    }

    public static final LongList longListOf(long j2, long j3, long j4) {
        return mutableLongListOf(j2, j3, j4);
    }

    public static final LongList longListOf() {
        return EmptyLongList;
    }

    public static final MutableLongList mutableLongListOf(long j2, long j3, long j4) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        mutableLongList.add(j4);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }
}
