package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private MutableIntList _headerIndexes;
    private boolean hasCustomSpans;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final p<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda6
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            ((Integer) obj2).intValue();
            return GridItemSpan.m2895boximpl(LazyGridSpanKt.GridItemSpan(1));
        }
    };
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    public LazyGridIntervalContent(l<? super LazyGridScope, ab> lVar) {
        lVar.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GridItemSpan item$lambda$1$0(l lVar, LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return (GridItemSpan) lVar.invoke(lazyGridItemSpanScope);
    }

    static final ab item$lambda$3(q qVar, LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= true != composer.changed(lazyGridItemScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i3 & 131) != 130, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-291643851, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            qVar.invoke(lazyGridItemScope, composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab stickyHeader$lambda$2(r rVar, int i2, LazyGridItemScope lazyGridItemScope, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= true != composer.changed(lazyGridItemScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(46791243, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
            }
            rVar.invoke(lazyGridItemScope, Integer.valueOf(i2), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final boolean getHasCustomSpans$foundation() {
        return this.hasCustomSpans;
    }

    public final IntList getHeaderIndexes() {
        MutableIntList mutableIntList = this._headerIndexes;
        return mutableIntList != null ? mutableIntList : IntListKt.emptyIntList();
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation() {
        return this.spanLayoutProvider;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(final Object obj, final l<? super LazyGridItemSpanScope, GridItemSpan> lVar, final Object obj2, final q<? super LazyGridItemScope, ? super Composer, ? super Integer, ab> qVar) {
        getIntervals().addInterval(1, new LazyGridInterval(obj != null ? new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                Object obj4 = obj;
                ((Integer) obj3).intValue();
                return obj4;
            }
        } : null, lVar != null ? new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj3, Object obj4) {
                return LazyGridIntervalContent.item$lambda$1$0(lVar, (LazyGridItemSpanScope) obj3, ((Integer) obj4).intValue());
            }
        } : DefaultSpan, new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                Object obj4 = obj2;
                ((Integer) obj3).intValue();
                return obj4;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-291643851, true, new r() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda5
            @Override // h.g.a.r
            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                return LazyGridIntervalContent.item$lambda$3(qVar, (LazyGridItemScope) obj3, ((Integer) obj4).intValue(), (Composer) obj5, ((Integer) obj6).intValue());
            }
        })));
        if (lVar != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i2, l<? super Integer, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        getIntervals().addInterval(i2, new LazyGridInterval(lVar, pVar == null ? DefaultSpan : pVar, lVar2, rVar));
        if (pVar != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation(boolean z) {
        this.hasCustomSpans = z;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void stickyHeader(Object obj, Object obj2, final r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        MutableIntList mutableIntList = this._headerIndexes;
        int i2 = 1;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, i2, null);
            this._headerIndexes = mutableIntList;
        }
        final int size = getIntervals().getSize();
        mutableIntList.add(size);
        item(obj, new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                return GridItemSpan.m2895boximpl(LazyGridSpanKt.GridItemSpan(((LazyGridItemSpanScope) obj3).getMaxLineSpan()));
            }
        }, obj2, ComposableLambdaKt.composableLambdaInstance(46791243, true, new q() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return LazyGridIntervalContent.stickyHeader$lambda$2(rVar, size, (LazyGridItemScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            }
        }));
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }

    public static /* synthetic */ Object $r8$lambda$CFKBJpXUQSmnJk6aD_uasr7JIro(Object obj, int i2) {
        return obj;
    }

    private static final Object item$lambda$0$0(Object obj, int i2) {
        return obj;
    }

    static final Object item$lambda$2(Object obj, int i2) {
        return obj;
    }
}
