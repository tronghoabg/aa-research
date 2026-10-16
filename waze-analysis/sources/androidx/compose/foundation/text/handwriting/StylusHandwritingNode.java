package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private boolean focused;
    private a<ab> onHandwritingSlopExceeded;
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;

    public StylusHandwritingNode(a<ab> aVar) {
        this.onHandwritingSlopExceeded = aVar;
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ StylusHandwritingNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.this$0 = stylusHandwritingNode;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, eVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // h.g.a.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
                
                    if (r8 != r1) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:
                
                    if (r10 == r1) goto L82;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x01ac, code lost:
                
                    if (r3 == r1) goto L82;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x01ef, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f5 -> B:37:0x00f7). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01ac -> B:66:0x01ae). Please report as a decompilation issue!!! */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                    /*
                        Method dump skipped, instructions count: 496
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(this.this$0, null), eVar);
                return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
            }
        });
        delegate(SuspendingPointerInputModifierNode);
        this.suspendingPointerInputModifierNode = SuspendingPointerInputModifierNode;
    }

    public final a<ab> getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1935getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwritingKt.getHandwritingBoundsExpansion().m9959roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.suspendingPointerInputModifierNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    public final void resetPointerInputHandler() {
        this.suspendingPointerInputModifierNode.resetPointerInputHandler();
    }

    public final void setOnHandwritingSlopExceeded(a<ab> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }
}
