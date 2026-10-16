package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    /* compiled from: WazeSource */
    public final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Interval(int i2, int i3) {
            this.start = i2;
            this.end = i3;
            if (i2 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("negative start index");
            }
            if (i3 >= i2) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = interval.start;
            }
            if ((i4 & 2) != 0) {
                i3 = interval.end;
            }
            return interval.copy(i2, i3);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int i2, int i3) {
            return new Interval(i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    public final Interval addInterval(int i2, int i3) {
        Interval interval = new Interval(i2, i3);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Interval interval = intervalArr[i2];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Interval interval = intervalArr[i2];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (start < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
        }
        return start;
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.getSize() != 0;
    }

    public final void removeInterval(Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }
}
