package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.ComposeMaterial3Flags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.h.a;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {
    private p<? super IntSize, ? super Constraints, ? extends k<? extends DraggableAnchors<T>, ? extends T>> anchors;
    private boolean didInitializeAnchors;
    private Orientation orientation;
    private AnchoredDraggableState<T> state;

    public DraggableAnchorsNode(AnchoredDraggableState<T> anchoredDraggableState, p<? super IntSize, ? super Constraints, ? extends k<? extends DraggableAnchors<T>, ? extends T>> pVar, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = pVar;
        this.orientation = orientation;
    }

    private final void checkOffsetIsValid(float f2, boolean z) throws AnchoredDraggableUninitializedException {
        if (Float.isNaN(f2)) {
            throw new AnchoredDraggableUninitializedException(z, this.didInitializeAnchors, this.state.getAnchors(), this.state.getTargetValue());
        }
    }

    private final boolean isReverseDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
    }

    static final ab measure_3p2s80s$lambda$0(MeasureScope measureScope, DraggableAnchorsNode draggableAnchorsNode, final Placeable placeable, Placeable.PlacementScope placementScope) throws AnchoredDraggableUninitializedException {
        final float fPositionOf = measureScope.isLookingAhead() ? draggableAnchorsNode.state.getAnchors().positionOf(draggableAnchorsNode.state.getTargetValue()) : draggableAnchorsNode.state.getOffset();
        if (ComposeMaterial3Flags.isAnchoredDraggableComponentsStrictOffsetCheckEnabled) {
            draggableAnchorsNode.checkOffsetIsValid(fPositionOf, measureScope.isLookingAhead());
        } else if (Float.isNaN(fPositionOf)) {
            return ab.f48028a;
        }
        final float f2 = draggableAnchorsNode.orientation == Orientation.Horizontal ? (true != draggableAnchorsNode.isReverseDirection() ? 1.0f : -1.0f) * fPositionOf : 0.0f;
        if (draggableAnchorsNode.orientation != Orientation.Vertical) {
            fPositionOf = 0.0f;
        }
        placementScope.withMotionFrameOfReferencePlacement(new l() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DraggableAnchorsNode.measure_3p2s80s$lambda$0$0(placeable, f2, fPositionOf, (Placeable.PlacementScope) obj);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_3p2s80s$lambda$0$0(Placeable placeable, float f2, float f3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, a.b(f2), a.b(f3), 0.0f, 4, null);
        return ab.f48028a;
    }

    public final p<IntSize, Constraints, k<DraggableAnchors<T>, T>> getAnchors() {
        return this.anchors;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final AnchoredDraggableState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        Object objAnchorAt;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        if (!measureScope.isLookingAhead() || !this.didInitializeAnchors) {
            k<? extends DraggableAnchors<T>, ? extends T> kVarInvoke = this.anchors.invoke(IntSize.m11331boximpl((placeableMo9741measureBRTryo0.getWidth() << 32) | (placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Constraints.m11094boximpl(j2));
            DraggableAnchors draggableAnchors = (DraggableAnchors) kVarInvoke.a();
            Object objB = kVarInvoke.b();
            if (ComposeMaterial3Flags.isAnchoredDraggableComponentsAnchorRecoveryEnabled) {
                if (!draggableAnchors.hasPositionFor(objB) && (objAnchorAt = draggableAnchors.anchorAt(0)) != null) {
                    objB = objAnchorAt;
                }
                this.state.updateAnchors(draggableAnchors, objB);
            } else {
                this.state.updateAnchors(draggableAnchors, objB);
            }
            this.didInitializeAnchors = true;
        }
        this.didInitializeAnchors = measureScope.isLookingAhead() || this.didInitializeAnchors;
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DraggableAnchorsNode.measure_3p2s80s$lambda$0(measureScope, this, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didInitializeAnchors = false;
    }

    public final void setAnchors(p<? super IntSize, ? super Constraints, ? extends k<? extends DraggableAnchors<T>, ? extends T>> pVar) {
        this.anchors = pVar;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setState(AnchoredDraggableState<T> anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }

    public final void update(AnchoredDraggableState<T> anchoredDraggableState, p<? super IntSize, ? super Constraints, ? extends k<? extends DraggableAnchors<T>, ? extends T>> pVar, Orientation orientation) {
        boolean z = ComposeMaterial3Flags.isAnchoredDraggableComponentsInvalidationFixEnabled && !x.n(this.state, anchoredDraggableState);
        this.state = anchoredDraggableState;
        this.anchors = pVar;
        this.orientation = orientation;
        if (z) {
            this.didInitializeAnchors = false;
            LayoutModifierNodeKt.invalidateMeasurement(this);
        }
    }
}
