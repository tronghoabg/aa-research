package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.a.r;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import java.util.Map;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListStateKt {
    private static final LazyListMeasureResult EmptyLazyListMeasureResult;
    private static final int NumberOfItemsToTeleport = 100;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
            private final Map<AlignmentLine, Integer> alignmentLines = r.j();
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public /* synthetic */ l getRulers() {
                return null;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
        int i2 = 0;
        boolean z = false;
        MeasureResult measureResult2 = measureResult;
        LazyListMeasuredItem lazyListMeasuredItem = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        EmptyLazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem, i2, z, f2, measureResult2, f3, z2, aj.e(k.f48060a), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), i.h(), i3, i4, i5, z3, Orientation.Vertical, 0, 0, null);
    }

    public static final LazyListState rememberLazyListState(final int i2, final int i3, final LazyListPrefetchStrategy lazyListPrefetchStrategy, Composer composer, int i4, int i5) {
        boolean z = true;
        if ((i5 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            lazyListPrefetchStrategy = (LazyListPrefetchStrategy) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1287535208, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:102)");
        }
        if (1 == (i5 & 1)) {
            i2 = 0;
        }
        Object[] objArr = {lazyListPrefetchStrategy};
        Saver<LazyListState, ?> saverSaver$foundation = LazyListState.Companion.saver$foundation(lazyListPrefetchStrategy);
        boolean z2 = (((i4 & 14) ^ 6) > 4 && composer.changed(i2)) || (i4 & 6) == 4;
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        boolean z3 = ((((i4 & 112) ^ 48) > 32 && composer.changed(i3)) || (i4 & 48) == 32) | z2;
        if ((((i4 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changedInstance(lazyListPrefetchStrategy)) && (i4 & 384) != 256) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyListStateKt.rememberLazyListState$lambda$2$0(i2, i3, lazyListPrefetchStrategy);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saverSaver$foundation, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState rememberLazyListState$lambda$0$0(int i2, int i3) {
        return new LazyListState(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState rememberLazyListState$lambda$2$0(int i2, int i3, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        return new LazyListState(i2, i3, lazyListPrefetchStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState rememberLazyListState$lambda$3$0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i2, int i3) {
        return new LazyListState(lazyLayoutCacheWindow, i2, i3);
    }

    public static final LazyListState rememberLazyListState(final int i2, final int i3, Composer composer, int i4, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:78)");
        }
        boolean z = true;
        if (1 == (i5 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        boolean z2 = (((i4 & 14) ^ 6) > 4 && composer.changed(i2)) || (i4 & 6) == 4;
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((((i4 & 112) ^ 48) <= 32 || !composer.changed(i3)) && (i4 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyListStateKt.rememberLazyListState$lambda$0$0(i2, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    public static final LazyListState rememberLazyListState(final LazyLayoutCacheWindow lazyLayoutCacheWindow, final int i2, final int i3, Composer composer, int i4, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1588550476, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:130)");
        }
        boolean z = true;
        Object[] objArr = {lazyLayoutCacheWindow};
        Saver<LazyListState, ?> saverSaver$foundation = LazyListState.Companion.saver$foundation(lazyLayoutCacheWindow);
        boolean z2 = (((i4 & 14) ^ 6) > 4 && composer.changed(lazyLayoutCacheWindow)) || (i4 & 6) == 4;
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        boolean z3 = (((i4 & 112) ^ 48) > 32 && composer.changed(i2)) || (i4 & 48) == 32;
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        boolean z4 = z2 | z3;
        if ((((i4 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(i3)) && (i4 & 384) != 256) {
            z = false;
        }
        boolean z5 = z4 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyListStateKt.rememberLazyListState$lambda$3$0(lazyLayoutCacheWindow, i2, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saverSaver$foundation, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }
}
