package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {
    public static final int $stable = 0;
    private final LazyLayoutIntervalContent<PagerIntervalContent> intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final PagerScopeImpl pagerScopeImpl = PagerScopeImpl.INSTANCE;
    private final PagerState state;

    public PagerLazyLayoutItemProvider(PagerState pagerState, LazyLayoutIntervalContent<PagerIntervalContent> lazyLayoutIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = pagerState;
        this.intervalContent = lazyLayoutIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    static final ab Item$lambda$0(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1142237095, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:214)");
            }
            IntervalList.Interval interval = pagerLazyLayoutItemProvider.intervalContent.getIntervals().get(i2);
            ((PagerIntervalContent) interval.getValue()).getItem().invoke(pagerLazyLayoutItemProvider.pagerScopeImpl, Integer.valueOf(i2 - interval.getStartIndex()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Item$lambda$1(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, Object obj, int i3, Composer composer, int i4) {
        pagerLazyLayoutItemProvider.Item(i2, obj, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(final int i2, Object obj, Composer composer, final int i3) {
        int i4;
        final int i5;
        final Object obj2;
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1201380429);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(this) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201380429, i4, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:212)");
            }
            i5 = i2;
            obj2 = obj;
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj2, i5, this.state.getPinnedPages$foundation(), ComposableLambdaKt.rememberComposableLambda(1142237095, true, new p() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return PagerLazyLayoutItemProvider.Item$lambda$0(this.f$0, i2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS | ((i4 << 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i5 = i2;
            obj2 = obj;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return PagerLazyLayoutItemProvider.Item$lambda$1(this.f$0, i5, obj2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PagerLazyLayoutItemProvider) {
            return x.n(this.intervalContent, ((PagerLazyLayoutItemProvider) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public /* synthetic */ Object getContentType(int i2) {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object obj) {
        return this.keyIndexMap.getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i2) {
        Object key = this.keyIndexMap.getKey(i2);
        return key == null ? this.intervalContent.getKey(i2) : key;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
