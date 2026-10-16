package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.an;
import h.k.n;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final float DefaultPositionThreshold = 56.0f;
    private static final PagerMeasureResult EmptyLayoutInfo;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final PagerStateKt$UnitDensity$1 UnitDensity;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1] */
    static {
        ?? r0 = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
            private final float density = 1.0f;
            private final float fontScale = 1.0f;

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.fontScale;
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: roundToPx--R2X_6o */
            public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
                return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: roundToPx-0680j_4 */
            public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
                return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* renamed from: toDp-GaN1DYA */
            public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
                return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toDp-u2uoSUM */
            public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
                return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toDpSize-k-rfVVM */
            public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
                return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toPx--R2X_6o */
            public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
                return Density.CC.m11133$default$toPxR2X_6o(this, j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toPx-0680j_4 */
            public /* synthetic */ float mo2127toPx0680j_4(float f2) {
                return Density.CC.m11134$default$toPx0680j_4(this, f2);
            }

            @Override // androidx.compose.ui.unit.Density
            public /* synthetic */ Rect toRect(DpRect dpRect) {
                return Density.CC.$default$toRect(this, dpRect);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toSize-XkaWNTQ */
            public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
                return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* renamed from: toSp-0xMU5do */
            public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
                return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toSp-kPz2Gy4 */
            public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
                return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toDp-u2uoSUM */
            public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
                return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* renamed from: toSp-kPz2Gy4 */
            public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
                return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
            }
        };
        UnitDensity = r0;
        List listH = i.h();
        Orientation orientation = Orientation.Horizontal;
        SnapPosition.Start start = SnapPosition.Start.INSTANCE;
        EmptyLayoutInfo = new PagerMeasureResult(listH, 0, 0, 0, orientation, 0, 0, false, 0, null, null, 0.0f, 0, false, start, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
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
        }, false, null, null, aj.e(k.f48060a), (Density) r0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), 393216, null);
    }

    public static final PagerState PagerState(int i2, float f2, a<Integer> aVar) {
        return new DefaultPagerState(i2, f2, aVar);
    }

    public static /* synthetic */ PagerState PagerState$default(int i2, float f2, a aVar, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        return PagerState(i2, f2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(final LazyLayoutScrollScope lazyLayoutScrollScope, int i2, float f2, AnimationSpec<Float> animationSpec, p<? super ScrollScope, ? super Integer, ab> pVar, e<? super ab> eVar) {
        int i3;
        int firstVisibleItemIndex;
        pVar.invoke(lazyLayoutScrollScope, new Integer(i2));
        int firstVisibleItemIndex2 = lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex();
        boolean z = i2 > firstVisibleItemIndex2;
        if (((z && i2 > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z && i2 < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i2 - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            int i4 = lastVisibleItemIndex + 1;
            if (!z ? (i3 = i2 + i4) > (firstVisibleItemIndex = lazyLayoutScrollScope.getFirstVisibleItemIndex()) : (i3 = i2 - i4) < (firstVisibleItemIndex = lazyLayoutScrollScope.getFirstVisibleItemIndex())) {
                i3 = firstVisibleItemIndex;
            }
            lazyLayoutScrollScope.snapToItem(i3, 0);
        }
        float fCalculateDistanceTo$default = LazyLayoutScrollScope.CC.calculateDistanceTo$default(lazyLayoutScrollScope, i2, 0, 2, null) + f2;
        final an anVar = new an();
        Object objAnimate$default = SuspendAnimationKt.animate$default(0.0f, fCalculateDistanceTo$default, 0.0f, animationSpec, new p() { // from class: androidx.compose.foundation.pager.PagerStateKt$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return PagerStateKt.animateScrollToPage$lambda$2(anVar, lazyLayoutScrollScope, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, eVar, 4, null);
        return objAnimate$default == h.c.a.a.f48038a ? objAnimate$default : ab.f48028a;
    }

    static final ab animateScrollToPage$lambda$2(an anVar, LazyLayoutScrollScope lazyLayoutScrollScope, float f2, float f3) {
        anVar.f48102a += lazyLayoutScrollScope.scrollBy(f2 - anVar.f48102a);
        return ab.f48028a;
    }

    public static final Object animateToNextPage(PagerState pagerState, e<? super ab> eVar) {
        Object objAnimateScrollToPage$default;
        return (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount() || (objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, eVar, 6, null)) != h.c.a.a.f48038a) ? ab.f48028a : objAnimateScrollToPage$default;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, e<? super ab> eVar) {
        Object objAnimateScrollToPage$default;
        return (pagerState.getCurrentPage() + (-1) < 0 || (objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + (-1), 0.0f, null, eVar, 6, null)) != h.c.a.a.f48038a) ? ab.f48028a : objAnimateScrollToPage$default;
    }

    public static final long calculateNewMaxScrollOffset(PagerLayoutInfo pagerLayoutInfo, int i2) {
        int pageSpacing = pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize();
        long beforeContentPadding = pagerLayoutInfo.getBeforeContentPadding();
        long afterContentPadding = pagerLayoutInfo.getAfterContentPadding();
        long pageSpacing2 = pagerLayoutInfo.getPageSpacing();
        int iMo3036getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? pagerLayoutInfo.mo3036getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo3036getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        long j2 = ((((i2 * pageSpacing) + beforeContentPadding) + afterContentPadding) - pageSpacing2) - (iMo3036getViewportSizeYbymL2g - n.j(pagerLayoutInfo.getSnapPosition().position(iMo3036getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i2 - 1, i2), 0, iMo3036getViewportSizeYbymL2g));
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i2) {
        int iMo3036getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == Orientation.Horizontal ? pagerMeasureResult.mo3036getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo3036getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return n.j(pagerMeasureResult.getSnapPosition().position(iMo3036getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i2), 0, iMo3036getViewportSizeYbymL2g);
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static final PagerState rememberPagerState(final int i2, final float f2, final a<Integer> aVar, Composer composer, int i3, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i3, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        boolean z = true;
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<DefaultPagerState, ?> saver = DefaultPagerState.Companion.getSaver();
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i2)) || (i3 & 6) == 4;
        if ((i4 & 2) != 0) {
            f2 = 0.0f;
        }
        boolean z3 = ((((i3 & 112) ^ 48) > 32 && composer.changed(f2)) || (i3 & 48) == 32) | z2;
        if ((((i3 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(aVar)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.foundation.pager.PagerStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return PagerStateKt.rememberPagerState$lambda$0$0(i2, f2, aVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        defaultPagerState.getPageCountState().setValue(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultPagerState rememberPagerState$lambda$0$0(int i2, float f2, a aVar) {
        return new DefaultPagerState(i2, f2, aVar);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
