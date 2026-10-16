package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DrawContext {
    Canvas getCanvas();

    Density getDensity();

    GraphicsLayer getGraphicsLayer();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo8758getSizeNHjbRc();

    DrawTransform getTransform();

    void setCanvas(Canvas canvas);

    void setDensity(Density density);

    void setGraphicsLayer(GraphicsLayer graphicsLayer);

    void setLayoutDirection(LayoutDirection layoutDirection);

    /* renamed from: setSize-uvyYCjk */
    void mo8759setSizeuvyYCjk(long j2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawContext$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static GraphicsLayer $default$getGraphicsLayer(DrawContext drawContext) {
            return null;
        }

        public static void $default$setCanvas(DrawContext drawContext, Canvas canvas) {
        }

        public static void $default$setDensity(DrawContext drawContext, Density density) {
        }

        public static void $default$setGraphicsLayer(DrawContext drawContext, GraphicsLayer graphicsLayer) {
        }

        public static void $default$setLayoutDirection(DrawContext drawContext, LayoutDirection layoutDirection) {
        }
    }
}
