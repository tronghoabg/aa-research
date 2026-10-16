package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import h.g.b.o;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private AnimationSpec<Float> animationSpec;
    private boolean autoSwitchToMinute;
    private final MutableState center$delegate;
    private float offsetX;
    private float offsetY;
    private final SuspendingPointerInputModifierNode pointerInputDragNode;
    private final SuspendingPointerInputModifierNode pointerInputTapNode;
    private int selection;
    private AnalogTimePickerState state;

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec<Float> animationSpec) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.selection = i2;
        this.animationSpec = animationSpec;
        this.center$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m11287boximpl(IntOffset.Companion.m11307getZeronOccac()), null, 2, null);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputTapNode$1(this));
        delegate(SuspendingPointerInputModifierNode);
        this.pointerInputTapNode = SuspendingPointerInputModifierNode;
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode2 = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputDragNode$1(this));
        delegate(SuspendingPointerInputModifierNode2);
        this.pointerInputDragNode = SuspendingPointerInputModifierNode2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m4532getCenternOccac() {
        return ((IntOffset) this.center$delegate.getValue()).m11305unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxDist() {
        return (DelegatableNodeKt.requireDensity(this).mo2127toPx0680j_4(TimePickerKt.MaxDistance) * r0.mo2121roundToPx0680j_4(this.state.m4330getCurrentDiameterD9Ej5fM())) / r0.mo2121roundToPx0680j_4(TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM());
    }

    /* renamed from: setCenter--gyyYBs, reason: not valid java name */
    private final void m4533setCentergyyYBs(long j2) {
        this.center$delegate.setValue(IntOffset.m11287boximpl(j2));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputTapNode.onCancelPointerInput();
        this.pointerInputDragNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.pointerInputTapNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        this.pointerInputDragNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        m4533setCentergyyYBs(IntSizeKt.m11345getCenterozmzZPI(j2));
        this.state.m4332setCurrentDiameter0680j_4(DelegatableNodeKt.requireDensity(this).mo2124toDpu2uoSUM((int) (j2 >> 32)));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* renamed from: updateNode-JwYzU44, reason: not valid java name */
    public final void m4534updateNodeJwYzU44(AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec<Float> animationSpec) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.animationSpec = animationSpec;
        if (TimePickerSelectionMode.m5901equalsimpl0(this.selection, i2)) {
            return;
        }
        this.selection = i2;
        aj.z(getCoroutineScope(), null, null, new ClockDialNode$updateNode$1(analogTimePickerState, animationSpec, null), 3);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public /* synthetic */ void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec animationSpec, o oVar) {
        this(analogTimePickerState, z, i2, animationSpec);
    }
}
