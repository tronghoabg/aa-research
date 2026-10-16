package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.l;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {
    private final IntervalList<PagerIntervalContent> intervals;
    private final l<Integer, Object> key;
    private final r<PagerScope, Integer, Composer, Integer, ab> pageContent;
    private final int pageCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerLayoutIntervalContent(r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar, l<? super Integer, ? extends Object> lVar, int i2) {
        this.pageContent = rVar;
        this.key = lVar;
        this.pageCount = i2;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i2, new PagerIntervalContent(lVar, rVar));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    public final l<Integer, Object> getKey() {
        return this.key;
    }

    public final r<PagerScope, Integer, Composer, Integer, ab> getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
