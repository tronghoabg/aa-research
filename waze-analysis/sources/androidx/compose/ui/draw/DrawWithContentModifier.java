package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    private l<? super ContentDrawScope, ab> onDraw;

    public DrawWithContentModifier(l<? super ContentDrawScope, ab> lVar) {
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }

    public final l<ContentDrawScope, ab> getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(l<? super ContentDrawScope, ab> lVar) {
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
