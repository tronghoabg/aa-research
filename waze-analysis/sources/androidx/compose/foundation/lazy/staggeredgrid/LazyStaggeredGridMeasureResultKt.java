package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.a.r;
import h.c.k;
import h.g.a.l;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] EmptyArray;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
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
        MeasureResult measureResult2 = measureResult;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, measureResult2, 0.0f, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, i.h(), IntSize.Companion.m11344getZeroYbymL2g(), 0, 0, 0, 0, 0, aj.e(k.f48060a), null);
    }

    public static final int calculateContentSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i2) {
        int beforeContentPadding = lazyStaggeredGridLayoutInfo.getBeforeContentPadding() + lazyStaggeredGridLayoutInfo.getAfterContentPadding();
        if (lazyStaggeredGridLayoutInfo.getTotalItemsCount() == 0 || i2 <= 0) {
            return beforeContentPadding;
        }
        return (((visibleItemsAverageSize(lazyStaggeredGridLayoutInfo) * lazyStaggeredGridLayoutInfo.getTotalItemsCount()) / i2) - lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing()) + beforeContentPadding;
    }

    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i2) {
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) i.P(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i2 > ((LazyStaggeredGridItemInfo) i.T(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i2) {
            return null;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        return (LazyStaggeredGridItemInfo) i.S(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), i.aG(visibleItemsInfo, visibleItemsInfo.size(), new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(LazyStaggeredGridMeasureResultKt.findVisibleItem$lambda$0(i2, (LazyStaggeredGridItemInfo) obj));
            }
        }));
    }

    static final int findVisibleItem$lambda$0(int i2, LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
        return lazyStaggeredGridItemInfo.getIndex() - i2;
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.mo2993getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyStaggeredGridLayoutInfo.mo2993getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int iMo2990getSizeYbymL2g = 0;
        for (int i2 = 0; i2 < size; i2++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i2);
            iMo2990getSizeYbymL2g += (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridItemInfo.mo2990getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyStaggeredGridItemInfo.mo2990getSizeYbymL2g() >> 32);
        }
        return (iMo2990getSizeYbymL2g / visibleItemsInfo.size()) + lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing();
    }
}
