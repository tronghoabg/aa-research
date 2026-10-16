package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.IntervalList;
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
final class LazyGridItemProviderImpl implements LazyGridItemProvider {
    private final LazyGridIntervalContent intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyGridState state;

    public LazyGridItemProviderImpl(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyGridState;
        this.intervalContent = lazyGridIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    static final ab Item$lambda$0(LazyGridItemProviderImpl lazyGridItemProviderImpl, int i2, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(726189336, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:81)");
            }
            IntervalList.Interval<LazyGridInterval> interval = lazyGridItemProviderImpl.intervalContent.getIntervals().get(i2);
            interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(i2 - interval.getStartIndex()), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Item$lambda$1(LazyGridItemProviderImpl lazyGridItemProviderImpl, int i2, Object obj, int i3, Composer composer, int i4) {
        lazyGridItemProviderImpl.Item(i2, obj, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(final int i2, Object obj, Composer composer, final int i3) {
        int i4;
        final int i5;
        final Object obj2;
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1493551140);
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
                ComposerKt.traceEventStart(1493551140, i4, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:79)");
            }
            i5 = i2;
            obj2 = obj;
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj2, i5, this.state.getPinnedItems$foundation(), ComposableLambdaKt.rememberComposableLambda(726189336, true, new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LazyGridItemProviderImpl.Item$lambda$0(this.f$0, i2, (Composer) obj3, ((Integer) obj4).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LazyGridItemProviderImpl.Item$lambda$1(this.f$0, i5, obj2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyGridItemProviderImpl) {
            return x.n(this.intervalContent, ((LazyGridItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i2) {
        return this.intervalContent.getContentType(i2);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public IntList getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i2) {
        Object key = getKeyIndexMap().getKey(i2);
        return key == null ? this.intervalContent.getKey(i2) : key;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.intervalContent.getSpanLayoutProvider$foundation();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
