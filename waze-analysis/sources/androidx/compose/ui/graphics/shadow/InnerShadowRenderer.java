package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
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
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InnerShadowRenderer extends ShadowRenderer {
    public static final int $stable = 8;
    private CompositeShaderBrush compositeShader;
    private float[] matrix;
    private final Paint paint;
    private final Shadow shadow;
    private ShaderBrush shadowMask;

    public InnerShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    /* renamed from: createInnerPathShadowBrush-LjSzlW0, reason: not valid java name */
    private final ShaderBrush m8979createInnerPathShadowBrushLjSzlW0(long j2, Path path, float f2, float f3, float f4, float f5) {
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default;
        float fCeil = (float) Math.ceil(Float.intBitsToFloat((int) (j2 >> 32)));
        float fCeil2 = (float) Math.ceil(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        if (f3 > 0.0f) {
            Rect bounds = path.getBounds();
            float right = bounds.getRight() - bounds.getLeft();
            float bottom = bounds.getBottom() - bounds.getTop();
            imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default((int) Math.ceil(right), (int) Math.ceil(bottom), ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ(), false, null, 24, null);
            Canvas Canvas = CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
            Canvas.drawPath(path, this.paint);
            Canvas.CC.m8201clipRectN_I0leg$default(Canvas, 0.0f, 0.0f, right, bottom, 0, 16, null);
            Paint paint = this.paint;
            BlurKt.m8974configureShadowFoewPVk$default(paint, 0L, BlendMode.Companion.m8141getClear0nO6VwU(), null, PaintingStyle.Companion.m8539getStrokeTiuSbCo(), 5, null);
            paint.setStrokeWidth(f3 + f3);
            Canvas.drawPath(path, paint);
        } else {
            imageBitmapM8478ImageBitmapx__hDU$default = null;
        }
        int iCeil = (int) Math.ceil(f2);
        int i2 = iCeil + iCeil;
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default2 = ImageBitmapKt.m8478ImageBitmapx__hDU$default(((int) fCeil) + i2, ((int) fCeil2) + i2, ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas2 = CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default2);
        if (imageBitmapM8478ImageBitmapx__hDU$default != null) {
            float width = imageBitmapM8478ImageBitmapx__hDU$default2.getWidth();
            float height = imageBitmapM8478ImageBitmapx__hDU$default2.getHeight();
            Paint paint2 = this.paint;
            BlurKt.m8974configureShadowFoewPVk$default(paint2, 0L, 0, null, 0, 15, null);
            Canvas2.drawRect(0.0f, 0.0f, width, height, paint2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(f4) << 32;
            long jFloatToRawIntBits2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(f5);
            Paint paint3 = this.paint;
            BlurKt.m8974configureShadowFoewPVk$default(paint3, 0L, BlendMode.Companion.m8169getXor0nO6VwU(), f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null, 0, 9, null);
            Canvas2.mo8079drawImaged4ec7I(imageBitmapM8478ImageBitmapx__hDU$default, jFloatToRawIntBits2 | jFloatToRawIntBits, paint3);
            return BrushKt.ShaderBrush(ShaderKt.m8591ImageShaderF49vj9s$default(imageBitmapM8478ImageBitmapx__hDU$default2, 0, 0, 6, null));
        }
        Canvas2.save();
        Canvas2.translate(f4, f5);
        Paint paint4 = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint4, 0L, 0, f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null, 0, 11, null);
        Canvas2.drawPath(path, paint4);
        Canvas2.restore();
        float width2 = imageBitmapM8478ImageBitmapx__hDU$default2.getWidth();
        float height2 = imageBitmapM8478ImageBitmapx__hDU$default2.getHeight();
        Paint paint5 = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint5, 0L, BlendMode.Companion.m8169getXor0nO6VwU(), null, 0, 13, null);
        Canvas2.drawRect(0.0f, 0.0f, width2, height2, paint5);
        return BrushKt.ShaderBrush(ShaderKt.m8591ImageShaderF49vj9s$default(imageBitmapM8478ImageBitmapx__hDU$default2, 0, 0, 6, null));
    }

    /* renamed from: createInnerShadowBrush-u1Psq-8, reason: not valid java name */
    private final ShaderBrush m8980createInnerShadowBrushu1Psq8(long j2, float f2, float f3, float f4, float f5, long j3) {
        float fCeil = (float) Math.ceil(Float.intBitsToFloat(r2));
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default((int) fCeil, (int) Math.ceil(Float.intBitsToFloat(i2)), ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
        float f6 = f4 + f3;
        float fMax = Math.max(f6, (f4 + Float.intBitsToFloat((int) (j2 >> 32))) - f3);
        float fIntBitsToFloat = f5 + Float.intBitsToFloat(i2);
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float f7 = f5 + f3;
        float fMax2 = Math.max(f7, fIntBitsToFloat - f3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        BlurMaskFilter blurMaskFilterBlurFilter = f2 > 0.0f ? Blur_androidKt.BlurFilter(f2) : null;
        Paint paint = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint, 0L, 0, blurMaskFilterBlurFilter, 0, 11, null);
        Canvas.drawRoundRect(f6, f7, fMax, fMax2, fIntBitsToFloat2, fIntBitsToFloat3, paint);
        float width = imageBitmapM8478ImageBitmapx__hDU$default.getWidth();
        float height = imageBitmapM8478ImageBitmapx__hDU$default.getHeight();
        Paint paint2 = this.paint;
        BlurKt.m8974configureShadowFoewPVk$default(paint2, 0L, BlendMode.Companion.m8169getXor0nO6VwU(), null, 0, 13, null);
        Canvas.drawRect(0.0f, 0.0f, width, height, paint2);
        return BrushKt.ShaderBrush(ShaderKt.m8591ImageShaderF49vj9s$default(imageBitmapM8478ImageBitmapx__hDU$default, 0, 0, 6, null));
    }

    private final CompositeShaderBrush obtainCompositeBrush(ShaderBrush shaderBrush, Brush brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && x.n(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        CompositeShaderBrush compositeShaderBrush2 = new CompositeShaderBrush(BrushKt.toShaderBrush(shaderBrush), BrushKt.toShaderBrush(brush), BlendMode.Companion.m8166getSrcIn0nO6VwU(), null);
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    /* renamed from: obtainMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m8981obtainMatrixsQKQjiQ() {
        float[] fArr = this.matrix;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
        this.matrix = fArrM8492constructorimpl$default;
        return fArrM8492constructorimpl$default;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: buildShadow-_SMYjrA */
    protected void mo8977buildShadow_SMYjrA(DrawScope drawScope, long j2, long j3, Path path) {
        float f2 = drawScope.mo2127toPx0680j_4(this.shadow.m8985getRadiusD9Ej5fM());
        float f3 = drawScope.mo2127toPx0680j_4(this.shadow.m8986getSpreadD9Ej5fM());
        float f4 = drawScope.mo2127toPx0680j_4(DpOffset.m11225getXD9Ej5fM(this.shadow.m8984getOffsetRKDOV3M()));
        float f5 = drawScope.mo2127toPx0680j_4(DpOffset.m11227getYD9Ej5fM(this.shadow.m8984getOffsetRKDOV3M()));
        this.shadowMask = path != null ? m8979createInnerPathShadowBrushLjSzlW0(j2, path, f2, f3, f4, f5) : m8980createInnerShadowBrushu1Psq8(j2, f2, f3, f4, f5, j3);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: onDrawShadow-MLmccfk */
    protected void mo8978onDrawShadowMLmccfk(DrawScope drawScope, long j2, long j3, Path path, float f2, ColorFilter colorFilter, Brush brush, int i2) {
        CompositeShaderBrush compositeShaderBrushObtainCompositeBrush = this.shadowMask;
        if (compositeShaderBrushObtainCompositeBrush != null) {
            if (this.shadow.getBrush() instanceof ShaderBrush) {
                compositeShaderBrushObtainCompositeBrush = obtainCompositeBrush(compositeShaderBrushObtainCompositeBrush, this.shadow.getBrush());
            }
            if (path != null) {
                DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, path, compositeShaderBrushObtainCompositeBrush, f2, null, colorFilter, i2, 8, null);
            } else if (CornerRadius.m7939equalsimpl0(j3, CornerRadius.Companion.m7952getZerokKHJgLs())) {
                DrawScope.CC.m8835drawRectAsUm42w$default(drawScope, compositeShaderBrushObtainCompositeBrush, 0L, 0L, f2, null, colorFilter, i2, 22, null);
            } else {
                DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, compositeShaderBrushObtainCompositeBrush, 0L, 0L, j3, f2, null, colorFilter, this.shadow.m8982getBlendMode0nO6VwU(), 38, null);
            }
        }
    }
}
