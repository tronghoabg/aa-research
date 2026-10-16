package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.l;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final r<LazyStaggeredGridItemScope, Integer, Composer, Integer, ab> item;
    private final l<Integer, Object> key;
    private final l<Integer, StaggeredGridItemSpan> span;
    private final l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridInterval(l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, l<? super Integer, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        this.key = lVar;
        this.type = lVar2;
        this.span = lVar3;
        this.item = rVar;
    }

    public final r<LazyStaggeredGridItemScope, Integer, Composer, Integer, ab> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public l<Integer, Object> getKey() {
        return this.key;
    }

    public final l<Integer, StaggeredGridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public l<Integer, Object> getType() {
        return this.type;
    }
}
