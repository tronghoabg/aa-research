package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private final MutableState isEnabled$delegate;
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private final MutableState scaleToBounds$delegate;

    public SkipToLookaheadSizeNode(ScaleToBoundsImpl scaleToBoundsImpl, a<Boolean> aVar) {
        this.scaleToBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds$delegate.getValue();
    }

    public final a<Boolean> isEnabled() {
        return (a) this.isEnabled$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.isLookingAhead()) {
            long j2 = this.lookaheadSize;
            if (AnimationModifierKt.m1736isValidozmzZPI(j2)) {
                return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.isLookingAhead()) {
            long j2 = this.lookaheadSize;
            if (AnimationModifierKt.m1736isValidozmzZPI(j2)) {
                return (int) (j2 >> 32);
            }
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableMo9741measureBRTryo0;
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m11094boximpl(j2);
        }
        if (!isEnabled().invoke().booleanValue()) {
            Placeable placeableMo9741measureBRTryo02 = measurable.mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo02.getWidth(), placeableMo9741measureBRTryo02.getHeight(), null, new SkipToLookaheadSizeNode$measure$1$1(placeableMo9741measureBRTryo02), 4, null);
        }
        if (measureScope.isLookingAhead()) {
            placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
            this.lookaheadSize = (placeableMo9741measureBRTryo0.getWidth() << 32) | (placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        } else {
            Constraints constraints = this.lookaheadConstraints;
            x.c(constraints);
            placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        }
        long jM11121constrain4WqzIAM = ConstraintsKt.m11121constrain4WqzIAM(j2, this.lookaheadSize);
        return MeasureScope.CC.layout$default(measureScope, (int) (jM11121constrain4WqzIAM >> 32), (int) (jM11121constrain4WqzIAM & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, new SkipToLookaheadSizeNode$measure$2(this, placeableMo9741measureBRTryo0, jM11121constrain4WqzIAM, measureScope), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.isLookingAhead()) {
            long j2 = this.lookaheadSize;
            if (AnimationModifierKt.m1736isValidozmzZPI(j2)) {
                return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }
        }
        return intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.isLookingAhead()) {
            long j2 = this.lookaheadSize;
            if (AnimationModifierKt.m1736isValidozmzZPI(j2)) {
                return (int) (j2 >> 32);
            }
        }
        return intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    public final void setEnabled(a<Boolean> aVar) {
        this.isEnabled$delegate.setValue(aVar);
    }

    public final void setScaleToBounds(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds$delegate.setValue(scaleToBoundsImpl);
    }
}
