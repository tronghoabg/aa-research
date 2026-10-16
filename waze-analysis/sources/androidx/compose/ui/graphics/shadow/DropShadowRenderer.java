package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositeShaderBrush;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DropShadowRenderer extends ShadowRenderer {
    public static final int $stable = 8;
    private CompositeShaderBrush compositeShader;
    private final Paint paint;
    private final Shadow shadow;
    private ImageBitmap shadowBitmap;

    public DropShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    /* renamed from: createOuterShadowBitmap-Cqks5Fs, reason: not valid java name */
    private final ImageBitmap m8975createOuterShadowBitmapCqks5Fs(long j2, Path path, float f2, float f3) {
        float f4 = f3 + f3;
        float f5 = f2 + f2 + f4;
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat((int) (j2 >> 32)) + f5), (int) Math.ceil(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + f5), ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
        if (f3 <= 0.0f) {
            BlurKt.m8974configureShadowFoewPVk$default(this.paint, 0L, 0, f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null, 0, 11, null);
            Canvas.translate(f2, f2);
            Canvas.drawPath(path, this.paint);
            return imageBitmapM8478ImageBitmapx__hDU$default;
        }
        float f6 = f2 + f3;
        Canvas.translate(f6, f6);
        Paint paint = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint, 0L, 0, f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null, 0, 11, null);
        Canvas.drawPath(path, paint);
        Paint paint2 = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint2, 0L, 0, f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null, PaintingStyle.Companion.m8539getStrokeTiuSbCo(), 3, null);
        paint2.setStrokeWidth(f4);
        Canvas.drawPath(path, paint2);
        return imageBitmapM8478ImageBitmapx__hDU$default;
    }

    /* renamed from: createOuterShadowBitmap-D_oqF2M, reason: not valid java name */
    private final ImageBitmap m8976createOuterShadowBitmapD_oqF2M(long j2, float f2, float f3, long j3) {
        float f4 = f2 + f2 + f3 + f3;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + f4;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + f4;
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
        int i2 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        BlurMaskFilter blurMaskFilterBlurFilter = f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null;
        Paint paint = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint, 0L, 0, blurMaskFilterBlurFilter, 0, 11, null);
        Canvas.drawRoundRect(f2, f2, fIntBitsToFloat - f2, fIntBitsToFloat2 - f2, fIntBitsToFloat3, fIntBitsToFloat4, paint);
        return imageBitmapM8478ImageBitmapx__hDU$default;
    }

    private final Brush obtainCompositeBrush(ImageBitmap imageBitmap, Brush brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush == null || !x.n(compositeShaderBrush.getSrcBrush(), brush)) {
            Brush.Companion companion = Brush.Companion;
            ShaderBrush ShaderBrush = BrushKt.ShaderBrush(ShaderKt.m8591ImageShaderF49vj9s$default(imageBitmap, 0, 0, 6, null));
            if (brush instanceof ShaderBrush) {
                float width = imageBitmap.getWidth();
                float height = imageBitmap.getHeight();
                brush = BrushKt.ShaderBrush(((ShaderBrush) brush).mo8197createShaderuvyYCjk((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            }
            compositeShaderBrush = (CompositeShaderBrush) companion.m8185composite7EN7VTw(ShaderBrush, brush, BlendMode.Companion.m8166getSrcIn0nO6VwU());
            this.compositeShader = compositeShaderBrush;
        }
        return compositeShaderBrush;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: buildShadow-_SMYjrA, reason: not valid java name */
    protected void mo8977buildShadow_SMYjrA(DrawScope drawScope, long j2, long j3, Path path) {
        DropShadowRenderer dropShadowRenderer;
        ImageBitmap imageBitmapM8976createOuterShadowBitmapD_oqF2M;
        float f2 = drawScope.mo2127toPx0680j_4(this.shadow.m8985getRadiusD9Ej5fM());
        float f3 = drawScope.mo2127toPx0680j_4(this.shadow.m8986getSpreadD9Ej5fM());
        if (path != null) {
            dropShadowRenderer = this;
            imageBitmapM8976createOuterShadowBitmapD_oqF2M = dropShadowRenderer.m8975createOuterShadowBitmapCqks5Fs(j2, path, f2, f3);
        } else {
            dropShadowRenderer = this;
            imageBitmapM8976createOuterShadowBitmapD_oqF2M = m8976createOuterShadowBitmapD_oqF2M(j2, f2, f3, j3);
        }
        dropShadowRenderer.shadowBitmap = imageBitmapM8976createOuterShadowBitmapD_oqF2M;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: onDrawShadow-MLmccfk, reason: not valid java name */
    protected void mo8978onDrawShadowMLmccfk(DrawScope drawScope, long j2, long j3, Path path, float f2, ColorFilter colorFilter, Brush brush, int i2) {
        ImageBitmap imageBitmap = this.shadowBitmap;
        if (imageBitmap != null) {
            float f3 = -(drawScope.mo2127toPx0680j_4(this.shadow.m8985getRadiusD9Ej5fM()) + drawScope.mo2127toPx0680j_4(this.shadow.m8986getSpreadD9Ej5fM()));
            if (brush == null || colorFilter != null) {
                DrawScope.CC.m8826drawImagegbVJVH8$default(drawScope, imageBitmap, (Float.floatToRawIntBits(f3) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(f3)), f2, null, colorFilter, i2, 8, null);
                return;
            }
            float f4 = -f3;
            Brush brushObtainCompositeBrush = obtainCompositeBrush(imageBitmap, brush);
            drawScope.getDrawContext().getTransform().translate(f3, f3);
            try {
                float width = imageBitmap.getWidth();
                float height = imageBitmap.getHeight();
                DrawScope.CC.m8835drawRectAsUm42w$default(drawScope, brushObtainCompositeBrush, 0L, (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f2, null, null, i2, 50, null);
            } finally {
                drawScope.getDrawContext().getTransform().translate(f4, f4);
            }
        }
    }
}
