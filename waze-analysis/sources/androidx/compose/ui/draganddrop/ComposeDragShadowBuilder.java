package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 8;
    private final long decorationSize;
    private final Density density;
    private final l<DrawScope, ab> drawDragDecoration;

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeDragShadowBuilder(Density density, long j2, l<? super DrawScope, ab> lVar) {
        this.density = density;
        this.decorationSize = j2;
        this.drawDragDecoration = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        androidx.compose.ui.graphics.Canvas canvasComponent3 = drawParams.component3();
        long jM8754component4NHjbRc = drawParams.m8754component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(this.density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m8757setSizeuvyYCjk(this.decorationSize);
        Canvas.save();
        this.drawDragDecoration.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m8757setSizeuvyYCjk(jM8754component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        int i2 = (int) (this.decorationSize >> 32);
        Density density = this.density;
        point.set(density.mo2121roundToPx0680j_4(density.mo2123toDpu2uoSUM(Float.intBitsToFloat(i2))), density.mo2121roundToPx0680j_4(density.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))));
        point2.set(point.x / 2, point.y / 2);
    }

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j2, l lVar, o oVar) {
        this(density, j2, lVar);
    }
}
