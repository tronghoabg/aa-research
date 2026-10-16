package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final af coroutineScope;
    private final MeasuredPage currentPage;
    private final float currentPageOffsetFraction;
    private final Density density;
    private final List<MeasuredPage> extraPagesAfter;
    private final List<MeasuredPage> extraPagesBefore;
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<MeasuredPage> visiblePagesInfo;

    public /* synthetic */ PagerMeasureResult(List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z2, SnapPosition snapPosition, MeasureResult measureResult, boolean z3, List list2, List list3, af afVar, Density density, long j2, int i9, o oVar) {
        this(list, i2, i3, i4, orientation, i5, i6, z, i7, measuredPage, measuredPage2, f2, i8, z2, snapPosition, measureResult, z3, (i9 & 131072) != 0 ? ac.f47967a : list2, (i9 & 262144) != 0 ? ac.f47967a : list3, afVar, density, j2, null);
    }

    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int i2) {
        int i3;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i3 = this.firstVisiblePageScrollOffset - i2) >= 0 && i3 < pageSize) {
            float f2 = i2;
            float f3 = this.currentPageOffsetFraction;
            if (this.currentPage != null) {
                float f4 = f2 / pageSize;
                float f5 = f3 - f4;
                if (f5 < 0.5f && f5 > -0.5f) {
                    MeasuredPage measuredPage = (MeasuredPage) i.P(getVisiblePagesInfo());
                    MeasuredPage measuredPage2 = (MeasuredPage) i.T(getVisiblePagesInfo());
                    if (i2 < 0) {
                        if (Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) <= (-i2)) {
                            return null;
                        }
                    } else if (Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) <= i2) {
                        return null;
                    }
                    List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        visiblePagesInfo.get(i4).applyScrollDelta(i2);
                    }
                    List<MeasuredPage> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        list.get(i5).applyScrollDelta(i2);
                    }
                    List<MeasuredPage> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        list2.get(i6).applyScrollDelta(i2);
                    }
                    return new PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f4, this.firstVisiblePageScrollOffset - i2, this.canScrollForward || i2 > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope, this.density, this.childConstraints, null);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage == null || measuredPage.getIndex() == 0) && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m3040getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final af getCoroutineScope() {
        return this.coroutineScope;
    }

    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public l<RulerScope, ab> getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo3036getViewportSizeYbymL2g() {
        return (getWidth() << 32) | (getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    public /* synthetic */ PagerMeasureResult(List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z2, SnapPosition snapPosition, MeasureResult measureResult, boolean z3, List list2, List list3, af afVar, Density density, long j2, o oVar) {
        this(list, i2, i3, i4, orientation, i5, i6, z, i7, measuredPage, measuredPage2, f2, i8, z2, snapPosition, measureResult, z3, list2, list3, afVar, density, j2);
    }

    private PagerMeasureResult(List<MeasuredPage> list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z2, SnapPosition snapPosition, MeasureResult measureResult, boolean z3, List<MeasuredPage> list2, List<MeasuredPage> list3, af afVar, Density density, long j2) {
        this.visiblePagesInfo = list;
        this.pageSize = i2;
        this.pageSpacing = i3;
        this.afterContentPadding = i4;
        this.orientation = orientation;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i6;
        this.reverseLayout = z;
        this.beyondViewportPageCount = i7;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f2;
        this.firstVisiblePageScrollOffset = i8;
        this.canScrollForward = z2;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = z3;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = afVar;
        this.density = density;
        this.childConstraints = j2;
    }
}
