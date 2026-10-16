package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.l;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final r<PagerScope, Integer, Composer, Integer, ab> item;
    private final l<Integer, Object> key;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerIntervalContent(l<? super Integer, ? extends Object> lVar, r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        this.key = lVar;
        this.item = rVar;
    }

    public final r<PagerScope, Integer, Composer, Integer, ab> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public l<Integer, Object> getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public /* synthetic */ l getType() {
        return new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }

            public final Void invoke(int i2) {
                return null;
            }
        };
    }
}
