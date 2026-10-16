package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {
    private a<ab> callback;
    private final f composeImm$delegate = g.b(h.f48132c, new a() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.f$0));
        }
    });
    private final StylusHandwritingNode pointerInputNode;

    public HandwritingDetectorNode(a<ab> aVar) {
        this.callback = aVar;
        StylusHandwritingNode stylusHandwritingNode = new StylusHandwritingNode(new a() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return HandwritingDetectorNode.pointerInputNode$lambda$0(this.f$0);
            }
        });
        delegate(stylusHandwritingNode);
        this.pointerInputNode = stylusHandwritingNode;
    }

    private final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    static final ab pointerInputNode$lambda$0(HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.callback.invoke();
        handwritingDetectorNode.getComposeImm().prepareStylusHandwritingDelegation();
        return ab.f48028a;
    }

    public final a<ab> getCallback() {
        return this.callback;
    }

    public final StylusHandwritingNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1935getTouchBoundsExpansionRZrCHBk() {
        return this.pointerInputNode.mo1935getTouchBoundsExpansionRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.pointerInputNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    public final void setCallback(a<ab> aVar) {
        this.callback = aVar;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }
}
