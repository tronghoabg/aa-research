package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f2, boolean z) {
        this.aspectRatio = f2;
        this.matchHeightConstraintsFirst = z;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m2461findSizeToXhtMw(long j2) {
        if (this.matchHeightConstraintsFirst) {
            long jM2462tryMaxHeightJN0ABg = m2462tryMaxHeightJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2462tryMaxHeightJN0ABg, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2462tryMaxHeightJN0ABg;
            }
            long jM2463tryMaxWidthJN0ABg = m2463tryMaxWidthJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2463tryMaxWidthJN0ABg, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2463tryMaxWidthJN0ABg;
            }
            long jM2464tryMinHeightJN0ABg = m2464tryMinHeightJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2464tryMinHeightJN0ABg, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2464tryMinHeightJN0ABg;
            }
            long jM2465tryMinWidthJN0ABg = m2465tryMinWidthJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2465tryMinWidthJN0ABg, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2465tryMinWidthJN0ABg;
            }
            long jM2462tryMaxHeightJN0ABg2 = m2462tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2462tryMaxHeightJN0ABg2, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2462tryMaxHeightJN0ABg2;
            }
            long jM2463tryMaxWidthJN0ABg2 = m2463tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2463tryMaxWidthJN0ABg2, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2463tryMaxWidthJN0ABg2;
            }
            long jM2464tryMinHeightJN0ABg2 = m2464tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2464tryMinHeightJN0ABg2, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2464tryMinHeightJN0ABg2;
            }
            long jM2465tryMinWidthJN0ABg2 = m2465tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2465tryMinWidthJN0ABg2, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2465tryMinWidthJN0ABg2;
            }
        } else {
            long jM2463tryMaxWidthJN0ABg3 = m2463tryMaxWidthJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2463tryMaxWidthJN0ABg3, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2463tryMaxWidthJN0ABg3;
            }
            long jM2462tryMaxHeightJN0ABg3 = m2462tryMaxHeightJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2462tryMaxHeightJN0ABg3, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2462tryMaxHeightJN0ABg3;
            }
            long jM2465tryMinWidthJN0ABg3 = m2465tryMinWidthJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2465tryMinWidthJN0ABg3, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2465tryMinWidthJN0ABg3;
            }
            long jM2464tryMinHeightJN0ABg3 = m2464tryMinHeightJN0ABg(j2, true);
            if (!IntSize.m11337equalsimpl0(jM2464tryMinHeightJN0ABg3, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2464tryMinHeightJN0ABg3;
            }
            long jM2463tryMaxWidthJN0ABg4 = m2463tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2463tryMaxWidthJN0ABg4, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2463tryMaxWidthJN0ABg4;
            }
            long jM2462tryMaxHeightJN0ABg4 = m2462tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2462tryMaxHeightJN0ABg4, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2462tryMaxHeightJN0ABg4;
            }
            long jM2465tryMinWidthJN0ABg4 = m2465tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2465tryMinWidthJN0ABg4, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2465tryMinWidthJN0ABg4;
            }
            long jM2464tryMinHeightJN0ABg4 = m2464tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m11337equalsimpl0(jM2464tryMinHeightJN0ABg4, IntSize.Companion.m11344getZeroYbymL2g())) {
                return jM2464tryMinHeightJN0ABg4;
            }
        }
        return IntSize.Companion.m11344getZeroYbymL2g();
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m2462tryMaxHeightJN0ABg(long j2, boolean z) {
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        if (iM11106getMaxHeightimpl != Integer.MAX_VALUE) {
            int iRound = Math.round(iM11106getMaxHeightimpl * this.aspectRatio);
            if (iRound > 0 && (!z || AspectRatioKt.m2460isSatisfiedByNN6EwU(j2, iRound, iM11106getMaxHeightimpl))) {
                return (iRound << 32) | iM11106getMaxHeightimpl;
            }
        }
        return IntSize.Companion.m11344getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m2463tryMaxWidthJN0ABg(long j2, boolean z) {
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        if (iM11107getMaxWidthimpl != Integer.MAX_VALUE) {
            int iRound = Math.round(iM11107getMaxWidthimpl / this.aspectRatio);
            if (iRound > 0 && (!z || AspectRatioKt.m2460isSatisfiedByNN6EwU(j2, iM11107getMaxWidthimpl, iRound))) {
                return (iM11107getMaxWidthimpl << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & iRound);
            }
        }
        return IntSize.Companion.m11344getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m2464tryMinHeightJN0ABg(long j2, boolean z) {
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        int iRound = Math.round(iM11108getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z && !AspectRatioKt.m2460isSatisfiedByNN6EwU(j2, iRound, iM11108getMinHeightimpl))) ? IntSize.Companion.m11344getZeroYbymL2g() : (iRound << 32) | iM11108getMinHeightimpl;
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m2465tryMinWidthJN0ABg(long j2, boolean z) {
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        int iRound = Math.round(iM11109getMinWidthimpl / this.aspectRatio);
        if (iRound <= 0 || (z && !AspectRatioKt.m2460isSatisfiedByNN6EwU(j2, iM11109getMinWidthimpl, iRound))) {
            return IntSize.Companion.m11344getZeroYbymL2g();
        }
        return (iM11109getMinWidthimpl << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & iRound);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
        }
        return Math.round(i2 / this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
        }
        return Math.round(i2 * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long jM2461findSizeToXhtMw = m2461findSizeToXhtMw(j2);
        if (!IntSize.m11337equalsimpl0(jM2461findSizeToXhtMw, IntSize.Companion.m11344getZeroYbymL2g())) {
            j2 = Constraints.Companion.m11117fixedJhjzzOo((int) (jM2461findSizeToXhtMw >> 32), (int) (jM2461findSizeToXhtMw & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.AspectRatioNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AspectRatioNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
        }
        return Math.round(i2 / this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE);
        }
        return Math.round(i2 * this.aspectRatio);
    }

    public final void setAspectRatio(float f2) {
        this.aspectRatio = f2;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }
}
