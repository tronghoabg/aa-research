package androidx.compose.foundation.lazy.staggeredgrid;

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
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {
    public static final int $stable = 8;
    private final MutableIntervalList<LazyStaggeredGridInterval> intervals = new MutableIntervalList<>();
    private final LazyStaggeredGridSpanProvider spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());

    public LazyStaggeredGridIntervalContent(l<? super LazyStaggeredGridScope, ab> lVar) {
        lVar.invoke(this);
    }

    static final ab item$lambda$3(q qVar, LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= true != composer.changed(lazyStaggeredGridItemScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i3 & 131) != 130, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1062451479, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:44)");
            }
            qVar.invoke(lazyStaggeredGridItemScope, composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(final Object obj, final Object obj2, final StaggeredGridItemSpan staggeredGridItemSpan, final q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, ab> qVar) {
        items(1, obj != null ? new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                Object obj4 = obj;
                ((Integer) obj3).intValue();
                return obj4;
            }
        } : null, new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                Object obj4 = obj2;
                ((Integer) obj3).intValue();
                return obj4;
            }
        }, staggeredGridItemSpan != null ? new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                StaggeredGridItemSpan staggeredGridItemSpan2 = staggeredGridItemSpan;
                ((Integer) obj3).intValue();
                return staggeredGridItemSpan2;
            }
        } : null, ComposableLambdaKt.composableLambdaInstance(1062451479, true, new r() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda3
            @Override // h.g.a.r
            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                return LazyStaggeredGridIntervalContent.item$lambda$3(qVar, (LazyStaggeredGridItemScope) obj3, ((Integer) obj4).intValue(), (Composer) obj5, ((Integer) obj6).intValue());
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int i2, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, l<? super Integer, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
        getIntervals().addInterval(i2, new LazyStaggeredGridInterval(lVar, lVar2, lVar3, rVar));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public static /* synthetic */ StaggeredGridItemSpan $r8$lambda$SCtqITRHYbTQISzxktx_eftYcdc(StaggeredGridItemSpan staggeredGridItemSpan, int i2) {
        return staggeredGridItemSpan;
    }

    public static /* synthetic */ Object $r8$lambda$dH_7n_L3eknQuPr4ePoUnYZP4QI(Object obj, int i2) {
        return obj;
    }

    private static final Object item$lambda$0$0(Object obj, int i2) {
        return obj;
    }

    static final Object item$lambda$1(Object obj, int i2) {
        return obj;
    }

    private static final StaggeredGridItemSpan item$lambda$2$0(StaggeredGridItemSpan staggeredGridItemSpan, int i2) {
        return staggeredGridItemSpan;
    }
}
