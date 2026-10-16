package androidx.media3.exoplayer.source.preload;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface RankingDataComparator<T> extends Comparator<T> {

    /* compiled from: WazeSource */
    public interface InvalidationListener {
        void onRankingDataComparatorInvalidated();
    }

    void setInvalidationListener(InvalidationListener invalidationListener);
}
