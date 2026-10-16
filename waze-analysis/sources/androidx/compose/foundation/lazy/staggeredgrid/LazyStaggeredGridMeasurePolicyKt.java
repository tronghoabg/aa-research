package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.g.a.a;
import h.i;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            return z ? paddingValues.mo2707calculateTopPaddingD9Ej5fM() : paddingValues.mo2704calculateBottomPaddingD9Ej5fM();
        }
        if (iOrdinal == 1) {
            return z ? PaddingKt.calculateStartPadding(paddingValues, layoutDirection) : PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        throw new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            return z ? paddingValues.mo2704calculateBottomPaddingD9Ej5fM() : paddingValues.mo2707calculateTopPaddingD9Ej5fM();
        }
        if (iOrdinal == 1) {
            return z ? PaddingKt.calculateEndPadding(paddingValues, layoutDirection) : PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        throw new i();
    }

    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    public static final LazyLayoutMeasurePolicy m3004rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final a<? extends LazyStaggeredGridItemProvider> aVar, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final float f2, float f3, final af afVar, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(234882793, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(aVar)) || (i2 & 48) == 32) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) > 2048 && composer.changed(z)) || (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(orientation.ordinal())) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ 196608) > 131072 && composer.changed(f2)) || (i2 & 196608) == 131072) | ((((3670016 & i2) ^ 1572864) > 1048576 && composer.changed(f3)) || (i2 & 1572864) == 1048576) | ((((234881024 & i2) ^ 100663296) > 67108864 && composer.changed(lazyGridStaggeredGridSlotsProvider)) || (i2 & 100663296) == 67108864) | composer.changed(graphicsContext);
        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicyRememberedValue = composer.rememberedValue();
        if (zChanged || lazyLayoutMeasurePolicyRememberedValue == Composer.Companion.getEmpty()) {
            lazyLayoutMeasurePolicyRememberedValue = new LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                /* renamed from: measure-0kLqBqw */
                public final MeasureResult mo2877measure0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
                    ObservableScopeInvalidator.m2964attachToScopeimpl(lazyStaggeredGridState.m3010getMeasurementScopeInvalidatorzYiylxw$foundation());
                    boolean z2 = lazyStaggeredGridState.getHasLookaheadOccurred$foundation() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m1999checkScrollableContainerConstraintsK40F9xA(j2, orientation);
                    LazyStaggeredGridSlots lazyStaggeredGridSlotsMo2984invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo2984invoke0kLqBqw(lazyLayoutMeasureScope, j2);
                    boolean z3 = orientation == Orientation.Vertical;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = aVar.invoke();
                    int i3 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    long j3 = i3;
                    int i4 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    long j4 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iM11106getMaxHeightimpl = ((z3 ? Constraints.m11106getMaxHeightimpl(j2) : Constraints.m11107getMaxWidthimpl(j2)) - i3) - i4;
                    long j5 = z3 ? (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (j4 << 32) : (j3 << 32) | (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    PaddingValues paddingValues2 = paddingValues;
                    int i5 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                    PaddingValues paddingValues3 = paddingValues;
                    int i6 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(paddingValues3.mo2707calculateTopPaddingD9Ej5fM() + paddingValues3.mo2704calculateBottomPaddingD9Ej5fM());
                    LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                    List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState2.getPinnedItems$foundation(), lazyStaggeredGridState2.getBeyondBoundsInfo$foundation());
                    long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, ConstraintsKt.m11124constrainWidthK40F9xA(j2, i5), 0, ConstraintsKt.m11123constrainHeightK40F9xA(j2, i6), 0, 10, null);
                    int i7 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(f2);
                    boolean zIsLookingAhead = lazyLayoutMeasureScope.isLookingAhead();
                    LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM3003measureStaggeredGridC6celF4 = LazyStaggeredGridMeasureKt.m3003measureStaggeredGridC6celF4(lazyLayoutMeasureScope, lazyStaggeredGridState3, listCalculateLazyLayoutPinnedIndices, lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsMo2984invoke0kLqBqw, jM11097copyZbe2FdA$default, z3, z, j5, iM11106getMaxHeightimpl, i7, i3, i4, afVar, z2, zIsLookingAhead, lazyStaggeredGridState3.getApproachLayoutInfo$foundation(), graphicsContext);
                    lazyStaggeredGridState.applyMeasureResult$foundation(lazyStaggeredGridMeasureResultM3003measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false & ((4 & 4) == 0));
                    return lazyStaggeredGridMeasureResultM3003measureStaggeredGridC6celF4;
                }
            };
            composer.updateRememberedValue(lazyLayoutMeasurePolicyRememberedValue);
        }
        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) lazyLayoutMeasurePolicyRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyLayoutMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (iOrdinal == 1) {
            return paddingValues.mo2707calculateTopPaddingD9Ej5fM();
        }
        throw new i();
    }
}
