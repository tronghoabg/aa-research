package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final r<LazyGridItemScope, Integer, Composer, Integer, ab> item;
    private final l<Integer, Object> key;
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> span;
    private final l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridInterval(l<? super Integer, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    public final r<LazyGridItemScope, Integer, Composer, Integer, ab> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public l<Integer, Object> getKey() {
        return this.key;
    }

    public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public l<Integer, Object> getType() {
        return this.type;
    }
}
