package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import com.waze.strings.DisplayStrings;
import h.a.ac;
import h.a.i;
import h.a.r;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridStateKt {
    private static final LazyGridMeasureResult EmptyLazyGridLayoutInfo;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1652a = 0;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1
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
        List listH = i.h();
        Orientation orientation = Orientation.Vertical;
        MeasureResult measureResult2 = measureResult;
        EmptyLazyGridLayoutInfo = new LazyGridMeasureResult(null, 0, false, 0.0f, measureResult2, 0.0f, false, aj.e(k.f48060a), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return ac.f47967a;
            }
        }, new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                int i2 = LazyGridStateKt.f1652a;
                return -1;
            }
        }, listH, 0, 0, 0, false, orientation, 0, 0);
    }

    static final int EmptyLazyGridLayoutInfo$lambda$1(int i2) {
        return -1;
    }

    public static final LazyGridState rememberLazyGridState(final int i2, final int i3, final LazyGridPrefetchStrategy lazyGridPrefetchStrategy, Composer composer, int i4, int i5) {
        boolean z = true;
        if ((i5 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            lazyGridPrefetchStrategy = (LazyGridPrefetchStrategy) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20335728, i4, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:104)");
        }
        if (1 == (i5 & 1)) {
            i2 = 0;
        }
        Object[] objArr = {lazyGridPrefetchStrategy};
        Saver<LazyGridState, ?> saverSaver$foundation = LazyGridState.Companion.saver$foundation(lazyGridPrefetchStrategy);
        boolean z2 = (((i4 & 14) ^ 6) > 4 && composer.changed(i2)) || (i4 & 6) == 4;
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        boolean z3 = ((((i4 & 112) ^ 48) > 32 && composer.changed(i3)) || (i4 & 48) == 32) | z2;
        if ((((i4 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changedInstance(lazyGridPrefetchStrategy)) && (i4 & 384) != 256) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyGridStateKt.rememberLazyGridState$lambda$2$0(i2, i3, lazyGridPrefetchStrategy);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saverSaver$foundation, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState rememberLazyGridState$lambda$0$0(int i2, int i3) {
        return new LazyGridState(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState rememberLazyGridState$lambda$2$0(int i2, int i3, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        return new LazyGridState(i2, i3, lazyGridPrefetchStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState rememberLazyGridState$lambda$3$0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i2, int i3) {
        return new LazyGridState(lazyLayoutCacheWindow, i2, i3);
    }

    public static final LazyGridState rememberLazyGridState(final int i2, final int i3, Composer composer, int i4, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29186956, i4, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:80)");
        }
        boolean z = true;
        if (1 == (i5 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<LazyGridState, ?> saver = LazyGridState.Companion.getSaver();
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
            objRememberedValue = new a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyGridStateKt.rememberLazyGridState$lambda$0$0(i2, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    public static final LazyGridState rememberLazyGridState(final LazyLayoutCacheWindow lazyLayoutCacheWindow, final int i2, final int i3, Composer composer, int i4, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1537306572, i4, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:132)");
        }
        boolean z = true;
        Object[] objArr = {lazyLayoutCacheWindow};
        Saver<LazyGridState, ?> saverSaver$foundation = LazyGridState.Companion.saver$foundation(lazyLayoutCacheWindow);
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
            objRememberedValue = new a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyGridStateKt.rememberLazyGridState$lambda$3$0(lazyLayoutCacheWindow, i2, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saverSaver$foundation, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }
}
