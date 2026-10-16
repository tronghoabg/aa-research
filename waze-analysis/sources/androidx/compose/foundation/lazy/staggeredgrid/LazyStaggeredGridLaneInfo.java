package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import h.a.c;
import h.a.i;
import h.a.u;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final int LaneFullSpan = -2;
    public static final int LaneUnset = -1;
    private static final int MaxCapacity = 131072;
    private int anchor;
    private int[] lanes = new int[16];
    private final u<SpannedItem> spannedItems = new u<>();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i2, int[] iArr) {
            this.index = i2;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i2, int i3) {
        if (i2 > 131072) {
            InlineClassHelperKt.throwIllegalArgumentException("Requested item capacity " + i2 + " is larger than max supported: 131072!");
        }
        int length = this.lanes.length;
        if (length < i2) {
            while (length < i2) {
                length += length;
            }
            int[] iArr = new int[length];
            c.aM(this.lanes, iArr, i3, 0, 12);
            this.lanes = iArr;
        }
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i2, i3);
    }

    private final int searchByIndex(List<SpannedItem> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int index = list.get(i4).getIndex() - i2;
            if (index < 0) {
                i3 = i4 + 1;
            } else {
                if (index <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final boolean assignedToLane(int i2, int i3) {
        int lane = getLane(i2);
        return lane == i3 || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i2) {
        int i3 = this.anchor;
        int i4 = i2 - i3;
        if (i4 < 0 || i4 >= 131072) {
            int iMax = Math.max(i2 - (this.lanes.length >> 1), 0);
            this.anchor = iMax;
            int i5 = iMax - i3;
            int[] iArr = this.lanes;
            if (i5 >= 0) {
                int length = iArr.length;
                if (i5 < length) {
                    c.ar(iArr, iArr, 0, i5, length);
                }
                int[] iArr2 = this.lanes;
                int iMax2 = Math.max(0, iArr2.length - i5);
                int length2 = this.lanes.length;
                x.f(iArr2, "<this>");
                Arrays.fill(iArr2, iMax2, length2, 0);
            } else {
                int i6 = -i5;
                int length3 = iArr.length;
                int i7 = length3 + i6;
                if (i7 < 131072) {
                    ensureCapacity(i7 + 1, i6);
                } else {
                    if (i6 < length3) {
                        c.ar(iArr, iArr, i6, 0, length3 - i6);
                    }
                    int[] iArr3 = this.lanes;
                    int iMin = Math.min(iArr3.length, i6);
                    x.f(iArr3, "<this>");
                    Arrays.fill(iArr3, 0, iMin, 0);
                }
            }
        } else {
            ensureCapacity$default(this, i4 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.a()).getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.c()).getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final int findNextItemIndex(int i2, int i3) {
        int iUpperBound = upperBound();
        do {
            i2++;
            if (i2 >= iUpperBound) {
                return upperBound();
            }
        } while (!assignedToLane(i2, i3));
        return i2;
    }

    public final int findPreviousItemIndex(int i2, int i3) {
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (assignedToLane(i4, i3)) {
                return i4;
            }
        }
        return -1;
    }

    public final int[] getGaps(int i2) {
        SpannedItem spannedItem = (SpannedItem) i.S(this.spannedItems, searchByIndex(this.spannedItems, i2));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i2) {
        if (i2 < lowerBound() || i2 >= upperBound()) {
            return -1;
        }
        return this.lanes[i2 - this.anchor] - 1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        c.ay(this.lanes, 0, 0, 6);
        this.spannedItems.clear();
    }

    public final void setGaps(int i2, int[] iArr) {
        int iSearchByIndex = searchByIndex(this.spannedItems, i2);
        if (iSearchByIndex < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(iSearchByIndex + 1), new SpannedItem(i2, iArr));
        } else {
            u<SpannedItem> uVar = this.spannedItems;
            if (iArr == null) {
                uVar.remove(iSearchByIndex);
            } else {
                uVar.get(iSearchByIndex).setGaps(iArr);
            }
        }
    }

    public final void setLane(int i2, int i3) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Negative lanes are not supported");
        }
        ensureValidIndex(i2);
        this.lanes[i2 - this.anchor] = i3 + 1;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
