package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    /* compiled from: WazeSource */
    public interface Interval {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static l $default$getKey(Interval interval) {
                return null;
            }
        }

        l<Integer, Object> getKey();

        l<Integer, Object> getType();
    }

    public final Object getContentType(int i2) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i2);
        return interval.getValue().getType().invoke(Integer.valueOf(i2 - interval.getStartIndex()));
    }

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final Object getKey(int i2) {
        Object objInvoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i2);
        int startIndex = i2 - interval.getStartIndex();
        l<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i2) : objInvoke;
    }

    public final <T> T withInterval(int i2, p<? super Integer, ? super Interval, ? extends T> pVar) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i2);
        return pVar.invoke(Integer.valueOf(i2 - interval.getStartIndex()), interval.getValue());
    }
}
