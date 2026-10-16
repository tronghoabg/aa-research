package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    public static final int $stable = 8;
    private MutableIntList _headerIndexes;
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    public LazyListIntervalContent(l<? super LazyListScope, ab> lVar) {
        lVar.invoke(this);
    }

    static final ab item$lambda$2(q qVar, LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= true != composer.changed(lazyItemScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i3 & 131) != 130, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857469575, i3, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
            }
            qVar.invoke(lazyItemScope, composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab stickyHeader$lambda$1(r rVar, int i2, LazyItemScope lazyItemScope, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= true != composer.changed(lazyItemScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1588696110, i3, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:70)");
            }
            rVar.invoke(lazyItemScope, Integer.valueOf(i2), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final IntList getHeaderIndexes() {
        MutableIntList mutableIntList = this._headerIndexes;
        return mutableIntList != null ? mutableIntList : IntListKt.emptyIntList();
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(final Object obj, final Object obj2, final q<? super LazyItemScope, ? super Composer, ? super Integer, ab> qVar) {
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new l() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                Object obj4 = obj;
                ((Integer) obj3).intValue();
                return obj4;
            }
        } : null, new l() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                Object obj4 = obj2;
                ((Integer) obj3).intValue();
                return obj4;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-857469575, true, new r() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda2
            @Override // h.g.a.r
            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                return LazyListIntervalContent.item$lambda$2(qVar, (LazyItemScope) obj3, ((Integer) obj4).intValue(), (Composer) obj5, ((Integer) obj6).intValue());
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i2, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        getIntervals().addInterval(i2, new LazyListInterval(lVar, lVar2, rVar));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void stickyHeader(Object obj, Object obj2, final r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, 1, null);
            this._headerIndexes = mutableIntList;
        }
        mutableIntList.add(getIntervals().getSize());
        final int size = getIntervals().getSize();
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(-1588696110, true, new q() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda3
            @Override // h.g.a.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return LazyListIntervalContent.stickyHeader$lambda$1(rVar, size, (LazyItemScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void items(int i2, l lVar, r rVar) {
        LazyListScope.CC.$default$items(this, i2, lVar, rVar);
    }

    static final Object item$lambda$0(Object obj, int i2) {
        return obj;
    }

    static final Object item$lambda$1(Object obj, int i2) {
        return obj;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void item(Object obj, q qVar) {
        item(obj, null, qVar);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void stickyHeader(Object obj, Object obj2, q qVar) {
        LazyListScope.CC.$default$stickyHeader(this, obj, obj2, qVar);
    }
}
