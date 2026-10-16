package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private Color lastColor;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i2, float f2) {
        super(i2);
        this.density = f2;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m10844setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j2, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        }
        androidTextPaint.m10848setBrush12SF9DM(brush, j2, f2);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m10845getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    public final Brush getBrush$ui_text() {
        return this.brush;
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text, reason: not valid java name */
    public final Size m10846getBrushSizeVsRJwc0$ui_text() {
        return this.brushSize;
    }

    public final State<Shader> getShaderState$ui_text() {
        return this.shaderState;
    }

    public final Shadow getShadow$ui_text() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m10847setBlendModes9anfk8(int i2) {
        if (BlendMode.m8137equalsimpl0(i2, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo8103setBlendModes9anfk8(i2);
        this.backingBlendMode = i2;
    }

    public final void setBrush$ui_text(Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    public final void m10848setBrush12SF9DM(final Brush brush, final long j2, float f2) {
        Size size;
        if (brush == null) {
            clearShader();
            return;
        }
        if (brush instanceof SolidColor) {
            m10850setColor8_81llA(TextDrawStyleKt.m11037modulateDxMtmZc(((SolidColor) brush).m8614getValue0d7_KjU(), f2));
            return;
        }
        if (!(brush instanceof ShaderBrush)) {
            throw new i();
        }
        if ((!x.n(this.brush, brush) || (size = this.brushSize) == null || !Size.m8045equalsimpl0(size.m8054unboximpl(), j2)) && j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.brush = brush;
            this.brushSize = Size.m8037boximpl(j2);
            this.shaderState = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.ui.text.platform.AndroidTextPaint$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return ((ShaderBrush) brush).mo8197createShaderuvyYCjk(j2);
                }
            });
        }
        Paint composePaint = getComposePaint();
        State<? extends Shader> state = this.shaderState;
        composePaint.setShader(state != null ? state.getValue() : null);
        this.lastColor = null;
        AndroidTextPaint_androidKt.setAlpha(this, f2);
    }

    /* renamed from: setBrushSize-iaC8Vc4$ui_text, reason: not valid java name */
    public final void m10849setBrushSizeiaC8Vc4$ui_text(Size size) {
        this.brushSize = size;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m10850setColor8_81llA(long j2) {
        Color color = this.lastColor;
        if ((color != null && Color.m8229equalsimpl0(color.m8238unboximpl(), j2)) || j2 == 16) {
            return;
        }
        this.lastColor = Color.m8218boximpl(j2);
        setColor(ColorKt.m8282toArgb8_81llA(j2));
        clearShader();
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || x.n(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (x.n(drawStyle, Fill.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new i();
        }
        getComposePaint().mo8108setStylek9PVt8s(PaintingStyle.Companion.m8539getStrokeTiuSbCo());
        Stroke stroke = (Stroke) drawStyle;
        getComposePaint().setStrokeWidth(stroke.getWidth());
        getComposePaint().setStrokeMiterLimit(stroke.getMiter());
        getComposePaint().mo8107setStrokeJoinWw9F2mQ(stroke.m8909getJoinLxFBmk8());
        getComposePaint().mo8106setStrokeCapBeK7IIE(stroke.m8908getCapKaPHkGw());
        getComposePaint().setPathEffect(stroke.getPathEffect());
    }

    public final void setShaderState$ui_text(State<? extends Shader> state) {
        this.shaderState = state;
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || x.n(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (x.n(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.m8603getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (this.shadow.m8603getOffsetF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), ColorKt.m8282toArgb8_81llA(this.shadow.m8602getColor0d7_KjU()));
        }
    }

    public final void setShadow$ui_text(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || x.n(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        setUnderlineText(textDecoration.contains(TextDecoration.Companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(TextDecoration.Companion.getLineThrough()));
    }

    public static /* synthetic */ void getBrush$ui_text$annotations() {
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text$annotations, reason: not valid java name */
    public static /* synthetic */ void m10843getBrushSizeVsRJwc0$ui_text$annotations() {
    }

    public static /* synthetic */ void getShadow$ui_text$annotations() {
    }
}
