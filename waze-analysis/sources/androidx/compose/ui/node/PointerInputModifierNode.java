package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PointerInputModifierNode extends DelegatableNode {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.PointerInputModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$interceptOutOfBoundsChildEvents(PointerInputModifierNode pointerInputModifierNode) {
            return false;
        }

        public static boolean $default$sharePointerInputWithSiblings(PointerInputModifierNode pointerInputModifierNode) {
            return false;
        }
    }

    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    long mo1935getTouchBoundsExpansionRZrCHBk();

    boolean interceptOutOfBoundsChildEvents();

    void onCancelPointerInput();

    void onDensityChange();

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2);

    void onViewConfigurationChange();

    boolean sharePointerInputWithSiblings();
}
