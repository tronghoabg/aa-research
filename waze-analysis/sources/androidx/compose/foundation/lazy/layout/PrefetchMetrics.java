package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;
    private final MutableScatterMap<Object, Averages> averagesByContentType = ScatterMapKt.mutableScatterMapOf();
    private Averages lastUsedAverage;
    private Object lastUsedContentType;

    public final Averages getAverage(Object obj) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == obj && averages != null) {
            return averages;
        }
        MutableScatterMap<Object, Averages> mutableScatterMap = this.averagesByContentType;
        Averages averages2 = mutableScatterMap.get(obj);
        if (averages2 == null) {
            averages2 = new Averages();
            mutableScatterMap.set(obj, averages2);
        }
        Averages averages3 = averages2;
        this.lastUsedContentType = obj;
        this.lastUsedAverage = averages3;
        return averages3;
    }
}
