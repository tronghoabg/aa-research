package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i2) {
        if (i2 < 0 || i2 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i2 + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i2) {
        return i2 < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i2;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i2) {
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, i2)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.content[IntervalListKt.binarySearch(mutableVector, i2)];
        this.lastInterval = interval2;
        return interval2;
    }

    public final void addInterval(int i2, T t) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
        }
        if (i2 == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i2, t);
        this.size = getSize() + i2;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i2, int i3, l<? super IntervalList.Interval<? extends T>, ab> lVar) {
        if (i2 < 0 || i2 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i2 + ", size " + getSize());
        }
        if (i3 < 0 || i3 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i3 + ", size " + getSize());
        }
        if (i3 < i2) {
            InlineClassHelperKt.throwIllegalArgumentException("toIndex (" + i3 + ") should be not smaller than fromIndex (" + i2 + ')');
        }
        int iBinarySearch = IntervalListKt.binarySearch(this.intervals, i2);
        int startIndex = this.intervals.content[iBinarySearch].getStartIndex();
        while (startIndex <= i3) {
            IntervalList.Interval<T> interval = this.intervals.content[iBinarySearch];
            lVar.invoke(interval);
            startIndex += interval.getSize();
            iBinarySearch++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int i2) {
        if (i2 < 0 || i2 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i2 + ", size " + getSize());
        }
        return getIntervalForIndex(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
