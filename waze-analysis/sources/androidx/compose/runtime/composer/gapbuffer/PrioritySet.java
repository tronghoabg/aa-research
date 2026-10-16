package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.MutableIntList;
import androidx.compose.runtime.PreconditionsKt;
import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PrioritySet {
    private final MutableIntList list;

    private /* synthetic */ PrioritySet(MutableIntList mutableIntList) {
        this.list = mutableIntList;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m7415addimpl(MutableIntList mutableIntList, int i2) {
        MutableIntList mutableIntList2 = mutableIntList;
        if (mutableIntList2._size == 0 || !(mutableIntList.get(0) == i2 || mutableIntList.get(mutableIntList2._size - 1) == i2)) {
            int i3 = mutableIntList2._size;
            mutableIntList.add(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int i5 = mutableIntList.get(i4);
                if (i2 <= i5) {
                    break;
                }
                mutableIntList.set(i3, i5);
                i3 = i4;
            }
            mutableIntList.set(i3, i2);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m7416boximpl(MutableIntList mutableIntList) {
        return new PrioritySet(mutableIntList);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m7418constructorimpl$default(MutableIntList mutableIntList, int i2, o oVar) {
        return (i2 & 1) != 0 ? new MutableIntList(0, 1, null) : mutableIntList;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7419equalsimpl(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && x.n(mutableIntList, ((PrioritySet) obj).m7428unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7420equalsimpl0(MutableIntList mutableIntList, MutableIntList mutableIntList2) {
        return x.n(mutableIntList, mutableIntList2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7421hashCodeimpl(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7422isEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m7423isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m7424peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m7425takeMaximpl(MutableIntList mutableIntList) {
        int i2;
        MutableIntList mutableIntList2 = mutableIntList;
        int i3 = mutableIntList2._size;
        int i4 = mutableIntList.get(0);
        while (mutableIntList2._size != 0 && mutableIntList.get(0) == i4) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList2._size - 1);
            int i5 = mutableIntList2._size;
            int i6 = i5 >>> 1;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = mutableIntList.get(i7);
                int i9 = i7 + 1;
                int i10 = i9 + i9;
                int i11 = i10 - 1;
                int i12 = mutableIntList.get(i11);
                if (i10 >= i5 || (i2 = mutableIntList.get(i10)) <= i12) {
                    if (i12 > i8) {
                        mutableIntList.set(i7, i12);
                        mutableIntList.set(i11, i8);
                        i7 = i11;
                    }
                } else if (i2 > i8) {
                    mutableIntList.set(i7, i2);
                    mutableIntList.set(i10, i8);
                    i7 = i10;
                }
            }
        }
        return i4;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7426toStringimpl(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m7427validateHeapimpl(MutableIntList mutableIntList) {
        int i2 = mutableIntList._size;
        int i3 = i2 / 2;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i5 + i5;
            if (mutableIntList.get(i4) < mutableIntList.get(i6 - 1)) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i6 < i2 && mutableIntList.get(i4) < mutableIntList.get(i6)) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i4 = i5;
        }
    }

    public boolean equals(Object obj) {
        return m7419equalsimpl(this.list, obj);
    }

    public int hashCode() {
        return m7421hashCodeimpl(this.list);
    }

    public String toString() {
        return m7426toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableIntList m7428unboximpl() {
        return this.list;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m7417constructorimpl(MutableIntList mutableIntList) {
        return mutableIntList;
    }
}
