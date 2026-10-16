package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    public static final int $stable = 0;
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return this.this$0.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return this.this$0.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo8758getSizeNHjbRc() {
            return this.this$0.getDrawParams().m8756getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            this.this$0.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            this.this$0.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.this$0.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo8759setSizeuvyYCjk(long j2) {
            this.this$0.getDrawParams().m8757setSizeuvyYCjk(j2);
        }
    };

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m8721configurePaint2qPWKa0(long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        long jM8729modulate5vOe2sY = m8729modulate5vOe2sY(j2, f2);
        if (!Color.m8229equalsimpl0(paintSelectPaint.mo8098getColor0d7_KjU(), jM8729modulate5vOe2sY)) {
            paintSelectPaint.mo8104setColor8_81llA(jM8729modulate5vOe2sY);
        }
        if (paintSelectPaint.getShader() != null) {
            paintSelectPaint.setShader(null);
        }
        if (!x.n(paintSelectPaint.getColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m8137equalsimpl0(paintSelectPaint.mo8097getBlendMode0nO6VwU(), i2)) {
            paintSelectPaint.mo8103setBlendModes9anfk8(i2);
        }
        if (!FilterQuality.m8323equalsimpl0(paintSelectPaint.mo8099getFilterQualityfv9h1I(), i3)) {
            paintSelectPaint.mo8105setFilterQualityvDHp3xo(i3);
        }
        return paintSelectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ Paint m8722configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        return canvasDrawScope.m8721configurePaint2qPWKa0(j2, drawStyle, f2, colorFilter, i2, (i4 & 32) != 0 ? DrawScope.Companion.m8841getDefaultFilterQualityfv9h1I() : i3);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m8723configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo8173applyToPq9zytI(mo8751getSizeNHjbRc(), paintSelectPaint, f2);
        } else {
            if (paintSelectPaint.getShader() != null) {
                paintSelectPaint.setShader(null);
            }
            if (!Color.m8229equalsimpl0(paintSelectPaint.mo8098getColor0d7_KjU(), Color.Companion.m8254getBlack0d7_KjU())) {
                paintSelectPaint.mo8104setColor8_81llA(Color.Companion.m8254getBlack0d7_KjU());
            }
            if (paintSelectPaint.getAlpha() != f2) {
                paintSelectPaint.setAlpha(f2);
            }
        }
        if (!x.n(paintSelectPaint.getColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m8137equalsimpl0(paintSelectPaint.mo8097getBlendMode0nO6VwU(), i2)) {
            paintSelectPaint.mo8103setBlendModes9anfk8(i2);
        }
        if (!FilterQuality.m8323equalsimpl0(paintSelectPaint.mo8099getFilterQualityfv9h1I(), i3)) {
            paintSelectPaint.mo8105setFilterQualityvDHp3xo(i3);
        }
        return paintSelectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ Paint m8724configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = DrawScope.Companion.m8841getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m8723configurePaintswdJneE(brush, drawStyle, f2, colorFilter, i2, i3);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m8725configureStrokePaintQ_0CZUI(long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM8729modulate5vOe2sY = m8729modulate5vOe2sY(j2, f4);
        if (!Color.m8229equalsimpl0(paintObtainStrokePaint.mo8098getColor0d7_KjU(), jM8729modulate5vOe2sY)) {
            paintObtainStrokePaint.mo8104setColor8_81llA(jM8729modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        if (!x.n(paintObtainStrokePaint.getColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m8137equalsimpl0(paintObtainStrokePaint.mo8097getBlendMode0nO6VwU(), i4)) {
            paintObtainStrokePaint.mo8103setBlendModes9anfk8(i4);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f2) {
            paintObtainStrokePaint.setStrokeWidth(f2);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f3) {
            paintObtainStrokePaint.setStrokeMiterLimit(f3);
        }
        if (!StrokeCap.m8628equalsimpl0(paintObtainStrokePaint.mo8100getStrokeCapKaPHkGw(), i2)) {
            paintObtainStrokePaint.mo8106setStrokeCapBeK7IIE(i2);
        }
        if (!StrokeJoin.m8638equalsimpl0(paintObtainStrokePaint.mo8101getStrokeJoinLxFBmk8(), i3)) {
            paintObtainStrokePaint.mo8107setStrokeJoinWw9F2mQ(i3);
        }
        if (!x.n(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m8323equalsimpl0(paintObtainStrokePaint.mo8099getFilterQualityfv9h1I(), i5)) {
            paintObtainStrokePaint.mo8105setFilterQualityvDHp3xo(i5);
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ Paint m8726configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        return canvasDrawScope.m8725configureStrokePaintQ_0CZUI(j2, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, (i6 & 512) != 0 ? DrawScope.Companion.m8841getDefaultFilterQualityfv9h1I() : i5);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m8727configureStrokePaintho4zsrM(Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo8173applyToPq9zytI(mo8751getSizeNHjbRc(), paintObtainStrokePaint, f4);
        } else if (paintObtainStrokePaint.getAlpha() != f4) {
            paintObtainStrokePaint.setAlpha(f4);
        }
        if (!x.n(paintObtainStrokePaint.getColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m8137equalsimpl0(paintObtainStrokePaint.mo8097getBlendMode0nO6VwU(), i4)) {
            paintObtainStrokePaint.mo8103setBlendModes9anfk8(i4);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f2) {
            paintObtainStrokePaint.setStrokeWidth(f2);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f3) {
            paintObtainStrokePaint.setStrokeMiterLimit(f3);
        }
        if (!StrokeCap.m8628equalsimpl0(paintObtainStrokePaint.mo8100getStrokeCapKaPHkGw(), i2)) {
            paintObtainStrokePaint.mo8106setStrokeCapBeK7IIE(i2);
        }
        if (!StrokeJoin.m8638equalsimpl0(paintObtainStrokePaint.mo8101getStrokeJoinLxFBmk8(), i3)) {
            paintObtainStrokePaint.mo8107setStrokeJoinWw9F2mQ(i3);
        }
        if (!x.n(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m8323equalsimpl0(paintObtainStrokePaint.mo8099getFilterQualityfv9h1I(), i5)) {
            paintObtainStrokePaint.mo8105setFilterQualityvDHp3xo(i5);
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ Paint m8728configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        return canvasDrawScope.m8727configureStrokePaintho4zsrM(brush, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, (i6 & 512) != 0 ? DrawScope.Companion.m8841getDefaultFilterQualityfv9h1I() : i5);
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m8729modulate5vOe2sY(long j2, float f2) {
        return f2 == 1.0f ? j2 : Color.m8227copywmQWz5c$default(j2, Color.m8230getAlphaimpl(j2) * f2, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo8108setStylek9PVt8s(PaintingStyle.Companion.m8538getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo8108setStylek9PVt8s(PaintingStyle.Companion.m8539getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (x.n(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new i();
        }
        Paint paintObtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m8628equalsimpl0(paintObtainStrokePaint.mo8100getStrokeCapKaPHkGw(), stroke.m8908getCapKaPHkGw())) {
            paintObtainStrokePaint.mo8106setStrokeCapBeK7IIE(stroke.m8908getCapKaPHkGw());
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m8638equalsimpl0(paintObtainStrokePaint.mo8101getStrokeJoinLxFBmk8(), stroke.m8909getJoinLxFBmk8())) {
            paintObtainStrokePaint.mo8107setStrokeJoinWw9F2mQ(stroke.m8909getJoinLxFBmk8());
        }
        if (!x.n(paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m8730drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, l<? super DrawScope, ab> lVar) {
        DrawParams drawParams = getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM8754component4NHjbRc = drawParams.m8754component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m8757setSizeuvyYCjk(j2);
        canvas.save();
        lVar.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m8757setSizeuvyYCjk(jM8754component4NHjbRc);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo8731drawArcillE91I(Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j2 >> 32);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), f2, f3, z, m8724configurePaintswdJneE$default(this, brush, drawStyle, f4, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo8732drawArcyD3GUKo(long j2, float f2, float f3, boolean z, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j3 >> 32);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), f2, f3, z, m8722configurePaint2qPWKa0$default(this, j2, drawStyle, f4, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo8733drawCircleV9BoPsw(Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo8078drawCircle9KIMszo(j2, f2, m8724configurePaintswdJneE$default(this, brush, drawStyle, f3, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo8734drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo8078drawCircle9KIMszo(j3, f2, m8722configurePaint2qPWKa0$default(this, j2, drawStyle, f3, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo8735drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo8080drawImageRectHPBpro0(imageBitmap, j2, j3, j4, j5, m8724configurePaintswdJneE$default(this, null, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo8736drawImageAZ2fEMs(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.drawParams.getCanvas().mo8080drawImageRectHPBpro0(imageBitmap, j2, j3, j4, j5, m8723configurePaintswdJneE(null, drawStyle, f2, colorFilter, i2, i3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo8737drawImagegbVJVH8(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo8079drawImaged4ec7I(imageBitmap, j2, m8724configurePaintswdJneE$default(this, null, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo8738drawLine1RTmtNc(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo8081drawLineWko1d7g(j2, j3, m8728configureStrokePaintho4zsrM$default(this, brush, f2, 4.0f, i2, StrokeJoin.Companion.m8643getMiterLxFBmk8(), pathEffect, f3, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo8739drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo8081drawLineWko1d7g(j3, j4, m8726configureStrokePaintQ_0CZUI$default(this, j2, f2, 4.0f, i2, StrokeJoin.Companion.m8643getMiterLxFBmk8(), pathEffect, f3, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo8740drawOvalAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j2 >> 32);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), m8724configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo8741drawOvalnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j3 >> 32);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), m8722configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo8742drawPathGBMwjPU(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawPath(path, m8724configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo8743drawPathLG529CI(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawPath(path, m8722configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo8744drawPointsF8ZwMP8(List<Offset> list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.drawParams.getCanvas().mo8082drawPointsO7TthRY(i2, list, m8726configureStrokePaintQ_0CZUI$default(this, j2, f2, 4.0f, i3, StrokeJoin.Companion.m8643getMiterLxFBmk8(), pathEffect, f3, colorFilter, i4, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo8745drawPointsGsft0Ws(List<Offset> list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.drawParams.getCanvas().mo8082drawPointsO7TthRY(i2, list, m8728configureStrokePaintho4zsrM$default(this, brush, f2, 4.0f, i3, StrokeJoin.Companion.m8643getMiterLxFBmk8(), pathEffect, f3, colorFilter, i4, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo8746drawRectAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j2 >> 32);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), m8724configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo8747drawRectnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j3 >> 32);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), m8722configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo8748drawRoundRectZuiqVtQ(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j2 >> 32);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), m8724configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo8749drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j3 >> 32);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), m8722configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public /* synthetic */ long mo8750getCenterF1C5BW0() {
        return DrawScope.CC.m8800$default$getCenterF1C5BW0(this);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public /* synthetic */ long mo8751getSizeNHjbRc() {
        return DrawScope.CC.m8801$default$getSizeNHjbRc(this);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4, reason: not valid java name */
    public /* synthetic */ void mo8752recordJVtK1S4(GraphicsLayer graphicsLayer, long j2, l lVar) {
        DrawScope.CC.m8802$default$recordJVtK1S4(this, graphicsLayer, j2, lVar);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
        return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
        return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
        return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
        return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
        return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
        return Density.CC.m11133$default$toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo2127toPx0680j_4(float f2) {
        return Density.CC.m11134$default$toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
        return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
        return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
        return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
        return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
        return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* compiled from: WazeSource */
    public final class DrawParams {
        public static final int $stable = 8;
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, EmptyCanvas emptyCanvas, long j2, int i2, o oVar) {
            this((i2 & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i2 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i2 & 4) != 0 ? EmptyCanvas.INSTANCE : emptyCanvas, (i2 & 8) != 0 ? Size.Companion.m8058getZeroNHjbRc() : j2, null);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m8753copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i2 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i2 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i2 & 8) != 0) {
                j2 = drawParams.size;
            }
            Canvas canvas2 = canvas;
            return drawParams.m8755copyUg5Nnss(density, layoutDirection, canvas2, j2);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m8754component4NHjbRc() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m8755copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2) {
            return new DrawParams(density, layoutDirection, canvas, j2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return x.n(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && x.n(this.canvas, drawParams.canvas) && Size.m8045equalsimpl0(this.size, drawParams.size);
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m8756getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m8050hashCodeimpl(this.size);
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m8757setSizeuvyYCjk(long j2) {
            this.size = j2;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m8053toStringimpl(this.size)) + ')';
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, o oVar) {
            this(density, layoutDirection, canvas, j2);
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j2;
        }
    }
}
