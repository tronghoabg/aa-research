package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DrawScope$record$1 extends y implements l<DrawScope, ab> {
    final /* synthetic */ l<DrawScope, ab> $block;
    final /* synthetic */ DrawScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DrawScope$record$1(DrawScope drawScope, l<? super DrawScope, ab> lVar) {
        super(1);
        this.this$0 = drawScope;
        this.$block = lVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawScope) {
        Density density = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        long jMo8758getSizeNHjbRc = drawScope.getDrawContext().mo8758getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawScope drawScope2 = this.this$0;
        Density density2 = drawScope2.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
        long jMo8758getSizeNHjbRc2 = drawScope2.getDrawContext().mo8758getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope2.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope2.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            this.$block.invoke(drawScope2);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope2.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc2);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return ab.f48028a;
    }
}
