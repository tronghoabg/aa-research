package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BatteryNotLowTrackerKt {
    public static final float BATTERY_LOW_THRESHOLD = 0.15f;
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("BatteryNotLowTracker");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }
}
