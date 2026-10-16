package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.Placeable;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final List<LazyStaggeredGridItemInfo> approachVisibleItems;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final af coroutineScope;
    private final GraphicsContext graphicsContext;
    private final boolean isInLookaheadScope;
    private final boolean isLookingAhead;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final List<Integer> pinnedItems;
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;
    private final LazyStaggeredGridState state;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, final boolean z, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z2, int i5, af afVar, boolean z3, boolean z4, List<? extends LazyStaggeredGridItemInfo> list2, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j2;
        this.isVertical = z;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i2;
        this.contentOffset = j3;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i4;
        this.reverseLayout = z2;
        this.mainAxisSpacing = i5;
        this.coroutineScope = afVar;
        this.isInLookaheadScope = z3;
        this.isLookingAhead = z4;
        this.approachVisibleItems = list2;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* renamed from: createItem-pitSLOA, reason: not valid java name */
            public LazyStaggeredGridMeasuredItem mo2999createItempitSLOA(int i6, int i7, int i8, Object obj, Object obj2, List<? extends Placeable> list3, long j4) {
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.this$0;
                return new LazyStaggeredGridMeasuredItem(i6, obj, list3, lazyStaggeredGridMeasureContext.isVertical(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), i7, i8, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), obj2, lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation(), j4, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final List<LazyStaggeredGridItemInfo> getApproachVisibleItems() {
        return this.approachVisibleItems;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m2994getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m2995getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final af getCoroutineScope() {
        return this.coroutineScope;
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m2996getLaneInfoSZVOQXA(long j2) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i3 = (int) (j2 >> 32);
        if (i2 - i3 != 1) {
            return -2;
        }
        return i3;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m2997getSpanRangelOCCd4c(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2, int i3) {
        boolean zIsFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i2);
        int i4 = zIsFullSpan ? this.laneCount : 1;
        if (true == zIsFullSpan) {
            i3 = 0;
        }
        return SpanRange.m3013constructorimpl(i3, i4);
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i2);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m2998isFullSpanSZVOQXA(long j2) {
        return ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (j2 >> 32)) != 1;
    }

    public final boolean isInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    public final boolean isLookingAhead() {
        return this.isLookingAhead;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z2, int i5, af afVar, boolean z3, boolean z4, List list2, GraphicsContext graphicsContext, o oVar) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z, lazyLayoutMeasureScope, i2, j3, i3, i4, z2, i5, afVar, z3, z4, list2, graphicsContext);
    }
}
