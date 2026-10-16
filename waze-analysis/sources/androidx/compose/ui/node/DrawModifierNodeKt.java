package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawModifierNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void dispatchDraw(DelegatableNode delegatableNode, ContentDrawScope contentDrawScope) {
        DelegatingNode node = delegatableNode.getNode();
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof DrawModifierNode) {
                ((DrawModifierNode) node).draw(contentDrawScope);
            } else if ((node.getKindSet$ui() & 4) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = node.getDelegate$ui();
                int i2 = 0;
                node = node;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                            }
                            mutableVector.add(delegate$ui);
                            node = 0;
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    node = node;
                }
                if (i2 != 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
    }

    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m9921requireCoordinator64DMado(drawModifierNode, 1).invalidateLayer();
        }
    }
}
