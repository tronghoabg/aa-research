package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder shuffleOrder) {
        this.isAtomic = z;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object getConcatenatedUid(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int getNextChildIndex(int i2, boolean z) {
        if (z) {
            return this.shuffleOrder.getNextIndex(i2);
        }
        if (i2 >= this.childCount - 1) {
            return -1;
        }
        return i2 + 1;
    }

    private int getPreviousChildIndex(int i2, boolean z) {
        if (z) {
            return this.shuffleOrder.getPreviousIndex(i2);
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2 - 1;
    }

    protected abstract int getChildIndexByChildUid(Object obj);

    protected abstract int getChildIndexByPeriodIndex(int i2);

    protected abstract int getChildIndexByWindowIndex(int i2);

    protected abstract Object getChildUidByChildIndex(int i2);

    protected abstract int getFirstPeriodIndexByChildIndex(int i2);

    @Override // androidx.media3.common.Timeline
    public int getFirstWindowIndex(boolean z) {
        if (this.childCount != 0) {
            boolean z2 = z & (!this.isAtomic);
            int firstIndex = z2 ? this.shuffleOrder.getFirstIndex() : 0;
            while (getTimelineByChildIndex(firstIndex).isEmpty()) {
                firstIndex = getNextChildIndex(firstIndex, z2);
                if (firstIndex == -1) {
                }
            }
            return getFirstWindowIndexByChildIndex(firstIndex) + getTimelineByChildIndex(firstIndex).getFirstWindowIndex(z2);
        }
        return -1;
    }

    protected abstract int getFirstWindowIndexByChildIndex(int i2);

    @Override // androidx.media3.common.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (obj instanceof Pair) {
            Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
            Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
            int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
            if (childIndexByChildUid != -1 && (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) != -1) {
                return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
            }
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public int getLastWindowIndex(boolean z) {
        int i2 = this.childCount;
        if (i2 != 0) {
            boolean z2 = z & (!this.isAtomic);
            int lastIndex = z2 ? this.shuffleOrder.getLastIndex() : i2 - 1;
            while (getTimelineByChildIndex(lastIndex).isEmpty()) {
                lastIndex = getPreviousChildIndex(lastIndex, z2);
                if (lastIndex == -1) {
                }
            }
            return getFirstWindowIndexByChildIndex(lastIndex) + getTimelineByChildIndex(lastIndex).getLastWindowIndex(z2);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public int getNextWindowIndex(int i2, int i3, boolean z) {
        if (this.isAtomic) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i2);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(i2 - firstWindowIndexByChildIndex, i3 != 2 ? i3 : 0, z);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z);
        }
        if (nextChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(nextChildIndex) + getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z);
        }
        if (i3 == 2) {
            return getFirstWindowIndex(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i2);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i2 - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, z);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (z) {
            Object childUidByChildIndex = getChildUidByChildIndex(childIndexByPeriodIndex);
            Object obj = period.uid;
            an.B(obj);
            period.uid = getConcatenatedUid(childUidByChildIndex, obj);
        }
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByChildUid);
        getTimelineByChildIndex(childIndexByChildUid).getPeriodByUid(childPeriodUidFromConcatenatedUid, period);
        period.windowIndex += firstWindowIndexByChildIndex;
        period.uid = obj;
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public int getPreviousWindowIndex(int i2, int i3, boolean z) {
        if (this.isAtomic) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i2);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(i2 - firstWindowIndexByChildIndex, i3 != 2 ? i3 : 0, z);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z);
        }
        if (previousChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(previousChildIndex) + getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z);
        }
        if (i3 == 2) {
            return getLastWindowIndex(z);
        }
        return -1;
    }

    protected abstract Timeline getTimelineByChildIndex(int i2);

    @Override // androidx.media3.common.Timeline
    public final Object getUidOfPeriod(int i2) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i2);
        return getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), getTimelineByChildIndex(childIndexByPeriodIndex).getUidOfPeriod(i2 - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex)));
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i2);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i2 - firstWindowIndexByChildIndex, window, j2);
        Object childUidByChildIndex = getChildUidByChildIndex(childIndexByWindowIndex);
        if (!Timeline.Window.SINGLE_WINDOW_UID.equals(window.uid)) {
            childUidByChildIndex = getConcatenatedUid(childUidByChildIndex, window.uid);
        }
        window.uid = childUidByChildIndex;
        window.firstPeriodIndex += firstPeriodIndexByChildIndex;
        window.lastPeriodIndex += firstPeriodIndexByChildIndex;
        return window;
    }
}
