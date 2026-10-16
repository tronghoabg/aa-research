package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.muxer.MuxerUtil;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void drawLayer(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(GraphicsLayer graphicsLayer, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top = rectangle.getRect().getTop();
            long jFloatToRawIntBits = Float.floatToRawIntBits(left);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            Rect rect = rectangle.getRect();
            float right = rect.getRight() - rect.getLeft();
            Rect rect2 = rectangle.getRect();
            float bottom = rect2.getBottom() - rect2.getTop();
            graphicsLayer.m8938setRectOutlinetz77jQw((jFloatToRawIntBits << 32) | jFloatToRawIntBits2, (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32));
            return;
        }
        if (outline instanceof Outline.Generic) {
            graphicsLayer.setPathOutline(((Outline.Generic) outline).getPath());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            throw new i();
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (rounded.getRoundRectPath$ui_graphics() != null) {
            graphicsLayer.setPathOutline(rounded.getRoundRectPath$ui_graphics());
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float left2 = roundRect.getLeft();
        float top2 = roundRect.getTop();
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(left2);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(top2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        graphicsLayer.m8939setRoundRectOutlineTNW_H78((jFloatToRawIntBits3 << 32) | jFloatToRawIntBits4, (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(height)) | (Float.floatToRawIntBits(width) << 32), Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)));
    }
}
