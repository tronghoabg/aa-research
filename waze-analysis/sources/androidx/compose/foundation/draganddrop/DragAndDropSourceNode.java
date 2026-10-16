package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> detectDragStart;
    private final DragAndDropSourceModifierNode dragAndDropModifierNode;
    private l<? super DrawScope, ab> drawDragDecoration;
    private PointerInputModifierNode inputModifierNode;
    private long size = IntSize.Companion.m11344getZeroYbymL2g();
    private l<? super Offset, DragAndDropTransferData> transferData;

    public DragAndDropSourceNode(l<? super DrawScope, ab> lVar, p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar, l<? super Offset, DragAndDropTransferData> lVar2) {
        this.drawDragDecoration = lVar;
        this.detectDragStart = pVar;
        this.transferData = lVar2;
        DragAndDropSourceModifierNode DragAndDropSourceModifierNode = DragAndDropNodeKt.DragAndDropSourceModifierNode(new p() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return DragAndDropSourceNode.dragAndDropModifierNode$lambda$0(this.f$0, (DragAndDropStartTransferScope) obj, (Offset) obj2);
            }
        });
        delegate(DragAndDropSourceModifierNode);
        this.dragAndDropModifierNode = DragAndDropSourceModifierNode;
    }

    static final ab dragAndDropModifierNode$lambda$0(DragAndDropSourceNode dragAndDropSourceNode, DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
        DragAndDropTransferData dragAndDropTransferDataInvoke = dragAndDropSourceNode.transferData.invoke(offset);
        if (dragAndDropTransferDataInvoke != null) {
            dragAndDropStartTransferScope.mo7730startDragAndDropTransfer12SF9DM(dragAndDropTransferDataInvoke, IntSizeKt.m11351toSizeozmzZPI(dragAndDropSourceNode.size), dragAndDropSourceNode.drawDragDecoration);
        }
        return ab.f48028a;
    }

    public final p<DragAndDropStartDetectorScope, e<? super ab>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    public final l<DrawScope, ab> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.dragAndDropModifierNode.isRequestDragAndDropTransferRequired()) {
            SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode.onAttach.1
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                    DragAndDropSourceNode dragAndDropSourceNode = DragAndDropSourceNode.this;
                    Object objInvoke = dragAndDropSourceNode.getDetectDragStart().invoke(new C00271(pointerInputScope, dragAndDropSourceNode), eVar);
                    return objInvoke == a.f48038a ? objInvoke : ab.f48028a;
                }

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name and collision with other inner class name */
                public final class C00271 implements DragAndDropStartDetectorScope, PointerInputScope {
                    private final /* synthetic */ PointerInputScope $$delegate_0;
                    final /* synthetic */ DragAndDropSourceNode this$0;

                    C00271(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.this$0 = dragAndDropSourceNode;
                        this.$$delegate_0 = pointerInputScope;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public <R> Object awaitPointerEventScope(p<? super AwaitPointerEventScope, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
                        return this.$$delegate_0.awaitPointerEventScope(pVar, eVar);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float getDensity() {
                        return this.$$delegate_0.getDensity();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
                    public long mo2117getExtendedTouchPaddingNHjbRc() {
                        return this.$$delegate_0.mo2117getExtendedTouchPaddingNHjbRc();
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    public float getFontScale() {
                        return this.$$delegate_0.getFontScale();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public boolean getInterceptOutOfBoundsChildEvents() {
                        return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long mo2118getSizeYbymL2g() {
                        return this.$$delegate_0.mo2118getSizeYbymL2g();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo2119requestDragAndDropTransferk4lQ0M(long j2) {
                        this.this$0.dragAndDropModifierNode.mo7733requestDragAndDropTransferk4lQ0M(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo2120roundToPxR2X_6o(long j2) {
                        return this.$$delegate_0.mo2120roundToPxR2X_6o(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo2121roundToPx0680j_4(float f2) {
                        return this.$$delegate_0.mo2121roundToPx0680j_4(f2);
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo2122toDpGaN1DYA(long j2) {
                        return this.$$delegate_0.mo2122toDpGaN1DYA(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo2123toDpu2uoSUM(float f2) {
                        return this.$$delegate_0.mo2123toDpu2uoSUM(f2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo2125toDpSizekrfVVM(long j2) {
                        return this.$$delegate_0.mo2125toDpSizekrfVVM(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo2126toPxR2X_6o(long j2) {
                        return this.$$delegate_0.mo2126toPxR2X_6o(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
                    public float mo2127toPx0680j_4(float f2) {
                        return this.$$delegate_0.mo2127toPx0680j_4(f2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public Rect toRect(DpRect dpRect) {
                        return this.$$delegate_0.toRect(dpRect);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo2128toSizeXkaWNTQ(long j2) {
                        return this.$$delegate_0.mo2128toSizeXkaWNTQ(j2);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo2129toSp0xMU5do(float f2) {
                        return this.$$delegate_0.mo2129toSp0xMU5do(f2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo2130toSpkPz2Gy4(float f2) {
                        return this.$$delegate_0.mo2130toSpkPz2Gy4(f2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo2124toDpu2uoSUM(int i2) {
                        return this.$$delegate_0.mo2124toDpu2uoSUM(i2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo2131toSpkPz2Gy4(int i2) {
                        return this.$$delegate_0.mo2131toSpkPz2Gy4(i2);
                    }
                }
            });
            delegate(SuspendingPointerInputModifierNode);
            this.inputModifierNode = SuspendingPointerInputModifierNode;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PointerInputModifierNode pointerInputModifierNode = this.inputModifierNode;
        if (pointerInputModifierNode != null) {
            undelegate(pointerInputModifierNode);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropModifierNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        this.size = j2;
        this.dragAndDropModifierNode.mo2116onRemeasuredozmzZPI(j2);
    }

    public final void setDetectDragStart(p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.detectDragStart = pVar;
    }

    public final void setDrawDragDecoration(l<? super DrawScope, ab> lVar) {
        this.drawDragDecoration = lVar;
    }

    public final void setTransferData(l<? super Offset, DragAndDropTransferData> lVar) {
        this.transferData = lVar;
    }
}
