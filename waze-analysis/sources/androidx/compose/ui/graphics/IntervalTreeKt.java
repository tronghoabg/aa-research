package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntervalTreeKt {
    private static final Interval<Object> EmptyInterval = new Interval<>(Float.MAX_VALUE, Float.MIN_VALUE, null);
    private static final int TreeColorBlack = 1;
    private static final int TreeColorRed = 0;

    public static final Interval<Object> getEmptyInterval() {
        return EmptyInterval;
    }
}
