package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LayoutNodeDrawScope$record$1 extends y implements l<DrawScope, ab> {
    final /* synthetic */ l<DrawScope, ab> $block;
    final /* synthetic */ DrawModifierNode $currentDrawNode;
    final /* synthetic */ LayoutNodeDrawScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LayoutNodeDrawScope$record$1(LayoutNodeDrawScope layoutNodeDrawScope, DrawModifierNode drawModifierNode, l<? super DrawScope, ab> lVar) {
        super(1);
        this.this$0 = layoutNodeDrawScope;
        this.$currentDrawNode = drawModifierNode;
        this.$block = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.node.DrawModifierNode] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.node.DrawModifierNode] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawScope) throws Throwable {
        LayoutNodeDrawScope layoutNodeDrawScope = this.this$0;
        DrawModifierNode drawModifierNode = this.$currentDrawNode;
        ?? drawContext = layoutNodeDrawScope.drawNode;
        layoutNodeDrawScope.drawNode = drawModifierNode;
        try {
            LayoutNodeDrawScope layoutNodeDrawScope2 = this.this$0;
            Density density = drawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            long jMo8758getSizeNHjbRc = drawScope.getDrawContext().mo8758getSizeNHjbRc();
            GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
            l<DrawScope, ab> lVar = this.$block;
            Density density2 = layoutNodeDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = layoutNodeDrawScope2.getDrawContext().getLayoutDirection();
            Canvas canvas2 = layoutNodeDrawScope2.getDrawContext().getCanvas();
            long jMo8758getSizeNHjbRc2 = layoutNodeDrawScope2.getDrawContext().mo8758getSizeNHjbRc();
            GraphicsLayer graphicsLayer2 = layoutNodeDrawScope2.getDrawContext().getGraphicsLayer();
            try {
                drawContext = layoutNodeDrawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer);
                canvas.save();
                try {
                    lVar.invoke(layoutNodeDrawScope2);
                    canvas.restore();
                    DrawContext drawContext2 = layoutNodeDrawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer2);
                    this.this$0.drawNode = drawContext;
                } catch (Throwable th) {
                    canvas.restore();
                    DrawContext drawContext3 = layoutNodeDrawScope2.getDrawContext();
                    drawContext3.setDensity(density2);
                    drawContext3.setLayoutDirection(layoutDirection2);
                    drawContext3.setCanvas(canvas2);
                    drawContext3.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc2);
                    drawContext3.setGraphicsLayer(graphicsLayer2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                drawContext = drawContext;
                this.this$0.drawNode = drawContext;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) throws Throwable {
        invoke2(drawScope);
        return ab.f48028a;
    }
}
