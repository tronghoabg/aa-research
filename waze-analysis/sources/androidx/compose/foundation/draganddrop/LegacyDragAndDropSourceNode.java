package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
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
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements MeasuredSizeAwareModifierNode {
    public static final int $stable = 8;
    private p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> dragAndDropSourceHandler;
    private l<? super DrawScope, ab> drawDragDecoration;
    private long size = IntSize.Companion.m11344getZeroYbymL2g();

    public LegacyDragAndDropSourceNode(l<? super DrawScope, ab> lVar, p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
        DragAndDropModifierNode DragAndDropModifierNode = DragAndDropNodeKt.DragAndDropModifierNode();
        delegate(DragAndDropModifierNode);
        final DragAndDropModifierNode dragAndDropModifierNode = DragAndDropModifierNode;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                DragAndDropModifierNode dragAndDropModifierNode2 = dragAndDropModifierNode;
                LegacyDragAndDropSourceNode legacyDragAndDropSourceNode = LegacyDragAndDropSourceNode.this;
                Object objInvoke = legacyDragAndDropSourceNode.getDragAndDropSourceHandler().invoke(new C00281(pointerInputScope, dragAndDropModifierNode2, legacyDragAndDropSourceNode), eVar);
                return objInvoke == a.f48038a ? objInvoke : ab.f48028a;
            }

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00281 implements DragAndDropSourceScope, PointerInputScope {
                private final /* synthetic */ PointerInputScope $$delegate_0;
                final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
                final /* synthetic */ LegacyDragAndDropSourceNode this$0;

                C00281(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
                    this.$dragAndDropModifierNode = dragAndDropModifierNode;
                    this.this$0 = legacyDragAndDropSourceNode;
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
                /* renamed from: getExtendedTouchPadding-NH-jbRc */
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
                /* renamed from: getSize-YbymL2g */
                public long mo2118getSizeYbymL2g() {
                    return this.$$delegate_0.mo2118getSizeYbymL2g();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public ViewConfiguration getViewConfiguration() {
                    return this.$$delegate_0.getViewConfiguration();
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: roundToPx--R2X_6o */
                public int mo2120roundToPxR2X_6o(long j2) {
                    return this.$$delegate_0.mo2120roundToPxR2X_6o(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: roundToPx-0680j_4 */
                public int mo2121roundToPx0680j_4(float f2) {
                    return this.$$delegate_0.mo2121roundToPx0680j_4(f2);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public void setInterceptOutOfBoundsChildEvents(boolean z) {
                    this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z);
                }

                @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
                public void startTransfer(DragAndDropTransferData dragAndDropTransferData) {
                    this.$dragAndDropModifierNode.mo7731drag12SF9DM(dragAndDropTransferData, IntSizeKt.m11351toSizeozmzZPI(mo2118getSizeYbymL2g()), this.this$0.getDrawDragDecoration());
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: toDp-GaN1DYA */
                public float mo2122toDpGaN1DYA(long j2) {
                    return this.$$delegate_0.mo2122toDpGaN1DYA(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDp-u2uoSUM */
                public float mo2123toDpu2uoSUM(float f2) {
                    return this.$$delegate_0.mo2123toDpu2uoSUM(f2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDpSize-k-rfVVM */
                public long mo2125toDpSizekrfVVM(long j2) {
                    return this.$$delegate_0.mo2125toDpSizekrfVVM(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toPx--R2X_6o */
                public float mo2126toPxR2X_6o(long j2) {
                    return this.$$delegate_0.mo2126toPxR2X_6o(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toPx-0680j_4 */
                public float mo2127toPx0680j_4(float f2) {
                    return this.$$delegate_0.mo2127toPx0680j_4(f2);
                }

                @Override // androidx.compose.ui.unit.Density
                public Rect toRect(DpRect dpRect) {
                    return this.$$delegate_0.toRect(dpRect);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSize-XkaWNTQ */
                public long mo2128toSizeXkaWNTQ(long j2) {
                    return this.$$delegate_0.mo2128toSizeXkaWNTQ(j2);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: toSp-0xMU5do */
                public long mo2129toSp0xMU5do(float f2) {
                    return this.$$delegate_0.mo2129toSp0xMU5do(f2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSp-kPz2Gy4 */
                public long mo2130toSpkPz2Gy4(float f2) {
                    return this.$$delegate_0.mo2130toSpkPz2Gy4(f2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDp-u2uoSUM */
                public float mo2124toDpu2uoSUM(int i2) {
                    return this.$$delegate_0.mo2124toDpu2uoSUM(i2);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSp-kPz2Gy4 */
                public long mo2131toSpkPz2Gy4(int i2) {
                    return this.$$delegate_0.mo2131toSpkPz2Gy4(i2);
                }
            }
        }));
    }

    public final p<DragAndDropSourceScope, e<? super ab>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final l<DrawScope, ab> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        this.size = j2;
    }

    public final void setDragAndDropSourceHandler(p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    public final void setDrawDragDecoration(l<? super DrawScope, ab> lVar) {
        this.drawDragDecoration = lVar;
    }
}
