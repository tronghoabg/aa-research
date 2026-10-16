package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.ConstraintsKt;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaddingNode(float f2, float f3, float f4, float f5, boolean z, int i2, o oVar) {
        f5 = (i2 & 8) != 0 ? 0.0f : f5;
        f4 = (i2 & 4) != 0 ? 0.0f : f4;
        this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, f4, f5, z, null);
    }

    static final ab measure_3p2s80s$lambda$0(PaddingNode paddingNode, Placeable placeable, Placeable.PlacementScope placementScope) {
        if (paddingNode.rtlAware) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo2121roundToPx0680j_4(paddingNode.start), placementScope.mo2121roundToPx0680j_4(paddingNode.top), 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo2121roundToPx0680j_4(paddingNode.start), placementScope.mo2121roundToPx0680j_4(paddingNode.top), 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m2760getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m2761getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m2762getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m2763getTopD9Ej5fM() {
        return this.top;
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
        int i2 = measureScope.mo2121roundToPx0680j_4(this.start) + measureScope.mo2121roundToPx0680j_4(this.end);
        int i3 = measureScope.mo2121roundToPx0680j_4(this.top) + measureScope.mo2121roundToPx0680j_4(this.bottom);
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(j2, -i2, -i3));
        int width = placeableMo9741measureBRTryo0.getWidth() + i2;
        int height = placeableMo9741measureBRTryo0.getHeight() + i3;
        return MeasureScope.CC.layout$default(measureScope, ConstraintsKt.m11124constrainWidthK40F9xA(j2, width), ConstraintsKt.m11123constrainHeightK40F9xA(j2, height), null, new l() { // from class: androidx.compose.foundation.layout.PaddingNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PaddingNode.measure_3p2s80s$lambda$0(this.f$0, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
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

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m2764setBottom0680j_4(float f2) {
        this.bottom = f2;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m2765setEnd0680j_4(float f2) {
        this.end = f2;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m2766setStart0680j_4(float f2) {
        this.start = f2;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m2767setTop0680j_4(float f2) {
        this.top = f2;
    }

    private PaddingNode(float f2, float f3, float f4, float f5, boolean z) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        this.rtlAware = z;
    }

    public /* synthetic */ PaddingNode(float f2, float f3, float f4, float f5, boolean z, o oVar) {
        this(f2, f3, f4, f5, z);
    }
}
