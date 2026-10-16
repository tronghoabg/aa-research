package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isVertical;
    private boolean reverseScrolling;
    private ScrollState state;

    public ScrollNode(ScrollState scrollState, boolean z, boolean z2) {
        this.state = scrollState;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    static final ab measure_3p2s80s$lambda$0(ScrollNode scrollNode, int i2, final Placeable placeable, Placeable.PlacementScope placementScope) {
        int value = scrollNode.state.getValue();
        if (value < 0) {
            value = 0;
        }
        boolean z = scrollNode.reverseScrolling;
        if (value > i2) {
            value = i2;
        }
        int i3 = z ? value - i2 : -value;
        boolean z2 = scrollNode.isVertical;
        final int i4 = true != z2 ? i3 : 0;
        final int i5 = true == z2 ? i3 : 0;
        placementScope.withMotionFrameOfReferencePlacement(new l() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ScrollNode.measure_3p2s80s$lambda$0$0(placeable, i4, i5, (Placeable.PlacementScope) obj);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_3p2s80s$lambda$0$0(Placeable placeable, int i2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i2, i3, 0.0f, (l) null, 12, (Object) null);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new a() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda2
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 float, still in use, count: 1, list:
                  (r0v2 float) from 0x0006: INVOKE (r0v3 java.lang.Float) = (r0v2 float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c)] (LINE:7)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:468)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // h.g.a.a
            public final java.lang.Object invoke() {
                /*
                    r0 = this;
                    androidx.compose.foundation.ScrollNode r0 = r0.f$0
                    float r0 = androidx.compose.foundation.ScrollNode.applySemantics$lambda$0(r0)
                    java.lang.Float r0 = java.lang.Float.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda2.invoke():java.lang.Object");
            }
        }, new a() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda3
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 float, still in use, count: 1, list:
                  (r0v2 float) from 0x0006: INVOKE (r0v3 java.lang.Float) = (r0v2 float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c)] (LINE:7)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:468)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // h.g.a.a
            public final java.lang.Object invoke() {
                /*
                    r0 = this;
                    androidx.compose.foundation.ScrollNode r0 = r0.f$0
                    float r0 = androidx.compose.foundation.ScrollNode.applySemantics$lambda$1(r0)
                    java.lang.Float r0 = java.lang.Float.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda3.invoke():java.lang.Object");
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    public final ScrollState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (true != this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (true == this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        CheckScrollableContainerConstraintsKt.m1999checkScrollableContainerConstraintsK40F9xA(j2, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        boolean z = this.isVertical;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, z ? Constraints.m11107getMaxWidthimpl(j2) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : Constraints.m11106getMaxHeightimpl(j2), 5, null));
        int width = placeableMo9741measureBRTryo0.getWidth();
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int i2 = width > iM11107getMaxWidthimpl ? iM11107getMaxWidthimpl : width;
        int height = placeableMo9741measureBRTryo0.getHeight();
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        int i3 = height > iM11106getMaxHeightimpl ? iM11106getMaxHeightimpl : height;
        final int height2 = placeableMo9741measureBRTryo0.getHeight() - i3;
        int width2 = placeableMo9741measureBRTryo0.getWidth() - i2;
        if (true != this.isVertical) {
            height2 = width2;
        }
        this.state.setMaxValue$foundation(height2);
        this.state.setViewportSize$foundation(true != this.isVertical ? i2 : i3);
        this.state.setContentSize$foundation(this.isVertical ? placeableMo9741measureBRTryo0.getHeight() : placeableMo9741measureBRTryo0.getWidth());
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new l() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ScrollNode.measure_3p2s80s$lambda$0(this.f$0, height2, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (true != this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (true == this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    public final void setReverseScrolling(boolean z) {
        this.reverseScrolling = z;
    }

    public final void setState(ScrollState scrollState) {
        this.state = scrollState;
    }

    public final void setVertical(boolean z) {
        this.isVertical = z;
    }
}
