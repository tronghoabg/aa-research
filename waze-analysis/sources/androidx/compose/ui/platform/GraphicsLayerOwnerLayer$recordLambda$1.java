package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class GraphicsLayerOwnerLayer$recordLambda$1 extends y implements l<DrawScope, ab> {
    final /* synthetic */ GraphicsLayerOwnerLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphicsLayerOwnerLayer$recordLambda$1(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        super(1);
        this.this$0 = graphicsLayerOwnerLayer;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        p pVar = this.this$0.drawBlock;
        if (pVar != null) {
            pVar.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return ab.f48028a;
    }
}
