package com.waze.main_screen.ac;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends Modifier.Node implements PointerInputModifierNode {

    /* renamed from: a, reason: collision with root package name */
    private h f25678a;

    public g(h hVar) {
        x.f(hVar, "provider");
        this.f25678a = hVar;
    }

    public final void a(h hVar) {
        x.f(hVar, "<set-?>");
        this.f25678a = hVar;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        x.f(pointerEvent, "pointerEvent");
        x.f(pointerEventPass, "pass");
        if (pointerEventPass == PointerEventPass.Initial) {
            for (PointerInputChange pointerInputChange : pointerEvent.getChanges()) {
                if (pointerInputChange.getPressed()) {
                    this.f25678a.b(pointerInputChange.m9608getPositionF1C5BW0());
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }
}
