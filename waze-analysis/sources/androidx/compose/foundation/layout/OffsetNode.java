package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;
    private float x;
    private float y;

    private OffsetNode(float f2, float f3, boolean z) {
        this.x = f2;
        this.y = f3;
        this.rtlAware = z;
    }

    static final ab measure_3p2s80s$lambda$0(OffsetNode offsetNode, Placeable placeable, Placeable.PlacementScope placementScope) {
        if (offsetNode.rtlAware) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo2121roundToPx0680j_4(offsetNode.x), placementScope.mo2121roundToPx0680j_4(offsetNode.y), 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo2121roundToPx0680j_4(offsetNode.x), placementScope.mo2121roundToPx0680j_4(offsetNode.y), 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m2716getXD9Ej5fM() {
        return this.x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m2717getYD9Ej5fM() {
        return this.y;
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.OffsetNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OffsetNode.measure_3p2s80s$lambda$0(this.f$0, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
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

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m2718setX0680j_4(float f2) {
        this.x = f2;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m2719setY0680j_4(float f2) {
        this.y = f2;
    }

    /* renamed from: update-Md-fbLM, reason: not valid java name */
    public final void m2720updateMdfbLM(float f2, float f3, boolean z) {
        if (!Dp.m11169equalsimpl0(this.x, f2) || !Dp.m11169equalsimpl0(this.y, f3) || this.rtlAware != z) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.x = f2;
        this.y = f3;
        this.rtlAware = z;
    }

    public /* synthetic */ OffsetNode(float f2, float f3, boolean z, o oVar) {
        this(f2, f3, z);
    }
}
