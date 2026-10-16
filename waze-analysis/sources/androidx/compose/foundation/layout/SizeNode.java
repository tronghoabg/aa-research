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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z, int i2, o oVar) {
        this((i2 & 1) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3, (i2 & 4) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f4, (i2 & 8) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f5, z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m2830getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.mo2121roundToPx0680j_4(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.maxHeight
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.maxHeight
            int r3 = r7.mo2121roundToPx0680j_4(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.minWidth
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.minWidth
            int r4 = r7.mo2121roundToPx0680j_4(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.minHeight
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.minHeight
            int r6 = r7.mo2121roundToPx0680j_4(r6)
            if (r6 >= 0) goto L52
            r6 = r2
        L52:
            if (r6 <= r3) goto L55
            r6 = r3
        L55:
            if (r6 != r1) goto L58
            goto L59
        L58:
            r2 = r6
        L59:
            long r6 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m2830getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    static final ab measure_3p2s80s$lambda$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m2831getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m2832getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2833getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2834getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM2830getTargetConstraintsOenEA2s = m2830getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m11104getHasFixedHeightimpl(jM2830getTargetConstraintsOenEA2s)) {
            return Constraints.m11106getMaxHeightimpl(jM2830getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.m11124constrainWidthK40F9xA(jM2830getTargetConstraintsOenEA2s, i2);
        }
        return ConstraintsKt.m11123constrainHeightK40F9xA(jM2830getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM2830getTargetConstraintsOenEA2s = m2830getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m11105getHasFixedWidthimpl(jM2830getTargetConstraintsOenEA2s)) {
            return Constraints.m11107getMaxWidthimpl(jM2830getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.m11123constrainHeightK40F9xA(jM2830getTargetConstraintsOenEA2s, i2);
        }
        return ConstraintsKt.m11124constrainWidthK40F9xA(jM2830getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        int iM11109getMinWidthimpl;
        int iM11107getMaxWidthimpl;
        int iM11108getMinHeightimpl;
        int iM11106getMaxHeightimpl;
        long jConstraints;
        long jM2830getTargetConstraintsOenEA2s = m2830getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m11122constrainN9IONVI(j2, jM2830getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
                int iM11107getMaxWidthimpl2 = Constraints.m11107getMaxWidthimpl(jM2830getTargetConstraintsOenEA2s);
                if (iM11109getMinWidthimpl > iM11107getMaxWidthimpl2) {
                    iM11109getMinWidthimpl = iM11107getMaxWidthimpl2;
                }
            } else {
                iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(jM2830getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
                int iM11109getMinWidthimpl2 = Constraints.m11109getMinWidthimpl(jM2830getTargetConstraintsOenEA2s);
                if (iM11107getMaxWidthimpl < iM11109getMinWidthimpl2) {
                    iM11107getMaxWidthimpl = iM11109getMinWidthimpl2;
                }
            } else {
                iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(jM2830getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
                int iM11106getMaxHeightimpl2 = Constraints.m11106getMaxHeightimpl(jM2830getTargetConstraintsOenEA2s);
                if (iM11108getMinHeightimpl > iM11106getMaxHeightimpl2) {
                    iM11108getMinHeightimpl = iM11106getMaxHeightimpl2;
                }
            } else {
                iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(jM2830getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
                int iM11108getMinHeightimpl2 = Constraints.m11108getMinHeightimpl(jM2830getTargetConstraintsOenEA2s);
                if (iM11106getMaxHeightimpl < iM11108getMinHeightimpl2) {
                    iM11106getMaxHeightimpl = iM11108getMinHeightimpl2;
                }
            } else {
                iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(jM2830getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM11109getMinWidthimpl, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, iM11106getMaxHeightimpl);
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(jConstraints);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.SizeNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SizeNode.measure_3p2s80s$lambda$1(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM2830getTargetConstraintsOenEA2s = m2830getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m11104getHasFixedHeightimpl(jM2830getTargetConstraintsOenEA2s)) {
            return Constraints.m11106getMaxHeightimpl(jM2830getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.m11124constrainWidthK40F9xA(jM2830getTargetConstraintsOenEA2s, i2);
        }
        return ConstraintsKt.m11123constrainHeightK40F9xA(jM2830getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM2830getTargetConstraintsOenEA2s = m2830getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m11105getHasFixedWidthimpl(jM2830getTargetConstraintsOenEA2s)) {
            return Constraints.m11107getMaxWidthimpl(jM2830getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.m11123constrainHeightK40F9xA(jM2830getTargetConstraintsOenEA2s, i2);
        }
        return ConstraintsKt.m11124constrainWidthK40F9xA(jM2830getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m2835setMaxHeight0680j_4(float f2) {
        this.maxHeight = f2;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m2836setMaxWidth0680j_4(float f2) {
        this.maxWidth = f2;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m2837setMinHeight0680j_4(float f2) {
        this.minHeight = f2;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m2838setMinWidth0680j_4(float f2) {
        this.minWidth = f2;
    }

    private SizeNode(float f2, float f3, float f4, float f5, boolean z) {
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z;
    }

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z, o oVar) {
        this(f2, f3, f4, f5, z);
    }
}
