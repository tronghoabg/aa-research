package androidx.compose.ui.node;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DrawModifierNode extends DelegatableNode {
    void draw(ContentDrawScope contentDrawScope);

    void onMeasureResultChanged();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.DrawModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onMeasureResultChanged(DrawModifierNode drawModifierNode) {
        }
    }
}
