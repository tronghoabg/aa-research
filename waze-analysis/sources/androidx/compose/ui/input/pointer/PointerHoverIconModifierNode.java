package androidx.compose.ui.input.pointer;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PointerHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 8;
    private final String traverseKey;

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z) {
        super(pointerIcon, z, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void displayIcon(PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo9512isRelevantPointerTypeuerMTgs(int i2) {
        return (PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9688getStylusT8wyACA()) || PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9686getEraserT8wyACA())) ? false : true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public /* synthetic */ PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z, int i2, o oVar) {
        this(pointerIcon, z & ((i2 & 2) == 0));
    }
}
