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
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f2, float f3, int i2, o oVar) {
        this((i2 & 1) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3, null);
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2842getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2843getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
        int i3 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo2121roundToPx0680j_4(this.minHeight) : 0;
        return iMaxIntrinsicHeight < i3 ? i3 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i2);
        int i3 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo2121roundToPx0680j_4(this.minWidth) : 0;
        return iMaxIntrinsicWidth < i3 ? i3 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        int iM11109getMinWidthimpl;
        int iM11108getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m11109getMinWidthimpl(j2) != 0) {
            iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        } else {
            int i2 = measureScope.mo2121roundToPx0680j_4(this.minWidth);
            iM11109getMinWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 <= iM11109getMinWidthimpl) {
                iM11109getMinWidthimpl = i2;
            }
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        if (Float.isNaN(this.minHeight) || Constraints.m11108getMinHeightimpl(j2) != 0) {
            iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        } else {
            int i3 = measureScope.mo2121roundToPx0680j_4(this.minHeight);
            iM11108getMinHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
            int i4 = i3 >= 0 ? i3 : 0;
            if (i4 <= iM11108getMinHeightimpl) {
                iM11108getMinHeightimpl = i4;
            }
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.Constraints(iM11109getMinWidthimpl, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, Constraints.m11106getMaxHeightimpl(j2)));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return UnspecifiedConstraintsNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i2);
        int i3 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo2121roundToPx0680j_4(this.minHeight) : 0;
        return iMinIntrinsicHeight < i3 ? i3 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i2);
        int i3 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo2121roundToPx0680j_4(this.minWidth) : 0;
        return iMinIntrinsicWidth < i3 ? i3 : iMinIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m2844setMinHeight0680j_4(float f2) {
        this.minHeight = f2;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m2845setMinWidth0680j_4(float f2) {
        this.minWidth = f2;
    }

    private UnspecifiedConstraintsNode(float f2, float f3) {
        this.minWidth = f2;
        this.minHeight = f3;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f2, float f3, o oVar) {
        this(f2, f3);
    }
}
